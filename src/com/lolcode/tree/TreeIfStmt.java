package com.lolcode.tree;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 2:47 PM
 */
public class TreeIfStmt extends TreeStatement {
    private TreeExpression condition;
    private ArrayList<TreeStatement> trueBranch;
    private ArrayList<TreeStatement> falseBranch;

    @Override
    public void addChild(TreeNode tn) {
    }

    @Override
    public TreeNode[] getChildren() {
        return new TreeNode[0];
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
