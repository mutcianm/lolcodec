package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 2:57 PM
 */

/**
 * Defines lolcode value handling objects.
 * TODO: Make a decision on which type the value is stored.
 */
public abstract class TreeValue extends TreeExpression {

    protected String value; //

    public TreeValue() {
        value = "";
    }

    /**
     * Attempts to parse and store the value, regardless of internal value representation.
     *
     * @param val String representation of value from parse tree, if there is one.
     */
    protected void fromString(String val) {
        value = val;
    }

    //    @Override
//    public void accept(BaseASTVisitor v) {
//        v.visit(this);
//    }
}
