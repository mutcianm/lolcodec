package com.lolcode.tree;

import com.lolcode.lolcodeBaseVisitor;
import com.lolcode.lolcodeParser;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/16/13
 * Time: 4:43 PM
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
    public T visitFormalParameter(lolcodeParser.FormalParameterContext ctx) {
        TreeFunctionParameter param = new TreeFunctionParameter();
        param.setName(ctx.ID().toString());
        return (T) param;
//        return super.visitFormalParameter(ctx);
    }

    @Override
    public T visitVarDecl(lolcodeParser.VarDeclContext ctx) {
        TreeVariable variable = new TreeVariable();
        variable.setName(ctx.ID().toString());
        if (ctx.expr() != null) {
            variable.setValue((TreeValue) visit(ctx.expr()));
        } else {
            log.info("Variable initializer failed to parse");
        }
        return (T) variable;
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
        return super.visitExpr(ctx);
    }

    @Override
    public T visitAssstat(lolcodeParser.AssstatContext ctx) {
        return super.visitAssstat(ctx);
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
        return super.visitFile(ctx);
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
        return super.visitAddexpr(ctx);
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
    public T visitRetpart(lolcodeParser.RetpartContext ctx) {
        return super.visitRetpart(ctx);
    }

    @Override
    public T visitFormalParameters(lolcodeParser.FormalParametersContext ctx) {

        return super.visitFormalParameters(ctx);
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
