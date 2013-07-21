package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/21/13
 * Time: 4:00 PM
 */
public class TreeNequalExpr extends TreeBinaryExpr {
    @Override
    public <T> T accept(BaseASTVisitor<T> v) {
        return v.visit(this);
    }
}
