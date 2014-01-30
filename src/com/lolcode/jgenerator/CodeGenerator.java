package com.lolcode.jgenerator;

import com.lolcode.tree.*;
import com.lolcode.tree.exception.BaseAstException;
import com.sun.org.apache.xpath.internal.compiler.OpCodes;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.util.CheckClassAdapter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class CodeGenerator implements BaseASTVisitor {
    //CONST
    private static final String RUNTIME_PACKAGE = "com/lolcode/runtime/";

    private class Class {
        public static final String LOLARRAY = RUNTIME_PACKAGE + "LolArray";
        public static final String LOLBOOL = RUNTIME_PACKAGE + "LolBool";
        public static final String LOLDOUBLE = RUNTIME_PACKAGE + "LolDouble";
        public static final String LOLINT = RUNTIME_PACKAGE + "LolInt";
        public static final String LOLOBJECT = RUNTIME_PACKAGE + "LolObject";
        public static final String LOLRTBADCOMPAREEXCEPTION = RUNTIME_PACKAGE + "LolRtBadCompareException";
        public static final String LOLRTBINOPWRONGCODE = RUNTIME_PACKAGE + "LolRtBinOpWrongTypeException";
        public static final String LOLRTNOSUCHKEYEXCEPTION = RUNTIME_PACKAGE + "LolRtNoSuchKeyException";
        public static final String LOLRTUNDEFINEDTYPEEXCEPTION = RUNTIME_PACKAGE + "LolRtUndefinedTypeException";
        public static final String LOLRTUNSUPPORTEDOPEXCEPTION = RUNTIME_PACKAGE + "LolRtUnsupportedOpException";
        public static final String LOLRUNTIMEEXCEPTION = RUNTIME_PACKAGE + "LolRuntimeException";
        public static final String LOLSTDLIB = RUNTIME_PACKAGE + "LolStdLib";
        public static final String LOLSTRING = RUNTIME_PACKAGE + "LolString";
        public static final String LOLTYPE = RUNTIME_PACKAGE + "LolType";
    }

    private class Type {
        public static final String LOLARRAY = "L"+Class.LOLARRAY+";";
        public static final String LOLBOOL = "L"+Class.LOLBOOL+";";
        public static final String LOLDOUBLE = "L"+Class.LOLDOUBLE+";";
        public static final String LOLINT = "L"+Class.LOLINT+";";
        public static final String LOLOBJECT = "L"+Class.LOLOBJECT+";";
        public static final String LOLSTRING = "L"+Class.LOLSTRING+";";
        public static final String LOLSTDLIB = "L"+Class.LOLSTDLIB+";";
    }

    //FIELDS

    private MethodVisitor mv;
    private ClassWriter cw;
    private String fileName;

    //CONSTRUCTOR
    public CodeGenerator() {
        super();
    }

    private void writeFile(ClassWriter cw, String className) {
        try {
            byte[] code = cw.toByteArray();
            FileOutputStream fos = new FileOutputStream(className + ".class");
            fos.write(code);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object visit(TreeFunction func) throws BaseAstException {
        //get signature
        StringBuilder signatureBuilder = new StringBuilder("(");
        for (TreeFunctionParameter param : func.getParams()) {
            //signature.append(param.getType())
            signatureBuilder.append(Type.LOLOBJECT);
        }
        signatureBuilder.append(")"+Type.LOLOBJECT);
        String signature = signatureBuilder.toString();

        mv = cw.visitMethod(Opcodes.ACC_PUBLIC,"_lol_"+func.getName(),signature,null,null);
        //parameters are in local?

        //go into body
        for (TreeNode node : func.getBody()){
            node.accept(this);
        }

        mv.visitMaxs(0,0);
        mv.visitEnd();
        return null;
    }

    @Override
    public Object visit(TreeModule module) throws BaseAstException {
        cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
        fileName = new File(module.getModuleName()).getName();
        fileName = fileName.substring(0,fileName.lastIndexOf('.'));
        cw.visit(Opcodes.V1_6,Opcodes.ACC_PUBLIC,"com/lolcode/" + fileName,null,"java/lang/Object",null);

        //STDLIB FIELD
        cw.visitField(Opcodes.ACC_PUBLIC, "STDLIB", Type.LOLSTDLIB, null, null);

        //Constructor, create our object and init STDLIB Field
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC,"<init>","()V",null, null);
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitTypeInsn(Opcodes.NEW, Class.LOLSTDLIB);
        mv.visitInsn(Opcodes.DUP);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, Class.LOLSTDLIB, "<init>", "()V");
        mv.visitFieldInsn(Opcodes.PUTFIELD, "com/lolcode/" + fileName, "STDLIB", Type.LOLSTDLIB);
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        //some testing
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC,"readAndPrint","()V",null,null);
        mv.visitVarInsn(Opcodes.ALOAD,0);
        mv.visitFieldInsn(Opcodes.GETFIELD,"com/lolcode/"+fileName,"STDLIB",Type.LOLSTDLIB);
        mv.visitInsn(Opcodes.DUP);
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL,Class.LOLSTDLIB,"read","()"+Type.LOLOBJECT);
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL,Class.LOLSTDLIB,"print","("+Type.LOLOBJECT+")V");

        //try readline + print
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();



        //visit functions?
        for (TreeFunction func : module.getFunctions()) {
            visit(func);
        }

        //static main -> program entry point
        //mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,"main","([Ljava/lang/String;)V",null, null);
        /*mv.visitFieldInsn(Opcodes.GETSTATIC,
                "java/lang/System",
                "out",
                "Ljava/io/PrintStream;");
        mv.visitLdcInsn("hello");
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL,
                "java/io/PrintStream",
                "println",
                "(Ljava/lang/String;)V");
        */
        /*
        //try printing using STDLIB
        //get new Arrays()
        mv.visitTypeInsn(Opcodes.NEW,"com/lolcode/"+fileName);
        mv.visitInsn(Opcodes.DUP);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "com/lolcode/" + fileName, "<init>", "()V");
        //get Arrays.STDLIB
        mv.visitFieldInsn(Opcodes.GETFIELD,"com/lolcode/"+fileName,"STDLIB",Type.LOLSTDLIB);
        //get new LolString("hell")
        mv.visitTypeInsn(Opcodes.NEW, Class.LOLSTRING);
        mv.visitInsn(Opcodes.DUP);
        mv.visitLdcInsn("hell");
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, Class.LOLSTRING, "<init>", "(Ljava/lang/String;)V");
        //get print()
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL,Class.LOLSTDLIB,"print","("+Type.LOLOBJECT+")V");
        */
        //try readline + print

        //static main -> calls mainbody
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,"main","([Ljava/lang/String;)V",null, null);
        mv.visitTypeInsn(Opcodes.NEW,"com/lolcode/"+fileName);
        mv.visitInsn(Opcodes.DUP);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "com/lolcode/" + fileName, "<init>", "()V");
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL,"com/lolcode/"+fileName,"mainbody","()V");

        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        //create "mainbody"
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC,"mainbody","()V",null,null);
        for (TreeNode node : module.getBody()) {
            node.accept(this);
        }
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(0,0);
        mv.visitEnd();

        cw.visitEnd();

        PrintWriter pw = new PrintWriter(System.out);
        CheckClassAdapter.verify(new ClassReader(cw.toByteArray()), true, pw);
        writeFile(cw, "generated/com/lolcode/" + fileName);
        return null;
    }

    @Override
    public Object visit(TreeFunctionParameter param) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeIfStmt ifStmt) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeLoopStmt loopStmt) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeAssignStmt assignStmt) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeCaseStmt caseStmt) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeVarDeclStmt varDeclStmt) throws BaseAstException {
        
        return null;
    }

    @Override
    public Object visit(TreeArrayDeclStmt arrayDeclStmt) throws BaseAstException {

        return null;
    }

    @Override
    public Object visit(TreeVisibleStmt visibleStmt) throws BaseAstException {
        //put argument on stack

        //call print
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitFieldInsn(Opcodes.GETFIELD, "com/lolcode/" + fileName, "STDLIB", Type.LOLSTDLIB);

        visibleStmt.getArgument().accept(this);

        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL,Class.LOLSTDLIB,"print","("+Type.LOLOBJECT+")V");

        return null;
    }

    @Override
    public Object visit(TreeGimmehStmt gimmehStmt) throws BaseAstException {

        return null;
    }

    @Override
    public Object visit(TreeFuncCallExpr funcCallStmt) throws BaseAstException {
        mv.visitVarInsn(Opcodes.ALOAD,0);
        //put arguments on stack
        for (TreeNode node : funcCallStmt.getArguments()) {
            node.accept(this);
        }
        //get siignature

        StringBuilder signatureBuilder = new StringBuilder("(");
        for (TreeFunctionParameter param : funcCallStmt.getBoundFunction().getParams()) {
            //signature.append(param.getType())
            signatureBuilder.append(Type.LOLOBJECT);
        }
        signatureBuilder.append(")"+Type.LOLOBJECT);
        String signature = signatureBuilder.toString();

        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL,"com/lolcode/"+fileName,"_lol_"+funcCallStmt.getFuncName(),signature);
        return null;
    }

    @Override
    public Object visit(TreeDummyStmt dummyStmt) throws BaseAstException {
        dummyStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Object visit(TreeBreakStmt breakStmt) throws BaseAstException {
        System.out.println("BRK");
        mv.visitInsn(Opcodes.RETURN);
        return null;
    }

    @Override
    public Object visit(TreeReturnStmt returnStmt) throws BaseAstException {
        System.out.println("ReT");
        returnStmt.getRetValue().accept(this);
        mv.visitInsn(Opcodes.ARETURN);
        return null;
    }

    @Override
    public Object visit(TreeVariable variable) throws BaseAstException {
        //put variable on stack
        mv.visitTypeInsn(Opcodes.NEW, Class.LOLOBJECT);
        mv.visitInsn(Opcodes.NEW);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, Class.LOLOBJECT, "<init>", "()"+Class.LOLOBJECT);
        return null;
    }

    @Override
    public Object visit(TreeConstant constant) throws BaseAstException {
        //System.out.println("Constant");
        switch (constant.getType()) {
            case BOOL:
                //put new LOLBOOL on stack
                mv.visitTypeInsn(Opcodes.NEW, Class.LOLBOOL);
                mv.visitInsn(Opcodes.DUP);
                mv.visitLdcInsn((constant.getRealValue().equals("WIN")) ? true : false);
                mv.visitMethodInsn(Opcodes.INVOKESPECIAL, Class.LOLBOOL, "<init>", "(Z)V");
                break;
            case STRING:
                mv.visitTypeInsn(Opcodes.NEW, Class.LOLSTRING);
                mv.visitInsn(Opcodes.DUP);
                mv.visitLdcInsn(constant.getRealValue());
                mv.visitMethodInsn(Opcodes.INVOKESPECIAL, Class.LOLSTRING, "<init>", "(Ljava/lang/String;)V");
                break;
            case INT:
                mv.visitTypeInsn(Opcodes.NEW, Class.LOLINT);
                mv.visitInsn(Opcodes.DUP);
                mv.visitLdcInsn(Integer.parseInt(constant.getRealValue()));
                mv.visitMethodInsn(Opcodes.INVOKESPECIAL, Class.LOLINT, "<init>", "(I)V");
                break;
            case FLOAT:
                mv.visitTypeInsn(Opcodes.NEW, Class.LOLDOUBLE);
                mv.visitInsn(Opcodes.DUP);
                mv.visitLdcInsn(Double.parseDouble(constant.getRealValue()));
                mv.visitMethodInsn(Opcodes.INVOKESPECIAL, Class.LOLDOUBLE, "<init>", "(D)V");
                break;
        }
        return null;
    }

    @Override
    public Object visit(TreeSumExpr sumExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeSubExpr subExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeMulExpr mulExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeDivExpr divExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeModExpr modExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeArrayPutStmt arrayPutExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeArrayGetExpr arrayGetExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeMaxExpr maxExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeMinExpr minExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeAndExpr andExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeOrExpr orExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeXorExpr xorExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeNotExpr notExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeEqualExpr equalExpr) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeNequalExpr nequalExpr) throws BaseAstException {
        return null;
    }
}
