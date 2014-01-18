package com.lolcode.runtime;

import java.util.HashMap;

public class LolArray extends LolObject {
    private HashMap<String, LolObject> arr;

    public LolArray(LolType type) {
        super(type);
    }

    public LolArray(LolObject... objects) {
        this.type = LolType.ARRAY;
        arr = new HashMap<>();
        for (int i = 0; i < objects.length; i++) {
            arr.put(Integer.toString(i), objects[i]);
        }
    }

    @Override
    public LolObject get(LolObject index) {
        if (index.toLolString().strVal.equals("length")) {
            return new LolInt(arr.size());
        }
        LolObject res = arr.get(index.toLolString().strVal);
        if (res != null) {
            return res;
        }
        throw new LolRuntimeException("no element at such index present in map");
    }

    public LolObject put(LolObject index, LolObject value) {
        String strInd = index.toLolString().strVal;
        //do we put here usual logical things, like
        arr.put(strInd, value);
        return value;
    }
}
