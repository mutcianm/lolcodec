package com.lolcode.checker;

import com.lolcode.tree.TreeFunction;
import com.lolcode.tree.exception.BaseAstException;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/22/13
 * Time: 2:33 PM
 */
public class RedeclaredFunctionException extends BaseAstException {
    public RedeclaredFunctionException(String message) {
        super(message);
    }

    public RedeclaredFunctionException(TreeFunction func) {
        super("Function \"" + func.getName() + "\" is redeclared");
    }
}
