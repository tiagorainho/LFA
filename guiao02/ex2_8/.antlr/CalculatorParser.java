// Generated from /home/tiagorainho/Desktop/Uni/2 ano/LFA/pratica/guiao02/ex2_8/Calculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, VAR=14, Value=15, NEWLINE=16, WS=17, 
		COMMENT=18;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_print = 2, RULE_assignment = 3, 
		RULE_expr = 4, RULE_frac = 5;
	public static final String[] ruleNames = {
		"program", "stat", "print", "assignment", "expr", "frac"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'print '", "'->'", "'-'", "'+'", "'*'", "':'", "'%'", "'('", 
		"')^'", "')'", "'reduce '", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "VAR", "Value", "NEWLINE", "WS", "COMMENT"
	};
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CalculatorParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__11) | (1L << VAR) | (1L << Value))) != 0)) {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatExprContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatExprContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class StatPrintContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatPrintContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class StatAssignContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatAssignContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new StatExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__11) | (1L << VAR) | (1L << Value))) != 0)) {
					{
					setState(20);
					expr(0);
					}
				}

				setState(23);
				match(T__0);
				setState(24);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new StatAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__11) | (1L << VAR) | (1L << Value))) != 0)) {
					{
					setState(25);
					assignment();
					}
				}

				setState(28);
				match(T__0);
				setState(29);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new StatPrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(30);
					print();
					}
				}

				setState(33);
				match(T__0);
				setState(34);
				match(NEWLINE);
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__1);
			setState(38);
			expr(0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(CalculatorParser.VAR, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			expr(0);
			setState(41);
			match(T__2);
			setState(42);
			match(VAR);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprVarContext extends ExprContext {
		public TerminalNode VAR() { return getToken(CalculatorParser.VAR, 0); }
		public ExprVarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPowersContext extends ExprContext {
		public ExprContext base;
		public ExprContext power;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprPowersContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMultiDivModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultiDivModContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParentContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParentContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIntegerContext extends ExprContext {
		public TerminalNode Value() { return getToken(CalculatorParser.Value, 0); }
		public ExprIntegerContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSigContext extends ExprContext {
		public Token sig;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSigContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprReduceContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprReduceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprFractionContext extends ExprContext {
		public FracContext frac() {
			return getRuleContext(FracContext.class,0);
		}
		public ExprFractionContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new ExprSigContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(45);
				((ExprSigContext)_localctx).sig = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
					((ExprSigContext)_localctx).sig = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(46);
				expr(9);
				}
				break;
			case 2:
				{
				_localctx = new ExprFractionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				frac();
				}
				break;
			case 3:
				{
				_localctx = new ExprPowersContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(T__8);
				setState(49);
				((ExprPowersContext)_localctx).base = expr(0);
				setState(50);
				match(T__9);
				setState(51);
				((ExprPowersContext)_localctx).power = expr(5);
				}
				break;
			case 4:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(Value);
				}
				break;
			case 5:
				{
				_localctx = new ExprVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(VAR);
				}
				break;
			case 6:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(T__8);
				setState(56);
				expr(0);
				setState(57);
				match(T__10);
				}
				break;
			case 7:
				{
				_localctx = new ExprReduceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(T__11);
				setState(60);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultiDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(64);
						((ExprMultiDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
							((ExprMultiDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(65);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(67);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(68);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class FracContext extends ParserRuleContext {
		public Token value1;
		public Token op;
		public Token value2;
		public List<TerminalNode> Value() { return getTokens(CalculatorParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(CalculatorParser.Value, i);
		}
		public FracContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frac; }
	}

	public final FracContext frac() throws RecognitionException {
		FracContext _localctx = new FracContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_frac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			((FracContext)_localctx).value1 = match(Value);
			setState(75);
			((FracContext)_localctx).op = match(T__12);
			setState(76);
			((FracContext)_localctx).value2 = match(Value);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\5\3\30\n\3\3\3\3\3\3\3\5\3\35\n\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3"+
		"\3\5\3&\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6H\n\6\f\6\16\6K\13\6\3\7\3\7\3\7\3\7\3\7\2\3\n\b\2\4\6\b\n\f\2\4"+
		"\3\2\6\7\3\2\b\n\2X\2\21\3\2\2\2\4%\3\2\2\2\6\'\3\2\2\2\b*\3\2\2\2\n?"+
		"\3\2\2\2\fL\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3"+
		"\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25\7\2\2\3\25\3\3"+
		"\2\2\2\26\30\5\n\6\2\27\26\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\7"+
		"\3\2\2\32&\7\22\2\2\33\35\5\b\5\2\34\33\3\2\2\2\34\35\3\2\2\2\35\36\3"+
		"\2\2\2\36\37\7\3\2\2\37&\7\22\2\2 \"\5\6\4\2! \3\2\2\2!\"\3\2\2\2\"#\3"+
		"\2\2\2#$\7\3\2\2$&\7\22\2\2%\27\3\2\2\2%\34\3\2\2\2%!\3\2\2\2&\5\3\2\2"+
		"\2\'(\7\4\2\2()\5\n\6\2)\7\3\2\2\2*+\5\n\6\2+,\7\5\2\2,-\7\20\2\2-\t\3"+
		"\2\2\2./\b\6\1\2/\60\t\2\2\2\60@\5\n\6\13\61@\5\f\7\2\62\63\7\13\2\2\63"+
		"\64\5\n\6\2\64\65\7\f\2\2\65\66\5\n\6\7\66@\3\2\2\2\67@\7\21\2\28@\7\20"+
		"\2\29:\7\13\2\2:;\5\n\6\2;<\7\r\2\2<@\3\2\2\2=>\7\16\2\2>@\5\n\6\3?.\3"+
		"\2\2\2?\61\3\2\2\2?\62\3\2\2\2?\67\3\2\2\2?8\3\2\2\2?9\3\2\2\2?=\3\2\2"+
		"\2@I\3\2\2\2AB\f\n\2\2BC\t\3\2\2CH\5\n\6\13DE\f\t\2\2EF\t\2\2\2FH\5\n"+
		"\6\nGA\3\2\2\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KI\3"+
		"\2\2\2LM\7\21\2\2MN\7\17\2\2NO\7\21\2\2O\r\3\2\2\2\n\21\27\34!%?GI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}