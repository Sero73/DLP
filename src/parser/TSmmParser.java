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
		T__38=39, WHITES=40, SINGLE_LINE_COMMENT=41, MULTILINE_COMMENT=42, INT_CONSTANT=43, 
		REAL_CONSTANT=44, CHAR_CONSTANT=45, IDENTIFIERS=46;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_expressions = 2, RULE_statement = 3, 
		RULE_body = 4, RULE_function = 5, RULE_function_main = 6, RULE_variables = 7, 
		RULE_definition = 8, RULE_function_definition = 9, RULE_parameter = 10, 
		RULE_parameters = 11, RULE_variable_definition = 12, RULE_simple_type = 13, 
		RULE_simple_type_parameter = 14, RULE_type = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "expressions", "statement", "body", "function", 
			"function_main", "variables", "definition", "function_definition", "parameter", 
			"parameters", "variable_definition", "simple_type", "simple_type_parameter", 
			"type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'as'", "'-'", "'!'", "'*'", 
			"'%'", "'/'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", 
			"'||'", "','", "'input'", "';'", "'='", "'log'", "'while'", "'if'", "'else'", 
			"'return'", "'{'", "'}'", "'function'", "'main'", "':'", "'let'", "'void'", 
			"'int'", "'number'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "WHITES", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
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
		public Function_mainContext function_main() {
			return getRuleContext(Function_mainContext.class,0);
		}
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
			int _alt;
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				function_main();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31 || _la==T__34) {
					{
					{
					setState(33);
					definition();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(39);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(41);
						definition();
						}
						} 
					}
					setState(46);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(47);
				function_main();
				setState(48);
				match(EOF);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(53);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(54);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(55);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(56);
				match(IDENTIFIERS);
				}
				break;
			case 5:
				{
				setState(57);
				function();
				}
				break;
			case 6:
				{
				setState(58);
				match(T__0);
				setState(59);
				expression(0);
				setState(60);
				match(T__1);
				}
				break;
			case 7:
				{
				setState(62);
				match(T__0);
				setState(63);
				expression(0);
				setState(64);
				match(T__5);
				setState(65);
				simple_type();
				setState(66);
				match(T__1);
				}
				break;
			case 8:
				{
				setState(68);
				match(T__6);
				setState(69);
				expression(7);
				}
				break;
			case 9:
				{
				setState(70);
				match(T__7);
				setState(71);
				expression(6);
				}
				break;
			case 10:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(76);
						match(T__4);
						setState(77);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(79);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(81);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(82);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(83);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(86);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(88);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(91);
						match(T__2);
						setState(92);
						expression(0);
						setState(93);
						match(T__3);
						}
						break;
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				expression(0);
				setState(102);
				match(T__20);
				setState(103);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__21);
				setState(108);
				expressions();
				setState(109);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				expression(0);
				setState(112);
				match(T__23);
				setState(113);
				expression(0);
				setState(114);
				match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(T__24);
				setState(117);
				expressions();
				setState(118);
				match(T__22);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(T__25);
				setState(121);
				match(T__0);
				setState(122);
				expression(0);
				setState(123);
				match(T__1);
				setState(124);
				body();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(T__26);
				setState(127);
				match(T__0);
				setState(128);
				expression(0);
				setState(129);
				match(T__1);
				setState(130);
				body();
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(131);
					match(T__27);
					setState(132);
					body();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(T__28);
				setState(136);
				expression(0);
				setState(137);
				match(T__22);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				function();
				setState(140);
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
		enterRule(_localctx, 8, RULE_body);
		try {
			int _alt;
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__29);
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(146);
						statement();
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(152);
				match(T__30);
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
		enterRule(_localctx, 10, RULE_function);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(IDENTIFIERS);
				setState(156);
				match(T__0);
				setState(157);
				expressions();
				setState(158);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(IDENTIFIERS);
				setState(161);
				match(T__0);
				setState(162);
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
	public static class Function_mainContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
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
		public Function_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_main; }
	}

	public final Function_mainContext function_main() throws RecognitionException {
		Function_mainContext _localctx = new Function_mainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_main);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__31);
			setState(166);
			match(T__32);
			setState(167);
			match(T__0);
			setState(168);
			match(T__1);
			setState(169);
			match(T__33);
			setState(170);
			simple_type();
			setState(171);
			match(T__29);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172);
					variable_definition();
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					statement();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(184);
			match(T__30);
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
		enterRule(_localctx, 14, RULE_variables);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(IDENTIFIERS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(IDENTIFIERS);
				setState(188);
				match(T__20);
				setState(189);
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
		enterRule(_localctx, 16, RULE_definition);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				function_definition();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
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
		enterRule(_localctx, 18, RULE_function_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__31);
			setState(197);
			match(IDENTIFIERS);
			setState(198);
			match(T__0);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIERS) {
				{
				setState(199);
				parameters();
				}
			}

			setState(202);
			match(T__1);
			setState(203);
			match(T__33);
			setState(204);
			simple_type();
			setState(205);
			match(T__29);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					variable_definition();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					statement();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(218);
			match(T__30);
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
		enterRule(_localctx, 20, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(IDENTIFIERS);
			setState(221);
			match(T__33);
			setState(222);
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
		enterRule(_localctx, 22, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			parameter();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(225);
				match(T__20);
				setState(226);
				parameter();
				}
				}
				setState(231);
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
		enterRule(_localctx, 24, RULE_variable_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__34);
			setState(233);
			variables();
			setState(234);
			match(T__33);
			setState(235);
			type();
			setState(236);
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
	public static class Simple_typeContext extends ParserRuleContext {
		public Simple_type_parameterContext simple_type_parameter() {
			return getRuleContext(Simple_type_parameterContext.class,0);
		}
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simple_type);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				simple_type_parameter();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(T__35);
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
	public static class Simple_type_parameterContext extends ParserRuleContext {
		public Simple_type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type_parameter; }
	}

	public final Simple_type_parameterContext simple_type_parameter() throws RecognitionException {
		Simple_type_parameterContext _localctx = new Simple_type_parameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simple_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				simple_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(T__2);
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(246);
					variable_definition();
					}
					}
					setState(249); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__34 );
				setState(251);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(T__2);
				setState(254);
				match(INT_CONSTANT);
				setState(255);
				match(T__3);
				setState(256);
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
		"\u0004\u0001.\u0104\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000+\b\u0000\n\u0000\f\u0000"+
		".\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00003\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001J\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001`\b\u0001\n\u0001\f\u0001c\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002j\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0086\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008f"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0094\b\u0004"+
		"\n\u0004\f\u0004\u0097\t\u0004\u0001\u0004\u0003\u0004\u009a\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00a4\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00ae\b\u0006\n\u0006\f\u0006\u00b1\t\u0006\u0001\u0006\u0005\u0006"+
		"\u00b4\b\u0006\n\u0006\f\u0006\u00b7\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00bf\b\u0007\u0001"+
		"\b\u0001\b\u0003\b\u00c3\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c9"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00d0\b\t\n\t\f\t"+
		"\u00d3\t\t\u0001\t\u0005\t\u00d6\b\t\n\t\f\t\u00d9\t\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00e4\b\u000b\n\u000b\f\u000b\u00e7\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u00f1\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00f8\b\u000f"+
		"\u000b\u000f\f\u000f\u00f9\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0102\b\u000f\u0001\u000f\u0000\u0001"+
		"\u0002\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e\u0000\u0005\u0001\u0000\t\u000b\u0002\u0000\u0007"+
		"\u0007\f\f\u0001\u0000\r\u0012\u0001\u0000\u0013\u0014\u0001\u0000%\'"+
		"\u011c\u00002\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004"+
		"i\u0001\u0000\u0000\u0000\u0006\u008e\u0001\u0000\u0000\u0000\b\u0099"+
		"\u0001\u0000\u0000\u0000\n\u00a3\u0001\u0000\u0000\u0000\f\u00a5\u0001"+
		"\u0000\u0000\u0000\u000e\u00be\u0001\u0000\u0000\u0000\u0010\u00c2\u0001"+
		"\u0000\u0000\u0000\u0012\u00c4\u0001\u0000\u0000\u0000\u0014\u00dc\u0001"+
		"\u0000\u0000\u0000\u0016\u00e0\u0001\u0000\u0000\u0000\u0018\u00e8\u0001"+
		"\u0000\u0000\u0000\u001a\u00f0\u0001\u0000\u0000\u0000\u001c\u00f2\u0001"+
		"\u0000\u0000\u0000\u001e\u0101\u0001\u0000\u0000\u0000 $\u0003\f\u0006"+
		"\u0000!#\u0003\u0010\b\u0000\"!\u0001\u0000\u0000\u0000#&\u0001\u0000"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0005\u0000\u0000\u0001"+
		"(3\u0001\u0000\u0000\u0000)+\u0003\u0010\b\u0000*)\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0003\f\u0006"+
		"\u000001\u0005\u0000\u0000\u000113\u0001\u0000\u0000\u00002 \u0001\u0000"+
		"\u0000\u00002,\u0001\u0000\u0000\u00003\u0001\u0001\u0000\u0000\u0000"+
		"45\u0006\u0001\uffff\uffff\u00005J\u0005+\u0000\u00006J\u0005,\u0000\u0000"+
		"7J\u0005-\u0000\u00008J\u0005.\u0000\u00009J\u0003\n\u0005\u0000:;\u0005"+
		"\u0001\u0000\u0000;<\u0003\u0002\u0001\u0000<=\u0005\u0002\u0000\u0000"+
		"=J\u0001\u0000\u0000\u0000>?\u0005\u0001\u0000\u0000?@\u0003\u0002\u0001"+
		"\u0000@A\u0005\u0006\u0000\u0000AB\u0003\u001a\r\u0000BC\u0005\u0002\u0000"+
		"\u0000CJ\u0001\u0000\u0000\u0000DE\u0005\u0007\u0000\u0000EJ\u0003\u0002"+
		"\u0001\u0007FG\u0005\b\u0000\u0000GJ\u0003\u0002\u0001\u0006HJ\u0001\u0000"+
		"\u0000\u0000I4\u0001\u0000\u0000\u0000I6\u0001\u0000\u0000\u0000I7\u0001"+
		"\u0000\u0000\u0000I8\u0001\u0000\u0000\u0000I9\u0001\u0000\u0000\u0000"+
		"I:\u0001\u0000\u0000\u0000I>\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000"+
		"\u0000IF\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000Ja\u0001\u0000"+
		"\u0000\u0000KL\n\t\u0000\u0000LM\u0005\u0005\u0000\u0000M`\u0003\u0002"+
		"\u0001\nNO\n\u0005\u0000\u0000OP\u0007\u0000\u0000\u0000P`\u0003\u0002"+
		"\u0001\u0006QR\n\u0004\u0000\u0000RS\u0007\u0001\u0000\u0000S`\u0003\u0002"+
		"\u0001\u0005TU\n\u0003\u0000\u0000UV\u0007\u0002\u0000\u0000V`\u0003\u0002"+
		"\u0001\u0004WX\n\u0002\u0000\u0000XY\u0007\u0003\u0000\u0000Y`\u0003\u0002"+
		"\u0001\u0003Z[\n\n\u0000\u0000[\\\u0005\u0003\u0000\u0000\\]\u0003\u0002"+
		"\u0001\u0000]^\u0005\u0004\u0000\u0000^`\u0001\u0000\u0000\u0000_K\u0001"+
		"\u0000\u0000\u0000_N\u0001\u0000\u0000\u0000_Q\u0001\u0000\u0000\u0000"+
		"_T\u0001\u0000\u0000\u0000_W\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000"+
		"\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b\u0003\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"dj\u0003\u0002\u0001\u0000ef\u0003\u0002\u0001\u0000fg\u0005\u0015\u0000"+
		"\u0000gh\u0003\u0004\u0002\u0000hj\u0001\u0000\u0000\u0000id\u0001\u0000"+
		"\u0000\u0000ie\u0001\u0000\u0000\u0000j\u0005\u0001\u0000\u0000\u0000"+
		"kl\u0005\u0016\u0000\u0000lm\u0003\u0004\u0002\u0000mn\u0005\u0017\u0000"+
		"\u0000n\u008f\u0001\u0000\u0000\u0000op\u0003\u0002\u0001\u0000pq\u0005"+
		"\u0018\u0000\u0000qr\u0003\u0002\u0001\u0000rs\u0005\u0017\u0000\u0000"+
		"s\u008f\u0001\u0000\u0000\u0000tu\u0005\u0019\u0000\u0000uv\u0003\u0004"+
		"\u0002\u0000vw\u0005\u0017\u0000\u0000w\u008f\u0001\u0000\u0000\u0000"+
		"xy\u0005\u001a\u0000\u0000yz\u0005\u0001\u0000\u0000z{\u0003\u0002\u0001"+
		"\u0000{|\u0005\u0002\u0000\u0000|}\u0003\b\u0004\u0000}\u008f\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u001b\u0000\u0000\u007f\u0080\u0005\u0001\u0000"+
		"\u0000\u0080\u0081\u0003\u0002\u0001\u0000\u0081\u0082\u0005\u0002\u0000"+
		"\u0000\u0082\u0085\u0003\b\u0004\u0000\u0083\u0084\u0005\u001c\u0000\u0000"+
		"\u0084\u0086\u0003\b\u0004\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u008f\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005\u001d\u0000\u0000\u0088\u0089\u0003\u0002\u0001\u0000\u0089"+
		"\u008a\u0005\u0017\u0000\u0000\u008a\u008f\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0003\n\u0005\u0000\u008c\u008d\u0005\u0017\u0000\u0000\u008d\u008f"+
		"\u0001\u0000\u0000\u0000\u008ek\u0001\u0000\u0000\u0000\u008eo\u0001\u0000"+
		"\u0000\u0000\u008et\u0001\u0000\u0000\u0000\u008ex\u0001\u0000\u0000\u0000"+
		"\u008e~\u0001\u0000\u0000\u0000\u008e\u0087\u0001\u0000\u0000\u0000\u008e"+
		"\u008b\u0001\u0000\u0000\u0000\u008f\u0007\u0001\u0000\u0000\u0000\u0090"+
		"\u009a\u0003\u0006\u0003\u0000\u0091\u0095\u0005\u001e\u0000\u0000\u0092"+
		"\u0094\u0003\u0006\u0003\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0098\u009a\u0005\u001f\u0000\u0000\u0099"+
		"\u0090\u0001\u0000\u0000\u0000\u0099\u0091\u0001\u0000\u0000\u0000\u009a"+
		"\t\u0001\u0000\u0000\u0000\u009b\u009c\u0005.\u0000\u0000\u009c\u009d"+
		"\u0005\u0001\u0000\u0000\u009d\u009e\u0003\u0004\u0002\u0000\u009e\u009f"+
		"\u0005\u0002\u0000\u0000\u009f\u00a4\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005.\u0000\u0000\u00a1\u00a2\u0005\u0001\u0000\u0000\u00a2\u00a4\u0005"+
		"\u0002\u0000\u0000\u00a3\u009b\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a4\u000b\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		" \u0000\u0000\u00a6\u00a7\u0005!\u0000\u0000\u00a7\u00a8\u0005\u0001\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0002\u0000\u0000\u00a9\u00aa\u0005\"\u0000\u0000"+
		"\u00aa\u00ab\u0003\u001a\r\u0000\u00ab\u00af\u0005\u001e\u0000\u0000\u00ac"+
		"\u00ae\u0003\u0018\f\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1"+
		"\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b5\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b4\u0003\u0006\u0003\u0000\u00b3\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\u001f\u0000\u0000\u00b9\r\u0001\u0000\u0000\u0000\u00ba\u00bf\u0005"+
		".\u0000\u0000\u00bb\u00bc\u0005.\u0000\u0000\u00bc\u00bd\u0005\u0015\u0000"+
		"\u0000\u00bd\u00bf\u0003\u000e\u0007\u0000\u00be\u00ba\u0001\u0000\u0000"+
		"\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\u000f\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c3\u0003\u0012\t\u0000\u00c1\u00c3\u0003\u0018\f\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u0011\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005 \u0000\u0000\u00c5"+
		"\u00c6\u0005.\u0000\u0000\u00c6\u00c8\u0005\u0001\u0000\u0000\u00c7\u00c9"+
		"\u0003\u0016\u000b\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\u0002\u0000\u0000\u00cb\u00cc\u0005\"\u0000\u0000\u00cc\u00cd\u0003"+
		"\u001a\r\u0000\u00cd\u00d1\u0005\u001e\u0000\u0000\u00ce\u00d0\u0003\u0018"+
		"\f\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d7\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d6\u0003\u0006\u0003\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u001f\u0000"+
		"\u0000\u00db\u0013\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005.\u0000\u0000"+
		"\u00dd\u00de\u0005\"\u0000\u0000\u00de\u00df\u0003\u001a\r\u0000\u00df"+
		"\u0015\u0001\u0000\u0000\u0000\u00e0\u00e5\u0003\u0014\n\u0000\u00e1\u00e2"+
		"\u0005\u0015\u0000\u0000\u00e2\u00e4\u0003\u0014\n\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u0017\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"#\u0000\u0000\u00e9\u00ea\u0003\u000e\u0007\u0000\u00ea\u00eb\u0005\""+
		"\u0000\u0000\u00eb\u00ec\u0003\u001e\u000f\u0000\u00ec\u00ed\u0005\u0017"+
		"\u0000\u0000\u00ed\u0019\u0001\u0000\u0000\u0000\u00ee\u00f1\u0003\u001c"+
		"\u000e\u0000\u00ef\u00f1\u0005$\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u001b\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0007\u0004\u0000\u0000\u00f3\u001d\u0001\u0000\u0000"+
		"\u0000\u00f4\u0102\u0003\u001a\r\u0000\u00f5\u00f7\u0005\u0003\u0000\u0000"+
		"\u00f6\u00f8\u0003\u0018\f\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005\u0004\u0000\u0000\u00fc\u0102\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005\u0003\u0000\u0000\u00fe\u00ff\u0005+\u0000\u0000\u00ff\u0100"+
		"\u0005\u0004\u0000\u0000\u0100\u0102\u0003\u001e\u000f\u0000\u0101\u00f4"+
		"\u0001\u0000\u0000\u0000\u0101\u00f5\u0001\u0000\u0000\u0000\u0101\u00fd"+
		"\u0001\u0000\u0000\u0000\u0102\u001f\u0001\u0000\u0000\u0000\u0017$,2"+
		"I_ai\u0085\u008e\u0095\u0099\u00a3\u00af\u00b5\u00be\u00c2\u00c8\u00d1"+
		"\u00d7\u00e5\u00f0\u00f9\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}