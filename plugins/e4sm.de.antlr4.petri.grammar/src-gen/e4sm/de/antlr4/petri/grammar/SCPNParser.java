// Generated from SCPN.g4 by ANTLR 4.9.3
package e4sm.de.antlr4.petri.grammar;

//N.B. Package is set in the build.gradle file

// DO NOT EDIT THIS .java FILE DIRECTLY, it will be overwritten! Edit the SCPN.g4 file only.

/*import gpal.*;
import gpal.parsers.ast.*;
import gpal.parsers.expr.*;
import java.util.*;*/

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SCPNParser extends Parser {
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
	public static final int
		RULE_expressions = 0, RULE_expression = 1, RULE_placeRef = 2, RULE_subTransName = 3, 
		RULE_moduleName = 4, RULE_constant = 5, RULE_numericalConstant = 6, RULE_mathematicalExpression = 7, 
		RULE_inputInscription = 8, RULE_outputInscription = 9, RULE_tokenTransfer = 10, 
		RULE_attributeAssignList = 11, RULE_attributeAssignment = 12, RULE_tokenDescription = 13, 
		RULE_timeFunction = 14, RULE_tokenCopy = 15, RULE_tokenNew = 16, RULE_tokenExtract = 17, 
		RULE_tokenReference = 18, RULE_tokenAttributeReference = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"expressions", "expression", "placeRef", "subTransName", "moduleName", 
			"constant", "numericalConstant", "mathematicalExpression", "inputInscription", 
			"outputInscription", "tokenTransfer", "attributeAssignList", "attributeAssignment", 
			"tokenDescription", "timeFunction", "tokenCopy", "tokenNew", "tokenExtract", 
			"tokenReference", "tokenAttributeReference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'#'", "'''", null, null, null, null, null, "'UNI'", null, 
			null, null, null, null, "'?'", "':'", "'='", "'=='", "'!'", "'~'", "'!='", 
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

	@Override
	public String getGrammarFileName() { return "SCPN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SCPNParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(SCPNParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SCPNParser.COLON, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitExpressions(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (COPY - 4)) | (1L << (NEW - 4)) | (1L << (EXTRACT - 4)) | (1L << (IDENTIFIER - 4)) | (1L << (INTEGER_LITERAL - 4)) | (1L << (DECIMAL_LITERAL - 4)))) != 0)) {
				{
				{
				setState(40);
				expression();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(41);
					match(COLON);
					}
				}

				}
				}
				setState(48);
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

	public static class ExpressionContext extends ParserRuleContext {
		public InputInscriptionContext inputInscription() {
			return getRuleContext(InputInscriptionContext.class,0);
		}
		public OutputInscriptionContext outputInscription() {
			return getRuleContext(OutputInscriptionContext.class,0);
		}
		public MathematicalExpressionContext mathematicalExpression() {
			return getRuleContext(MathematicalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				inputInscription();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				outputInscription();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				mathematicalExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				mathematicalExpression(0);
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

	public static class PlaceRefContext extends ParserRuleContext {
		public Token placeName;
		public TerminalNode IDENTIFIER() { return getToken(SCPNParser.IDENTIFIER, 0); }
		public TerminalNode HASH() { return getToken(SCPNParser.HASH, 0); }
		public List<SubTransNameContext> subTransName() {
			return getRuleContexts(SubTransNameContext.class);
		}
		public SubTransNameContext subTransName(int i) {
			return getRuleContext(SubTransNameContext.class,i);
		}
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public PlaceRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterPlaceRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitPlaceRef(this);
		}
	}

	public final PlaceRefContext placeRef() throws RecognitionException {
		PlaceRefContext _localctx = new PlaceRefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_placeRef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(55);
				match(HASH);
				}
			}

			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					subTransName();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(64);
				moduleName();
				}
				break;
			}
			setState(67);
			((PlaceRefContext)_localctx).placeName = match(IDENTIFIER);
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

	public static class SubTransNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SCPNParser.IDENTIFIER, 0); }
		public TerminalNode LBRACK() { return getToken(SCPNParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SCPNParser.RBRACK, 0); }
		public TerminalNode DOT() { return getToken(SCPNParser.DOT, 0); }
		public SubTransNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subTransName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterSubTransName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitSubTransName(this);
		}
	}

	public final SubTransNameContext subTransName() throws RecognitionException {
		SubTransNameContext _localctx = new SubTransNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subTransName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IDENTIFIER);
			setState(70);
			match(LBRACK);
			setState(71);
			match(RBRACK);
			setState(72);
			match(DOT);
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

	public static class ModuleNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SCPNParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(SCPNParser.DOT, 0); }
		public ModuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitModuleName(this);
		}
	}

	public final ModuleNameContext moduleName() throws RecognitionException {
		ModuleNameContext _localctx = new ModuleNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moduleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(DOT);
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

	public static class ConstantContext extends ParserRuleContext {
		public NumericalConstantContext numericalConstant() {
			return getRuleContext(NumericalConstantContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SCPNParser.STRING_LITERAL, 0); }
		public TerminalNode DATETIME_LITERAL() { return getToken(SCPNParser.DATETIME_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(SCPNParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(SCPNParser.NULL_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constant);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				numericalConstant();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(STRING_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(DATETIME_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				match(BOOLEAN_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumericalConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(SCPNParser.INTEGER_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(SCPNParser.DECIMAL_LITERAL, 0); }
		public NumericalConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterNumericalConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitNumericalConstant(this);
		}
	}

	public final NumericalConstantContext numericalConstant() throws RecognitionException {
		NumericalConstantContext _localctx = new NumericalConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numericalConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_LITERAL || _la==DECIMAL_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MathematicalExpressionContext extends ParserRuleContext {
		public NumericalConstantContext numericalConstant() {
			return getRuleContext(NumericalConstantContext.class,0);
		}
		public List<MathematicalExpressionContext> mathematicalExpression() {
			return getRuleContexts(MathematicalExpressionContext.class);
		}
		public MathematicalExpressionContext mathematicalExpression(int i) {
			return getRuleContext(MathematicalExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SCPNParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SCPNParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SCPNParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SCPNParser.MINUS, 0); }
		public MathematicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterMathematicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitMathematicalExpression(this);
		}
	}

	public final MathematicalExpressionContext mathematicalExpression() throws RecognitionException {
		return mathematicalExpression(0);
	}

	private MathematicalExpressionContext mathematicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathematicalExpressionContext _localctx = new MathematicalExpressionContext(_ctx, _parentState);
		MathematicalExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_mathematicalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(88);
			numericalConstant();
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MathematicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpression);
						setState(90);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(91);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==STAR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
						mathematicalExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new MathematicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpression);
						setState(93);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(94);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						mathematicalExpression(2);
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InputInscriptionContext extends ParserRuleContext {
		public Token multiplicity;
		public TerminalNode IDENTIFIER() { return getToken(SCPNParser.IDENTIFIER, 0); }
		public TerminalNode APO() { return getToken(SCPNParser.APO, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(SCPNParser.INTEGER_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(SCPNParser.DECIMAL_LITERAL, 0); }
		public InputInscriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputInscription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterInputInscription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitInputInscription(this);
		}
	}

	public final InputInscriptionContext inputInscription() throws RecognitionException {
		InputInscriptionContext _localctx = new InputInscriptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inputInscription);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(IDENTIFIER);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				((InputInscriptionContext)_localctx).multiplicity = match(INTEGER_LITERAL);
				setState(103);
				match(APO);
				setState(104);
				match(IDENTIFIER);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(DECIMAL_LITERAL);
				setState(106);
				match(APO);
				setState(107);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OutputInscriptionContext extends ParserRuleContext {
		public Token multiplicity;
		public InputInscriptionContext inputInscription() {
			return getRuleContext(InputInscriptionContext.class,0);
		}
		public TokenCopyContext tokenCopy() {
			return getRuleContext(TokenCopyContext.class,0);
		}
		public TerminalNode APO() { return getToken(SCPNParser.APO, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(SCPNParser.DECIMAL_LITERAL, 0); }
		public TokenNewContext tokenNew() {
			return getRuleContext(TokenNewContext.class,0);
		}
		public TokenExtractContext tokenExtract() {
			return getRuleContext(TokenExtractContext.class,0);
		}
		public OutputInscriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputInscription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterOutputInscription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitOutputInscription(this);
		}
	}

	public final OutputInscriptionContext outputInscription() throws RecognitionException {
		OutputInscriptionContext _localctx = new OutputInscriptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_outputInscription);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				inputInscription();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DECIMAL_LITERAL) {
					{
					setState(111);
					((OutputInscriptionContext)_localctx).multiplicity = match(DECIMAL_LITERAL);
					setState(112);
					match(APO);
					}
				}

				setState(115);
				tokenCopy();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				tokenNew();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				tokenExtract();
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

	public static class TokenTransferContext extends ParserRuleContext {
		public Token tokenName;
		public TerminalNode IDENTIFIER() { return getToken(SCPNParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(SCPNParser.LPAREN, 0); }
		public AttributeAssignListContext attributeAssignList() {
			return getRuleContext(AttributeAssignListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SCPNParser.RPAREN, 0); }
		public TokenTransferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenTransfer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterTokenTransfer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitTokenTransfer(this);
		}
	}

	public final TokenTransferContext tokenTransfer() throws RecognitionException {
		TokenTransferContext _localctx = new TokenTransferContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tokenTransfer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((TokenTransferContext)_localctx).tokenName = match(IDENTIFIER);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(121);
				match(LPAREN);
				setState(122);
				attributeAssignList();
				setState(123);
				match(RPAREN);
				}
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

	public static class AttributeAssignListContext extends ParserRuleContext {
		public AttributeAssignmentContext attributeAssignment() {
			return getRuleContext(AttributeAssignmentContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(SCPNParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SCPNParser.SEMI, i);
		}
		public AttributeAssignListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeAssignList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterAttributeAssignList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitAttributeAssignList(this);
		}
	}

	public final AttributeAssignListContext attributeAssignList() throws RecognitionException {
		AttributeAssignListContext _localctx = new AttributeAssignListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributeAssignList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			attributeAssignment();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(128);
				match(SEMI);
				}
				}
				setState(133);
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

	public static class AttributeAssignmentContext extends ParserRuleContext {
		public Token attr;
		public TerminalNode ASSIGN() { return getToken(SCPNParser.ASSIGN, 0); }
		public TokenDescriptionContext tokenDescription() {
			return getRuleContext(TokenDescriptionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SCPNParser.IDENTIFIER, 0); }
		public AttributeAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterAttributeAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitAttributeAssignment(this);
		}
	}

	public final AttributeAssignmentContext attributeAssignment() throws RecognitionException {
		AttributeAssignmentContext _localctx = new AttributeAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributeAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((AttributeAssignmentContext)_localctx).attr = match(IDENTIFIER);
			setState(135);
			match(ASSIGN);
			setState(136);
			tokenDescription();
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

	public static class TokenDescriptionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(SCPNParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(SCPNParser.RCURLY, 0); }
		public AttributeAssignmentContext attributeAssignment() {
			return getRuleContext(AttributeAssignmentContext.class,0);
		}
		public TokenDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterTokenDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitTokenDescription(this);
		}
	}

	public final TokenDescriptionContext tokenDescription() throws RecognitionException {
		TokenDescriptionContext _localctx = new TokenDescriptionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tokenDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			expression();
			setState(139);
			match(LCURLY);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(140);
				attributeAssignment();
				}
			}

			setState(143);
			match(RCURLY);
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

	public static class TimeFunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SCPNParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SCPNParser.RPAREN, 0); }
		public TerminalNode EXP() { return getToken(SCPNParser.EXP, 0); }
		public TerminalNode DET() { return getToken(SCPNParser.DET, 0); }
		public TerminalNode UNI() { return getToken(SCPNParser.UNI, 0); }
		public TerminalNode DUNI() { return getToken(SCPNParser.DUNI, 0); }
		public TerminalNode TRIANG() { return getToken(SCPNParser.TRIANG, 0); }
		public TerminalNode NORM() { return getToken(SCPNParser.NORM, 0); }
		public TerminalNode LONGNORM() { return getToken(SCPNParser.LONGNORM, 0); }
		public TerminalNode WEI() { return getToken(SCPNParser.WEI, 0); }
		public TimeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitTimeFunction(this);
		}
	}

	public final TimeFunctionContext timeFunction() throws RecognitionException {
		TimeFunctionContext _localctx = new TimeFunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_timeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXP) | (1L << DET) | (1L << UNI) | (1L << DUNI) | (1L << TRIANG) | (1L << NORM) | (1L << LONGNORM) | (1L << WEI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(146);
			match(LPAREN);
			setState(147);
			expression();
			setState(148);
			match(RPAREN);
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

	public static class TokenCopyContext extends ParserRuleContext {
		public Token tokenname;
		public TerminalNode COPY() { return getToken(SCPNParser.COPY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SCPNParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(SCPNParser.LPAREN, 0); }
		public AttributeAssignListContext attributeAssignList() {
			return getRuleContext(AttributeAssignListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SCPNParser.RPAREN, 0); }
		public TokenCopyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenCopy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterTokenCopy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitTokenCopy(this);
		}
	}

	public final TokenCopyContext tokenCopy() throws RecognitionException {
		TokenCopyContext _localctx = new TokenCopyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tokenCopy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(COPY);
			setState(151);
			((TokenCopyContext)_localctx).tokenname = match(IDENTIFIER);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(152);
				match(LPAREN);
				setState(153);
				attributeAssignList();
				setState(154);
				match(RPAREN);
				}
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

	public static class TokenNewContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(SCPNParser.NEW, 0); }
		public TerminalNode LPAREN() { return getToken(SCPNParser.LPAREN, 0); }
		public TokenDescriptionContext tokenDescription() {
			return getRuleContext(TokenDescriptionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SCPNParser.RPAREN, 0); }
		public TokenNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterTokenNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitTokenNew(this);
		}
	}

	public final TokenNewContext tokenNew() throws RecognitionException {
		TokenNewContext _localctx = new TokenNewContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tokenNew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(NEW);
			setState(159);
			match(LPAREN);
			setState(160);
			tokenDescription();
			setState(161);
			match(RPAREN);
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

	public static class TokenExtractContext extends ParserRuleContext {
		public TokenReferenceContext tr;
		public TerminalNode EXTRACT() { return getToken(SCPNParser.EXTRACT, 0); }
		public TokenReferenceContext tokenReference() {
			return getRuleContext(TokenReferenceContext.class,0);
		}
		public TokenExtractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenExtract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterTokenExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitTokenExtract(this);
		}
	}

	public final TokenExtractContext tokenExtract() throws RecognitionException {
		TokenExtractContext _localctx = new TokenExtractContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tokenExtract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(EXTRACT);
			setState(164);
			((TokenExtractContext)_localctx).tr = tokenReference();
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

	public static class TokenReferenceContext extends ParserRuleContext {
		public Token tokenName;
		public TerminalNode IDENTIFIER() { return getToken(SCPNParser.IDENTIFIER, 0); }
		public TokenReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterTokenReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitTokenReference(this);
		}
	}

	public final TokenReferenceContext tokenReference() throws RecognitionException {
		TokenReferenceContext _localctx = new TokenReferenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tokenReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((TokenReferenceContext)_localctx).tokenName = match(IDENTIFIER);
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

	public static class TokenAttributeReferenceContext extends ParserRuleContext {
		public Token tokenAttribute;
		public TokenReferenceContext tokenReference() {
			return getRuleContext(TokenReferenceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SCPNParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SCPNParser.IDENTIFIER, 0); }
		public TokenAttributeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenAttributeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).enterTokenAttributeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPNListener ) ((SCPNListener)listener).exitTokenAttributeReference(this);
		}
	}

	public final TokenAttributeReferenceContext tokenAttributeReference() throws RecognitionException {
		TokenAttributeReferenceContext _localctx = new TokenAttributeReferenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tokenAttributeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			tokenReference();
			setState(169);
			match(DOT);
			setState(170);
			((TokenAttributeReferenceContext)_localctx).tokenAttribute = match(IDENTIFIER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return mathematicalExpression_sempred((MathematicalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathematicalExpression_sempred(MathematicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\5\2-\n\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\3\3\3\3\3\3\3\5\38\n\3\3\4\5\4;\n\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3"+
		"\4\5\4D\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7V\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tc\n\t\f"+
		"\t\16\tf\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\no\n\n\3\13\3\13\3\13\5\13"+
		"t\n\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u0080\n\f\3\r"+
		"\3\r\7\r\u0084\n\r\f\r\16\r\u0087\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\5\17\u0090\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u009f\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\2\3\20\26\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(\2\6\3\2CD\4\2\30\30  \4\2\32\32\35\35\3\2\t\20\2"+
		"\u00b3\2\60\3\2\2\2\4\67\3\2\2\2\6:\3\2\2\2\bG\3\2\2\2\nL\3\2\2\2\fU\3"+
		"\2\2\2\16W\3\2\2\2\20Y\3\2\2\2\22n\3\2\2\2\24x\3\2\2\2\26z\3\2\2\2\30"+
		"\u0081\3\2\2\2\32\u0088\3\2\2\2\34\u008c\3\2\2\2\36\u0093\3\2\2\2 \u0098"+
		"\3\2\2\2\"\u00a0\3\2\2\2$\u00a5\3\2\2\2&\u00a8\3\2\2\2(\u00aa\3\2\2\2"+
		"*,\5\4\3\2+-\7\22\2\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.*\3\2\2\2/\62\3\2"+
		"\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\3\3\2\2\2\62\60\3\2\2\2\638\5\22\n\2"+
		"\648\5\24\13\2\658\5\20\t\2\668\5\20\t\2\67\63\3\2\2\2\67\64\3\2\2\2\67"+
		"\65\3\2\2\2\67\66\3\2\2\28\5\3\2\2\29;\7\4\2\2:9\3\2\2\2:;\3\2\2\2;?\3"+
		"\2\2\2<>\5\b\5\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3"+
		"\2\2\2BD\5\n\6\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7A\2\2F\7\3\2\2\2GH\7"+
		"A\2\2HI\7;\2\2IJ\7<\2\2JK\7?\2\2K\t\3\2\2\2LM\7A\2\2MN\7?\2\2N\13\3\2"+
		"\2\2OV\5\16\b\2PV\3\2\2\2QV\7F\2\2RV\7E\2\2SV\7G\2\2TV\7\66\2\2UO\3\2"+
		"\2\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\r\3\2\2\2WX\t"+
		"\2\2\2X\17\3\2\2\2YZ\b\t\1\2Z[\5\16\b\2[d\3\2\2\2\\]\f\4\2\2]^\t\3\2\2"+
		"^c\5\20\t\5_`\f\3\2\2`a\t\4\2\2ac\5\20\t\4b\\\3\2\2\2b_\3\2\2\2cf\3\2"+
		"\2\2db\3\2\2\2de\3\2\2\2e\21\3\2\2\2fd\3\2\2\2go\7A\2\2hi\7C\2\2ij\7\5"+
		"\2\2jo\7A\2\2kl\7D\2\2lm\7\5\2\2mo\7A\2\2ng\3\2\2\2nh\3\2\2\2nk\3\2\2"+
		"\2o\23\3\2\2\2py\5\22\n\2qr\7D\2\2rt\7\5\2\2sq\3\2\2\2st\3\2\2\2tu\3\2"+
		"\2\2uy\5 \21\2vy\5\"\22\2wy\5$\23\2xp\3\2\2\2xs\3\2\2\2xv\3\2\2\2xw\3"+
		"\2\2\2y\25\3\2\2\2z\177\7A\2\2{|\7\67\2\2|}\5\30\r\2}~\78\2\2~\u0080\3"+
		"\2\2\2\177{\3\2\2\2\177\u0080\3\2\2\2\u0080\27\3\2\2\2\u0081\u0085\5\32"+
		"\16\2\u0082\u0084\7=\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\31\3\2\2\2\u0087\u0085\3\2\2"+
		"\2\u0088\u0089\7A\2\2\u0089\u008a\7\23\2\2\u008a\u008b\5\34\17\2\u008b"+
		"\33\3\2\2\2\u008c\u008d\5\4\3\2\u008d\u008f\79\2\2\u008e\u0090\5\32\16"+
		"\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\7:\2\2\u0092\35\3\2\2\2\u0093\u0094\t\5\2\2\u0094\u0095\7\67\2\2\u0095"+
		"\u0096\5\4\3\2\u0096\u0097\78\2\2\u0097\37\3\2\2\2\u0098\u0099\7\6\2\2"+
		"\u0099\u009e\7A\2\2\u009a\u009b\7\67\2\2\u009b\u009c\5\30\r\2\u009c\u009d"+
		"\78\2\2\u009d\u009f\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"!\3\2\2\2\u00a0\u00a1\7\7\2\2\u00a1\u00a2\7\67\2\2\u00a2\u00a3\5\34\17"+
		"\2\u00a3\u00a4\78\2\2\u00a4#\3\2\2\2\u00a5\u00a6\7\b\2\2\u00a6\u00a7\5"+
		"&\24\2\u00a7%\3\2\2\2\u00a8\u00a9\7A\2\2\u00a9\'\3\2\2\2\u00aa\u00ab\5"+
		"&\24\2\u00ab\u00ac\7?\2\2\u00ac\u00ad\7A\2\2\u00ad)\3\2\2\2\22,\60\67"+
		":?CUbdnsx\177\u0085\u008f\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}