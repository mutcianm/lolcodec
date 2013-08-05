package com.lolcode.generator;

import com.lolcode.tree.*;
import com.lolcode.tree.exception.BaseAstException;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 6/28/13
 * Time: 11:06 PM
 */
public class IRBuilder implements BaseASTVisitor<IRNode> {

    private IRModule module;
    private Stack<IRFunction> current;

    public IRBuilder() {
        module = null;
        current = new Stack<>();
    }

    public IRNode visitBinOp(IRBinOp op, TreeBinaryExpr expr) throws BaseAstException {
        IRValue lhs = (IRValue) expr.getLhs().accept(this);
        IRValue rhs = (IRValue) expr.getRhs().accept(this);
        op.result = new IRRegister(current.peek().getNextRegister());
        op.lhs = lhs;
        op.rhs = rhs;
        current.peek().addBlock(op);
        return op;
    }

    @Override
    public IRNode visit(TreeFunction func) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeModule treeModule) throws BaseAstException {
        module = new IRModule(treeModule.getModuleName());
        for (TreeFunction func : treeModule.getFunctions()) {
            module.functions.add((IRFunction) visit(func));
        }
        IRFunction main = new IRFunction("main");
        current.push(main);
        for (TreeStatement statement : treeModule.getBody()) {
            main.body.add((IRBlock) statement.accept(this));
        }
        current.pop();
        return null;
    }

    @Override
    public IRNode visit(TreeFunctionParameter param) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeIfStmt ifStmt) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeLoopStmt loopStmt) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeAssignStmt assignStmt) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeCaseStmt caseStmt) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeVarDeclStmt varDeclStmt) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeVisibleStmt visibleStmt) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeGimmehStmt gimmehStmt) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeFuncCallExpr funcCallStmt) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeDummyStmt dummyStmt) throws BaseAstException {
        return dummyStmt.getBody().accept(this);
    }

    @Override
    public IRNode visit(TreeBreakStmt breakStmt) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeReturnStmt returnStmt) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeVariable variable) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeConstant constant) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeSumExpr sumExpr) throws BaseAstException {
        return visitBinOp(new IRSumOp(), sumExpr);
    }

    @Override
    public IRNode visit(TreeSubExpr subExpr) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeMulExpr mulExpr) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeDivExpr divExpr) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeModExpr modExpr) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeMaxExpr maxExpr) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeMinExpr minExpr) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeAndExpr andExpr) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeOrExpr orExpr) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeXorExpr xorExpr) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeNotExpr notExpr) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeEqualExpr equalExpr) throws BaseAstException {
        return null;
    }

    @Override
    public IRNode visit(TreeNequalExpr nequalExpr) throws BaseAstException {
        return null;
    }
}
