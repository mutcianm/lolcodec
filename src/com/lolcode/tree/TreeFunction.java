package com.lolcode.tree;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/11/13
 * Time: 9:45 PM
 */

/**
 * Handles lolcode functions. Stores zero or more arguments in TreeFunctionParameter array,
 * and zero or more statements as function body in TreeStatement array.
 */
public class TreeFunction implements TreeNode {
    private ArrayList<TreeFunctionParameter> params;
    private ArrayList<TreeStatement> body;

    public TreeFunction() {
        params = new ArrayList<>();
        body = new ArrayList<>();
    }

    public void addParam(TreeFunctionParameter param) {
        this.params.add(param);
    }

    public void addStmt(TreeStatement stmt) {
        body.add(stmt);
    }

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
