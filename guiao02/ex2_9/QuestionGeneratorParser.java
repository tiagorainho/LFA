// Generated from QuestionGenerator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuestionGeneratorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Integer=8, String=9, 
		NEWLINE=10, WS=11, COMMENT=12;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_questionBlock = 2, RULE_header = 3, 
		RULE_questionStat = 4, RULE_body = 5, RULE_question = 6, RULE_answear = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "questionBlock", "header", "questionStat", "body", 
			"question", "answear"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'(\"'", "'\")'", "'\"'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "Integer", "String", 
			"NEWLINE", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "QuestionGenerator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuestionGeneratorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QuestionGeneratorParser.EOF, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGeneratorVisitor ) return ((QuestionGeneratorVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String) | (1L << NEWLINE) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(16);
				stat();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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
	public static class StatQuestionContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(QuestionGeneratorParser.NEWLINE, 0); }
		public QuestionBlockContext questionBlock() {
			return getRuleContext(QuestionBlockContext.class,0);
		}
		public StatQuestionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).enterStatQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).exitStatQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGeneratorVisitor ) return ((QuestionGeneratorVisitor<? extends T>)visitor).visitStatQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatCommentContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(QuestionGeneratorParser.NEWLINE, 0); }
		public TerminalNode COMMENT() { return getToken(QuestionGeneratorParser.COMMENT, 0); }
		public StatCommentContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).enterStatComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).exitStatComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGeneratorVisitor ) return ((QuestionGeneratorVisitor<? extends T>)visitor).visitStatComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new StatCommentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(24);
					match(COMMENT);
					}
				}

				setState(27);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new StatQuestionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(28);
					questionBlock();
					}
				}

				setState(31);
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

	public static class QuestionBlockContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public QuestionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).enterQuestionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).exitQuestionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGeneratorVisitor ) return ((QuestionGeneratorVisitor<? extends T>)visitor).visitQuestionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionBlockContext questionBlock() throws RecognitionException {
		QuestionBlockContext _localctx = new QuestionBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_questionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			header();
			setState(35);
			match(T__0);
			setState(36);
			body();
			setState(37);
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

	public static class HeaderContext extends ParserRuleContext {
		public Token questionName;
		public QuestionStatContext questionStat() {
			return getRuleContext(QuestionStatContext.class,0);
		}
		public TerminalNode String() { return getToken(QuestionGeneratorParser.String, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGeneratorVisitor ) return ((QuestionGeneratorVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((HeaderContext)_localctx).questionName = match(String);
			setState(40);
			questionStat();
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

	public static class QuestionStatContext extends ParserRuleContext {
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public QuestionStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).enterQuestionStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).exitQuestionStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGeneratorVisitor ) return ((QuestionGeneratorVisitor<? extends T>)visitor).visitQuestionStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionStatContext questionStat() throws RecognitionException {
		QuestionStatContext _localctx = new QuestionStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_questionStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__2);
			setState(43);
			question();
			setState(44);
			match(T__3);
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

	public static class BodyContext extends ParserRuleContext {
		public List<AnswearContext> answear() {
			return getRuleContexts(AnswearContext.class);
		}
		public AnswearContext answear(int i) {
			return getRuleContext(AnswearContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGeneratorVisitor ) return ((QuestionGeneratorVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				answear();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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

	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(QuestionGeneratorParser.String, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGeneratorVisitor ) return ((QuestionGeneratorVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(String);
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

	public static class AnswearContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(QuestionGeneratorParser.String, 0); }
		public TerminalNode Integer() { return getToken(QuestionGeneratorParser.Integer, 0); }
		public AnswearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).enterAnswear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionGeneratorListener ) ((QuestionGeneratorListener)listener).exitAnswear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionGeneratorVisitor ) return ((QuestionGeneratorVisitor<? extends T>)visitor).visitAnswear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswearContext answear() throws RecognitionException {
		AnswearContext _localctx = new AnswearContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_answear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__4);
			setState(54);
			match(String);
			setState(55);
			match(T__4);
			setState(56);
			match(T__5);
			setState(57);
			match(Integer);
			setState(58);
			match(T__6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\2\3\2\3\3\5\3\34\n\3\3\3\3\3\5\3 \n\3\3\3\5\3#\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7\62\n\7\r\7\16\7\63"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2"+
		";\2\25\3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\b)\3\2\2\2\n,\3\2\2\2\f\61\3\2\2"+
		"\2\16\65\3\2\2\2\20\67\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2"+
		"\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\31\7\2\2"+
		"\3\31\3\3\2\2\2\32\34\7\16\2\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2"+
		"\2\35#\7\f\2\2\36 \5\6\4\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!#\7\f\2"+
		"\2\"\33\3\2\2\2\"\37\3\2\2\2#\5\3\2\2\2$%\5\b\5\2%&\7\3\2\2&\'\5\f\7\2"+
		"\'(\7\4\2\2(\7\3\2\2\2)*\7\13\2\2*+\5\n\6\2+\t\3\2\2\2,-\7\5\2\2-.\5\16"+
		"\b\2./\7\6\2\2/\13\3\2\2\2\60\62\5\20\t\2\61\60\3\2\2\2\62\63\3\2\2\2"+
		"\63\61\3\2\2\2\63\64\3\2\2\2\64\r\3\2\2\2\65\66\7\13\2\2\66\17\3\2\2\2"+
		"\678\7\7\2\289\7\13\2\29:\7\7\2\2:;\7\b\2\2;<\7\n\2\2<=\7\t\2\2=\21\3"+
		"\2\2\2\7\25\33\37\"\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}