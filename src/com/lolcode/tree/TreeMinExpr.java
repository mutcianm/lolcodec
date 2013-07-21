package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/15/13
 * Time: 5:00 PM
 */

/**
 * Handles lolcode MIN expression. <p><pre>{@code
 *  SMALLR OF VAR1 AN VAR2
 * }</pre></p>
 */
public class TreeMinExpr extends TreeBinaryExpr {
    @Override
    public <T> T accept(BaseASTVisitor<T> v) {
        return v.visit(this);
    }
}
