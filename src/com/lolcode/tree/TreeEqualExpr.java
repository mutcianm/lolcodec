package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/21/13
 * Time: 3:59 PM
 */
public class TreeEqualExpr extends TreeBinaryExpr {
    @Override
    public void accept(BaseASTVisitor v) {
        v.visit(this);
    }
}
