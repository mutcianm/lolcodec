package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/11/13
 * Time: 9:24 PM
 */

/**
 * Basic node type. Mainly used as a root of Builder resulting tree.
 */
public interface TreeNode {

    void accept(BaseASTVisitor v);
}
