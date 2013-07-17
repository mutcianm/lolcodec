package com.lolcode.tree;

import com.lolcode.lolcodeBaseVisitor;
import com.lolcode.lolcodeParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/16/13
 * Time: 4:43 PM
 */

/**
 * Builds AST from parse tree. Resulting tree is stored in root.
 *
 * @param <T>
 */
public class AstBuilder<T extends TreeNode> extends lolcodeBaseVisitor<T> {
    private TreeNode root;
    private static Logger log = Logger.getLogger(AstBuilder.class.getName());

    public AstBuilder() {
        root = null;
    }

    @Override
    public T visitFuncall(lolcodeParser.FuncallContext ctx) {
        return super.visitFuncall(ctx);
    }

    @Override
    public T visitValue(@NotNull lolcodeParser.ValueContext ctx) {
        TreeConstant constant = new TreeConstant();
        if (ctx.BOOL() != null) {
            constant.setType(TreeTypedValue.TYPE.BOOL);
            constant.fromString(ctx.BOOL().toString());
        } else if (ctx.INT() != null) {
            constant.setType(TreeTypedValue.TYPE.INT);
            constant.fromString(ctx.INT().toString());
        } else if (ctx.FLOAT() != null) {
            constant.setType(TreeTypedValue.TYPE.FLOAT);
            constant.fromString(ctx.FLOAT().toString());
        } else if (ctx.STRING() != null) {
            constant.setType(TreeTypedValue.TYPE.STRING);
            constant.fromString(ctx.STRING().toString());
        } else {
            log.warning("All types for constant failed to parse");
            constant.setType(TreeTypedValue.TYPE.UNKNOWN);
        }
        return (T) constant;
    }

    @Override
    public T visitFormalParameter(lolcodeParser.FormalParameterContext ctx) {
        TreeFunctionParameter param = new TreeFunctionParameter();
        param.setName(ctx.ID().toString());
        return (T) param;
    }

    @Override
    public T visitVarDecl(lolcodeParser.VarDeclContext ctx) {
        TreeVarDeclStmt varDeclStmt = new TreeVarDeclStmt();
        TreeVariable variable = new TreeVariable();
        variable.setName(ctx.ID().toString());
        if (ctx.expr() != null) {
            variable.setValue((TreeValue) visit(ctx.expr()));
        } else {
            log.info("Variable initializer failed to parse");
        }
        varDeclStmt.setVar(variable);
        return (T) varDeclStmt;
    }

