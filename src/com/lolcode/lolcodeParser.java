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
            T__0 = 1, WTF = 2, WRK = 3, MAEK = 4, A = 5, AN = 6, BIGGROF = 7, HAI = 8, KTHXBYE = 9,
            WHILE = 10, TIL = 11, ORLY = 12, YARLY = 13, MEBBE = 14, NOWAI = 15, OIC = 16, OMG = 17,
            OMGWTF = 18, YARN = 19, NUMBR = 20, NUMBAR = 21, TROOF = 22, NOOB = 23, ITZ = 24, BOTHSAEM = 25,
            DIFFRINT = 26, SMALLROF = 27, PRODUKTOF = 28, QUOSHUNTOF = 29, MODOF = 30, SUMOF = 31,
            DIFFOF = 32, SMOOSH = 33, UPPIN = 34, NERFIN = 35, IMINYR = 36, IMOUTTAYR = 37, ANYOF = 38,
            ONEOF = 39, ALLOF = 40, EITHEROF = 41, BOTHOF = 42, NOT = 43, GTFO = 44, YR = 45, NYR = 46,
            HOWDUZ = 47, IFUSAY = 48, R = 49, IHAS = 50, MKAY = 51, VISIBLE = 52, GIMMEH = 53, ID = 54,
            INT = 55, STRING = 56, FLOAT = 57, BOOL = 58, ENDST = 59, WS = 60, SL_COMMENT = 61;
    public static final String[] tokenNames = {
            "<INVALID>", "'FOUND YR'", "'WTF?'", "'WRK'", "'MAEK'", "'A'", "'AN'",
            "'BIGGR OF'", "'HAI'", "'KTHXBYE'", "'WILE'", "'TIL'", "'ORLY'", "'YRLY'",
            "'MEBBE'", "'NOWAI'", "'OIC'", "'OMG'", "'OMGWTF'", "'YARN'", "'NUMBR'",
            "'NUMBAR'", "'TROOF'", "'NOOB'", "'ITZ'", "'BOTH SAEM'", "'DIFFRINT'",
            "'SMALLR OF'", "'PRODUKT OF'", "'QUOSHUNT OF'", "'MOD OF'", "'SUM OF'",
            "'DIFF OF'", "'SMOOSH'", "'UPPIN'", "'NERFIN'", "'IM IN YR'", "'IM OUTTA YR'",
            "'ANY OF'", "'ONE OF'", "'ALL OF'", "'EITHER OF'", "'BOTH OF'", "'NOT'",
            "'GTFO'", "'YR'", "'N YR'", "'HOW DUZ I'", "'IF U SAY SO'", "'R'", "'I HAS A'",
            "'MKAY'", "'VISIBLE'", "'GIMMEH'", "ID", "INT", "STRING", "FLOAT", "BOOL",
            "ENDST", "WS", "SL_COMMENT"
    };
    public static final int
            RULE_file = 0, RULE_main = 1, RULE_varDecl = 2, RULE_functionDecl = 3,
            RULE_formalParameters = 4, RULE_formalParameter = 5, RULE_block = 6, RULE_stat = 7,
            RULE_ifstat = 8, RULE_casestat = 9, RULE_loopstat = 10, RULE_assstat = 11,
            RULE_funcall = 12, RULE_visstat = 13, RULE_gimstat = 14, RULE_expr = 15,
            RULE_funexpr = 16, RULE_notexpr = 17, RULE_multexpr = 18, RULE_divexpr = 19,
            RULE_modexpr = 20, RULE_addexpr = 21, RULE_subexpr = 22, RULE_minmaxexpr = 23,
            RULE_bothofexpr = 24, RULE_eitherexpr = 25, RULE_oneofexpr = 26, RULE_equexpr = 27,
            RULE_exprList = 28, RULE_retpart = 29, RULE_value = 30;
    public static final String[] ruleNames = {
            "file", "main", "varDecl", "functionDecl", "formalParameters", "formalParameter",
            "block", "stat", "ifstat", "casestat", "loopstat", "assstat", "funcall",
            "visstat", "gimstat", "expr", "funexpr", "notexpr", "multexpr", "divexpr",
            "modexpr", "addexpr", "subexpr", "minmaxexpr", "bothofexpr", "eitherexpr",
            "oneofexpr", "equexpr", "exprList", "retpart", "value"
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
                setState(65);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOWDUZ) {
                    {
                        {
                            setState(62);
                            functionDecl();
                        }
                    }
                    setState(67);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(68);
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
                setState(70);
                match(HAI);
                setState(71);
                match(ENDST);
                setState(75);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << IHAS) | (1L << VISIBLE) | (1L << GIMMEH) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
                    {
                        {
                            setState(72);
                            stat();
                        }
                    }
                    setState(77);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(78);
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
                setState(80);
                match(IHAS);
                setState(81);
                match(ID);
                setState(84);
                _la = _input.LA(1);
                if (_la == ITZ) {
                    {
                        setState(82);
                        match(ITZ);
                        setState(83);
                        expr();
                    }
                }

                setState(86);
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
        public RetpartContext retpart() {
            return getRuleContext(RetpartContext.class, 0);
        }

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
                setState(88);
                match(HOWDUZ);
                setState(89);
                match(ID);
                setState(91);
                _la = _input.LA(1);
                if (_la == YR) {
                    {
                        setState(90);
                        formalParameters();
                    }
                }

                setState(93);
                match(ENDST);
                setState(94);
                block();
                setState(95);
                retpart();
                setState(96);
                match(ENDST);
                setState(97);
                match(IFUSAY);
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
        enterRule(_localctx, 8, RULE_formalParameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(100);
                match(YR);
                setState(101);
                formalParameter();
                setState(106);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == NYR) {
                    {
                        {
                            setState(102);
                            match(NYR);
                            setState(103);
                            formalParameter();
                        }
                    }
                    setState(108);
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
        enterRule(_localctx, 10, RULE_formalParameter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(109);
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
        enterRule(_localctx, 12, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(114);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << IHAS) | (1L << VISIBLE) | (1L << GIMMEH) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
                    {
                        {
                            setState(111);
                            stat();
                        }
                    }
                    setState(116);
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
        public GimstatContext gimstat() {
            return getRuleContext(GimstatContext.class, 0);
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

        public FuncallContext funcall() {
            return getRuleContext(FuncallContext.class, 0);
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
        enterRule(_localctx, 14, RULE_stat);
        try {
            setState(125);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(117);
                    varDecl();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(118);
                    ifstat();
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(119);
                    casestat();
                }
                break;

                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(120);
                    loopstat();
                }
                break;

                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(121);
                    assstat();
                }
                break;

                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(122);
                    funcall();
                }
                break;

                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(123);
                    visstat();
                }
                break;

                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(124);
                    gimstat();
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
        enterRule(_localctx, 16, RULE_ifstat);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(127);
                expr();
                setState(128);
                match(ENDST);
                setState(129);
                match(ORLY);
                setState(130);
                match(ENDST);
                setState(131);
                match(YARLY);
                setState(132);
                match(ENDST);
                setState(133);
                block();
                setState(141);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == MEBBE) {
                    {
                        {
                            setState(134);
                            match(MEBBE);
                            setState(135);
                            expr();
                            setState(136);
                            match(ENDST);
                            setState(137);
                            block();
                        }
                    }
                    setState(143);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(147);
                _la = _input.LA(1);
                if (_la == NOWAI) {
                    {
                        setState(144);
                        match(NOWAI);
                        setState(145);
                        match(ENDST);
                        setState(146);
                        block();
                    }
                }

                setState(149);
                match(OIC);
                setState(150);
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
        public ValueContext value(int i) {
            return getRuleContext(ValueContext.class, i);
        }

        public TerminalNode ENDST(int i) {
            return getToken(lolcodeParser.ENDST, i);
        }

        public List<ValueContext> value() {
            return getRuleContexts(ValueContext.class);
        }

        public List<TerminalNode> ENDST() {
            return getTokens(lolcodeParser.ENDST);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class, i);
        }

        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
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
        enterRule(_localctx, 18, RULE_casestat);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(152);
                expr();
                setState(153);
                match(ENDST);
                setState(154);
                match(WTF);
                setState(155);
                match(ENDST);
                setState(166);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OMG) {
                    {
                        {
                            setState(156);
                            match(OMG);
                            setState(157);
                            value();
                            setState(158);
                            match(ENDST);
                            setState(159);
                            block();
                            setState(162);
                            _la = _input.LA(1);
                            if (_la == GTFO) {
                                {
                                    setState(160);
                                    match(GTFO);
                                    setState(161);
                                    match(ENDST);
                                }
                            }

                        }
                    }
                    setState(168);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(176);
                _la = _input.LA(1);
                if (_la == OMGWTF) {
                    {
                        setState(169);
                        match(OMGWTF);
                        setState(170);
                        match(ENDST);
                        setState(171);
                        block();
                        setState(174);
                        _la = _input.LA(1);
                        if (_la == GTFO) {
                            {
                                setState(172);
                                match(GTFO);
                                setState(173);
                                match(ENDST);
                            }
                        }

                    }
                }

                setState(178);
                match(OIC);
                setState(179);
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

    public static class LoopstatContext extends ParserRuleContext {
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

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
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
        enterRule(_localctx, 20, RULE_loopstat);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(181);
                match(IMINYR);
                setState(182);
                match(ID);
                setState(188);
                _la = _input.LA(1);
                if (_la == UPPIN || _la == NERFIN) {
                    {
                        setState(183);
                        _la = _input.LA(1);
                        if (!(_la == UPPIN || _la == NERFIN)) {
                            _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(184);
                        match(YR);
                        setState(185);
                        match(ID);
                        setState(186);
                        _la = _input.LA(1);
                        if (!(_la == WHILE || _la == TIL)) {
                            _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(187);
                        expr();
                    }
                }

                setState(190);
                match(ENDST);
                setState(191);
                block();
                setState(194);
                _la = _input.LA(1);
                if (_la == GTFO) {
                    {
                        setState(192);
                        match(GTFO);
                        setState(193);
                        match(ENDST);
                    }
                }

                setState(196);
                match(IMOUTTAYR);
                setState(197);
                match(ID);
                setState(198);
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
        enterRule(_localctx, 22, RULE_assstat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(200);
                match(ID);
                setState(201);
                match(R);
                setState(202);
                expr();
                setState(203);
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

    public static class FuncallContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public FuncallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcall;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitFuncall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FuncallContext funcall() throws RecognitionException {
        FuncallContext _localctx = new FuncallContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_funcall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(205);
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
        enterRule(_localctx, 26, RULE_visstat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(207);
                match(VISIBLE);
                setState(208);
                expr();
                setState(209);
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
        enterRule(_localctx, 28, RULE_gimstat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(211);
                match(GIMMEH);
                setState(212);
                match(ID);
                setState(213);
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
        public SubexprContext subexpr() {
            return getRuleContext(SubexprContext.class, 0);
        }

        public AddexprContext addexpr() {
            return getRuleContext(AddexprContext.class, 0);
        }

        public OneofexprContext oneofexpr() {
            return getRuleContext(OneofexprContext.class, 0);
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

        public MinmaxexprContext minmaxexpr() {
            return getRuleContext(MinmaxexprContext.class, 0);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
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
        enterRule(_localctx, 30, RULE_expr);
        try {
            setState(229);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(215);
                    funexpr();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(216);
                    notexpr();
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(217);
                    multexpr();
                }
                break;

                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(218);
                    divexpr();
                }
                break;

                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(219);
                    modexpr();
                }
                break;

                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(220);
                    addexpr();
                }
                break;

                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(221);
                    subexpr();
                }
                break;

                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(222);
                    minmaxexpr();
                }
                break;

                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(223);
                    bothofexpr();
                }
                break;

                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(224);
                    eitherexpr();
                }
                break;

                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(225);
                    oneofexpr();
                }
                break;

                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(226);
                    equexpr();
                }
                break;

                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(227);
                    match(ID);
                }
                break;

                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(228);
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
        enterRule(_localctx, 32, RULE_funexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(231);
                match(ID);
                setState(233);
                switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                    case 1: {
                        setState(232);
                        exprList();
                    }
                    break;
                }
                setState(235);
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
        enterRule(_localctx, 34, RULE_notexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(237);
                match(NOT);
                setState(238);
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
        enterRule(_localctx, 36, RULE_multexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(240);
                match(PRODUKTOF);
                setState(241);
                expr();
                setState(242);
                match(AN);
                setState(243);
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
        enterRule(_localctx, 38, RULE_divexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(245);
                match(QUOSHUNTOF);
                setState(246);
                expr();
                setState(247);
                match(AN);
                setState(248);
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
        enterRule(_localctx, 40, RULE_modexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(250);
                match(MODOF);
                setState(251);
                expr();
                setState(252);
                match(AN);
                setState(253);
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
        enterRule(_localctx, 42, RULE_addexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(255);
                match(SUMOF);
                setState(256);
                expr();
                setState(257);
                match(AN);
                setState(258);
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
        enterRule(_localctx, 44, RULE_subexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(260);
                match(DIFFOF);
                setState(261);
                expr();
                setState(262);
                match(AN);
                setState(263);
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

    public static class MinmaxexprContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public MinmaxexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_minmaxexpr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof lolcodeVisitor) return ((lolcodeVisitor<? extends T>) visitor).visitMinmaxexpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MinmaxexprContext minmaxexpr() throws RecognitionException {
        MinmaxexprContext _localctx = new MinmaxexprContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_minmaxexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(275);
                switch (_input.LA(1)) {
                    case BIGGROF: {
                        setState(265);
                        match(BIGGROF);
                        setState(266);
                        expr();
                        setState(267);
                        match(AN);
                        setState(268);
                        expr();
                    }
                    break;
                    case SMALLROF: {
                        setState(270);
                        match(SMALLROF);
                        setState(271);
                        expr();
                        setState(272);
                        match(AN);
                        setState(273);
                        expr();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
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
        enterRule(_localctx, 48, RULE_bothofexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(277);
                match(BOTHOF);
                setState(278);
                expr();
                setState(279);
                match(AN);
                setState(280);
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
        enterRule(_localctx, 50, RULE_eitherexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(282);
                match(EITHEROF);
                setState(283);
                expr();
                setState(284);
                match(AN);
                setState(285);
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
        enterRule(_localctx, 52, RULE_oneofexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(287);
                match(ONEOF);
                setState(288);
                expr();
                setState(289);
                match(AN);
                setState(290);
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
        enterRule(_localctx, 54, RULE_equexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(302);
                switch (_input.LA(1)) {
                    case BOTHSAEM: {
                        setState(292);
                        match(BOTHSAEM);
                        setState(293);
                        expr();
                        setState(294);
                        match(AN);
                        setState(295);
                        expr();
                    }
                    break;
                    case DIFFRINT: {
                        setState(297);
                        match(DIFFRINT);
                        setState(298);
                        expr();
                        setState(299);
                        match(AN);
                        setState(300);
                        expr();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
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
        enterRule(_localctx, 56, RULE_exprList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(307);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
                    {
                        {
                            setState(304);
                            expr();
                        }
                    }
                    setState(309);
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
        enterRule(_localctx, 58, RULE_retpart);
        try {
            setState(315);
            switch (_input.LA(1)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(310);
                    match(1);
                    setState(311);
                    expr();
                    setState(312);
                    match(ENDST);
                }
                break;
                case GTFO:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(314);
                    match(GTFO);
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
        enterRule(_localctx, 60, RULE_value);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(317);
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
            "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3?\u0142\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2" +
                    "\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3" +
                    "\3\3\3\3\4\3\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\5\3\5\3\5\5\5^\n\5\3\5\3\5\3" +
                    "\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\7\3\7\3\b" +
                    "\7\bs\n\b\f\b\16\bv\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t" +
                    "\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008e\n\n\f\n\16" +
                    "\n\u0091\13\n\3\n\3\n\3\n\5\n\u0096\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13" +
                    "\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a5\n\13\7\13\u00a7\n\13\f\13\16" +
                    "\13\u00aa\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b1\n\13\5\13\u00b3\n" +
                    "\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bf\n\f\3\f\3\f\3" +
                    "\f\3\f\5\f\u00c5\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17" +
                    "\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21" +
                    "\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e8\n\21\3\22\3\22\5\22\u00ec" +
                    "\n\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25" +
                    "\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30" +
                    "\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31" +
                    "\u0116\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34" +
                    "\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35" +
                    "\u0131\n\35\3\36\7\36\u0134\n\36\f\36\16\36\u0137\13\36\3\37\3\37\3\37" +
                    "\3\37\3\37\5\37\u013e\n\37\3 \3 \3 \2!\2\4\6\b\n\f\16\20\22\24\26\30\32" +
                    "\34\36 \"$&(*,.\60\62\64\668:<>\2\5\3\2$%\3\2\f\r\3\29<\u0149\2C\3\2\2" +
                    "\2\4H\3\2\2\2\6R\3\2\2\2\bZ\3\2\2\2\nf\3\2\2\2\fo\3\2\2\2\16t\3\2\2\2" +
                    "\20\177\3\2\2\2\22\u0081\3\2\2\2\24\u009a\3\2\2\2\26\u00b7\3\2\2\2\30" +
                    "\u00ca\3\2\2\2\32\u00cf\3\2\2\2\34\u00d1\3\2\2\2\36\u00d5\3\2\2\2 \u00e7" +
                    "\3\2\2\2\"\u00e9\3\2\2\2$\u00ef\3\2\2\2&\u00f2\3\2\2\2(\u00f7\3\2\2\2" +
                    "*\u00fc\3\2\2\2,\u0101\3\2\2\2.\u0106\3\2\2\2\60\u0115\3\2\2\2\62\u0117" +
                    "\3\2\2\2\64\u011c\3\2\2\2\66\u0121\3\2\2\28\u0130\3\2\2\2:\u0135\3\2\2" +
                    "\2<\u013d\3\2\2\2>\u013f\3\2\2\2@B\5\b\5\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2" +
                    "\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\5\4\3\2G\3\3\2\2\2HI\7\n\2\2IM\7=\2" +
                    "\2JL\5\20\t\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2" +
                    "\2\2PQ\7\13\2\2Q\5\3\2\2\2RS\7\64\2\2SV\78\2\2TU\7\32\2\2UW\5 \21\2VT" +
                    "\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7=\2\2Y\7\3\2\2\2Z[\7\61\2\2[]\78\2\2\\" +
                    "^\5\n\6\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7=\2\2`a\5\16\b\2ab\5<\37\2" +
                    "bc\7=\2\2cd\7\62\2\2de\7=\2\2e\t\3\2\2\2fg\7/\2\2gl\5\f\7\2hi\7\60\2\2" +
                    "ik\5\f\7\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\13\3\2\2\2nl\3\2\2" +
                    "\2op\78\2\2p\r\3\2\2\2qs\5\20\t\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2" +
                    "\2\2u\17\3\2\2\2vt\3\2\2\2w\u0080\5\6\4\2x\u0080\5\22\n\2y\u0080\5\24" +
                    "\13\2z\u0080\5\26\f\2{\u0080\5\30\r\2|\u0080\5\32\16\2}\u0080\5\34\17" +
                    "\2~\u0080\5\36\20\2\177w\3\2\2\2\177x\3\2\2\2\177y\3\2\2\2\177z\3\2\2" +
                    "\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\21\3\2\2" +
                    "\2\u0081\u0082\5 \21\2\u0082\u0083\7=\2\2\u0083\u0084\7\16\2\2\u0084\u0085" +
                    "\7=\2\2\u0085\u0086\7\17\2\2\u0086\u0087\7=\2\2\u0087\u008f\5\16\b\2\u0088" +
                    "\u0089\7\20\2\2\u0089\u008a\5 \21\2\u008a\u008b\7=\2\2\u008b\u008c\5\16" +
                    "\b\2\u008c\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008e\u0091\3\2\2\2\u008f" +
                    "\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0095\3\2\2\2\u0091\u008f\3\2" +
                    "\2\2\u0092\u0093\7\21\2\2\u0093\u0094\7=\2\2\u0094\u0096\5\16\b\2\u0095" +
                    "\u0092\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\22" +
                    "\2\2\u0098\u0099\7=\2\2\u0099\23\3\2\2\2\u009a\u009b\5 \21\2\u009b\u009c" +
                    "\7=\2\2\u009c\u009d\7\4\2\2\u009d\u00a8\7=\2\2\u009e\u009f\7\23\2\2\u009f" +
                    "\u00a0\5> \2\u00a0\u00a1\7=\2\2\u00a1\u00a4\5\16\b\2\u00a2\u00a3\7.\2" +
                    "\2\u00a3\u00a5\7=\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7" +
                    "\3\2\2\2\u00a6\u009e\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8" +
                    "\u00a9\3\2\2\2\u00a9\u00b2\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\24" +
                    "\2\2\u00ac\u00ad\7=\2\2\u00ad\u00b0\5\16\b\2\u00ae\u00af\7.\2\2\u00af" +
                    "\u00b1\7=\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2" +
                    "\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4" +
                    "\u00b5\7\22\2\2\u00b5\u00b6\7=\2\2\u00b6\25\3\2\2\2\u00b7\u00b8\7&\2\2" +
                    "\u00b8\u00be\78\2\2\u00b9\u00ba\t\2\2\2\u00ba\u00bb\7/\2\2\u00bb\u00bc" +
                    "\78\2\2\u00bc\u00bd\t\3\2\2\u00bd\u00bf\5 \21\2\u00be\u00b9\3\2\2\2\u00be" +
                    "\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7=\2\2\u00c1\u00c4\5\16" +
                    "\b\2\u00c2\u00c3\7.\2\2\u00c3\u00c5\7=\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5" +
                    "\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\'\2\2\u00c7\u00c8\78\2\2\u00c8" +
                    "\u00c9\7=\2\2\u00c9\27\3\2\2\2\u00ca\u00cb\78\2\2\u00cb\u00cc\7\63\2\2" +
                    "\u00cc\u00cd\5 \21\2\u00cd\u00ce\7=\2\2\u00ce\31\3\2\2\2\u00cf\u00d0\5" +
                    " \21\2\u00d0\33\3\2\2\2\u00d1\u00d2\7\66\2\2\u00d2\u00d3\5 \21\2\u00d3" +
                    "\u00d4\7=\2\2\u00d4\35\3\2\2\2\u00d5\u00d6\7\67\2\2\u00d6\u00d7\78\2\2" +
                    "\u00d7\u00d8\7=\2\2\u00d8\37\3\2\2\2\u00d9\u00e8\5\"\22\2\u00da\u00e8" +
                    "\5$\23\2\u00db\u00e8\5&\24\2\u00dc\u00e8\5(\25\2\u00dd\u00e8\5*\26\2\u00de" +
                    "\u00e8\5,\27\2\u00df\u00e8\5.\30\2\u00e0\u00e8\5\60\31\2\u00e1\u00e8\5" +
                    "\62\32\2\u00e2\u00e8\5\64\33\2\u00e3\u00e8\5\66\34\2\u00e4\u00e8\58\35" +
                    "\2\u00e5\u00e8\78\2\2\u00e6\u00e8\5> \2\u00e7\u00d9\3\2\2\2\u00e7\u00da" +
                    "\3\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00dc\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e7" +
                    "\u00de\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e1\3\2" +
                    "\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7" +
                    "\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8!\3\2\2\2\u00e9\u00eb\78\2\2\u00ea" +
                    "\u00ec\5:\36\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2" +
                    "\2\2\u00ed\u00ee\7=\2\2\u00ee#\3\2\2\2\u00ef\u00f0\7-\2\2\u00f0\u00f1" +
                    "\5 \21\2\u00f1%\3\2\2\2\u00f2\u00f3\7\36\2\2\u00f3\u00f4\5 \21\2\u00f4" +
                    "\u00f5\7\b\2\2\u00f5\u00f6\5 \21\2\u00f6\'\3\2\2\2\u00f7\u00f8\7\37\2" +
                    "\2\u00f8\u00f9\5 \21\2\u00f9\u00fa\7\b\2\2\u00fa\u00fb\5 \21\2\u00fb)" +
                    "\3\2\2\2\u00fc\u00fd\7 \2\2\u00fd\u00fe\5 \21\2\u00fe\u00ff\7\b\2\2\u00ff" +
                    "\u0100\5 \21\2\u0100+\3\2\2\2\u0101\u0102\7!\2\2\u0102\u0103\5 \21\2\u0103" +
                    "\u0104\7\b\2\2\u0104\u0105\5 \21\2\u0105-\3\2\2\2\u0106\u0107\7\"\2\2" +
                    "\u0107\u0108\5 \21\2\u0108\u0109\7\b\2\2\u0109\u010a\5 \21\2\u010a/\3" +
                    "\2\2\2\u010b\u010c\7\t\2\2\u010c\u010d\5 \21\2\u010d\u010e\7\b\2\2\u010e" +
                    "\u010f\5 \21\2\u010f\u0116\3\2\2\2\u0110\u0111\7\35\2\2\u0111\u0112\5" +
                    " \21\2\u0112\u0113\7\b\2\2\u0113\u0114\5 \21\2\u0114\u0116\3\2\2\2\u0115" +
                    "\u010b\3\2\2\2\u0115\u0110\3\2\2\2\u0116\61\3\2\2\2\u0117\u0118\7,\2\2" +
                    "\u0118\u0119\5 \21\2\u0119\u011a\7\b\2\2\u011a\u011b\5 \21\2\u011b\63" +
                    "\3\2\2\2\u011c\u011d\7+\2\2\u011d\u011e\5 \21\2\u011e\u011f\7\b\2\2\u011f" +
                    "\u0120\5 \21\2\u0120\65\3\2\2\2\u0121\u0122\7)\2\2\u0122\u0123\5 \21\2" +
                    "\u0123\u0124\7\b\2\2\u0124\u0125\5 \21\2\u0125\67\3\2\2\2\u0126\u0127" +
                    "\7\33\2\2\u0127\u0128\5 \21\2\u0128\u0129\7\b\2\2\u0129\u012a\5 \21\2" +
                    "\u012a\u0131\3\2\2\2\u012b\u012c\7\34\2\2\u012c\u012d\5 \21\2\u012d\u012e" +
                    "\7\b\2\2\u012e\u012f\5 \21\2\u012f\u0131\3\2\2\2\u0130\u0126\3\2\2\2\u0130" +
                    "\u012b\3\2\2\2\u01319\3\2\2\2\u0132\u0134\5 \21\2\u0133\u0132\3\2\2\2" +
                    "\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136;\3" +
                    "\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\3\2\2\u0139\u013a\5 \21\2\u013a" +
                    "\u013b\7=\2\2\u013b\u013e\3\2\2\2\u013c\u013e\7.\2\2\u013d\u0138\3\2\2" +
                    "\2\u013d\u013c\3\2\2\2\u013e=\3\2\2\2\u013f\u0140\t\4\2\2\u0140?\3\2\2" +
                    "\2\27CMV]lt\177\u008f\u0095\u00a4\u00a8\u00b0\u00b2\u00be\u00c4\u00e7" +
                    "\u00eb\u0115\u0130\u0135\u013d";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}