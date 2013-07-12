package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/11/13
 * Time: 9:24 PM
 */

/**
 * Basic node type
 */
public interface TreeNode {
    void addChild(TreeNode tn);

    TreeNode[] getChildren();

    void accept(Visitor v);
}
