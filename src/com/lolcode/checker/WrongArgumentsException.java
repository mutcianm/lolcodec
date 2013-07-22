package com.lolcode.checker;

import com.lolcode.tree.TreeFunction;
import com.lolcode.tree.exception.BaseAstException;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/22/13
 * Time: 3:25 PM
 */
public class WrongArgumentsException extends BaseAstException {
    public WrongArgumentsException(String message) {
        super(message);
    }

    public WrongArgumentsException(TreeFunction func, int got) {
        super("Function \"" + func.getName() + "\" expects " + func.getParams().size() + " argument(s), given " + got);
    }
}
