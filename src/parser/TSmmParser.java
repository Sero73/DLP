// Generated from C:/Users/Serop/Desktop/Clase2025-26/DLP/DLP/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;

import ast.*;
import ast.types.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import ast.definitions.*;

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
		REAL_CONSTANT=44, CHAR_CONSTANT=45, ID=46;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_expressions = 2, RULE_statement = 3, 
		RULE_body = 4, RULE_function = 5, RULE_function_main = 6, RULE_definition = 7, 
		RULE_function_definition = 8, RULE_parameters = 9, RULE_variable = 10, 
		RULE_variables = 11, RULE_variable_definition = 12, RULE_simple_type = 13, 
		RULE_type = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "expressions", "statement", "body", "function", 
			"function_main", "definition", "function_definition", "parameters", "variable", 
			"variables", "variable_definition", "simple_type", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'as'", "'-'", "'!'", "'*'", 
			"'%'", "'/'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", 
			"'||'", "','", "'input'", "';'", "'='", "'log'", "'while'", "'if'", "'else'", 
			"'return'", "'{'", "'}'", "'function'", "'main'", "':'", "'void'", "'let'", 
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
			"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID"
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
		public Program ast;
		public List<Definition> definitions = new ArrayList<>();
		public DefinitionContext definition;
		public Function_mainContext function_main;
		public Function_mainContext function_main() {
			return getRuleContext(Function_mainContext.class,0);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					((ProgramContext)_localctx).definition = definition();
					_localctx.definitions.addAll(((ProgramContext)_localctx).definition.ast);
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(38);
			((ProgramContext)_localctx).function_main = function_main();
			_localctx.definitions.add(((ProgramContext)_localctx).function_main.ast);
			((ProgramContext)_localctx).ast =  new Program(_localctx.definitions);
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
		public Expression ast;
		public ExpressionContext e1;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public FunctionContext function;
		public Simple_typeContext t;
		public Token OP;
		public ExpressionContext e2;
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(TSmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(TSmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(43);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 2:
				{
				setState(45);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new NumberLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(47);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(49);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1 ,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 5:
				{
				setState(51);
				((ExpressionContext)_localctx).function = function();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).function.ast;
				}
				break;
			case 6:
				{
				setState(54);
				match(T__0);
				setState(55);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(56);
				match(T__1);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast;
				}
				break;
			case 7:
				{
				setState(59);
				match(T__0);
				setState(60);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(61);
				match(T__5);
				setState(62);
				((ExpressionContext)_localctx).t = simple_type();
				setState(63);
				match(T__1);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).t.ast);
				}
				break;
			case 8:
				{
				setState(66);
				match(T__6);
				setState(67);
				((ExpressionContext)_localctx).e1 = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 9:
				{
				setState(70);
				match(T__7);
				setState(71);
				((ExpressionContext)_localctx).e1 = expression(5);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(76);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(77);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(78);
						((ExpressionContext)_localctx).e2 = expression(5);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(81);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(82);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__11) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(83);
						((ExpressionContext)_localctx).e2 = expression(4);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(87);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						((ExpressionContext)_localctx).e2 = expression(3);
						((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(92);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						((ExpressionContext)_localctx).e2 = expression(2);
						((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(97);
						match(T__2);
						setState(98);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(99);
						match(T__3);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(103);
						match(T__4);
						setState(104);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(110);
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
		public List<Expression> ast = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionsContext e2;
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				((ExpressionsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ExpressionsContext)_localctx).e1.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				((ExpressionsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ExpressionsContext)_localctx).e1.ast);
				setState(116);
				match(T__20);
				setState(117);
				((ExpressionsContext)_localctx).e2 = expressions();
				_localctx.ast.addAll(((ExpressionsContext)_localctx).e2.ast);
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
		public List<Statement> ast = new ArrayList<>();
		public List<Statement> elseBody = new ArrayList<>();
		public Token e;
		public ExpressionsContext expressions;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public BodyContext b1;
		public FunctionContext function;
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
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				((StatementContext)_localctx).e = match(T__21);
				setState(123);
				((StatementContext)_localctx).expressions = expressions();
				setState(124);
				match(T__22);
				for(Expression expression : ((StatementContext)_localctx).expressions.ast){
				                                    _localctx.ast.add(new Input(((StatementContext)_localctx).e.getLine(), ((StatementContext)_localctx).e.getCharPositionInLine()+1, expression));
				                                   }
				                                 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				((StatementContext)_localctx).e1 = expression(0);
				setState(128);
				match(T__23);
				setState(129);
				((StatementContext)_localctx).e2 = expression(0);
				setState(130);
				match(T__22);
				_localctx.ast.add(new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				((StatementContext)_localctx).e = match(T__24);
				setState(134);
				((StatementContext)_localctx).expressions = expressions();
				setState(135);
				match(T__22);
				for(Expression expression : ((StatementContext)_localctx).expressions.ast){
				                                    _localctx.ast.add(new Log(((StatementContext)_localctx).e.getLine(), ((StatementContext)_localctx).e.getCharPositionInLine()+1, expression));
				                                    }
				                                
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(T__25);
				setState(139);
				match(T__0);
				setState(140);
				((StatementContext)_localctx).e1 = expression(0);
				setState(141);
				match(T__1);
				setState(142);
				((StatementContext)_localctx).b1 = body();
				_localctx.ast.add(new While(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e1.ast.getColumn(),((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				match(T__26);
				setState(146);
				match(T__0);
				setState(147);
				((StatementContext)_localctx).e1 = expression(0);
				setState(148);
				match(T__1);
				setState(149);
				((StatementContext)_localctx).b1 = body();
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(150);
					match(T__27);
					setState(151);
					((StatementContext)_localctx).b1 = body();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(T__28);
				setState(155);
				((StatementContext)_localctx).e1 = expression(0);
				setState(156);
				match(T__22);
				_localctx.ast.add(new Return(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),((StatementContext)_localctx).e1.ast));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				((StatementContext)_localctx).function = function();
				setState(160);
				match(T__22);
				_localctx.ast.add(((StatementContext)_localctx).function.ast);
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
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext st1;
		public StatementContext st2;
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
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__6:
			case T__7:
			case T__21:
			case T__24:
			case T__25:
			case T__26:
			case T__28:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((BodyContext)_localctx).st1 = statement();
				_localctx.ast.addAll(((BodyContext)_localctx).st1.ast);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__29);
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169);
					((BodyContext)_localctx).st2 = statement();
					_localctx.ast.addAll(((BodyContext)_localctx).st2.ast);
					}
					}
					setState(174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131942171279746L) != 0) );
				setState(176);
				match(T__30);
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
	public static class FunctionContext extends ParserRuleContext {
		public FunctionInvocation ast;
		public List<Expression> arguments = new ArrayList<Expression>();
		public VariableContext variable;
		public ExpressionsContext expressions;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((FunctionContext)_localctx).variable = variable();
			setState(181);
			match(T__0);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333506L) != 0)) {
				{
				setState(182);
				((FunctionContext)_localctx).expressions = expressions();
				_localctx.arguments.addAll(((FunctionContext)_localctx).expressions.ast);
				}
			}

			setState(187);
			match(T__1);
			((FunctionContext)_localctx).ast =  new FunctionInvocation(((FunctionContext)_localctx).variable.ast.getLine(), ((FunctionContext)_localctx).variable.ast.getColumn(), _localctx.arguments, ((FunctionContext)_localctx).variable.ast);
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
		public FunctionDefinition ast;
		public List<Statement> statements = new ArrayList<Statement>();
		public List<VariableDefinition> varDefs = new ArrayList<VariableDefinition>();
		public Token f;
		public Variable_definitionContext variable_definition;
		public StatementContext statement;
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			((Function_mainContext)_localctx).f = match(T__31);
			setState(191);
			match(T__32);
			setState(192);
			match(T__0);
			setState(193);
			match(T__1);
			setState(194);
			match(T__33);
			setState(195);
			match(T__34);
			setState(196);
			match(T__29);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(197);
				((Function_mainContext)_localctx).variable_definition = variable_definition();
				_localctx.statements.addAll(((Function_mainContext)_localctx).variable_definition.ast);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131942171279746L) != 0)) {
				{
				{
				setState(205);
				((Function_mainContext)_localctx).statement = statement();
				_localctx.statements.addAll(((Function_mainContext)_localctx).statement.ast);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(T__30);
			((Function_mainContext)_localctx).ast =  new FunctionDefinition(((Function_mainContext)_localctx).f.getLine(), ((Function_mainContext)_localctx).f.getCharPositionInLine()+1, _localctx.statements, "main", new FunctionType(new VoidType(), new ArrayList<VariableDefinition>())); 
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
		public List<Definition> ast = new ArrayList<>();
		public Function_definitionContext function_definition;
		public Variable_definitionContext variable_definition;
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
		enterRule(_localctx, 14, RULE_definition);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				((DefinitionContext)_localctx).function_definition = function_definition();
				_localctx.ast.add(((DefinitionContext)_localctx).function_definition.ast);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((DefinitionContext)_localctx).variable_definition = variable_definition();
				_localctx.ast.addAll(((DefinitionContext)_localctx).variable_definition.ast);
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
		public FunctionDefinition ast;
		public List<Statement> statements = new ArrayList<>();
		public List<VariableDefinition> params = new ArrayList<>();
		public Type returnType = new VoidType();
		public Token id1;
		public ParametersContext parameters;
		public Simple_typeContext t;
		public Variable_definitionContext variable_definition;
		public StatementContext statement;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
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
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__31);
			setState(225);
			((Function_definitionContext)_localctx).id1 = match(ID);
			setState(226);
			match(T__0);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(227);
				((Function_definitionContext)_localctx).parameters = parameters();
				_localctx.params.addAll(((Function_definitionContext)_localctx).parameters.ast);
				}
			}

			setState(232);
			match(T__1);
			setState(233);
			match(T__33);
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__37:
			case T__38:
				{
				setState(234);
				((Function_definitionContext)_localctx).t = simple_type();
				((Function_definitionContext)_localctx).returnType =  ((Function_definitionContext)_localctx).t.ast;
				}
				break;
			case T__34:
				{
				setState(237);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(240);
			match(T__29);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(241);
				((Function_definitionContext)_localctx).variable_definition = variable_definition();
				_localctx.statements.addAll(((Function_definitionContext)_localctx).variable_definition.ast);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131942171279746L) != 0)) {
				{
				{
				setState(249);
				((Function_definitionContext)_localctx).statement = statement();
				_localctx.statements.addAll(((Function_definitionContext)_localctx).statement.ast);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(T__30);
			((Function_definitionContext)_localctx).ast =   new FunctionDefinition(((Function_definitionContext)_localctx).id1.getLine(), ((Function_definitionContext)_localctx).id1.getCharPositionInLine()+1 ,_localctx.statements, (((Function_definitionContext)_localctx).id1!=null?((Function_definitionContext)_localctx).id1.getText():null), new FunctionType(_localctx.returnType, _localctx.params));
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
		public List<VariableDefinition> ast = new ArrayList<>();
		public Token id1;
		public Simple_typeContext type1;
		public Token id2;
		public Simple_typeContext type2;
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public List<Simple_typeContext> simple_type() {
			return getRuleContexts(Simple_typeContext.class);
		}
		public Simple_typeContext simple_type(int i) {
			return getRuleContext(Simple_typeContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			((ParametersContext)_localctx).id1 = match(ID);
			setState(261);
			match(T__33);
			setState(262);
			((ParametersContext)_localctx).type1 = simple_type();
			_localctx.ast.add(new VariableDefinition(((ParametersContext)_localctx).id1.getLine(), ((ParametersContext)_localctx).id1.getCharPositionInLine()+1, (((ParametersContext)_localctx).id1!=null?((ParametersContext)_localctx).id1.getText():null), ((ParametersContext)_localctx).type1.ast));
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(264);
				match(T__20);
				setState(265);
				((ParametersContext)_localctx).id2 = match(ID);
				setState(266);
				match(T__33);
				setState(267);
				((ParametersContext)_localctx).type2 = simple_type();
				_localctx.ast.add(new VariableDefinition(((ParametersContext)_localctx).id2.getLine(),((ParametersContext)_localctx).id2.getCharPositionInLine()+1, (((ParametersContext)_localctx).id2!=null?((ParametersContext)_localctx).id2.getText():null), ((ParametersContext)_localctx).type2.ast));
				}
				}
				setState(274);
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
	public static class VariableContext extends ParserRuleContext {
		public Variable ast;
		public Token ID;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			((VariableContext)_localctx).ID = match(ID);
			((VariableContext)_localctx).ast =  (new Variable(((VariableContext)_localctx).ID.getLine(), ((VariableContext)_localctx).ID.getCharPositionInLine()+1 ,(((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getText():null)));
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
		public List<Variable> ast = new ArrayList<>();
		public Token ID;
		public VariablesContext variables;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
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
		enterRule(_localctx, 22, RULE_variables);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				((VariablesContext)_localctx).ID = match(ID);
				_localctx.ast.add(new Variable(((VariablesContext)_localctx).ID.getLine(), ((VariablesContext)_localctx).ID.getCharPositionInLine()+1 ,(((VariablesContext)_localctx).ID!=null?((VariablesContext)_localctx).ID.getText():null)));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(ID);
				setState(281);
				match(T__20);
				setState(282);
				((VariablesContext)_localctx).variables = variables();
				_localctx.ast.addAll(((VariablesContext)_localctx).variables.ast);
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
	public static class Variable_definitionContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<>();
		public List<Token> vars = new ArrayList<>();
		public Token id1;
		public Token id2;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__35);
			setState(288);
			((Variable_definitionContext)_localctx).id1 = match(ID);
			_localctx.vars.add(((Variable_definitionContext)_localctx).id1);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(290);
				match(T__20);
				setState(291);
				((Variable_definitionContext)_localctx).id2 = match(ID);
				_localctx.vars.add(((Variable_definitionContext)_localctx).id2);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(T__33);
			setState(299);
			((Variable_definitionContext)_localctx).type = type();
			setState(300);
			match(T__22);

			                for(Token var : _localctx.vars){
			                    VariableDefinition varDef = new VariableDefinition(var.getLine(), var.getCharPositionInLine()+1, var.getText(), ((Variable_definitionContext)_localctx).type.ast);
			                    _localctx.ast.add(varDef);
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
	public static class Simple_typeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simple_type);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(T__36);
				((Simple_typeContext)_localctx).ast =  new IntType();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(T__37);
				((Simple_typeContext)_localctx).ast =  new NumberType();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(T__38);
				((Simple_typeContext)_localctx).ast =  new CharType();
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
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public List<RecordField> recordFields = new ArrayList<>();
		public Simple_typeContext simple_type;
		public Variable_definitionContext variable_definition;
		public Token INT_CONSTANT;
		public TypeContext type;
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
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				((TypeContext)_localctx).simple_type = simple_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simple_type.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(T__2);
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(315);
					((TypeContext)_localctx).variable_definition = variable_definition();
					_localctx.recordFields.addAll(((TypeContext)_localctx).variable_definition.ast.stream().map(vDef -> new RecordField(vDef.getLine(), vDef.getColumn(), vDef.getName(), vDef.getType())).toList());
					}
					}
					setState(320); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__35 );
				setState(322);
				match(T__3);
				((TypeContext)_localctx).ast =  new RecordType(_localctx.recordFields);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(T__2);
				setState(326);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(327);
				match(T__3);
				setState(328);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)), ((TypeContext)_localctx).type.ast);
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
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u014e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"K\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001k\b\u0001\n\u0001\f\u0001n\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002y\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0099\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a4\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004\u00ad\b\u0004\u000b\u0004\f\u0004\u00ae\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00b3\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00ba\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c9"+
		"\b\u0006\n\u0006\f\u0006\u00cc\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00d1\b\u0006\n\u0006\f\u0006\u00d4\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00df\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00e7\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00ef\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00f5"+
		"\b\b\n\b\f\b\u00f8\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u00fd\b\b\n\b\f"+
		"\b\u0100\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u010f\b\t\n\t\f\t\u0112"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u011e\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0126\b\f\n\f\f\f\u0129"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0136\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u013f\b\u000e"+
		"\u000b\u000e\f\u000e\u0140\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u014c\b\u000e\u0001\u000e\u0000\u0001\u0002\u000f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0004\u0001"+
		"\u0000\t\u000b\u0002\u0000\u0007\u0007\f\f\u0001\u0000\r\u0012\u0001\u0000"+
		"\u0013\u0014\u0167\u0000#\u0001\u0000\u0000\u0000\u0002J\u0001\u0000\u0000"+
		"\u0000\u0004x\u0001\u0000\u0000\u0000\u0006\u00a3\u0001\u0000\u0000\u0000"+
		"\b\u00b2\u0001\u0000\u0000\u0000\n\u00b4\u0001\u0000\u0000\u0000\f\u00be"+
		"\u0001\u0000\u0000\u0000\u000e\u00de\u0001\u0000\u0000\u0000\u0010\u00e0"+
		"\u0001\u0000\u0000\u0000\u0012\u0104\u0001\u0000\u0000\u0000\u0014\u0113"+
		"\u0001\u0000\u0000\u0000\u0016\u011d\u0001\u0000\u0000\u0000\u0018\u011f"+
		"\u0001\u0000\u0000\u0000\u001a\u0135\u0001\u0000\u0000\u0000\u001c\u014b"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u000e\u0007\u0000\u001f \u0006"+
		"\u0000\uffff\uffff\u0000 \"\u0001\u0000\u0000\u0000!\u001e\u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"&\'\u0003\f\u0006\u0000\'(\u0006\u0000\uffff\uffff\u0000()\u0006\u0000"+
		"\uffff\uffff\u0000)\u0001\u0001\u0000\u0000\u0000*+\u0006\u0001\uffff"+
		"\uffff\u0000+,\u0005+\u0000\u0000,K\u0006\u0001\uffff\uffff\u0000-.\u0005"+
		",\u0000\u0000.K\u0006\u0001\uffff\uffff\u0000/0\u0005-\u0000\u00000K\u0006"+
		"\u0001\uffff\uffff\u000012\u0005.\u0000\u00002K\u0006\u0001\uffff\uffff"+
		"\u000034\u0003\n\u0005\u000045\u0006\u0001\uffff\uffff\u00005K\u0001\u0000"+
		"\u0000\u000067\u0005\u0001\u0000\u000078\u0003\u0002\u0001\u000089\u0005"+
		"\u0002\u0000\u00009:\u0006\u0001\uffff\uffff\u0000:K\u0001\u0000\u0000"+
		"\u0000;<\u0005\u0001\u0000\u0000<=\u0003\u0002\u0001\u0000=>\u0005\u0006"+
		"\u0000\u0000>?\u0003\u001a\r\u0000?@\u0005\u0002\u0000\u0000@A\u0006\u0001"+
		"\uffff\uffff\u0000AK\u0001\u0000\u0000\u0000BC\u0005\u0007\u0000\u0000"+
		"CD\u0003\u0002\u0001\u0006DE\u0006\u0001\uffff\uffff\u0000EK\u0001\u0000"+
		"\u0000\u0000FG\u0005\b\u0000\u0000GH\u0003\u0002\u0001\u0005HI\u0006\u0001"+
		"\uffff\uffff\u0000IK\u0001\u0000\u0000\u0000J*\u0001\u0000\u0000\u0000"+
		"J-\u0001\u0000\u0000\u0000J/\u0001\u0000\u0000\u0000J1\u0001\u0000\u0000"+
		"\u0000J3\u0001\u0000\u0000\u0000J6\u0001\u0000\u0000\u0000J;\u0001\u0000"+
		"\u0000\u0000JB\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000Kl\u0001"+
		"\u0000\u0000\u0000LM\n\u0004\u0000\u0000MN\u0007\u0000\u0000\u0000NO\u0003"+
		"\u0002\u0001\u0005OP\u0006\u0001\uffff\uffff\u0000Pk\u0001\u0000\u0000"+
		"\u0000QR\n\u0003\u0000\u0000RS\u0007\u0001\u0000\u0000ST\u0003\u0002\u0001"+
		"\u0004TU\u0006\u0001\uffff\uffff\u0000Uk\u0001\u0000\u0000\u0000VW\n\u0002"+
		"\u0000\u0000WX\u0007\u0002\u0000\u0000XY\u0003\u0002\u0001\u0003YZ\u0006"+
		"\u0001\uffff\uffff\u0000Zk\u0001\u0000\u0000\u0000[\\\n\u0001\u0000\u0000"+
		"\\]\u0007\u0003\u0000\u0000]^\u0003\u0002\u0001\u0002^_\u0006\u0001\uffff"+
		"\uffff\u0000_k\u0001\u0000\u0000\u0000`a\n\t\u0000\u0000ab\u0005\u0003"+
		"\u0000\u0000bc\u0003\u0002\u0001\u0000cd\u0005\u0004\u0000\u0000de\u0006"+
		"\u0001\uffff\uffff\u0000ek\u0001\u0000\u0000\u0000fg\n\b\u0000\u0000g"+
		"h\u0005\u0005\u0000\u0000hi\u0005.\u0000\u0000ik\u0006\u0001\uffff\uffff"+
		"\u0000jL\u0001\u0000\u0000\u0000jQ\u0001\u0000\u0000\u0000jV\u0001\u0000"+
		"\u0000\u0000j[\u0001\u0000\u0000\u0000j`\u0001\u0000\u0000\u0000jf\u0001"+
		"\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000m\u0003\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000op\u0003\u0002\u0001\u0000pq\u0006\u0002\uffff\uffff\u0000"+
		"qy\u0001\u0000\u0000\u0000rs\u0003\u0002\u0001\u0000st\u0006\u0002\uffff"+
		"\uffff\u0000tu\u0005\u0015\u0000\u0000uv\u0003\u0004\u0002\u0000vw\u0006"+
		"\u0002\uffff\uffff\u0000wy\u0001\u0000\u0000\u0000xo\u0001\u0000\u0000"+
		"\u0000xr\u0001\u0000\u0000\u0000y\u0005\u0001\u0000\u0000\u0000z{\u0005"+
		"\u0016\u0000\u0000{|\u0003\u0004\u0002\u0000|}\u0005\u0017\u0000\u0000"+
		"}~\u0006\u0003\uffff\uffff\u0000~\u00a4\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0003\u0002\u0001\u0000\u0080\u0081\u0005\u0018\u0000\u0000\u0081"+
		"\u0082\u0003\u0002\u0001\u0000\u0082\u0083\u0005\u0017\u0000\u0000\u0083"+
		"\u0084\u0006\u0003\uffff\uffff\u0000\u0084\u00a4\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\u0019\u0000\u0000\u0086\u0087\u0003\u0004\u0002\u0000"+
		"\u0087\u0088\u0005\u0017\u0000\u0000\u0088\u0089\u0006\u0003\uffff\uffff"+
		"\u0000\u0089\u00a4\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u001a\u0000"+
		"\u0000\u008b\u008c\u0005\u0001\u0000\u0000\u008c\u008d\u0003\u0002\u0001"+
		"\u0000\u008d\u008e\u0005\u0002\u0000\u0000\u008e\u008f\u0003\b\u0004\u0000"+
		"\u008f\u0090\u0006\u0003\uffff\uffff\u0000\u0090\u00a4\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u001b\u0000\u0000\u0092\u0093\u0005\u0001\u0000"+
		"\u0000\u0093\u0094\u0003\u0002\u0001\u0000\u0094\u0095\u0005\u0002\u0000"+
		"\u0000\u0095\u0098\u0003\b\u0004\u0000\u0096\u0097\u0005\u001c\u0000\u0000"+
		"\u0097\u0099\u0003\b\u0004\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u00a4\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005\u001d\u0000\u0000\u009b\u009c\u0003\u0002\u0001\u0000\u009c"+
		"\u009d\u0005\u0017\u0000\u0000\u009d\u009e\u0006\u0003\uffff\uffff\u0000"+
		"\u009e\u00a4\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\n\u0005\u0000\u00a0"+
		"\u00a1\u0005\u0017\u0000\u0000\u00a1\u00a2\u0006\u0003\uffff\uffff\u0000"+
		"\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3z\u0001\u0000\u0000\u0000\u00a3"+
		"\u007f\u0001\u0000\u0000\u0000\u00a3\u0085\u0001\u0000\u0000\u0000\u00a3"+
		"\u008a\u0001\u0000\u0000\u0000\u00a3\u0091\u0001\u0000\u0000\u0000\u00a3"+
		"\u009a\u0001\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a4"+
		"\u0007\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003\u0006\u0003\u0000\u00a6"+
		"\u00a7\u0006\u0004\uffff\uffff\u0000\u00a7\u00b3\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ac\u0005\u001e\u0000\u0000\u00a9\u00aa\u0003\u0006\u0003\u0000"+
		"\u00aa\u00ab\u0006\u0004\uffff\uffff\u0000\u00ab\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u001f\u0000"+
		"\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00a5\u0001\u0000\u0000"+
		"\u0000\u00b2\u00a8\u0001\u0000\u0000\u0000\u00b3\t\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0003\u0014\n\u0000\u00b5\u00b9\u0005\u0001\u0000\u0000\u00b6"+
		"\u00b7\u0003\u0004\u0002\u0000\u00b7\u00b8\u0006\u0005\uffff\uffff\u0000"+
		"\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0002\u0000\u0000\u00bc\u00bd\u0006\u0005\uffff\uffff"+
		"\u0000\u00bd\u000b\u0001\u0000\u0000\u0000\u00be\u00bf\u0005 \u0000\u0000"+
		"\u00bf\u00c0\u0005!\u0000\u0000\u00c0\u00c1\u0005\u0001\u0000\u0000\u00c1"+
		"\u00c2\u0005\u0002\u0000\u0000\u00c2\u00c3\u0005\"\u0000\u0000\u00c3\u00c4"+
		"\u0005#\u0000\u0000\u00c4\u00ca\u0005\u001e\u0000\u0000\u00c5\u00c6\u0003"+
		"\u0018\f\u0000\u00c6\u00c7\u0006\u0006\uffff\uffff\u0000\u00c7\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00d2\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0003\u0006\u0003\u0000\u00ce\u00cf\u0006"+
		"\u0006\uffff\uffff\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005\u001f\u0000\u0000\u00d6\u00d7\u0006\u0006\uffff\uffff\u0000\u00d7"+
		"\r\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003\u0010\b\u0000\u00d9\u00da"+
		"\u0006\u0007\uffff\uffff\u0000\u00da\u00df\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0003\u0018\f\u0000\u00dc\u00dd\u0006\u0007\uffff\uffff\u0000\u00dd"+
		"\u00df\u0001\u0000\u0000\u0000\u00de\u00d8\u0001\u0000\u0000\u0000\u00de"+
		"\u00db\u0001\u0000\u0000\u0000\u00df\u000f\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0005 \u0000\u0000\u00e1\u00e2\u0005.\u0000\u0000\u00e2\u00e6\u0005"+
		"\u0001\u0000\u0000\u00e3\u00e4\u0003\u0012\t\u0000\u00e4\u00e5\u0006\b"+
		"\uffff\uffff\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005\u0002\u0000\u0000\u00e9\u00ee\u0005"+
		"\"\u0000\u0000\u00ea\u00eb\u0003\u001a\r\u0000\u00eb\u00ec\u0006\b\uffff"+
		"\uffff\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005#\u0000"+
		"\u0000\u00ee\u00ea\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f6\u0005\u001e\u0000"+
		"\u0000\u00f1\u00f2\u0003\u0018\f\u0000\u00f2\u00f3\u0006\b\uffff\uffff"+
		"\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fe\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003\u0006\u0003"+
		"\u0000\u00fa\u00fb\u0006\b\uffff\uffff\u0000\u00fb\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0005\u001f\u0000\u0000\u0102\u0103\u0006\b\uffff\uffff"+
		"\u0000\u0103\u0011\u0001\u0000\u0000\u0000\u0104\u0105\u0005.\u0000\u0000"+
		"\u0105\u0106\u0005\"\u0000\u0000\u0106\u0107\u0003\u001a\r\u0000\u0107"+
		"\u0110\u0006\t\uffff\uffff\u0000\u0108\u0109\u0005\u0015\u0000\u0000\u0109"+
		"\u010a\u0005.\u0000\u0000\u010a\u010b\u0005\"\u0000\u0000\u010b\u010c"+
		"\u0003\u001a\r\u0000\u010c\u010d\u0006\t\uffff\uffff\u0000\u010d\u010f"+
		"\u0001\u0000\u0000\u0000\u010e\u0108\u0001\u0000\u0000\u0000\u010f\u0112"+
		"\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0013\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0005.\u0000\u0000\u0114\u0115\u0006"+
		"\n\uffff\uffff\u0000\u0115\u0015\u0001\u0000\u0000\u0000\u0116\u0117\u0005"+
		".\u0000\u0000\u0117\u011e\u0006\u000b\uffff\uffff\u0000\u0118\u0119\u0005"+
		".\u0000\u0000\u0119\u011a\u0005\u0015\u0000\u0000\u011a\u011b\u0003\u0016"+
		"\u000b\u0000\u011b\u011c\u0006\u000b\uffff\uffff\u0000\u011c\u011e\u0001"+
		"\u0000\u0000\u0000\u011d\u0116\u0001\u0000\u0000\u0000\u011d\u0118\u0001"+
		"\u0000\u0000\u0000\u011e\u0017\u0001\u0000\u0000\u0000\u011f\u0120\u0005"+
		"$\u0000\u0000\u0120\u0121\u0005.\u0000\u0000\u0121\u0127\u0006\f\uffff"+
		"\uffff\u0000\u0122\u0123\u0005\u0015\u0000\u0000\u0123\u0124\u0005.\u0000"+
		"\u0000\u0124\u0126\u0006\f\uffff\uffff\u0000\u0125\u0122\u0001\u0000\u0000"+
		"\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0005\"\u0000\u0000"+
		"\u012b\u012c\u0003\u001c\u000e\u0000\u012c\u012d\u0005\u0017\u0000\u0000"+
		"\u012d\u012e\u0006\f\uffff\uffff\u0000\u012e\u0019\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0005%\u0000\u0000\u0130\u0136\u0006\r\uffff\uffff\u0000"+
		"\u0131\u0132\u0005&\u0000\u0000\u0132\u0136\u0006\r\uffff\uffff\u0000"+
		"\u0133\u0134\u0005\'\u0000\u0000\u0134\u0136\u0006\r\uffff\uffff\u0000"+
		"\u0135\u012f\u0001\u0000\u0000\u0000\u0135\u0131\u0001\u0000\u0000\u0000"+
		"\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u001b\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0003\u001a\r\u0000\u0138\u0139\u0006\u000e\uffff\uffff\u0000"+
		"\u0139\u014c\u0001\u0000\u0000\u0000\u013a\u013e\u0005\u0003\u0000\u0000"+
		"\u013b\u013c\u0003\u0018\f\u0000\u013c\u013d\u0006\u000e\uffff\uffff\u0000"+
		"\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u013b\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0005\u0004\u0000\u0000\u0143\u0144\u0006\u000e\uffff\uffff"+
		"\u0000\u0144\u014c\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0003\u0000"+
		"\u0000\u0146\u0147\u0005+\u0000\u0000\u0147\u0148\u0005\u0004\u0000\u0000"+
		"\u0148\u0149\u0003\u001c\u000e\u0000\u0149\u014a\u0006\u000e\uffff\uffff"+
		"\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0137\u0001\u0000\u0000"+
		"\u0000\u014b\u013a\u0001\u0000\u0000\u0000\u014b\u0145\u0001\u0000\u0000"+
		"\u0000\u014c\u001d\u0001\u0000\u0000\u0000\u0017#Jjlx\u0098\u00a3\u00ae"+
		"\u00b2\u00b9\u00ca\u00d2\u00de\u00e6\u00ee\u00f6\u00fe\u0110\u011d\u0127"+
		"\u0135\u0140\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}