package com.lolcode.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 6/28/13
 * Time: 11:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class LolFunction {
    public LolFunction(String name, ArrayList<LolVariable> args){
        body.append("define void @" + name + "(");
        if(args.size() > 0 ){
            body.append(args.get(0).getStrType() + " " + args.get(0).getStrName());
            addVariable(args.get(0));
        }
        for(LolVariable v : args){
            body.append(", " + v.getStrType() + " " + v.getStrName());
            addVariable(v);
        }
        body.append(") {");
    }
    public void addAddInst(LolVariable lhs, LolVariable rhsa, LolVariable rhsb){
        addOpCode(symbols.get(lhs) + " = add nsw i32 " + symbols.get(rhsa) + ", " + symbols.get(rhsb));
    }
    public void addSubInst(LolVariable lhs, LolVariable rhsa, LolVariable rhsb){
        addOpCode(symbols.get(lhs) + " = sub nsw i32 " + symbols.get(rhsa) + ", " + symbols.get(rhsb));
    }
    public void addMulInst(LolVariable lhs, LolVariable rhsa, LolVariable rhsb){
        addOpCode(symbols.get(lhs) + " = mul nsw i32 " + symbols.get(rhsa) + ", " + symbols.get(rhsb));
    }
    public void addDivInst(LolVariable lhs, LolVariable rhsa, LolVariable rhsb){
        addOpCode(symbols.get(lhs) + " = sdiv nsw i32 " + symbols.get(rhsa) + ", " + symbols.get(rhsb));
    }
    public void addAssignInst(LolVariable lhs, LolVariable rhs){
        addOpCode("store");
    }

    public void addVisibleStmt(LolVariable v){
        String format;
        int tmp;
        switch (v.getVarType()) {
            case INT:
                tmp = StringTable.getInstance().insertString("%d\n");
                break;
            case STRING:
                tmp = StringTable.getInstance().insertString((String)v.getValue()+"\n");
                break;
            case FLOAT:
                tmp = StringTable.getInstance().insertString("%f\n");
                break;
            case BOOL:
                tmp = StringTable.getInstance().insertString("%d\n");
                break;
        }
//        addOpCode();
    }
    public void endFunction(){
        body.append("}\n\n");
    }

    private void addOpCode(String data){
        body.append(data+"\n");
    }

    public boolean addVariable(LolVariable var){
        if(!symbols.containsKey(var)){
            symbols.put(var, "%" + var.getStrName());
            return true;
        }
        return false;
    }

    public LolVariable getVarByName(String name){
        for (LolVariable v : symbols.keySet()){
            if(v.getStrName().equals(name)){
                return v;
            }
        }
        return null;
    }

    private StringBuffer body;
    private ArrayList<LolVariable> vars;
    public HashMap<LolVariable, String> symbols;
}
