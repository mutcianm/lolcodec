// Generated from C:\ANTLR\lolcode\lolcode.g4 by ANTLR 4.0

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
		HOWDUZ=46, IFUSAY=47, R=48, IHAS=49, MKAY=50, VISIBLE=51, ID=52, VALUE=53, 
		INT=54, STRING=55, FLOAT=56, BOOL=57, ENDST=58, WS=59, SL_COMMENT=60;
	public static final String[] tokenNames = {
		"<INVALID>", "'WTF?'", "'WRK'", "'MAEK'", "'A'", "'AN'", "'BIGGR OF'", 
		"'HAI'", "'KTHXBYE'", "'WILE'", "'TIL'", "'ORLY'", "'YRLY'", "'MEBBE'", 
		"'NOWAI'", "'OIC'", "'OMG'", "'OMGWTF'", "'YARN'", "'NUMBR'", "'NUMBAR'", 
		"'TROOF'", "'NOOB'", "'ITZ'", "'BOTH SAEM'", "'DIFFRINT'", "'SMALLR OF'", 
		"'PRODUKT OF'", "'QUOSHUNT OF'", "'MOD OF'", "'SUM OF'", "'DIFF OF'", 
		"'SMOOSH'", "'UPPIN'", "'NERFIN'", "'IM IN YR'", "'IM OUTTA YR'", "'ANY OF'", 
		"'ONE OF'", "'ALL OF'", "'EITHER OF'", "'BOTH OF'", "'NOT'", "'GTFO'", 
		"'YR'", "'N YR'", "'HOW DUZ I'", "'IF U SAY SO'", "'R'", "'I HAS A'", 
		"'MKAY'", "'VISIBLE'", "ID", "VALUE", "INT", "STRING", "FLOAT", "BOOL", 
		"ENDST", "WS", "SL_COMMENT"
	};
	public static final int
		RULE_file = 0, RULE_main = 1, RULE_varDecl = 2, RULE_functionDecl = 3, 
		RULE_formalParameters = 4, RULE_formalParameter = 5, RULE_type = 6, RULE_block = 7, 
		RULE_stat = 8, RULE_ifstat = 9, RULE_casestat = 10, RULE_loopstat = 11, 
		RULE_assstat = 12, RULE_funcall = 13, RULE_visstat = 14, RULE_expr = 15, 
		RULE_funexpr = 16, RULE_notexpr = 17, RULE_multexpr = 18, RULE_modexpr = 19, 
		RULE_addexpr = 20, RULE_minmaxexpr = 21, RULE_bothofexpr = 22, RULE_eitherexpr = 23, 
		RULE_oneofexpr = 24, RULE_equexpr = 25, RULE_exprList = 26;
	public static final String[] ruleNames = {
		"file", "main", "varDecl", "functionDecl", "formalParameters", "formalParameter", 
		"type", "block", "stat", "ifstat", "casestat", "loopstat", "assstat", 
		"funcall", "visstat", "expr", "funexpr", "notexpr", "multexpr", "modexpr", 
		"addexpr", "minmaxexpr", "bothofexpr", "eitherexpr", "oneofexpr", "equexpr", 
		"exprList"
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HOWDUZ) {
				{
				{
				setState(54); functionDecl();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60); main();
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
			setState(62); match(HAI);
			setState(63); match(ENDST);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << IHAS) | (1L << VISIBLE) | (1L << ID) | (1L << VALUE))) != 0)) {
				{
				{
				setState(64); stat();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70); match(KTHXBYE);
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
			setState(72); match(IHAS);
			setState(73); match(ID);
			setState(76);
			_la = _input.LA(1);
			if (_la==ITZ) {
				{
				setState(74); match(ITZ);
				setState(75); expr();
				}
			}

			setState(78); match(ENDST);
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
			setState(80); match(HOWDUZ);
			setState(81); match(ID);
			setState(83);
			_la = _input.LA(1);
			if (_la==YR) {
				{
				setState(82); formalParameters();
				}
			}

			setState(85); match(ENDST);
			setState(86); block();
			setState(87); match(IFUSAY);
			setState(88); match(ENDST);
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
			setState(90); match(YR);
			setState(91); formalParameter();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NYR) {
				{
				{
				setState(92); match(NYR);
				setState(93); formalParameter();
				}
				}
				setState(98);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			setState(99); type();
			setState(100); match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lolcodeVisitor ) return ((lolcodeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YARN) | (1L << NUMBR) | (1L << NUMBAR) | (1L << TROOF))) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << IHAS) | (1L << VISIBLE) | (1L << ID) | (1L << VALUE))) != 0)) {
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
		enterRule(_localctx, 16, RULE_stat);
		try {
			setState(117);
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
		enterRule(_localctx, 18, RULE_ifstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); expr();
			setState(120); match(ENDST);
			setState(121); match(ORLY);
			setState(122); match(ENDST);
			setState(123); match(YARLY);
			setState(124); match(ENDST);
			setState(125); stat();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MEBBE) {
				{
				{
				setState(126); match(MEBBE);
				setState(127); expr();
				setState(128); match(ENDST);
				setState(129); stat();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			_la = _input.LA(1);
			if (_la==NOWAI) {
				{
				setState(136); match(NOWAI);
				setState(137); match(ENDST);
				setState(138); stat();
				}
			}

			setState(141); match(OIC);
			setState(142); match(ENDST);
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
		enterRule(_localctx, 20, RULE_casestat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); expr();
			setState(145); match(ENDST);
			setState(146); match(WTF);
			setState(147); match(ENDST);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OMG) {
				{
				{
				setState(148); match(OMG);
				setState(149); match(VALUE);
				setState(150); match(ENDST);
				setState(151); block();
				setState(154);
				_la = _input.LA(1);
				if (_la==GTFO) {
					{
					setState(152); match(GTFO);
					setState(153); match(ENDST);
					}
				}

				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			_la = _input.LA(1);
			if (_la==OMGWTF) {
				{
				setState(161); match(OMGWTF);
				setState(162); match(ENDST);
				setState(163); block();
				setState(166);
				_la = _input.LA(1);
				if (_la==GTFO) {
					{
					setState(164); match(GTFO);
					setState(165); match(ENDST);
					}
				}

				}
			}

			setState(170); match(OIC);
			setState(171); match(ENDST);
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
		enterRule(_localctx, 22, RULE_loopstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(IMINYR);
			setState(174); match(ID);
			setState(180);
			_la = _input.LA(1);
			if (_la==UPPIN || _la==NERFIN) {
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==UPPIN || _la==NERFIN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(176); match(YR);
				setState(177); match(ID);
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==WHILE || _la==TIL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(179); expr();
				}
			}

			setState(182); match(ENDST);
			setState(183); block();
			setState(186);
			_la = _input.LA(1);
			if (_la==GTFO) {
				{
				setState(184); match(GTFO);
				setState(185); match(ENDST);
				}
			}

			setState(188); match(IMOUTTAYR);
			setState(189); match(ID);
			setState(190); match(ENDST);
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
		enterRule(_localctx, 24, RULE_assstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); expr();
			setState(193); match(R);
			setState(194); expr();
			setState(195); match(ENDST);
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
			setState(197); expr();
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
		enterRule(_localctx, 28, RULE_visstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(VISIBLE);
			setState(200); expr();
			setState(201); match(ENDST);
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
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); funexpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); notexpr();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205); multexpr();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206); modexpr();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(207); addexpr();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208); minmaxexpr();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(209); bothofexpr();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(210); eitherexpr();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(211); oneofexpr();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(212); equexpr();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(213); match(ID);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(214); match(VALUE);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(ID);
			setState(219);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << ID) | (1L << VALUE))) != 0)) {
				{
				setState(218); exprList();
				}
			}

			setState(221); match(ENDST);
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
			setState(223); match(NOT);
			setState(224); expr();
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
			setState(236);
			switch (_input.LA(1)) {
			case PRODUKTOF:
				{
				setState(226); match(PRODUKTOF);
				setState(227); expr();
				setState(228); match(AN);
				setState(229); expr();
				}
				break;
			case QUOSHUNTOF:
				{
				setState(231); match(QUOSHUNTOF);
				setState(232); expr();
				setState(233); match(AN);
				setState(234); expr();
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
			setState(238); match(MODOF);
			setState(239); expr();
			setState(240); match(AN);
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
			setState(253);
			switch (_input.LA(1)) {
			case SUMOF:
				{
				setState(243); match(SUMOF);
				setState(244); expr();
				setState(245); match(AN);
				setState(246); expr();
				}
				break;
			case DIFFOF:
				{
				setState(248); match(DIFFOF);
				setState(249); expr();
				setState(250); match(AN);
				setState(251); expr();
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
			setState(265);
			switch (_input.LA(1)) {
			case BIGGROF:
				{
				setState(255); match(BIGGROF);
				setState(256); expr();
				setState(257); match(AN);
				setState(258); expr();
				}
				break;
			case SMALLROF:
				{
				setState(260); match(SMALLROF);
				setState(261); expr();
				setState(262); match(AN);
				setState(263); expr();
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
			setState(267); match(BOTHOF);
			setState(268); expr();
			setState(269); match(AN);
			setState(270); expr();
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
			setState(272); match(EITHEROF);
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
			setState(277); match(ONEOF);
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
			setState(292);
			switch (_input.LA(1)) {
			case BOTHSAEM:
				{
				setState(282); match(BOTHSAEM);
				setState(283); expr();
				setState(284); match(AN);
				setState(285); expr();
				}
				break;
			case DIFFRINT:
				{
				setState(287); match(DIFFRINT);
				setState(288); expr();
				setState(289); match(AN);
				setState(290); expr();
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
			setState(294); expr();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(295); match(AN);
				setState(296); expr();
				}
				}
				setState(301);
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

	public static final String _serializedATN =
		"\2\3>\u0131\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16"+
		"\2=\13\2\3\2\3\2\3\3\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\5\4O\n\4\3\4\3\4\3\5\3\5\3\5\5\5V\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\7\6a\n\6\f\6\16\6d\13\6\3\7\3\7\3\7\3\b\3\b\3\t\7\tl\n\t\f"+
		"\t\16\to\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nx\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0086\n\13\f\13\16\13\u0089"+
		"\13\13\3\13\3\13\3\13\5\13\u008e\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u009d\n\f\7\f\u009f\n\f\f\f\16\f\u00a2\13\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00a9\n\f\5\f\u00ab\n\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00b7\n\r\3\r\3\r\3\r\3\r\5\r\u00bd\n\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00da\n\21"+
		"\3\22\3\22\5\22\u00de\n\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ef\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0100\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010c\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0127\n\33\3\34\3\34"+
		"\3\34\7\34\u012c\n\34\f\34\16\34\u012f\13\34\3\34\2\35\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\5\3\24\27\3#$\3\13\f\u013a"+
		"\2;\3\2\2\2\4@\3\2\2\2\6J\3\2\2\2\bR\3\2\2\2\n\\\3\2\2\2\fe\3\2\2\2\16"+
		"h\3\2\2\2\20m\3\2\2\2\22w\3\2\2\2\24y\3\2\2\2\26\u0092\3\2\2\2\30\u00af"+
		"\3\2\2\2\32\u00c2\3\2\2\2\34\u00c7\3\2\2\2\36\u00c9\3\2\2\2 \u00d9\3\2"+
		"\2\2\"\u00db\3\2\2\2$\u00e1\3\2\2\2&\u00ee\3\2\2\2(\u00f0\3\2\2\2*\u00ff"+
		"\3\2\2\2,\u010b\3\2\2\2.\u010d\3\2\2\2\60\u0112\3\2\2\2\62\u0117\3\2\2"+
		"\2\64\u0126\3\2\2\2\66\u0128\3\2\2\28:\5\b\5\298\3\2\2\2:=\3\2\2\2;9\3"+
		"\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\5\4\3\2?\3\3\2\2\2@A\7\t\2\2AE"+
		"\7<\2\2BD\5\22\n\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2G"+
		"E\3\2\2\2HI\7\n\2\2I\5\3\2\2\2JK\7\63\2\2KN\7\66\2\2LM\7\31\2\2MO\5 \21"+
		"\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7<\2\2Q\7\3\2\2\2RS\7\60\2\2SU\7\66"+
		"\2\2TV\5\n\6\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7<\2\2XY\5\20\t\2YZ\7\61"+
		"\2\2Z[\7<\2\2[\t\3\2\2\2\\]\7.\2\2]b\5\f\7\2^_\7/\2\2_a\5\f\7\2`^\3\2"+
		"\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\13\3\2\2\2db\3\2\2\2ef\5\16\b\2fg"+
		"\7\66\2\2g\r\3\2\2\2hi\t\2\2\2i\17\3\2\2\2jl\5\22\n\2kj\3\2\2\2lo\3\2"+
		"\2\2mk\3\2\2\2mn\3\2\2\2n\21\3\2\2\2om\3\2\2\2px\5\6\4\2qx\5\24\13\2r"+
		"x\5\26\f\2sx\5\30\r\2tx\5\32\16\2ux\5\34\17\2vx\5\36\20\2wp\3\2\2\2wq"+
		"\3\2\2\2wr\3\2\2\2ws\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\23\3\2\2\2"+
		"yz\5 \21\2z{\7<\2\2{|\7\r\2\2|}\7<\2\2}~\7\16\2\2~\177\7<\2\2\177\u0087"+
		"\5\22\n\2\u0080\u0081\7\17\2\2\u0081\u0082\5 \21\2\u0082\u0083\7<\2\2"+
		"\u0083\u0084\5\22\n\2\u0084\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7\20\2\2\u008b\u008c\7<\2\2\u008c\u008e\5\22"+
		"\n\2\u008d\u008a\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\7\21\2\2\u0090\u0091\7<\2\2\u0091\25\3\2\2\2\u0092\u0093\5 \21"+
		"\2\u0093\u0094\7<\2\2\u0094\u0095\7\3\2\2\u0095\u00a0\7<\2\2\u0096\u0097"+
		"\7\22\2\2\u0097\u0098\7\67\2\2\u0098\u0099\7<\2\2\u0099\u009c\5\20\t\2"+
		"\u009a\u009b\7-\2\2\u009b\u009d\7<\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u0096\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00aa\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\7<\2\2\u00a5\u00a8\5\20\t\2\u00a6"+
		"\u00a7\7-\2\2\u00a7\u00a9\7<\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2"+
		"\2\u00a9\u00ab\3\2\2\2\u00aa\u00a3\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00ad\7\21\2\2\u00ad\u00ae\7<\2\2\u00ae\27\3\2\2\2\u00af"+
		"\u00b0\7%\2\2\u00b0\u00b6\7\66\2\2\u00b1\u00b2\t\3\2\2\u00b2\u00b3\7."+
		"\2\2\u00b3\u00b4\7\66\2\2\u00b4\u00b5\t\4\2\2\u00b5\u00b7\5 \21\2\u00b6"+
		"\u00b1\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7<"+
		"\2\2\u00b9\u00bc\5\20\t\2\u00ba\u00bb\7-\2\2\u00bb\u00bd\7<\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7&"+
		"\2\2\u00bf\u00c0\7\66\2\2\u00c0\u00c1\7<\2\2\u00c1\31\3\2\2\2\u00c2\u00c3"+
		"\5 \21\2\u00c3\u00c4\7\62\2\2\u00c4\u00c5\5 \21\2\u00c5\u00c6\7<\2\2\u00c6"+
		"\33\3\2\2\2\u00c7\u00c8\5 \21\2\u00c8\35\3\2\2\2\u00c9\u00ca\7\65\2\2"+
		"\u00ca\u00cb\5 \21\2\u00cb\u00cc\7<\2\2\u00cc\37\3\2\2\2\u00cd\u00da\5"+
		"\"\22\2\u00ce\u00da\5$\23\2\u00cf\u00da\5&\24\2\u00d0\u00da\5(\25\2\u00d1"+
		"\u00da\5*\26\2\u00d2\u00da\5,\27\2\u00d3\u00da\5.\30\2\u00d4\u00da\5\60"+
		"\31\2\u00d5\u00da\5\62\32\2\u00d6\u00da\5\64\33\2\u00d7\u00da\7\66\2\2"+
		"\u00d8\u00da\7\67\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00cf"+
		"\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d2\3\2\2\2\u00d9"+
		"\u00d3\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da!\3\2\2\2\u00db\u00dd"+
		"\7\66\2\2\u00dc\u00de\5\66\34\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2"+
		"\2\u00de\u00df\3\2\2\2\u00df\u00e0\7<\2\2\u00e0#\3\2\2\2\u00e1\u00e2\7"+
		",\2\2\u00e2\u00e3\5 \21\2\u00e3%\3\2\2\2\u00e4\u00e5\7\35\2\2\u00e5\u00e6"+
		"\5 \21\2\u00e6\u00e7\7\7\2\2\u00e7\u00e8\5 \21\2\u00e8\u00ef\3\2\2\2\u00e9"+
		"\u00ea\7\36\2\2\u00ea\u00eb\5 \21\2\u00eb\u00ec\7\7\2\2\u00ec\u00ed\5"+
		" \21\2\u00ed\u00ef\3\2\2\2\u00ee\u00e4\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ef"+
		"\'\3\2\2\2\u00f0\u00f1\7\37\2\2\u00f1\u00f2\5 \21\2\u00f2\u00f3\7\7\2"+
		"\2\u00f3\u00f4\5 \21\2\u00f4)\3\2\2\2\u00f5\u00f6\7 \2\2\u00f6\u00f7\5"+
		" \21\2\u00f7\u00f8\7\7\2\2\u00f8\u00f9\5 \21\2\u00f9\u0100\3\2\2\2\u00fa"+
		"\u00fb\7!\2\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\7\7\2\2\u00fd\u00fe\5 \21"+
		"\2\u00fe\u0100\3\2\2\2\u00ff\u00f5\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100+"+
		"\3\2\2\2\u0101\u0102\7\b\2\2\u0102\u0103\5 \21\2\u0103\u0104\7\7\2\2\u0104"+
		"\u0105\5 \21\2\u0105\u010c\3\2\2\2\u0106\u0107\7\34\2\2\u0107\u0108\5"+
		" \21\2\u0108\u0109\7\7\2\2\u0109\u010a\5 \21\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0101\3\2\2\2\u010b\u0106\3\2\2\2\u010c-\3\2\2\2\u010d\u010e\7+\2\2\u010e"+
		"\u010f\5 \21\2\u010f\u0110\7\7\2\2\u0110\u0111\5 \21\2\u0111/\3\2\2\2"+
		"\u0112\u0113\7*\2\2\u0113\u0114\5 \21\2\u0114\u0115\7\7\2\2\u0115\u0116"+
		"\5 \21\2\u0116\61\3\2\2\2\u0117\u0118\7(\2\2\u0118\u0119\5 \21\2\u0119"+
		"\u011a\7\7\2\2\u011a\u011b\5 \21\2\u011b\63\3\2\2\2\u011c\u011d\7\32\2"+
		"\2\u011d\u011e\5 \21\2\u011e\u011f\7\7\2\2\u011f\u0120\5 \21\2\u0120\u0127"+
		"\3\2\2\2\u0121\u0122\7\33\2\2\u0122\u0123\5 \21\2\u0123\u0124\7\7\2\2"+
		"\u0124\u0125\5 \21\2\u0125\u0127\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u0121"+
		"\3\2\2\2\u0127\65\3\2\2\2\u0128\u012d\5 \21\2\u0129\u012a\7\7\2\2\u012a"+
		"\u012c\5 \21\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\67\3\2\2\2\u012f\u012d\3\2\2\2\30;ENUb"+
		"mw\u0087\u008d\u009c\u00a0\u00a8\u00aa\u00b6\u00bc\u00d9\u00dd\u00ee\u00ff"+
		"\u010b\u0126\u012d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}