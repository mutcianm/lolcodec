package com.lolcode.generator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/29/13
 * Time: 5:37 PM
 */
public class IRFunction extends IRContainerBlock {
    public ArrayList<IRBlock> body;
    public ArrayList<IRVariable> args;
    public String name;

    public IRFunction(String name) {
        this.name = name;
        body = new ArrayList<>();
    }

    @Override
    public void addBlock(IRBlock blk) {
        body.add(blk);
    }
}
