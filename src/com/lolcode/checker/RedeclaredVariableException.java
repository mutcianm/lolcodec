package com.lolcode.checker;

import com.lolcode.tree.TreeVariable;
import com.lolcode.tree.exception.BaseAstException;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/22/13
 * Time: 2:19 PM
 */
public class RedeclaredVariableException extends BaseAstException {
    public RedeclaredVariableException(String message) {
        super("Variable \"" + message + "\" is redeclared");
    }

    public RedeclaredVariableException(TreeVariable var) {
        super("Variable \"" + var.getName() + "\" is redeclared");
    }
}
