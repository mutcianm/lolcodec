// Generated from lolcode.g4 by ANTLR 4.1

package com.lolcode;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lolcodeParser extends Parser {
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__2 = 1, T__1 = 2, T__0 = 3, WTF = 4, WRK = 5, MAEK = 6, A = 7, AN = 8, BIGGROF = 9, HAI = 10,
            KTHXBYE = 11, WHILE = 12, TIL = 13, ORLY = 14, YARLY = 15, MEBBE = 16, NOWAI = 17, OIC = 18,
            OMG = 19, OMGWTF = 20, YARN = 21, NUMBR = 22, NUMBAR = 23, TROOF = 24, NOOB = 25, ITZ = 26,
            BOTHSAEM = 27, DIFFRINT = 28, SMALLROF = 29, PRODUKTOF = 30, QUOSHUNTOF = 31, MODOF = 32,
            SUMOF = 33, DIFFOF = 34, SMOOSH = 35, UPPIN = 36, NERFIN = 37, IMINYR = 38, IMOUTTAYR = 39,
            ANYOF = 40, ONEOF = 41, ALLOF = 42, EITHEROF = 43, BOTHOF = 44, NOT = 45, GTFO = 46,
            YR = 47, NYR = 48, HOWDUZ = 49, IFUSAY = 50, R = 51, IHAS = 52, MKAY = 53, VISIBLE = 54,
            GIMMEH = 55, FOUNDYR = 56, PUT = 57, IN = 58, NLABEL = 59, INT = 60, STRING = 61, FLOAT = 62,
            BOOL = 63, ID = 64, ENDST = 65, WS = 66, SL_COMMENT = 67;
    public static final String[] tokenNames = {
            "<INVALID>", "'TAKE FROM'", "'I HAS A BOX'", "'LABELED'", "'WTF?'", "'WRK'",
            "'MAEK'", "'A'", "'AN'", "'BIGGR OF'", "'HAI'", "'KTHXBYE'", "'WILE'",
            "'TIL'", "'ORLY'", "'YRLY'", "'MEBBE'", "'NOWAI'", "'OIC'", "'OMG'", "'OMGWTF'",
            "'YARN'", "'NUMBR'", "'NUMBAR'", "'TROOF'", "'NOOB'", "'ITZ'", "'BOTH SAEM'",
            "'DIFFRINT'", "'SMALLR OF'", "'PRODUKT OF'", "'QUOSHUNT OF'", "'MOD OF'",
            "'SUM OF'", "'DIFF OF'", "'SMOOSH'", "'UPPIN'", "'NERFIN'", "'IM IN YR'",
            "'IM OUTTA YR'", "'ANY OF'", "'ONE OF'", "'ALL OF'", "'EITHER OF'", "'BOTH OF'",
            "'NOT'", "'GTFO'", "'YR'", "'N YR'", "'HOW DUZ I'", "'IF U SAY SO'", "'R'",
            "'I HAS A'", "'MKAY'", "'VISIBLE'", "'GIMMEH'", "'FOUND YR'", "'PUT'",
            "'IN'", "'N LABEL AS'", "INT", "STRING", "FLOAT", "BOOL", "ID", "ENDST",
            "WS", "SL_COMMENT"
    };
    public static final int
            RULE_file = 0, RULE_main = 1, RULE_varDecl = 2, RULE_functionDecl = 3,
            RULE_arrayDecl = 4, RULE_arrayGet = 5, RULE_arrayPut = 6, RULE_formalParameters = 7,
            RULE_formalParameter = 8, RULE_block = 9, RULE_stat = 10, RULE_dummystmt = 11,
            RULE_ifstat = 12, RULE_casestat = 13, RULE_caseblock = 14, RULE_loopstat = 15,
            RULE_assstat = 16, RULE_visstat = 17, RULE_gimstat = 18, RULE_expr = 19,
            RULE_funexpr = 20, RULE_notexpr = 21, RULE_multexpr = 22, RULE_divexpr = 23,
            RULE_modexpr = 24, RULE_addexpr = 25, RULE_subexpr = 26, RULE_maxexpr = 27,
            RULE_minexpr = 28, RULE_bothofexpr = 29, RULE_eitherexpr = 30, RULE_oneofexpr = 31,
            RULE_equexpr = 32, RULE_nequexpr = 33, RULE_exprList = 34, RULE_retpart = 35,
            RULE_value = 36;
    public static final String[] ruleNames = {
            "file", "main", "varDecl", "functionDecl", "arrayDecl", "arrayGet", "arrayPut",
            "formalParameters", "formalParameter", "block", "stat", "dummystmt", "ifstat",
            "casestat", "caseblock", "loopstat", "assstat", "visstat", "gimstat",
            "expr", "funexpr", "notexpr", "multexpr", "divexpr", "modexpr", "addexpr",
            "subexpr", "maxexpr", "minexpr", "bothofexpr", "eitherexpr", "oneofexpr",
            "equexpr", "nequexpr", "exprList", "retpart", "value"
    };

    @Override
    public String getGrammarFileName() {
        return "lolcode.g4";
    }

    @Override
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public lolcodeParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class FileContext extends ParserRuleContext {
        public MainContext main() {
            return getRuleContext(MainContext.class, 0);
        }

        public FunctionDeclContext functionDecl(int i) {
            return getRuleContext(FunctionDeclContext.class, i);
        }

        public List<FunctionDeclContext> functionDecl() {
            return getRuleContexts(FunctionDeclContext.class);
        }

        public FileContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_file;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitFile(this);
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
                setState(77);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOWDUZ) {
                    {
                        {
                            setState(74);
                            functionDecl();
                        }
                    }
                    setState(79);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(80);
                main();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MainContext extends ParserRuleContext {
        public StatContext stat(int i) {
            return getRuleContext(StatContext.class, i);
        }

        public TerminalNode ENDST() {
            return getToken(lolcodeParser.ENDST, 0);
        }

        public List<StatContext> stat() {
            return getRuleContexts(StatContext.class);
        }

        public MainContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_main;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitMain(this);
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
                setState(82);
                match(HAI);
                setState(83);
                match(ENDST);
                setState(87);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (1 - 1)) | (1L << (2 - 1)) | (1L << (BIGGROF - 1)) | (1L << (BOTHSAEM - 1)) | (1L << (DIFFRINT - 1)) | (1L << (SMALLROF - 1)) | (1L << (PRODUKTOF - 1)) | (1L << (QUOSHUNTOF - 1)) | (1L << (MODOF - 1)) | (1L << (SUMOF - 1)) | (1L << (DIFFOF - 1)) | (1L << (IMINYR - 1)) | (1L << (ONEOF - 1)) | (1L << (EITHEROF - 1)) | (1L << (BOTHOF - 1)) | (1L << (NOT - 1)) | (1L << (GTFO - 1)) | (1L << (IHAS - 1)) | (1L << (VISIBLE - 1)) | (1L << (GIMMEH - 1)) | (1L << (FOUNDYR - 1)) | (1L << (PUT - 1)) | (1L << (INT - 1)) | (1L << (STRING - 1)) | (1L << (FLOAT - 1)) | (1L << (BOOL - 1)) | (1L << (ID - 1)))) != 0)) {
                    {
                        {
                            setState(84);
                            stat();
                        }
                    }
                    setState(89);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(90);
                match(KTHXBYE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VarDeclContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode ENDST() {
            return getToken(lolcodeParser.ENDST, 0);
        }

        public TerminalNode ID() {
            return getToken(lolcodeParser.ID, 0);
        }

        public VarDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varDecl;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitVarDecl(this);
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
                setState(92);
                match(IHAS);
                setState(93);
                match(ID);
                setState(96);
                _la = _input.LA(1);
                if (_la == ITZ) {
                    {
                        setState(94);
                        match(ITZ);
                        setState(95);
                        expr();
                    }
                }

                setState(98);
                match(ENDST);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FunctionDeclContext extends ParserRuleContext {
        public TerminalNode ENDST(int i) {
            return getToken(lolcodeParser.ENDST, i);
        }

        public List<TerminalNode> ENDST() {
            return getTokens(lolcodeParser.ENDST);
        }

        public TerminalNode ID() {
            return getToken(lolcodeParser.ID, 0);
        }

        public FormalParametersContext formalParameters() {
            return getRuleContext(FormalParametersContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionDecl;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor)
                return ((lolcodeVisitor<? extends T>) visitor).visitFunctionDecl(this);
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
                setState(100);
                match(HOWDUZ);
                setState(101);
                match(ID);
                setState(103);
                _la = _input.LA(1);
                if (_la == YR) {
                    {
                        setState(102);
                        formalParameters();
                    }
                }

                setState(105);
                match(ENDST);
                setState(106);
                block();
                setState(107);
                match(IFUSAY);
                setState(108);
                match(ENDST);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayDeclContext extends ParserRuleContext {
        public TerminalNode ENDST() {
            return getToken(lolcodeParser.ENDST, 0);
        }

        public TerminalNode ID() {
            return getToken(lolcodeParser.ID, 0);
        }

        public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayDecl;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitArrayDecl(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArrayDeclContext arrayDecl() throws RecognitionException {
        ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_arrayDecl);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(110);
                match(2);
                setState(111);
                match(ID);
                setState(112);
                match(ENDST);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayGetContext extends ParserRuleContext {
        public TerminalNode ENDST() {
            return getToken(lolcodeParser.ENDST, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(lolcodeParser.ID, 0);
        }

        public ArrayGetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayGet;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitArrayGet(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArrayGetContext arrayGet() throws RecognitionException {
        ArrayGetContext _localctx = new ArrayGetContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_arrayGet);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(114);
                match(1);
                setState(115);
                match(ID);
                setState(116);
                match(3);
                setState(117);
                expr();
                setState(118);
                match(ENDST);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayPutContext extends ParserRuleContext {
        public TerminalNode IN() {
            return getToken(lolcodeParser.IN, 0);
        }

        public TerminalNode PUT() {
            return getToken(lolcodeParser.PUT, 0);
        }

        public TerminalNode ENDST() {
            return getToken(lolcodeParser.ENDST, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public TerminalNode ID() {
            return getToken(lolcodeParser.ID, 0);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode NLABEL() {
            return getToken(lolcodeParser.NLABEL, 0);
        }

        public ArrayPutContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayPut;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitArrayPut(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArrayPutContext arrayPut() throws RecognitionException {
        ArrayPutContext _localctx = new ArrayPutContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_arrayPut);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(120);
                match(PUT);
                setState(121);
                expr();
                setState(122);
                match(IN);
                setState(123);
                match(ID);
                setState(124);
                match(NLABEL);
                setState(125);
                expr();
                setState(126);
                match(ENDST);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FormalParametersContext extends ParserRuleContext {
        public List<FormalParameterContext> formalParameter() {
            return getRuleContexts(FormalParameterContext.class);
        }

        public FormalParameterContext formalParameter(int i) {
            return getRuleContext(FormalParameterContext.class, i);
        }

        public FormalParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_formalParameters;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor)
                return ((lolcodeVisitor<? extends T>) visitor).visitFormalParameters(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FormalParametersContext formalParameters() throws RecognitionException {
        FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_formalParameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(128);
                match(YR);
                setState(129);
                formalParameter();
                setState(134);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == NYR) {
                    {
                        {
                            setState(130);
                            match(NYR);
                            setState(131);
                            formalParameter();
                        }
                    }
                    setState(136);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FormalParameterContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(lolcodeParser.ID, 0);
        }

        public FormalParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_formalParameter;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor)
                return ((lolcodeVisitor<? extends T>) visitor).visitFormalParameter(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FormalParameterContext formalParameter() throws RecognitionException {
        FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_formalParameter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(137);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BlockContext extends ParserRuleContext {
        public StatContext stat(int i) {
            return getRuleContext(StatContext.class, i);
        }

        public List<StatContext> stat() {
            return getRuleContexts(StatContext.class);
        }

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(142);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (1 - 1)) | (1L << (2 - 1)) | (1L << (BIGGROF - 1)) | (1L << (BOTHSAEM - 1)) | (1L << (DIFFRINT - 1)) | (1L << (SMALLROF - 1)) | (1L << (PRODUKTOF - 1)) | (1L << (QUOSHUNTOF - 1)) | (1L << (MODOF - 1)) | (1L << (SUMOF - 1)) | (1L << (DIFFOF - 1)) | (1L << (IMINYR - 1)) | (1L << (ONEOF - 1)) | (1L << (EITHEROF - 1)) | (1L << (BOTHOF - 1)) | (1L << (NOT - 1)) | (1L << (GTFO - 1)) | (1L << (IHAS - 1)) | (1L << (VISIBLE - 1)) | (1L << (GIMMEH - 1)) | (1L << (FOUNDYR - 1)) | (1L << (PUT - 1)) | (1L << (INT - 1)) | (1L << (STRING - 1)) | (1L << (FLOAT - 1)) | (1L << (BOOL - 1)) | (1L << (ID - 1)))) != 0)) {
                    {
                        {
                            setState(139);
                            stat();
                        }
                    }
                    setState(144);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatContext extends ParserRuleContext {
        public RetpartContext retpart() {
            return getRuleContext(RetpartContext.class, 0);
        }

        public GimstatContext gimstat() {
            return getRuleContext(GimstatContext.class, 0);
        }

        public ArrayDeclContext arrayDecl() {
            return getRuleContext(ArrayDeclContext.class, 0);
        }

        public DummystmtContext dummystmt() {
            return getRuleContext(DummystmtContext.class, 0);
        }

        public VarDeclContext varDecl() {
            return getRuleContext(VarDeclContext.class, 0);
        }

        public VisstatContext visstat() {
            return getRuleContext(VisstatContext.class, 0);
        }

        public CasestatContext casestat() {
            return getRuleContext(CasestatContext.class, 0);
        }

        public LoopstatContext loopstat() {
            return getRuleContext(LoopstatContext.class, 0);
        }

        public IfstatContext ifstat() {
            return getRuleContext(IfstatContext.class, 0);
        }

        public AssstatContext assstat() {
            return getRuleContext(AssstatContext.class, 0);
        }

        public StatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stat;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitStat(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatContext stat() throws RecognitionException {
        StatContext _localctx = new StatContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_stat);
        try {
            setState(155);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(145);
                    varDecl();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(146);
                    arrayDecl();
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(147);
                    ifstat();
                }
                break;

                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(148);
                    casestat();
                }
                break;

                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(149);
                    loopstat();
                }
                break;

                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(150);
                    assstat();
                }
                break;

                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(151);
                    retpart();
                }
                break;

                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(152);
                    visstat();
                }
                break;

                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(153);
                    gimstat();
                }
                break;

                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(154);
                    dummystmt();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DummystmtContext extends ParserRuleContext {
        public TerminalNode ENDST() {
            return getToken(lolcodeParser.ENDST, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public DummystmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dummystmt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitDummystmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DummystmtContext dummystmt() throws RecognitionException {
        DummystmtContext _localctx = new DummystmtContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_dummystmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(157);
                expr();
                setState(158);
                match(ENDST);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IfstatContext extends ParserRuleContext {
        public TerminalNode NOWAI() {
            return getToken(lolcodeParser.NOWAI, 0);
        }

        public TerminalNode ENDST(int i) {
            return getToken(lolcodeParser.ENDST, i);
        }

        public List<TerminalNode> ENDST() {
            return getTokens(lolcodeParser.ENDST);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class, i);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> MEBBE() {
            return getTokens(lolcodeParser.MEBBE);
        }

        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
        }

        public TerminalNode MEBBE(int i) {
            return getToken(lolcodeParser.MEBBE, i);
        }

        public IfstatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifstat;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitIfstat(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IfstatContext ifstat() throws RecognitionException {
        IfstatContext _localctx = new IfstatContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_ifstat);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(160);
                expr();
                setState(161);
                match(ENDST);
                setState(162);
                match(ORLY);
                setState(163);
                match(ENDST);
                setState(164);
                match(YARLY);
                setState(165);
                match(ENDST);
                setState(166);
                block();
                setState(174);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == MEBBE) {
                    {
                        {
                            setState(167);
                            match(MEBBE);
                            setState(168);
                            expr();
                            setState(169);
                            match(ENDST);
                            setState(170);
                            block();
                        }
                    }
                    setState(176);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(180);
                _la = _input.LA(1);
                if (_la == NOWAI) {
                    {
                        setState(177);
                        match(NOWAI);
                        setState(178);
                        match(ENDST);
                        setState(179);
                        block();
                    }
                }

                setState(182);
                match(OIC);
                setState(183);
                match(ENDST);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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

        public List<TerminalNode> ENDST() {
            return getTokens(lolcodeParser.ENDST);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode OMGWTF() {
            return getToken(lolcodeParser.OMGWTF, 0);
        }

        public CaseblockContext caseblock(int i) {
            return getRuleContext(CaseblockContext.class, i);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public CasestatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_casestat;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitCasestat(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CasestatContext casestat() throws RecognitionException {
        CasestatContext _localctx = new CasestatContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_casestat);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(185);
                expr();
                setState(186);
                match(ENDST);
                setState(187);
                match(WTF);
                setState(188);
                match(ENDST);
                setState(192);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OMG) {
                    {
                        {
                            setState(189);
                            caseblock();
                        }
                    }
                    setState(194);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(198);
                _la = _input.LA(1);
                if (_la == OMGWTF) {
                    {
                        setState(195);
                        match(OMGWTF);
                        setState(196);
                        match(ENDST);
                        setState(197);
                        block();
                    }
                }

                setState(200);
                match(OIC);
                setState(201);
                match(ENDST);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CaseblockContext extends ParserRuleContext {
        public TerminalNode ENDST(int i) {
            return getToken(lolcodeParser.ENDST, i);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public List<TerminalNode> ENDST() {
            return getTokens(lolcodeParser.ENDST);
        }

        public TerminalNode OMG() {
            return getToken(lolcodeParser.OMG, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public CaseblockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_caseblock;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitCaseblock(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CaseblockContext caseblock() throws RecognitionException {
        CaseblockContext _localctx = new CaseblockContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_caseblock);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(203);
                match(OMG);
                setState(204);
                value();
                setState(205);
                match(ENDST);
                setState(207);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        setState(206);
                        block();
                    }
                    break;
                }
                setState(210);
                _la = _input.LA(1);
                if (_la == ENDST) {
                    {
                        setState(209);
                        match(ENDST);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LoopstatContext extends ParserRuleContext {
        public TerminalNode WHILE() {
            return getToken(lolcodeParser.WHILE, 0);
        }

        public TerminalNode ENDST(int i) {
            return getToken(lolcodeParser.ENDST, i);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public List<TerminalNode> ENDST() {
            return getTokens(lolcodeParser.ENDST);
        }

        public List<TerminalNode> ID() {
            return getTokens(lolcodeParser.ID);
        }

        public TerminalNode NERFIN() {
            return getToken(lolcodeParser.NERFIN, 0);
        }

        public TerminalNode UPPIN() {
            return getToken(lolcodeParser.UPPIN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode TIL() {
            return getToken(lolcodeParser.TIL, 0);
        }

        public TerminalNode ID(int i) {
            return getToken(lolcodeParser.ID, i);
        }

        public LoopstatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_loopstat;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitLoopstat(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LoopstatContext loopstat() throws RecognitionException {
        LoopstatContext _localctx = new LoopstatContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_loopstat);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(212);
                match(IMINYR);
                setState(213);
                match(ID);
                setState(219);
                _la = _input.LA(1);
                if (_la == UPPIN || _la == NERFIN) {
                    {
                        setState(214);
                        _la = _input.LA(1);
                        if (!(_la == UPPIN || _la == NERFIN)) {
                            _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(215);
                        match(YR);
                        setState(216);
                        match(ID);
                        setState(217);
                        _la = _input.LA(1);
                        if (!(_la == WHILE || _la == TIL)) {
                            _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(218);
                        expr();
                    }
                }

                setState(221);
                match(ENDST);
                setState(222);
                block();
                setState(223);
                match(IMOUTTAYR);
                setState(224);
                match(ID);
                setState(225);
                match(ENDST);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AssstatContext extends ParserRuleContext {
        public TerminalNode ENDST() {
            return getToken(lolcodeParser.ENDST, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(lolcodeParser.ID, 0);
        }

        public AssstatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assstat;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitAssstat(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AssstatContext assstat() throws RecognitionException {
        AssstatContext _localctx = new AssstatContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_assstat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(227);
                match(ID);
                setState(228);
                match(R);
                setState(229);
                expr();
                setState(230);
                match(ENDST);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VisstatContext extends ParserRuleContext {
        public TerminalNode ENDST() {
            return getToken(lolcodeParser.ENDST, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public VisstatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_visstat;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitVisstat(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VisstatContext visstat() throws RecognitionException {
        VisstatContext _localctx = new VisstatContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_visstat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(232);
                match(VISIBLE);
                setState(233);
                expr();
                setState(234);
                match(ENDST);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GimstatContext extends ParserRuleContext {
        public TerminalNode ENDST() {
            return getToken(lolcodeParser.ENDST, 0);
        }

        public TerminalNode ID() {
            return getToken(lolcodeParser.ID, 0);
        }

        public GimstatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_gimstat;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitGimstat(this);
            else return visitor.visitChildren(this);
        }
    }

    public final GimstatContext gimstat() throws RecognitionException {
        GimstatContext _localctx = new GimstatContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_gimstat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(236);
                match(GIMMEH);
                setState(237);
                match(ID);
                setState(238);
                match(ENDST);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExprContext extends ParserRuleContext {
        public NequexprContext nequexpr() {
            return getRuleContext(NequexprContext.class, 0);
        }

        public SubexprContext subexpr() {
            return getRuleContext(SubexprContext.class, 0);
        }

        public OneofexprContext oneofexpr() {
            return getRuleContext(OneofexprContext.class, 0);
        }

        public AddexprContext addexpr() {
            return getRuleContext(AddexprContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(lolcodeParser.ID, 0);
        }

        public FunexprContext funexpr() {
            return getRuleContext(FunexprContext.class, 0);
        }

        public DivexprContext divexpr() {
            return getRuleContext(DivexprContext.class, 0);
        }

        public MaxexprContext maxexpr() {
            return getRuleContext(MaxexprContext.class, 0);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public ArrayGetContext arrayGet() {
            return getRuleContext(ArrayGetContext.class, 0);
        }

        public MinexprContext minexpr() {
            return getRuleContext(MinexprContext.class, 0);
        }

        public BothofexprContext bothofexpr() {
            return getRuleContext(BothofexprContext.class, 0);
        }

        public ModexprContext modexpr() {
            return getRuleContext(ModexprContext.class, 0);
        }

        public EquexprContext equexpr() {
            return getRuleContext(EquexprContext.class, 0);
        }

        public ArrayPutContext arrayPut() {
            return getRuleContext(ArrayPutContext.class, 0);
        }

        public EitherexprContext eitherexpr() {
            return getRuleContext(EitherexprContext.class, 0);
        }

        public MultexprContext multexpr() {
            return getRuleContext(MultexprContext.class, 0);
        }

        public NotexprContext notexpr() {
            return getRuleContext(NotexprContext.class, 0);
        }

        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExprContext expr() throws RecognitionException {
        ExprContext _localctx = new ExprContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_expr);
        try {
            setState(258);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(240);
                    funexpr();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(241);
                    arrayGet();
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(242);
                    arrayPut();
                }
                break;

                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(243);
                    notexpr();
                }
                break;

                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(244);
                    multexpr();
                }
                break;

                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(245);
                    divexpr();
                }
                break;

                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(246);
                    modexpr();
                }
                break;

                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(247);
                    addexpr();
                }
                break;

                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(248);
                    subexpr();
                }
                break;

                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(249);
                    maxexpr();
                }
                break;

                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(250);
                    minexpr();
                }
                break;

                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(251);
                    bothofexpr();
                }
                break;

                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(252);
                    eitherexpr();
                }
                break;

                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(253);
                    oneofexpr();
                }
                break;

                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(254);
                    equexpr();
                }
                break;

                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(255);
                    nequexpr();
                }
                break;

                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(256);
                    match(ID);
                }
                break;

                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(257);
                    value();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FunexprContext extends ParserRuleContext {
        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        public TerminalNode ENDST() {
            return getToken(lolcodeParser.ENDST, 0);
        }

        public TerminalNode MKAY() {
            return getToken(lolcodeParser.MKAY, 0);
        }

        public TerminalNode ID() {
            return getToken(lolcodeParser.ID, 0);
        }

        public FunexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitFunexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunexprContext funexpr() throws RecognitionException {
        FunexprContext _localctx = new FunexprContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_funexpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(260);
                match(ID);
                setState(262);
                _la = _input.LA(1);
                if (_la == YR) {
                    {
                        setState(261);
                        exprList();
                    }
                }

                setState(264);
                match(MKAY);
                setState(266);
                switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                    case 1: {
                        setState(265);
                        match(ENDST);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NotexprContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public NotexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_notexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitNotexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NotexprContext notexpr() throws RecognitionException {
        NotexprContext _localctx = new NotexprContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_notexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(268);
                match(NOT);
                setState(269);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MultexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public MultexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_multexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitMultexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MultexprContext multexpr() throws RecognitionException {
        MultexprContext _localctx = new MultexprContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_multexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(271);
                match(PRODUKTOF);
                setState(272);
                expr();
                setState(273);
                match(AN);
                setState(274);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DivexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public DivexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_divexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitDivexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DivexprContext divexpr() throws RecognitionException {
        DivexprContext _localctx = new DivexprContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_divexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(276);
                match(QUOSHUNTOF);
                setState(277);
                expr();
                setState(278);
                match(AN);
                setState(279);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ModexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public ModexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_modexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitModexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ModexprContext modexpr() throws RecognitionException {
        ModexprContext _localctx = new ModexprContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_modexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(281);
                match(MODOF);
                setState(282);
                expr();
                setState(283);
                match(AN);
                setState(284);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AddexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public AddexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_addexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitAddexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AddexprContext addexpr() throws RecognitionException {
        AddexprContext _localctx = new AddexprContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_addexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(286);
                match(SUMOF);
                setState(287);
                expr();
                setState(288);
                match(AN);
                setState(289);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SubexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public SubexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_subexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitSubexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SubexprContext subexpr() throws RecognitionException {
        SubexprContext _localctx = new SubexprContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_subexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(291);
                match(DIFFOF);
                setState(292);
                expr();
                setState(293);
                match(AN);
                setState(294);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MaxexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public MaxexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_maxexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitMaxexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MaxexprContext maxexpr() throws RecognitionException {
        MaxexprContext _localctx = new MaxexprContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_maxexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(296);
                match(BIGGROF);
                setState(297);
                expr();
                setState(298);
                match(AN);
                setState(299);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MinexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public MinexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_minexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitMinexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MinexprContext minexpr() throws RecognitionException {
        MinexprContext _localctx = new MinexprContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_minexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(301);
                match(SMALLROF);
                setState(302);
                expr();
                setState(303);
                match(AN);
                setState(304);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BothofexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public BothofexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bothofexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitBothofexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BothofexprContext bothofexpr() throws RecognitionException {
        BothofexprContext _localctx = new BothofexprContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_bothofexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(306);
                match(BOTHOF);
                setState(307);
                expr();
                setState(308);
                match(AN);
                setState(309);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EitherexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public EitherexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_eitherexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitEitherexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final EitherexprContext eitherexpr() throws RecognitionException {
        EitherexprContext _localctx = new EitherexprContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_eitherexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(311);
                match(EITHEROF);
                setState(312);
                expr();
                setState(313);
                match(AN);
                setState(314);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OneofexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public OneofexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oneofexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitOneofexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OneofexprContext oneofexpr() throws RecognitionException {
        OneofexprContext _localctx = new OneofexprContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_oneofexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(316);
                match(ONEOF);
                setState(317);
                expr();
                setState(318);
                match(AN);
                setState(319);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EquexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public EquexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_equexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitEquexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final EquexprContext equexpr() throws RecognitionException {
        EquexprContext _localctx = new EquexprContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_equexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(321);
                match(BOTHSAEM);
                setState(322);
                expr();
                setState(323);
                match(AN);
                setState(324);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NequexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public NequexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nequexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitNequexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NequexprContext nequexpr() throws RecognitionException {
        NequexprContext _localctx = new NequexprContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_nequexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(326);
                match(DIFFRINT);
                setState(327);
                expr();
                setState(328);
                match(AN);
                setState(329);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExprListContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public ExprListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exprList;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitExprList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExprListContext exprList() throws RecognitionException {
        ExprListContext _localctx = new ExprListContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_exprList);
        int _la;
        try {
            setState(342);
            switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(331);
                    match(YR);
                    setState(332);
                    expr();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(333);
                    match(YR);
                    setState(334);
                    expr();
                    setState(339);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == NYR) {
                        {
                            {
                                setState(335);
                                match(NYR);
                                setState(336);
                                expr();
                            }
                        }
                        setState(341);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RetpartContext extends ParserRuleContext {
        public TerminalNode ENDST() {
            return getToken(lolcodeParser.ENDST, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public RetpartContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_retpart;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitRetpart(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RetpartContext retpart() throws RecognitionException {
        RetpartContext _localctx = new RetpartContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_retpart);
        try {
            setState(350);
            switch (_input.LA(1)) {
                case FOUNDYR:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(344);
                    match(FOUNDYR);
                    setState(345);
                    expr();
                    setState(346);
                    match(ENDST);
                }
                break;
                case GTFO:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(348);
                    match(GTFO);
                    setState(349);
                    match(ENDST);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ValueContext extends ParserRuleContext {
        public TerminalNode BOOL() {
            return getToken(lolcodeParser.BOOL, 0);
        }

        public TerminalNode FLOAT() {
            return getToken(lolcodeParser.FLOAT, 0);
        }

        public TerminalNode INT() {
            return getToken(lolcodeParser.INT, 0);
        }

        public TerminalNode STRING() {
            return getToken(lolcodeParser.STRING, 0);
        }

        public ValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_value;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ValueContext value() throws RecognitionException {
        ValueContext _localctx = new ValueContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_value);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(352);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL))) != 0))) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3E\u0165\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\2\3" +
                    "\2\3\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4c\n" +
                    "\4\3\4\3\4\3\5\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3" +
                    "\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t" +
                    "\7\t\u0087\n\t\f\t\16\t\u008a\13\t\3\n\3\n\3\13\7\13\u008f\n\13\f\13\16" +
                    "\13\u0092\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009e\n\f" +
                    "\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\7\16\u00af\n\16\f\16\16\16\u00b2\13\16\3\16\3\16\3\16\5\16\u00b7\n" +
                    "\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00c1\n\17\f\17\16\17" +
                    "\u00c4\13\17\3\17\3\17\3\17\5\17\u00c9\n\17\3\17\3\17\3\17\3\20\3\20\3" +
                    "\20\3\20\5\20\u00d2\n\20\3\20\5\20\u00d5\n\20\3\21\3\21\3\21\3\21\3\21" +
                    "\3\21\3\21\5\21\u00de\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22" +
                    "\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25" +
                    "\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25" +
                    "\5\25\u0105\n\25\3\26\3\26\5\26\u0109\n\26\3\26\3\26\5\26\u010d\n\26\3" +
                    "\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3" +
                    "\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3" +
                    "\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3" +
                    "\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3" +
                    "$\3$\3$\3$\3$\3$\7$\u0154\n$\f$\16$\u0157\13$\5$\u0159\n$\3%\3%\3%\3%" +
                    "\3%\3%\5%\u0161\n%\3&\3&\3&\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36" +
                    " \"$&(*,.\60\62\64\668:<>@BDFHJ\2\5\3\2&\'\3\2\16\17\3\2>A\u016b\2O\3" +
                    "\2\2\2\4T\3\2\2\2\6^\3\2\2\2\bf\3\2\2\2\np\3\2\2\2\ft\3\2\2\2\16z\3\2" +
                    "\2\2\20\u0082\3\2\2\2\22\u008b\3\2\2\2\24\u0090\3\2\2\2\26\u009d\3\2\2" +
                    "\2\30\u009f\3\2\2\2\32\u00a2\3\2\2\2\34\u00bb\3\2\2\2\36\u00cd\3\2\2\2" +
                    " \u00d6\3\2\2\2\"\u00e5\3\2\2\2$\u00ea\3\2\2\2&\u00ee\3\2\2\2(\u0104\3" +
                    "\2\2\2*\u0106\3\2\2\2,\u010e\3\2\2\2.\u0111\3\2\2\2\60\u0116\3\2\2\2\62" +
                    "\u011b\3\2\2\2\64\u0120\3\2\2\2\66\u0125\3\2\2\28\u012a\3\2\2\2:\u012f" +
                    "\3\2\2\2<\u0134\3\2\2\2>\u0139\3\2\2\2@\u013e\3\2\2\2B\u0143\3\2\2\2D" +
                    "\u0148\3\2\2\2F\u0158\3\2\2\2H\u0160\3\2\2\2J\u0162\3\2\2\2LN\5\b\5\2" +
                    "ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\5\4\3\2" +
                    "S\3\3\2\2\2TU\7\f\2\2UY\7C\2\2VX\5\26\f\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2" +
                    "\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\r\2\2]\5\3\2\2\2^_\7\66\2\2_b\7" +
                    "B\2\2`a\7\34\2\2ac\5(\25\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7C\2\2e\7\3" +
                    "\2\2\2fg\7\63\2\2gi\7B\2\2hj\5\20\t\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl" +
                    "\7C\2\2lm\5\24\13\2mn\7\64\2\2no\7C\2\2o\t\3\2\2\2pq\7\4\2\2qr\7B\2\2" +
                    "rs\7C\2\2s\13\3\2\2\2tu\7\3\2\2uv\7B\2\2vw\7\5\2\2wx\5(\25\2xy\7C\2\2" +
                    "y\r\3\2\2\2z{\7;\2\2{|\5(\25\2|}\7<\2\2}~\7B\2\2~\177\7=\2\2\177\u0080" +
                    "\5(\25\2\u0080\u0081\7C\2\2\u0081\17\3\2\2\2\u0082\u0083\7\61\2\2\u0083" +
                    "\u0088\5\22\n\2\u0084\u0085\7\62\2\2\u0085\u0087\5\22\n\2\u0086\u0084" +
                    "\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089" +
                    "\21\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7B\2\2\u008c\23\3\2\2\2\u008d" +
                    "\u008f\5\26\f\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3" +
                    "\2\2\2\u0090\u0091\3\2\2\2\u0091\25\3\2\2\2\u0092\u0090\3\2\2\2\u0093" +
                    "\u009e\5\6\4\2\u0094\u009e\5\n\6\2\u0095\u009e\5\32\16\2\u0096\u009e\5" +
                    "\34\17\2\u0097\u009e\5 \21\2\u0098\u009e\5\"\22\2\u0099\u009e\5H%\2\u009a" +
                    "\u009e\5$\23\2\u009b\u009e\5&\24\2\u009c\u009e\5\30\r\2\u009d\u0093\3" +
                    "\2\2\2\u009d\u0094\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0096\3\2\2\2\u009d" +
                    "\u0097\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2" +
                    "\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a0" +
                    "\5(\25\2\u00a0\u00a1\7C\2\2\u00a1\31\3\2\2\2\u00a2\u00a3\5(\25\2\u00a3" +
                    "\u00a4\7C\2\2\u00a4\u00a5\7\20\2\2\u00a5\u00a6\7C\2\2\u00a6\u00a7\7\21" +
                    "\2\2\u00a7\u00a8\7C\2\2\u00a8\u00b0\5\24\13\2\u00a9\u00aa\7\22\2\2\u00aa" +
                    "\u00ab\5(\25\2\u00ab\u00ac\7C\2\2\u00ac\u00ad\5\24\13\2\u00ad\u00af\3" +
                    "\2\2\2\u00ae\u00a9\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0" +
                    "\u00b1\3\2\2\2\u00b1\u00b6\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\23" +
                    "\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b7\5\24\13\2\u00b6\u00b3\3\2\2\2\u00b6" +
                    "\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\24\2\2\u00b9\u00ba\7" +
                    "C\2\2\u00ba\33\3\2\2\2\u00bb\u00bc\5(\25\2\u00bc\u00bd\7C\2\2\u00bd\u00be" +
                    "\7\6\2\2\u00be\u00c2\7C\2\2\u00bf\u00c1\5\36\20\2\u00c0\u00bf\3\2\2\2" +
                    "\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c8" +
                    "\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\26\2\2\u00c6\u00c7\7C\2\2\u00c7" +
                    "\u00c9\5\24\13\2\u00c8\u00c5\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3" +
                    "\2\2\2\u00ca\u00cb\7\24\2\2\u00cb\u00cc\7C\2\2\u00cc\35\3\2\2\2\u00cd" +
                    "\u00ce\7\25\2\2\u00ce\u00cf\5J&\2\u00cf\u00d1\7C\2\2\u00d0\u00d2\5\24" +
                    "\13\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3" +
                    "\u00d5\7C\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\37\3\2\2\2" +
                    "\u00d6\u00d7\7(\2\2\u00d7\u00dd\7B\2\2\u00d8\u00d9\t\2\2\2\u00d9\u00da" +
                    "\7\61\2\2\u00da\u00db\7B\2\2\u00db\u00dc\t\3\2\2\u00dc\u00de\5(\25\2\u00dd" +
                    "\u00d8\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7C" +
                    "\2\2\u00e0\u00e1\5\24\13\2\u00e1\u00e2\7)\2\2\u00e2\u00e3\7B\2\2\u00e3" +
                    "\u00e4\7C\2\2\u00e4!\3\2\2\2\u00e5\u00e6\7B\2\2\u00e6\u00e7\7\65\2\2\u00e7" +
                    "\u00e8\5(\25\2\u00e8\u00e9\7C\2\2\u00e9#\3\2\2\2\u00ea\u00eb\78\2\2\u00eb" +
                    "\u00ec\5(\25\2\u00ec\u00ed\7C\2\2\u00ed%\3\2\2\2\u00ee\u00ef\79\2\2\u00ef" +
                    "\u00f0\7B\2\2\u00f0\u00f1\7C\2\2\u00f1\'\3\2\2\2\u00f2\u0105\5*\26\2\u00f3" +
                    "\u0105\5\f\7\2\u00f4\u0105\5\16\b\2\u00f5\u0105\5,\27\2\u00f6\u0105\5" +
                    ".\30\2\u00f7\u0105\5\60\31\2\u00f8\u0105\5\62\32\2\u00f9\u0105\5\64\33" +
                    "\2\u00fa\u0105\5\66\34\2\u00fb\u0105\58\35\2\u00fc\u0105\5:\36\2\u00fd" +
                    "\u0105\5<\37\2\u00fe\u0105\5> \2\u00ff\u0105\5@!\2\u0100\u0105\5B\"\2" +
                    "\u0101\u0105\5D#\2\u0102\u0105\7B\2\2\u0103\u0105\5J&\2\u0104\u00f2\3" +
                    "\2\2\2\u0104\u00f3\3\2\2\2\u0104\u00f4\3\2\2\2\u0104\u00f5\3\2\2\2\u0104" +
                    "\u00f6\3\2\2\2\u0104\u00f7\3\2\2\2\u0104\u00f8\3\2\2\2\u0104\u00f9\3\2" +
                    "\2\2\u0104\u00fa\3\2\2\2\u0104\u00fb\3\2\2\2\u0104\u00fc\3\2\2\2\u0104" +
                    "\u00fd\3\2\2\2\u0104\u00fe\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2" +
                    "\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105" +
                    ")\3\2\2\2\u0106\u0108\7B\2\2\u0107\u0109\5F$\2\u0108\u0107\3\2\2\2\u0108" +
                    "\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\7\67\2\2\u010b\u010d\7" +
                    "C\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d+\3\2\2\2\u010e\u010f" +
                    "\7/\2\2\u010f\u0110\5(\25\2\u0110-\3\2\2\2\u0111\u0112\7 \2\2\u0112\u0113" +
                    "\5(\25\2\u0113\u0114\7\n\2\2\u0114\u0115\5(\25\2\u0115/\3\2\2\2\u0116" +
                    "\u0117\7!\2\2\u0117\u0118\5(\25\2\u0118\u0119\7\n\2\2\u0119\u011a\5(\25" +
                    "\2\u011a\61\3\2\2\2\u011b\u011c\7\"\2\2\u011c\u011d\5(\25\2\u011d\u011e" +
                    "\7\n\2\2\u011e\u011f\5(\25\2\u011f\63\3\2\2\2\u0120\u0121\7#\2\2\u0121" +
                    "\u0122\5(\25\2\u0122\u0123\7\n\2\2\u0123\u0124\5(\25\2\u0124\65\3\2\2" +
                    "\2\u0125\u0126\7$\2\2\u0126\u0127\5(\25\2\u0127\u0128\7\n\2\2\u0128\u0129" +
                    "\5(\25\2\u0129\67\3\2\2\2\u012a\u012b\7\13\2\2\u012b\u012c\5(\25\2\u012c" +
                    "\u012d\7\n\2\2\u012d\u012e\5(\25\2\u012e9\3\2\2\2\u012f\u0130\7\37\2\2" +
                    "\u0130\u0131\5(\25\2\u0131\u0132\7\n\2\2\u0132\u0133\5(\25\2\u0133;\3" +
                    "\2\2\2\u0134\u0135\7.\2\2\u0135\u0136\5(\25\2\u0136\u0137\7\n\2\2\u0137" +
                    "\u0138\5(\25\2\u0138=\3\2\2\2\u0139\u013a\7-\2\2\u013a\u013b\5(\25\2\u013b" +
                    "\u013c\7\n\2\2\u013c\u013d\5(\25\2\u013d?\3\2\2\2\u013e\u013f\7+\2\2\u013f" +
                    "\u0140\5(\25\2\u0140\u0141\7\n\2\2\u0141\u0142\5(\25\2\u0142A\3\2\2\2" +
                    "\u0143\u0144\7\35\2\2\u0144\u0145\5(\25\2\u0145\u0146\7\n\2\2\u0146\u0147" +
                    "\5(\25\2\u0147C\3\2\2\2\u0148\u0149\7\36\2\2\u0149\u014a\5(\25\2\u014a" +
                    "\u014b\7\n\2\2\u014b\u014c\5(\25\2\u014cE\3\2\2\2\u014d\u014e\7\61\2\2" +
                    "\u014e\u0159\5(\25\2\u014f\u0150\7\61\2\2\u0150\u0155\5(\25\2\u0151\u0152" +
                    "\7\62\2\2\u0152\u0154\5(\25\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2" +
                    "\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155" +
                    "\3\2\2\2\u0158\u014d\3\2\2\2\u0158\u014f\3\2\2\2\u0159G\3\2\2\2\u015a" +
                    "\u015b\7:\2\2\u015b\u015c\5(\25\2\u015c\u015d\7C\2\2\u015d\u0161\3\2\2" +
                    "\2\u015e\u015f\7\60\2\2\u015f\u0161\7C\2\2\u0160\u015a\3\2\2\2\u0160\u015e" +
                    "\3\2\2\2\u0161I\3\2\2\2\u0162\u0163\t\4\2\2\u0163K\3\2\2\2\26OYbi\u0088" +
                    "\u0090\u009d\u00b0\u00b6\u00c2\u00c8\u00d1\u00d4\u00dd\u0104\u0108\u010c" +
                    "\u0155\u0158\u0160";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}