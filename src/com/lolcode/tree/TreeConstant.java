package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 4:40 PM
 */

import com.lolcode.tree.exception.BaseAstException;

/**
 * Implements lolcode immutable values, such as string literals, numeric constants, boolean literals and switch statement literals.
 * TODO: should the value be stored as String and be processed on ir pass or converted to variant right here?
 */
public class TreeConstant extends TreeValue {

    private String realValue;

    public TreeConstant() {
        realValue = "";
    }

    public String getRealValue() {
        return realValue;
    }

    void fromString(String val) {
        realValue = val;
    }

    @Override
    public <T> T accept(BaseASTVisitor<T> v) throws BaseAstException {
        return v.visit(this);
    }
}
