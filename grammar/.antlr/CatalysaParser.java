// Generated from h:\Git\catalysa\grammar\CatalysaParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CatalysaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ADD=2, SUB=3, MUL=4, DIV=5, CONJ=6, OR=7, AND=8, EQ=9, EQEQ=10, 
		NE=11, BE=12, LE=13, BT=14, LT=15, SEMICOLON=16, COLON=17, COMMA=18, DOT=19, 
		QUOTE=20, ADD_ASSIGNMENT=21, SUB_ASSIGNMENT=22, MUL_ASSIGNMENT=23, DIV_ASSIGNMENT=24, 
		LPAREN=25, RPAREN=26, LCURL=27, RCURL=28, ARROW=29, F=30, FOR=31, WHILE=32, 
		IF=33, ELSE=34, LET=35, RETURN=36, NUM=37, TEXT=38, IDENT=39;
	public static final int
		RULE_catalysa_file = 0, RULE_program = 1, RULE_f_call = 2, RULE_block = 3, 
		RULE_function = 4, RULE_let = 5, RULE_if = 6, RULE_expr = 7, RULE_assign = 8, 
		RULE_relational = 9, RULE_add = 10, RULE_mul = 11, RULE_primary = 12, 
		RULE_function_call = 13, RULE_unary = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"catalysa_file", "program", "f_call", "block", "function", "let", "if", 
			"expr", "assign", "relational", "add", "mul", "primary", "function_call", 
			"unary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'&'", "'='", 
			"'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "';'", "':'", "','", "'.'", 
			"'\"'", "'+='", "'-='", "'*='", "'/='", "'('", "')'", "'{'", "'}'", "'->'", 
			"'f'", "'for'", "'while'", "'if'", "'else'", "'let'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "ADD", "SUB", "MUL", "DIV", "CONJ", "OR", "AND", "EQ", "EQEQ", 
			"NE", "BE", "LE", "BT", "LT", "SEMICOLON", "COLON", "COMMA", "DOT", "QUOTE", 
			"ADD_ASSIGNMENT", "SUB_ASSIGNMENT", "MUL_ASSIGNMENT", "DIV_ASSIGNMENT", 
			"LPAREN", "RPAREN", "LCURL", "RCURL", "ARROW", "F", "FOR", "WHILE", "IF", 
			"ELSE", "LET", "RETURN", "NUM", "TEXT", "IDENT"
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
	public String getGrammarFileName() { return "CatalysaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CatalysaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Catalysa_fileContext extends ParserRuleContext {
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public Catalysa_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catalysa_file; }
	}

	public final Catalysa_fileContext catalysa_file() throws RecognitionException {
		Catalysa_fileContext _localctx = new Catalysa_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_catalysa_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << LPAREN) | (1L << LCURL) | (1L << F) | (1L << IF) | (1L << LET) | (1L << NUM) | (1L << TEXT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(30);
				program();
				}
				}
				setState(35);
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

	public static class ProgramContext extends ParserRuleContext {
		public IfContext if() {
			return getRuleContext(IfContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				if();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				f_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				let();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				block();
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

	public static class F_callContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CatalysaParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(CatalysaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CatalysaParser.RPAREN, 0); }
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CatalysaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CatalysaParser.COMMA, i);
		}
		public F_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_call; }
	}

	public final F_callContext f_call() throws RecognitionException {
		F_callContext _localctx = new F_callContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_f_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(IDENT);
			setState(45);
			match(LPAREN);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << LPAREN) | (1L << LCURL) | (1L << F) | (1L << IF) | (1L << LET) | (1L << NUM) | (1L << TEXT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(46);
				program();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(47);
					match(COMMA);
					}
				}

				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(RPAREN);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(CatalysaParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(CatalysaParser.RCURL, 0); }
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LCURL);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << LPAREN) | (1L << LCURL) | (1L << F) | (1L << IF) | (1L << LET) | (1L << NUM) | (1L << TEXT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(58);
				program();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(RCURL);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode F() { return getToken(CatalysaParser.F, 0); }
		public List<TerminalNode> IDENT() { return getTokens(CatalysaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CatalysaParser.IDENT, i);
		}
		public TerminalNode LPAREN() { return getToken(CatalysaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CatalysaParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(CatalysaParser.ARROW, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CatalysaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CatalysaParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(F);
			setState(67);
			match(IDENT);
			setState(68);
			match(LPAREN);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(69);
				match(IDENT);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(70);
					match(COMMA);
					}
				}

				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(RPAREN);
			setState(79);
			match(ARROW);
			setState(80);
			program();
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(CatalysaParser.LET, 0); }
		public TerminalNode IDENT() { return getToken(CatalysaParser.IDENT, 0); }
		public TerminalNode EQ() { return getToken(CatalysaParser.EQ, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LET);
			setState(83);
			match(IDENT);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(84);
				match(EQ);
				setState(85);
				program();
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

	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CatalysaParser.IF, 0); }
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(CatalysaParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(CatalysaParser.ELSE, i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	}

	public final IfContext if() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IF);
			setState(89);
			relational();
			setState(90);
			program();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					match(ELSE);
					setState(92);
					program();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				relational();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CatalysaParser.IDENT, 0); }
		public TerminalNode EQ() { return getToken(CatalysaParser.EQ, 0); }
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IDENT);
			setState(103);
			match(EQ);
			setState(104);
			relational();
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

	public static class RelationalContext extends ParserRuleContext {
		public List<AddContext> add() {
			return getRuleContexts(AddContext.class);
		}
		public AddContext add(int i) {
			return getRuleContext(AddContext.class,i);
		}
		public List<TerminalNode> LE() { return getTokens(CatalysaParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(CatalysaParser.LE, i);
		}
		public List<TerminalNode> LT() { return getTokens(CatalysaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CatalysaParser.LT, i);
		}
		public List<TerminalNode> BE() { return getTokens(CatalysaParser.BE); }
		public TerminalNode BE(int i) {
			return getToken(CatalysaParser.BE, i);
		}
		public List<TerminalNode> BT() { return getTokens(CatalysaParser.BT); }
		public TerminalNode BT(int i) {
			return getToken(CatalysaParser.BT, i);
		}
		public List<TerminalNode> EQEQ() { return getTokens(CatalysaParser.EQEQ); }
		public TerminalNode EQEQ(int i) {
			return getToken(CatalysaParser.EQEQ, i);
		}
		public List<TerminalNode> NE() { return getTokens(CatalysaParser.NE); }
		public TerminalNode NE(int i) {
			return getToken(CatalysaParser.NE, i);
		}
		public List<TerminalNode> CONJ() { return getTokens(CatalysaParser.CONJ); }
		public TerminalNode CONJ(int i) {
			return getToken(CatalysaParser.CONJ, i);
		}
		public List<TerminalNode> OR() { return getTokens(CatalysaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CatalysaParser.OR, i);
		}
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			add();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONJ) | (1L << OR) | (1L << EQEQ) | (1L << NE) | (1L << BE) | (1L << LE) | (1L << BT) | (1L << LT))) != 0)) {
				{
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LE:
					{
					setState(107);
					match(LE);
					setState(108);
					add();
					}
					break;
				case LT:
					{
					setState(109);
					match(LT);
					setState(110);
					add();
					}
					break;
				case BE:
					{
					setState(111);
					match(BE);
					setState(112);
					add();
					}
					break;
				case BT:
					{
					setState(113);
					match(BT);
					setState(114);
					add();
					}
					break;
				case EQEQ:
					{
					setState(115);
					match(EQEQ);
					setState(116);
					add();
					}
					break;
				case NE:
					{
					setState(117);
					match(NE);
					setState(118);
					add();
					}
					break;
				case CONJ:
					{
					setState(119);
					match(CONJ);
					setState(120);
					add();
					}
					break;
				case OR:
					{
					setState(121);
					match(OR);
					setState(122);
					add();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(127);
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

	public static class AddContext extends ParserRuleContext {
		public List<MulContext> mul() {
			return getRuleContexts(MulContext.class);
		}
		public MulContext mul(int i) {
			return getRuleContext(MulContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(CatalysaParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(CatalysaParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(CatalysaParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(CatalysaParser.SUB, i);
		}
		public List<TerminalNode> SUB_ASSIGNMENT() { return getTokens(CatalysaParser.SUB_ASSIGNMENT); }
		public TerminalNode SUB_ASSIGNMENT(int i) {
			return getToken(CatalysaParser.SUB_ASSIGNMENT, i);
		}
		public List<TerminalNode> ADD_ASSIGNMENT() { return getTokens(CatalysaParser.ADD_ASSIGNMENT); }
		public TerminalNode ADD_ASSIGNMENT(int i) {
			return getToken(CatalysaParser.ADD_ASSIGNMENT, i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_add);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			mul();
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(137);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADD:
						{
						setState(129);
						match(ADD);
						setState(130);
						mul();
						}
						break;
					case SUB:
						{
						setState(131);
						match(SUB);
						setState(132);
						mul();
						}
						break;
					case SUB_ASSIGNMENT:
						{
						setState(133);
						match(SUB_ASSIGNMENT);
						setState(134);
						mul();
						}
						break;
					case ADD_ASSIGNMENT:
						{
						setState(135);
						match(ADD_ASSIGNMENT);
						setState(136);
						mul();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class MulContext extends ParserRuleContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(CatalysaParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(CatalysaParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CatalysaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CatalysaParser.DIV, i);
		}
		public List<TerminalNode> DIV_ASSIGNMENT() { return getTokens(CatalysaParser.DIV_ASSIGNMENT); }
		public TerminalNode DIV_ASSIGNMENT(int i) {
			return getToken(CatalysaParser.DIV_ASSIGNMENT, i);
		}
		public List<TerminalNode> MUL_ASSIGNMENT() { return getTokens(CatalysaParser.MUL_ASSIGNMENT); }
		public TerminalNode MUL_ASSIGNMENT(int i) {
			return getToken(CatalysaParser.MUL_ASSIGNMENT, i);
		}
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			unary();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MUL_ASSIGNMENT) | (1L << DIV_ASSIGNMENT))) != 0)) {
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(143);
					match(MUL);
					setState(144);
					unary();
					}
					break;
				case DIV:
					{
					setState(145);
					match(DIV);
					setState(146);
					unary();
					}
					break;
				case DIV_ASSIGNMENT:
					{
					setState(147);
					match(DIV_ASSIGNMENT);
					setState(148);
					unary();
					}
					break;
				case MUL_ASSIGNMENT:
					{
					setState(149);
					match(MUL_ASSIGNMENT);
					setState(150);
					unary();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(155);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CatalysaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CatalysaParser.RPAREN, 0); }
		public TerminalNode IDENT() { return getToken(CatalysaParser.IDENT, 0); }
		public TerminalNode TEXT() { return getToken(CatalysaParser.TEXT, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CatalysaParser.NUM, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primary);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(LPAREN);
				setState(157);
				expr();
				setState(158);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(IDENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(TEXT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(NUM);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CatalysaParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(CatalysaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CatalysaParser.RPAREN, 0); }
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CatalysaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CatalysaParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IDENT);
			setState(167);
			match(LPAREN);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << LPAREN) | (1L << NUM) | (1L << TEXT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(168);
				unary();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(169);
					match(COMMA);
					}
				}

				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(RPAREN);
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

	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CatalysaParser.ADD, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CatalysaParser.SUB, 0); }
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(ADD);
				setState(180);
				primary();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(SUB);
				setState(182);
				primary();
				}
				break;
			case LPAREN:
			case NUM:
			case TEXT:
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				primary();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00bd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\5\4\63\n\4\7"+
		"\4\65\n\4\f\4\16\48\13\4\3\4\3\4\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\7\6L\n\6\f\6\16\6O\13\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\7\b`\n\b\f\b\16\bc\13"+
		"\b\3\t\3\t\5\tg\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13~\n\13\f\13\16"+
		"\13\u0081\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008c\n\f\f\f"+
		"\16\f\u008f\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009a\n\r\f\r"+
		"\16\r\u009d\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a7\n"+
		"\16\3\17\3\17\3\17\3\17\5\17\u00ad\n\17\7\17\u00af\n\17\f\17\16\17\u00b2"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00bb\n\20\3\20\2\2\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u00d3\2#\3\2\2\2\4,\3\2"+
		"\2\2\6.\3\2\2\2\b;\3\2\2\2\nD\3\2\2\2\fT\3\2\2\2\16Z\3\2\2\2\20f\3\2\2"+
		"\2\22h\3\2\2\2\24l\3\2\2\2\26\u0082\3\2\2\2\30\u0090\3\2\2\2\32\u00a6"+
		"\3\2\2\2\34\u00a8\3\2\2\2\36\u00ba\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2"+
		"\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2&-\5\16\b\2\'-\5\6\4\2(-"+
		"\5\n\6\2)-\5\20\t\2*-\5\f\7\2+-\5\b\5\2,&\3\2\2\2,\'\3\2\2\2,(\3\2\2\2"+
		",)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2./\7)\2\2/\66\7\33\2\2\60\62"+
		"\5\4\3\2\61\63\7\24\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\60"+
		"\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2"+
		"\29:\7\34\2\2:\7\3\2\2\2;?\7\35\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3"+
		"\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\36\2\2C\t\3\2\2\2DE\7 \2\2EF"+
		"\7)\2\2FM\7\33\2\2GI\7)\2\2HJ\7\24\2\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2\2K"+
		"G\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\34\2\2"+
		"QR\7\37\2\2RS\5\4\3\2S\13\3\2\2\2TU\7%\2\2UX\7)\2\2VW\7\13\2\2WY\5\4\3"+
		"\2XV\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2Z[\7#\2\2[\\\5\24\13\2\\a\5\4\3\2]^\7"+
		"$\2\2^`\5\4\3\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\17\3\2\2\2ca"+
		"\3\2\2\2dg\5\22\n\2eg\5\24\13\2fd\3\2\2\2fe\3\2\2\2g\21\3\2\2\2hi\7)\2"+
		"\2ij\7\13\2\2jk\5\24\13\2k\23\3\2\2\2l\177\5\26\f\2mn\7\17\2\2n~\5\26"+
		"\f\2op\7\21\2\2p~\5\26\f\2qr\7\16\2\2r~\5\26\f\2st\7\20\2\2t~\5\26\f\2"+
		"uv\7\f\2\2v~\5\26\f\2wx\7\r\2\2x~\5\26\f\2yz\7\b\2\2z~\5\26\f\2{|\7\t"+
		"\2\2|~\5\26\f\2}m\3\2\2\2}o\3\2\2\2}q\3\2\2\2}s\3\2\2\2}u\3\2\2\2}w\3"+
		"\2\2\2}y\3\2\2\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\25\3\2\2\2\u0081\177\3\2\2\2\u0082\u008d\5\30\r\2\u0083\u0084"+
		"\7\4\2\2\u0084\u008c\5\30\r\2\u0085\u0086\7\5\2\2\u0086\u008c\5\30\r\2"+
		"\u0087\u0088\7\30\2\2\u0088\u008c\5\30\r\2\u0089\u008a\7\27\2\2\u008a"+
		"\u008c\5\30\r\2\u008b\u0083\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0087\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\27\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u009b\5\36\20"+
		"\2\u0091\u0092\7\6\2\2\u0092\u009a\5\36\20\2\u0093\u0094\7\7\2\2\u0094"+
		"\u009a\5\36\20\2\u0095\u0096\7\32\2\2\u0096\u009a\5\36\20\2\u0097\u0098"+
		"\7\31\2\2\u0098\u009a\5\36\20\2\u0099\u0091\3\2\2\2\u0099\u0093\3\2\2"+
		"\2\u0099\u0095\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\31\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\7\33\2\2\u009f\u00a0\5\20\t\2\u00a0\u00a1\7\34\2\2\u00a1\u00a7"+
		"\3\2\2\2\u00a2\u00a7\7)\2\2\u00a3\u00a7\7(\2\2\u00a4\u00a7\5\34\17\2\u00a5"+
		"\u00a7\7\'\2\2\u00a6\u009e\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00a9"+
		"\7)\2\2\u00a9\u00b0\7\33\2\2\u00aa\u00ac\5\36\20\2\u00ab\u00ad\7\24\2"+
		"\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00aa"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\34\2\2\u00b4\35\3\2\2"+
		"\2\u00b5\u00b6\7\4\2\2\u00b6\u00bb\5\32\16\2\u00b7\u00b8\7\5\2\2\u00b8"+
		"\u00bb\5\32\16\2\u00b9\u00bb\5\32\16\2\u00ba\u00b5\3\2\2\2\u00ba\u00b7"+
		"\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\37\3\2\2\2\26#,\62\66?IMXaf}\177\u008b"+
		"\u008d\u0099\u009b\u00a6\u00ac\u00b0\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}