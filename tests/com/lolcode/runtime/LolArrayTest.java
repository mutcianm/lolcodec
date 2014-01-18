package com.lolcode.runtime;

import org.junit.Test;

public class LolArrayTest {

    @Test
    public void testArray() throws Exception{
        LolArray lolArray = new LolArray();
        for (int i = 0; i < 5; i++) {
            lolArray.put(new LolInt(i), new LolInt(i).toLolDouble());
        }
        System.out.println(lolArray.get(new LolString("length")).toLolString().strVal);
        for (int i = 0; i < 5; i++) {
            System.out.println(lolArray.get(new LolInt(i)).toLolString().strVal);
        }
    }
}
