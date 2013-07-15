package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/14/13
 * Time: 2:41 PM
 */

import java.util.ArrayList;

/**
 * Implements lolcode loop statement. <p><pre>{@code
 * IM IN YR LOOP1 UPPIN YR VAR1 TIL BOTH SAEM VAR1 AN 256
 *      VISIBLE "VAR1 IS NAO " VAR1
 *      GTFO
 * IM OUTTA YR POOP1
 * }</pre></p>
 */
public class TreeLoopStmt extends TreeStatement {
    private TreeVariable variable;
    private TreeExpression exitCondition;
    private ArrayList<TreeStatement> body;

    public TreeLoopStmt() {
        variable = null;
        exitCondition = null;
        body = new ArrayList<>();

    }

    public TreeVariable getVariable() {
        return variable;
    }

    public void setVariable(TreeVariable variable) {
        this.variable = variable;
    }

    public TreeExpression getExitCondition() {
        return exitCondition;
    }

    public void setExitCondition(TreeExpression exitCondition) {
        this.exitCondition = exitCondition;
    }

    public void addStatement(TreeStatement statement) {
        body.add(statement);
    }

    public ArrayList<TreeStatement> getBody() {
        return body;
    }

    @Override
    public void accept(BaseASTVisitor v) {
        v.visit(this);
    }
}
