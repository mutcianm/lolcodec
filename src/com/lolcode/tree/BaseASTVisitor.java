package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 2:31 PM
 */

/**
 * Declares a base visitor with all kinds of visitable nodes. AST visitors must implement this interface.
 */
public interface BaseASTVisitor<T> {
    T visit(TreeFunction func);

    T visit(TreeModule module);

    T visit(TreeFunctionParameter param);

    T visit(TreeIfStmt ifStmt);

    T visit(TreeLoopStmt loopStmt);

    T visit(TreeAssignStmt assignStmt);

    T visit(TreeCaseStmt caseStmt);

    T visit(TreeVarDeclStmt varDeclStmt);

    T visit(TreeVisibleStmt visibleStmt);

    T visit(TreeGimmehStmt gimmehStmt);

    T visit(TreeFuncCallStmt funcCallStmt);

    T visit(TreeBreakStmt breakStmt);

    T visit(TreeReturnStmt returnStmt);

    //Expressions:
    T visit(TreeVariable variable);

    T visit(TreeConstant constant);

    T visit(TreeSumExpr sumExpr);

    T visit(TreeSubExpr subExpr);

    T visit(TreeMulExpr mulExpr);

    T visit(TreeDivExpr divExpr);

    T visit(TreeModExpr modExpr);

    //logic expressions
    T visit(TreeMaxExpr maxExpr);

    T visit(TreeMinExpr minExpr);

    T visit(TreeAndExpr andExpr);

    T visit(TreeOrExpr orExpr);

    T visit(TreeXorExpr xorExpr);

    T visit(TreeNotExpr notExpr);

    T visit(TreeEqualExpr equalExpr);

    T visit(TreeNequalExpr nequalExpr);
}
