package com.lolcode.generator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/29/13
 * Time: 5:37 PM
 */
public class IRModule implements IRNode {
    public ArrayList<IRFunction> functions;
    public String name;

    public IRModule(String name) {
        this.name = name;
        functions = new ArrayList<>();
    }
}
