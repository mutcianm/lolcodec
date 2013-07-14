package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 2:48 PM
 */

/**
 * Defines class for lolcode expression.<p>
 * <li>binary math expressions(SUM OF/DIFF OF/PRODUKT OF/etc. )</li>
 * <li>binary logic(BOTH OF/EITHER OF/NOT)</li>
 * <li>comparison(BIGGR OF/SMALLR OF)</li>
 * <li>min/max expressions</li>
 * <li>funexpr - no idea what it is</li>
 * </p>
 */
public abstract class TreeExpression implements TreeNode {
    @Override
    public void addChild(TreeNode tn) {
    }

    @Override
    public TreeNode[] getChildren() {
        return new TreeNode[0];
    }
}
