package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/20/13
 * Time: 3:55 PM
 */
public class TreeBreakStmt extends TreeStatement {
    @Override
    public void accept(BaseASTVisitor v) {
        v.visit(this);
    }
}
