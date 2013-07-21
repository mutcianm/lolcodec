package com.lolcode.checker.types;

import com.lolcode.tree.*;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/21/13
 * Time: 7:33 PM
 */

/**
 * Attempts to infer types for variables if possible.
 */
public class TypeGenerator implements BaseASTVisitor<TYPE> {
    @Override
    public TYPE visit(TreeFunction func) {
        return null;
    }

    @Override
    public TYPE visit(TreeModule module) {
        for (TreeStatement statement : module.getBody()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public TYPE visit(TreeFunctionParameter param) {
        return null;
    }

    @Override
    public TYPE visit(TreeIfStmt ifStmt) {
        return null;
    }

    @Override
    public TYPE visit(TreeLoopStmt loopStmt) {
        return null;
    }

    @Override
    public TYPE visit(TreeAssignStmt assignStmt) {
        return null;
    }

    @Override
    public TYPE visit(TreeCaseStmt caseStmt) {
        return null;
    }

    @Override
    public TYPE visit(TreeVarDeclStmt varDeclStmt) {
        TYPE type = varDeclStmt.getInitialValue().accept(this);
        varDeclStmt.getVar().setType(type);
        return null;
    }

    @Override
    public TYPE visit(TreeVisibleStmt visibleStmt) {
        return null;
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
    public TYPE visit(TreeReturnStmt returnStmt) {
        return null;
    }

    @Override
    public TYPE visit(TreeVariable variable) {
        return null;
    }

    @Override
    public TYPE visit(TreeConstant constant) {
        return constant.getType();
    }

    @Override
    public TYPE visit(TreeSumExpr sumExpr) {
        return null;
    }

    @Override
    public TYPE visit(TreeSubExpr subExpr) {
        return null;
    }

    @Override
    public TYPE visit(TreeMulExpr mulExpr) {
        return null;
    }

    @Override
    public TYPE visit(TreeDivExpr divExpr) {
        return null;
    }

    @Override
    public TYPE visit(TreeModExpr modExpr) {
        return null;
    }

    @Override
    public TYPE visit(TreeMaxExpr maxExpr) {
        return null;
    }

    @Override
    public TYPE visit(TreeMinExpr minExpr) {
        return null;
    }

    @Override
    public TYPE visit(TreeAndExpr andExpr) {
        return null;
    }

    @Override
    public TYPE visit(TreeOrExpr orExpr) {
        return null;
    }

    @Override
    public TYPE visit(TreeXorExpr xorExpr) {
        return null;
    }

    @Override
    public TYPE visit(TreeNotExpr notExpr) {
        return null;
    }

    @Override
    public TYPE visit(TreeEqualExpr equalExpr) {
        return null;
    }

    @Override
    public TYPE visit(TreeNequalExpr nequalExpr) {
        return null;
    }
}
