package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/20/13
 * Time: 9:53 PM
 */
public class TreeReturnStmt extends TreeStatement {
    private TreeExpression retValue;

    public TreeReturnStmt() {
        retValue = null;
    }

    public TreeExpression getRetValue() {
        return retValue;
    }

    public void setRetValue(TreeExpression retValue) {
        this.retValue = retValue;
    }

    @Override
    public <T> T accept(BaseASTVisitor<T> v) {
        return v.visit(this);
    }
}
