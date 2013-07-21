package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/15/13
 * Time: 6:38 PM
 */

/**
 * Handles lolcode input statement. <p><pre>{@code
 * GIMMEH VAR1
 * }</pre></p>
 */
public class TreeGimmehStmt extends TreeStatement {
    private TreeVariable variable;

    public TreeGimmehStmt() {
        variable = null;
    }

    public TreeVariable getVariable() {
        return variable;
    }

    public void setVariable(TreeVariable variable) {
        this.variable = variable;
    }

    @Override
    public void accept(BaseASTVisitor v) {
        v.visit(this);
    }
}
