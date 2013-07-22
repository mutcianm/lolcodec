package com.lolcode.checker;

import com.lolcode.tree.TYPE;
import com.lolcode.tree.TreeFunction;
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

    private static void out(String what) {
        clean = false;
//        log.severe(what);
        System.err.println(what);
    }

    public static void castError(String op, TYPE ltype, TYPE rtype) {
        out("Cannot cast from " + rtype + " to " + ltype + " in \"" + op + "\"");
    }

    public static void redeclaredVarible(TreeVariable var) {
        out("Variable \"" + var.getName() + "\" is redeclared");
    }

    public static void undeclaredVariable(String var) {
        out("Variable \"" + var + "\" is undeclared");
    }

    public static void redeclaredFunction(TreeFunction func) {
        out("Function \"" + func.getName() + "\" is redeclared");
    }

    public static void undeclaredFunction(String func) {
        out("Function \"" + func + "\" is undeclared");
    }

    public static void wrongArguments(TreeFunction func, int got) {
        out("Function \"" + func.getName() + "\" expects " + func.getParams().size() + " argument(s), given " + got);
    }
}
