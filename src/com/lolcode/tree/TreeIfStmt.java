package com.lolcode.tree;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 2:47 PM
 */

/**
 * Handles lolcode if statement
 */
public class TreeIfStmt extends TreeStatement {
    private TreeExpression condition;
    private ArrayList<TreeStatement> trueBranch;
    private ArrayList<TreeStatement> falseBranch;

    public TreeIfStmt() {
        trueBranch = new ArrayList<>();
        falseBranch = new ArrayList<>();
    }

    public void setCondition(TreeExpression condition) {
        this.condition = condition;
    }

    public void addTrueStmt(TreeStatement statement) {
        trueBranch.add(statement);
    }

    public void addFalseStmt(TreeStatement statement) {
        falseBranch.add(statement);
    }

    @Override
    public void addChild(TreeNode tn) {
    }

    @Override
    public TreeNode[] getChildren() {
        return new TreeExpression[]{condition}; //FIXME: how do i handle child concatenation?
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
