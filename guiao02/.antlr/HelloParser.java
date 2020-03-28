// Generated from /home/tiagorainho/Desktop/Uni/2 ano/LFA/pratica/guiao02/Hello.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYE=1, HELLO=2, ID=3, WS=4;
	public static final int
		RULE_greetings = 0;
	public static final String[] ruleNames = {
		"greetings"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'bye'", "'hello'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BYE", "HELLO", "ID", "WS"
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GreetingsContext extends ParserRuleContext {
		public TerminalNode HELLO() { return getToken(HelloParser.HELLO, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode BYE() { return getToken(HelloParser.BYE, 0); }
		public GreetingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greetings; }
	}

	public final GreetingsContext greetings() throws RecognitionException {
		GreetingsContext _localctx = new GreetingsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_greetings);
		try {
			setState(6);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HELLO:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				match(HELLO);
				setState(3);
				match(ID);
				}
				break;
			case BYE:
				enterOuterAlt(_localctx, 2);
				{
				setState(4);
				match(BYE);
				setState(5);
				match(ID);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\13\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\5\2\t\n\2\3\2\2\2\3\2\2\2\2\n\2\b\3\2\2\2\4\5\7\4\2\2\5\t"+
		"\7\5\2\2\6\7\7\3\2\2\7\t\7\5\2\2\b\4\3\2\2\2\b\6\3\2\2\2\t\3\3\2\2\2\3"+
		"\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}