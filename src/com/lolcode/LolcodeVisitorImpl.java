package com.lolcode;

import com.lolcode.generator.LolAbstractValue;
import com.lolcode.generator.LolFunction;
import com.lolcode.generator.LolValue;

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


    @Override
    public T visitFuncall(lolcodeParser.FuncallContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFormalParameter(lolcodeParser.FormalParameterContext ctx) {
        LolValue tmp = new LolAbstractValue(ctx.ID().toString(), ctx.type().toString());
        return (T) tmp;
    }

    @Override
    public T visitVarDecl(lolcodeParser.VarDeclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitBlock(lolcodeParser.BlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitExpr(lolcodeParser.ExprContext ctx) {
        if (ctx.VALUE() != null) {
            try {
                int val = new Integer(ctx.VALUE().toString());
            } catch (NumberFormatException e) {
                try {
                    float val = new Float(ctx.VALUE().toString());
                } catch (NumberFormatException ex) {
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

    @Override
    public T visitAssstat(lolcodeParser.AssstatContext ctx) {
        LolValue lhs = currentFunction.getVarByName(ctx.expr(0).ID().toString());
        currentFunction.addVariable(lhs);
        LolValue rhs = (LolValue) visit(ctx.expr(1));
        assert (currentFunction.symbols.containsKey(rhs));

        return visitChildren(ctx);
    }

    @Override
    public T visitVisstat(lolcodeParser.VisstatContext ctx) {
        //do we printf here? https://github.com/thomaslee/llvm-demo/blob/master/main.cc http://tomlee.co/2012/11/calling-printf-via-the-llvm-3-1-cxx-api/
        //because printing stuff in llvm looks kinda sad :(
        //although i think it's makeable because we always print "%type\n" type = d|f|b or we print string\n
        //so we get file type and we can write funcs like generatePrintStr generatePrintInt or something, i dunno i drunk jk
        return visitChildren(ctx);
    }

    @Override
    public T visitNotexpr(lolcodeParser.NotexprContext ctx) {
        //to make things easier we can say we return 1 only if var is of "FAIL" dunno
        return visitChildren(ctx);
    }

    @Override
    public T visitCasestat(lolcodeParser.CasestatContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFile(lolcodeParser.FileContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitIfstat(lolcodeParser.IfstatContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitExprList(lolcodeParser.ExprListContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitLoopstat(lolcodeParser.LoopstatContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitOneofexpr(lolcodeParser.OneofexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFunexpr(lolcodeParser.FunexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitMinmaxexpr(lolcodeParser.MinmaxexprContext ctx) {
        // min or max, actually it is not supposed to matter when we pass left and right expression
        // until we get them both, and then we decide what %if llvm shit we put in
        // because minmax is done with IF clauses in VM's, right?

        //get lexpr, repxr
        if (ctx.getChild(0).getText().equals("BIGGR OF")) {
            return visitChildren(ctx);
        } else if (ctx.getChild(0).getText().equals("SMALLR OF")) {
            return visitChildren(ctx);
        } else {
            //not supposed to get here as usual
            return visitChildren(ctx);
        }
    }

    @Override
    public T visitModexpr(lolcodeParser.ModexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitBothofexpr(lolcodeParser.BothofexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitAddexpr(lolcodeParser.AddexprContext ctx) {
        LolValue lhs = (LolValue) visit(ctx.expr(1));
        LolValue rhs = (LolValue) visit(ctx.expr(2));
        LolValue tmp = new LolAbstractValue(String.valueOf(currentFunction.symbols.size() + 1), "FUCK_THIS_SHIT");
        currentFunction.addVariable(tmp);
        if (ctx.getChild(0).getText().equals("SUM OF")) {
            //add
            currentFunction.addAddInst(tmp, lhs, rhs);
            return (T) tmp;
        } else if (ctx.getChild(0).getText().equals("DIFF OF")) {
            //diff
            //i just copied Addexpr sum implementanion, none of that shit works btw
            currentFunction.addAddInst(tmp, lhs, rhs);
            return (T) tmp;
        } else {
            //we are not supposed to get here at all
            return visitChildren(ctx);
        }
    }

    @Override
    public T visitStat(lolcodeParser.StatContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFunctionDecl(lolcodeParser.FunctionDeclContext ctx) {
//        LolValue vars[] = new LolAbstractValue[ctx.formalParameters().getChildCount()/2];
        ArrayList<LolValue> vars = new ArrayList<>(ctx.formalParameters().getChildCount() / 2);
        for (int i = 0; i < ctx.formalParameters().getChildCount() / 2; ++i) {
            vars.add((LolValue) visit(ctx.formalParameters().getChild(2 * i)));
        }
        LolFunction func = new LolFunction(ctx.ID().toString(), vars);
        currentFunction = func;
        functions.add(func);
        return (T) func;
    }

    @Override
    public T visitFormalParameters(lolcodeParser.FormalParametersContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitEitherexpr(lolcodeParser.EitherexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitEquexpr(lolcodeParser.EquexprContext ctx) {
        //kinda same with minmax, where actual SAME or DIFFRNT matters only at the very end
        //also is type checking done by llvm? can we do %i32 3 equals %float 3.0 and will it blend?

        if (ctx.getChild(0).getText().equals("BOTH SAEM")) {
            return visitChildren(ctx);
        } else if (ctx.getChild(0).getText().equals("DIFFRINT")) {
            return visitChildren(ctx);
        } else {
            //as per usual never supposed to get here
            return visitChildren(ctx);
        }
    }

    @Override
    public T visitMultexpr(lolcodeParser.MultexprContext ctx) {
        System.out.println(ctx.getChild(3).getText());
        LolValue lhs = (LolValue) visit(ctx.getChild(1));
        LolValue rhs = (LolValue) visit(ctx.getChild(3));
        LolValue tmp = new LolAbstractValue(String.valueOf(currentFunction.symbols.size() + 1), "FUCK_THIS_SHIT");
        currentFunction.addVariable(tmp);
        if (ctx.getChild(0).getText().equals("PRODUKT OF")) {
            // multiplication
            //is it supposed to be that way?

            currentFunction.addMulInst(tmp, lhs, rhs);
            return (T) tmp;
        } else if (ctx.getChild(0).getText().equals("QUOSHUNT OF")) {
            //division
            //same
            currentFunction.addDivInst(tmp, lhs, rhs);
            return (T) tmp;
        } else {
            //some wrong shit, is it even possible to get here at all?
            return visitChildren(ctx);
        }
    }

    private LolFunction currentFunction;
    private ArrayList<LolFunction> functions;

}
