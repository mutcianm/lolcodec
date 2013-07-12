package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 3:50 PM
 */

/**
 * Stores assign statement. For example:</br> <code>VAR1 = VAR2 + 256</code></br> where VAR1 is lhs and VAR2 + 256 is rhs.
 * lhs must be of TreeValue type only, to avoid thing like `VAR1 + VAR2 = 256`, this should be checked in semantic check pass
 */
public class TreeAssignStmt extends TreeStatement {
    public TreeValue getLhs() {
        return lhs;
    }

    public TreeExpression getRhs() {
        return rhs;
    }

    private TreeValue lhs;
    private TreeExpression rhs;

    @Override
    public TreeNode[] getChildren() {
        return new TreeNode[]{lhs, rhs};
    }

    public void setRhs(TreeExpression rhs) {
        this.rhs = rhs;
    }

    public void setLhs(TreeValue lhs) {
        this.lhs = lhs;
    }

    @Override
    public void accept(Visitor v) {
//        v.visit(this);
    }
}
