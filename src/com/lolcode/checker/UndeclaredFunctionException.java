package com.lolcode.checker;

import com.lolcode.tree.TreeFunction;
import com.lolcode.tree.exception.BaseAstException;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/22/13
 * Time: 2:34 PM
 */
public class UndeclaredFunctionException extends BaseAstException {
    public UndeclaredFunctionException(String message) {
        super(message);
    }

    public UndeclaredFunctionException(TreeFunction func) {
        super("Function \"" + func.getName() + "\" id undeclared");
    }
}
