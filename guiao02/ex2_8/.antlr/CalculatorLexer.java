// Generated from /home/tiagorainho/Desktop/Uni/2 ano/LFA/pratica/guiao02/ex2_8/Calculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, VAR=14, Value=15, NEWLINE=16, WS=17, 
		COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "VAR", "Value", "NEWLINE", "WS", "COMMENT"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\6\17P\n\17\r\17\16\17Q\3\20\6\20"+
		"U\n\20\r\20\16\20V\3\21\5\21Z\n\21\3\21\3\21\3\22\6\22_\n\22\r\22\16\22"+
		"`\3\22\3\22\3\23\3\23\7\23g\n\23\f\23\16\23j\13\23\3\23\3\23\3\23\3\23"+
		"\3h\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\3\2\5\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\2s\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7\60\3\2\2\2\t\63\3\2\2\2\13\65\3\2"+
		"\2\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27B"+
		"\3\2\2\2\31D\3\2\2\2\33L\3\2\2\2\35O\3\2\2\2\37T\3\2\2\2!Y\3\2\2\2#^\3"+
		"\2\2\2%d\3\2\2\2\'(\7=\2\2(\4\3\2\2\2)*\7r\2\2*+\7t\2\2+,\7k\2\2,-\7p"+
		"\2\2-.\7v\2\2./\7\"\2\2/\6\3\2\2\2\60\61\7/\2\2\61\62\7@\2\2\62\b\3\2"+
		"\2\2\63\64\7/\2\2\64\n\3\2\2\2\65\66\7-\2\2\66\f\3\2\2\2\678\7,\2\28\16"+
		"\3\2\2\29:\7<\2\2:\20\3\2\2\2;<\7\'\2\2<\22\3\2\2\2=>\7*\2\2>\24\3\2\2"+
		"\2?@\7+\2\2@A\7`\2\2A\26\3\2\2\2BC\7+\2\2C\30\3\2\2\2DE\7t\2\2EF\7g\2"+
		"\2FG\7f\2\2GH\7w\2\2HI\7e\2\2IJ\7g\2\2JK\7\"\2\2K\32\3\2\2\2LM\7\61\2"+
		"\2M\34\3\2\2\2NP\t\2\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\36\3"+
		"\2\2\2SU\t\3\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W \3\2\2\2XZ\7"+
		"\17\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\f\2\2\\\"\3\2\2\2]_\t\4\2\2"+
		"^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\22\2\2c$\3\2\2"+
		"\2dh\7%\2\2eg\13\2\2\2fe\3\2\2\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2\2ik\3\2\2"+
		"\2jh\3\2\2\2kl\7\f\2\2lm\3\2\2\2mn\b\23\2\2n&\3\2\2\2\b\2QVY`h\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}