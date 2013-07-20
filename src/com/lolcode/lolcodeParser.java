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
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << IHAS) | (1L << VISIBLE) | (1L << GIMMEH) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
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
                retpart();
                setState(102);
                match(ENDST);
                setState(103);
                match(IFUSAY);
                setState(104);
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
                setState(106);
                match(YR);
                setState(107);
                formalParameter();
                setState(112);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == NYR) {
                    {
                        {
                            setState(108);
                            match(NYR);
                            setState(109);
                            formalParameter();
                        }
                    }
                    setState(114);
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
                setState(115);
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
                setState(120);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << IMINYR) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << IHAS) | (1L << VISIBLE) | (1L << GIMMEH) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
                    {
                        {
                            setState(117);
                            stat();
                        }
                    }
                    setState(122);
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
            setState(131);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(123);
                    varDecl();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(124);
                    ifstat();
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(125);
                    casestat();
                }
                break;

                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(126);
                    loopstat();
                }
                break;

                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(127);
                    assstat();
                }
                break;

                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(128);
                    funcall();
                }
                break;

                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(129);
                    visstat();
                }
                break;

                case 8:
                    enterOuterAlt(_localctx, 8);
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

        public TerminalNode GTFO() {
            return getToken(lolcodeParser.GTFO, 0);
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
                setState(175);
                _la = _input.LA(1);
                if (_la == OMGWTF) {
                    {
                        setState(168);
                        match(OMGWTF);
                        setState(169);
                        match(ENDST);
                        setState(170);
                        block();
                        setState(173);
                        _la = _input.LA(1);
                        if (_la == GTFO) {
                            {
                                setState(171);
                                match(GTFO);
                                setState(172);
                                match(ENDST);
                            }
                        }

                    }
                }

                setState(177);
                match(OIC);
                setState(178);
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

        public TerminalNode GTFO() {
            return getToken(lolcodeParser.GTFO, 0);
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
                setState(180);
                match(OMG);
                setState(181);
                value();
                setState(182);
                match(ENDST);
                setState(183);
                block();
                setState(186);
                _la = _input.LA(1);
                if (_la == GTFO) {
                    {
                        setState(184);
                        match(GTFO);
                        setState(185);
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
                setState(188);
                match(IMINYR);
                setState(189);
                match(ID);
                setState(195);
                _la = _input.LA(1);
                if (_la == UPPIN || _la == NERFIN) {
                    {
                        setState(190);
                        _la = _input.LA(1);
                        if (!(_la == UPPIN || _la == NERFIN)) {
                            _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(191);
                        match(YR);
                        setState(192);
                        match(ID);
                        setState(193);
                        _la = _input.LA(1);
                        if (!(_la == WHILE || _la == TIL)) {
                            _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(194);
                        expr();
                    }
                }

                setState(197);
                match(ENDST);
                setState(198);
                block();
                setState(201);
                _la = _input.LA(1);
                if (_la == GTFO) {
                    {
                        setState(199);
                        match(GTFO);
                        setState(200);
                        match(ENDST);
                    }
                }

                setState(203);
                match(IMOUTTAYR);
                setState(204);
                match(ID);
                setState(205);
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
                setState(207);
                match(ID);
                setState(208);
                match(R);
                setState(209);
                expr();
                setState(210);
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
                setState(212);
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
                setState(214);
                match(VISIBLE);
                setState(215);
                expr();
                setState(216);
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
                setState(218);
                match(GIMMEH);
                setState(219);
                match(ID);
                setState(220);
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
            setState(238);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(222);
                    funexpr();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(223);
                    notexpr();
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(224);
                    multexpr();
                }
                break;

                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(225);
                    divexpr();
                }
                break;

                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(226);
                    modexpr();
                }
                break;

                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(227);
                    addexpr();
                }
                break;

                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(228);
                    subexpr();
                }
                break;

                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(229);
                    maxexpr();
                }
                break;

                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(230);
                    minexpr();
                }
                break;

                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(231);
                    bothofexpr();
                }
                break;

                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(232);
                    eitherexpr();
                }
                break;

                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(233);
                    oneofexpr();
                }
                break;

                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(234);
                    equexpr();
                }
                break;

                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(235);
                    nequexpr();
                }
                break;

                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(236);
                    match(ID);
                }
                break;

                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(237);
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
                setState(240);
                match(ID);
                setState(242);
                switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                    case 1: {
                        setState(241);
                        exprList();
                    }
                    break;
                }
                setState(244);
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
                setState(246);
                match(NOT);
                setState(247);
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
                setState(249);
                match(PRODUKTOF);
                setState(250);
                expr();
                setState(251);
                match(AN);
                setState(252);
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
                setState(254);
                match(QUOSHUNTOF);
                setState(255);
                expr();
                setState(256);
                match(AN);
                setState(257);
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
                setState(259);
                match(MODOF);
                setState(260);
                expr();
                setState(261);
                match(AN);
                setState(262);
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
                setState(264);
                match(SUMOF);
                setState(265);
                expr();
                setState(266);
                match(AN);
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
                setState(269);
                match(DIFFOF);
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
                setState(274);
                match(BIGGROF);
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
                setState(279);
                match(SMALLROF);
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
                setState(284);
                match(BOTHOF);
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
                setState(289);
                match(EITHEROF);
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
                setState(294);
                match(ONEOF);
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
                setState(299);
                match(BOTHSAEM);
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
                setState(304);
                match(DIFFRINT);
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
                setState(312);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGROF) | (1L << BOTHSAEM) | (1L << DIFFRINT) | (1L << SMALLROF) | (1L << PRODUKTOF) | (1L << QUOSHUNTOF) | (1L << MODOF) | (1L << SUMOF) | (1L << DIFFOF) | (1L << ONEOF) | (1L << EITHEROF) | (1L << BOTHOF) | (1L << NOT) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
                    {
                        {
                            setState(309);
                            expr();
                        }
                    }
                    setState(314);
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
            setState(320);
            switch (_input.LA(1)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(315);
                    match(1);
                    setState(316);
                    expr();
                    setState(317);
                    match(ENDST);
                }
                break;
                case GTFO:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(319);
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
                setState(322);
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
            "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3?\u0147\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\3\3\3\3\3\7\3" +
                    "R\n\3\f\3\16\3U\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4]\n\4\3\4\3\4\3\5\3\5" +
                    "\3\5\5\5d\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6q\n\6\f\6" +
                    "\16\6t\13\6\3\7\3\7\3\b\7\by\n\b\f\b\16\b|\13\b\3\t\3\t\3\t\3\t\3\t\3" +
                    "\t\3\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3" +
                    "\n\7\n\u0094\n\n\f\n\16\n\u0097\13\n\3\n\3\n\3\n\5\n\u009c\n\n\3\n\3\n" +
                    "\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00a6\n\13\f\13\16\13\u00a9\13\13\3" +
                    "\13\3\13\3\13\3\13\3\13\5\13\u00b0\n\13\5\13\u00b2\n\13\3\13\3\13\3\13" +
                    "\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bd\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r" +
                    "\u00c6\n\r\3\r\3\r\3\r\3\r\5\r\u00cc\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16" +
                    "\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
                    "\5\22\u00f1\n\22\3\23\3\23\5\23\u00f5\n\23\3\23\3\23\3\24\3\24\3\24\3" +
                    "\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3" +
                    "\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3" +
                    "\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3" +
                    "\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 " +
                    "\3 \3 \3 \3!\7!\u0139\n!\f!\16!\u013c\13!\3\"\3\"\3\"\3\"\3\"\5\"\u0143" +
                    "\n\"\3#\3#\3#\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62" +
                    "\64\668:<>@BD\2\5\3\2$%\3\2\f\r\3\29<\u014b\2I\3\2\2\2\4N\3\2\2\2\6X\3" +
                    "\2\2\2\b`\3\2\2\2\nl\3\2\2\2\fu\3\2\2\2\16z\3\2\2\2\20\u0085\3\2\2\2\22" +
                    "\u0087\3\2\2\2\24\u00a0\3\2\2\2\26\u00b6\3\2\2\2\30\u00be\3\2\2\2\32\u00d1" +
                    "\3\2\2\2\34\u00d6\3\2\2\2\36\u00d8\3\2\2\2 \u00dc\3\2\2\2\"\u00f0\3\2" +
                    "\2\2$\u00f2\3\2\2\2&\u00f8\3\2\2\2(\u00fb\3\2\2\2*\u0100\3\2\2\2,\u0105" +
                    "\3\2\2\2.\u010a\3\2\2\2\60\u010f\3\2\2\2\62\u0114\3\2\2\2\64\u0119\3\2" +
                    "\2\2\66\u011e\3\2\2\28\u0123\3\2\2\2:\u0128\3\2\2\2<\u012d\3\2\2\2>\u0132" +
                    "\3\2\2\2@\u013a\3\2\2\2B\u0142\3\2\2\2D\u0144\3\2\2\2FH\5\b\5\2GF\3\2" +
                    "\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\5\4\3\2M\3\3" +
                    "\2\2\2NO\7\n\2\2OS\7=\2\2PR\5\20\t\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3" +
                    "\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\13\2\2W\5\3\2\2\2XY\7\64\2\2Y\\\78\2\2" +
                    "Z[\7\32\2\2[]\5\"\22\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7=\2\2_\7\3\2" +
                    "\2\2`a\7\61\2\2ac\78\2\2bd\5\n\6\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7=" +
                    "\2\2fg\5\16\b\2gh\5B\"\2hi\7=\2\2ij\7\62\2\2jk\7=\2\2k\t\3\2\2\2lm\7/" +
                    "\2\2mr\5\f\7\2no\7\60\2\2oq\5\f\7\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3" +
                    "\2\2\2s\13\3\2\2\2tr\3\2\2\2uv\78\2\2v\r\3\2\2\2wy\5\20\t\2xw\3\2\2\2" +
                    "y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2\2\2|z\3\2\2\2}\u0086\5\6\4\2~\u0086" +
                    "\5\22\n\2\177\u0086\5\24\13\2\u0080\u0086\5\30\r\2\u0081\u0086\5\32\16" +
                    "\2\u0082\u0086\5\34\17\2\u0083\u0086\5\36\20\2\u0084\u0086\5 \21\2\u0085" +
                    "}\3\2\2\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081" +
                    "\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086" +
                    "\21\3\2\2\2\u0087\u0088\5\"\22\2\u0088\u0089\7=\2\2\u0089\u008a\7\16\2" +
                    "\2\u008a\u008b\7=\2\2\u008b\u008c\7\17\2\2\u008c\u008d\7=\2\2\u008d\u0095" +
                    "\5\16\b\2\u008e\u008f\7\20\2\2\u008f\u0090\5\"\22\2\u0090\u0091\7=\2\2" +
                    "\u0091\u0092\5\16\b\2\u0092\u0094\3\2\2\2\u0093\u008e\3\2\2\2\u0094\u0097" +
                    "\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009b\3\2\2\2\u0097" +
                    "\u0095\3\2\2\2\u0098\u0099\7\21\2\2\u0099\u009a\7=\2\2\u009a\u009c\5\16" +
                    "\b\2\u009b\u0098\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d" +
                    "\u009e\7\22\2\2\u009e\u009f\7=\2\2\u009f\23\3\2\2\2\u00a0\u00a1\5\"\22" +
                    "\2\u00a1\u00a2\7=\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a7\7=\2\2\u00a4\u00a6" +
                    "\5\26\f\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2" +
                    "\u00a7\u00a8\3\2\2\2\u00a8\u00b1\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab" +
                    "\7\24\2\2\u00ab\u00ac\7=\2\2\u00ac\u00af\5\16\b\2\u00ad\u00ae\7.\2\2\u00ae" +
                    "\u00b0\7=\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2" +
                    "\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3" +
                    "\u00b4\7\22\2\2\u00b4\u00b5\7=\2\2\u00b5\25\3\2\2\2\u00b6\u00b7\7\23\2" +
                    "\2\u00b7\u00b8\5D#\2\u00b8\u00b9\7=\2\2\u00b9\u00bc\5\16\b\2\u00ba\u00bb" +
                    "\7.\2\2\u00bb\u00bd\7=\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd" +
                    "\27\3\2\2\2\u00be\u00bf\7&\2\2\u00bf\u00c5\78\2\2\u00c0\u00c1\t\2\2\2" +
                    "\u00c1\u00c2\7/\2\2\u00c2\u00c3\78\2\2\u00c3\u00c4\t\3\2\2\u00c4\u00c6" +
                    "\5\"\22\2\u00c5\u00c0\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2" +
                    "\u00c7\u00c8\7=\2\2\u00c8\u00cb\5\16\b\2\u00c9\u00ca\7.\2\2\u00ca\u00cc" +
                    "\7=\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd" +
                    "\u00ce\7\'\2\2\u00ce\u00cf\78\2\2\u00cf\u00d0\7=\2\2\u00d0\31\3\2\2\2" +
                    "\u00d1\u00d2\78\2\2\u00d2\u00d3\7\63\2\2\u00d3\u00d4\5\"\22\2\u00d4\u00d5" +
                    "\7=\2\2\u00d5\33\3\2\2\2\u00d6\u00d7\5\"\22\2\u00d7\35\3\2\2\2\u00d8\u00d9" +
                    "\7\66\2\2\u00d9\u00da\5\"\22\2\u00da\u00db\7=\2\2\u00db\37\3\2\2\2\u00dc" +
                    "\u00dd\7\67\2\2\u00dd\u00de\78\2\2\u00de\u00df\7=\2\2\u00df!\3\2\2\2\u00e0" +
                    "\u00f1\5$\23\2\u00e1\u00f1\5&\24\2\u00e2\u00f1\5(\25\2\u00e3\u00f1\5*" +
                    "\26\2\u00e4\u00f1\5,\27\2\u00e5\u00f1\5.\30\2\u00e6\u00f1\5\60\31\2\u00e7" +
                    "\u00f1\5\62\32\2\u00e8\u00f1\5\64\33\2\u00e9\u00f1\5\66\34\2\u00ea\u00f1" +
                    "\58\35\2\u00eb\u00f1\5:\36\2\u00ec\u00f1\5<\37\2\u00ed\u00f1\5> \2\u00ee" +
                    "\u00f1\78\2\2\u00ef\u00f1\5D#\2\u00f0\u00e0\3\2\2\2\u00f0\u00e1\3\2\2" +
                    "\2\u00f0\u00e2\3\2\2\2\u00f0\u00e3\3\2\2\2\u00f0\u00e4\3\2\2\2\u00f0\u00e5" +
                    "\3\2\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0" +
                    "\u00e9\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ec\3\2" +
                    "\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1" +
                    "#\3\2\2\2\u00f2\u00f4\78\2\2\u00f3\u00f5\5@!\2\u00f4\u00f3\3\2\2\2\u00f4" +
                    "\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7=\2\2\u00f7%\3\2\2\2\u00f8" +
                    "\u00f9\7-\2\2\u00f9\u00fa\5\"\22\2\u00fa\'\3\2\2\2\u00fb\u00fc\7\36\2" +
                    "\2\u00fc\u00fd\5\"\22\2\u00fd\u00fe\7\b\2\2\u00fe\u00ff\5\"\22\2\u00ff" +
                    ")\3\2\2\2\u0100\u0101\7\37\2\2\u0101\u0102\5\"\22\2\u0102\u0103\7\b\2" +
                    "\2\u0103\u0104\5\"\22\2\u0104+\3\2\2\2\u0105\u0106\7 \2\2\u0106\u0107" +
                    "\5\"\22\2\u0107\u0108\7\b\2\2\u0108\u0109\5\"\22\2\u0109-\3\2\2\2\u010a" +
                    "\u010b\7!\2\2\u010b\u010c\5\"\22\2\u010c\u010d\7\b\2\2\u010d\u010e\5\"" +
                    "\22\2\u010e/\3\2\2\2\u010f\u0110\7\"\2\2\u0110\u0111\5\"\22\2\u0111\u0112" +
                    "\7\b\2\2\u0112\u0113\5\"\22\2\u0113\61\3\2\2\2\u0114\u0115\7\t\2\2\u0115" +
                    "\u0116\5\"\22\2\u0116\u0117\7\b\2\2\u0117\u0118\5\"\22\2\u0118\63\3\2" +
                    "\2\2\u0119\u011a\7\35\2\2\u011a\u011b\5\"\22\2\u011b\u011c\7\b\2\2\u011c" +
                    "\u011d\5\"\22\2\u011d\65\3\2\2\2\u011e\u011f\7,\2\2\u011f\u0120\5\"\22" +
                    "\2\u0120\u0121\7\b\2\2\u0121\u0122\5\"\22\2\u0122\67\3\2\2\2\u0123\u0124" +
                    "\7+\2\2\u0124\u0125\5\"\22\2\u0125\u0126\7\b\2\2\u0126\u0127\5\"\22\2" +
                    "\u01279\3\2\2\2\u0128\u0129\7)\2\2\u0129\u012a\5\"\22\2\u012a\u012b\7" +
                    "\b\2\2\u012b\u012c\5\"\22\2\u012c;\3\2\2\2\u012d\u012e\7\33\2\2\u012e" +
                    "\u012f\5\"\22\2\u012f\u0130\7\b\2\2\u0130\u0131\5\"\22\2\u0131=\3\2\2" +
                    "\2\u0132\u0133\7\34\2\2\u0133\u0134\5\"\22\2\u0134\u0135\7\b\2\2\u0135" +
                    "\u0136\5\"\22\2\u0136?\3\2\2\2\u0137\u0139\5\"\22\2\u0138\u0137\3\2\2" +
                    "\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bA" +
                    "\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\3\2\2\u013e\u013f\5\"\22\2" +
                    "\u013f\u0140\7=\2\2\u0140\u0143\3\2\2\2\u0141\u0143\7.\2\2\u0142\u013d" +
                    "\3\2\2\2\u0142\u0141\3\2\2\2\u0143C\3\2\2\2\u0144\u0145\t\4\2\2\u0145" +
                    "E\3\2\2\2\25IS\\crz\u0085\u0095\u009b\u00a7\u00af\u00b1\u00bc\u00c5\u00cb" +
                    "\u00f0\u00f4\u013a\u0142";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}