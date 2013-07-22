package com.lolcode.checker;

import com.lolcode.tree.TYPE;
import com.lolcode.tree.TreeFunction;
import com.lolcode.tree.TreeNode;
import com.lolcode.tree.TreeVariable;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/22/13
 * Time: 4:53 PM
 */
public class ErrorHandler {
    private static Logger log = Logger.getLogger(ErrorHandler.class.getName());
    public static boolean clean = true;

    private static void out(TreeNode.position pos, String what) {
        clean = false;
//        log.severe(what);
        String tmp = pos.toString() + " ";
        System.err.println(tmp + what);
    }

    public static void castError(TreeNode.position pos, String op, TYPE ltype, TYPE rtype) {
        out(pos, "Cannot cast from " + rtype + " to " + ltype + " in \"" + op + "\"");
    }

    public static void redeclaredVarible(TreeNode.position pos, TreeVariable var) {
        out(pos, "Variable \"" + var.getName() + "\" is redeclared");
    }

    public static void undeclaredVariable(TreeNode.position pos, String var) {
        out(pos, "Variable \"" + var + "\" is undeclared");
    }

    public static void redeclaredFunction(TreeNode.position pos, TreeFunction func) {
        out(pos, "Function \"" + func.getName() + "\" is redeclared");
    }

    public static void undeclaredFunction(TreeNode.position pos, String func) {
        out(pos, "Function \"" + func + "\" is undeclared");
    }

    public static void wrongArguments(TreeNode.position pos, TreeFunction func, int got) {
        out(pos, "Function \"" + func.getName() + "\" expects " + func.getParams().size() + " argument(s), given " + got);
    }
}
