package com.lolcode.tree;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 2:09 PM
 */

/**
 * Represents lolcode primary compilation unit in ast. Consists of 0 or more function declarations
 * and 0 or more body statements, which act as main() in c.
 */
public class TreeModule implements TreeNode {

    private String moduleName;
    private ArrayList<TreeFunction> functions;
    private ArrayList<TreeStatement> body;

    public TreeModule() {
        moduleName = "";
        functions = new ArrayList<>();
        body = new ArrayList<>();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void addFunction(TreeFunction function) {
        functions.add(function);
    }

    public void addStatement(TreeStatement statement) {
        body.add(statement);
    }

    public ArrayList<TreeFunction> getFunctions() {
        return functions;
    }

    public ArrayList<TreeStatement> getBody() {
        return body;
    }

    @Override
    public void accept(BaseASTVisitor v) {
        v.visit(this);
    }
}
