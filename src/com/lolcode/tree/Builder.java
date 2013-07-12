package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 1:49 PM
 */

/**
 * Use this class to build ast by using build[...] methods.
 */
public class Builder {
    public TreeNode getRoot() {
        return root;
    }

    private TreeNode root;
    private TreeNode current;
}
