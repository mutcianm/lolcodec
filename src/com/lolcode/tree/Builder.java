package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 1:49 PM
 */

/**
 * Use this class to build ast by using build[...] methods.
 * Builder has a state @see current determining tree node it currently builds.
 */
public class Builder {
    public Builder() {
        root = null;
        current = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    private TreeNode root;
    private TreeNode current;
}
