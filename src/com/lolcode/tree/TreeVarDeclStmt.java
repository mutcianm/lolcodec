package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 4:39 PM
 */

/**
 * Implements lolcode variable declaration and optional initialisation. Example: `I HAZ A VAR1 ITZ 256`
 */
public class TreeVarDeclStmt extends TreeStatement {
    TreeVariable var;
    TreeConstant initialValue;

    public TreeVariable getVar() {
        return var;
    }

    public void setVar(TreeVariable var) {
        this.var = var;
    }

    public TreeConstant getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(TreeConstant initialValue) {
        this.initialValue = initialValue;
    }

    @Override
    public void accept(Visitor v) {
//        v.visit(this);
    }
}
