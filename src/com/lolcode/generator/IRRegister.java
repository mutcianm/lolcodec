package com.lolcode.generator;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/29/13
 * Time: 5:56 PM
 */
public class IRRegister extends IRValue {
    public int num;

    @Override
    public String toString() {
        return "%" + num;
    }

    public IRRegister(int num) {
        this.num = num;
    }
}
