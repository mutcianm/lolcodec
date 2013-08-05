package com.lolcode.generator;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/29/13
 * Time: 5:35 PM
 */
public class IRBlock implements IRNode {
    public enum BlkType {ALLOC, LOAD, STORE, CALL, BINOP, BR, SWITCH, LABEL, RET}

    public BlkType blkType;
}
