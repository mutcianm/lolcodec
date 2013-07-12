package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 4:31 PM
 */

/**
 * Handles summation expressions. </br><code>SUM OF VAR1 an VAR2</code></br>
 * Consists of two TreeExpression for lhs and rhs respectively.
 */
public class TreeSumExpr extends TreeExpression {
    TreeExpression lhs;
    TreeExpression rhs;

    public TreeExpression getLhs() {
        return lhs;
    }

    public void setLhs(TreeExpression lhs) {
        this.lhs = lhs;
    }

    public TreeExpression getRhs() {
        return rhs;
    }

    public void setRhs(TreeExpression rhs) {
        this.rhs = rhs;
    }

    @Override
    public void accept(Visitor v) {
//        v.visit(this);
    }
}
