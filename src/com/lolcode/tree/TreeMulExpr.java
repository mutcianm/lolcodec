package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/15/13
 * Time: 4:16 PM
 */

/**
 * Handles lolcode multiplication expression. <p><pre>{@code
 *  PRODUCT OF VAR1 AN VAR2
 * }</pre></p>
 */
public class TreeMulExpr extends TreeBinaryExpr {

    @Override
    public <T> T accept(BaseASTVisitor<T> v) {
        return v.visit(this);
    }
}
