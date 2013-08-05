package com.lolcode.generator;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/29/13
 * Time: 5:34 PM
 */
public class IRVariable implements IRNode {
    public String name;

    public IRVariable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "%" + name;
    }
}
