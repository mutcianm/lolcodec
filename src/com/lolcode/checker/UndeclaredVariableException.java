package com.lolcode.checker;

import com.lolcode.tree.TreeVariable;
import com.lolcode.tree.exception.BaseAstException;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/22/13
 * Time: 1:10 PM
 */
public class UndeclaredVariableException extends BaseAstException {
    public UndeclaredVariableException(String message) {
        super("Variable \"" + message + "\" is undeclared");
    }

    public UndeclaredVariableException(TreeVariable var) {
        super("Variable \"" + var.getName() + "\" is undeclared");
    }
}
