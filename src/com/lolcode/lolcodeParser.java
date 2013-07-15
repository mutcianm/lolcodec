// Generated from C:\Users\Niner\Desktop\LOLCODE\lolcode.g4 by ANTLR 4.0

package com.lolcode;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lolcodeParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WTF=2, WRK=3, MAEK=4, A=5, AN=6, BIGGROF=7, HAI=8, KTHXBYE=9, 
		WHILE=10, TIL=11, ORLY=12, YARLY=13, MEBBE=14, NOWAI=15, OIC=16, OMG=17, 
		OMGWTF=18, YARN=19, NUMBR=20, NUMBAR=21, TROOF=22, NOOB=23, ITZ=24, BOTHSAEM=25, 
		DIFFRINT=26, SMALLROF=27, PRODUKTOF=28, QUOSHUNTOF=29, MODOF=30, SUMOF=31, 
		DIFFOF=32, SMOOSH=33, UPPIN=34, NERFIN=35, IMINYR=36, IMOUTTAYR=37, ANYOF=38, 
		ONEOF=39, ALLOF=40, EITHEROF=41, BOTHOF=42, NOT=43, GTFO=44, YR=45, NYR=46, 
		HOWDUZ=47, IFUSAY=48, R=49, IHAS=50, MKAY=51, VISIBLE=52, GIMMEH=53, ID=54, 
		VALUE=55, INT=56, STRING=57, FLOAT=58, BOOL=59, ENDST=60, WS=61, SL_COMMENT=62;
	public static final String[] tokenNames = {
		"<INVALID>", "'FOUND YR'", "'WTF?'", "'WRK'", "'MAEK'", "'A'", "'AN'", 
		"'BIGGR OF'", "'HAI'", "'KTHXBYE'", "'WILE'", "'TIL'", "'ORLY'", "'YRLY'", 
		"'MEBBE'", "'NOWAI'", "'OIC'", "'OMG'", "'OMGWTF'", "'YARN'", "'NUMBR'", 
		"'NUMBAR'", "'TROOF'", "'NOOB'", "'ITZ'", "'BOTH SAEM'", "'DIFFRINT'", 
		"'SMALLR OF'", "'PRODUKT OF'", "'QUOSHUNT OF'", "'MOD OF'", "'SUM OF'", 
		"'DIFF OF'", "'SMOOSH'", "'UPPIN'", "'NERFIN'", "'IM IN YR'", "'IM OUTTA YR'", 
		"'ANY OF'", "'ONE OF'", "'ALL OF'", "'EITHER OF'", "'BOTH OF'", "'NOT'", 
		"'GTFO'", "'YR'", "'N YR'", "'HOW DUZ I'", "'IF U SAY SO'", "'R'", "'I HAS A'", 
		"'MKAY'", "'VISIBLE'", "'GIMMEH'", "ID", "VALUE", "INT", "STRING", "FLOAT", 
		"BOOL", "ENDST", "WS", "SL_COMMENT"
	};
	public static final int
		RULE_file = 0, RULE_main = 1, RULE_varDecl = 2, RULE_functionDecl = 3, 
		RULE_formalParameters = 4, RULE_formalParameter = 5, RULE_block = 6, RULE_stat = 7, 
		RULE_ifstat = 8, RULE_casestat = 9, RULE_loopstat = 10, RULE_assstat = 11, 
		RULE_funcall = 12, RULE_visstat = 13, RULE_gimstat = 14, RULE_expr = 15, 
		RULE_funexpr = 16, RULE_notexpr = 17, RULE_multexpr = 18, RULE_modexpr = 19, 
		RULE_addexpr = 20, RULE_minmaxexpr = 21, RULE_bothofexpr = 22, RULE_eitherexpr = 23, 
		RULE_oneofexpr = 24, RULE_equexpr = 25, RULE_exprList = 26, RULE_retpart = 27;
	public static final String[] ruleNames = {
		"file", "main", "varDecl", "functionDecl", "formalParameters", "formalParameter", 
		"block", "stat", "ifstat", "casestat", "loopstat", "assstat", "funcall", 
		"visstat", "gimstat", "expr", "funexpr", "notexpr", "multexpr", "modexpr", 
		"addexpr", "minmaxexpr", "bothofexpr", "eitherexpr", "oneofexpr", "equexpr", 
		"exprList", "retpart"
	};

	@Override
	public String getGrammarFileName() { return "lolcode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public lolcodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HOWDUZ) {
				{
				{
				setState(56); functionDecl();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62); main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(HAI);
			setState(65); match(ENDST);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << IHAS) | (1L << VISIBLE) | (1L << GIMMEH) | (1L << ID) | (1L << VALUE))) != 0)) {
				{
				{
				setState(66); stat();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72); match(KTHXBYE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lolcodeParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(IHAS);
			setState(75); match(ID);
			setState(78);
			_la = _input.LA(1);
			if (_la==ITZ) {
				{
				setState(76); match(ITZ);
				setState(77); expr();
				}
			}

			setState(80); match(ENDST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode ENDST(int i) {
			return getToken(lolcodeParser.ENDST, i);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public RetpartContext retpart() {
			return getRuleContext(RetpartContext.class,0);
		}
		public TerminalNode ID() { return getToken(lolcodeParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> ENDST() { return getTokens(lolcodeParser.ENDST); }
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(HOWDUZ);
			setState(83); match(ID);
			setState(85);
			_la = _input.LA(1);
			if (_la==YR) {
				{
				setState(84); formalParameters();
				}
			}

			setState(87); match(ENDST);
			setState(88); block();
			setState(89); retpart();
			setState(90); match(IFUSAY);
			setState(91); match(ENDST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(YR);
			setState(94); formalParameter();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NYR) {
				{
				{
				setState(95); match(NYR);
				setState(96); formalParameter();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lolcodeParser.ID, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << IHAS) | (1L << VISIBLE) | (1L << GIMMEH) | (1L << ID) | (1L << VALUE))) != 0)) {
				{
				{
				setState(104); stat();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public FuncallContext funcall() {
			return getRuleContext(FuncallContext.class,0);
		}
		public CasestatContext casestat() {
			return getRuleContext(CasestatContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public GimstatContext gimstat() {
			return getRuleContext(GimstatContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public VisstatContext visstat() {
			return getRuleContext(VisstatContext.class,0);
		}
		public AssstatContext assstat() {
			return getRuleContext(AssstatContext.class,0);
		}
		public LoopstatContext loopstat() {
			return getRuleContext(LoopstatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat);
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); varDecl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); ifstat();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112); casestat();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113); loopstat();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114); assstat();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(115); funcall();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(116); visstat();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(117); gimstat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ENDST(int i) {
			return getToken(lolcodeParser.ENDST, i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public List<TerminalNode> ENDST() { return getTokens(lolcodeParser.ENDST); }
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitIfstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); expr();
			setState(121); match(ENDST);
			setState(122); match(ORLY);
			setState(123); match(ENDST);
			setState(124); match(YARLY);
			setState(125); match(ENDST);
			setState(126); stat();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MEBBE) {
				{
				{
				setState(127); match(MEBBE);
				setState(128); expr();
				setState(129); match(ENDST);
				setState(130); stat();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			_la = _input.LA(1);
			if (_la==NOWAI) {
				{
				setState(137); match(NOWAI);
				setState(138); match(ENDST);
				setState(139); stat();
				}
			}

			setState(142); match(OIC);
			setState(143); match(ENDST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasestatContext extends ParserRuleContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ENDST(int i) {
			return getToken(lolcodeParser.ENDST, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(lolcodeParser.VALUE); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VALUE(int i) {
			return getToken(lolcodeParser.VALUE, i);
		}
		public List<TerminalNode> ENDST() { return getTokens(lolcodeParser.ENDST); }
		public CasestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casestat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitCasestat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasestatContext casestat() throws RecognitionException {
		CasestatContext _localctx = new CasestatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_casestat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); expr();
			setState(146); match(ENDST);
			setState(147); match(WTF);
			setState(148); match(ENDST);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OMG) {
				{
				{
				setState(149); match(OMG);
				setState(150); match(VALUE);
				setState(151); match(ENDST);
				setState(152); block();
				setState(155);
				_la = _input.LA(1);
				if (_la==GTFO) {
					{
					setState(153); match(GTFO);
					setState(154); match(ENDST);
					}
				}

				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			_la = _input.LA(1);
			if (_la==OMGWTF) {
				{
				setState(162); match(OMGWTF);
				setState(163); match(ENDST);
				setState(164); block();
				setState(167);
				_la = _input.LA(1);
				if (_la==GTFO) {
					{
					setState(165); match(GTFO);
					setState(166); match(ENDST);
					}
				}

				}
			}

			setState(171); match(OIC);
			setState(172); match(ENDST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopstatContext extends ParserRuleContext {
		public TerminalNode ENDST(int i) {
			return getToken(lolcodeParser.ENDST, i);
		}
		public TerminalNode ID(int i) {
			return getToken(lolcodeParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(lolcodeParser.ID); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ENDST() { return getTokens(lolcodeParser.ENDST); }
		public LoopstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopstat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitLoopstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopstatContext loopstat() throws RecognitionException {
		LoopstatContext _localctx = new LoopstatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loopstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(IMINYR);
			setState(175); match(ID);
			setState(181);
			_la = _input.LA(1);
			if (_la==UPPIN || _la==NERFIN) {
				{
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==UPPIN || _la==NERFIN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(177); match(YR);
				setState(178); match(ID);
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==WHILE || _la==TIL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(180); expr();
				}
			}

			setState(183); match(ENDST);
			setState(184); block();
			setState(187);
			_la = _input.LA(1);
			if (_la==GTFO) {
				{
				setState(185); match(GTFO);
				setState(186); match(ENDST);
				}
			}

			setState(189); match(IMOUTTAYR);
			setState(190); match(ID);
			setState(191); match(ENDST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssstatContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public AssstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assstat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitAssstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssstatContext assstat() throws RecognitionException {
		AssstatContext _localctx = new AssstatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); expr();
			setState(194); match(R);
			setState(195); expr();
			setState(196); match(ENDST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncallContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitFuncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncallContext funcall() throws RecognitionException {
		FuncallContext _localctx = new FuncallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisstatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public VisstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visstat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitVisstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisstatContext visstat() throws RecognitionException {
		VisstatContext _localctx = new VisstatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_visstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(VISIBLE);
			setState(201); expr();
			setState(202); match(ENDST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GimstatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lolcodeParser.ID, 0); }
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public GimstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gimstat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitGimstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GimstatContext gimstat() throws RecognitionException {
		GimstatContext _localctx = new GimstatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_gimstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(GIMMEH);
			setState(205); match(ID);
			setState(206); match(ENDST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public FunexprContext funexpr() {
			return getRuleContext(FunexprContext.class,0);
		}
		public MinmaxexprContext minmaxexpr() {
			return getRuleContext(MinmaxexprContext.class,0);
		}
		public ModexprContext modexpr() {
			return getRuleContext(ModexprContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(lolcodeParser.VALUE, 0); }
		public EitherexprContext eitherexpr() {
			return getRuleContext(EitherexprContext.class,0);
		}
		public TerminalNode ID() { return getToken(lolcodeParser.ID, 0); }
		public EquexprContext equexpr() {
			return getRuleContext(EquexprContext.class,0);
		}
		public BothofexprContext bothofexpr() {
			return getRuleContext(BothofexprContext.class,0);
		}
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public MultexprContext multexpr() {
			return getRuleContext(MultexprContext.class,0);
		}
		public NotexprContext notexpr() {
			return getRuleContext(NotexprContext.class,0);
		}
		public OneofexprContext oneofexpr() {
			return getRuleContext(OneofexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); funexpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209); notexpr();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210); multexpr();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211); modexpr();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212); addexpr();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213); minmaxexpr();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(214); bothofexpr();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(215); eitherexpr();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(216); oneofexpr();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(217); equexpr();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(218); match(ID);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(219); match(VALUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lolcodeParser.ID, 0); }
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitFunexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunexprContext funexpr() throws RecognitionException {
		FunexprContext _localctx = new FunexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(ID);
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(223); exprList();
				}
				break;
			}
			setState(226); match(ENDST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotexprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitNotexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotexprContext notexpr() throws RecognitionException {
		NotexprContext _localctx = new NotexprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_notexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(NOT);
			setState(229); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultexprContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public MultexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitMultexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultexprContext multexpr() throws RecognitionException {
		MultexprContext _localctx = new MultexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			switch (_input.LA(1)) {
			case PRODUKTOF:
				{
				setState(231); match(PRODUKTOF);
				setState(232); expr();
				setState(233); match(AN);
				setState(234); expr();
				}
				break;
			case QUOSHUNTOF:
				{
				setState(236); match(QUOSHUNTOF);
				setState(237); expr();
				setState(238); match(AN);
				setState(239); expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModexprContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ModexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitModexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModexprContext modexpr() throws RecognitionException {
		ModexprContext _localctx = new ModexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(MODOF);
			setState(244); expr();
			setState(245); match(AN);
			setState(246); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddexprContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitAddexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_addexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			switch (_input.LA(1)) {
			case SUMOF:
				{
				setState(248); match(SUMOF);
				setState(249); expr();
				setState(250); match(AN);
				setState(251); expr();
				}
				break;
			case DIFFOF:
				{
				setState(253); match(DIFFOF);
				setState(254); expr();
				setState(255); match(AN);
				setState(256); expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinmaxexprContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public MinmaxexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minmaxexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitMinmaxexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinmaxexprContext minmaxexpr() throws RecognitionException {
		MinmaxexprContext _localctx = new MinmaxexprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_minmaxexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			switch (_input.LA(1)) {
			case BIGGROF:
				{
				setState(260); match(BIGGROF);
				setState(261); expr();
				setState(262); match(AN);
				setState(263); expr();
				}
				break;
			case SMALLROF:
				{
				setState(265); match(SMALLROF);
				setState(266); expr();
				setState(267); match(AN);
				setState(268); expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BothofexprContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public BothofexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bothofexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitBothofexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BothofexprContext bothofexpr() throws RecognitionException {
		BothofexprContext _localctx = new BothofexprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bothofexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(BOTHOF);
			setState(273); expr();
			setState(274); match(AN);
			setState(275); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EitherexprContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public EitherexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eitherexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitEitherexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EitherexprContext eitherexpr() throws RecognitionException {
		EitherexprContext _localctx = new EitherexprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eitherexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(EITHEROF);
			setState(278); expr();
			setState(279); match(AN);
			setState(280); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OneofexprContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public OneofexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneofexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitOneofexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneofexprContext oneofexpr() throws RecognitionException {
		OneofexprContext _localctx = new OneofexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_oneofexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(ONEOF);
			setState(283); expr();
			setState(284); match(AN);
			setState(285); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquexprContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public EquexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitEquexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquexprContext equexpr() throws RecognitionException {
		EquexprContext _localctx = new EquexprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_equexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			switch (_input.LA(1)) {
			case BOTHSAEM:
				{
				setState(287); match(BOTHSAEM);
				setState(288); expr();
				setState(289); match(AN);
				setState(290); expr();
				}
				break;
			case DIFFRINT:
				{
				setState(292); match(DIFFRINT);
				setState(293); expr();
				setState(294); match(AN);
				setState(295); expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << ID) | (1L << VALUE))) != 0)) {
				{
				{
				setState(299); expr();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetpartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public RetpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retpart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitRetpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetpartContext retpart() throws RecognitionException {
		RetpartContext _localctx = new RetpartContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_retpart);
		try {
			setState(310);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305); match(1);
				setState(306); expr();
				setState(307); match(ENDST);
				}
				break;
			case GTFO:
				enterOuterAlt(_localctx, 2);
				{
				setState(309); match(GTFO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3@\u013b\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<"+
		"\n\2\f\2\16\2?\13\2\3\2\3\2\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\4Q\n\4\3\4\3\4\3\5\3\5\3\5\5\5X\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6d\n\6\f\6\16\6g\13\6\3\7\3\7\3\b\7\bl\n"+
		"\b\f\b\16\bo\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ty\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0087\n\n\f\n\16\n\u008a\13\n"+
		"\3\n\3\n\3\n\5\n\u008f\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u009e\n\13\7\13\u00a0\n\13\f\13\16\13\u00a3\13"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00aa\n\13\5\13\u00ac\n\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b8\n\f\3\f\3\f\3\f\3\f\5\f\u00be"+
		"\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00df\n\21\3\22\3\22\5\22\u00e3\n\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f4"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0105\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0111\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u012c\n\33\3\34\7\34\u012f\n\34\f\34\16\34\u0132\13\34\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0139\n\35\3\35\2\36\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\4\3$%\3\f\r\u0145\2=\3\2\2\2\4"+
		"B\3\2\2\2\6L\3\2\2\2\bT\3\2\2\2\n_\3\2\2\2\fh\3\2\2\2\16m\3\2\2\2\20x"+
		"\3\2\2\2\22z\3\2\2\2\24\u0093\3\2\2\2\26\u00b0\3\2\2\2\30\u00c3\3\2\2"+
		"\2\32\u00c8\3\2\2\2\34\u00ca\3\2\2\2\36\u00ce\3\2\2\2 \u00de\3\2\2\2\""+
		"\u00e0\3\2\2\2$\u00e6\3\2\2\2&\u00f3\3\2\2\2(\u00f5\3\2\2\2*\u0104\3\2"+
		"\2\2,\u0110\3\2\2\2.\u0112\3\2\2\2\60\u0117\3\2\2\2\62\u011c\3\2\2\2\64"+
		"\u012b\3\2\2\2\66\u0130\3\2\2\28\u0138\3\2\2\2:<\5\b\5\2;:\3\2\2\2<?\3"+
		"\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\5\4\3\2A\3\3\2\2\2BC"+
		"\7\n\2\2CG\7>\2\2DF\5\20\t\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H"+
		"J\3\2\2\2IG\3\2\2\2JK\7\13\2\2K\5\3\2\2\2LM\7\64\2\2MP\78\2\2NO\7\32\2"+
		"\2OQ\5 \21\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7>\2\2S\7\3\2\2\2TU\7\61"+
		"\2\2UW\78\2\2VX\5\n\6\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7>\2\2Z[\5\16"+
		"\b\2[\\\58\35\2\\]\7\62\2\2]^\7>\2\2^\t\3\2\2\2_`\7/\2\2`e\5\f\7\2ab\7"+
		"\60\2\2bd\5\f\7\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\13\3\2\2\2"+
		"ge\3\2\2\2hi\78\2\2i\r\3\2\2\2jl\5\20\t\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2n\17\3\2\2\2om\3\2\2\2py\5\6\4\2qy\5\22\n\2ry\5\24\13\2sy"+
		"\5\26\f\2ty\5\30\r\2uy\5\32\16\2vy\5\34\17\2wy\5\36\20\2xp\3\2\2\2xq\3"+
		"\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\21"+
		"\3\2\2\2z{\5 \21\2{|\7>\2\2|}\7\16\2\2}~\7>\2\2~\177\7\17\2\2\177\u0080"+
		"\7>\2\2\u0080\u0088\5\20\t\2\u0081\u0082\7\20\2\2\u0082\u0083\5 \21\2"+
		"\u0083\u0084\7>\2\2\u0084\u0085\5\20\t\2\u0085\u0087\3\2\2\2\u0086\u0081"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008e\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\21\2\2\u008c\u008d\7"+
		">\2\2\u008d\u008f\5\20\t\2\u008e\u008b\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\7\22\2\2\u0091\u0092\7>\2\2\u0092\23\3\2\2"+
		"\2\u0093\u0094\5 \21\2\u0094\u0095\7>\2\2\u0095\u0096\7\4\2\2\u0096\u00a1"+
		"\7>\2\2\u0097\u0098\7\23\2\2\u0098\u0099\79\2\2\u0099\u009a\7>\2\2\u009a"+
		"\u009d\5\16\b\2\u009b\u009c\7.\2\2\u009c\u009e\7>\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u0097\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00ab\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\24\2\2\u00a5\u00a6\7>\2\2\u00a6"+
		"\u00a9\5\16\b\2\u00a7\u00a8\7.\2\2\u00a8\u00aa\7>\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\22\2\2\u00ae\u00af\7"+
		">\2\2\u00af\25\3\2\2\2\u00b0\u00b1\7&\2\2\u00b1\u00b7\78\2\2\u00b2\u00b3"+
		"\t\2\2\2\u00b3\u00b4\7/\2\2\u00b4\u00b5\78\2\2\u00b5\u00b6\t\3\2\2\u00b6"+
		"\u00b8\5 \21\2\u00b7\u00b2\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\7>\2\2\u00ba\u00bd\5\16\b\2\u00bb\u00bc\7.\2\2\u00bc"+
		"\u00be\7>\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\7\'\2\2\u00c0\u00c1\78\2\2\u00c1\u00c2\7>\2\2\u00c2\27"+
		"\3\2\2\2\u00c3\u00c4\5 \21\2\u00c4\u00c5\7\63\2\2\u00c5\u00c6\5 \21\2"+
		"\u00c6\u00c7\7>\2\2\u00c7\31\3\2\2\2\u00c8\u00c9\5 \21\2\u00c9\33\3\2"+
		"\2\2\u00ca\u00cb\7\66\2\2\u00cb\u00cc\5 \21\2\u00cc\u00cd\7>\2\2\u00cd"+
		"\35\3\2\2\2\u00ce\u00cf\7\67\2\2\u00cf\u00d0\78\2\2\u00d0\u00d1\7>\2\2"+
		"\u00d1\37\3\2\2\2\u00d2\u00df\5\"\22\2\u00d3\u00df\5$\23\2\u00d4\u00df"+
		"\5&\24\2\u00d5\u00df\5(\25\2\u00d6\u00df\5*\26\2\u00d7\u00df\5,\27\2\u00d8"+
		"\u00df\5.\30\2\u00d9\u00df\5\60\31\2\u00da\u00df\5\62\32\2\u00db\u00df"+
		"\5\64\33\2\u00dc\u00df\78\2\2\u00dd\u00df\79\2\2\u00de\u00d2\3\2\2\2\u00de"+
		"\u00d3\3\2\2\2\u00de\u00d4\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d6\3\2"+
		"\2\2\u00de\u00d7\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00d9\3\2\2\2\u00de"+
		"\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2"+
		"\2\2\u00df!\3\2\2\2\u00e0\u00e2\78\2\2\u00e1\u00e3\5\66\34\2\u00e2\u00e1"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5"+
		"#\3\2\2\2\u00e6\u00e7\7-\2\2\u00e7\u00e8\5 \21\2\u00e8%\3\2\2\2\u00e9"+
		"\u00ea\7\36\2\2\u00ea\u00eb\5 \21\2\u00eb\u00ec\7\b\2\2\u00ec\u00ed\5"+
		" \21\2\u00ed\u00f4\3\2\2\2\u00ee\u00ef\7\37\2\2\u00ef\u00f0\5 \21\2\u00f0"+
		"\u00f1\7\b\2\2\u00f1\u00f2\5 \21\2\u00f2\u00f4\3\2\2\2\u00f3\u00e9\3\2"+
		"\2\2\u00f3\u00ee\3\2\2\2\u00f4\'\3\2\2\2\u00f5\u00f6\7 \2\2\u00f6\u00f7"+
		"\5 \21\2\u00f7\u00f8\7\b\2\2\u00f8\u00f9\5 \21\2\u00f9)\3\2\2\2\u00fa"+
		"\u00fb\7!\2\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\7\b\2\2\u00fd\u00fe\5 \21"+
		"\2\u00fe\u0105\3\2\2\2\u00ff\u0100\7\"\2\2\u0100\u0101\5 \21\2\u0101\u0102"+
		"\7\b\2\2\u0102\u0103\5 \21\2\u0103\u0105\3\2\2\2\u0104\u00fa\3\2\2\2\u0104"+
		"\u00ff\3\2\2\2\u0105+\3\2\2\2\u0106\u0107\7\t\2\2\u0107\u0108\5 \21\2"+
		"\u0108\u0109\7\b\2\2\u0109\u010a\5 \21\2\u010a\u0111\3\2\2\2\u010b\u010c"+
		"\7\35\2\2\u010c\u010d\5 \21\2\u010d\u010e\7\b\2\2\u010e\u010f\5 \21\2"+
		"\u010f\u0111\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u010b\3\2\2\2\u0111-\3"+
		"\2\2\2\u0112\u0113\7,\2\2\u0113\u0114\5 \21\2\u0114\u0115\7\b\2\2\u0115"+
		"\u0116\5 \21\2\u0116/\3\2\2\2\u0117\u0118\7+\2\2\u0118\u0119\5 \21\2\u0119"+
		"\u011a\7\b\2\2\u011a\u011b\5 \21\2\u011b\61\3\2\2\2\u011c\u011d\7)\2\2"+
		"\u011d\u011e\5 \21\2\u011e\u011f\7\b\2\2\u011f\u0120\5 \21\2\u0120\63"+
		"\3\2\2\2\u0121\u0122\7\33\2\2\u0122\u0123\5 \21\2\u0123\u0124\7\b\2\2"+
		"\u0124\u0125\5 \21\2\u0125\u012c\3\2\2\2\u0126\u0127\7\34\2\2\u0127\u0128"+
		"\5 \21\2\u0128\u0129\7\b\2\2\u0129\u012a\5 \21\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0121\3\2\2\2\u012b\u0126\3\2\2\2\u012c\65\3\2\2\2\u012d\u012f\5 \21"+
		"\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\67\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\3\2\2\u0134"+
		"\u0135\5 \21\2\u0135\u0136\7>\2\2\u0136\u0139\3\2\2\2\u0137\u0139\7.\2"+
		"\2\u0138\u0133\3\2\2\2\u0138\u0137\3\2\2\2\u01399\3\2\2\2\31=GPWemx\u0088"+
		"\u008e\u009d\u00a1\u00a9\u00ab\u00b7\u00bd\u00de\u00e2\u00f3\u0104\u0110"+
		"\u012b\u0130\u0138";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}