// Generated from /home/tiagorainho/Desktop/Uni/2 ano/LFA/pratica/guiao02/ex2_9/QuestionGenerator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuestionGeneratorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Integer=7, ID=8, String=9, 
		NEWLINE=10, WS=11, COMMENT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Integer", "ID", "String", 
		"ESC", "NEWLINE", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{\n'", "'}'", "'('", "')'", "':'", "';\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "Integer", "ID", "String", "NEWLINE", 
		"WS", "COMMENT"
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


	public QuestionGeneratorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QuestionGenerator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\6\b-\n\b\r\b\16\b.\3\t\6\t\62\n\t\r\t\16\t\63\3\n"+
		"\3\n\3\n\6\n9\n\n\r\n\16\n:\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13F\n\13\3\f\5\fI\n\f\3\f\3\f\3\r\6\rN\n\r\r\r\16\rO\3\r\3\r\3\16\3"+
		"\16\7\16V\n\16\f\16\16\16Y\13\16\3\16\3\16\3\16\3\16\4:W\2\17\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\f\31\r\33\16\3\2\5\3\2\62;\7"+
		"\2\60\60\62;C\\aac|\4\2\13\13\"\"\2d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5 \3\2\2"+
		"\2\7\"\3\2\2\2\t$\3\2\2\2\13&\3\2\2\2\r(\3\2\2\2\17,\3\2\2\2\21\61\3\2"+
		"\2\2\23\65\3\2\2\2\25E\3\2\2\2\27H\3\2\2\2\31M\3\2\2\2\33S\3\2\2\2\35"+
		"\36\7}\2\2\36\37\7\f\2\2\37\4\3\2\2\2 !\7\177\2\2!\6\3\2\2\2\"#\7*\2\2"+
		"#\b\3\2\2\2$%\7+\2\2%\n\3\2\2\2&\'\7<\2\2\'\f\3\2\2\2()\7=\2\2)*\7\f\2"+
		"\2*\16\3\2\2\2+-\t\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\20\3"+
		"\2\2\2\60\62\t\3\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3"+
		"\2\2\2\64\22\3\2\2\2\658\7$\2\2\669\5\25\13\2\679\13\2\2\28\66\3\2\2\2"+
		"8\67\3\2\2\29:\3\2\2\2:;\3\2\2\2:8\3\2\2\2;<\3\2\2\2<=\7$\2\2=\24\3\2"+
		"\2\2>?\7\61\2\2?@\7\61\2\2@F\7$\2\2AB\7\61\2\2BC\7\61\2\2CD\7\61\2\2D"+
		"F\7\61\2\2E>\3\2\2\2EA\3\2\2\2F\26\3\2\2\2GI\7\17\2\2HG\3\2\2\2HI\3\2"+
		"\2\2IJ\3\2\2\2JK\7\f\2\2K\30\3\2\2\2LN\t\4\2\2ML\3\2\2\2NO\3\2\2\2OM\3"+
		"\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\b\r\2\2R\32\3\2\2\2SW\7%\2\2TV\13\2\2\2U"+
		"T\3\2\2\2VY\3\2\2\2WX\3\2\2\2WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\f\2\2"+
		"[\\\3\2\2\2\\]\b\16\2\2]\34\3\2\2\2\13\2.\638:EHOW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}