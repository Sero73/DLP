// Generated from C:/Users/Serop/Desktop/Clase2025-26/DLP/DLP/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITES=1, SINGLE_LINE_COMMENT=2, MULTILINE_COMMENT=3, INT_CONSTANT=4, 
		REAL_CONSTANT=5, CHAR_CONSTANT=6, IDENTIFIERS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGITO", "BASE", "EXPONENTE", "WHITES", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "IDENTIFIERS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITES", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "INT_CONSTANT", 
			"REAL_CONSTANT", "CHAR_CONSTANT", "IDENTIFIERS"
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


	public TSmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TSmm.g4"; }

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
		"\u0004\u0000\u0007v\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001b\b\u0001\n\u0001\f\u0001"+
		"\u001e\t\u0001\u0001\u0001\u0001\u0001\u0004\u0001\"\b\u0001\u000b\u0001"+
		"\f\u0001#\u0003\u0001&\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002*\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003/\b\u0003\u000b"+
		"\u0003\f\u00030\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u00049\b\u0004\n\u0004\f\u0004<\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005D\b\u0005\n\u0005\f\u0005G\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006P\b"+
		"\u0006\n\u0006\f\u0006S\t\u0006\u0001\u0006\u0003\u0006V\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007_\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0004\be\b"+
		"\b\u000b\b\f\bf\u0001\b\u0003\bj\b\b\u0003\bl\b\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0005\tr\b\t\n\t\f\tu\t\t\u0001E\u0000\n\u0001\u0000\u0003"+
		"\u0000\u0005\u0000\u0007\u0001\t\u0002\u000b\u0003\r\u0004\u000f\u0005"+
		"\u0011\u0006\u0013\u0007\u0001\u0000\t\u0001\u000009\u0002\u0000EEee\u0002"+
		"\u0000++--\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0001\u000019\u0002"+
		"\u0000nntt\u0003\u0000AZ__az\u0004\u000009AZ__az\u0081\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0001\u0015\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000"+
		"\u0005\'\u0001\u0000\u0000\u0000\u0007.\u0001\u0000\u0000\u0000\t4\u0001"+
		"\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\rU\u0001\u0000\u0000"+
		"\u0000\u000f^\u0001\u0000\u0000\u0000\u0011`\u0001\u0000\u0000\u0000\u0013"+
		"o\u0001\u0000\u0000\u0000\u0015\u0016\u0007\u0000\u0000\u0000\u0016\u0002"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0003\r\u0006\u0000\u0018\u001c\u0005"+
		".\u0000\u0000\u0019\u001b\u0003\u0001\u0000\u0000\u001a\u0019\u0001\u0000"+
		"\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d&\u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f!\u0005.\u0000\u0000 "+
		"\"\u0003\u0001\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000"+
		"\u0000\u0000%\u0017\u0001\u0000\u0000\u0000%\u001f\u0001\u0000\u0000\u0000"+
		"&\u0004\u0001\u0000\u0000\u0000\')\u0007\u0001\u0000\u0000(*\u0007\u0002"+
		"\u0000\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+,\u0003\r\u0006\u0000,\u0006\u0001\u0000\u0000\u0000"+
		"-/\u0007\u0003\u0000\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000023\u0006\u0003\u0000\u00003\b\u0001\u0000\u0000\u000045\u0005"+
		"/\u0000\u000056\u0005/\u0000\u00006:\u0001\u0000\u0000\u000079\b\u0004"+
		"\u0000\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000=>\u0006\u0004\u0000\u0000>\n\u0001\u0000\u0000"+
		"\u0000?@\u0005/\u0000\u0000@A\u0005*\u0000\u0000AE\u0001\u0000\u0000\u0000"+
		"BD\t\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000HI\u0005*\u0000\u0000IJ\u0005/\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0006\u0005\u0000\u0000L\f\u0001\u0000\u0000"+
		"\u0000MQ\u0007\u0005\u0000\u0000NP\u0007\u0000\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RV\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"TV\u00050\u0000\u0000UM\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000"+
		"V\u000e\u0001\u0000\u0000\u0000WX\u0003\u0003\u0001\u0000XY\u0003\u0005"+
		"\u0002\u0000Y_\u0001\u0000\u0000\u0000Z[\u0003\r\u0006\u0000[\\\u0003"+
		"\u0005\u0002\u0000\\_\u0001\u0000\u0000\u0000]_\u0003\u0003\u0001\u0000"+
		"^W\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000_\u0010\u0001\u0000\u0000\u0000`k\u0005\'\u0000\u0000al\t\u0000"+
		"\u0000\u0000bi\u0005\\\u0000\u0000ce\u0003\u0001\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hj\u0007\u0006\u0000\u0000"+
		"id\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000"+
		"\u0000ka\u0001\u0000\u0000\u0000kb\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0005\'\u0000\u0000n\u0012\u0001\u0000\u0000\u0000os\u0007"+
		"\u0007\u0000\u0000pr\u0007\b\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"t\u0014\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000\u000f\u0000"+
		"\u001c#%)0:EQU^fiks\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}