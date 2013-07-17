package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 4:39 PM
 */

/**
 * Implements lolcode mutable values, such as local function and module variables, loop variables.
 */
public class TreeVariable extends TreeValue {
    private String name;

    public TreeVariable() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(BaseASTVisitor v) {
        v.visit(this);
    }
}
