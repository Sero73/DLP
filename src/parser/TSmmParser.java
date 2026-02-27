// Generated from C:/Users/Serop/Desktop/Clase2025-26/DLP/DLP/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		WHITES=39, SINGLE_LINE_COMMENT=40, MULTILINE_COMMENT=41, INT_CONSTANT=42, 
		REAL_CONSTANT=43, CHAR_CONSTANT=44, IDENTIFIERS=45;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_expressions = 2, RULE_statement = 3, 
		RULE_function = 4, RULE_definition = 5, RULE_function_definition = 6, 
		RULE_parameter = 7, RULE_parameters = 8, RULE_variable_definition = 9, 
		RULE_variables = 10, RULE_body = 11, RULE_simple_type = 12, RULE_type = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "expressions", "statement", "function", "definition", 
			"function_definition", "parameter", "parameters", "variable_definition", 
			"variables", "body", "simple_type", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'as'", "'-'", "'!'", "'*'", 
			"'%'", "'/'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", 
			"'||'", "','", "'input'", "';'", "'='", "'log'", "'while'", "'if'", "'else'", 
			"'return'", "'function'", "':'", "'{'", "'}'", "'let'", "'int'", "'number'", 
			"'char'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WHITES", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "IDENTIFIERS"
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
	public String getGrammarFileName() { return "TSmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TSmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TSmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__33) {
				{
				{
				setState(28);
				definition();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(TSmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(TSmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(TSmmParser.IDENTIFIERS, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(38);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(39);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(40);
				match(IDENTIFIERS);
				}
				break;
			case 5:
				{
				setState(41);
				function();
				}
				break;
			case 6:
				{
				setState(42);
				match(T__0);
				setState(43);
				expression(0);
				setState(44);
				match(T__1);
				}
				break;
			case 7:
				{
				setState(46);
				match(T__0);
				setState(47);
				expression(0);
				setState(48);
				match(T__5);
				setState(49);
				simple_type();
				setState(50);
				match(T__1);
				}
				break;
			case 8:
				{
				setState(52);
				match(T__6);
				setState(53);
				expression(7);
				}
				break;
			case 9:
				{
				setState(54);
				match(T__7);
				setState(55);
				expression(6);
				}
				break;
			case 10:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(79);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(59);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(60);
						match(T__4);
						setState(61);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(63);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(64);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(66);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(67);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(69);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(72);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(73);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(75);
						match(T__2);
						setState(76);
						expression(0);
						setState(77);
						match(T__3);
						}
						break;
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressions);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				expression(0);
				setState(86);
				match(T__20);
				setState(87);
				expressions();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__21);
				setState(92);
				expressions();
				setState(93);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				expression(0);
				setState(96);
				match(T__23);
				setState(97);
				expression(0);
				setState(98);
				match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(T__24);
				setState(101);
				expressions();
				setState(102);
				match(T__22);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(T__25);
				setState(105);
				match(T__0);
				setState(106);
				expression(0);
				setState(107);
				match(T__1);
				setState(108);
				body();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(T__26);
				setState(111);
				match(T__0);
				setState(112);
				expression(0);
				setState(113);
				match(T__1);
				setState(114);
				body();
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(115);
					match(T__27);
					setState(116);
					body();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				match(T__28);
				setState(120);
				expression(0);
				setState(121);
				match(T__22);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				function();
				setState(124);
				match(T__22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(TSmmParser.IDENTIFIERS, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(IDENTIFIERS);
				setState(129);
				match(T__0);
				setState(130);
				expressions();
				setState(131);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(IDENTIFIERS);
				setState(134);
				match(T__0);
				setState(135);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Variable_definitionContext variable_definition() {
			return getRuleContext(Variable_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definition);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				function_definition();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				variable_definition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(TSmmParser.IDENTIFIERS, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__29);
			setState(143);
			match(IDENTIFIERS);
			setState(144);
			match(T__0);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIERS) {
				{
				setState(145);
				parameters();
				}
			}

			setState(148);
			match(T__1);
			setState(149);
			match(T__30);
			setState(150);
			simple_type();
			setState(151);
			match(T__31);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					variable_definition();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					statement();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(164);
			match(T__32);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(TSmmParser.IDENTIFIERS, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IDENTIFIERS);
			setState(167);
			match(T__30);
			setState(168);
			simple_type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			parameter();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(171);
				match(T__20);
				setState(172);
				parameter();
				}
				}
				setState(177);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_definitionContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__33);
			setState(179);
			variables();
			setState(180);
			match(T__30);
			setState(181);
			type();
			setState(182);
			match(T__22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(TSmmParser.IDENTIFIERS, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variables);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(IDENTIFIERS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(IDENTIFIERS);
				setState(186);
				match(T__20);
				setState(187);
				variables();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_body);
		try {
			int _alt;
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__31);
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(192);
						statement();
						}
						} 
					}
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(198);
				match(T__32);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_typeContext extends ParserRuleContext {
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				simple_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(T__2);
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(205);
					variable_definition();
					}
					}
					setState(208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__33 );
				setState(210);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(T__2);
				setState(213);
				match(INT_CONSTANT);
				setState(214);
				match(T__3);
				setState(215);
				type();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00db\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001:\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001P\b"+
		"\u0001\n\u0001\f\u0001S\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002Z\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003v\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u007f\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0089\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u008d"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0093"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u009a\b\u0006\n\u0006\f\u0006\u009d\t\u0006\u0001\u0006\u0005\u0006"+
		"\u00a0\b\u0006\n\u0006\f\u0006\u00a3\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00ae\b\b\n\b\f\b\u00b1\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00bd\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00c2\b\u000b\n\u000b\f\u000b\u00c5"+
		"\t\u000b\u0001\u000b\u0003\u000b\u00c8\b\u000b\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0004\r\u00cf\b\r\u000b\r\f\r\u00d0\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d9\b\r\u0001\r\u0000\u0001\u0002"+
		"\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u0000\u0005\u0001\u0000\t\u000b\u0002\u0000\u0007\u0007\f\f\u0001"+
		"\u0000\r\u0012\u0001\u0000\u0013\u0014\u0001\u0000#&\u00f0\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004Y\u0001\u0000"+
		"\u0000\u0000\u0006~\u0001\u0000\u0000\u0000\b\u0088\u0001\u0000\u0000"+
		"\u0000\n\u008c\u0001\u0000\u0000\u0000\f\u008e\u0001\u0000\u0000\u0000"+
		"\u000e\u00a6\u0001\u0000\u0000\u0000\u0010\u00aa\u0001\u0000\u0000\u0000"+
		"\u0012\u00b2\u0001\u0000\u0000\u0000\u0014\u00bc\u0001\u0000\u0000\u0000"+
		"\u0016\u00c7\u0001\u0000\u0000\u0000\u0018\u00c9\u0001\u0000\u0000\u0000"+
		"\u001a\u00d8\u0001\u0000\u0000\u0000\u001c\u001e\u0003\n\u0005\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0000\u0000\u0001"+
		"#\u0001\u0001\u0000\u0000\u0000$%\u0006\u0001\uffff\uffff\u0000%:\u0005"+
		"*\u0000\u0000&:\u0005+\u0000\u0000\':\u0005,\u0000\u0000(:\u0005-\u0000"+
		"\u0000):\u0003\b\u0004\u0000*+\u0005\u0001\u0000\u0000+,\u0003\u0002\u0001"+
		"\u0000,-\u0005\u0002\u0000\u0000-:\u0001\u0000\u0000\u0000./\u0005\u0001"+
		"\u0000\u0000/0\u0003\u0002\u0001\u000001\u0005\u0006\u0000\u000012\u0003"+
		"\u0018\f\u000023\u0005\u0002\u0000\u00003:\u0001\u0000\u0000\u000045\u0005"+
		"\u0007\u0000\u00005:\u0003\u0002\u0001\u000767\u0005\b\u0000\u00007:\u0003"+
		"\u0002\u0001\u00068:\u0001\u0000\u0000\u00009$\u0001\u0000\u0000\u0000"+
		"9&\u0001\u0000\u0000\u00009\'\u0001\u0000\u0000\u00009(\u0001\u0000\u0000"+
		"\u00009)\u0001\u0000\u0000\u00009*\u0001\u0000\u0000\u00009.\u0001\u0000"+
		"\u0000\u000094\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u000098\u0001"+
		"\u0000\u0000\u0000:Q\u0001\u0000\u0000\u0000;<\n\t\u0000\u0000<=\u0005"+
		"\u0005\u0000\u0000=P\u0003\u0002\u0001\n>?\n\u0005\u0000\u0000?@\u0007"+
		"\u0000\u0000\u0000@P\u0003\u0002\u0001\u0006AB\n\u0004\u0000\u0000BC\u0007"+
		"\u0001\u0000\u0000CP\u0003\u0002\u0001\u0005DE\n\u0003\u0000\u0000EF\u0007"+
		"\u0002\u0000\u0000FP\u0003\u0002\u0001\u0004GH\n\u0002\u0000\u0000HI\u0007"+
		"\u0003\u0000\u0000IP\u0003\u0002\u0001\u0003JK\n\n\u0000\u0000KL\u0005"+
		"\u0003\u0000\u0000LM\u0003\u0002\u0001\u0000MN\u0005\u0004\u0000\u0000"+
		"NP\u0001\u0000\u0000\u0000O;\u0001\u0000\u0000\u0000O>\u0001\u0000\u0000"+
		"\u0000OA\u0001\u0000\u0000\u0000OD\u0001\u0000\u0000\u0000OG\u0001\u0000"+
		"\u0000\u0000OJ\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u0003\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000TZ\u0003\u0002\u0001\u0000UV\u0003\u0002"+
		"\u0001\u0000VW\u0005\u0015\u0000\u0000WX\u0003\u0004\u0002\u0000XZ\u0001"+
		"\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000YU\u0001\u0000\u0000\u0000"+
		"Z\u0005\u0001\u0000\u0000\u0000[\\\u0005\u0016\u0000\u0000\\]\u0003\u0004"+
		"\u0002\u0000]^\u0005\u0017\u0000\u0000^\u007f\u0001\u0000\u0000\u0000"+
		"_`\u0003\u0002\u0001\u0000`a\u0005\u0018\u0000\u0000ab\u0003\u0002\u0001"+
		"\u0000bc\u0005\u0017\u0000\u0000c\u007f\u0001\u0000\u0000\u0000de\u0005"+
		"\u0019\u0000\u0000ef\u0003\u0004\u0002\u0000fg\u0005\u0017\u0000\u0000"+
		"g\u007f\u0001\u0000\u0000\u0000hi\u0005\u001a\u0000\u0000ij\u0005\u0001"+
		"\u0000\u0000jk\u0003\u0002\u0001\u0000kl\u0005\u0002\u0000\u0000lm\u0003"+
		"\u0016\u000b\u0000m\u007f\u0001\u0000\u0000\u0000no\u0005\u001b\u0000"+
		"\u0000op\u0005\u0001\u0000\u0000pq\u0003\u0002\u0001\u0000qr\u0005\u0002"+
		"\u0000\u0000ru\u0003\u0016\u000b\u0000st\u0005\u001c\u0000\u0000tv\u0003"+
		"\u0016\u000b\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"v\u007f\u0001\u0000\u0000\u0000wx\u0005\u001d\u0000\u0000xy\u0003\u0002"+
		"\u0001\u0000yz\u0005\u0017\u0000\u0000z\u007f\u0001\u0000\u0000\u0000"+
		"{|\u0003\b\u0004\u0000|}\u0005\u0017\u0000\u0000}\u007f\u0001\u0000\u0000"+
		"\u0000~[\u0001\u0000\u0000\u0000~_\u0001\u0000\u0000\u0000~d\u0001\u0000"+
		"\u0000\u0000~h\u0001\u0000\u0000\u0000~n\u0001\u0000\u0000\u0000~w\u0001"+
		"\u0000\u0000\u0000~{\u0001\u0000\u0000\u0000\u007f\u0007\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005-\u0000\u0000\u0081\u0082\u0005\u0001\u0000\u0000"+
		"\u0082\u0083\u0003\u0004\u0002\u0000\u0083\u0084\u0005\u0002\u0000\u0000"+
		"\u0084\u0089\u0001\u0000\u0000\u0000\u0085\u0086\u0005-\u0000\u0000\u0086"+
		"\u0087\u0005\u0001\u0000\u0000\u0087\u0089\u0005\u0002\u0000\u0000\u0088"+
		"\u0080\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0089"+
		"\t\u0001\u0000\u0000\u0000\u008a\u008d\u0003\f\u0006\u0000\u008b\u008d"+
		"\u0003\u0012\t\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u000b\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"\u001e\u0000\u0000\u008f\u0090\u0005-\u0000\u0000\u0090\u0092\u0005\u0001"+
		"\u0000\u0000\u0091\u0093\u0003\u0010\b\u0000\u0092\u0091\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\u0002\u0000\u0000\u0095\u0096\u0005\u001f\u0000"+
		"\u0000\u0096\u0097\u0003\u0018\f\u0000\u0097\u009b\u0005 \u0000\u0000"+
		"\u0098\u009a\u0003\u0012\t\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u00a1\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\u0006\u0003\u0000\u009f"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005!\u0000\u0000\u00a5\r\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005-\u0000\u0000\u00a7\u00a8\u0005\u001f\u0000\u0000\u00a8\u00a9\u0003"+
		"\u0018\f\u0000\u00a9\u000f\u0001\u0000\u0000\u0000\u00aa\u00af\u0003\u000e"+
		"\u0007\u0000\u00ab\u00ac\u0005\u0015\u0000\u0000\u00ac\u00ae\u0003\u000e"+
		"\u0007\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u0011\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\"\u0000\u0000\u00b3\u00b4\u0003\u0014\n"+
		"\u0000\u00b4\u00b5\u0005\u001f\u0000\u0000\u00b5\u00b6\u0003\u001a\r\u0000"+
		"\u00b6\u00b7\u0005\u0017\u0000\u0000\u00b7\u0013\u0001\u0000\u0000\u0000"+
		"\u00b8\u00bd\u0005-\u0000\u0000\u00b9\u00ba\u0005-\u0000\u0000\u00ba\u00bb"+
		"\u0005\u0015\u0000\u0000\u00bb\u00bd\u0003\u0014\n\u0000\u00bc\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bd\u0015\u0001"+
		"\u0000\u0000\u0000\u00be\u00c8\u0003\u0006\u0003\u0000\u00bf\u00c3\u0005"+
		" \u0000\u0000\u00c0\u00c2\u0003\u0006\u0003\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c8\u0005!\u0000"+
		"\u0000\u00c7\u00be\u0001\u0000\u0000\u0000\u00c7\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c8\u0017\u0001\u0000\u0000\u0000\u00c9\u00ca\u0007\u0004\u0000"+
		"\u0000\u00ca\u0019\u0001\u0000\u0000\u0000\u00cb\u00d9\u0003\u0018\f\u0000"+
		"\u00cc\u00ce\u0005\u0003\u0000\u0000\u00cd\u00cf\u0003\u0012\t\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0004\u0000\u0000\u00d3"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0003\u0000\u0000\u00d5"+
		"\u00d6\u0005*\u0000\u0000\u00d6\u00d7\u0005\u0004\u0000\u0000\u00d7\u00d9"+
		"\u0003\u001a\r\u0000\u00d8\u00cb\u0001\u0000\u0000\u0000\u00d8\u00cc\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d9\u001b\u0001"+
		"\u0000\u0000\u0000\u0012\u001f9OQYu~\u0088\u008c\u0092\u009b\u00a1\u00af"+
		"\u00bc\u00c3\u00c7\u00d0\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}