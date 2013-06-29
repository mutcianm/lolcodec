package com.lolcode;

import com.lolcode.generator.LolAbstractVariable;
import com.lolcode.generator.LolFunction;
import com.lolcode.generator.LolVariable;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 6/28/13
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class LolcodeVisitorImpl<T> extends lolcodeBaseVisitor<T> {

    @Override public T visitFuncall(lolcodeParser.FuncallContext ctx) { return visitChildren(ctx); }

    @Override public T visitFormalParameter(lolcodeParser.FormalParameterContext ctx) { return visitChildren(ctx); }

    @Override public T visitVarDecl(lolcodeParser.VarDeclContext ctx) { return visitChildren(ctx); }

    @Override public T visitBlock(lolcodeParser.BlockContext ctx) { return visitChildren(ctx); }

    @Override public T visitExpr(lolcodeParser.ExprContext ctx) { return visitChildren(ctx); }

    @Override public T visitAssstat(lolcodeParser.AssstatContext ctx) {
        LolVariable lhs = new LolAbstractVariable(ctx.expr(0).ID().getText());
        currentFunction.addVariable(lhs);
        LolVariable rhs = (LolVariable)visit(ctx.expr(2));
        assert(currentFunction.symbols.containsKey(rhs));

        return visitChildren(ctx);
    }

    @Override public T visitVisstat(lolcodeParser.VisstatContext ctx) { return visitChildren(ctx); }

    @Override public T visitNotexpr(lolcodeParser.NotexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitCasestat(lolcodeParser.CasestatContext ctx) { return visitChildren(ctx); }

    @Override public T visitFile(lolcodeParser.FileContext ctx) { return visitChildren(ctx); }

    @Override public T visitIfstat(lolcodeParser.IfstatContext ctx) { return visitChildren(ctx); }

    @Override public T visitExprList(lolcodeParser.ExprListContext ctx) { return visitChildren(ctx); }

    @Override public T visitLoopstat(lolcodeParser.LoopstatContext ctx) { return visitChildren(ctx); }

    @Override public T visitOneofexpr(lolcodeParser.OneofexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitFunexpr(lolcodeParser.FunexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitMinmaxexpr(lolcodeParser.MinmaxexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitModexpr(lolcodeParser.ModexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitBothofexpr(lolcodeParser.BothofexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitAddexpr(lolcodeParser.AddexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitStat(lolcodeParser.StatContext ctx) { return visitChildren(ctx); }

    @Override public T visitFunctionDecl(lolcodeParser.FunctionDeclContext ctx) { return visitChildren(ctx); }

    @Override public T visitFormalParameters(lolcodeParser.FormalParametersContext ctx) { return visitChildren(ctx); }

    @Override public T visitEitherexpr(lolcodeParser.EitherexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitEquexpr(lolcodeParser.EquexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitMultexpr(lolcodeParser.MultexprContext ctx) { return visitChildren(ctx); }

    private LolFunction currentFunction;

}
