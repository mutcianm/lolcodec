package com.lolcode.runtime;

public class LolRuntimeBinOpWrongType extends LolRuntimeException {
    public LolRuntimeBinOpWrongType(String msg) {
        super(msg);
    }

    public LolRuntimeBinOpWrongType(String op, LolType lhs, LolType rhs) {
        super("Mismatched types in " + op + ": " + lhs + " and " + rhs);
    }
}
