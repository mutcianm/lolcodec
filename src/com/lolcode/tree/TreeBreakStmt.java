package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/20/13
 * Time: 3:55 PM
 */
public class TreeBreakStmt extends TreeStatement {
    @Override
    public <T> T accept(BaseASTVisitor<T> v) {
        return v.visit(this);
    }
}
