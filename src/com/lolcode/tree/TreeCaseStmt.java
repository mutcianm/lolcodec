package com.lolcode.tree;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.q
 * User: miha
 * Date: 7/14/13
 * Time: 2:00 PM
 */

/**
 * Implements lolcode switch statement. <p><pre>
 * {@code VAR1 WTF?
 *      OMG 256
 *          VISIBLE "256"
 *          GTFO
 *      OMGWTF
 *          VISIBLE "NOT 256 LOL"
 *   OIC}</pre></p>
 */
public class TreeCaseStmt extends TreeStatement {
    TreeValue val;
    HashMap<TreeConstant, ArrayList<TreeStatement>> body;

    public TreeCaseStmt() {
        val = null;
        body = new HashMap<>();
    }

    public TreeValue getVal() {
        return val;
    }

    public void setVal(TreeValue val) {
        this.val = val;
    }

    public void addStatement(TreeConstant label, TreeStatement statement) {
        //might as well check if value is set prior to adding statements
        ArrayList<TreeStatement> statements = body.get(label);
        if (statements != null) {
            statements.add(statement);
        } else {
            statements = new ArrayList<>();
            statements.add(statement);
            body.put(label, statements);
        }

    }

    @Override
    public void accept(Visitor v) {
//        v.visit(this);
    }
}
