package com.lolcode.runtime;

public class LolRuntimeNoSuchKey extends LolRuntimeException{
    public LolRuntimeNoSuchKey(String msg) {
        super(msg);
    }

    public LolRuntimeNoSuchKey(LolObject key) {
        super("No such key: " + key.toLolString().strVal);
    }
}
