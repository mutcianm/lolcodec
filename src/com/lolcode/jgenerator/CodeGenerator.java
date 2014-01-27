package com.lolcode.jgenerator;

import com.lolcode.tree.*;
import com.lolcode.tree.exception.BaseAstException;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

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

    private String fileName;
    private MethodVisitor mv;
    private ClassWriter cw;


    //CONSTRUCTOR
    public CodeGenerator(String fileName) {
        this.fileName = fileName;
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
        StringBuilder signatureBuilder = new StringBuilder("(");
        for (TreeFunctionParameter param : func.getParams()) {
            //signature.append(param.getType())
            signatureBuilder.append(Type.LOLOBJECT);
        }
        signatureBuilder.append(")"+Type.LOLOBJECT);
        String signature = signatureBuilder.toString();


        return null;
    }

    @Override
    public Object visit(TreeModule module) throws BaseAstException {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(Opcodes.V1_6,Opcodes.ACC_PUBLIC,fileName,null,"java/lang/Object",null);

        //STDLIB FIELD
        cw.visitField(Opcodes.ACC_PUBLIC,"STDLIB",Type.LOLSTDLIB,null,null);
        //where init??


        //Constructor?
        MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC,"<init>","()V",null, null);
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitTypeInsn(Opcodes.NEW,Type.LOLSTDLIB);
        mv.visitInsn(Opcodes.DUP);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, Type.LOLSTDLIB, "<init>", "()V");
        mv.visitFieldInsn(Opcodes.PUTFIELD, "com/lolcode/Generated", "STDLIB", Type.LOLSTDLIB);
        mv.visitMaxs(1, 1);
        mv.visitEnd();

        //visit functions?
        for (TreeFunction func : module.getFunctions()) {
            visit(func);
        }

        //go through main?
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,"main","([Ljava/lang/String;)V",null, null);

        String fileName = new File(module.getModuleName()).getName();
        writeFile(cw, fileName.substring(0,fileName.lastIndexOf('.')));
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
        return null;
    }

    @Override
    public Object visit(TreeGimmehStmt gimmehStmt) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeFuncCallExpr funcCallStmt) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeDummyStmt dummyStmt) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeBreakStmt breakStmt) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeReturnStmt returnStmt) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeVariable variable) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeConstant constant) throws BaseAstException {
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
