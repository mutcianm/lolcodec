package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/15/13
 * Time: 3:42 PM
 */
public class TreeVisibleStmt extends TreeStatement {
    private TreeExpression argument;

    public TreeVisibleStmt() {
        argument = null;
    }

    public TreeExpression getArgument() {
        return argument;
    }

    public void setArgument(TreeExpression argument) {
        this.argument = argument;
    }

    @Override
    public void accept(BaseASTVisitor v) {
        v.visit(this);
    }
}
