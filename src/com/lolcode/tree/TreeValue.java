package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 2:57 PM
 */

/**
 * Defines lolcode value handling objects.
 */
public class TreeValue extends TreeExpression {
    @Override
    public void addChild(TreeNode tn) {
    }

    @Override
    public TreeNode[] getChildren() {
        return new TreeNode[0];
    }

    @Override
    public void accept(Visitor v) {
    }
}