    @Override
    public T visitBlock(lolcodeParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public T visitGimstat(lolcodeParser.GimstatContext ctx) {
        return super.visitGimstat(ctx);
    }

    @Override
    public T visitExpr(lolcodeParser.ExprContext ctx) {
        if (ctx.ID() != null) {
            TreeVariable variable = new TreeVariable();
            variable.setName(ctx.ID().toString());
            return (T) variable;
        }
        return super.visitExpr(ctx);
    }

    @Override
    public T visitAssstat(lolcodeParser.AssstatContext ctx) {
        TreeAssignStmt assignStmt = new TreeAssignStmt();
        if (ctx.ID() != null) {
            TreeVariable lhs = new TreeVariable();
            lhs.setName(ctx.ID().toString());
            assignStmt.setLhs(lhs);
        } else {
            log.severe("variable id in assignment failed to parse");
        }
        if (ctx.expr() != null) {
            TreeExpression expression = (TreeExpression) visit(ctx.expr());
            assignStmt.setRhs(expression);
        } else {
            log.severe("rhs part of assignment failed to parse");
        }
        return (T) assignStmt;
    }

    @Override
    public T visitVisstat(lolcodeParser.VisstatContext ctx) {
        TreeVisibleStmt visibleStmt = new TreeVisibleStmt();
        if (ctx.expr() == null) {
            log.log(Level.SEVERE, "Visible statement has no argument");
        } else {
            visibleStmt.setArgument((TreeExpression) visit(ctx.expr()));
        }
        return (T) visibleStmt;
    }

    @Override
    public T visitNotexpr(lolcodeParser.NotexprContext ctx) {
        return super.visitNotexpr(ctx);
    }

    @Override
    public T visitCasestat(lolcodeParser.CasestatContext ctx) {

        return super.visitCasestat(ctx);
    }

    @Override
    public T visitFile(lolcodeParser.FileContext ctx) {
        if (root != null) {
            log.log(Level.SEVERE, "visitFile() called more than once for same file!");
        }
        TreeModule module = new TreeModule();
        module.setModuleName("MODULENAME");
        if (ctx.functionDecl().isEmpty()) {
            log.log(Level.WARNING, "No function declarations found in module.");
        } else {
            int i = 0;
            for (lolcodeParser.FunctionDeclContext fDecl : ctx.functionDecl()) {
                module.addFunction((TreeFunction) visit(fDecl));
                i++;
            }
            log.log(Level.INFO, "Got " + i + " functions in a module");
        }
        if (ctx.main() == null) {
            log.log(Level.SEVERE, "No module body found in module.");
        } else {
            if (ctx.main().isEmpty()) {
                log.log(Level.WARNING, "No body statements found in module.");
            } else {
                for (lolcodeParser.StatContext statement : ctx.main().stat()) {
                    module.addStatement((TreeStatement) visit(statement));
                }
            }
        }
        root = module;
        return (T) module;
    }

    @Override
    public T visitIfstat(lolcodeParser.IfstatContext ctx) {
        return super.visitIfstat(ctx);
    }

    @Override
    public T visitExprList(lolcodeParser.ExprListContext ctx) {
        return super.visitExprList(ctx);
    }

    @Override
    public T visitOneofexpr(lolcodeParser.OneofexprContext ctx) {
        return super.visitOneofexpr(ctx);
    }

    @Override
    public T visitLoopstat(lolcodeParser.LoopstatContext ctx) {
        return super.visitLoopstat(ctx);
    }

    @Override
    public T visitFunexpr(lolcodeParser.FunexprContext ctx) {
        return super.visitFunexpr(ctx);
    }

    @Override
    public T visitMinmaxexpr(lolcodeParser.MinmaxexprContext ctx) {
        return super.visitMinmaxexpr(ctx);
    }

    @Override
    public T visitModexpr(lolcodeParser.ModexprContext ctx) {
        return super.visitModexpr(ctx);
    }

    @Override
    public T visitBothofexpr(lolcodeParser.BothofexprContext ctx) {
        return super.visitBothofexpr(ctx);
    }

    @Override
    public T visitAddexpr(lolcodeParser.AddexprContext ctx) {
        TreeSumExpr sumExpr = new TreeSumExpr();
        List<lolcodeParser.ExprContext> list = ctx.expr();
        if (list.get(0) != null) {
            TreeExpression lhs = (TreeExpression) visit(list.get(0));
            sumExpr.setLhs(lhs);
        } else {
            log.severe("lhs of sumExpr failed to parse");
        }
        if (list.get(1) != null) {
            TreeExpression rhs = (TreeExpression) visit(list.get(1));
            sumExpr.setRhs(rhs);
        } else {
            log.severe("rhs of SumExpr failed to parse");
        }
        return (T) sumExpr;
    }

    @Override
    public T visitStat(lolcodeParser.StatContext ctx) {
        return super.visitStat(ctx);
    }

    @Override
    public T visitFunctionDecl(lolcodeParser.FunctionDeclContext ctx) {
        TreeFunction func = new TreeFunction();
        func.setName(ctx.ID().toString());
        if (ctx.formalParameters() == null) {
            log.log(Level.SEVERE, "function parameters failed to parse");
        } else {
            if (ctx.formalParameters().isEmpty()) {
                log.log(Level.INFO, "function " + func.getName() + "has no parameters");
            }
            for (lolcodeParser.FormalParameterContext param : ctx.formalParameters().formalParameter()) {
                func.addParam((TreeFunctionParameter) visit(param));
            }
        }
        if (ctx.block() == null) {
            log.log(Level.SEVERE, "function body failed to parse");
        } else {
            for (lolcodeParser.StatContext stat : ctx.block().stat()) {
                func.addStmt((TreeStatement) visit(stat));
            }
        }
        return (T) func;
    }

    @Override
    public T visitMain(lolcodeParser.MainContext ctx) {
        return super.visitMain(ctx);
    }

    @Override
    public T visitDivexpr(@NotNull lolcodeParser.DivexprContext ctx) {
        return super.visitDivexpr(ctx);
    }

    @Override
    public T visitRetpart(lolcodeParser.RetpartContext ctx) {
        return super.visitRetpart(ctx);
    }

    @Override
    public T visitFormalParameters(lolcodeParser.FormalParametersContext ctx) {

        return super.visitFormalParameters(ctx);
    }

    @Override
    public T visitSubexpr(@NotNull lolcodeParser.SubexprContext ctx) {
        return super.visitSubexpr(ctx);
    }

    @Override
    public T visitEitherexpr(lolcodeParser.EitherexprContext ctx) {
        return super.visitEitherexpr(ctx);
    }

    @Override
    public T visitEquexpr(lolcodeParser.EquexprContext ctx) {
        return super.visitEquexpr(ctx);
    }

    @Override
    public T visitMultexpr(lolcodeParser.MultexprContext ctx) {
        return super.visitMultexpr(ctx);
    }
}
