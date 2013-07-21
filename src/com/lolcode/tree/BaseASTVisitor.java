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
public interface BaseASTVisitor {
    void visit(TreeFunction func);

    void visit(TreeModule module);

    void visit(TreeFunctionParameter param);

    void visit(TreeIfStmt ifStmt);

    void visit(TreeLoopStmt loopStmt);

    void visit(TreeAssignStmt assignStmt);

    void visit(TreeCaseStmt caseStmt);

    void visit(TreeVarDeclStmt varDeclStmt);

    void visit(TreeVisibleStmt visibleStmt);

    void visit(TreeGimmehStmt gimmehStmt);

    void visit(TreeFuncCallStmt funcCallStmt);

    void visit(TreeBreakStmt breakStmt);

    void visit(TreeReturnStmt returnStmt);

    //Expressions:
    void visit(TreeVariable variable);

    void visit(TreeConstant constant);

    void visit(TreeSumExpr sumExpr);

    void visit(TreeSubExpr subExpr);

    void visit(TreeMulExpr mulExpr);

    void visit(TreeDivExpr divExpr);

    void visit(TreeModExpr modExpr);

    //logic expressions
    void visit(TreeMaxExpr maxExpr);

    void visit(TreeMinExpr minExpr);

    void visit(TreeAndExpr andExpr);

    void visit(TreeOrExpr orExpr);

    void visit(TreeXorExpr xorExpr);

    void visit(TreeNotExpr notExpr);

    void visit(TreeEqualExpr equalExpr);

    void visit(TreeNequalExpr nequalExpr);
}
