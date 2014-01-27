package com.lolcode.jgenerator;

import com.lolcode.tree.*;
import com.lolcode.tree.exception.BaseAstException;

public class CodeGenerator implements BaseASTVisitor {
    //CONST
    private static final String RUNTIME_PACKAGE = "com/lolcode/runtime";

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
        public static final String LOLSTRING = "L"+Class.LOLSTRING;
    }

    @Override
    public Object visit(TreeFunction func) throws BaseAstException {
        return null;
    }

    @Override
    public Object visit(TreeModule module) throws BaseAstException {
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
