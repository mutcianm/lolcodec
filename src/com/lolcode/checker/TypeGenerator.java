package com.lolcode.checker;

import com.lolcode.tree.*;
import com.lolcode.tree.exception.BaseAstException;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/21/13
 * Time: 7:33 PM
 */

/**
 * Attempts to infer types for variables if possible.
 * Is intrusive: overwrites types in AST.
 * TODO: keep track of variable assignments as well as expressions.
 */
public class TypeGenerator implements BaseASTVisitor<TYPE> {

    TYPE inferBinaryExpr(TreeBinaryExpr expr, String exceptionMessage) throws BaseAstException {
        TYPE lType = expr.getLhs().accept(this);
        TYPE rType = expr.getRhs().accept(this);
        if ((lType == TYPE.UNKNOWN) || (rType == TYPE.UNKNOWN)) {
            return TYPE.UNKNOWN;
        }
        if (lType != rType) {
            ErrorHandler.castError(expr.getPos(), exceptionMessage, lType, rType);
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
        ErrorHandler.castError(expr.getPos(), exceptionMessage, lType, rType);
        return TYPE.UNKNOWN;
    }

    @Override
    public TYPE visit(TreeFunction func) throws BaseAstException {
        for (TreeStatement statement : func.getBody()) {
            statement.accept(this);
        }
        return null;        //TODO: there is a way to define lolcode function return type, look it up in reference
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
    public TYPE visit(TreeIfStmt ifStmt) throws BaseAstException {
        ifStmt.getCondition().accept(this);
        for (TreeStatement statement : ifStmt.getTrueBranch()) {
            statement.accept(this);
        }
        for (TreeIfStmt elseif : ifStmt.getElseIfs()) {
            visit(elseif);
        }
        for (TreeStatement statement : ifStmt.getFalseBranch()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public TYPE visit(TreeLoopStmt loopStmt) throws BaseAstException {
        loopStmt.getVariable().setType(loopStmt.weakref.getType());
        loopStmt.getExitCondition().accept(this);
        for (TreeStatement statement : loopStmt.getBody()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public TYPE visit(TreeAssignStmt assignStmt) throws BaseAstException {
        TYPE rhsType = assignStmt.getRhs().accept(this);
        assignStmt.getLhs().setType(rhsType);
        return rhsType;
    }

    @Override
    public TYPE visit(TreeCaseStmt caseStmt) throws BaseAstException {
        TYPE val = caseStmt.getVal().accept(this);
        if (val != TYPE.UNKNOWN) {
            for (TreeConstant constant : caseStmt.getBody().keySet()) {
                if (constant.getType() != val) {
                    ErrorHandler.castError(constant.getPos(), "case", val, constant.getType());
                }
            }
        }
        for (List<TreeStatement> branch : caseStmt.getBody().values()) {
            for (TreeStatement statement : branch) {
                statement.accept(this);
            }
        }
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
    public TYPE visit(TreeDummyStmt dummyStmt) throws BaseAstException {
        return dummyStmt.getBody().accept(this);
    }

    @Override
    public TYPE visit(TreeFuncCallExpr funcCallStmt) {
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
        return inferBinaryExpr(sumExpr, "sum");
    }

    @Override
    public TYPE visit(TreeSubExpr subExpr) throws BaseAstException {
        return inferBinaryExpr(subExpr, "sub");
    }

    @Override
    public TYPE visit(TreeMulExpr mulExpr) throws BaseAstException {
        return inferBinaryExpr(mulExpr, "mul");
    }

    @Override
    public TYPE visit(TreeDivExpr divExpr) throws BaseAstException {
        return inferBinaryExpr(divExpr, "div");
    }

    @Override
    public TYPE visit(TreeModExpr modExpr) throws BaseAstException {
        return inferBinaryExpr(modExpr, "mod");
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
        ErrorHandler.castError(notExpr.getPos(), "not", type, TYPE.BOOL);
        return TYPE.UNKNOWN;
    }

    @Override
    public TYPE visit(TreeEqualExpr equalExpr) throws BaseAstException {
        inferBinaryExpr(equalExpr, "equal");
        return TYPE.BOOL;
    }

    @Override
    public TYPE visit(TreeNequalExpr nequalExpr) throws BaseAstException {
        inferBinaryExpr(nequalExpr, "nequal");
        return TYPE.BOOL;
    }
}
