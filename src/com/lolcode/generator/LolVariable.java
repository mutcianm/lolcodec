package com.lolcode.generator;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 6/28/13
 * Time: 11:50 PM
 * To change this template use File | Settings | File Templates.
 */
public interface LolVariable {
    type getVarType();

    public enum type {
        INT,
        STRING,
        FLOAT,
        BOOL;
    }
    String getStrType();
    String getStrName();
    Object getValue();
    boolean equals(Object other);
    int hashCode();
}
