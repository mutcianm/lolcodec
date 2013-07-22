// Generated from lolcode.g4 by ANTLR 4.1

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
		WTF=1, WRK=2, MAEK=3, A=4, AN=5, BIGGROF=6, HAI=7, KTHXBYE=8, WHILE=9, 
		TIL=10, ORLY=11, YARLY=12, MEBBE=13, NOWAI=14, OIC=15, OMG=16, OMGWTF=17, 
		YARN=18, NUMBR=19, NUMBAR=20, TROOF=21, NOOB=22, ITZ=23, BOTHSAEM=24, 
		DIFFRINT=25, SMALLROF=26, PRODUKTOF=27, QUOSHUNTOF=28, MODOF=29, SUMOF=30, 
		DIFFOF=31, SMOOSH=32, UPPIN=33, NERFIN=34, IMINYR=35, IMOUTTAYR=36, ANYOF=37, 
		ONEOF=38, ALLOF=39, EITHEROF=40, BOTHOF=41, NOT=42, GTFO=43, YR=44, NYR=45, 
		HOWDUZ=46, IFUSAY=47, R=48, IHAS=49, MKAY=50, VISIBLE=51, GIMMEH=52, FOUNDYR=53, 
		INT=54, STRING=55, FLOAT=56, BOOL=57, ID=58, ENDST=59, WS=60, SL_COMMENT=61;
	public static final String[] tokenNames = {
		"<INVALID>", "'WTF?'", "'WRK'", "'MAEK'", "'A'", "'AN'", "'BIGGR OF'", 
		"'HAI'", "'KTHXBYE'", "'WILE'", "'TIL'", "'ORLY'", "'YRLY'", "'MEBBE'", 
		"'NOWAI'", "'OIC'", "'OMG'", "'OMGWTF'", "'YARN'", "'NUMBR'", "'NUMBAR'", 
		"'TROOF'", "'NOOB'", "'ITZ'", "'BOTH SAEM'", "'DIFFRINT'", "'SMALLR OF'", 
		"'PRODUKT OF'", "'QUOSHUNT OF'", "'MOD OF'", "'SUM OF'", "'DIFF OF'", 
		"'SMOOSH'", "'UPPIN'", "'NERFIN'", "'IM IN YR'", "'IM OUTTA YR'", "'ANY OF'", 
		"'ONE OF'", "'ALL OF'", "'EITHER OF'", "'BOTH OF'", "'NOT'", "'GTFO'", 
		"'YR'", "'N YR'", "'HOW DUZ I'", "'IF U SAY SO'", "'R'", "'I HAS A'", 
		"'MKAY'", "'VISIBLE'", "'GIMMEH'", "'FOUND YR'", "INT", "STRING", "FLOAT", 
		"BOOL", "ID", "ENDST", "WS", "SL_COMMENT"
	};
	public static final int
		RULE_file = 0, RULE_main = 1, RULE_varDecl = 2, RULE_functionDecl = 3, 
		RULE_formalParameters = 4, RULE_formalParameter = 5, RULE_block = 6, RULE_stat = 7, 
		RULE_ifstat = 8, RULE_casestat = 9, RULE_caseblock = 10, RULE_loopstat = 11, 
		RULE_assstat = 12, RULE_funcall = 13, RULE_visstat = 14, RULE_gimstat = 15, 
		RULE_expr = 16, RULE_funexpr = 17, RULE_notexpr = 18, RULE_multexpr = 19, 
		RULE_divexpr = 20, RULE_modexpr = 21, RULE_addexpr = 22, RULE_subexpr = 23, 
		RULE_maxexpr = 24, RULE_minexpr = 25, RULE_bothofexpr = 26, RULE_eitherexpr = 27, 
		RULE_oneofexpr = 28, RULE_equexpr = 29, RULE_nequexpr = 30, RULE_exprList = 31, 
		RULE_retpart = 32, RULE_value = 33;
	public static final String[] ruleNames = {
		"file", "main", "varDecl", "functionDecl", "formalParameters", "formalParameter", 
		"block", "stat", "ifstat", "casestat", "caseblock", "loopstat", "assstat", 
		"funcall", "visstat", "gimstat", "expr", "funexpr", "notexpr", "multexpr", 
		"divexpr", "modexpr", "addexpr", "subexpr", "maxexpr", "minexpr", "bothofexpr", 
		"eitherexpr", "oneofexpr", "equexpr", "nequexpr", "exprList", "retpart", 
		"value"
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HOWDUZ) {
				{
				{
				setState(68); functionDecl();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74); main();
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
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
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
			setState(76); match(HAI);
			setState(77); match(ENDST);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << GTFO) | (1L << IHAS) | (1L << VISIBLE) | (1L << GIMMEH) | (1L << FOUNDYR) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(78); stat();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84); match(KTHXBYE);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public TerminalNode ID() { return getToken(lolcodeParser.ID, 0); }
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
			setState(86); match(IHAS);
			setState(87); match(ID);
			setState(90);
			_la = _input.LA(1);
			if (_la==ITZ) {
				{
				setState(88); match(ITZ);
				setState(89); expr();
				}
			}

			setState(92); match(ENDST);
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
		public List<TerminalNode> ENDST() { return getTokens(lolcodeParser.ENDST); }
		public TerminalNode ID() { return getToken(lolcodeParser.ID, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
			setState(94); match(HOWDUZ);
			setState(95); match(ID);
			setState(97);
			_la = _input.LA(1);
			if (_la==YR) {
				{
				setState(96); formalParameters();
				}
			}

			setState(99); match(ENDST);
			setState(100); block();
			setState(101); match(IFUSAY);
			setState(102); match(ENDST);
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
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
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
			setState(104); match(YR);
			setState(105); formalParameter();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NYR) {
				{
				{
				setState(106); match(NYR);
				setState(107); formalParameter();
				}
				}
				setState(112);
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
			setState(113); match(ID);
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
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << GTFO) | (1L << IHAS) | (1L << VISIBLE) | (1L << GIMMEH) | (1L << FOUNDYR) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(115); stat();
				}
				}
				setState(120);
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
		public RetpartContext retpart() {
			return getRuleContext(RetpartContext.class,0);
		}
		public GimstatContext gimstat() {
			return getRuleContext(GimstatContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public VisstatContext visstat() {
			return getRuleContext(VisstatContext.class,0);
		}
		public CasestatContext casestat() {
			return getRuleContext(CasestatContext.class,0);
		}
		public FuncallContext funcall() {
			return getRuleContext(FuncallContext.class,0);
		}
		public LoopstatContext loopstat() {
			return getRuleContext(LoopstatContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public AssstatContext assstat() {
			return getRuleContext(AssstatContext.class,0);
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
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); varDecl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); ifstat();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123); casestat();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124); loopstat();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125); assstat();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126); funcall();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(127); retpart();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(128); visstat();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(129); gimstat();
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
		public TerminalNode NOWAI() { return getToken(lolcodeParser.NOWAI, 0); }
		public TerminalNode ENDST(int i) {
			return getToken(lolcodeParser.ENDST, i);
		}
		public List<TerminalNode> ENDST() { return getTokens(lolcodeParser.ENDST); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> MEBBE() { return getTokens(lolcodeParser.MEBBE); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode MEBBE(int i) {
			return getToken(lolcodeParser.MEBBE, i);
		}
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
			setState(132); expr();
			setState(133); match(ENDST);
			setState(134); match(ORLY);
			setState(135); match(ENDST);
			setState(136); match(YARLY);
			setState(137); match(ENDST);
			setState(138); block();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MEBBE) {
				{
				{
				setState(139); match(MEBBE);
				setState(140); expr();
				setState(141); match(ENDST);
				setState(142); block();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			_la = _input.LA(1);
			if (_la==NOWAI) {
				{
				setState(149); match(NOWAI);
				setState(150); match(ENDST);
				setState(151); block();
				}
			}

			setState(154); match(OIC);
			setState(155); match(ENDST);
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
		public List<CaseblockContext> caseblock() {
			return getRuleContexts(CaseblockContext.class);
		}
		public TerminalNode ENDST(int i) {
			return getToken(lolcodeParser.ENDST, i);
		}
		public List<TerminalNode> ENDST() { return getTokens(lolcodeParser.ENDST); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OMGWTF() { return getToken(lolcodeParser.OMGWTF, 0); }
		public CaseblockContext caseblock(int i) {
			return getRuleContext(CaseblockContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
			setState(157); expr();
			setState(158); match(ENDST);
			setState(159); match(WTF);
			setState(160); match(ENDST);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OMG) {
				{
				{
				setState(161); caseblock();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			_la = _input.LA(1);
			if (_la==OMGWTF) {
				{
				setState(167); match(OMGWTF);
				setState(168); match(ENDST);
				setState(169); block();
				}
			}

			setState(172); match(OIC);
			setState(173); match(ENDST);
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

	public static class CaseblockContext extends ParserRuleContext {
		public TerminalNode ENDST(int i) {
			return getToken(lolcodeParser.ENDST, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> ENDST() { return getTokens(lolcodeParser.ENDST); }
		public TerminalNode OMG() { return getToken(lolcodeParser.OMG, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitCaseblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseblockContext caseblock() throws RecognitionException {
		CaseblockContext _localctx = new CaseblockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_caseblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(OMG);
			setState(176); value();
			setState(177); match(ENDST);
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(178); block();
				}
				break;
			}
			setState(182);
			_la = _input.LA(1);
			if (_la==ENDST) {
				{
				setState(181); match(ENDST);
				}
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

	public static class LoopstatContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(lolcodeParser.WHILE, 0); }
		public TerminalNode ENDST(int i) {
			return getToken(lolcodeParser.ENDST, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ENDST() { return getTokens(lolcodeParser.ENDST); }
		public List<TerminalNode> ID() { return getTokens(lolcodeParser.ID); }
		public TerminalNode NERFIN() { return getToken(lolcodeParser.NERFIN, 0); }
		public TerminalNode UPPIN() { return getToken(lolcodeParser.UPPIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TIL() { return getToken(lolcodeParser.TIL, 0); }
		public TerminalNode ID(int i) {
			return getToken(lolcodeParser.ID, i);
		}
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
		enterRule(_localctx, 22, RULE_loopstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(IMINYR);
			setState(185); match(ID);
			setState(191);
			_la = _input.LA(1);
			if (_la==UPPIN || _la==NERFIN) {
				{
				setState(186);
				_la = _input.LA(1);
				if ( !(_la==UPPIN || _la==NERFIN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(187); match(YR);
				setState(188); match(ID);
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==WHILE || _la==TIL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(190); expr();
				}
			}

			setState(193); match(ENDST);
			setState(194); block();
			setState(195); match(IMOUTTAYR);
			setState(196); match(ID);
			setState(197); match(ENDST);
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
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(lolcodeParser.ID, 0); }
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
		enterRule(_localctx, 24, RULE_assstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(ID);
			setState(200); match(R);
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
		enterRule(_localctx, 26, RULE_funcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); expr();
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
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_visstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(VISIBLE);
			setState(207); expr();
			setState(208); match(ENDST);
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
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public TerminalNode ID() { return getToken(lolcodeParser.ID, 0); }
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
		enterRule(_localctx, 30, RULE_gimstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(GIMMEH);
			setState(211); match(ID);
			setState(212); match(ENDST);
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
		public NequexprContext nequexpr() {
			return getRuleContext(NequexprContext.class,0);
		}
		public SubexprContext subexpr() {
			return getRuleContext(SubexprContext.class,0);
		}
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public OneofexprContext oneofexpr() {
			return getRuleContext(OneofexprContext.class,0);
		}
		public TerminalNode ID() { return getToken(lolcodeParser.ID, 0); }
		public FunexprContext funexpr() {
			return getRuleContext(FunexprContext.class,0);
		}
		public DivexprContext divexpr() {
			return getRuleContext(DivexprContext.class,0);
		}
		public MaxexprContext maxexpr() {
			return getRuleContext(MaxexprContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MinexprContext minexpr() {
			return getRuleContext(MinexprContext.class,0);
		}
		public BothofexprContext bothofexpr() {
			return getRuleContext(BothofexprContext.class,0);
		}
		public ModexprContext modexpr() {
			return getRuleContext(ModexprContext.class,0);
		}
		public EquexprContext equexpr() {
			return getRuleContext(EquexprContext.class,0);
		}
		public EitherexprContext eitherexpr() {
			return getRuleContext(EitherexprContext.class,0);
		}
		public MultexprContext multexpr() {
			return getRuleContext(MultexprContext.class,0);
		}
		public NotexprContext notexpr() {
			return getRuleContext(NotexprContext.class,0);
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
		enterRule(_localctx, 32, RULE_expr);
		try {
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); funexpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); notexpr();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216); multexpr();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217); divexpr();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(218); modexpr();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(219); addexpr();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(220); subexpr();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(221); maxexpr();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(222); minexpr();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(223); bothofexpr();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(224); eitherexpr();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(225); oneofexpr();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(226); equexpr();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(227); nequexpr();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(228); match(ID);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(229); value();
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
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public TerminalNode MKAY() { return getToken(lolcodeParser.MKAY, 0); }
		public TerminalNode ID() { return getToken(lolcodeParser.ID, 0); }
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
		enterRule(_localctx, 34, RULE_funexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); match(ID);
			setState(234);
			_la = _input.LA(1);
			if (_la==YR) {
				{
				setState(233); exprList();
				}
			}

			setState(236); match(MKAY);
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(237); match(ENDST);
				}
				break;
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
		enterRule(_localctx, 36, RULE_notexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(NOT);
			setState(241); expr();
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 38, RULE_multexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(PRODUKTOF);
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

	public static class DivexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitDivexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivexprContext divexpr() throws RecognitionException {
		DivexprContext _localctx = new DivexprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_divexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(QUOSHUNTOF);
			setState(249); expr();
			setState(250); match(AN);
			setState(251); expr();
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 42, RULE_modexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(MODOF);
			setState(254); expr();
			setState(255); match(AN);
			setState(256); expr();
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 44, RULE_addexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(SUMOF);
			setState(259); expr();
			setState(260); match(AN);
			setState(261); expr();
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

	public static class SubexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitSubexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubexprContext subexpr() throws RecognitionException {
		SubexprContext _localctx = new SubexprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_subexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(DIFFOF);
			setState(264); expr();
			setState(265); match(AN);
			setState(266); expr();
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

	public static class MaxexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MaxexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitMaxexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxexprContext maxexpr() throws RecognitionException {
		MaxexprContext _localctx = new MaxexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_maxexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(BIGGROF);
			setState(269); expr();
			setState(270); match(AN);
			setState(271); expr();
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

	public static class MinexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MinexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitMinexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinexprContext minexpr() throws RecognitionException {
		MinexprContext _localctx = new MinexprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_minexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(SMALLROF);
			setState(274); expr();
			setState(275); match(AN);
			setState(276); expr();
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 52, RULE_bothofexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(BOTHOF);
			setState(279); expr();
			setState(280); match(AN);
			setState(281); expr();
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 54, RULE_eitherexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(EITHEROF);
			setState(284); expr();
			setState(285); match(AN);
			setState(286); expr();
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 56, RULE_oneofexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); match(ONEOF);
			setState(289); expr();
			setState(290); match(AN);
			setState(291); expr();
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 58, RULE_equexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); match(BOTHSAEM);
			setState(294); expr();
			setState(295); match(AN);
			setState(296); expr();
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

	public static class NequexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NequexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nequexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitNequexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NequexprContext nequexpr() throws RecognitionException {
		NequexprContext _localctx = new NequexprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nequexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); match(DIFFRINT);
			setState(299); expr();
			setState(300); match(AN);
			setState(301); expr();
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 62, RULE_exprList);
		int _la;
		try {
			setState(314);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303); match(YR);
				setState(304); expr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); match(YR);
				setState(306); expr();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NYR) {
					{
					{
					setState(307); match(NYR);
					setState(308); expr();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class RetpartContext extends ParserRuleContext {
		public TerminalNode ENDST() { return getToken(lolcodeParser.ENDST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_retpart);
		try {
			setState(322);
			switch (_input.LA(1)) {
			case FOUNDYR:
				enterOuterAlt(_localctx, 1);
				{
				setState(316); match(FOUNDYR);
				setState(317); expr();
				setState(318); match(ENDST);
				}
				break;
			case GTFO:
				enterOuterAlt(_localctx, 2);
				{
				setState(320); match(GTFO);
				setState(321); match(ENDST);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(lolcodeParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(lolcodeParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(lolcodeParser.INT, 0); }
		public TerminalNode STRING() { return getToken(lolcodeParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3?\u0149\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\3\3\3\3\3\7\3"+
		"R\n\3\f\3\16\3U\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4]\n\4\3\4\3\4\3\5\3\5"+
		"\3\5\5\5d\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13"+
		"\6\3\7\3\7\3\b\7\bw\n\b\f\b\16\bz\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0085\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u0093\n\n\f\n\16\n\u0096\13\n\3\n\3\n\3\n\5\n\u009b\n\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\7\13\u00a5\n\13\f\13\16\13\u00a8\13\13\3\13\3"+
		"\13\3\13\5\13\u00ad\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00b6\n\f"+
		"\3\f\5\f\u00b9\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c2\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e9\n\22\3\23\3\23\5\23\u00ed\n"+
		"\23\3\23\3\23\5\23\u00f1\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\7!\u0138\n!\f!\16!\u013b\13!\5!\u013d\n!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0145\n\"\3#\3#\3#\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BD\2\5\3\2#$\3\2\13\f\3\28;\u014f\2I\3\2\2\2\4N"+
		"\3\2\2\2\6X\3\2\2\2\b`\3\2\2\2\nj\3\2\2\2\fs\3\2\2\2\16x\3\2\2\2\20\u0084"+
		"\3\2\2\2\22\u0086\3\2\2\2\24\u009f\3\2\2\2\26\u00b1\3\2\2\2\30\u00ba\3"+
		"\2\2\2\32\u00c9\3\2\2\2\34\u00ce\3\2\2\2\36\u00d0\3\2\2\2 \u00d4\3\2\2"+
		"\2\"\u00e8\3\2\2\2$\u00ea\3\2\2\2&\u00f2\3\2\2\2(\u00f5\3\2\2\2*\u00fa"+
		"\3\2\2\2,\u00ff\3\2\2\2.\u0104\3\2\2\2\60\u0109\3\2\2\2\62\u010e\3\2\2"+
		"\2\64\u0113\3\2\2\2\66\u0118\3\2\2\28\u011d\3\2\2\2:\u0122\3\2\2\2<\u0127"+
		"\3\2\2\2>\u012c\3\2\2\2@\u013c\3\2\2\2B\u0144\3\2\2\2D\u0146\3\2\2\2F"+
		"H\5\b\5\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2"+
		"LM\5\4\3\2M\3\3\2\2\2NO\7\t\2\2OS\7=\2\2PR\5\20\t\2QP\3\2\2\2RU\3\2\2"+
		"\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\n\2\2W\5\3\2\2\2XY\7\63"+
		"\2\2Y\\\7<\2\2Z[\7\31\2\2[]\5\"\22\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^"+
		"_\7=\2\2_\7\3\2\2\2`a\7\60\2\2ac\7<\2\2bd\5\n\6\2cb\3\2\2\2cd\3\2\2\2"+
		"de\3\2\2\2ef\7=\2\2fg\5\16\b\2gh\7\61\2\2hi\7=\2\2i\t\3\2\2\2jk\7.\2\2"+
		"kp\5\f\7\2lm\7/\2\2mo\5\f\7\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2"+
		"q\13\3\2\2\2rp\3\2\2\2st\7<\2\2t\r\3\2\2\2uw\5\20\t\2vu\3\2\2\2wz\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2y\17\3\2\2\2zx\3\2\2\2{\u0085\5\6\4\2|\u0085\5"+
		"\22\n\2}\u0085\5\24\13\2~\u0085\5\30\r\2\177\u0085\5\32\16\2\u0080\u0085"+
		"\5\34\17\2\u0081\u0085\5B\"\2\u0082\u0085\5\36\20\2\u0083\u0085\5 \21"+
		"\2\u0084{\3\2\2\2\u0084|\3\2\2\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0084\177"+
		"\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\21\3\2\2\2\u0086\u0087\5\"\22\2\u0087\u0088\7=\2"+
		"\2\u0088\u0089\7\r\2\2\u0089\u008a\7=\2\2\u008a\u008b\7\16\2\2\u008b\u008c"+
		"\7=\2\2\u008c\u0094\5\16\b\2\u008d\u008e\7\17\2\2\u008e\u008f\5\"\22\2"+
		"\u008f\u0090\7=\2\2\u0090\u0091\5\16\b\2\u0091\u0093\3\2\2\2\u0092\u008d"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u009a\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\20\2\2\u0098\u0099\7"+
		"=\2\2\u0099\u009b\5\16\b\2\u009a\u0097\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\7\21\2\2\u009d\u009e\7=\2\2\u009e\23\3\2\2"+
		"\2\u009f\u00a0\5\"\22\2\u00a0\u00a1\7=\2\2\u00a1\u00a2\7\3\2\2\u00a2\u00a6"+
		"\7=\2\2\u00a3\u00a5\5\26\f\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ac\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00aa\7\23\2\2\u00aa\u00ab\7=\2\2\u00ab\u00ad\5\16\b\2\u00ac"+
		"\u00a9\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\21"+
		"\2\2\u00af\u00b0\7=\2\2\u00b0\25\3\2\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3"+
		"\5D#\2\u00b3\u00b5\7=\2\2\u00b4\u00b6\5\16\b\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\7=\2\2\u00b8\u00b7\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\27\3\2\2\2\u00ba\u00bb\7%\2\2\u00bb\u00c1"+
		"\7<\2\2\u00bc\u00bd\t\2\2\2\u00bd\u00be\7.\2\2\u00be\u00bf\7<\2\2\u00bf"+
		"\u00c0\t\3\2\2\u00c0\u00c2\5\"\22\2\u00c1\u00bc\3\2\2\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7=\2\2\u00c4\u00c5\5\16\b\2\u00c5"+
		"\u00c6\7&\2\2\u00c6\u00c7\7<\2\2\u00c7\u00c8\7=\2\2\u00c8\31\3\2\2\2\u00c9"+
		"\u00ca\7<\2\2\u00ca\u00cb\7\62\2\2\u00cb\u00cc\5\"\22\2\u00cc\u00cd\7"+
		"=\2\2\u00cd\33\3\2\2\2\u00ce\u00cf\5\"\22\2\u00cf\35\3\2\2\2\u00d0\u00d1"+
		"\7\65\2\2\u00d1\u00d2\5\"\22\2\u00d2\u00d3\7=\2\2\u00d3\37\3\2\2\2\u00d4"+
		"\u00d5\7\66\2\2\u00d5\u00d6\7<\2\2\u00d6\u00d7\7=\2\2\u00d7!\3\2\2\2\u00d8"+
		"\u00e9\5$\23\2\u00d9\u00e9\5&\24\2\u00da\u00e9\5(\25\2\u00db\u00e9\5*"+
		"\26\2\u00dc\u00e9\5,\27\2\u00dd\u00e9\5.\30\2\u00de\u00e9\5\60\31\2\u00df"+
		"\u00e9\5\62\32\2\u00e0\u00e9\5\64\33\2\u00e1\u00e9\5\66\34\2\u00e2\u00e9"+
		"\58\35\2\u00e3\u00e9\5:\36\2\u00e4\u00e9\5<\37\2\u00e5\u00e9\5> \2\u00e6"+
		"\u00e9\7<\2\2\u00e7\u00e9\5D#\2\u00e8\u00d8\3\2\2\2\u00e8\u00d9\3\2\2"+
		"\2\u00e8\u00da\3\2\2\2\u00e8\u00db\3\2\2\2\u00e8\u00dc\3\2\2\2\u00e8\u00dd"+
		"\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8"+
		"\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e4\3\2"+
		"\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"#\3\2\2\2\u00ea\u00ec\7<\2\2\u00eb\u00ed\5@!\2\u00ec\u00eb\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\7\64\2\2\u00ef\u00f1\7"+
		"=\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1%\3\2\2\2\u00f2\u00f3"+
		"\7,\2\2\u00f3\u00f4\5\"\22\2\u00f4\'\3\2\2\2\u00f5\u00f6\7\35\2\2\u00f6"+
		"\u00f7\5\"\22\2\u00f7\u00f8\7\7\2\2\u00f8\u00f9\5\"\22\2\u00f9)\3\2\2"+
		"\2\u00fa\u00fb\7\36\2\2\u00fb\u00fc\5\"\22\2\u00fc\u00fd\7\7\2\2\u00fd"+
		"\u00fe\5\"\22\2\u00fe+\3\2\2\2\u00ff\u0100\7\37\2\2\u0100\u0101\5\"\22"+
		"\2\u0101\u0102\7\7\2\2\u0102\u0103\5\"\22\2\u0103-\3\2\2\2\u0104\u0105"+
		"\7 \2\2\u0105\u0106\5\"\22\2\u0106\u0107\7\7\2\2\u0107\u0108\5\"\22\2"+
		"\u0108/\3\2\2\2\u0109\u010a\7!\2\2\u010a\u010b\5\"\22\2\u010b\u010c\7"+
		"\7\2\2\u010c\u010d\5\"\22\2\u010d\61\3\2\2\2\u010e\u010f\7\b\2\2\u010f"+
		"\u0110\5\"\22\2\u0110\u0111\7\7\2\2\u0111\u0112\5\"\22\2\u0112\63\3\2"+
		"\2\2\u0113\u0114\7\34\2\2\u0114\u0115\5\"\22\2\u0115\u0116\7\7\2\2\u0116"+
		"\u0117\5\"\22\2\u0117\65\3\2\2\2\u0118\u0119\7+\2\2\u0119\u011a\5\"\22"+
		"\2\u011a\u011b\7\7\2\2\u011b\u011c\5\"\22\2\u011c\67\3\2\2\2\u011d\u011e"+
		"\7*\2\2\u011e\u011f\5\"\22\2\u011f\u0120\7\7\2\2\u0120\u0121\5\"\22\2"+
		"\u01219\3\2\2\2\u0122\u0123\7(\2\2\u0123\u0124\5\"\22\2\u0124\u0125\7"+
		"\7\2\2\u0125\u0126\5\"\22\2\u0126;\3\2\2\2\u0127\u0128\7\32\2\2\u0128"+
		"\u0129\5\"\22\2\u0129\u012a\7\7\2\2\u012a\u012b\5\"\22\2\u012b=\3\2\2"+
		"\2\u012c\u012d\7\33\2\2\u012d\u012e\5\"\22\2\u012e\u012f\7\7\2\2\u012f"+
		"\u0130\5\"\22\2\u0130?\3\2\2\2\u0131\u0132\7.\2\2\u0132\u013d\5\"\22\2"+
		"\u0133\u0134\7.\2\2\u0134\u0139\5\"\22\2\u0135\u0136\7/\2\2\u0136\u0138"+
		"\5\"\22\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0131"+
		"\3\2\2\2\u013c\u0133\3\2\2\2\u013dA\3\2\2\2\u013e\u013f\7\67\2\2\u013f"+
		"\u0140\5\"\22\2\u0140\u0141\7=\2\2\u0141\u0145\3\2\2\2\u0142\u0143\7-"+
		"\2\2\u0143\u0145\7=\2\2\u0144\u013e\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"C\3\2\2\2\u0146\u0147\t\4\2\2\u0147E\3\2\2\2\26IS\\cpx\u0084\u0094\u009a"+
		"\u00a6\u00ac\u00b5\u00b8\u00c1\u00e8\u00ec\u00f0\u0139\u013c\u0144";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}