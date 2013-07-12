package com.lolcode.tree;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 2:09 PM
 */

/**
 * Represents lolcode primary compilation unit in ast. Consists of 0 or more function declarations
 * and 0 or more body statements, which act as main() in c.
 */
public class TreeModule implements TreeNode {

    private ArrayList<TreeFunction> functions;
    private ArrayList<TreeStatement> body;

    public TreeModule() {
        functions = new ArrayList<>();
        body = new ArrayList<>();
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
