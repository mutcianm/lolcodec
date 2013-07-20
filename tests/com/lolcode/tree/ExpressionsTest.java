package com.lolcode.tree;

import com.lolcode.Runner;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/20/13
 * Time: 6:47 PM
 */
public class ExpressionsTest extends TestCase {
    Runner runner;

    @Before
    public void setUp() throws Exception {
        runner = new Runner();
        runner.setInputFile("tests/com/lolcode/tree/expressions.lol");
    }

    @Test
    public void testTest() throws Exception {
        runner.test();
    }
}
