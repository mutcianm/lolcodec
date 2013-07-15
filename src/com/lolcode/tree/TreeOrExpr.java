package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/15/13
 * Time: 5:11 PM
 */

/**
 * Handles lolcode OR expression. <p><pre>{@code
 *  WTF AM I SUPPOSED TO WRITE HERE
 * }</pre></p>
 */
public class TreeOrExpr extends TreeBinaryExpr {
    @Override
    public void accept(BaseASTVisitor v) {
        v.visit(this);
    }
}
