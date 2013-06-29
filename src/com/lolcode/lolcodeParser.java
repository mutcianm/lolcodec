// Generated from /home/miha/Downloads/skype/lolcode.g4 by ANTLR 4.0
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
		RULE_formalParameters = 4, RULE_formalParameter = 5, RULE_block = 6, RULE_stat = 7, 
		RULE_ifstat = 8, RULE_casestat = 9, RULE_loopstat = 10, RULE_assstat = 11, 
		RULE_funcall = 12, RULE_visstat = 13, RULE_expr = 14, RULE_funexpr = 15, 
		RULE_notexpr = 16, RULE_multexpr = 17, RULE_modexpr = 18, RULE_addexpr = 19, 
		RULE_minmaxexpr = 20, RULE_bothofexpr = 21, RULE_eitherexpr = 22, RULE_oneofexpr = 23, 
		RULE_equexpr = 24, RULE_exprList = 25;
	public static final String[] ruleNames = {
		"file", "main", "varDecl", "functionDecl", "formalParameters", "formalParameter", 
		"block", "stat", "ifstat", "casestat", "loopstat", "assstat", "funcall", 
		"visstat", "expr", "funexpr", "notexpr", "multexpr", "modexpr", "addexpr", 
		"minmaxexpr", "bothofexpr", "eitherexpr", "oneofexpr", "equexpr", "exprList"
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HOWDUZ) {
				{
				{
				setState(52); functionDecl();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58); main();
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
			setState(60); match(HAI);
			setState(61); match(ENDST);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << IHAS) | (1L << VISIBLE) | (1L << ID) | (1L << VALUE))) != 0)) {
				{
				{
				setState(62); stat();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68); match(KTHXBYE);
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
			setState(70); match(IHAS);
			setState(71); match(ID);
			setState(74);
			_la = _input.LA(1);
			if (_la==ITZ) {
				{
				setState(72); match(ITZ);
				setState(73); expr();
				}
			}

			setState(76); match(ENDST);
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
			setState(78); match(HOWDUZ);
			setState(79); match(ID);
			setState(81);
			_la = _input.LA(1);
			if (_la==YR) {
				{
				setState(80); formalParameters();
				}
			}

			setState(83); match(ENDST);
			setState(84); block();
			setState(85); match(IFUSAY);
			setState(86); match(ENDST);
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
			setState(88); match(YR);
			setState(89); formalParameter();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NYR) {
				{
				{
				setState(90); match(NYR);
				setState(91); formalParameter();
				}
				}
				setState(96);
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
			setState(97); match(ID);
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
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << IHAS) | (1L << VISIBLE) | (1L << ID) | (1L << VALUE))) != 0)) {
				{
				{
				setState(99); stat();
				}
				}
				setState(104);
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
		enterRule(_localctx, 14, RULE_stat);
		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); varDecl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); ifstat();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); casestat();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108); loopstat();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109); assstat();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(110); funcall();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(111); visstat();
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
			setState(114); expr();
			setState(115); match(ENDST);
			setState(116); match(ORLY);
			setState(117); match(ENDST);
			setState(118); match(YARLY);
			setState(119); match(ENDST);
			setState(120); stat();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MEBBE) {
				{
				{
				setState(121); match(MEBBE);
				setState(122); expr();
				setState(123); match(ENDST);
				setState(124); stat();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_la = _input.LA(1);
			if (_la==NOWAI) {
				{
				setState(131); match(NOWAI);
				setState(132); match(ENDST);
				setState(133); stat();
				}
			}

			setState(136); match(OIC);
			setState(137); match(ENDST);
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
			setState(139); expr();
			setState(140); match(ENDST);
			setState(141); match(WTF);
			setState(142); match(ENDST);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OMG) {
				{
				{
				setState(143); match(OMG);
				setState(144); match(VALUE);
				setState(145); match(ENDST);
				setState(146); block();
				setState(149);
				_la = _input.LA(1);
				if (_la==GTFO) {
					{
					setState(147); match(GTFO);
					setState(148); match(ENDST);
					}
				}

				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			_la = _input.LA(1);
			if (_la==OMGWTF) {
				{
				setState(156); match(OMGWTF);
				setState(157); match(ENDST);
				setState(158); block();
				setState(161);
				_la = _input.LA(1);
				if (_la==GTFO) {
					{
					setState(159); match(GTFO);
					setState(160); match(ENDST);
					}
				}

				}
			}

			setState(165); match(OIC);
			setState(166); match(ENDST);
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
			setState(168); match(IMINYR);
			setState(169); match(ID);
			setState(175);
			_la = _input.LA(1);
			if (_la==UPPIN || _la==NERFIN) {
				{
				setState(170);
				_la = _input.LA(1);
				if ( !(_la==UPPIN || _la==NERFIN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(171); match(YR);
				setState(172); match(ID);
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==WHILE || _la==TIL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(174); expr();
				}
			}

			setState(177); match(ENDST);
			setState(178); block();
			setState(181);
			_la = _input.LA(1);
			if (_la==GTFO) {
				{
				setState(179); match(GTFO);
				setState(180); match(ENDST);
				}
			}

			setState(183); match(IMOUTTAYR);
			setState(184); match(ID);
			setState(185); match(ENDST);
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
			setState(187); expr();
			setState(188); match(R);
			setState(189); expr();
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
			setState(192); expr();
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
			setState(194); match(VISIBLE);
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
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198); funexpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199); notexpr();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200); multexpr();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201); modexpr();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202); addexpr();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203); minmaxexpr();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204); bothofexpr();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(205); eitherexpr();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(206); oneofexpr();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(207); equexpr();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(208); match(ID);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(209); match(VALUE);
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
		enterRule(_localctx, 30, RULE_funexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(ID);
			setState(214);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << ID) | (1L << VALUE))) != 0)) {
				{
				setState(213); exprList();
				}
			}

			setState(216); match(ENDST);
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
		enterRule(_localctx, 32, RULE_notexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(NOT);
			setState(219); expr();
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
		enterRule(_localctx, 34, RULE_multexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			switch (_input.LA(1)) {
			case PRODUKTOF:
				{
				setState(221); match(PRODUKTOF);
				setState(222); expr();
				setState(223); match(AN);
				setState(224); expr();
				}
				break;
			case QUOSHUNTOF:
				{
				setState(226); match(QUOSHUNTOF);
				setState(227); expr();
				setState(228); match(AN);
				setState(229); expr();
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
		enterRule(_localctx, 36, RULE_modexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(MODOF);
			setState(234); expr();
			setState(235); match(AN);
			setState(236); expr();
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
		enterRule(_localctx, 38, RULE_addexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			switch (_input.LA(1)) {
			case SUMOF:
				{
				setState(238); match(SUMOF);
				setState(239); expr();
				setState(240); match(AN);
				setState(241); expr();
				}
				break;
			case DIFFOF:
				{
				setState(243); match(DIFFOF);
				setState(244); expr();
				setState(245); match(AN);
				setState(246); expr();
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
		enterRule(_localctx, 40, RULE_minmaxexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			switch (_input.LA(1)) {
			case BIGGROF:
				{
				setState(250); match(BIGGROF);
				setState(251); expr();
				setState(252); match(AN);
				setState(253); expr();
				}
				break;
			case SMALLROF:
				{
				setState(255); match(SMALLROF);
				setState(256); expr();
				setState(257); match(AN);
				setState(258); expr();
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
		enterRule(_localctx, 42, RULE_bothofexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(BOTHOF);
			setState(263); expr();
			setState(264); match(AN);
			setState(265); expr();
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
		enterRule(_localctx, 44, RULE_eitherexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(EITHEROF);
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
		enterRule(_localctx, 46, RULE_oneofexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(ONEOF);
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
		enterRule(_localctx, 48, RULE_equexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			switch (_input.LA(1)) {
			case BOTHSAEM:
				{
				setState(277); match(BOTHSAEM);
				setState(278); expr();
				setState(279); match(AN);
				setState(280); expr();
				}
				break;
			case DIFFRINT:
				{
				setState(282); match(DIFFRINT);
				setState(283); expr();
				setState(284); match(AN);
				setState(285); expr();
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
		enterRule(_localctx, 50, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); expr();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AN) {
				{
				{
				setState(290); match(AN);
				setState(291); expr();
				}
				}
				setState(296);
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
		"\2\3>\u012c\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\7\3B\n\3\f\3\16\3E\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"M\n\4\3\4\3\4\3\5\3\5\3\5\5\5T\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\7\6_\n\6\f\6\16\6b\13\6\3\7\3\7\3\b\7\bg\n\b\f\b\16\bj\13\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\ts\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u0081\n\n\f\n\16\n\u0084\13\n\3\n\3\n\3\n\5\n\u0089\n\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0098"+
		"\n\13\7\13\u009a\n\13\f\13\16\13\u009d\13\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00a4\n\13\5\13\u00a6\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00b2\n\f\3\f\3\f\3\f\3\f\5\f\u00b8\n\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d5\n\20\3\21\3\21\5\21\u00d9"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00ea\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00fb\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0107\n\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0122\n\32\3\33\3\33\3\33\7\33\u0127\n"+
		"\33\f\33\16\33\u012a\13\33\3\33\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\2\4\3#$\3\13\f\u0136\29\3\2\2\2\4>\3\2\2\2\6"+
		"H\3\2\2\2\bP\3\2\2\2\nZ\3\2\2\2\fc\3\2\2\2\16h\3\2\2\2\20r\3\2\2\2\22"+
		"t\3\2\2\2\24\u008d\3\2\2\2\26\u00aa\3\2\2\2\30\u00bd\3\2\2\2\32\u00c2"+
		"\3\2\2\2\34\u00c4\3\2\2\2\36\u00d4\3\2\2\2 \u00d6\3\2\2\2\"\u00dc\3\2"+
		"\2\2$\u00e9\3\2\2\2&\u00eb\3\2\2\2(\u00fa\3\2\2\2*\u0106\3\2\2\2,\u0108"+
		"\3\2\2\2.\u010d\3\2\2\2\60\u0112\3\2\2\2\62\u0121\3\2\2\2\64\u0123\3\2"+
		"\2\2\668\5\b\5\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2"+
		"\2;9\3\2\2\2<=\5\4\3\2=\3\3\2\2\2>?\7\t\2\2?C\7<\2\2@B\5\20\t\2A@\3\2"+
		"\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\n\2\2G\5\3"+
		"\2\2\2HI\7\63\2\2IL\7\66\2\2JK\7\31\2\2KM\5\36\20\2LJ\3\2\2\2LM\3\2\2"+
		"\2MN\3\2\2\2NO\7<\2\2O\7\3\2\2\2PQ\7\60\2\2QS\7\66\2\2RT\5\n\6\2SR\3\2"+
		"\2\2ST\3\2\2\2TU\3\2\2\2UV\7<\2\2VW\5\16\b\2WX\7\61\2\2XY\7<\2\2Y\t\3"+
		"\2\2\2Z[\7.\2\2[`\5\f\7\2\\]\7/\2\2]_\5\f\7\2^\\\3\2\2\2_b\3\2\2\2`^\3"+
		"\2\2\2`a\3\2\2\2a\13\3\2\2\2b`\3\2\2\2cd\7\66\2\2d\r\3\2\2\2eg\5\20\t"+
		"\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\17\3\2\2\2jh\3\2\2\2ks\5\6"+
		"\4\2ls\5\22\n\2ms\5\24\13\2ns\5\26\f\2os\5\30\r\2ps\5\32\16\2qs\5\34\17"+
		"\2rk\3\2\2\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2"+
		"\2s\21\3\2\2\2tu\5\36\20\2uv\7<\2\2vw\7\r\2\2wx\7<\2\2xy\7\16\2\2yz\7"+
		"<\2\2z\u0082\5\20\t\2{|\7\17\2\2|}\5\36\20\2}~\7<\2\2~\177\5\20\t\2\177"+
		"\u0081\3\2\2\2\u0080{\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\u0088\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086"+
		"\7\20\2\2\u0086\u0087\7<\2\2\u0087\u0089\5\20\t\2\u0088\u0085\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\21\2\2\u008b\u008c"+
		"\7<\2\2\u008c\23\3\2\2\2\u008d\u008e\5\36\20\2\u008e\u008f\7<\2\2\u008f"+
		"\u0090\7\3\2\2\u0090\u009b\7<\2\2\u0091\u0092\7\22\2\2\u0092\u0093\7\67"+
		"\2\2\u0093\u0094\7<\2\2\u0094\u0097\5\16\b\2\u0095\u0096\7-\2\2\u0096"+
		"\u0098\7<\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u0091\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u00a5\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\23"+
		"\2\2\u009f\u00a0\7<\2\2\u00a0\u00a3\5\16\b\2\u00a1\u00a2\7-\2\2\u00a2"+
		"\u00a4\7<\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u009e\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\7\21\2\2\u00a8\u00a9\7<\2\2\u00a9\25\3\2\2\2\u00aa\u00ab\7%\2\2"+
		"\u00ab\u00b1\7\66\2\2\u00ac\u00ad\t\2\2\2\u00ad\u00ae\7.\2\2\u00ae\u00af"+
		"\7\66\2\2\u00af\u00b0\t\3\2\2\u00b0\u00b2\5\36\20\2\u00b1\u00ac\3\2\2"+
		"\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7<\2\2\u00b4\u00b7"+
		"\5\16\b\2\u00b5\u00b6\7-\2\2\u00b6\u00b8\7<\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7&\2\2\u00ba\u00bb\7\66"+
		"\2\2\u00bb\u00bc\7<\2\2\u00bc\27\3\2\2\2\u00bd\u00be\5\36\20\2\u00be\u00bf"+
		"\7\62\2\2\u00bf\u00c0\5\36\20\2\u00c0\u00c1\7<\2\2\u00c1\31\3\2\2\2\u00c2"+
		"\u00c3\5\36\20\2\u00c3\33\3\2\2\2\u00c4\u00c5\7\65\2\2\u00c5\u00c6\5\36"+
		"\20\2\u00c6\u00c7\7<\2\2\u00c7\35\3\2\2\2\u00c8\u00d5\5 \21\2\u00c9\u00d5"+
		"\5\"\22\2\u00ca\u00d5\5$\23\2\u00cb\u00d5\5&\24\2\u00cc\u00d5\5(\25\2"+
		"\u00cd\u00d5\5*\26\2\u00ce\u00d5\5,\27\2\u00cf\u00d5\5.\30\2\u00d0\u00d5"+
		"\5\60\31\2\u00d1\u00d5\5\62\32\2\u00d2\u00d5\7\66\2\2\u00d3\u00d5\7\67"+
		"\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00c9\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4"+
		"\u00cb\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00ce\3\2"+
		"\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\37\3\2\2\2\u00d6\u00d8\7\66\2"+
		"\2\u00d7\u00d9\5\64\33\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\7<\2\2\u00db!\3\2\2\2\u00dc\u00dd\7,\2\2\u00dd"+
		"\u00de\5\36\20\2\u00de#\3\2\2\2\u00df\u00e0\7\35\2\2\u00e0\u00e1\5\36"+
		"\20\2\u00e1\u00e2\7\7\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00ea\3\2\2\2\u00e4"+
		"\u00e5\7\36\2\2\u00e5\u00e6\5\36\20\2\u00e6\u00e7\7\7\2\2\u00e7\u00e8"+
		"\5\36\20\2\u00e8\u00ea\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e4\3\2\2\2"+
		"\u00ea%\3\2\2\2\u00eb\u00ec\7\37\2\2\u00ec\u00ed\5\36\20\2\u00ed\u00ee"+
		"\7\7\2\2\u00ee\u00ef\5\36\20\2\u00ef\'\3\2\2\2\u00f0\u00f1\7 \2\2\u00f1"+
		"\u00f2\5\36\20\2\u00f2\u00f3\7\7\2\2\u00f3\u00f4\5\36\20\2\u00f4\u00fb"+
		"\3\2\2\2\u00f5\u00f6\7!\2\2\u00f6\u00f7\5\36\20\2\u00f7\u00f8\7\7\2\2"+
		"\u00f8\u00f9\5\36\20\2\u00f9\u00fb\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f5"+
		"\3\2\2\2\u00fb)\3\2\2\2\u00fc\u00fd\7\b\2\2\u00fd\u00fe\5\36\20\2\u00fe"+
		"\u00ff\7\7\2\2\u00ff\u0100\5\36\20\2\u0100\u0107\3\2\2\2\u0101\u0102\7"+
		"\34\2\2\u0102\u0103\5\36\20\2\u0103\u0104\7\7\2\2\u0104\u0105\5\36\20"+
		"\2\u0105\u0107\3\2\2\2\u0106\u00fc\3\2\2\2\u0106\u0101\3\2\2\2\u0107+"+
		"\3\2\2\2\u0108\u0109\7+\2\2\u0109\u010a\5\36\20\2\u010a\u010b\7\7\2\2"+
		"\u010b\u010c\5\36\20\2\u010c-\3\2\2\2\u010d\u010e\7*\2\2\u010e\u010f\5"+
		"\36\20\2\u010f\u0110\7\7\2\2\u0110\u0111\5\36\20\2\u0111/\3\2\2\2\u0112"+
		"\u0113\7(\2\2\u0113\u0114\5\36\20\2\u0114\u0115\7\7\2\2\u0115\u0116\5"+
		"\36\20\2\u0116\61\3\2\2\2\u0117\u0118\7\32\2\2\u0118\u0119\5\36\20\2\u0119"+
		"\u011a\7\7\2\2\u011a\u011b\5\36\20\2\u011b\u0122\3\2\2\2\u011c\u011d\7"+
		"\33\2\2\u011d\u011e\5\36\20\2\u011e\u011f\7\7\2\2\u011f\u0120\5\36\20"+
		"\2\u0120\u0122\3\2\2\2\u0121\u0117\3\2\2\2\u0121\u011c\3\2\2\2\u0122\63"+
		"\3\2\2\2\u0123\u0128\5\36\20\2\u0124\u0125\7\7\2\2\u0125\u0127\5\36\20"+
		"\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\65\3\2\2\2\u012a\u0128\3\2\2\2\309CLS`hr\u0082\u0088\u0097"+
		"\u009b\u00a3\u00a5\u00b1\u00b7\u00d4\u00d8\u00e9\u00fa\u0106\u0121\u0128";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}