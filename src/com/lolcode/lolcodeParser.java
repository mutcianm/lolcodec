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
            T__4 = 1, T__3 = 2, T__2 = 3, T__1 = 4, T__0 = 5, WTF = 6, WRK = 7, MAEK = 8, A = 9, AN = 10,
            BIGGROF = 11, HAI = 12, KTHXBYE = 13, WHILE = 14, TIL = 15, ORLY = 16, YARLY = 17, MEBBE = 18,
            NOWAI = 19, OIC = 20, OMG = 21, OMGWTF = 22, YARN = 23, NUMBR = 24, NUMBAR = 25, TROOF = 26,
            NOOB = 27, ITZ = 28, BOTHSAEM = 29, DIFFRINT = 30, SMALLROF = 31, PRODUKTOF = 32,
            QUOSHUNTOF = 33, MODOF = 34, SUMOF = 35, DIFFOF = 36, SMOOSH = 37, UPPIN = 38, NERFIN = 39,
            IMINYR = 40, IMOUTTAYR = 41, ANYOF = 42, ONEOF = 43, ALLOF = 44, EITHEROF = 45, BOTHOF = 46,
            NOT = 47, GTFO = 48, YR = 49, NYR = 50, HOWDUZ = 51, IFUSAY = 52, R = 53, IHAS = 54, MKAY = 55,
            VISIBLE = 56, GIMMEH = 57, FOUNDYR = 58, INT = 59, STRING = 60, FLOAT = 61, BOOL = 62,
            ID = 63, ENDST = 64, WS = 65, SL_COMMENT = 66;
    public static final String[] tokenNames = {
            "<INVALID>", "'TAKE FROM'", "'I HAS A BOX'", "'N LABEL AS'", "'LABELED'",
            "'PUTIN'", "'WTF?'", "'WRK'", "'MAEK'", "'A'", "'AN'", "'BIGGR OF'", "'HAI'",
            "'KTHXBYE'", "'WILE'", "'TIL'", "'ORLY'", "'YRLY'", "'MEBBE'", "'NOWAI'",
            "'OIC'", "'OMG'", "'OMGWTF'", "'YARN'", "'NUMBR'", "'NUMBAR'", "'TROOF'",
            "'NOOB'", "'ITZ'", "'BOTH SAEM'", "'DIFFRINT'", "'SMALLR OF'", "'PRODUKT OF'",
            "'QUOSHUNT OF'", "'MOD OF'", "'SUM OF'", "'DIFF OF'", "'SMOOSH'", "'UPPIN'",
            "'NERFIN'", "'IM IN YR'", "'IM OUTTA YR'", "'ANY OF'", "'ONE OF'", "'ALL OF'",
            "'EITHER OF'", "'BOTH OF'", "'NOT'", "'GTFO'", "'YR'", "'N YR'", "'HOW DUZ I'",
            "'IF U SAY SO'", "'R'", "'I HAS A'", "'MKAY'", "'VISIBLE'", "'GIMMEH'",
            "'FOUND YR'", "INT", "STRING", "FLOAT", "BOOL", "ID", "ENDST", "WS", "SL_COMMENT"
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
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << GTFO) | (1L << IHAS) | (1L << VISIBLE) | (1L << GIMMEH) | (1L << FOUNDYR) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL) | (1L << ID))) != 0)) {
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
                match(4);
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
        public TerminalNode ENDST() {
            return getToken(lolcodeParser.ENDST, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(lolcodeParser.ID, 0);
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
                match(5);
                setState(121);
                match(ID);
                setState(122);
                match(3);
                setState(123);
                expr();
                setState(124);
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
                setState(126);
                match(YR);
                setState(127);
                formalParameter();
                setState(132);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == NYR) {
                    {
                        {
                            setState(128);
                            match(NYR);
                            setState(129);
                            formalParameter();
                        }
                    }
                    setState(134);
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
                setState(135);
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
                setState(140);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << GTFO) | (1L << IHAS) | (1L << VISIBLE) | (1L << GIMMEH) | (1L << FOUNDYR) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(137);
                            stat();
                        }
                    }
                    setState(142);
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
            setState(153);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(143);
                    varDecl();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(144);
                    arrayDecl();
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(145);
                    ifstat();
                }
                break;

                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(146);
                    casestat();
                }
                break;

                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(147);
                    loopstat();
                }
                break;

                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(148);
                    assstat();
                }
                break;

                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(149);
                    retpart();
                }
                break;

                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(150);
                    visstat();
                }
                break;

                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(151);
                    gimstat();
                }
                break;

                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(152);
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
                setState(155);
                expr();
                setState(156);
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
                setState(158);
                expr();
                setState(159);
                match(ENDST);
                setState(160);
                match(ORLY);
                setState(161);
                match(ENDST);
                setState(162);
                match(YARLY);
                setState(163);
                match(ENDST);
                setState(164);
                block();
                setState(172);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == MEBBE) {
                    {
                        {
                            setState(165);
                            match(MEBBE);
                            setState(166);
                            expr();
                            setState(167);
                            match(ENDST);
                            setState(168);
                            block();
                        }
                    }
                    setState(174);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(178);
                _la = _input.LA(1);
                if (_la == NOWAI) {
                    {
                        setState(175);
                        match(NOWAI);
                        setState(176);
                        match(ENDST);
                        setState(177);
                        block();
                    }
                }

                setState(180);
                match(OIC);
                setState(181);
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
                setState(183);
                expr();
                setState(184);
                match(ENDST);
                setState(185);
                match(WTF);
                setState(186);
                match(ENDST);
                setState(190);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OMG) {
                    {
                        {
                            setState(187);
                            caseblock();
                        }
                    }
                    setState(192);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(196);
                _la = _input.LA(1);
                if (_la == OMGWTF) {
                    {
                        setState(193);
                        match(OMGWTF);
                        setState(194);
                        match(ENDST);
                        setState(195);
                        block();
                    }
                }

                setState(198);
                match(OIC);
                setState(199);
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
                setState(201);
                match(OMG);
                setState(202);
                value();
                setState(203);
                match(ENDST);
                setState(205);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        setState(204);
                        block();
                    }
                    break;
                }
                setState(208);
                _la = _input.LA(1);
                if (_la == ENDST) {
                    {
                        setState(207);
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
                setState(210);
                match(IMINYR);
                setState(211);
                match(ID);
                setState(217);
                _la = _input.LA(1);
                if (_la == UPPIN || _la == NERFIN) {
                    {
                        setState(212);
                        _la = _input.LA(1);
                        if (!(_la == UPPIN || _la == NERFIN)) {
                            _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(213);
                        match(YR);
                        setState(214);
                        match(ID);
                        setState(215);
                        _la = _input.LA(1);
                        if (!(_la == WHILE || _la == TIL)) {
                            _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(216);
                        expr();
                    }
                }

                setState(219);
                match(ENDST);
                setState(220);
                block();
                setState(221);
                match(IMOUTTAYR);
                setState(222);
                match(ID);
                setState(223);
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
                setState(225);
                match(ID);
                setState(226);
                match(R);
                setState(227);
                expr();
                setState(228);
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
                setState(230);
                match(VISIBLE);
                setState(231);
                expr();
                setState(232);
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
                setState(234);
                match(GIMMEH);
                setState(235);
                match(ID);
                setState(236);
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
            setState(256);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(238);
                    funexpr();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(239);
                    arrayGet();
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(240);
                    arrayPut();
                }
                break;

                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(241);
                    notexpr();
                }
                break;

                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(242);
                    multexpr();
                }
                break;

                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(243);
                    divexpr();
                }
                break;

                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(244);
                    modexpr();
                }
                break;

                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(245);
                    addexpr();
                }
                break;

                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(246);
                    subexpr();
                }
                break;

                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(247);
                    maxexpr();
                }
                break;

                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(248);
                    minexpr();
                }
                break;

                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(249);
                    bothofexpr();
                }
                break;

                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(250);
                    eitherexpr();
                }
                break;

                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(251);
                    oneofexpr();
                }
                break;

                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(252);
                    equexpr();
                }
                break;

                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(253);
                    nequexpr();
                }
                break;

                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(254);
                    match(ID);
                }
                break;

                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(255);
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
                setState(258);
                match(ID);
                setState(260);
                _la = _input.LA(1);
                if (_la == YR) {
                    {
                        setState(259);
                        exprList();
                    }
                }

                setState(262);
                match(MKAY);
                setState(264);
                switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                    case 1: {
                        setState(263);
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
                setState(266);
                match(NOT);
                setState(267);
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
                setState(269);
                match(PRODUKTOF);
                setState(270);
                expr();
                setState(271);
                match(AN);
                setState(272);
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
                setState(274);
                match(QUOSHUNTOF);
                setState(275);
                expr();
                setState(276);
                match(AN);
                setState(277);
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
                setState(279);
                match(MODOF);
                setState(280);
                expr();
                setState(281);
                match(AN);
                setState(282);
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
                setState(284);
                match(SUMOF);
                setState(285);
                expr();
                setState(286);
                match(AN);
                setState(287);
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
                setState(289);
                match(DIFFOF);
                setState(290);
                expr();
                setState(291);
                match(AN);
                setState(292);
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
                setState(294);
                match(BIGGROF);
                setState(295);
                expr();
                setState(296);
                match(AN);
                setState(297);
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
                setState(299);
                match(SMALLROF);
                setState(300);
                expr();
                setState(301);
                match(AN);
                setState(302);
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
                setState(304);
                match(BOTHOF);
                setState(305);
                expr();
                setState(306);
                match(AN);
                setState(307);
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
                setState(309);
                match(EITHEROF);
                setState(310);
                expr();
                setState(311);
                match(AN);
                setState(312);
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
                setState(314);
                match(ONEOF);
                setState(315);
                expr();
                setState(316);
                match(AN);
                setState(317);
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
                setState(319);
                match(BOTHSAEM);
                setState(320);
                expr();
                setState(321);
                match(AN);
                setState(322);
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
                setState(324);
                match(DIFFRINT);
                setState(325);
                expr();
                setState(326);
                match(AN);
                setState(327);
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
            setState(340);
            switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(329);
                    match(YR);
                    setState(330);
                    expr();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(331);
                    match(YR);
                    setState(332);
                    expr();
                    setState(337);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == NYR) {
                        {
                            {
                                setState(333);
                                match(NYR);
                                setState(334);
                                expr();
                            }
                        }
                        setState(339);
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
            setState(348);
            switch (_input.LA(1)) {
                case FOUNDYR:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(342);
                    match(FOUNDYR);
                    setState(343);
                    expr();
                    setState(344);
                    match(ENDST);
                }
                break;
                case GTFO:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(346);
                    match(GTFO);
                    setState(347);
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
                setState(350);
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
            "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3D\u0163\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\2\3" +
                    "\2\3\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4c\n" +
                    "\4\3\4\3\4\3\5\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3" +
                    "\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u0085" +
                    "\n\t\f\t\16\t\u0088\13\t\3\n\3\n\3\13\7\13\u008d\n\13\f\13\16\13\u0090" +
                    "\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009c\n\f\3\r\3\r\3" +
                    "\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ad" +
                    "\n\16\f\16\16\16\u00b0\13\16\3\16\3\16\3\16\5\16\u00b5\n\16\3\16\3\16" +
                    "\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00bf\n\17\f\17\16\17\u00c2\13\17" +
                    "\3\17\3\17\3\17\5\17\u00c7\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20" +
                    "\u00d0\n\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5" +
                    "\21\u00dc\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22" +
                    "\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25" +
                    "\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0103" +
                    "\n\25\3\26\3\26\5\26\u0107\n\26\3\26\3\26\5\26\u010b\n\26\3\27\3\27\3" +
                    "\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3" +
                    "\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3" +
                    "\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 " +
                    "\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3" +
                    "$\3$\3$\7$\u0152\n$\f$\16$\u0155\13$\5$\u0157\n$\3%\3%\3%\3%\3%\3%\5%" +
                    "\u015f\n%\3&\3&\3&\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*," +
                    ".\60\62\64\668:<>@BDFHJ\2\5\3\2()\3\2\20\21\3\2=@\u0169\2O\3\2\2\2\4T" +
                    "\3\2\2\2\6^\3\2\2\2\bf\3\2\2\2\np\3\2\2\2\ft\3\2\2\2\16z\3\2\2\2\20\u0080" +
                    "\3\2\2\2\22\u0089\3\2\2\2\24\u008e\3\2\2\2\26\u009b\3\2\2\2\30\u009d\3" +
                    "\2\2\2\32\u00a0\3\2\2\2\34\u00b9\3\2\2\2\36\u00cb\3\2\2\2 \u00d4\3\2\2" +
                    "\2\"\u00e3\3\2\2\2$\u00e8\3\2\2\2&\u00ec\3\2\2\2(\u0102\3\2\2\2*\u0104" +
                    "\3\2\2\2,\u010c\3\2\2\2.\u010f\3\2\2\2\60\u0114\3\2\2\2\62\u0119\3\2\2" +
                    "\2\64\u011e\3\2\2\2\66\u0123\3\2\2\28\u0128\3\2\2\2:\u012d\3\2\2\2<\u0132" +
                    "\3\2\2\2>\u0137\3\2\2\2@\u013c\3\2\2\2B\u0141\3\2\2\2D\u0146\3\2\2\2F" +
                    "\u0156\3\2\2\2H\u015e\3\2\2\2J\u0160\3\2\2\2LN\5\b\5\2ML\3\2\2\2NQ\3\2" +
                    "\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\5\4\3\2S\3\3\2\2\2TU\7" +
                    "\16\2\2UY\7B\2\2VX\5\26\f\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\" +
                    "\3\2\2\2[Y\3\2\2\2\\]\7\17\2\2]\5\3\2\2\2^_\78\2\2_b\7A\2\2`a\7\36\2\2" +
                    "ac\5(\25\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7B\2\2e\7\3\2\2\2fg\7\65\2" +
                    "\2gi\7A\2\2hj\5\20\t\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7B\2\2lm\5\24\13" +
                    "\2mn\7\66\2\2no\7B\2\2o\t\3\2\2\2pq\7\4\2\2qr\7A\2\2rs\7B\2\2s\13\3\2" +
                    "\2\2tu\7\3\2\2uv\7A\2\2vw\7\6\2\2wx\5(\25\2xy\7B\2\2y\r\3\2\2\2z{\7\7" +
                    "\2\2{|\7A\2\2|}\7\5\2\2}~\5(\25\2~\177\7B\2\2\177\17\3\2\2\2\u0080\u0081" +
                    "\7\63\2\2\u0081\u0086\5\22\n\2\u0082\u0083\7\64\2\2\u0083\u0085\5\22\n" +
                    "\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087" +
                    "\3\2\2\2\u0087\21\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7A\2\2\u008a" +
                    "\23\3\2\2\2\u008b\u008d\5\26\f\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2" +
                    "\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\25\3\2\2\2\u0090\u008e" +
                    "\3\2\2\2\u0091\u009c\5\6\4\2\u0092\u009c\5\n\6\2\u0093\u009c\5\32\16\2" +
                    "\u0094\u009c\5\34\17\2\u0095\u009c\5 \21\2\u0096\u009c\5\"\22\2\u0097" +
                    "\u009c\5H%\2\u0098\u009c\5$\23\2\u0099\u009c\5&\24\2\u009a\u009c\5\30" +
                    "\r\2\u009b\u0091\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u0093\3\2\2\2\u009b" +
                    "\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2" +
                    "\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c" +
                    "\27\3\2\2\2\u009d\u009e\5(\25\2\u009e\u009f\7B\2\2\u009f\31\3\2\2\2\u00a0" +
                    "\u00a1\5(\25\2\u00a1\u00a2\7B\2\2\u00a2\u00a3\7\22\2\2\u00a3\u00a4\7B" +
                    "\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6\7B\2\2\u00a6\u00ae\5\24\13\2\u00a7" +
                    "\u00a8\7\24\2\2\u00a8\u00a9\5(\25\2\u00a9\u00aa\7B\2\2\u00aa\u00ab\5\24" +
                    "\13\2\u00ab\u00ad\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae" +
                    "\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b4\3\2\2\2\u00b0\u00ae\3\2" +
                    "\2\2\u00b1\u00b2\7\25\2\2\u00b2\u00b3\7B\2\2\u00b3\u00b5\5\24\13\2\u00b4" +
                    "\u00b1\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\26" +
                    "\2\2\u00b7\u00b8\7B\2\2\u00b8\33\3\2\2\2\u00b9\u00ba\5(\25\2\u00ba\u00bb" +
                    "\7B\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00c0\7B\2\2\u00bd\u00bf\5\36\20\2\u00be" +
                    "\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2" +
                    "\2\2\u00c1\u00c6\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\30\2\2\u00c4" +
                    "\u00c5\7B\2\2\u00c5\u00c7\5\24\13\2\u00c6\u00c3\3\2\2\2\u00c6\u00c7\3" +
                    "\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\26\2\2\u00c9\u00ca\7B\2\2\u00ca" +
                    "\35\3\2\2\2\u00cb\u00cc\7\27\2\2\u00cc\u00cd\5J&\2\u00cd\u00cf\7B\2\2" +
                    "\u00ce\u00d0\5\24\13\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2" +
                    "\3\2\2\2\u00d1\u00d3\7B\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3" +
                    "\37\3\2\2\2\u00d4\u00d5\7*\2\2\u00d5\u00db\7A\2\2\u00d6\u00d7\t\2\2\2" +
                    "\u00d7\u00d8\7\63\2\2\u00d8\u00d9\7A\2\2\u00d9\u00da\t\3\2\2\u00da\u00dc" +
                    "\5(\25\2\u00db\u00d6\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd" +
                    "\u00de\7B\2\2\u00de\u00df\5\24\13\2\u00df\u00e0\7+\2\2\u00e0\u00e1\7A" +
                    "\2\2\u00e1\u00e2\7B\2\2\u00e2!\3\2\2\2\u00e3\u00e4\7A\2\2\u00e4\u00e5" +
                    "\7\67\2\2\u00e5\u00e6\5(\25\2\u00e6\u00e7\7B\2\2\u00e7#\3\2\2\2\u00e8" +
                    "\u00e9\7:\2\2\u00e9\u00ea\5(\25\2\u00ea\u00eb\7B\2\2\u00eb%\3\2\2\2\u00ec" +
                    "\u00ed\7;\2\2\u00ed\u00ee\7A\2\2\u00ee\u00ef\7B\2\2\u00ef\'\3\2\2\2\u00f0" +
                    "\u0103\5*\26\2\u00f1\u0103\5\f\7\2\u00f2\u0103\5\16\b\2\u00f3\u0103\5" +
                    ",\27\2\u00f4\u0103\5.\30\2\u00f5\u0103\5\60\31\2\u00f6\u0103\5\62\32\2" +
                    "\u00f7\u0103\5\64\33\2\u00f8\u0103\5\66\34\2\u00f9\u0103\58\35\2\u00fa" +
                    "\u0103\5:\36\2\u00fb\u0103\5<\37\2\u00fc\u0103\5> \2\u00fd\u0103\5@!\2" +
                    "\u00fe\u0103\5B\"\2\u00ff\u0103\5D#\2\u0100\u0103\7A\2\2\u0101\u0103\5" +
                    "J&\2\u0102\u00f0\3\2\2\2\u0102\u00f1\3\2\2\2\u0102\u00f2\3\2\2\2\u0102" +
                    "\u00f3\3\2\2\2\u0102\u00f4\3\2\2\2\u0102\u00f5\3\2\2\2\u0102\u00f6\3\2" +
                    "\2\2\u0102\u00f7\3\2\2\2\u0102\u00f8\3\2\2\2\u0102\u00f9\3\2\2\2\u0102" +
                    "\u00fa\3\2\2\2\u0102\u00fb\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2" +
                    "\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102" +
                    "\u0101\3\2\2\2\u0103)\3\2\2\2\u0104\u0106\7A\2\2\u0105\u0107\5F$\2\u0106" +
                    "\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\79" +
                    "\2\2\u0109\u010b\7B\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b" +
                    "+\3\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e\5(\25\2\u010e-\3\2\2\2\u010f" +
                    "\u0110\7\"\2\2\u0110\u0111\5(\25\2\u0111\u0112\7\f\2\2\u0112\u0113\5(" +
                    "\25\2\u0113/\3\2\2\2\u0114\u0115\7#\2\2\u0115\u0116\5(\25\2\u0116\u0117" +
                    "\7\f\2\2\u0117\u0118\5(\25\2\u0118\61\3\2\2\2\u0119\u011a\7$\2\2\u011a" +
                    "\u011b\5(\25\2\u011b\u011c\7\f\2\2\u011c\u011d\5(\25\2\u011d\63\3\2\2" +
                    "\2\u011e\u011f\7%\2\2\u011f\u0120\5(\25\2\u0120\u0121\7\f\2\2\u0121\u0122" +
                    "\5(\25\2\u0122\65\3\2\2\2\u0123\u0124\7&\2\2\u0124\u0125\5(\25\2\u0125" +
                    "\u0126\7\f\2\2\u0126\u0127\5(\25\2\u0127\67\3\2\2\2\u0128\u0129\7\r\2" +
                    "\2\u0129\u012a\5(\25\2\u012a\u012b\7\f\2\2\u012b\u012c\5(\25\2\u012c9" +
                    "\3\2\2\2\u012d\u012e\7!\2\2\u012e\u012f\5(\25\2\u012f\u0130\7\f\2\2\u0130" +
                    "\u0131\5(\25\2\u0131;\3\2\2\2\u0132\u0133\7\60\2\2\u0133\u0134\5(\25\2" +
                    "\u0134\u0135\7\f\2\2\u0135\u0136\5(\25\2\u0136=\3\2\2\2\u0137\u0138\7" +
                    "/\2\2\u0138\u0139\5(\25\2\u0139\u013a\7\f\2\2\u013a\u013b\5(\25\2\u013b" +
                    "?\3\2\2\2\u013c\u013d\7-\2\2\u013d\u013e\5(\25\2\u013e\u013f\7\f\2\2\u013f" +
                    "\u0140\5(\25\2\u0140A\3\2\2\2\u0141\u0142\7\37\2\2\u0142\u0143\5(\25\2" +
                    "\u0143\u0144\7\f\2\2\u0144\u0145\5(\25\2\u0145C\3\2\2\2\u0146\u0147\7" +
                    " \2\2\u0147\u0148\5(\25\2\u0148\u0149\7\f\2\2\u0149\u014a\5(\25\2\u014a" +
                    "E\3\2\2\2\u014b\u014c\7\63\2\2\u014c\u0157\5(\25\2\u014d\u014e\7\63\2" +
                    "\2\u014e\u0153\5(\25\2\u014f\u0150\7\64\2\2\u0150\u0152\5(\25\2\u0151" +
                    "\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2" +
                    "\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u014b\3\2\2\2\u0156" +
                    "\u014d\3\2\2\2\u0157G\3\2\2\2\u0158\u0159\7<\2\2\u0159\u015a\5(\25\2\u015a" +
                    "\u015b\7B\2\2\u015b\u015f\3\2\2\2\u015c\u015d\7\62\2\2\u015d\u015f\7B" +
                    "\2\2\u015e\u0158\3\2\2\2\u015e\u015c\3\2\2\2\u015fI\3\2\2\2\u0160\u0161" +
                    "\t\4\2\2\u0161K\3\2\2\2\26OYbi\u0086\u008e\u009b\u00ae\u00b4\u00c0\u00c6" +
                    "\u00cf\u00d2\u00db\u0102\u0106\u010a\u0153\u0156\u015e";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}