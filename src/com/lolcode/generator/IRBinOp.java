package com.lolcode.generator;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/29/13
 * Time: 5:57 PM
 */
public class IRBinOp extends IRBlock {
    public enum OpType {SUM, SUB, MUL, DIV}

    OpType opType;
    public IRRegister result;
    public IRValue lhs;
    public IRValue rhs;
    public IRCallBlk call;
}
