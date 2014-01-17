package com.lolcode.runtime;

public class LolRuntimeUnsupportedOp extends LolRuntimeException {
    public LolRuntimeUnsupportedOp(String msg) {
        super(msg);
    }

    public LolRuntimeUnsupportedOp(String op, LolType type) {
        super("Operation " + op + " is unsupported by " + type);
    }
}
