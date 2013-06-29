package com.lolcode;

import com.lolcode.generator.LolAbstractVariable;
import com.lolcode.generator.LolFunction;
import com.lolcode.generator.LolVariable;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 6/28/13
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 * DEDOZ DOES NOT WANT ME TO WRITE BAD WORDS
 * TEST IDEA COMMIT
 */
public class LolcodeVisitorImpl<T> extends lolcodeBaseVisitor<T> {



    @Override public T visitFuncall(lolcodeParser.FuncallContext ctx) { return visitChildren(ctx); }

    @Override public T visitFormalParameter(lolcodeParser.FormalParameterContext ctx) {
        LolVariable tmp = new LolAbstractVariable(ctx.ID().toString(), ctx.type().toString());
        return (T)tmp;
    }

    @Override public T visitVarDecl(lolcodeParser.VarDeclContext ctx) { return visitChildren(ctx); }

    @Override public T visitBlock(lolcodeParser.BlockContext ctx) { return visitChildren(ctx); }

    @Override public T visitExpr(lolcodeParser.ExprContext ctx) {
        if(ctx.VALUE() != null){
            try {
                int val = new Integer(ctx.VALUE().toString());
            } catch (NumberFormatException e){
                try{
                    float val = new Float(ctx.VALUE().toString());
                } catch (NumberFormatException ex){
                    boolean val;
                    String s = ctx.VALUE().toString();
                    if (s.equals("WIN")) {
                        val = true;

                    } else if (s.equals("FAIL")) {
                        val = false;

                    } else {
                        String value = ctx.VALUE().toString();
                    }
                }
            }
        }
        return visitChildren(ctx);
    }

    @Override public T visitAssstat(lolcodeParser.AssstatContext ctx) {
        LolVariable lhs = currentFunction.getVarByName(ctx.expr(0).ID().toString());
        currentFunction.addVariable(lhs);
        LolVariable rhs = (LolVariable)visit(ctx.expr(1));
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

    @Override public T visitAddexpr(lolcodeParser.AddexprContext ctx) {
        LolVariable lhs = (LolVariable)visit(ctx.expr(1));
        LolVariable rhs = (LolVariable)visit(ctx.expr(2));
        LolVariable tmp = new LolAbstractVariable(String.valueOf(currentFunction.symbols.size()+1), "FUCK_THIS_SHIT");
        currentFunction.addVariable(tmp);
        currentFunction.addAddInst(tmp, lhs, rhs);
        return (T)tmp;
    }

    @Override public T visitStat(lolcodeParser.StatContext ctx) { return visitChildren(ctx); }

    @Override public T visitFunctionDecl(lolcodeParser.FunctionDeclContext ctx) {
//        LolVariable vars[] = new LolAbstractVariable[ctx.formalParameters().getChildCount()/2];
        ArrayList<LolVariable> vars = new ArrayList<LolVariable>(ctx.formalParameters().getChildCount()/2);
        for(int i = 0; i < ctx.formalParameters().getChildCount()/2; ++i){
            vars.add((LolVariable)visit(ctx.formalParameters().getChild(2*i)));
        }
        LolFunction func = new LolFunction(ctx.ID().toString(), vars);
        currentFunction = func;
        functions.add(func);
        return (T)func;
    }

    @Override public T visitFormalParameters(lolcodeParser.FormalParametersContext ctx) { return visitChildren(ctx); }

    @Override public T visitEitherexpr(lolcodeParser.EitherexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitEquexpr(lolcodeParser.EquexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitMultexpr(lolcodeParser.MultexprContext ctx) { return visitChildren(ctx); }

    private LolFunction currentFunction;
    private ArrayList<LolFunction> functions;

}
