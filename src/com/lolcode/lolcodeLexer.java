// Generated from /home/miha/Downloads/skype/lolcode.g4 by ANTLR 4.0

package com.lolcode;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lolcodeLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'WTF?'", "'WRK'", "'MAEK'", "'A'", "'AN'", "'BIGGR OF'", "'HAI'", "'KTHXBYE'", 
		"'WILE'", "'TIL'", "'ORLY'", "'YRLY'", "'MEBBE'", "'NOWAI'", "'OIC'", 
		"'OMG'", "'OMGWTF'", "'YARN'", "'NUMBR'", "'NUMBAR'", "'TROOF'", "'NOOB'", 
		"'ITZ'", "'BOTH SAEM'", "'DIFFRINT'", "'SMALLR OF'", "'PRODUKT OF'", "'QUOSHUNT OF'", 
		"'MOD OF'", "'SUM OF'", "'DIFF OF'", "'SMOOSH'", "'UPPIN'", "'NERFIN'", 
		"'IM IN YR'", "'IM OUTTA YR'", "'ANY OF'", "'ONE OF'", "'ALL OF'", "'EITHER OF'", 
		"'BOTH OF'", "'NOT'", "'GTFO'", "'YR'", "'N YR'", "'HOW DUZ I'", "'IF U SAY SO'", 
		"'R'", "'I HAS A'", "'MKAY'", "'VISIBLE'", "ID", "VALUE", "INT", "STRING", 
		"FLOAT", "BOOL", "ENDST", "WS", "SL_COMMENT"
	};
	public static final String[] ruleNames = {
		"WTF", "WRK", "MAEK", "A", "AN", "BIGGROF", "HAI", "KTHXBYE", "WHILE", 
		"TIL", "ORLY", "YARLY", "MEBBE", "NOWAI", "OIC", "OMG", "OMGWTF", "YARN", 
		"NUMBR", "NUMBAR", "TROOF", "NOOB", "ITZ", "BOTHSAEM", "DIFFRINT", "SMALLROF", 
		"PRODUKTOF", "QUOSHUNTOF", "MODOF", "SUMOF", "DIFFOF", "SMOOSH", "UPPIN", 
		"NERFIN", "IMINYR", "IMOUTTAYR", "ANYOF", "ONEOF", "ALLOF", "EITHEROF", 
		"BOTHOF", "NOT", "GTFO", "YR", "NYR", "HOWDUZ", "IFUSAY", "R", "IHAS", 
		"MKAY", "VISIBLE", "ID", "LETTER", "VALUE", "INT", "STRING", "FLOAT", 
		"BOOL", "ENDST", "WS", "SL_COMMENT"
	};


	public lolcodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lolcode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 59: WS_action((RuleContext)_localctx, actionIndex); break;

		case 60: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4>\u0228\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\7\65\u01d0\n\65\f\65"+
		"\16\65\u01d3\13\65\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u01db\n\67\38\5"+
		"8\u01de\n8\38\68\u01e1\n8\r8\168\u01e2\39\39\79\u01e7\n9\f9\169\u01ea"+
		"\139\39\39\3:\5:\u01ef\n:\3:\5:\u01f2\n:\3:\3:\6:\u01f6\n:\r:\16:\u01f7"+
		"\3:\5:\u01fb\n:\3;\3;\3;\3;\3;\3;\3;\5;\u0204\n;\3<\6<\u0207\n<\r<\16"+
		"<\u0208\3<\3<\6<\u020d\n<\r<\16<\u020e\3<\5<\u0212\n<\3=\6=\u0215\n=\r"+
		"=\16=\u0216\3=\3=\3>\3>\3>\3>\3>\7>\u0220\n>\f>\16>\u0223\13>\3>\3>\3"+
		">\3>\3\u0221?\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1"+
		"= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60"+
		"\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\2\1m\67\1o8\1q9\1s:\1u;\1w<\1"+
		"y=\2{>\3\3\2\n\4\62;aa\4C\\c|\3\62;\4\2#%\0\3\62;\3\62;\4HHhh\4\13\13"+
		"\"\"\u0239\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\3}\3\2\2\2\5\u0082\3\2\2\2\7\u0086\3\2\2\2\t\u008b\3\2\2\2\13"+
		"\u008d\3\2\2\2\r\u0090\3\2\2\2\17\u0099\3\2\2\2\21\u009d\3\2\2\2\23\u00a5"+
		"\3\2\2\2\25\u00aa\3\2\2\2\27\u00ae\3\2\2\2\31\u00b3\3\2\2\2\33\u00b8\3"+
		"\2\2\2\35\u00be\3\2\2\2\37\u00c4\3\2\2\2!\u00c8\3\2\2\2#\u00cc\3\2\2\2"+
		"%\u00d3\3\2\2\2\'\u00d8\3\2\2\2)\u00de\3\2\2\2+\u00e5\3\2\2\2-\u00eb\3"+
		"\2\2\2/\u00f0\3\2\2\2\61\u00f4\3\2\2\2\63\u00fe\3\2\2\2\65\u0107\3\2\2"+
		"\2\67\u0111\3\2\2\29\u011c\3\2\2\2;\u0128\3\2\2\2=\u012f\3\2\2\2?\u0136"+
		"\3\2\2\2A\u013e\3\2\2\2C\u0145\3\2\2\2E\u014b\3\2\2\2G\u0152\3\2\2\2I"+
		"\u015b\3\2\2\2K\u0167\3\2\2\2M\u016e\3\2\2\2O\u0175\3\2\2\2Q\u017c\3\2"+
		"\2\2S\u0186\3\2\2\2U\u018e\3\2\2\2W\u0192\3\2\2\2Y\u0197\3\2\2\2[\u019a"+
		"\3\2\2\2]\u019f\3\2\2\2_\u01a9\3\2\2\2a\u01b5\3\2\2\2c\u01b7\3\2\2\2e"+
		"\u01bf\3\2\2\2g\u01c4\3\2\2\2i\u01cc\3\2\2\2k\u01d4\3\2\2\2m\u01da\3\2"+
		"\2\2o\u01dd\3\2\2\2q\u01e4\3\2\2\2s\u01ee\3\2\2\2u\u0203\3\2\2\2w\u0211"+
		"\3\2\2\2y\u0214\3\2\2\2{\u021a\3\2\2\2}~\7Y\2\2~\177\7V\2\2\177\u0080"+
		"\7H\2\2\u0080\u0081\7A\2\2\u0081\4\3\2\2\2\u0082\u0083\7Y\2\2\u0083\u0084"+
		"\7T\2\2\u0084\u0085\7M\2\2\u0085\6\3\2\2\2\u0086\u0087\7O\2\2\u0087\u0088"+
		"\7C\2\2\u0088\u0089\7G\2\2\u0089\u008a\7M\2\2\u008a\b\3\2\2\2\u008b\u008c"+
		"\7C\2\2\u008c\n\3\2\2\2\u008d\u008e\7C\2\2\u008e\u008f\7P\2\2\u008f\f"+
		"\3\2\2\2\u0090\u0091\7D\2\2\u0091\u0092\7K\2\2\u0092\u0093\7I\2\2\u0093"+
		"\u0094\7I\2\2\u0094\u0095\7T\2\2\u0095\u0096\7\"\2\2\u0096\u0097\7Q\2"+
		"\2\u0097\u0098\7H\2\2\u0098\16\3\2\2\2\u0099\u009a\7J\2\2\u009a\u009b"+
		"\7C\2\2\u009b\u009c\7K\2\2\u009c\20\3\2\2\2\u009d\u009e\7M\2\2\u009e\u009f"+
		"\7V\2\2\u009f\u00a0\7J\2\2\u00a0\u00a1\7Z\2\2\u00a1\u00a2\7D\2\2\u00a2"+
		"\u00a3\7[\2\2\u00a3\u00a4\7G\2\2\u00a4\22\3\2\2\2\u00a5\u00a6\7Y\2\2\u00a6"+
		"\u00a7\7K\2\2\u00a7\u00a8\7N\2\2\u00a8\u00a9\7G\2\2\u00a9\24\3\2\2\2\u00aa"+
		"\u00ab\7V\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7N\2\2\u00ad\26\3\2\2\2\u00ae"+
		"\u00af\7Q\2\2\u00af\u00b0\7T\2\2\u00b0\u00b1\7N\2\2\u00b1\u00b2\7[\2\2"+
		"\u00b2\30\3\2\2\2\u00b3\u00b4\7[\2\2\u00b4\u00b5\7T\2\2\u00b5\u00b6\7"+
		"N\2\2\u00b6\u00b7\7[\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7O\2\2\u00b9\u00ba"+
		"\7G\2\2\u00ba\u00bb\7D\2\2\u00bb\u00bc\7D\2\2\u00bc\u00bd\7G\2\2\u00bd"+
		"\34\3\2\2\2\u00be\u00bf\7P\2\2\u00bf\u00c0\7Q\2\2\u00c0\u00c1\7Y\2\2\u00c1"+
		"\u00c2\7C\2\2\u00c2\u00c3\7K\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7Q\2\2\u00c5"+
		"\u00c6\7K\2\2\u00c6\u00c7\7E\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7Q\2\2\u00c9"+
		"\u00ca\7O\2\2\u00ca\u00cb\7I\2\2\u00cb\"\3\2\2\2\u00cc\u00cd\7Q\2\2\u00cd"+
		"\u00ce\7O\2\2\u00ce\u00cf\7I\2\2\u00cf\u00d0\7Y\2\2\u00d0\u00d1\7V\2\2"+
		"\u00d1\u00d2\7H\2\2\u00d2$\3\2\2\2\u00d3\u00d4\7[\2\2\u00d4\u00d5\7C\2"+
		"\2\u00d5\u00d6\7T\2\2\u00d6\u00d7\7P\2\2\u00d7&\3\2\2\2\u00d8\u00d9\7"+
		"P\2\2\u00d9\u00da\7W\2\2\u00da\u00db\7O\2\2\u00db\u00dc\7D\2\2\u00dc\u00dd"+
		"\7T\2\2\u00dd(\3\2\2\2\u00de\u00df\7P\2\2\u00df\u00e0\7W\2\2\u00e0\u00e1"+
		"\7O\2\2\u00e1\u00e2\7D\2\2\u00e2\u00e3\7C\2\2\u00e3\u00e4\7T\2\2\u00e4"+
		"*\3\2\2\2\u00e5\u00e6\7V\2\2\u00e6\u00e7\7T\2\2\u00e7\u00e8\7Q\2\2\u00e8"+
		"\u00e9\7Q\2\2\u00e9\u00ea\7H\2\2\u00ea,\3\2\2\2\u00eb\u00ec\7P\2\2\u00ec"+
		"\u00ed\7Q\2\2\u00ed\u00ee\7Q\2\2\u00ee\u00ef\7D\2\2\u00ef.\3\2\2\2\u00f0"+
		"\u00f1\7K\2\2\u00f1\u00f2\7V\2\2\u00f2\u00f3\7\\\2\2\u00f3\60\3\2\2\2"+
		"\u00f4\u00f5\7D\2\2\u00f5\u00f6\7Q\2\2\u00f6\u00f7\7V\2\2\u00f7\u00f8"+
		"\7J\2\2\u00f8\u00f9\7\"\2\2\u00f9\u00fa\7U\2\2\u00fa\u00fb\7C\2\2\u00fb"+
		"\u00fc\7G\2\2\u00fc\u00fd\7O\2\2\u00fd\62\3\2\2\2\u00fe\u00ff\7F\2\2\u00ff"+
		"\u0100\7K\2\2\u0100\u0101\7H\2\2\u0101\u0102\7H\2\2\u0102\u0103\7T\2\2"+
		"\u0103\u0104\7K\2\2\u0104\u0105\7P\2\2\u0105\u0106\7V\2\2\u0106\64\3\2"+
		"\2\2\u0107\u0108\7U\2\2\u0108\u0109\7O\2\2\u0109\u010a\7C\2\2\u010a\u010b"+
		"\7N\2\2\u010b\u010c\7N\2\2\u010c\u010d\7T\2\2\u010d\u010e\7\"\2\2\u010e"+
		"\u010f\7Q\2\2\u010f\u0110\7H\2\2\u0110\66\3\2\2\2\u0111\u0112\7R\2\2\u0112"+
		"\u0113\7T\2\2\u0113\u0114\7Q\2\2\u0114\u0115\7F\2\2\u0115\u0116\7W\2\2"+
		"\u0116\u0117\7M\2\2\u0117\u0118\7V\2\2\u0118\u0119\7\"\2\2\u0119\u011a"+
		"\7Q\2\2\u011a\u011b\7H\2\2\u011b8\3\2\2\2\u011c\u011d\7S\2\2\u011d\u011e"+
		"\7W\2\2\u011e\u011f\7Q\2\2\u011f\u0120\7U\2\2\u0120\u0121\7J\2\2\u0121"+
		"\u0122\7W\2\2\u0122\u0123\7P\2\2\u0123\u0124\7V\2\2\u0124\u0125\7\"\2"+
		"\2\u0125\u0126\7Q\2\2\u0126\u0127\7H\2\2\u0127:\3\2\2\2\u0128\u0129\7"+
		"O\2\2\u0129\u012a\7Q\2\2\u012a\u012b\7F\2\2\u012b\u012c\7\"\2\2\u012c"+
		"\u012d\7Q\2\2\u012d\u012e\7H\2\2\u012e<\3\2\2\2\u012f\u0130\7U\2\2\u0130"+
		"\u0131\7W\2\2\u0131\u0132\7O\2\2\u0132\u0133\7\"\2\2\u0133\u0134\7Q\2"+
		"\2\u0134\u0135\7H\2\2\u0135>\3\2\2\2\u0136\u0137\7F\2\2\u0137\u0138\7"+
		"K\2\2\u0138\u0139\7H\2\2\u0139\u013a\7H\2\2\u013a\u013b\7\"\2\2\u013b"+
		"\u013c\7Q\2\2\u013c\u013d\7H\2\2\u013d@\3\2\2\2\u013e\u013f\7U\2\2\u013f"+
		"\u0140\7O\2\2\u0140\u0141\7Q\2\2\u0141\u0142\7Q\2\2\u0142\u0143\7U\2\2"+
		"\u0143\u0144\7J\2\2\u0144B\3\2\2\2\u0145\u0146\7W\2\2\u0146\u0147\7R\2"+
		"\2\u0147\u0148\7R\2\2\u0148\u0149\7K\2\2\u0149\u014a\7P\2\2\u014aD\3\2"+
		"\2\2\u014b\u014c\7P\2\2\u014c\u014d\7G\2\2\u014d\u014e\7T\2\2\u014e\u014f"+
		"\7H\2\2\u014f\u0150\7K\2\2\u0150\u0151\7P\2\2\u0151F\3\2\2\2\u0152\u0153"+
		"\7K\2\2\u0153\u0154\7O\2\2\u0154\u0155\7\"\2\2\u0155\u0156\7K\2\2\u0156"+
		"\u0157\7P\2\2\u0157\u0158\7\"\2\2\u0158\u0159\7[\2\2\u0159\u015a\7T\2"+
		"\2\u015aH\3\2\2\2\u015b\u015c\7K\2\2\u015c\u015d\7O\2\2\u015d\u015e\7"+
		"\"\2\2\u015e\u015f\7Q\2\2\u015f\u0160\7W\2\2\u0160\u0161\7V\2\2\u0161"+
		"\u0162\7V\2\2\u0162\u0163\7C\2\2\u0163\u0164\7\"\2\2\u0164\u0165\7[\2"+
		"\2\u0165\u0166\7T\2\2\u0166J\3\2\2\2\u0167\u0168\7C\2\2\u0168\u0169\7"+
		"P\2\2\u0169\u016a\7[\2\2\u016a\u016b\7\"\2\2\u016b\u016c\7Q\2\2\u016c"+
		"\u016d\7H\2\2\u016dL\3\2\2\2\u016e\u016f\7Q\2\2\u016f\u0170\7P\2\2\u0170"+
		"\u0171\7G\2\2\u0171\u0172\7\"\2\2\u0172\u0173\7Q\2\2\u0173\u0174\7H\2"+
		"\2\u0174N\3\2\2\2\u0175\u0176\7C\2\2\u0176\u0177\7N\2\2\u0177\u0178\7"+
		"N\2\2\u0178\u0179\7\"\2\2\u0179\u017a\7Q\2\2\u017a\u017b\7H\2\2\u017b"+
		"P\3\2\2\2\u017c\u017d\7G\2\2\u017d\u017e\7K\2\2\u017e\u017f\7V\2\2\u017f"+
		"\u0180\7J\2\2\u0180\u0181\7G\2\2\u0181\u0182\7T\2\2\u0182\u0183\7\"\2"+
		"\2\u0183\u0184\7Q\2\2\u0184\u0185\7H\2\2\u0185R\3\2\2\2\u0186\u0187\7"+
		"D\2\2\u0187\u0188\7Q\2\2\u0188\u0189\7V\2\2\u0189\u018a\7J\2\2\u018a\u018b"+
		"\7\"\2\2\u018b\u018c\7Q\2\2\u018c\u018d\7H\2\2\u018dT\3\2\2\2\u018e\u018f"+
		"\7P\2\2\u018f\u0190\7Q\2\2\u0190\u0191\7V\2\2\u0191V\3\2\2\2\u0192\u0193"+
		"\7I\2\2\u0193\u0194\7V\2\2\u0194\u0195\7H\2\2\u0195\u0196\7Q\2\2\u0196"+
		"X\3\2\2\2\u0197\u0198\7[\2\2\u0198\u0199\7T\2\2\u0199Z\3\2\2\2\u019a\u019b"+
		"\7P\2\2\u019b\u019c\7\"\2\2\u019c\u019d\7[\2\2\u019d\u019e\7T\2\2\u019e"+
		"\\\3\2\2\2\u019f\u01a0\7J\2\2\u01a0\u01a1\7Q\2\2\u01a1\u01a2\7Y\2\2\u01a2"+
		"\u01a3\7\"\2\2\u01a3\u01a4\7F\2\2\u01a4\u01a5\7W\2\2\u01a5\u01a6\7\\\2"+
		"\2\u01a6\u01a7\7\"\2\2\u01a7\u01a8\7K\2\2\u01a8^\3\2\2\2\u01a9\u01aa\7"+
		"K\2\2\u01aa\u01ab\7H\2\2\u01ab\u01ac\7\"\2\2\u01ac\u01ad\7W\2\2\u01ad"+
		"\u01ae\7\"\2\2\u01ae\u01af\7U\2\2\u01af\u01b0\7C\2\2\u01b0\u01b1\7[\2"+
		"\2\u01b1\u01b2\7\"\2\2\u01b2\u01b3\7U\2\2\u01b3\u01b4\7Q\2\2\u01b4`\3"+
		"\2\2\2\u01b5\u01b6\7T\2\2\u01b6b\3\2\2\2\u01b7\u01b8\7K\2\2\u01b8\u01b9"+
		"\7\"\2\2\u01b9\u01ba\7J\2\2\u01ba\u01bb\7C\2\2\u01bb\u01bc\7U\2\2\u01bc"+
		"\u01bd\7\"\2\2\u01bd\u01be\7C\2\2\u01bed\3\2\2\2\u01bf\u01c0\7O\2\2\u01c0"+
		"\u01c1\7M\2\2\u01c1\u01c2\7C\2\2\u01c2\u01c3\7[\2\2\u01c3f\3\2\2\2\u01c4"+
		"\u01c5\7X\2\2\u01c5\u01c6\7K\2\2\u01c6\u01c7\7U\2\2\u01c7\u01c8\7K\2\2"+
		"\u01c8\u01c9\7D\2\2\u01c9\u01ca\7N\2\2\u01ca\u01cb\7G\2\2\u01cbh\3\2\2"+
		"\2\u01cc\u01d1\5k\66\2\u01cd\u01d0\5k\66\2\u01ce\u01d0\t\2\2\2\u01cf\u01cd"+
		"\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2j\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\t\3\2\2"+
		"\u01d5l\3\2\2\2\u01d6\u01db\5o8\2\u01d7\u01db\5q9\2\u01d8\u01db\5s:\2"+
		"\u01d9\u01db\5u;\2\u01da\u01d6\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01d8"+
		"\3\2\2\2\u01da\u01d9\3\2\2\2\u01dbn\3\2\2\2\u01dc\u01de\7/\2\2\u01dd\u01dc"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01e1\t\4\2\2\u01e0"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2"+
		"\2\2\u01e3p\3\2\2\2\u01e4\u01e8\7$\2\2\u01e5\u01e7\t\5\2\2\u01e6\u01e5"+
		"\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec\7$\2\2\u01ecr\3\2\2\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2"+
		"\2\2\u01f0\u01f2\t\6\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f5\7\60\2\2\u01f4\u01f6\t\7\2\2\u01f5\u01f4\3"+
		"\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01fa\3\2\2\2\u01f9\u01fb\t\b\2\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fbt\3\2\2\2\u01fc\u01fd\7Y\2\2\u01fd\u01fe\7K\2\2\u01fe\u0204"+
		"\7P\2\2\u01ff\u0200\7H\2\2\u0200\u0201\7C\2\2\u0201\u0202\7K\2\2\u0202"+
		"\u0204\7N\2\2\u0203\u01fc\3\2\2\2\u0203\u01ff\3\2\2\2\u0204v\3\2\2\2\u0205"+
		"\u0207\7\f\2\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u0212\3\2\2\2\u020a\u020b\7\17\2\2\u020b"+
		"\u020d\7\f\2\2\u020c\u020a\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2"+
		"\2\2\u020e\u020f\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u0212\7.\2\2\u0211"+
		"\u0206\3\2\2\2\u0211\u020c\3\2\2\2\u0211\u0210\3\2\2\2\u0212x\3\2\2\2"+
		"\u0213\u0215\t\t\2\2\u0214\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0214"+
		"\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\b=\2\2\u0219"+
		"z\3\2\2\2\u021a\u021b\7D\2\2\u021b\u021c\7V\2\2\u021c\u021d\7Y\2\2\u021d"+
		"\u0221\3\2\2\2\u021e\u0220\13\2\2\2\u021f\u021e\3\2\2\2\u0220\u0223\3"+
		"\2\2\2\u0221\u0222\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0224\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0224\u0225\7\f\2\2\u0225\u0226\3\2\2\2\u0226\u0227\b>"+
		"\3\2\u0227|\3\2\2\2\23\2\u01cf\u01d1\u01da\u01dd\u01e2\u01e8\u01ee\u01f1"+
		"\u01f7\u01fa\u0203\u0208\u020e\u0211\u0216\u0221";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}