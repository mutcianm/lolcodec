package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/15/13
 * Time: 4:30 PM
 */

/**
 * Handles lolcode MOD expression. <p><pre>{@code
 *  MOD OF VAR1 AN 10
 * }</pre></p>
 */
public class TreeModExpr extends TreeBinaryExpr {
    @Override
    public <T> T accept(BaseASTVisitor<T> v) {
        return v.visit(this);
    }
}
