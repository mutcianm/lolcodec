package com.lolcode.generator;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/29/13
 * Time: 5:47 PM
 */
public abstract class IRContainerBlock implements IRNode {
    public int lastRegister;

    public abstract void addBlock(IRBlock blk);

    public int getNextRegister() {
        return ++lastRegister;
    }
}
