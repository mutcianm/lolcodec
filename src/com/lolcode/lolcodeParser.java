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
            HOWDUZ = 47, IFUSAY = 48, R = 49, IHAS = 50, MKAY = 51, VISIBLE = 52, GIMMEH = 53, INT = 54,
            STRING = 55, FLOAT = 56, BOOL = 57, ID = 58, ENDST = 59, WS = 60, SL_COMMENT = 61;
    public static final String[] tokenNames = {
            "<INVALID>", "'FOUND YR'", "'WTF?'", "'WRK'", "'MAEK'", "'A'", "'AN'",
            "'BIGGR OF'", "'HAI'", "'KTHXBYE'", "'WILE'", "'TIL'", "'ORLY'", "'YRLY'",
            "'MEBBE'", "'NOWAI'", "'OIC'", "'OMG'", "'OMGWTF'", "'YARN'", "'NUMBR'",
            "'NUMBAR'", "'TROOF'", "'NOOB'", "'ITZ'", "'BOTH SAEM'", "'DIFFRINT'",
            "'SMALLR OF'", "'PRODUKT OF'", "'QUOSHUNT OF'", "'MOD OF'", "'SUM OF'",
            "'DIFF OF'", "'SMOOSH'", "'UPPIN'", "'NERFIN'", "'IM IN YR'", "'IM OUTTA YR'",
            "'ANY OF'", "'ONE OF'", "'ALL OF'", "'EITHER OF'", "'BOTH OF'", "'NOT'",
            "'GTFO'", "'YR'", "'N YR'", "'HOW DUZ I'", "'IF U SAY SO'", "'R'", "'I HAS A'",
            "'MKAY'", "'VISIBLE'", "'GIMMEH'", "INT", "STRING", "FLOAT", "BOOL", "ID",
            "ENDST", "WS", "SL_COMMENT"
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
                setState(71);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOWDUZ) {
                    {
                        {
                            setState(68);
                            functionDecl();
                        }
                    }
                    setState(73);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(74);
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
                setState(76);
                match(HAI);
                setState(77);
                match(ENDST);
                setState(81);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << GTFO) | (1L << IHAS) | (1L << VISIBLE) | (1L << GIMMEH) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(78);
                            stat();
                        }
                    }
                    setState(83);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(84);
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
                setState(86);
                match(IHAS);
                setState(87);
                match(ID);
                setState(90);
                _la = _input.LA(1);
                if (_la == ITZ) {
                    {
                        setState(88);
                        match(ITZ);
                        setState(89);
                        expr();
                    }
                }

                setState(92);
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
                setState(94);
                match(HOWDUZ);
                setState(95);
                match(ID);
                setState(97);
                _la = _input.LA(1);
                if (_la == YR) {
                    {
                        setState(96);
                        formalParameters();
                    }
                }

                setState(99);
                match(ENDST);
                setState(100);
                block();
                setState(101);
                match(ENDST);
                setState(102);
                match(IFUSAY);
                setState(103);
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
                setState(105);
                match(YR);
                setState(106);
                formalParameter();
                setState(111);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == NYR) {
                    {
                        {
                            setState(107);
                            match(NYR);
                            setState(108);
                            formalParameter();
                        }
                    }
                    setState(113);
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
                setState(114);
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
                setState(119);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << GTFO) | (1L << IHAS) | (1L << VISIBLE) | (1L << GIMMEH) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(116);
                            stat();
                        }
                    }
                    setState(121);
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
            setState(131);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(122);
                    varDecl();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(123);
                    ifstat();
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(124);
                    casestat();
                }
                break;

                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(125);
                    loopstat();
                }
                break;

                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(126);
                    assstat();
                }
                break;

                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(127);
                    funcall();
                }
                break;

                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(128);
                    retpart();
                }
                break;

                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(129);
                    visstat();
                }
                break;

                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(130);
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
                setState(133);
                expr();
                setState(134);
                match(ENDST);
                setState(135);
                match(ORLY);
                setState(136);
                match(ENDST);
                setState(137);
                match(YARLY);
                setState(138);
                match(ENDST);
                setState(139);
                block();
                setState(147);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == MEBBE) {
                    {
                        {
                            setState(140);
                            match(MEBBE);
                            setState(141);
                            expr();
                            setState(142);
                            match(ENDST);
                            setState(143);
                            block();
                        }
                    }
                    setState(149);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(153);
                _la = _input.LA(1);
                if (_la == NOWAI) {
                    {
                        setState(150);
                        match(NOWAI);
                        setState(151);
                        match(ENDST);
                        setState(152);
                        block();
                    }
                }

                setState(155);
                match(OIC);
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
        enterRule(_localctx, 18, RULE_casestat);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(158);
                expr();
                setState(159);
                match(ENDST);
                setState(160);
                match(WTF);
                setState(161);
                match(ENDST);
                setState(165);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OMG) {
                    {
                        {
                            setState(162);
                            caseblock();
                        }
                    }
                    setState(167);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(171);
                _la = _input.LA(1);
                if (_la == OMGWTF) {
                    {
                        setState(168);
                        match(OMGWTF);
                        setState(169);
                        match(ENDST);
                        setState(170);
                        block();
                    }
                }

                setState(173);
                match(OIC);
                setState(174);
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
        enterRule(_localctx, 20, RULE_caseblock);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(176);
                match(OMG);
                setState(177);
                value();
                setState(178);
                match(ENDST);
                setState(180);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        setState(179);
                        block();
                    }
                    break;
                }
                setState(183);
                _la = _input.LA(1);
                if (_la == ENDST) {
                    {
                        setState(182);
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
        enterRule(_localctx, 22, RULE_loopstat);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(185);
                match(IMINYR);
                setState(186);
                match(ID);
                setState(192);
                _la = _input.LA(1);
                if (_la == UPPIN || _la == NERFIN) {
                    {
                        setState(187);
                        _la = _input.LA(1);
                        if (!(_la == UPPIN || _la == NERFIN)) {
                            _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(188);
                        match(YR);
                        setState(189);
                        match(ID);
                        setState(190);
                        _la = _input.LA(1);
                        if (!(_la == WHILE || _la == TIL)) {
                            _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(191);
                        expr();
                    }
                }

                setState(194);
                match(ENDST);
                setState(195);
                block();
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
        enterRule(_localctx, 24, RULE_assstat);
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
        enterRule(_localctx, 26, RULE_funcall);
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
        enterRule(_localctx, 28, RULE_visstat);
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
        enterRule(_localctx, 30, RULE_gimstat);
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
        public NequexprContext nequexpr() {
            return getRuleContext(NequexprContext.class, 0);
        }

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

        public MaxexprContext maxexpr() {
            return getRuleContext(MaxexprContext.class, 0);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
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
        enterRule(_localctx, 32, RULE_expr);
        try {
            setState(231);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
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
                    maxexpr();
                }
                break;

                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(223);
                    minexpr();
                }
                break;

                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(224);
                    bothofexpr();
                }
                break;

                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(225);
                    eitherexpr();
                }
                break;

                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(226);
                    oneofexpr();
                }
                break;

                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(227);
                    equexpr();
                }
                break;

                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(228);
                    nequexpr();
                }
                break;

                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(229);
                    match(ID);
                }
                break;

                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(230);
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
        enterRule(_localctx, 34, RULE_funexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(233);
                match(ID);
                setState(235);
                switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                    case 1: {
                        setState(234);
                        exprList();
                    }
                    break;
                }
                setState(237);
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
        enterRule(_localctx, 36, RULE_notexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(239);
                match(NOT);
                setState(240);
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
        enterRule(_localctx, 38, RULE_multexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(242);
                match(PRODUKTOF);
                setState(243);
                expr();
                setState(244);
                match(AN);
                setState(245);
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
        enterRule(_localctx, 40, RULE_divexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(247);
                match(QUOSHUNTOF);
                setState(248);
                expr();
                setState(249);
                match(AN);
                setState(250);
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
        enterRule(_localctx, 42, RULE_modexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(252);
                match(MODOF);
                setState(253);
                expr();
                setState(254);
                match(AN);
                setState(255);
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
        enterRule(_localctx, 44, RULE_addexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(257);
                match(SUMOF);
                setState(258);
                expr();
                setState(259);
                match(AN);
                setState(260);
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
        enterRule(_localctx, 46, RULE_subexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(262);
                match(DIFFOF);
                setState(263);
                expr();
                setState(264);
                match(AN);
                setState(265);
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
        enterRule(_localctx, 48, RULE_maxexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(267);
                match(BIGGROF);
                setState(268);
                expr();
                setState(269);
                match(AN);
                setState(270);
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
        enterRule(_localctx, 50, RULE_minexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(272);
                match(SMALLROF);
                setState(273);
                expr();
                setState(274);
                match(AN);
                setState(275);
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
        enterRule(_localctx, 52, RULE_bothofexpr);
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
        enterRule(_localctx, 54, RULE_eitherexpr);
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
        enterRule(_localctx, 56, RULE_oneofexpr);
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
        enterRule(_localctx, 58, RULE_equexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(292);
                match(BOTHSAEM);
                setState(293);
                expr();
                setState(294);
                match(AN);
                setState(295);
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
        enterRule(_localctx, 60, RULE_nequexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(297);
                match(DIFFRINT);
                setState(298);
                expr();
                setState(299);
                match(AN);
                setState(300);
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
        enterRule(_localctx, 62, RULE_exprList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(305);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(302);
                            expr();
                        }
                    }
                    setState(307);
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
        enterRule(_localctx, 64, RULE_retpart);
        try {
            setState(313);
            switch (_input.LA(1)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(308);
                    match(1);
                    setState(309);
                    expr();
                    setState(310);
                    match(ENDST);
                }
                break;
                case GTFO:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(312);
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
        enterRule(_localctx, 66, RULE_value);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(315);
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
            "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3?\u0140\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\3\3\3\3\3\7\3" +
                    "R\n\3\f\3\16\3U\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4]\n\4\3\4\3\4\3\5\3\5" +
                    "\3\5\5\5d\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6p\n\6\f\6\16" +
                    "\6s\13\6\3\7\3\7\3\b\7\bx\n\b\f\b\16\b{\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3" +
                    "\t\3\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3" +
                    "\n\7\n\u0094\n\n\f\n\16\n\u0097\13\n\3\n\3\n\3\n\5\n\u009c\n\n\3\n\3\n" +
                    "\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00a6\n\13\f\13\16\13\u00a9\13\13\3" +
                    "\13\3\13\3\13\5\13\u00ae\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00b7" +
                    "\n\f\3\f\5\f\u00ba\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c3\n\r\3\r\3" +
                    "\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3" +
                    "\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3" +
                    "\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ea\n\22\3\23\3\23\5\23\u00ee" +
                    "\n\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26" +
                    "\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31" +
                    "\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34" +
                    "\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36" +
                    "\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\7!\u0132\n!\f!\16!\u0135\13" +
                    "!\3\"\3\"\3\"\3\"\3\"\5\"\u013c\n\"\3#\3#\3#\2$\2\4\6\b\n\f\16\20\22\24" +
                    "\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\5\3\2$%\3\2\f\r\3\28;\u0144" +
                    "\2I\3\2\2\2\4N\3\2\2\2\6X\3\2\2\2\b`\3\2\2\2\nk\3\2\2\2\ft\3\2\2\2\16" +
                    "y\3\2\2\2\20\u0085\3\2\2\2\22\u0087\3\2\2\2\24\u00a0\3\2\2\2\26\u00b2" +
                    "\3\2\2\2\30\u00bb\3\2\2\2\32\u00ca\3\2\2\2\34\u00cf\3\2\2\2\36\u00d1\3" +
                    "\2\2\2 \u00d5\3\2\2\2\"\u00e9\3\2\2\2$\u00eb\3\2\2\2&\u00f1\3\2\2\2(\u00f4" +
                    "\3\2\2\2*\u00f9\3\2\2\2,\u00fe\3\2\2\2.\u0103\3\2\2\2\60\u0108\3\2\2\2" +
                    "\62\u010d\3\2\2\2\64\u0112\3\2\2\2\66\u0117\3\2\2\28\u011c\3\2\2\2:\u0121" +
                    "\3\2\2\2<\u0126\3\2\2\2>\u012b\3\2\2\2@\u0133\3\2\2\2B\u013b\3\2\2\2D" +
                    "\u013d\3\2\2\2FH\5\b\5\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2" +
                    "\2\2KI\3\2\2\2LM\5\4\3\2M\3\3\2\2\2NO\7\n\2\2OS\7=\2\2PR\5\20\t\2QP\3" +
                    "\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\13\2\2W\5" +
                    "\3\2\2\2XY\7\64\2\2Y\\\7<\2\2Z[\7\32\2\2[]\5\"\22\2\\Z\3\2\2\2\\]\3\2" +
                    "\2\2]^\3\2\2\2^_\7=\2\2_\7\3\2\2\2`a\7\61\2\2ac\7<\2\2bd\5\n\6\2cb\3\2" +
                    "\2\2cd\3\2\2\2de\3\2\2\2ef\7=\2\2fg\5\16\b\2gh\7=\2\2hi\7\62\2\2ij\7=" +
                    "\2\2j\t\3\2\2\2kl\7/\2\2lq\5\f\7\2mn\7\60\2\2np\5\f\7\2om\3\2\2\2ps\3" +
                    "\2\2\2qo\3\2\2\2qr\3\2\2\2r\13\3\2\2\2sq\3\2\2\2tu\7<\2\2u\r\3\2\2\2v" +
                    "x\5\20\t\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\17\3\2\2\2{y\3\2\2" +
                    "\2|\u0086\5\6\4\2}\u0086\5\22\n\2~\u0086\5\24\13\2\177\u0086\5\30\r\2" +
                    "\u0080\u0086\5\32\16\2\u0081\u0086\5\34\17\2\u0082\u0086\5B\"\2\u0083" +
                    "\u0086\5\36\20\2\u0084\u0086\5 \21\2\u0085|\3\2\2\2\u0085}\3\2\2\2\u0085" +
                    "~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085" +
                    "\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\21\3\2\2" +
                    "\2\u0087\u0088\5\"\22\2\u0088\u0089\7=\2\2\u0089\u008a\7\16\2\2\u008a" +
                    "\u008b\7=\2\2\u008b\u008c\7\17\2\2\u008c\u008d\7=\2\2\u008d\u0095\5\16" +
                    "\b\2\u008e\u008f\7\20\2\2\u008f\u0090\5\"\22\2\u0090\u0091\7=\2\2\u0091" +
                    "\u0092\5\16\b\2\u0092\u0094\3\2\2\2\u0093\u008e\3\2\2\2\u0094\u0097\3" +
                    "\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009b\3\2\2\2\u0097" +
                    "\u0095\3\2\2\2\u0098\u0099\7\21\2\2\u0099\u009a\7=\2\2\u009a\u009c\5\16" +
                    "\b\2\u009b\u0098\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d" +
                    "\u009e\7\22\2\2\u009e\u009f\7=\2\2\u009f\23\3\2\2\2\u00a0\u00a1\5\"\22" +
                    "\2\u00a1\u00a2\7=\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a7\7=\2\2\u00a4\u00a6" +
                    "\5\26\f\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2" +
                    "\u00a7\u00a8\3\2\2\2\u00a8\u00ad\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab" +
                    "\7\24\2\2\u00ab\u00ac\7=\2\2\u00ac\u00ae\5\16\b\2\u00ad\u00aa\3\2\2\2" +
                    "\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\22\2\2\u00b0\u00b1" +
                    "\7=\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\7\23\2\2\u00b3\u00b4\5D#\2\u00b4" +
                    "\u00b6\7=\2\2\u00b5\u00b7\5\16\b\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2" +
                    "\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00ba\7=\2\2\u00b9\u00b8\3\2\2\2\u00b9" +
                    "\u00ba\3\2\2\2\u00ba\27\3\2\2\2\u00bb\u00bc\7&\2\2\u00bc\u00c2\7<\2\2" +
                    "\u00bd\u00be\t\2\2\2\u00be\u00bf\7/\2\2\u00bf\u00c0\7<\2\2\u00c0\u00c1" +
                    "\t\3\2\2\u00c1\u00c3\5\"\22\2\u00c2\u00bd\3\2\2\2\u00c2\u00c3\3\2\2\2" +
                    "\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7=\2\2\u00c5\u00c6\5\16\b\2\u00c6\u00c7" +
                    "\7\'\2\2\u00c7\u00c8\7<\2\2\u00c8\u00c9\7=\2\2\u00c9\31\3\2\2\2\u00ca" +
                    "\u00cb\7<\2\2\u00cb\u00cc\7\63\2\2\u00cc\u00cd\5\"\22\2\u00cd\u00ce\7" +
                    "=\2\2\u00ce\33\3\2\2\2\u00cf\u00d0\5\"\22\2\u00d0\35\3\2\2\2\u00d1\u00d2" +
                    "\7\66\2\2\u00d2\u00d3\5\"\22\2\u00d3\u00d4\7=\2\2\u00d4\37\3\2\2\2\u00d5" +
                    "\u00d6\7\67\2\2\u00d6\u00d7\7<\2\2\u00d7\u00d8\7=\2\2\u00d8!\3\2\2\2\u00d9" +
                    "\u00ea\5$\23\2\u00da\u00ea\5&\24\2\u00db\u00ea\5(\25\2\u00dc\u00ea\5*" +
                    "\26\2\u00dd\u00ea\5,\27\2\u00de\u00ea\5.\30\2\u00df\u00ea\5\60\31\2\u00e0" +
                    "\u00ea\5\62\32\2\u00e1\u00ea\5\64\33\2\u00e2\u00ea\5\66\34\2\u00e3\u00ea" +
                    "\58\35\2\u00e4\u00ea\5:\36\2\u00e5\u00ea\5<\37\2\u00e6\u00ea\5> \2\u00e7" +
                    "\u00ea\7<\2\2\u00e8\u00ea\5D#\2\u00e9\u00d9\3\2\2\2\u00e9\u00da\3\2\2" +
                    "\2\u00e9\u00db\3\2\2\2\u00e9\u00dc\3\2\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00de" +
                    "\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9" +
                    "\u00e2\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2" +
                    "\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea" +
                    "#\3\2\2\2\u00eb\u00ed\7<\2\2\u00ec\u00ee\5@!\2\u00ed\u00ec\3\2\2\2\u00ed" +
                    "\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7=\2\2\u00f0%\3\2\2\2\u00f1" +
                    "\u00f2\7-\2\2\u00f2\u00f3\5\"\22\2\u00f3\'\3\2\2\2\u00f4\u00f5\7\36\2" +
                    "\2\u00f5\u00f6\5\"\22\2\u00f6\u00f7\7\b\2\2\u00f7\u00f8\5\"\22\2\u00f8" +
                    ")\3\2\2\2\u00f9\u00fa\7\37\2\2\u00fa\u00fb\5\"\22\2\u00fb\u00fc\7\b\2" +
                    "\2\u00fc\u00fd\5\"\22\2\u00fd+\3\2\2\2\u00fe\u00ff\7 \2\2\u00ff\u0100" +
                    "\5\"\22\2\u0100\u0101\7\b\2\2\u0101\u0102\5\"\22\2\u0102-\3\2\2\2\u0103" +
                    "\u0104\7!\2\2\u0104\u0105\5\"\22\2\u0105\u0106\7\b\2\2\u0106\u0107\5\"" +
                    "\22\2\u0107/\3\2\2\2\u0108\u0109\7\"\2\2\u0109\u010a\5\"\22\2\u010a\u010b" +
                    "\7\b\2\2\u010b\u010c\5\"\22\2\u010c\61\3\2\2\2\u010d\u010e\7\t\2\2\u010e" +
                    "\u010f\5\"\22\2\u010f\u0110\7\b\2\2\u0110\u0111\5\"\22\2\u0111\63\3\2" +
                    "\2\2\u0112\u0113\7\35\2\2\u0113\u0114\5\"\22\2\u0114\u0115\7\b\2\2\u0115" +
                    "\u0116\5\"\22\2\u0116\65\3\2\2\2\u0117\u0118\7,\2\2\u0118\u0119\5\"\22" +
                    "\2\u0119\u011a\7\b\2\2\u011a\u011b\5\"\22\2\u011b\67\3\2\2\2\u011c\u011d" +
                    "\7+\2\2\u011d\u011e\5\"\22\2\u011e\u011f\7\b\2\2\u011f\u0120\5\"\22\2" +
                    "\u01209\3\2\2\2\u0121\u0122\7)\2\2\u0122\u0123\5\"\22\2\u0123\u0124\7" +
                    "\b\2\2\u0124\u0125\5\"\22\2\u0125;\3\2\2\2\u0126\u0127\7\33\2\2\u0127" +
                    "\u0128\5\"\22\2\u0128\u0129\7\b\2\2\u0129\u012a\5\"\22\2\u012a=\3\2\2" +
                    "\2\u012b\u012c\7\34\2\2\u012c\u012d\5\"\22\2\u012d\u012e\7\b\2\2\u012e" +
                    "\u012f\5\"\22\2\u012f?\3\2\2\2\u0130\u0132\5\"\22\2\u0131\u0130\3\2\2" +
                    "\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134A" +
                    "\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7\3\2\2\u0137\u0138\5\"\22\2" +
                    "\u0138\u0139\7=\2\2\u0139\u013c\3\2\2\2\u013a\u013c\7.\2\2\u013b\u0136" +
                    "\3\2\2\2\u013b\u013a\3\2\2\2\u013cC\3\2\2\2\u013d\u013e\t\4\2\2\u013e" +
                    "E\3\2\2\2\24IS\\cqy\u0085\u0095\u009b\u00a7\u00ad\u00b6\u00b9\u00c2\u00e9" +
                    "\u00ed\u0133\u013b";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}