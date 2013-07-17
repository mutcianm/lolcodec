package com.lolcode.tree;

import com.lolcode.tree.exception.BuildException;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 1:49 PM
 */

/**
 * Use this class to build ast by using build[...] methods.
 * Builder has a state @see current determining tree node it currently builds.
 * Builder does not perform any syntax or semantic checks.
 * Make sure you call finishBuildNode() when exiting a node in parse tree.
 *
 * @deprecated Use ASTBuilder instead
 */
public class Builder {
    private class UtilState implements TreeNode {
        @Override
        public void accept(BaseASTVisitor v) {
        }
    }

    private class IfTrueBranch extends UtilState {
    }

    private class IfFalseBranch extends UtilState {
    }


    public Builder() {
        root = null;
        current = null;
        state = new Stack<>();
    }

    public TreeNode getRoot() {
        return root;
    }

    public void buildModule(String moduleName) throws BuildException {
        if ((current != null) || (root != null)) {
            throw new BuildException("buildModule() called more than once inside same module!");
        }
        TreeModule module = new TreeModule();
        module.setModuleName(moduleName);
        state.push(module);
        root = module;
        current = root;
    }

    public void buildFunction(String funcName) throws BuildException {
        if (!(current instanceof TreeModule)) {
            throw new BuildException("buildFunction() called outside TreeModule!");
        }
        TreeModule module = (TreeModule) current;
        TreeFunction func = new TreeFunction();
        func.setName(funcName);
        module.addFunction(func);
        state.push(func);
        current = func;
    }

    public void buildFunctionParameter(String id) throws BuildException {
        if (!(current instanceof TreeFunction)) {
            throw new BuildException("buildFunctionParameter() called outside TreeFunction!");
        }
        TreeFunction func = (TreeFunction) current;
        TreeFunctionParameter param = new TreeFunctionParameter();
        param.setName(id);
        func.addParam(param);
        state.push(param);
        current = param;
    }

    public void buildIfStmt() {

    }

    public void finishBuildNode() throws BuildException {
        current = state.pop();
        if (current == null) {
            throw new BuildException("something went wrong, builder stack is empty!");
        }
    }

    private TreeNode root;
    private TreeNode current;
    private Stack<TreeNode> state;
}
