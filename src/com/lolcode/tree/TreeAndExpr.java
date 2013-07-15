package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/15/13
 * Time: 5:09 PM
 */

/**
 * Handles lolcode AND expression. <p><pre>{@code
 *  BOTH OF VAR1 AN VAR2
 * }</pre></p>
 */
public class TreeAndExpr extends TreeBinaryExpr {
    @Override
    public void accept(BaseASTVisitor v) {
        v.visit(this);
    }
}
