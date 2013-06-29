// Generated from /home/miha/Downloads/skype/lolcode.g4 by ANTLR 4.0
package com.lolcode;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface lolcodeVisitor<T> extends ParseTreeVisitor<T> {
	T visitFuncall(lolcodeParser.FuncallContext ctx);

	T visitFormalParameter(lolcodeParser.FormalParameterContext ctx);

	T visitVarDecl(lolcodeParser.VarDeclContext ctx);

	T visitBlock(lolcodeParser.BlockContext ctx);

	T visitExpr(lolcodeParser.ExprContext ctx);

	T visitAssstat(lolcodeParser.AssstatContext ctx);

	T visitVisstat(lolcodeParser.VisstatContext ctx);

	T visitNotexpr(lolcodeParser.NotexprContext ctx);

	T visitCasestat(lolcodeParser.CasestatContext ctx);

	T visitFile(lolcodeParser.FileContext ctx);

	T visitIfstat(lolcodeParser.IfstatContext ctx);

	T visitExprList(lolcodeParser.ExprListContext ctx);

	T visitLoopstat(lolcodeParser.LoopstatContext ctx);

	T visitOneofexpr(lolcodeParser.OneofexprContext ctx);

	T visitFunexpr(lolcodeParser.FunexprContext ctx);

	T visitMinmaxexpr(lolcodeParser.MinmaxexprContext ctx);

	T visitModexpr(lolcodeParser.ModexprContext ctx);

	T visitBothofexpr(lolcodeParser.BothofexprContext ctx);

	T visitAddexpr(lolcodeParser.AddexprContext ctx);

	T visitStat(lolcodeParser.StatContext ctx);

	T visitFunctionDecl(lolcodeParser.FunctionDeclContext ctx);

	T visitMain(lolcodeParser.MainContext ctx);

	T visitFormalParameters(lolcodeParser.FormalParametersContext ctx);

	T visitEitherexpr(lolcodeParser.EitherexprContext ctx);

	T visitEquexpr(lolcodeParser.EquexprContext ctx);

	T visitMultexpr(lolcodeParser.MultexprContext ctx);
}