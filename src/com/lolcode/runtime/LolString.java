package com.lolcode.runtime;

public class LolString extends LolObject {
    public LolString(LolType type) {
        super(type);
    }

    public LolString(String s) {
        type = LolType.STRING;
        strVal = s;
    }
}
