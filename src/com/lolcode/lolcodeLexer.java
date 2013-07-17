// Generated from C:\Users\Niner\Desktop\LOLCODE\lolcode.g4 by ANTLR 4.0

package com.lolcode;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lolcodeLexer extends Lexer {
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
            VALUE = 55, INT = 56, STRING = 57, FLOAT = 58, BOOL = 59, ENDST = 60, WS = 61, SL_COMMENT = 62;
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] tokenNames = {
            "<INVALID>",
            "'FOUND YR'", "'WTF?'", "'WRK'", "'MAEK'", "'A'", "'AN'", "'BIGGR OF'",
            "'HAI'", "'KTHXBYE'", "'WILE'", "'TIL'", "'ORLY'", "'YRLY'", "'MEBBE'",
            "'NOWAI'", "'OIC'", "'OMG'", "'OMGWTF'", "'YARN'", "'NUMBR'", "'NUMBAR'",
            "'TROOF'", "'NOOB'", "'ITZ'", "'BOTH SAEM'", "'DIFFRINT'", "'SMALLR OF'",
            "'PRODUKT OF'", "'QUOSHUNT OF'", "'MOD OF'", "'SUM OF'", "'DIFF OF'",
            "'SMOOSH'", "'UPPIN'", "'NERFIN'", "'IM IN YR'", "'IM OUTTA YR'", "'ANY OF'",
            "'ONE OF'", "'ALL OF'", "'EITHER OF'", "'BOTH OF'", "'NOT'", "'GTFO'",
            "'YR'", "'N YR'", "'HOW DUZ I'", "'IF U SAY SO'", "'R'", "'I HAS A'",
            "'MKAY'", "'VISIBLE'", "'GIMMEH'", "ID", "VALUE", "INT", "STRING", "FLOAT",
            "BOOL", "ENDST", "WS", "SL_COMMENT"
    };
    public static final String[] ruleNames = {
            "T__0", "WTF", "WRK", "MAEK", "A", "AN", "BIGGROF", "HAI", "KTHXBYE",
            "WHILE", "TIL", "ORLY", "YARLY", "MEBBE", "NOWAI", "OIC", "OMG", "OMGWTF",
            "YARN", "NUMBR", "NUMBAR", "TROOF", "NOOB", "ITZ", "BOTHSAEM", "DIFFRINT",
            "SMALLROF", "PRODUKTOF", "QUOSHUNTOF", "MODOF", "SUMOF", "DIFFOF", "SMOOSH",
            "UPPIN", "NERFIN", "IMINYR", "IMOUTTAYR", "ANYOF", "ONEOF", "ALLOF", "EITHEROF",
            "BOTHOF", "NOT", "GTFO", "YR", "NYR", "HOWDUZ", "IFUSAY", "R", "IHAS",
            "MKAY", "VISIBLE", "GIMMEH", "ID", "LETTER", "VALUE", "INT", "STRING",
            "FLOAT", "BOOL", "ENDST", "WS", "SL_COMMENT"
    };


    public lolcodeLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

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
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    @Override
    public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
        switch (ruleIndex) {
            case 56:
                INT_action((RuleContext) _localctx, actionIndex);
                break;

            case 61:
                WS_action((RuleContext) _localctx, actionIndex);
                break;

            case 62:
                SL_COMMENT_action((RuleContext) _localctx, actionIndex);
                break;
        }
    }

    private void WS_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 1:
                skip();
                break;
        }
    }

    private void INT_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 0:
                setText("int");
                break;
        }
    }

    private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 2:
                skip();
                break;
        }
    }

    public static final String _serializedATN =
            "\2\4@\u023e\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t" +
                    "\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20" +
                    "\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27" +
                    "\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36" +
                    "\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4" +
                    "(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62" +
                    "\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4" +
                    ":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3" +
                    "\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6" +
                    "\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3" +
                    "\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3" +
                    "\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3" +
                    "\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3" +
                    "\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3" +
                    "\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3" +
                    "\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3" +
                    "\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3" +
                    "\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3" +
                    "\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3" +
                    "\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3" +
                    "\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"" +
                    "\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%" +
                    "\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'" +
                    "\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3" +
                    "*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3" +
                    "/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3" +
                    "\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3" +
                    "\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3" +
                    "\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3" +
                    "\67\3\67\7\67\u01e4\n\67\f\67\16\67\u01e7\13\67\38\38\39\39\39\39\59\u01ef" +
                    "\n9\3:\5:\u01f2\n:\3:\6:\u01f5\n:\r:\16:\u01f6\3:\3:\3;\3;\7;\u01fd\n" +
                    ";\f;\16;\u0200\13;\3;\3;\3<\5<\u0205\n<\3<\5<\u0208\n<\3<\3<\6<\u020c" +
                    "\n<\r<\16<\u020d\3<\5<\u0211\n<\3=\3=\3=\3=\3=\3=\3=\5=\u021a\n=\3>\6" +
                    ">\u021d\n>\r>\16>\u021e\3>\3>\6>\u0223\n>\r>\16>\u0224\3>\5>\u0228\n>" +
                    "\3?\6?\u022b\n?\r?\16?\u022c\3?\3?\3@\3@\3@\3@\3@\7@\u0236\n@\f@\16@\u0239" +
                    "\13@\3@\3@\3@\3@\3\u0237A\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1" +
                    "\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23" +
                    "\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35" +
                    "\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W" +
                    "-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o\2\1q" +
                    "9\1s:\2u;\1w<\1y=\1{>\1}?\3\177@\4\3\2\n\4\62;aa\4C\\c|\3\62;\4\2#%\0" +
                    "\3\62;\3\62;\4HHhh\4\13\13\"\"\u024f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2" +
                    "\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23" +
                    "\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2" +
                    "\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2" +
                    "\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3" +
                    "\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2" +
                    "\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2" +
                    "\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[" +
                    "\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2" +
                    "\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2" +
                    "\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2" +
                    "\2\2\5\u008a\3\2\2\2\7\u008f\3\2\2\2\t\u0093\3\2\2\2\13\u0098\3\2\2\2" +
                    "\r\u009a\3\2\2\2\17\u009d\3\2\2\2\21\u00a6\3\2\2\2\23\u00aa\3\2\2\2\25" +
                    "\u00b2\3\2\2\2\27\u00b7\3\2\2\2\31\u00bb\3\2\2\2\33\u00c0\3\2\2\2\35\u00c5" +
                    "\3\2\2\2\37\u00cb\3\2\2\2!\u00d1\3\2\2\2#\u00d5\3\2\2\2%\u00d9\3\2\2\2" +
                    "\'\u00e0\3\2\2\2)\u00e5\3\2\2\2+\u00eb\3\2\2\2-\u00f2\3\2\2\2/\u00f8\3" +
                    "\2\2\2\61\u00fd\3\2\2\2\63\u0101\3\2\2\2\65\u010b\3\2\2\2\67\u0114\3\2" +
                    "\2\29\u011e\3\2\2\2;\u0129\3\2\2\2=\u0135\3\2\2\2?\u013c\3\2\2\2A\u0143" +
                    "\3\2\2\2C\u014b\3\2\2\2E\u0152\3\2\2\2G\u0158\3\2\2\2I\u015f\3\2\2\2K" +
                    "\u0168\3\2\2\2M\u0174\3\2\2\2O\u017b\3\2\2\2Q\u0182\3\2\2\2S\u0189\3\2" +
                    "\2\2U\u0193\3\2\2\2W\u019b\3\2\2\2Y\u019f\3\2\2\2[\u01a4\3\2\2\2]\u01a7" +
                    "\3\2\2\2_\u01ac\3\2\2\2a\u01b6\3\2\2\2c\u01c2\3\2\2\2e\u01c4\3\2\2\2g" +
                    "\u01cc\3\2\2\2i\u01d1\3\2\2\2k\u01d9\3\2\2\2m\u01e0\3\2\2\2o\u01e8\3\2" +
                    "\2\2q\u01ee\3\2\2\2s\u01f1\3\2\2\2u\u01fa\3\2\2\2w\u0204\3\2\2\2y\u0219" +
                    "\3\2\2\2{\u0227\3\2\2\2}\u022a\3\2\2\2\177\u0230\3\2\2\2\u0081\u0082\7" +
                    "H\2\2\u0082\u0083\7Q\2\2\u0083\u0084\7W\2\2\u0084\u0085\7P\2\2\u0085\u0086" +
                    "\7F\2\2\u0086\u0087\7\"\2\2\u0087\u0088\7[\2\2\u0088\u0089\7T\2\2\u0089" +
                    "\4\3\2\2\2\u008a\u008b\7Y\2\2\u008b\u008c\7V\2\2\u008c\u008d\7H\2\2\u008d" +
                    "\u008e\7A\2\2\u008e\6\3\2\2\2\u008f\u0090\7Y\2\2\u0090\u0091\7T\2\2\u0091" +
                    "\u0092\7M\2\2\u0092\b\3\2\2\2\u0093\u0094\7O\2\2\u0094\u0095\7C\2\2\u0095" +
                    "\u0096\7G\2\2\u0096\u0097\7M\2\2\u0097\n\3\2\2\2\u0098\u0099\7C\2\2\u0099" +
                    "\f\3\2\2\2\u009a\u009b\7C\2\2\u009b\u009c\7P\2\2\u009c\16\3\2\2\2\u009d" +
                    "\u009e\7D\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7I\2\2\u00a0\u00a1\7I\2\2" +
                    "\u00a1\u00a2\7T\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4\7Q\2\2\u00a4\u00a5" +
                    "\7H\2\2\u00a5\20\3\2\2\2\u00a6\u00a7\7J\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9" +
                    "\7K\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7M\2\2\u00ab\u00ac\7V\2\2\u00ac\u00ad" +
                    "\7J\2\2\u00ad\u00ae\7Z\2\2\u00ae\u00af\7D\2\2\u00af\u00b0\7[\2\2\u00b0" +
                    "\u00b1\7G\2\2\u00b1\24\3\2\2\2\u00b2\u00b3\7Y\2\2\u00b3\u00b4\7K\2\2\u00b4" +
                    "\u00b5\7N\2\2\u00b5\u00b6\7G\2\2\u00b6\26\3\2\2\2\u00b7\u00b8\7V\2\2\u00b8" +
                    "\u00b9\7K\2\2\u00b9\u00ba\7N\2\2\u00ba\30\3\2\2\2\u00bb\u00bc\7Q\2\2\u00bc" +
                    "\u00bd\7T\2\2\u00bd\u00be\7N\2\2\u00be\u00bf\7[\2\2\u00bf\32\3\2\2\2\u00c0" +
                    "\u00c1\7[\2\2\u00c1\u00c2\7T\2\2\u00c2\u00c3\7N\2\2\u00c3\u00c4\7[\2\2" +
                    "\u00c4\34\3\2\2\2\u00c5\u00c6\7O\2\2\u00c6\u00c7\7G\2\2\u00c7\u00c8\7" +
                    "D\2\2\u00c8\u00c9\7D\2\2\u00c9\u00ca\7G\2\2\u00ca\36\3\2\2\2\u00cb\u00cc" +
                    "\7P\2\2\u00cc\u00cd\7Q\2\2\u00cd\u00ce\7Y\2\2\u00ce\u00cf\7C\2\2\u00cf" +
                    "\u00d0\7K\2\2\u00d0 \3\2\2\2\u00d1\u00d2\7Q\2\2\u00d2\u00d3\7K\2\2\u00d3" +
                    "\u00d4\7E\2\2\u00d4\"\3\2\2\2\u00d5\u00d6\7Q\2\2\u00d6\u00d7\7O\2\2\u00d7" +
                    "\u00d8\7I\2\2\u00d8$\3\2\2\2\u00d9\u00da\7Q\2\2\u00da\u00db\7O\2\2\u00db" +
                    "\u00dc\7I\2\2\u00dc\u00dd\7Y\2\2\u00dd\u00de\7V\2\2\u00de\u00df\7H\2\2" +
                    "\u00df&\3\2\2\2\u00e0\u00e1\7[\2\2\u00e1\u00e2\7C\2\2\u00e2\u00e3\7T\2" +
                    "\2\u00e3\u00e4\7P\2\2\u00e4(\3\2\2\2\u00e5\u00e6\7P\2\2\u00e6\u00e7\7" +
                    "W\2\2\u00e7\u00e8\7O\2\2\u00e8\u00e9\7D\2\2\u00e9\u00ea\7T\2\2\u00ea*" +
                    "\3\2\2\2\u00eb\u00ec\7P\2\2\u00ec\u00ed\7W\2\2\u00ed\u00ee\7O\2\2\u00ee" +
                    "\u00ef\7D\2\2\u00ef\u00f0\7C\2\2\u00f0\u00f1\7T\2\2\u00f1,\3\2\2\2\u00f2" +
                    "\u00f3\7V\2\2\u00f3\u00f4\7T\2\2\u00f4\u00f5\7Q\2\2\u00f5\u00f6\7Q\2\2" +
                    "\u00f6\u00f7\7H\2\2\u00f7.\3\2\2\2\u00f8\u00f9\7P\2\2\u00f9\u00fa\7Q\2" +
                    "\2\u00fa\u00fb\7Q\2\2\u00fb\u00fc\7D\2\2\u00fc\60\3\2\2\2\u00fd\u00fe" +
                    "\7K\2\2\u00fe\u00ff\7V\2\2\u00ff\u0100\7\\\2\2\u0100\62\3\2\2\2\u0101" +
                    "\u0102\7D\2\2\u0102\u0103\7Q\2\2\u0103\u0104\7V\2\2\u0104\u0105\7J\2\2" +
                    "\u0105\u0106\7\"\2\2\u0106\u0107\7U\2\2\u0107\u0108\7C\2\2\u0108\u0109" +
                    "\7G\2\2\u0109\u010a\7O\2\2\u010a\64\3\2\2\2\u010b\u010c\7F\2\2\u010c\u010d" +
                    "\7K\2\2\u010d\u010e\7H\2\2\u010e\u010f\7H\2\2\u010f\u0110\7T\2\2\u0110" +
                    "\u0111\7K\2\2\u0111\u0112\7P\2\2\u0112\u0113\7V\2\2\u0113\66\3\2\2\2\u0114" +
                    "\u0115\7U\2\2\u0115\u0116\7O\2\2\u0116\u0117\7C\2\2\u0117\u0118\7N\2\2" +
                    "\u0118\u0119\7N\2\2\u0119\u011a\7T\2\2\u011a\u011b\7\"\2\2\u011b\u011c" +
                    "\7Q\2\2\u011c\u011d\7H\2\2\u011d8\3\2\2\2\u011e\u011f\7R\2\2\u011f\u0120" +
                    "\7T\2\2\u0120\u0121\7Q\2\2\u0121\u0122\7F\2\2\u0122\u0123\7W\2\2\u0123" +
                    "\u0124\7M\2\2\u0124\u0125\7V\2\2\u0125\u0126\7\"\2\2\u0126\u0127\7Q\2" +
                    "\2\u0127\u0128\7H\2\2\u0128:\3\2\2\2\u0129\u012a\7S\2\2\u012a\u012b\7" +
                    "W\2\2\u012b\u012c\7Q\2\2\u012c\u012d\7U\2\2\u012d\u012e\7J\2\2\u012e\u012f" +
                    "\7W\2\2\u012f\u0130\7P\2\2\u0130\u0131\7V\2\2\u0131\u0132\7\"\2\2\u0132" +
                    "\u0133\7Q\2\2\u0133\u0134\7H\2\2\u0134<\3\2\2\2\u0135\u0136\7O\2\2\u0136" +
                    "\u0137\7Q\2\2\u0137\u0138\7F\2\2\u0138\u0139\7\"\2\2\u0139\u013a\7Q\2" +
                    "\2\u013a\u013b\7H\2\2\u013b>\3\2\2\2\u013c\u013d\7U\2\2\u013d\u013e\7" +
                    "W\2\2\u013e\u013f\7O\2\2\u013f\u0140\7\"\2\2\u0140\u0141\7Q\2\2\u0141" +
                    "\u0142\7H\2\2\u0142@\3\2\2\2\u0143\u0144\7F\2\2\u0144\u0145\7K\2\2\u0145" +
                    "\u0146\7H\2\2\u0146\u0147\7H\2\2\u0147\u0148\7\"\2\2\u0148\u0149\7Q\2" +
                    "\2\u0149\u014a\7H\2\2\u014aB\3\2\2\2\u014b\u014c\7U\2\2\u014c\u014d\7" +
                    "O\2\2\u014d\u014e\7Q\2\2\u014e\u014f\7Q\2\2\u014f\u0150\7U\2\2\u0150\u0151" +
                    "\7J\2\2\u0151D\3\2\2\2\u0152\u0153\7W\2\2\u0153\u0154\7R\2\2\u0154\u0155" +
                    "\7R\2\2\u0155\u0156\7K\2\2\u0156\u0157\7P\2\2\u0157F\3\2\2\2\u0158\u0159" +
                    "\7P\2\2\u0159\u015a\7G\2\2\u015a\u015b\7T\2\2\u015b\u015c\7H\2\2\u015c" +
                    "\u015d\7K\2\2\u015d\u015e\7P\2\2\u015eH\3\2\2\2\u015f\u0160\7K\2\2\u0160" +
                    "\u0161\7O\2\2\u0161\u0162\7\"\2\2\u0162\u0163\7K\2\2\u0163\u0164\7P\2" +
                    "\2\u0164\u0165\7\"\2\2\u0165\u0166\7[\2\2\u0166\u0167\7T\2\2\u0167J\3" +
                    "\2\2\2\u0168\u0169\7K\2\2\u0169\u016a\7O\2\2\u016a\u016b\7\"\2\2\u016b" +
                    "\u016c\7Q\2\2\u016c\u016d\7W\2\2\u016d\u016e\7V\2\2\u016e\u016f\7V\2\2" +
                    "\u016f\u0170\7C\2\2\u0170\u0171\7\"\2\2\u0171\u0172\7[\2\2\u0172\u0173" +
                    "\7T\2\2\u0173L\3\2\2\2\u0174\u0175\7C\2\2\u0175\u0176\7P\2\2\u0176\u0177" +
                    "\7[\2\2\u0177\u0178\7\"\2\2\u0178\u0179\7Q\2\2\u0179\u017a\7H\2\2\u017a" +
                    "N\3\2\2\2\u017b\u017c\7Q\2\2\u017c\u017d\7P\2\2\u017d\u017e\7G\2\2\u017e" +
                    "\u017f\7\"\2\2\u017f\u0180\7Q\2\2\u0180\u0181\7H\2\2\u0181P\3\2\2\2\u0182" +
                    "\u0183\7C\2\2\u0183\u0184\7N\2\2\u0184\u0185\7N\2\2\u0185\u0186\7\"\2" +
                    "\2\u0186\u0187\7Q\2\2\u0187\u0188\7H\2\2\u0188R\3\2\2\2\u0189\u018a\7" +
                    "G\2\2\u018a\u018b\7K\2\2\u018b\u018c\7V\2\2\u018c\u018d\7J\2\2\u018d\u018e" +
                    "\7G\2\2\u018e\u018f\7T\2\2\u018f\u0190\7\"\2\2\u0190\u0191\7Q\2\2\u0191" +
                    "\u0192\7H\2\2\u0192T\3\2\2\2\u0193\u0194\7D\2\2\u0194\u0195\7Q\2\2\u0195" +
                    "\u0196\7V\2\2\u0196\u0197\7J\2\2\u0197\u0198\7\"\2\2\u0198\u0199\7Q\2" +
                    "\2\u0199\u019a\7H\2\2\u019aV\3\2\2\2\u019b\u019c\7P\2\2\u019c\u019d\7" +
                    "Q\2\2\u019d\u019e\7V\2\2\u019eX\3\2\2\2\u019f\u01a0\7I\2\2\u01a0\u01a1" +
                    "\7V\2\2\u01a1\u01a2\7H\2\2\u01a2\u01a3\7Q\2\2\u01a3Z\3\2\2\2\u01a4\u01a5" +
                    "\7[\2\2\u01a5\u01a6\7T\2\2\u01a6\\\3\2\2\2\u01a7\u01a8\7P\2\2\u01a8\u01a9" +
                    "\7\"\2\2\u01a9\u01aa\7[\2\2\u01aa\u01ab\7T\2\2\u01ab^\3\2\2\2\u01ac\u01ad" +
                    "\7J\2\2\u01ad\u01ae\7Q\2\2\u01ae\u01af\7Y\2\2\u01af\u01b0\7\"\2\2\u01b0" +
                    "\u01b1\7F\2\2\u01b1\u01b2\7W\2\2\u01b2\u01b3\7\\\2\2\u01b3\u01b4\7\"\2" +
                    "\2\u01b4\u01b5\7K\2\2\u01b5`\3\2\2\2\u01b6\u01b7\7K\2\2\u01b7\u01b8\7" +
                    "H\2\2\u01b8\u01b9\7\"\2\2\u01b9\u01ba\7W\2\2\u01ba\u01bb\7\"\2\2\u01bb" +
                    "\u01bc\7U\2\2\u01bc\u01bd\7C\2\2\u01bd\u01be\7[\2\2\u01be\u01bf\7\"\2" +
                    "\2\u01bf\u01c0\7U\2\2\u01c0\u01c1\7Q\2\2\u01c1b\3\2\2\2\u01c2\u01c3\7" +
                    "T\2\2\u01c3d\3\2\2\2\u01c4\u01c5\7K\2\2\u01c5\u01c6\7\"\2\2\u01c6\u01c7" +
                    "\7J\2\2\u01c7\u01c8\7C\2\2\u01c8\u01c9\7U\2\2\u01c9\u01ca\7\"\2\2\u01ca" +
                    "\u01cb\7C\2\2\u01cbf\3\2\2\2\u01cc\u01cd\7O\2\2\u01cd\u01ce\7M\2\2\u01ce" +
                    "\u01cf\7C\2\2\u01cf\u01d0\7[\2\2\u01d0h\3\2\2\2\u01d1\u01d2\7X\2\2\u01d2" +
                    "\u01d3\7K\2\2\u01d3\u01d4\7U\2\2\u01d4\u01d5\7K\2\2\u01d5\u01d6\7D\2\2" +
                    "\u01d6\u01d7\7N\2\2\u01d7\u01d8\7G\2\2\u01d8j\3\2\2\2\u01d9\u01da\7I\2" +
                    "\2\u01da\u01db\7K\2\2\u01db\u01dc\7O\2\2\u01dc\u01dd\7O\2\2\u01dd\u01de" +
                    "\7G\2\2\u01de\u01df\7J\2\2\u01dfl\3\2\2\2\u01e0\u01e5\5o8\2\u01e1\u01e4" +
                    "\5o8\2\u01e2\u01e4\t\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4" +
                    "\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6n\3\2\2\2" +
                    "\u01e7\u01e5\3\2\2\2\u01e8\u01e9\t\3\2\2\u01e9p\3\2\2\2\u01ea\u01ef\5" +
                    "s:\2\u01eb\u01ef\5u;\2\u01ec\u01ef\5w<\2\u01ed\u01ef\5y=\2\u01ee\u01ea" +
                    "\3\2\2\2\u01ee\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef" +
                    "r\3\2\2\2\u01f0\u01f2\7/\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2" +
                    "\u01f4\3\2\2\2\u01f3\u01f5\t\4\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2" +
                    "\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8" +
                    "\u01f9\b:\2\2\u01f9t\3\2\2\2\u01fa\u01fe\7$\2\2\u01fb\u01fd\t\5\2\2\u01fc" +
                    "\u01fb\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2" +
                    "\2\2\u01ff\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7$\2\2\u0202" +
                    "v\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2" +
                    "\u0205\u0207\3\2\2\2\u0206\u0208\t\6\2\2\u0207\u0206\3\2\2\2\u0207\u0208" +
                    "\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\7\60\2\2\u020a\u020c\t\7\2\2" +
                    "\u020b\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e" +
                    "\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u0211\t\b\2\2\u0210\u020f\3\2\2\2\u0210" +
                    "\u0211\3\2\2\2\u0211x\3\2\2\2\u0212\u0213\7Y\2\2\u0213\u0214\7K\2\2\u0214" +
                    "\u021a\7P\2\2\u0215\u0216\7H\2\2\u0216\u0217\7C\2\2\u0217\u0218\7K\2\2" +
                    "\u0218\u021a\7N\2\2\u0219\u0212\3\2\2\2\u0219\u0215\3\2\2\2\u021az\3\2" +
                    "\2\2\u021b\u021d\7\f\2\2\u021c\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e" +
                    "\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0228\3\2\2\2\u0220\u0221\7\17" +
                    "\2\2\u0221\u0223\7\f\2\2\u0222\u0220\3\2\2\2\u0223\u0224\3\2\2\2\u0224" +
                    "\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0228\7." +
                    "\2\2\u0227\u021c\3\2\2\2\u0227\u0222\3\2\2\2\u0227\u0226\3\2\2\2\u0228" +
                    "|\3\2\2\2\u0229\u022b\t\t\2\2\u022a\u0229\3\2\2\2\u022b\u022c\3\2\2\2" +
                    "\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f" +
                    "\b?\3\2\u022f~\3\2\2\2\u0230\u0231\7D\2\2\u0231\u0232\7V\2\2\u0232\u0233" +
                    "\7Y\2\2\u0233\u0237\3\2\2\2\u0234\u0236\13\2\2\2\u0235\u0234\3\2\2\2\u0236" +
                    "\u0239\3\2\2\2\u0237\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u023a\3\2" +
                    "\2\2\u0239\u0237\3\2\2\2\u023a\u023b\7\f\2\2\u023b\u023c\3\2\2\2\u023c" +
                    "\u023d\b@\4\2\u023d\u0080\3\2\2\2\23\2\u01e3\u01e5\u01ee\u01f1\u01f6\u01fe" +
                    "\u0204\u0207\u020d\u0210\u0219\u021e\u0224\u0227\u022c\u0237";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    }
}