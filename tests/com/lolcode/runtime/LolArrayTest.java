package com.lolcode.runtime;

import org.junit.Test;
import org.junit.Assert;

public class LolArrayTest {

    @Test
    public void testGet() throws Exception {
        LolArray array = new LolArray(new LolInt(23),new LolDouble(21));
        array.put(new LolString("ASASSS"), new LolString("MEH"));
        Assert.assertTrue(array.get(new LolInt(0)).eq(new LolInt(23)).toBool());
        Assert.assertTrue(array.get(new LolString("1")).eq(new LolDouble(21)).toBool());
        Assert.assertTrue(array.get(new LolString("ASASSS")).eq(new LolString("MEH")).toBool());
        try {
            array.get(new LolString("InVALD KEY"));
            Assert.fail("Got wrong element");
        } catch (LolRuntimeException e) {

        }
    }


    @Test
    public void testPut() throws Exception {
        LolArray array = new LolArray(new LolInt(23),new LolDouble(21));
        array.put(new LolString("ASASSS"), new LolString("MEH"));
        Assert.assertTrue(array.get(new LolString("length")).eq(new LolInt(3)).toBool());
    }
}
