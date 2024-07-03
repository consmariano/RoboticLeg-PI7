// Generated from GCode.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, INT=12, ID=13, WS=14, STRING=15;
	public static final int
		RULE_gcode = 0, RULE_fimprograma = 1, RULE_statement = 2, RULE_numerolinha = 3, 
		RULE_mfim = 4, RULE_mfunc = 5, RULE_codfunc = 6, RULE_coordx = 7, RULE_coordy = 8, 
		RULE_coord = 9, RULE_fimdelinha = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"gcode", "fimprograma", "statement", "numerolinha", "mfim", "mfunc", 
			"codfunc", "coordx", "coordy", "coord", "fimdelinha"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'N'", "'M30'", "'M02'", "'M01'", "'G01'", "'G00'", "'X'", "'Y'", 
			"'\r'", "'\n'", "'\r\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INT", "ID", "WS", "STRING"
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
	public String getGrammarFileName() { return "GCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GcodeContext extends ParserRuleContext {
		public FimprogramaContext fimprograma() {
			return getRuleContext(FimprogramaContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public GcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).enterGcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).exitGcode(this);
		}
	}

	public final GcodeContext gcode() throws RecognitionException {
		GcodeContext _localctx = new GcodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gcode);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(22);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(25); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(27);
			fimprograma();
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

	public static class FimprogramaContext extends ParserRuleContext {
		public NumerolinhaContext numerolinha() {
			return getRuleContext(NumerolinhaContext.class,0);
		}
		public MfimContext mfim() {
			return getRuleContext(MfimContext.class,0);
		}
		public FimprogramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fimprograma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).enterFimprograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).exitFimprograma(this);
		}
	}

	public final FimprogramaContext fimprograma() throws RecognitionException {
		FimprogramaContext _localctx = new FimprogramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fimprograma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			numerolinha();
			setState(30);
			mfim();
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

	public static class StatementContext extends ParserRuleContext {
		public NumerolinhaContext numerolinha() {
			return getRuleContext(NumerolinhaContext.class,0);
		}
		public CodfuncContext codfunc() {
			return getRuleContext(CodfuncContext.class,0);
		}
		public FimdelinhaContext fimdelinha() {
			return getRuleContext(FimdelinhaContext.class,0);
		}
		public CoordxContext coordx() {
			return getRuleContext(CoordxContext.class,0);
		}
		public CoordyContext coordy() {
			return getRuleContext(CoordyContext.class,0);
		}
		public MfuncContext mfunc() {
			return getRuleContext(MfuncContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				numerolinha();
				setState(33);
				codfunc();
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(34);
					coordx();
					}
				}

				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(37);
					coordy();
					}
				}

				setState(40);
				fimdelinha();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				numerolinha();
				setState(43);
				mfunc();
				setState(44);
				fimdelinha();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				fimdelinha();
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

	public static class NumerolinhaContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GCodeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GCodeParser.INT, i);
		}
		public NumerolinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerolinha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).enterNumerolinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).exitNumerolinha(this);
		}
	}

	public final NumerolinhaContext numerolinha() throws RecognitionException {
		NumerolinhaContext _localctx = new NumerolinhaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numerolinha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			match(INT);
			setState(51);
			match(INT);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(52);
				match(INT);
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

	public static class MfimContext extends ParserRuleContext {
		public MfimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mfim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).enterMfim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).exitMfim(this);
		}
	}

	public final MfimContext mfim() throws RecognitionException {
		MfimContext _localctx = new MfimContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mfim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__1);
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

	public static class MfuncContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GCodeParser.STRING, 0); }
		public MfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).enterMfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).exitMfunc(this);
		}
	}

	public final MfuncContext mfunc() throws RecognitionException {
		MfuncContext _localctx = new MfuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mfunc);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__3);
				setState(59);
				match(STRING);
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

	public static class CodfuncContext extends ParserRuleContext {
		public CodfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).enterCodfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).exitCodfunc(this);
		}
	}

	public final CodfuncContext codfunc() throws RecognitionException {
		CodfuncContext _localctx = new CodfuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_codfunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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

	public static class CoordxContext extends ParserRuleContext {
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public CoordxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).enterCoordx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).exitCoordx(this);
		}
	}

	public final CoordxContext coordx() throws RecognitionException {
		CoordxContext _localctx = new CoordxContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_coordx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__6);
			setState(65);
			coord();
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

	public static class CoordyContext extends ParserRuleContext {
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public CoordyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).enterCoordy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).exitCoordy(this);
		}
	}

	public final CoordyContext coordy() throws RecognitionException {
		CoordyContext _localctx = new CoordyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_coordy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__7);
			setState(68);
			coord();
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

	public static class CoordContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GCodeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GCodeParser.INT, i);
		}
		public CoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).enterCoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).exitCoord(this);
		}
	}

	public final CoordContext coord() throws RecognitionException {
		CoordContext _localctx = new CoordContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_coord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(INT);
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(71);
				match(INT);
				}
				break;
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(74);
				match(INT);
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

	public static class FimdelinhaContext extends ParserRuleContext {
		public FimdelinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fimdelinha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).enterFimdelinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GCodeListener ) ((GCodeListener)listener).exitFimdelinha(this);
		}
	}

	public final FimdelinhaContext fimdelinha() throws RecognitionException {
		FimdelinhaContext _localctx = new FimdelinhaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fimdelinha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4"+
		"&\n\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3\5"+
		"\3\5\5\58\n\5\3\6\3\6\3\7\3\7\3\7\5\7?\n\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\5\13K\n\13\3\13\5\13N\n\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n"+
		"\f\16\20\22\24\26\2\4\3\2\7\b\3\2\13\r\2O\2\31\3\2\2\2\4\37\3\2\2\2\6"+
		"\61\3\2\2\2\b\63\3\2\2\2\n9\3\2\2\2\f>\3\2\2\2\16@\3\2\2\2\20B\3\2\2\2"+
		"\22E\3\2\2\2\24H\3\2\2\2\26O\3\2\2\2\30\32\5\6\4\2\31\30\3\2\2\2\32\33"+
		"\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\5\4\3\2\36\3"+
		"\3\2\2\2\37 \5\b\5\2 !\5\n\6\2!\5\3\2\2\2\"#\5\b\5\2#%\5\16\b\2$&\5\20"+
		"\t\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2\')\5\22\n\2(\'\3\2\2\2()\3\2\2\2)*"+
		"\3\2\2\2*+\5\26\f\2+\62\3\2\2\2,-\5\b\5\2-.\5\f\7\2./\5\26\f\2/\62\3\2"+
		"\2\2\60\62\5\26\f\2\61\"\3\2\2\2\61,\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2"+
		"\2\63\64\7\3\2\2\64\65\7\16\2\2\65\67\7\16\2\2\668\7\16\2\2\67\66\3\2"+
		"\2\2\678\3\2\2\28\t\3\2\2\29:\7\4\2\2:\13\3\2\2\2;?\7\5\2\2<=\7\6\2\2"+
		"=?\7\21\2\2>;\3\2\2\2><\3\2\2\2?\r\3\2\2\2@A\t\2\2\2A\17\3\2\2\2BC\7\t"+
		"\2\2CD\5\24\13\2D\21\3\2\2\2EF\7\n\2\2FG\5\24\13\2G\23\3\2\2\2HJ\7\16"+
		"\2\2IK\7\16\2\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\7\16\2\2ML\3\2\2\2MN\3"+
		"\2\2\2N\25\3\2\2\2OP\t\3\2\2P\27\3\2\2\2\n\33%(\61\67>JM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}