package com.lolcode.generator;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 6/29/13
 * Time: 12:09 AM
 */
public class LolAbstractValue implements LolValue {
    private type varType;
    private String name;
    private Object value;


    public LolAbstractValue(String name, String type) {
        this.name = name;
        if (type.equals("NUMBR")) {
            varType = LolValue.type.INT;

        } else if (type.equals("YARN")) {
            varType = LolValue.type.STRING;

        } else if (type.equals("NUMBAR")) {
            varType = LolValue.type.FLOAT;

        } else if (type.equals("TROOF")) {
            varType = LolValue.type.BOOL;

        }
    }

    @Override
    public String getStrType() {
        switch (varType) {
            case INT:
                return "i32";
            case STRING:
                return "i8*";
            case FLOAT:
                return "float";
            case BOOL:
                return "i8";
        }
        return "";
    }

    @Override
    public String getStrName() {
        return name;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public type getVarType() {
        return varType;
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) return false;
        if (this == other) return true;
        if (other == null) return false;
        LolValue _other = (LolValue) other;
        return this.getStrName().equals(_other.getStrName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
