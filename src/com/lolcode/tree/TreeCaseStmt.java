package com.lolcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.q
 * User: miha
 * Date: 7/14/13
 * Time: 2:00 PM
 */

/**
 * Implements lolcode switch statement. <p>
 * Implemented with a Map : Constant(label) -> array of TreeStatement
 * <pre>{@code
 *  VAR1 WTF?
 *      OMG 256
 *          VISIBLE "256"
 *          GTFO
 *      OMGWTF
 *          VISIBLE "NOT 256 LOL"
 *   OIC}</pre></p>
 */
public class TreeCaseStmt extends TreeStatement {
    TreeExpression val;
    HashMap<TreeConstant, List<TreeStatement>> body;
    List<TreeStatement> defaultBranch;

    public TreeCaseStmt() {
        val = null;
        body = new HashMap<>();
        defaultBranch = new ArrayList<>();
    }

    public TreeExpression getVal() {
        return val;
    }

    public void setVal(TreeExpression val) {
        this.val = val;
    }

    public void addStatement(TreeConstant label, TreeStatement statement) {
        //might as well check if value is set prior to adding statements
        List<TreeStatement> statements = body.get(label);
        if (statements != null) {
            statements.add(statement);
        } else {
            statements = new ArrayList<>();
            statements.add(statement);
            body.put(label, statements);
        }
    }

    public void addDefaultStmt(TreeStatement statement) {
        defaultBranch.add(statement);
    }

    public void addStatement(TreeConstant label, List<TreeStatement> stmts) {
        body.put(label, stmts);
    }

    public Map<TreeConstant, List<TreeStatement>> getBody() {
        return body;
    }

    @Override
    public void accept(BaseASTVisitor v) {
        v.visit(this);
    }
}
