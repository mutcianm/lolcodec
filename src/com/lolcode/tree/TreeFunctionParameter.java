package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/11/13
 * Time: 9:45 PM
 */

/**
 * Implements a value passed to function, it could either be of mutable or immutable type.
 */
public class TreeFunctionParameter extends TreeValue {
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
