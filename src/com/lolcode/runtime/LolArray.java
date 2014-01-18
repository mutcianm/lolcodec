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
        arr.put("length",new LolInt(objects.length));
        for (int i = 0; i < objects.length; i++) {
            arr.put(Integer.toString(i), objects[i]);
        }
    }

    public LolObject get(LolObject index) {
        String key = index.toLolString().strVal;
        if (arr.containsKey(key)) {
            return arr.get(key);
        }
        throw new LolRuntimeException("no element at such index present in map");
    }

    public LolObject put(LolObject index, LolObject value) {
        String strInd = index.toLolString().strVal;
        //do we put here usual logical things, like
        if (strInd.equals("length")) {
            throw new LolRuntimeException("not allowed to assign length");
        }
        arr.put(strInd, value);
        try {
            double d = Double.parseDouble(strInd);
            if (d == (long) d) {
                int length = arr.get("length").intVal;
                int i = (int) d;
                if (i >= length) {
                    arr.put("length",new LolInt(i+1));
                }
            }
        } catch (NumberFormatException e) {

        }
        return value;
    }
}
