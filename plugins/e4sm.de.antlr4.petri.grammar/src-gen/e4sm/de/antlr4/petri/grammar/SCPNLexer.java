// Generated from SCPN.g4 by ANTLR 4.9.3
package e4sm.de.antlr4.petri.grammar;

//Package is set in the build.gradle file
/*import gpal.*;
import gpal.parsers.ast.*;
import gpal.parsers.expr.*;
import java.util.*;*/

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SCPNLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOW=1, HASH=2, APO=3, COPY=4, NEW=5, EXTRACT=6, EXP=7, DET=8, UNI=9, DUNI=10, 
		TRIANG=11, NORM=12, LONGNORM=13, WEI=14, QUESTION=15, COLON=16, ASSIGN=17, 
		EQUAL=18, LNOT=19, BNOT=20, NOT_EQUAL=21, DIV=22, DIV_ASSIGN=23, PLUS=24, 
		PLUS_ASSIGN=25, INC=26, MINUS=27, MINUS_ASSIGN=28, DEC=29, STAR=30, STAR_ASSIGN=31, 
		MOD=32, MOD_ASSIGN=33, SR=34, SR_ASSIGN=35, BSR=36, BSR_ASSIGN=37, GE=38, 
		GT=39, SL=40, SL_ASSIGN=41, LE=42, LT=43, BXOR=44, BXOR_ASSIGN=45, BOR=46, 
		BOR_ASSIGN=47, LOR=48, BAND=49, BAND_ASSIGN=50, LAND=51, NULL_LITERAL=52, 
		LPAREN=53, RPAREN=54, LCURLY=55, RCURLY=56, LBRACK=57, RBRACK=58, SEMI=59, 
		COMMA=60, DOT=61, DOLLAR=62, IDENTIFIER=63, PARNAME=64, INTEGER_LITERAL=65, 
		DECIMAL_LITERAL=66, DATETIME_LITERAL=67, STRING_LITERAL=68, BOOLEAN_LITERAL=69, 
		WS=70, COMMENT=71;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NOW", "HASH", "APO", "COPY", "NEW", "EXTRACT", "EXP", "DET", "UNI", 
			"DUNI", "TRIANG", "NORM", "LONGNORM", "WEI", "QUESTION", "COLON", "ASSIGN", 
			"EQUAL", "LNOT", "BNOT", "NOT_EQUAL", "DIV", "DIV_ASSIGN", "PLUS", "PLUS_ASSIGN", 
			"INC", "MINUS", "MINUS_ASSIGN", "DEC", "STAR", "STAR_ASSIGN", "MOD", 
			"MOD_ASSIGN", "SR", "SR_ASSIGN", "BSR", "BSR_ASSIGN", "GE", "GT", "SL", 
			"SL_ASSIGN", "LE", "LT", "BXOR", "BXOR_ASSIGN", "BOR", "BOR_ASSIGN", 
			"LOR", "BAND", "BAND_ASSIGN", "LAND", "NULL_LITERAL", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "DOLLAR", 
			"IDENTIFIER", "PARNAME", "INTEGER_LITERAL", "DECIMAL_LITERAL", "DIGIT", 
			"NON_ZERO_DIGIT", "DATETIME_LITERAL", "MONTHS", "DAYS", "YEARS", "MDA_DATE", 
			"TIME", "HOURS", "MINUTES", "SECONDS", "STRING_LITERAL", "ESC", "BOOLEAN_LITERAL", 
			"TRUE", "FALSE", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'#'", "'''", null, null, null, null, null, null, null, null, 
			null, null, null, "'?'", "':'", "'='", "'=='", "'!'", "'~'", "'!='", 
			"'/'", "'/='", "'+'", "'+='", "'++'", "'-'", "'-='", "'--'", "'*'", "'*='", 
			"'%'", "'%='", "'>>'", "'>>='", "'>>>'", "'>>>='", "'>='", "'>'", "'<<'", 
			"'<<='", "'<='", "'<'", "'^'", "'^='", "'|'", "'|='", "'||'", "'&'", 
			"'&='", "'&&'", null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOW", "HASH", "APO", "COPY", "NEW", "EXTRACT", "EXP", "DET", "UNI", 
			"DUNI", "TRIANG", "NORM", "LONGNORM", "WEI", "QUESTION", "COLON", "ASSIGN", 
			"EQUAL", "LNOT", "BNOT", "NOT_EQUAL", "DIV", "DIV_ASSIGN", "PLUS", "PLUS_ASSIGN", 
			"INC", "MINUS", "MINUS_ASSIGN", "DEC", "STAR", "STAR_ASSIGN", "MOD", 
			"MOD_ASSIGN", "SR", "SR_ASSIGN", "BSR", "BSR_ASSIGN", "GE", "GT", "SL", 
			"SL_ASSIGN", "LE", "LT", "BXOR", "BXOR_ASSIGN", "BOR", "BOR_ASSIGN", 
			"LOR", "BAND", "BAND_ASSIGN", "LAND", "NULL_LITERAL", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "DOLLAR", 
			"IDENTIFIER", "PARNAME", "INTEGER_LITERAL", "DECIMAL_LITERAL", "DATETIME_LITERAL", 
			"STRING_LITERAL", "BOOLEAN_LITERAL", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SCPNLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SCPN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u0262\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00b2\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u00c0\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c8"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d8"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e3\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00ee\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f6\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0104"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0118\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0126\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0148\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0153\n\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3"+
		"*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\5\65\u01c2\n\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3=\3=\3>\3>\3?\3?\3@\3@\7@\u01da\n@\f@\16@\u01dd\13@\3A\3A\3A\3B"+
		"\3B\3B\6B\u01e5\nB\rB\16B\u01e6\5B\u01e9\nB\5B\u01eb\nB\3C\3C\3C\3C\6"+
		"C\u01f1\nC\rC\16C\u01f2\3C\3C\6C\u01f7\nC\rC\16C\u01f8\5C\u01fb\nC\3D"+
		"\3D\5D\u01ff\nD\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\5G\u020b\nG\3H\3H\3H\3H"+
		"\3H\3H\5H\u0213\nH\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K"+
		"\3L\3L\3L\3L\5L\u022a\nL\3M\3M\3M\3N\3N\3N\3O\3O\3O\7O\u0235\nO\fO\16"+
		"O\u0238\13O\3O\3O\3P\3P\3P\3Q\3Q\5Q\u0241\nQ\3R\3R\3R\3R\3R\3S\3S\3S\3"+
		"S\3S\3S\3T\6T\u024f\nT\rT\16T\u0250\3T\3T\3U\3U\3U\3U\7U\u0259\nU\fU\16"+
		"U\u025c\13U\3U\3U\3U\3U\3U\3\u025a\2V\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087\2\u0089\2\u008bE\u008d\2\u008f\2\u0091\2\u0093\2\u0095"+
		"\2\u0097\2\u0099\2\u009b\2\u009dF\u009f\2\u00a1G\u00a3\2\u00a5\2\u00a7"+
		"H\u00a9I\3\2\16\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62\64\3\2\63\64"+
		"\3\2\62;\3\2\62\63\3\2\62\65\3\2\62\67\4\2$$^^\n\2$$))^^ddhhppttvv\5\2"+
		"\13\f\16\17\"\"\2\u027a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u008b\3\2\2\2\2\u009d\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3\u00b1\3\2\2\2\5\u00b3\3\2\2"+
		"\2\7\u00b5\3\2\2\2\t\u00bf\3\2\2\2\13\u00c7\3\2\2\2\r\u00d7\3\2\2\2\17"+
		"\u00e2\3\2\2\2\21\u00ed\3\2\2\2\23\u00f5\3\2\2\2\25\u0103\3\2\2\2\27\u0117"+
		"\3\2\2\2\31\u0125\3\2\2\2\33\u0147\3\2\2\2\35\u0152\3\2\2\2\37\u0154\3"+
		"\2\2\2!\u0156\3\2\2\2#\u0158\3\2\2\2%\u015a\3\2\2\2\'\u015d\3\2\2\2)\u015f"+
		"\3\2\2\2+\u0161\3\2\2\2-\u0164\3\2\2\2/\u0166\3\2\2\2\61\u0169\3\2\2\2"+
		"\63\u016b\3\2\2\2\65\u016e\3\2\2\2\67\u0171\3\2\2\29\u0173\3\2\2\2;\u0176"+
		"\3\2\2\2=\u0179\3\2\2\2?\u017b\3\2\2\2A\u017e\3\2\2\2C\u0180\3\2\2\2E"+
		"\u0183\3\2\2\2G\u0186\3\2\2\2I\u018a\3\2\2\2K\u018e\3\2\2\2M\u0193\3\2"+
		"\2\2O\u0196\3\2\2\2Q\u0198\3\2\2\2S\u019b\3\2\2\2U\u019f\3\2\2\2W\u01a2"+
		"\3\2\2\2Y\u01a4\3\2\2\2[\u01a6\3\2\2\2]\u01a9\3\2\2\2_\u01ab\3\2\2\2a"+
		"\u01ae\3\2\2\2c\u01b1\3\2\2\2e\u01b3\3\2\2\2g\u01b6\3\2\2\2i\u01c1\3\2"+
		"\2\2k\u01c3\3\2\2\2m\u01c5\3\2\2\2o\u01c7\3\2\2\2q\u01c9\3\2\2\2s\u01cb"+
		"\3\2\2\2u\u01cd\3\2\2\2w\u01cf\3\2\2\2y\u01d1\3\2\2\2{\u01d3\3\2\2\2}"+
		"\u01d5\3\2\2\2\177\u01d7\3\2\2\2\u0081\u01de\3\2\2\2\u0083\u01ea\3\2\2"+
		"\2\u0085\u01fa\3\2\2\2\u0087\u01fe\3\2\2\2\u0089\u0200\3\2\2\2\u008b\u0202"+
		"\3\2\2\2\u008d\u020a\3\2\2\2\u008f\u0212\3\2\2\2\u0091\u0214\3\2\2\2\u0093"+
		"\u0219\3\2\2\2\u0095\u021f\3\2\2\2\u0097\u0229\3\2\2\2\u0099\u022b\3\2"+
		"\2\2\u009b\u022e\3\2\2\2\u009d\u0231\3\2\2\2\u009f\u023b\3\2\2\2\u00a1"+
		"\u0240\3\2\2\2\u00a3\u0242\3\2\2\2\u00a5\u0247\3\2\2\2\u00a7\u024e\3\2"+
		"\2\2\u00a9\u0254\3\2\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7q\2\2\u00ad\u00b2"+
		"\7y\2\2\u00ae\u00af\7P\2\2\u00af\u00b0\7Q\2\2\u00b0\u00b2\7Y\2\2\u00b1"+
		"\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\4\3\2\2\2\u00b3\u00b4\7%\2\2"+
		"\u00b4\6\3\2\2\2\u00b5\u00b6\7)\2\2\u00b6\b\3\2\2\2\u00b7\u00b8\7e\2\2"+
		"\u00b8\u00b9\7q\2\2\u00b9\u00ba\7r\2\2\u00ba\u00c0\7{\2\2\u00bb\u00bc"+
		"\7E\2\2\u00bc\u00bd\7Q\2\2\u00bd\u00be\7R\2\2\u00be\u00c0\7[\2\2\u00bf"+
		"\u00b7\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0\n\3\2\2\2\u00c1\u00c2\7p\2\2"+
		"\u00c2\u00c3\7g\2\2\u00c3\u00c8\7y\2\2\u00c4\u00c5\7P\2\2\u00c5\u00c6"+
		"\7G\2\2\u00c6\u00c8\7Y\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8"+
		"\f\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7z\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d8\7v\2\2"+
		"\u00d0\u00d1\7G\2\2\u00d1\u00d2\7Z\2\2\u00d2\u00d3\7V\2\2\u00d3\u00d4"+
		"\7T\2\2\u00d4\u00d5\7C\2\2\u00d5\u00d6\7E\2\2\u00d6\u00d8\7V\2\2\u00d7"+
		"\u00c9\3\2\2\2\u00d7\u00d0\3\2\2\2\u00d8\16\3\2\2\2\u00d9\u00da\7g\2\2"+
		"\u00da\u00db\7z\2\2\u00db\u00e3\7r\2\2\u00dc\u00dd\7G\2\2\u00dd\u00de"+
		"\7Z\2\2\u00de\u00e3\7R\2\2\u00df\u00e0\7G\2\2\u00e0\u00e1\7z\2\2\u00e1"+
		"\u00e3\7r\2\2\u00e2\u00d9\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00df\3\2"+
		"\2\2\u00e3\20\3\2\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6\7g\2\2\u00e6\u00ee"+
		"\7v\2\2\u00e7\u00e8\7F\2\2\u00e8\u00e9\7G\2\2\u00e9\u00ee\7V\2\2\u00ea"+
		"\u00eb\7F\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ee\7v\2\2\u00ed\u00e4\3\2\2"+
		"\2\u00ed\u00e7\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\22\3\2\2\2\u00ef\u00f0"+
		"\7w\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f6\7k\2\2\u00f2\u00f3\7W\2\2\u00f3"+
		"\u00f4\7P\2\2\u00f4\u00f6\7K\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f2\3\2\2"+
		"\2\u00f6\24\3\2\2\2\u00f7\u00f8\7f\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa\u0104\7k\2\2\u00fb\u00fc\7F\2\2\u00fc\u00fd\7W\2\2\u00fd"+
		"\u00fe\7P\2\2\u00fe\u0104\7K\2\2\u00ff\u0100\7F\2\2\u0100\u0101\7W\2\2"+
		"\u0101\u0102\7p\2\2\u0102\u0104\7k\2\2\u0103\u00f7\3\2\2\2\u0103\u00fb"+
		"\3\2\2\2\u0103\u00ff\3\2\2\2\u0104\26\3\2\2\2\u0105\u0106\7v\2\2\u0106"+
		"\u0107\7t\2\2\u0107\u0108\7k\2\2\u0108\u0109\7c\2\2\u0109\u010a\7p\2\2"+
		"\u010a\u0118\7i\2\2\u010b\u010c\7V\2\2\u010c\u010d\7T\2\2\u010d\u010e"+
		"\7K\2\2\u010e\u010f\7C\2\2\u010f\u0110\7P\2\2\u0110\u0118\7I\2\2\u0111"+
		"\u0112\7V\2\2\u0112\u0113\7t\2\2\u0113\u0114\7k\2\2\u0114\u0115\7c\2\2"+
		"\u0115\u0116\7p\2\2\u0116\u0118\7i\2\2\u0117\u0105\3\2\2\2\u0117\u010b"+
		"\3\2\2\2\u0117\u0111\3\2\2\2\u0118\30\3\2\2\2\u0119\u011a\7p\2\2\u011a"+
		"\u011b\7q\2\2\u011b\u011c\7t\2\2\u011c\u0126\7o\2\2\u011d\u011e\7P\2\2"+
		"\u011e\u011f\7Q\2\2\u011f\u0120\7T\2\2\u0120\u0126\7O\2\2\u0121\u0122"+
		"\7P\2\2\u0122\u0123\7q\2\2\u0123\u0124\7t\2\2\u0124\u0126\7o\2\2\u0125"+
		"\u0119\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u0121\3\2\2\2\u0126\32\3\2\2"+
		"\2\u0127\u0128\7n\2\2\u0128\u0129\7q\2\2\u0129\u012a\7p\2\2\u012a\u012b"+
		"\7i\2\2\u012b\u012c\7p\2\2\u012c\u012d\7q\2\2\u012d\u012e\7t\2\2\u012e"+
		"\u0148\7o\2\2\u012f\u0130\7N\2\2\u0130\u0131\7Q\2\2\u0131\u0132\7P\2\2"+
		"\u0132\u0133\7I\2\2\u0133\u0134\7P\2\2\u0134\u0135\7Q\2\2\u0135\u0136"+
		"\7T\2\2\u0136\u0148\7O\2\2\u0137\u0138\7N\2\2\u0138\u0139\7q\2\2\u0139"+
		"\u013a\7p\2\2\u013a\u013b\7i\2\2\u013b\u013c\7p\2\2\u013c\u013d\7q\2\2"+
		"\u013d\u013e\7t\2\2\u013e\u0148\7o\2\2\u013f\u0140\7N\2\2\u0140\u0141"+
		"\7q\2\2\u0141\u0142\7p\2\2\u0142\u0143\7i\2\2\u0143\u0144\7P\2\2\u0144"+
		"\u0145\7q\2\2\u0145\u0146\7t\2\2\u0146\u0148\7o\2\2\u0147\u0127\3\2\2"+
		"\2\u0147\u012f\3\2\2\2\u0147\u0137\3\2\2\2\u0147\u013f\3\2\2\2\u0148\34"+
		"\3\2\2\2\u0149\u014a\7y\2\2\u014a\u014b\7g\2\2\u014b\u0153\7k\2\2\u014c"+
		"\u014d\7Y\2\2\u014d\u014e\7G\2\2\u014e\u0153\7K\2\2\u014f\u0150\7Y\2\2"+
		"\u0150\u0151\7g\2\2\u0151\u0153\7k\2\2\u0152\u0149\3\2\2\2\u0152\u014c"+
		"\3\2\2\2\u0152\u014f\3\2\2\2\u0153\36\3\2\2\2\u0154\u0155\7A\2\2\u0155"+
		" \3\2\2\2\u0156\u0157\7<\2\2\u0157\"\3\2\2\2\u0158\u0159\7?\2\2\u0159"+
		"$\3\2\2\2\u015a\u015b\7?\2\2\u015b\u015c\7?\2\2\u015c&\3\2\2\2\u015d\u015e"+
		"\7#\2\2\u015e(\3\2\2\2\u015f\u0160\7\u0080\2\2\u0160*\3\2\2\2\u0161\u0162"+
		"\7#\2\2\u0162\u0163\7?\2\2\u0163,\3\2\2\2\u0164\u0165\7\61\2\2\u0165."+
		"\3\2\2\2\u0166\u0167\7\61\2\2\u0167\u0168\7?\2\2\u0168\60\3\2\2\2\u0169"+
		"\u016a\7-\2\2\u016a\62\3\2\2\2\u016b\u016c\7-\2\2\u016c\u016d\7?\2\2\u016d"+
		"\64\3\2\2\2\u016e\u016f\7-\2\2\u016f\u0170\7-\2\2\u0170\66\3\2\2\2\u0171"+
		"\u0172\7/\2\2\u01728\3\2\2\2\u0173\u0174\7/\2\2\u0174\u0175\7?\2\2\u0175"+
		":\3\2\2\2\u0176\u0177\7/\2\2\u0177\u0178\7/\2\2\u0178<\3\2\2\2\u0179\u017a"+
		"\7,\2\2\u017a>\3\2\2\2\u017b\u017c\7,\2\2\u017c\u017d\7?\2\2\u017d@\3"+
		"\2\2\2\u017e\u017f\7\'\2\2\u017fB\3\2\2\2\u0180\u0181\7\'\2\2\u0181\u0182"+
		"\7?\2\2\u0182D\3\2\2\2\u0183\u0184\7@\2\2\u0184\u0185\7@\2\2\u0185F\3"+
		"\2\2\2\u0186\u0187\7@\2\2\u0187\u0188\7@\2\2\u0188\u0189\7?\2\2\u0189"+
		"H\3\2\2\2\u018a\u018b\7@\2\2\u018b\u018c\7@\2\2\u018c\u018d\7@\2\2\u018d"+
		"J\3\2\2\2\u018e\u018f\7@\2\2\u018f\u0190\7@\2\2\u0190\u0191\7@\2\2\u0191"+
		"\u0192\7?\2\2\u0192L\3\2\2\2\u0193\u0194\7@\2\2\u0194\u0195\7?\2\2\u0195"+
		"N\3\2\2\2\u0196\u0197\7@\2\2\u0197P\3\2\2\2\u0198\u0199\7>\2\2\u0199\u019a"+
		"\7>\2\2\u019aR\3\2\2\2\u019b\u019c\7>\2\2\u019c\u019d\7>\2\2\u019d\u019e"+
		"\7?\2\2\u019eT\3\2\2\2\u019f\u01a0\7>\2\2\u01a0\u01a1\7?\2\2\u01a1V\3"+
		"\2\2\2\u01a2\u01a3\7>\2\2\u01a3X\3\2\2\2\u01a4\u01a5\7`\2\2\u01a5Z\3\2"+
		"\2\2\u01a6\u01a7\7`\2\2\u01a7\u01a8\7?\2\2\u01a8\\\3\2\2\2\u01a9\u01aa"+
		"\7~\2\2\u01aa^\3\2\2\2\u01ab\u01ac\7~\2\2\u01ac\u01ad\7?\2\2\u01ad`\3"+
		"\2\2\2\u01ae\u01af\7~\2\2\u01af\u01b0\7~\2\2\u01b0b\3\2\2\2\u01b1\u01b2"+
		"\7(\2\2\u01b2d\3\2\2\2\u01b3\u01b4\7(\2\2\u01b4\u01b5\7?\2\2\u01b5f\3"+
		"\2\2\2\u01b6\u01b7\7(\2\2\u01b7\u01b8\7(\2\2\u01b8h\3\2\2\2\u01b9\u01ba"+
		"\7p\2\2\u01ba\u01bb\7w\2\2\u01bb\u01bc\7n\2\2\u01bc\u01c2\7n\2\2\u01bd"+
		"\u01be\7P\2\2\u01be\u01bf\7W\2\2\u01bf\u01c0\7N\2\2\u01c0\u01c2\7N\2\2"+
		"\u01c1\u01b9\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c2j\3\2\2\2\u01c3\u01c4\7"+
		"*\2\2\u01c4l\3\2\2\2\u01c5\u01c6\7+\2\2\u01c6n\3\2\2\2\u01c7\u01c8\7}"+
		"\2\2\u01c8p\3\2\2\2\u01c9\u01ca\7\177\2\2\u01car\3\2\2\2\u01cb\u01cc\7"+
		"]\2\2\u01cct\3\2\2\2\u01cd\u01ce\7_\2\2\u01cev\3\2\2\2\u01cf\u01d0\7="+
		"\2\2\u01d0x\3\2\2\2\u01d1\u01d2\7.\2\2\u01d2z\3\2\2\2\u01d3\u01d4\7\60"+
		"\2\2\u01d4|\3\2\2\2\u01d5\u01d6\7&\2\2\u01d6~\3\2\2\2\u01d7\u01db\t\2"+
		"\2\2\u01d8\u01da\t\3\2\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u0080\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01de\u01df\5}?\2\u01df\u01e0\5\177@\2\u01e0\u0082\3\2\2\2\u01e1"+
		"\u01eb\7\62\2\2\u01e2\u01e8\5\u0089E\2\u01e3\u01e5\5\u0087D\2\u01e4\u01e3"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e9\3\2\2\2\u01e8\u01e4\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2"+
		"\2\2\u01ea\u01e1\3\2\2\2\u01ea\u01e2\3\2\2\2\u01eb\u0084\3\2\2\2\u01ec"+
		"\u01ed\7\62\2\2\u01ed\u01ee\7\60\2\2\u01ee\u01fb\7\62\2\2\u01ef\u01f1"+
		"\5\u0087D\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f0\3\2\2"+
		"\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\5{>\2\u01f5\u01f7"+
		"\5\u0087D\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2"+
		"\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01ec\3\2\2\2\u01fa\u01f0"+
		"\3\2\2\2\u01fb\u0086\3\2\2\2\u01fc\u01ff\7\62\2\2\u01fd\u01ff\5\u0089"+
		"E\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0088\3\2\2\2\u0200"+
		"\u0201\t\4\2\2\u0201\u008a\3\2\2\2\u0202\u0203\5\u0095K\2\u0203\u0204"+
		"\7B\2\2\u0204\u0205\5\u0093J\2\u0205\u008c\3\2\2\2\u0206\u0207\7\62\2"+
		"\2\u0207\u020b\t\4\2\2\u0208\u0209\7\63\2\2\u0209\u020b\t\5\2\2\u020a"+
		"\u0206\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u008e\3\2\2\2\u020c\u020d\7\62"+
		"\2\2\u020d\u0213\t\4\2\2\u020e\u020f\t\6\2\2\u020f\u0213\t\7\2\2\u0210"+
		"\u0211\7\65\2\2\u0211\u0213\t\b\2\2\u0212\u020c\3\2\2\2\u0212\u020e\3"+
		"\2\2\2\u0212\u0210\3\2\2\2\u0213\u0090\3\2\2\2\u0214\u0215\t\7\2\2\u0215"+
		"\u0216\t\7\2\2\u0216\u0217\t\7\2\2\u0217\u0218\t\7\2\2\u0218\u0092\3\2"+
		"\2\2\u0219\u021a\5\u008dG\2\u021a\u021b\7\61\2\2\u021b\u021c\5\u008fH"+
		"\2\u021c\u021d\7\61\2\2\u021d\u021e\5\u0091I\2\u021e\u0094\3\2\2\2\u021f"+
		"\u0220\5\u0097L\2\u0220\u0221\7<\2\2\u0221\u0222\5\u0099M\2\u0222\u0223"+
		"\7<\2\2\u0223\u0224\5\u009bN\2\u0224\u0096\3\2\2\2\u0225\u0226\t\b\2\2"+
		"\u0226\u022a\t\7\2\2\u0227\u0228\7\64\2\2\u0228\u022a\t\t\2\2\u0229\u0225"+
		"\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u0098\3\2\2\2\u022b\u022c\t\n\2\2\u022c"+
		"\u022d\t\7\2\2\u022d\u009a\3\2\2\2\u022e\u022f\t\n\2\2\u022f\u0230\t\7"+
		"\2\2\u0230\u009c\3\2\2\2\u0231\u0236\7$\2\2\u0232\u0235\5\u009fP\2\u0233"+
		"\u0235\n\13\2\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235\u0238\3"+
		"\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0239\u023a\7$\2\2\u023a\u009e\3\2\2\2\u023b\u023c\7^\2"+
		"\2\u023c\u023d\t\f\2\2\u023d\u00a0\3\2\2\2\u023e\u0241\5\u00a3R\2\u023f"+
		"\u0241\5\u00a5S\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2\2\2\u0241\u00a2"+
		"\3\2\2\2\u0242\u0243\7v\2\2\u0243\u0244\7t\2\2\u0244\u0245\7w\2\2\u0245"+
		"\u0246\7g\2\2\u0246\u00a4\3\2\2\2\u0247\u0248\7h\2\2\u0248\u0249\7c\2"+
		"\2\u0249\u024a\7n\2\2\u024a\u024b\7u\2\2\u024b\u024c\7g\2\2\u024c\u00a6"+
		"\3\2\2\2\u024d\u024f\t\r\2\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\bT"+
		"\2\2\u0253\u00a8\3\2\2\2\u0254\u0255\7\61\2\2\u0255\u0256\7,\2\2\u0256"+
		"\u025a\3\2\2\2\u0257\u0259\13\2\2\2\u0258\u0257\3\2\2\2\u0259\u025c\3"+
		"\2\2\2\u025a\u025b\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025d\3\2\2\2\u025c"+
		"\u025a\3\2\2\2\u025d\u025e\7,\2\2\u025e\u025f\7\61\2\2\u025f\u0260\3\2"+
		"\2\2\u0260\u0261\bU\2\2\u0261\u00aa\3\2\2\2 \2\u00b1\u00bf\u00c7\u00d7"+
		"\u00e2\u00ed\u00f5\u0103\u0117\u0125\u0147\u0152\u01c1\u01db\u01e6\u01e8"+
		"\u01ea\u01f2\u01f8\u01fa\u01fe\u020a\u0212\u0229\u0234\u0236\u0240\u0250"+
		"\u025a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}