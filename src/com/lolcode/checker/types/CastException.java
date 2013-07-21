package com.lolcode.checker.types;

import com.lolcode.tree.exception.BaseAstException;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/21/13
 * Time: 7:58 PM
 */
public class CastException extends BaseAstException {
    public CastException(String message) {
        super(message);
    }
}
