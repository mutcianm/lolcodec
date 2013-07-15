package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/15/13
 * Time: 4:12 PM
 */

/**
 * Handles lolcode NOT expression. <p><pre>{@code
 * NOT BOTH SAEM VAR1 AN VAR2
 * }</pre></p>
 */
public class TreeNotExpr extends TreeExpression {
    private TreeExpression expr;

    public TreeNotExpr() {
        expr = null;
    }

    public TreeExpression getExpr() {
        return expr;
    }

    public void setExpr(TreeExpression expr) {
        this.expr = expr;
    }

    @Override
    public void accept(BaseASTVisitor v) {
        v.visit(this);
    }
}
