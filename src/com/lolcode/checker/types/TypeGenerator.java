package com.lolcode.checker.types;

import com.lolcode.tree.*;
import com.lolcode.tree.exception.BaseAstException;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/21/13
 * Time: 7:33 PM
 */

/**
 * Attempts to infer types for variables if possible.
 * Is intrusive: overwrites types in AST.
 */
public class TypeGenerator implements BaseASTVisitor<TYPE> {

    TYPE inferBinaryExpr(TreeBinaryExpr expr, String exceptionMessage) throws BaseAstException {
        TYPE lType = expr.getLhs().accept(this);
        TYPE rType = expr.getRhs().accept(this);
        if ((lType == TYPE.UNKNOWN) || (rType == TYPE.UNKNOWN)) {
            return TYPE.UNKNOWN;
        }
        if (lType != rType) {
            throw new CastException("Unexpected types in \"" + exceptionMessage + "\" expression: " + lType + " and " + rType);
        }
        return lType;
    }

    TYPE inferBinaryLogicExpr(TreeBinaryExpr expr, String exceptionMessage) throws BaseAstException {
        TYPE lType = expr.getLhs().accept(this);
        TYPE rType = expr.getRhs().accept(this);
        if ((lType == TYPE.UNKNOWN) && (rType == TYPE.UNKNOWN)) {
            return TYPE.UNKNOWN;
        }
        if (((lType == TYPE.BOOL) && (rType == TYPE.UNKNOWN)) || ((lType == TYPE.UNKNOWN) && (rType == TYPE.BOOL))) {
            return TYPE.UNKNOWN;
        }
        if ((rType == TYPE.BOOL) && (lType == TYPE.BOOL)) {
            return TYPE.BOOL;
        }
        throw new CastException("Unexpected types in \"" + exceptionMessage + "\" expression: " + lType + " and " + rType);
    }

    @Override
    public TYPE visit(TreeFunction func) throws BaseAstException {
        for (TreeStatement statement : func.getBody()) {
            statement.accept(this);
        }
        return null;        //there is a way to define lolcode function return type, look it up in reference
    }

    @Override
    public TYPE visit(TreeModule module) throws BaseAstException {
        for (TreeFunction func : module.getFunctions()) {
            func.accept(this);
        }
        for (TreeStatement statement : module.getBody()) {
            statement.accept(this);
        }
        return TYPE.UNKNOWN;
    }

    @Override
    public TYPE visit(TreeFunctionParameter param) {
        return null;
    }

    @Override
    public TYPE visit(TreeIfStmt ifStmt) {
//        if(ifStmt.getCondition() != null){
//            if()
//        }
        return null;
    }

    @Override
    public TYPE visit(TreeLoopStmt loopStmt) {
        return null;
    }

    @Override
    public TYPE visit(TreeAssignStmt assignStmt) throws BaseAstException {
        TYPE rhsType = assignStmt.getRhs().accept(this);
        assignStmt.getLhs().setType(rhsType);
        return rhsType;
    }

    @Override
    public TYPE visit(TreeCaseStmt caseStmt) {
        return null;
    }

    @Override
    public TYPE visit(TreeVarDeclStmt varDeclStmt) throws BaseAstException {
        TYPE type = (varDeclStmt.getInitialValue() != null) ? varDeclStmt.getInitialValue().accept(this) : TYPE.UNKNOWN;
        varDeclStmt.getVar().setType(type);
        return type;
    }

    @Override
    public TYPE visit(TreeVisibleStmt visibleStmt) throws BaseAstException {
        return visibleStmt.getArgument().accept(this);
    }

    @Override
    public TYPE visit(TreeGimmehStmt gimmehStmt) {
        return null;
    }

    @Override
    public TYPE visit(TreeFuncCallStmt funcCallStmt) {
        return null;
    }

    @Override
    public TYPE visit(TreeBreakStmt breakStmt) {
        return null;
    }

    @Override
    public TYPE visit(TreeReturnStmt returnStmt) throws BaseAstException {
        return returnStmt.getRetValue().accept(this);
    }

    @Override
    public TYPE visit(TreeVariable variable) {
        return variable.getType();
    }

    @Override
    public TYPE visit(TreeConstant constant) {
        return constant.getType();
    }

    @Override
    public TYPE visit(TreeSumExpr sumExpr) throws BaseAstException {
        return inferBinaryExpr(sumExpr, "summation");
    }

    @Override
    public TYPE visit(TreeSubExpr subExpr) throws BaseAstException {
        return inferBinaryExpr(subExpr, "subtraction");
    }

    @Override
    public TYPE visit(TreeMulExpr mulExpr) throws BaseAstException {
        return inferBinaryExpr(mulExpr, "multiplication");
    }

    @Override
    public TYPE visit(TreeDivExpr divExpr) throws BaseAstException {
        return inferBinaryExpr(divExpr, "division");
    }

    @Override
    public TYPE visit(TreeModExpr modExpr) throws BaseAstException {
        return inferBinaryExpr(modExpr, "modulo");
    }

    @Override
    public TYPE visit(TreeMaxExpr maxExpr) throws BaseAstException {
        return inferBinaryExpr(maxExpr, "max");
    }

    @Override
    public TYPE visit(TreeMinExpr minExpr) throws BaseAstException {
        return inferBinaryExpr(minExpr, "min");
    }

    @Override
    public TYPE visit(TreeAndExpr andExpr) throws BaseAstException {
        return inferBinaryLogicExpr(andExpr, "and");
    }

    @Override
    public TYPE visit(TreeOrExpr orExpr) throws BaseAstException {
        return inferBinaryLogicExpr(orExpr, "or");
    }

    @Override
    public TYPE visit(TreeXorExpr xorExpr) throws BaseAstException {
        return inferBinaryLogicExpr(xorExpr, "xor");
    }

    @Override
    public TYPE visit(TreeNotExpr notExpr) throws BaseAstException {
        TYPE type = notExpr.getExpr().accept(this);
        if ((type == TYPE.UNKNOWN) || (type == TYPE.BOOL)) {
            return type;
        }
        throw new CastException("Wrong type in \"not\" expression: " + type);
    }

    @Override
    public TYPE visit(TreeEqualExpr equalExpr) throws BaseAstException {
        inferBinaryExpr(equalExpr, "equality");
        return TYPE.BOOL;
    }

    @Override
    public TYPE visit(TreeNequalExpr nequalExpr) throws BaseAstException {
        inferBinaryExpr(nequalExpr, "inequality");
        return TYPE.BOOL;
    }
}
