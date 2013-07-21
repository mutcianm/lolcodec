package com.lolcode.tree;

import com.lolcode.tree.exception.BaseAstException;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/21/13
 * Time: 3:59 PM
 */
public class TreeEqualExpr extends TreeBinaryExpr {
    @Override
    public <T> T accept(BaseASTVisitor<T> v) throws BaseAstException {
        return v.visit(this);
    }
}
