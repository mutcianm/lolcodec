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
        condition = null;
        trueBranch = new ArrayList<>();
        falseBranch = new ArrayList<>();
    }

    public void setCondition(TreeExpression condition) {
        this.condition = condition;
    }

    public TreeExpression getCondition() {
        return condition;
    }

    public void addTrueStmt(TreeStatement statement) {
        trueBranch.add(statement);
    }

    public void addFalseStmt(TreeStatement statement) {
        falseBranch.add(statement);
    }

    public ArrayList<TreeStatement> getTrueBranch() {
        return trueBranch;
    }

    public ArrayList<TreeStatement> getFalseBranch() {
        return falseBranch;
    }

    @Override
    public void accept(BaseASTVisitor v) {
        v.visit(this);
    }
}
