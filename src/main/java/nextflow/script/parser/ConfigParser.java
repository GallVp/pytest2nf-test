// Generated from ConfigParser.g4 by ANTLR 4.9.2

package nextflow.script.parser;

import nextflow.script.parser.AbstractParser;
import org.apache.groovy.parser.antlr4.GroovySyntaxError;

import static nextflow.script.parser.SemanticPredicates.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConfigParser extends AbstractParser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StringLiteral=1, GStringBegin=2, TdqGStringBegin=3, GStringEnd=4, GStringPath=5, 
		GStringText=6, GStringExprStart=7, TdqGStringEnd=8, TdqGStringPath=9, 
		TdqGStringText=10, TdqGStringExprStart=11, AS=12, DEF=13, IN=14, BuiltInPrimitiveType=15, 
		ASSERT=16, CATCH=17, ELSE=18, IF=19, INSTANCEOF=20, NEW=21, RETURN=22, 
		THROW=23, TRY=24, INCLUDE_CONFIG=25, IntegerLiteral=26, FloatingPointLiteral=27, 
		BooleanLiteral=28, NullLiteral=29, RANGE_INCLUSIVE=30, RANGE_EXCLUSIVE_RIGHT=31, 
		SPREAD_DOT=32, SAFE_DOT=33, ELVIS=34, REGEX_FIND=35, REGEX_MATCH=36, POWER=37, 
		SPACESHIP=38, ARROW=39, NOT_INSTANCEOF=40, NOT_IN=41, LPAREN=42, RPAREN=43, 
		LBRACE=44, RBRACE=45, LBRACK=46, RBRACK=47, SEMI=48, COMMA=49, DOT=50, 
		ASSIGN=51, GT=52, LT=53, NOT=54, BITNOT=55, QUESTION=56, COLON=57, EQUAL=58, 
		LE=59, GE=60, NOTEQUAL=61, AND=62, OR=63, ADD=64, SUB=65, MUL=66, DIV=67, 
		BITAND=68, BITOR=69, XOR=70, MOD=71, ADD_ASSIGN=72, SUB_ASSIGN=73, MUL_ASSIGN=74, 
		DIV_ASSIGN=75, AND_ASSIGN=76, OR_ASSIGN=77, XOR_ASSIGN=78, MOD_ASSIGN=79, 
		LSHIFT_ASSIGN=80, RSHIFT_ASSIGN=81, URSHIFT_ASSIGN=82, ELVIS_ASSIGN=83, 
		POWER_ASSIGN=84, CapitalizedIdentifier=85, Identifier=86, WS=87, NL=88, 
		UNEXPECTED_CHAR=89;
	public static final int
		RULE_compilationUnit = 0, RULE_configStatement = 1, RULE_configInclude = 2, 
		RULE_configAssignment = 3, RULE_configAssignmentPath = 4, RULE_configPrimary = 5, 
		RULE_configBlock = 6, RULE_configBlockStatement = 7, RULE_configSelector = 8, 
		RULE_configAppendBlock = 9, RULE_configAppendBlockStatement = 10, RULE_configIncomplete = 11, 
		RULE_invalidStatement = 12, RULE_statement = 13, RULE_ifElseStatement = 14, 
		RULE_statementOrBlock = 15, RULE_blockStatements = 16, RULE_tryCatchStatement = 17, 
		RULE_catchClause = 18, RULE_catchTypes = 19, RULE_assertStatement = 20, 
		RULE_variableDeclaration = 21, RULE_variableNames = 22, RULE_multipleAssignmentStatement = 23, 
		RULE_assignmentStatement = 24, RULE_expressionStatement = 25, RULE_expression = 26, 
		RULE_primary = 27, RULE_pathElement = 28, RULE_namedProperty = 29, RULE_indexPropertyArgs = 30, 
		RULE_identifier = 31, RULE_literal = 32, RULE_stringLiteral = 33, RULE_gstring = 34, 
		RULE_gstringDqPart = 35, RULE_gstringTdqPart = 36, RULE_creator = 37, 
		RULE_createdName = 38, RULE_parExpression = 39, RULE_closure = 40, RULE_formalParameterList = 41, 
		RULE_formalParameter = 42, RULE_closureWithLabels = 43, RULE_blockStatementsWithLabels = 44, 
		RULE_statementOrLabeled = 45, RULE_list = 46, RULE_expressionList = 47, 
		RULE_map = 48, RULE_mapEntryList = 49, RULE_mapEntry = 50, RULE_mapEntryLabel = 51, 
		RULE_builtInType = 52, RULE_arguments = 53, RULE_argumentList = 54, RULE_argumentListElement = 55, 
		RULE_namedArg = 56, RULE_type = 57, RULE_primitiveType = 58, RULE_qualifiedClassName = 59, 
		RULE_qualifiedNameElements = 60, RULE_qualifiedNameElement = 61, RULE_className = 62, 
		RULE_typeArguments = 63, RULE_legacyType = 64, RULE_keywords = 65, RULE_rparen = 66, 
		RULE_nls = 67, RULE_sep = 68;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "configStatement", "configInclude", "configAssignment", 
			"configAssignmentPath", "configPrimary", "configBlock", "configBlockStatement", 
			"configSelector", "configAppendBlock", "configAppendBlockStatement", 
			"configIncomplete", "invalidStatement", "statement", "ifElseStatement", 
			"statementOrBlock", "blockStatements", "tryCatchStatement", "catchClause", 
			"catchTypes", "assertStatement", "variableDeclaration", "variableNames", 
			"multipleAssignmentStatement", "assignmentStatement", "expressionStatement", 
			"expression", "primary", "pathElement", "namedProperty", "indexPropertyArgs", 
			"identifier", "literal", "stringLiteral", "gstring", "gstringDqPart", 
			"gstringTdqPart", "creator", "createdName", "parExpression", "closure", 
			"formalParameterList", "formalParameter", "closureWithLabels", "blockStatementsWithLabels", 
			"statementOrLabeled", "list", "expressionList", "map", "mapEntryList", 
			"mapEntry", "mapEntryLabel", "builtInType", "arguments", "argumentList", 
			"argumentListElement", "namedArg", "type", "primitiveType", "qualifiedClassName", 
			"qualifiedNameElements", "qualifiedNameElement", "className", "typeArguments", 
			"legacyType", "keywords", "rparen", "nls", "sep"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'as'", "'def'", "'in'", null, "'assert'", "'catch'", "'else'", "'if'", 
			"'instanceof'", "'new'", "'return'", "'throw'", "'try'", "'includeConfig'", 
			null, null, null, "'null'", "'..'", "'..<'", "'*.'", "'?.'", "'?:'", 
			"'=~'", "'==~'", "'**'", "'<=>'", "'->'", "'!instanceof'", "'!in'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", null, "'='", "'>'", 
			"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'+'", "'-'", "'*'", null, "'&'", "'|'", "'^'", "'%'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
			"'>>>='", "'?='", "'**='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StringLiteral", "GStringBegin", "TdqGStringBegin", "GStringEnd", 
			"GStringPath", "GStringText", "GStringExprStart", "TdqGStringEnd", "TdqGStringPath", 
			"TdqGStringText", "TdqGStringExprStart", "AS", "DEF", "IN", "BuiltInPrimitiveType", 
			"ASSERT", "CATCH", "ELSE", "IF", "INSTANCEOF", "NEW", "RETURN", "THROW", 
			"TRY", "INCLUDE_CONFIG", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
			"NullLiteral", "RANGE_INCLUSIVE", "RANGE_EXCLUSIVE_RIGHT", "SPREAD_DOT", 
			"SAFE_DOT", "ELVIS", "REGEX_FIND", "REGEX_MATCH", "POWER", "SPACESHIP", 
			"ARROW", "NOT_INSTANCEOF", "NOT_IN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "NOT", 
			"BITNOT", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "XOR", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"ELVIS_ASSIGN", "POWER_ASSIGN", "CapitalizedIdentifier", "Identifier", 
			"WS", "NL", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "ConfigParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    @Override
	    public int getSyntaxErrorSource() {
	        return GroovySyntaxError.PARSER;
	    }

	    @Override
	    public int getErrorLine() {
	        Token token = _input.LT(-1);

	        if (null == token) {
	            return -1;
	        }

	        return token.getLine();
	    }

	    @Override
	    public int getErrorColumn() {
	        Token token = _input.LT(-1);

	        if (null == token) {
	            return -1;
	        }

	        return token.getCharPositionInLine() + 1 + token.getText().length();
	    }

	public ConfigParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ConfigParser.EOF, 0); }
		public List<ConfigStatementContext> configStatement() {
			return getRuleContexts(ConfigStatementContext.class);
		}
		public ConfigStatementContext configStatement(int i) {
			return getRuleContext(ConfigStatementContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			nls();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << AS) | (1L << DEF) | (1L << IN) | (1L << BuiltInPrimitiveType) | (1L << IF) | (1L << TRY) | (1L << INCLUDE_CONFIG))) != 0) || _la==CapitalizedIdentifier || _la==Identifier) {
				{
				setState(139);
				configStatement();
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(140);
						sep();
						setState(141);
						configStatement();
						}
						} 
					}
					setState(147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==NL) {
					{
					setState(148);
					sep();
					}
				}

				}
			}

			setState(153);
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

	public static class ConfigStatementContext extends ParserRuleContext {
		public ConfigStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configStatement; }
	 
		public ConfigStatementContext() { }
		public void copyFrom(ConfigStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConfigIncludeStmtAltContext extends ConfigStatementContext {
		public ConfigIncludeContext configInclude() {
			return getRuleContext(ConfigIncludeContext.class,0);
		}
		public ConfigIncludeStmtAltContext(ConfigStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigIncludeStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigIncludeStmtAlt(this);
		}
	}
	public static class ConfigIncompleteStmtAltContext extends ConfigStatementContext {
		public ConfigIncompleteContext configIncomplete() {
			return getRuleContext(ConfigIncompleteContext.class,0);
		}
		public ConfigIncompleteStmtAltContext(ConfigStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigIncompleteStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigIncompleteStmtAlt(this);
		}
	}
	public static class ConfigAssignmentStmtAltContext extends ConfigStatementContext {
		public ConfigAssignmentContext configAssignment() {
			return getRuleContext(ConfigAssignmentContext.class,0);
		}
		public ConfigAssignmentStmtAltContext(ConfigStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigAssignmentStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigAssignmentStmtAlt(this);
		}
	}
	public static class ConfigInvalidStmtAltContext extends ConfigStatementContext {
		public InvalidStatementContext invalidStatement() {
			return getRuleContext(InvalidStatementContext.class,0);
		}
		public ConfigInvalidStmtAltContext(ConfigStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigInvalidStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigInvalidStmtAlt(this);
		}
	}
	public static class ConfigBlockStmtAltContext extends ConfigStatementContext {
		public ConfigBlockContext configBlock() {
			return getRuleContext(ConfigBlockContext.class,0);
		}
		public ConfigBlockStmtAltContext(ConfigStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigBlockStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigBlockStmtAlt(this);
		}
	}
	public static class ConfigAppendBlockStmtAltContext extends ConfigStatementContext {
		public ConfigAppendBlockContext configAppendBlock() {
			return getRuleContext(ConfigAppendBlockContext.class,0);
		}
		public ConfigAppendBlockStmtAltContext(ConfigStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigAppendBlockStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigAppendBlockStmtAlt(this);
		}
	}

	public final ConfigStatementContext configStatement() throws RecognitionException {
		ConfigStatementContext _localctx = new ConfigStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_configStatement);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ConfigIncludeStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				configInclude();
				}
				break;
			case 2:
				_localctx = new ConfigAssignmentStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				configAssignment();
				}
				break;
			case 3:
				_localctx = new ConfigBlockStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				configBlock();
				}
				break;
			case 4:
				_localctx = new ConfigAppendBlockStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				configAppendBlock();
				}
				break;
			case 5:
				_localctx = new ConfigIncompleteStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				configIncomplete();
				}
				break;
			case 6:
				_localctx = new ConfigInvalidStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				invalidStatement();
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

	public static class ConfigIncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE_CONFIG() { return getToken(ConfigParser.INCLUDE_CONFIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConfigIncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configInclude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigInclude(this);
		}
	}

	public final ConfigIncludeContext configInclude() throws RecognitionException {
		ConfigIncludeContext _localctx = new ConfigIncludeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_configInclude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(INCLUDE_CONFIG);
			setState(164);
			expression(0);
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

	public static class ConfigAssignmentContext extends ParserRuleContext {
		public ConfigAssignmentPathContext configAssignmentPath() {
			return getRuleContext(ConfigAssignmentPathContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ConfigParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConfigAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigAssignment(this);
		}
	}

	public final ConfigAssignmentContext configAssignment() throws RecognitionException {
		ConfigAssignmentContext _localctx = new ConfigAssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_configAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			configAssignmentPath();
			setState(167);
			nls();
			setState(168);
			match(ASSIGN);
			setState(169);
			nls();
			setState(170);
			expression(0);
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

	public static class ConfigAssignmentPathContext extends ParserRuleContext {
		public List<ConfigPrimaryContext> configPrimary() {
			return getRuleContexts(ConfigPrimaryContext.class);
		}
		public ConfigPrimaryContext configPrimary(int i) {
			return getRuleContext(ConfigPrimaryContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ConfigParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ConfigParser.DOT, i);
		}
		public ConfigAssignmentPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configAssignmentPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigAssignmentPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigAssignmentPath(this);
		}
	}

	public final ConfigAssignmentPathContext configAssignmentPath() throws RecognitionException {
		ConfigAssignmentPathContext _localctx = new ConfigAssignmentPathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_configAssignmentPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			configPrimary();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(173);
				match(DOT);
				setState(174);
				configPrimary();
				}
				}
				setState(179);
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

	public static class ConfigPrimaryContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public ConfigPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigPrimary(this);
		}
	}

	public final ConfigPrimaryContext configPrimary() throws RecognitionException {
		ConfigPrimaryContext _localctx = new ConfigPrimaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_configPrimary);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
			case CapitalizedIdentifier:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				identifier();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				stringLiteral();
				}
				break;
			case BuiltInPrimitiveType:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				builtInType();
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

	public static class ConfigBlockContext extends ParserRuleContext {
		public ConfigPrimaryContext configPrimary() {
			return getRuleContext(ConfigPrimaryContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(ConfigParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ConfigParser.RBRACE, 0); }
		public List<ConfigBlockStatementContext> configBlockStatement() {
			return getRuleContexts(ConfigBlockStatementContext.class);
		}
		public ConfigBlockStatementContext configBlockStatement(int i) {
			return getRuleContext(ConfigBlockStatementContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public ConfigBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigBlock(this);
		}
	}

	public final ConfigBlockContext configBlock() throws RecognitionException {
		ConfigBlockContext _localctx = new ConfigBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_configBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			configPrimary();
			setState(186);
			nls();
			setState(187);
			match(LBRACE);
			setState(188);
			nls();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << AS) | (1L << DEF) | (1L << IN) | (1L << BuiltInPrimitiveType) | (1L << IF) | (1L << TRY) | (1L << INCLUDE_CONFIG))) != 0) || _la==CapitalizedIdentifier || _la==Identifier) {
				{
				setState(189);
				configBlockStatement();
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(190);
						sep();
						setState(191);
						configBlockStatement();
						}
						} 
					}
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==NL) {
					{
					setState(198);
					sep();
					}
				}

				}
			}

			setState(203);
			match(RBRACE);
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

	public static class ConfigBlockStatementContext extends ParserRuleContext {
		public ConfigBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configBlockStatement; }
	 
		public ConfigBlockStatementContext() { }
		public void copyFrom(ConfigBlockStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConfigIncludeBlockStmtAltContext extends ConfigBlockStatementContext {
		public ConfigIncludeContext configInclude() {
			return getRuleContext(ConfigIncludeContext.class,0);
		}
		public ConfigIncludeBlockStmtAltContext(ConfigBlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigIncludeBlockStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigIncludeBlockStmtAlt(this);
		}
	}
	public static class ConfigAppendBlockBlockStmtAltContext extends ConfigBlockStatementContext {
		public ConfigAppendBlockContext configAppendBlock() {
			return getRuleContext(ConfigAppendBlockContext.class,0);
		}
		public ConfigAppendBlockBlockStmtAltContext(ConfigBlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigAppendBlockBlockStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigAppendBlockBlockStmtAlt(this);
		}
	}
	public static class ConfigInvalidBlockStmtAltContext extends ConfigBlockStatementContext {
		public InvalidStatementContext invalidStatement() {
			return getRuleContext(InvalidStatementContext.class,0);
		}
		public ConfigInvalidBlockStmtAltContext(ConfigBlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigInvalidBlockStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigInvalidBlockStmtAlt(this);
		}
	}
	public static class ConfigIncompleteBlockStmtAltContext extends ConfigBlockStatementContext {
		public ConfigIncompleteContext configIncomplete() {
			return getRuleContext(ConfigIncompleteContext.class,0);
		}
		public ConfigIncompleteBlockStmtAltContext(ConfigBlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigIncompleteBlockStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigIncompleteBlockStmtAlt(this);
		}
	}
	public static class ConfigBlockBlockStmtAltContext extends ConfigBlockStatementContext {
		public ConfigBlockContext configBlock() {
			return getRuleContext(ConfigBlockContext.class,0);
		}
		public ConfigBlockBlockStmtAltContext(ConfigBlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigBlockBlockStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigBlockBlockStmtAlt(this);
		}
	}
	public static class ConfigAssignmentBlockStmtAltContext extends ConfigBlockStatementContext {
		public ConfigAssignmentContext configAssignment() {
			return getRuleContext(ConfigAssignmentContext.class,0);
		}
		public ConfigAssignmentBlockStmtAltContext(ConfigBlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigAssignmentBlockStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigAssignmentBlockStmtAlt(this);
		}
	}
	public static class ConfigSelectorBlockStmtAltContext extends ConfigBlockStatementContext {
		public ConfigSelectorContext configSelector() {
			return getRuleContext(ConfigSelectorContext.class,0);
		}
		public ConfigSelectorBlockStmtAltContext(ConfigBlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigSelectorBlockStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigSelectorBlockStmtAlt(this);
		}
	}

	public final ConfigBlockStatementContext configBlockStatement() throws RecognitionException {
		ConfigBlockStatementContext _localctx = new ConfigBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_configBlockStatement);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ConfigIncludeBlockStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				configInclude();
				}
				break;
			case 2:
				_localctx = new ConfigAssignmentBlockStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				configAssignment();
				}
				break;
			case 3:
				_localctx = new ConfigBlockBlockStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				configBlock();
				}
				break;
			case 4:
				_localctx = new ConfigAppendBlockBlockStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				configAppendBlock();
				}
				break;
			case 5:
				_localctx = new ConfigSelectorBlockStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				configSelector();
				}
				break;
			case 6:
				_localctx = new ConfigIncompleteBlockStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				configIncomplete();
				}
				break;
			case 7:
				_localctx = new ConfigInvalidBlockStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				invalidStatement();
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

	public static class ConfigSelectorContext extends ParserRuleContext {
		public Token kind;
		public ConfigPrimaryContext target;
		public TerminalNode COLON() { return getToken(ConfigParser.COLON, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(ConfigParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ConfigParser.RBRACE, 0); }
		public TerminalNode Identifier() { return getToken(ConfigParser.Identifier, 0); }
		public ConfigPrimaryContext configPrimary() {
			return getRuleContext(ConfigPrimaryContext.class,0);
		}
		public List<ConfigAssignmentContext> configAssignment() {
			return getRuleContexts(ConfigAssignmentContext.class);
		}
		public ConfigAssignmentContext configAssignment(int i) {
			return getRuleContext(ConfigAssignmentContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public ConfigSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigSelector(this);
		}
	}

	public final ConfigSelectorContext configSelector() throws RecognitionException {
		ConfigSelectorContext _localctx = new ConfigSelectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_configSelector);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((ConfigSelectorContext)_localctx).kind = match(Identifier);
			setState(215);
			match(COLON);
			setState(216);
			((ConfigSelectorContext)_localctx).target = configPrimary();
			setState(217);
			nls();
			setState(218);
			match(LBRACE);
			setState(219);
			nls();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << IN) | (1L << BuiltInPrimitiveType))) != 0) || _la==CapitalizedIdentifier || _la==Identifier) {
				{
				setState(220);
				configAssignment();
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(221);
						sep();
						setState(222);
						configAssignment();
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==NL) {
					{
					setState(229);
					sep();
					}
				}

				}
			}

			setState(234);
			match(RBRACE);
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

	public static class ConfigAppendBlockContext extends ParserRuleContext {
		public ConfigPrimaryContext configPrimary() {
			return getRuleContext(ConfigPrimaryContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(ConfigParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ConfigParser.RBRACE, 0); }
		public List<ConfigAppendBlockStatementContext> configAppendBlockStatement() {
			return getRuleContexts(ConfigAppendBlockStatementContext.class);
		}
		public ConfigAppendBlockStatementContext configAppendBlockStatement(int i) {
			return getRuleContext(ConfigAppendBlockStatementContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public ConfigAppendBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configAppendBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigAppendBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigAppendBlock(this);
		}
	}

	public final ConfigAppendBlockContext configAppendBlock() throws RecognitionException {
		ConfigAppendBlockContext _localctx = new ConfigAppendBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_configAppendBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			configPrimary();
			setState(237);
			nls();
			setState(238);
			match(LBRACE);
			setState(239);
			nls();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==CapitalizedIdentifier || _la==Identifier) {
				{
				setState(240);
				configAppendBlockStatement();
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(241);
						sep();
						setState(242);
						configAppendBlockStatement();
						}
						} 
					}
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==NL) {
					{
					setState(249);
					sep();
					}
				}

				}
			}

			setState(254);
			match(RBRACE);
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

	public static class ConfigAppendBlockStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConfigAppendBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configAppendBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigAppendBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigAppendBlockStatement(this);
		}
	}

	public final ConfigAppendBlockStatementContext configAppendBlockStatement() throws RecognitionException {
		ConfigAppendBlockStatementContext _localctx = new ConfigAppendBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_configAppendBlockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			identifier();
			setState(257);
			literal();
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

	public static class ConfigIncompleteContext extends ParserRuleContext {
		public List<ConfigPrimaryContext> configPrimary() {
			return getRuleContexts(ConfigPrimaryContext.class);
		}
		public ConfigPrimaryContext configPrimary(int i) {
			return getRuleContext(ConfigPrimaryContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ConfigParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ConfigParser.DOT, i);
		}
		public ConfigIncompleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configIncomplete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConfigIncomplete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConfigIncomplete(this);
		}
	}

	public final ConfigIncompleteContext configIncomplete() throws RecognitionException {
		ConfigIncompleteContext _localctx = new ConfigIncompleteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_configIncomplete);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			configPrimary();
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					match(DOT);
					setState(261);
					configPrimary();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(267);
				match(DOT);
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

	public static class InvalidStatementContext extends ParserRuleContext {
		public IfElseStatementContext ifElseStatement() {
			return getRuleContext(IfElseStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public InvalidStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterInvalidStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitInvalidStatement(this);
		}
	}

	public final InvalidStatementContext invalidStatement() throws RecognitionException {
		InvalidStatementContext _localctx = new InvalidStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_invalidStatement);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				ifElseStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				tryCatchStatement();
				}
				break;
			case AS:
			case DEF:
			case IN:
			case BuiltInPrimitiveType:
			case CapitalizedIdentifier:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				variableDeclaration();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyStmtAltContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(ConfigParser.SEMI, 0); }
		public EmptyStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterEmptyStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitEmptyStmtAlt(this);
		}
	}
	public static class ExpressionStmtAltContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterExpressionStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitExpressionStmtAlt(this);
		}
	}
	public static class VariableDeclarationStmtAltContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterVariableDeclarationStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitVariableDeclarationStmtAlt(this);
		}
	}
	public static class TryCatchStmtAltContext extends StatementContext {
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public TryCatchStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterTryCatchStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitTryCatchStmtAlt(this);
		}
	}
	public static class ReturnStmtAltContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(ConfigParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterReturnStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitReturnStmtAlt(this);
		}
	}
	public static class ThrowStmtAltContext extends StatementContext {
		public TerminalNode THROW() { return getToken(ConfigParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterThrowStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitThrowStmtAlt(this);
		}
	}
	public static class AssignmentStmtAltContext extends StatementContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public AssignmentStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterAssignmentStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitAssignmentStmtAlt(this);
		}
	}
	public static class IfElseStmtAltContext extends StatementContext {
		public IfElseStatementContext ifElseStatement() {
			return getRuleContext(IfElseStatementContext.class,0);
		}
		public IfElseStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterIfElseStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitIfElseStmtAlt(this);
		}
	}
	public static class AssertStmtAltContext extends StatementContext {
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public AssertStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterAssertStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitAssertStmtAlt(this);
		}
	}
	public static class MultipleAssignmentStmtAltContext extends StatementContext {
		public MultipleAssignmentStatementContext multipleAssignmentStatement() {
			return getRuleContext(MultipleAssignmentStatementContext.class,0);
		}
		public MultipleAssignmentStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterMultipleAssignmentStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitMultipleAssignmentStmtAlt(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IfElseStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				ifElseStatement();
				}
				break;
			case 2:
				_localctx = new TryCatchStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				tryCatchStatement();
				}
				break;
			case 3:
				_localctx = new ReturnStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(RETURN);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << GStringBegin) | (1L << TdqGStringBegin) | (1L << IN) | (1L << BuiltInPrimitiveType) | (1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << BITNOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (CapitalizedIdentifier - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(278);
					expression(0);
					}
				}

				}
				break;
			case 4:
				_localctx = new ThrowStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(THROW);
				setState(282);
				expression(0);
				}
				break;
			case 5:
				_localctx = new AssertStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
				assertStatement();
				}
				break;
			case 6:
				_localctx = new VariableDeclarationStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				variableDeclaration();
				}
				break;
			case 7:
				_localctx = new MultipleAssignmentStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				multipleAssignmentStatement();
				}
				break;
			case 8:
				_localctx = new AssignmentStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(286);
				assignmentStatement();
				}
				break;
			case 9:
				_localctx = new ExpressionStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(287);
				expressionStatement();
				}
				break;
			case 10:
				_localctx = new EmptyStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(288);
				match(SEMI);
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

	public static class IfElseStatementContext extends ParserRuleContext {
		public StatementOrBlockContext tb;
		public StatementOrBlockContext fb;
		public TerminalNode IF() { return getToken(ConfigParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<StatementOrBlockContext> statementOrBlock() {
			return getRuleContexts(StatementOrBlockContext.class);
		}
		public StatementOrBlockContext statementOrBlock(int i) {
			return getRuleContext(StatementOrBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ConfigParser.ELSE, 0); }
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitIfElseStatement(this);
		}
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(IF);
			setState(292);
			parExpression();
			setState(293);
			nls();
			setState(294);
			((IfElseStatementContext)_localctx).tb = statementOrBlock();
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(295);
				nls();
				setState(296);
				match(ELSE);
				setState(297);
				nls();
				setState(298);
				((IfElseStatementContext)_localctx).fb = statementOrBlock();
				}
				break;
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

	public static class StatementOrBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ConfigParser.LBRACE, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ConfigParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementOrBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementOrBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterStatementOrBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitStatementOrBlock(this);
		}
	}

	public final StatementOrBlockContext statementOrBlock() throws RecognitionException {
		StatementOrBlockContext _localctx = new StatementOrBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementOrBlock);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(LBRACE);
				setState(303);
				nls();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << GStringBegin) | (1L << TdqGStringBegin) | (1L << AS) | (1L << DEF) | (1L << IN) | (1L << BuiltInPrimitiveType) | (1L << ASSERT) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << THROW) | (1L << TRY) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SEMI) | (1L << NOT) | (1L << BITNOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (CapitalizedIdentifier - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(304);
					blockStatements();
					}
				}

				setState(307);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				statement();
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockStatements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			statement();
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					sep();
					setState(314);
					statement();
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI || _la==NL) {
				{
				setState(321);
				sep();
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

	public static class TryCatchStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(ConfigParser.TRY, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public StatementOrBlockContext statementOrBlock() {
			return getRuleContext(StatementOrBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitTryCatchStatement(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tryCatchStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(TRY);
			setState(325);
			nls();
			setState(326);
			statementOrBlock();
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(327);
					nls();
					setState(328);
					catchClause();
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ConfigParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(ConfigParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public StatementOrBlockContext statementOrBlock() {
			return getRuleContext(StatementOrBlockContext.class,0);
		}
		public CatchTypesContext catchTypes() {
			return getRuleContext(CatchTypesContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(CATCH);
			setState(336);
			match(LPAREN);
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(337);
				catchTypes();
				}
				break;
			}
			setState(340);
			identifier();
			setState(341);
			rparen();
			setState(342);
			nls();
			setState(343);
			statementOrBlock();
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

	public static class CatchTypesContext extends ParserRuleContext {
		public List<QualifiedClassNameContext> qualifiedClassName() {
			return getRuleContexts(QualifiedClassNameContext.class);
		}
		public QualifiedClassNameContext qualifiedClassName(int i) {
			return getRuleContext(QualifiedClassNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(ConfigParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(ConfigParser.BITOR, i);
		}
		public CatchTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterCatchTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitCatchTypes(this);
		}
	}

	public final CatchTypesContext catchTypes() throws RecognitionException {
		CatchTypesContext _localctx = new CatchTypesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_catchTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			qualifiedClassName();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(346);
				match(BITOR);
				setState(347);
				qualifiedClassName();
				}
				}
				setState(352);
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

	public static class AssertStatementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext message;
		public TerminalNode ASSERT() { return getToken(ConfigParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(ConfigParser.COLON, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(ASSERT);
			setState(354);
			((AssertStatementContext)_localctx).condition = expression(0);
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(355);
				nls();
				setState(356);
				match(COLON);
				setState(357);
				nls();
				setState(358);
				((AssertStatementContext)_localctx).message = expression(0);
				}
				break;
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public ExpressionContext initializer;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEF() { return getToken(ConfigParser.DEF, 0); }
		public LegacyTypeContext legacyType() {
			return getRuleContext(LegacyTypeContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ConfigParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableNamesContext variableNames() {
			return getRuleContext(VariableNamesContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableDeclaration);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(362);
					match(DEF);
					}
					break;
				case 2:
					{
					setState(363);
					legacyType();
					}
					break;
				case 3:
					{
					setState(364);
					match(DEF);
					setState(365);
					legacyType();
					}
					break;
				}
				setState(368);
				identifier();
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(369);
					nls();
					setState(370);
					match(ASSIGN);
					setState(371);
					nls();
					setState(372);
					((VariableDeclarationContext)_localctx).initializer = expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(DEF);
				setState(377);
				variableNames();
				setState(378);
				nls();
				setState(379);
				match(ASSIGN);
				setState(380);
				nls();
				setState(381);
				((VariableDeclarationContext)_localctx).initializer = expression(0);
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

	public static class VariableNamesContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ConfigParser.LPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConfigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConfigParser.COMMA, i);
		}
		public VariableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterVariableNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitVariableNames(this);
		}
	}

	public final VariableNamesContext variableNames() throws RecognitionException {
		VariableNamesContext _localctx = new VariableNamesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(LPAREN);
			setState(386);
			identifier();
			setState(389); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(387);
				match(COMMA);
				setState(388);
				identifier();
				}
				}
				setState(391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(393);
			rparen();
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

	public static class MultipleAssignmentStatementContext extends ParserRuleContext {
		public VariableNamesContext variableNames() {
			return getRuleContext(VariableNamesContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ConfigParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultipleAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterMultipleAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitMultipleAssignmentStatement(this);
		}
	}

	public final MultipleAssignmentStatementContext multipleAssignmentStatement() throws RecognitionException {
		MultipleAssignmentStatementContext _localctx = new MultipleAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_multipleAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			variableNames();
			setState(396);
			nls();
			setState(397);
			match(ASSIGN);
			setState(398);
			nls();
			setState(399);
			expression(0);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ConfigParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(ConfigParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(ConfigParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ConfigParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ConfigParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(ConfigParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(ConfigParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(ConfigParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(ConfigParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(ConfigParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(ConfigParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(ConfigParser.MOD_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(ConfigParser.POWER_ASSIGN, 0); }
		public TerminalNode ELVIS_ASSIGN() { return getToken(ConfigParser.ELVIS_ASSIGN, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			((AssignmentStatementContext)_localctx).left = expression(0);
			setState(402);
			nls();
			setState(403);
			((AssignmentStatementContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (ASSIGN - 51)) | (1L << (ADD_ASSIGN - 51)) | (1L << (SUB_ASSIGN - 51)) | (1L << (MUL_ASSIGN - 51)) | (1L << (DIV_ASSIGN - 51)) | (1L << (AND_ASSIGN - 51)) | (1L << (OR_ASSIGN - 51)) | (1L << (XOR_ASSIGN - 51)) | (1L << (MOD_ASSIGN - 51)) | (1L << (LSHIFT_ASSIGN - 51)) | (1L << (RSHIFT_ASSIGN - 51)) | (1L << (URSHIFT_ASSIGN - 51)) | (1L << (ELVIS_ASSIGN - 51)) | (1L << (POWER_ASSIGN - 51)))) != 0)) ) {
				((AssignmentStatementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(404);
			nls();
			setState(405);
			((AssignmentStatementContext)_localctx).right = expression(0);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			((ExpressionStatementContext)_localctx).expression = expression(0);
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(408);
				if (!( isValidDirective(((ExpressionStatementContext)_localctx).expression) )) throw new FailedPredicateException(this, " isValidDirective($expression.ctx) ");
				setState(409);
				argumentList();
				}
				break;
			case 2:
				{
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryNotExprAltContext extends ExpressionContext {
		public Token op;
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BITNOT() { return getToken(ConfigParser.BITNOT, 0); }
		public TerminalNode NOT() { return getToken(ConfigParser.NOT, 0); }
		public UnaryNotExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterUnaryNotExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitUnaryNotExprAlt(this);
		}
	}
	public static class ShiftExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token dlOp;
		public Token tgOp;
		public Token dgOp;
		public Token riOp;
		public Token reOp;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(ConfigParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ConfigParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ConfigParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ConfigParser.GT, i);
		}
		public TerminalNode RANGE_INCLUSIVE() { return getToken(ConfigParser.RANGE_INCLUSIVE, 0); }
		public TerminalNode RANGE_EXCLUSIVE_RIGHT() { return getToken(ConfigParser.RANGE_EXCLUSIVE_RIGHT, 0); }
		public ShiftExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterShiftExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitShiftExprAlt(this);
		}
	}
	public static class BitwiseOrExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITOR() { return getToken(ConfigParser.BITOR, 0); }
		public BitwiseOrExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterBitwiseOrExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitBitwiseOrExprAlt(this);
		}
	}
	public static class MultDivExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ConfigParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ConfigParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ConfigParser.MOD, 0); }
		public MultDivExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterMultDivExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitMultDivExprAlt(this);
		}
	}
	public static class AddSubExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ConfigParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ConfigParser.SUB, 0); }
		public AddSubExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterAddSubExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitAddSubExprAlt(this);
		}
	}
	public static class ExclusiveOrExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode XOR() { return getToken(ConfigParser.XOR, 0); }
		public ExclusiveOrExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterExclusiveOrExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitExclusiveOrExprAlt(this);
		}
	}
	public static class RegexExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode REGEX_FIND() { return getToken(ConfigParser.REGEX_FIND, 0); }
		public TerminalNode REGEX_MATCH() { return getToken(ConfigParser.REGEX_MATCH, 0); }
		public RegexExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterRegexExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitRegexExprAlt(this);
		}
	}
	public static class ConditionalExprAltContext extends ExpressionContext {
		public ExpressionContext condition;
		public ExpressionContext tb;
		public ExpressionContext fb;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(ConfigParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(ConfigParser.COLON, 0); }
		public TerminalNode ELVIS() { return getToken(ConfigParser.ELVIS, 0); }
		public ConditionalExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterConditionalExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitConditionalExprAlt(this);
		}
	}
	public static class PowerExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(ConfigParser.POWER, 0); }
		public PowerExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterPowerExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitPowerExprAlt(this);
		}
	}
	public static class RelationalExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(ConfigParser.LE, 0); }
		public TerminalNode GE() { return getToken(ConfigParser.GE, 0); }
		public TerminalNode GT() { return getToken(ConfigParser.GT, 0); }
		public TerminalNode LT() { return getToken(ConfigParser.LT, 0); }
		public TerminalNode IN() { return getToken(ConfigParser.IN, 0); }
		public TerminalNode NOT_IN() { return getToken(ConfigParser.NOT_IN, 0); }
		public RelationalExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterRelationalExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitRelationalExprAlt(this);
		}
	}
	public static class LogicalAndExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ConfigParser.AND, 0); }
		public LogicalAndExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterLogicalAndExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitLogicalAndExprAlt(this);
		}
	}
	public static class BitwiseAndExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITAND() { return getToken(ConfigParser.BITAND, 0); }
		public BitwiseAndExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterBitwiseAndExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitBitwiseAndExprAlt(this);
		}
	}
	public static class UnaryAddExprAltContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ConfigParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ConfigParser.SUB, 0); }
		public UnaryAddExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterUnaryAddExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitUnaryAddExprAlt(this);
		}
	}
	public static class RelationalCastExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(ConfigParser.AS, 0); }
		public RelationalCastExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterRelationalCastExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitRelationalCastExprAlt(this);
		}
	}
	public static class LogicalOrExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(ConfigParser.OR, 0); }
		public LogicalOrExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterLogicalOrExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitLogicalOrExprAlt(this);
		}
	}
	public static class EqualityExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ConfigParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ConfigParser.NOTEQUAL, 0); }
		public TerminalNode SPACESHIP() { return getToken(ConfigParser.SPACESHIP, 0); }
		public EqualityExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterEqualityExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitEqualityExprAlt(this);
		}
	}
	public static class PathExprAltContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<PathElementContext> pathElement() {
			return getRuleContexts(PathElementContext.class);
		}
		public PathElementContext pathElement(int i) {
			return getRuleContext(PathElementContext.class,i);
		}
		public PathExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterPathExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitPathExprAlt(this);
		}
	}
	public static class RelationalTypeExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(ConfigParser.INSTANCEOF, 0); }
		public TerminalNode NOT_INSTANCEOF() { return getToken(ConfigParser.NOT_INSTANCEOF, 0); }
		public RelationalTypeExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterRelationalTypeExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitRelationalTypeExprAlt(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
			case GStringBegin:
			case TdqGStringBegin:
			case IN:
			case BuiltInPrimitiveType:
			case NEW:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case LPAREN:
			case LBRACE:
			case LBRACK:
			case CapitalizedIdentifier:
			case Identifier:
				{
				_localctx = new PathExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(414);
				primary();
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						pathElement();
						}
						} 
					}
					setState(420);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
			case NOT:
			case BITNOT:
				{
				_localctx = new UnaryNotExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(421);
				((UnaryNotExprAltContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==BITNOT) ) {
					((UnaryNotExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(422);
				nls();
				setState(423);
				expression(17);
				}
				break;
			case ADD:
			case SUB:
				{
				_localctx = new UnaryAddExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(425);
				((UnaryAddExprAltContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaryAddExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(426);
				expression(15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(540);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((PowerExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(429);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(430);
						((PowerExprAltContext)_localctx).op = match(POWER);
						setState(431);
						nls();
						setState(432);
						((PowerExprAltContext)_localctx).right = expression(17);
						}
						break;
					case 2:
						{
						_localctx = new MultDivExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((MultDivExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(434);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(435);
						nls();
						setState(436);
						((MultDivExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MUL - 66)) | (1L << (DIV - 66)) | (1L << (MOD - 66)))) != 0)) ) {
							((MultDivExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(437);
						nls();
						setState(438);
						((MultDivExprAltContext)_localctx).right = expression(15);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((AddSubExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(440);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(441);
						((AddSubExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(442);
						nls();
						setState(443);
						((AddSubExprAltContext)_localctx).right = expression(14);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((ShiftExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(445);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(446);
						nls();
						setState(460);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case GT:
						case LT:
							{
							setState(454);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
							case 1:
								{
								setState(447);
								((ShiftExprAltContext)_localctx).dlOp = match(LT);
								setState(448);
								match(LT);
								}
								break;
							case 2:
								{
								setState(449);
								((ShiftExprAltContext)_localctx).tgOp = match(GT);
								setState(450);
								match(GT);
								setState(451);
								match(GT);
								}
								break;
							case 3:
								{
								setState(452);
								((ShiftExprAltContext)_localctx).dgOp = match(GT);
								setState(453);
								match(GT);
								}
								break;
							}
							}
							break;
						case RANGE_INCLUSIVE:
						case RANGE_EXCLUSIVE_RIGHT:
							{
							setState(458);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case RANGE_INCLUSIVE:
								{
								setState(456);
								((ShiftExprAltContext)_localctx).riOp = match(RANGE_INCLUSIVE);
								}
								break;
							case RANGE_EXCLUSIVE_RIGHT:
								{
								setState(457);
								((ShiftExprAltContext)_localctx).reOp = match(RANGE_EXCLUSIVE_RIGHT);
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(462);
						nls();
						setState(463);
						((ShiftExprAltContext)_localctx).right = expression(13);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(465);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(466);
						nls();
						setState(467);
						((RelationalExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NOT_IN) | (1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((RelationalExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(468);
						nls();
						setState(469);
						((RelationalExprAltContext)_localctx).right = expression(10);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((EqualityExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(471);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(472);
						nls();
						setState(473);
						((EqualityExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACESHIP) | (1L << EQUAL) | (1L << NOTEQUAL))) != 0)) ) {
							((EqualityExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(474);
						nls();
						setState(475);
						((EqualityExprAltContext)_localctx).right = expression(9);
						}
						break;
					case 7:
						{
						_localctx = new RegexExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((RegexExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(477);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(478);
						nls();
						setState(479);
						((RegexExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==REGEX_FIND || _la==REGEX_MATCH) ) {
							((RegexExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(480);
						nls();
						setState(481);
						((RegexExprAltContext)_localctx).right = expression(8);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseAndExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseAndExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(483);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(484);
						nls();
						setState(485);
						((BitwiseAndExprAltContext)_localctx).op = match(BITAND);
						setState(486);
						nls();
						setState(487);
						((BitwiseAndExprAltContext)_localctx).right = expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExclusiveOrExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((ExclusiveOrExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(489);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(490);
						nls();
						setState(491);
						((ExclusiveOrExprAltContext)_localctx).op = match(XOR);
						setState(492);
						nls();
						setState(493);
						((ExclusiveOrExprAltContext)_localctx).right = expression(6);
						}
						break;
					case 10:
						{
						_localctx = new BitwiseOrExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseOrExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(495);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(496);
						nls();
						setState(497);
						((BitwiseOrExprAltContext)_localctx).op = match(BITOR);
						setState(498);
						nls();
						setState(499);
						((BitwiseOrExprAltContext)_localctx).right = expression(5);
						}
						break;
					case 11:
						{
						_localctx = new LogicalAndExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalAndExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(501);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(502);
						nls();
						setState(503);
						((LogicalAndExprAltContext)_localctx).op = match(AND);
						setState(504);
						nls();
						setState(505);
						((LogicalAndExprAltContext)_localctx).right = expression(4);
						}
						break;
					case 12:
						{
						_localctx = new LogicalOrExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalOrExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(507);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(508);
						nls();
						setState(509);
						((LogicalOrExprAltContext)_localctx).op = match(OR);
						setState(510);
						nls();
						setState(511);
						((LogicalOrExprAltContext)_localctx).right = expression(3);
						}
						break;
					case 13:
						{
						_localctx = new ConditionalExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExprAltContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(513);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(514);
						nls();
						setState(524);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case QUESTION:
							{
							setState(515);
							match(QUESTION);
							setState(516);
							nls();
							setState(517);
							((ConditionalExprAltContext)_localctx).tb = expression(0);
							setState(518);
							nls();
							setState(519);
							match(COLON);
							setState(520);
							nls();
							}
							break;
						case ELVIS:
							{
							setState(522);
							match(ELVIS);
							setState(523);
							nls();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(526);
						((ConditionalExprAltContext)_localctx).fb = expression(1);
						}
						break;
					case 14:
						{
						_localctx = new RelationalCastExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalCastExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(528);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(529);
						nls();
						setState(530);
						((RelationalCastExprAltContext)_localctx).op = match(AS);
						setState(531);
						nls();
						setState(532);
						type();
						}
						break;
					case 15:
						{
						_localctx = new RelationalTypeExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalTypeExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(534);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(535);
						nls();
						setState(536);
						((RelationalTypeExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INSTANCEOF || _la==NOT_INSTANCEOF) ) {
							((RelationalTypeExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(537);
						nls();
						setState(538);
						type();
						}
						break;
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MapPrmrAltContext extends PrimaryContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public MapPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterMapPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitMapPrmrAlt(this);
		}
	}
	public static class GstringPrmrAltContext extends PrimaryContext {
		public GstringContext gstring() {
			return getRuleContext(GstringContext.class,0);
		}
		public GstringPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterGstringPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitGstringPrmrAlt(this);
		}
	}
	public static class ListPrmrAltContext extends PrimaryContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterListPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitListPrmrAlt(this);
		}
	}
	public static class NewPrmrAltContext extends PrimaryContext {
		public TerminalNode NEW() { return getToken(ConfigParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterNewPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitNewPrmrAlt(this);
		}
	}
	public static class ClosurePrmrAltContext extends PrimaryContext {
		public ClosureContext closure() {
			return getRuleContext(ClosureContext.class,0);
		}
		public ClosurePrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterClosurePrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitClosurePrmrAlt(this);
		}
	}
	public static class LiteralPrmrAltContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterLiteralPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitLiteralPrmrAlt(this);
		}
	}
	public static class BuiltInTypePrmrAltContext extends PrimaryContext {
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public BuiltInTypePrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterBuiltInTypePrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitBuiltInTypePrmrAlt(this);
		}
	}
	public static class IdentifierPrmrAltContext extends PrimaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterIdentifierPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitIdentifierPrmrAlt(this);
		}
	}
	public static class ParenPrmrAltContext extends PrimaryContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ParenPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterParenPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitParenPrmrAlt(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary);
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new IdentifierPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				identifier();
				}
				break;
			case 2:
				_localctx = new LiteralPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				literal();
				}
				break;
			case 3:
				_localctx = new GstringPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				gstring();
				}
				break;
			case 4:
				_localctx = new NewPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(548);
				match(NEW);
				setState(549);
				creator();
				}
				break;
			case 5:
				_localctx = new ParenPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(550);
				parExpression();
				}
				break;
			case 6:
				_localctx = new ClosurePrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(551);
				closure();
				}
				break;
			case 7:
				_localctx = new ListPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(552);
				list();
				}
				break;
			case 8:
				_localctx = new MapPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(553);
				map();
				}
				break;
			case 9:
				_localctx = new BuiltInTypePrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(554);
				builtInType();
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

	public static class PathElementContext extends ParserRuleContext {
		public PathElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathElement; }
	 
		public PathElementContext() { }
		public void copyFrom(PathElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClosureWithLabelsPathExprAltContext extends PathElementContext {
		public ClosureWithLabelsContext closureWithLabels() {
			return getRuleContext(ClosureWithLabelsContext.class,0);
		}
		public ClosureWithLabelsPathExprAltContext(PathElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterClosureWithLabelsPathExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitClosureWithLabelsPathExprAlt(this);
		}
	}
	public static class PropertyPathExprAltContext extends PathElementContext {
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public NamedPropertyContext namedProperty() {
			return getRuleContext(NamedPropertyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ConfigParser.DOT, 0); }
		public TerminalNode SPREAD_DOT() { return getToken(ConfigParser.SPREAD_DOT, 0); }
		public TerminalNode SAFE_DOT() { return getToken(ConfigParser.SAFE_DOT, 0); }
		public PropertyPathExprAltContext(PathElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterPropertyPathExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitPropertyPathExprAlt(this);
		}
	}
	public static class IndexPathExprAltContext extends PathElementContext {
		public IndexPropertyArgsContext indexPropertyArgs() {
			return getRuleContext(IndexPropertyArgsContext.class,0);
		}
		public IndexPathExprAltContext(PathElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterIndexPathExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitIndexPathExprAlt(this);
		}
	}
	public static class ClosurePathExprAltContext extends PathElementContext {
		public ClosureContext closure() {
			return getRuleContext(ClosureContext.class,0);
		}
		public ClosurePathExprAltContext(PathElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterClosurePathExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitClosurePathExprAlt(this);
		}
	}
	public static class ArgumentsPathExprAltContext extends PathElementContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsPathExprAltContext(PathElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterArgumentsPathExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitArgumentsPathExprAlt(this);
		}
	}

	public final PathElementContext pathElement() throws RecognitionException {
		PathElementContext _localctx = new PathElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pathElement);
		int _la;
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new PropertyPathExprAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				nls();
				setState(558);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPREAD_DOT) | (1L << SAFE_DOT) | (1L << DOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(559);
				namedProperty();
				}
				break;
			case 2:
				_localctx = new ClosurePathExprAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				closure();
				}
				break;
			case 3:
				_localctx = new ClosureWithLabelsPathExprAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				closureWithLabels();
				}
				break;
			case 4:
				_localctx = new ArgumentsPathExprAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(563);
				arguments();
				}
				break;
			case 5:
				_localctx = new IndexPathExprAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(564);
				indexPropertyArgs();
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

	public static class NamedPropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public NamedPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterNamedProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitNamedProperty(this);
		}
	}

	public final NamedPropertyContext namedProperty() throws RecognitionException {
		NamedPropertyContext _localctx = new NamedPropertyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_namedProperty);
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				keywords();
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

	public static class IndexPropertyArgsContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ConfigParser.LBRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ConfigParser.RBRACK, 0); }
		public IndexPropertyArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexPropertyArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterIndexPropertyArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitIndexPropertyArgs(this);
		}
	}

	public final IndexPropertyArgsContext indexPropertyArgs() throws RecognitionException {
		IndexPropertyArgsContext _localctx = new IndexPropertyArgsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_indexPropertyArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(LBRACK);
			setState(573);
			expressionList();
			setState(574);
			match(RBRACK);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ConfigParser.Identifier, 0); }
		public TerminalNode CapitalizedIdentifier() { return getToken(ConfigParser.CapitalizedIdentifier, 0); }
		public TerminalNode IN() { return getToken(ConfigParser.IN, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==CapitalizedIdentifier || _la==Identifier) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralAltContext extends LiteralContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterStringLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitStringLiteralAlt(this);
		}
	}
	public static class IntegerLiteralAltContext extends LiteralContext {
		public TerminalNode IntegerLiteral() { return getToken(ConfigParser.IntegerLiteral, 0); }
		public IntegerLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterIntegerLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitIntegerLiteralAlt(this);
		}
	}
	public static class FloatingPointLiteralAltContext extends LiteralContext {
		public TerminalNode FloatingPointLiteral() { return getToken(ConfigParser.FloatingPointLiteral, 0); }
		public FloatingPointLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterFloatingPointLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitFloatingPointLiteralAlt(this);
		}
	}
	public static class NullLiteralAltContext extends LiteralContext {
		public TerminalNode NullLiteral() { return getToken(ConfigParser.NullLiteral, 0); }
		public NullLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterNullLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitNullLiteralAlt(this);
		}
	}
	public static class BooleanLiteralAltContext extends LiteralContext {
		public TerminalNode BooleanLiteral() { return getToken(ConfigParser.BooleanLiteral, 0); }
		public BooleanLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterBooleanLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitBooleanLiteralAlt(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal);
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new IntegerLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				_localctx = new FloatingPointLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(FloatingPointLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				stringLiteral();
				}
				break;
			case BooleanLiteral:
				_localctx = new BooleanLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(581);
				match(BooleanLiteral);
				}
				break;
			case NullLiteral:
				_localctx = new NullLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(582);
				match(NullLiteral);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(ConfigParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(StringLiteral);
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

	public static class GstringContext extends ParserRuleContext {
		public TerminalNode GStringBegin() { return getToken(ConfigParser.GStringBegin, 0); }
		public TerminalNode GStringEnd() { return getToken(ConfigParser.GStringEnd, 0); }
		public List<GstringDqPartContext> gstringDqPart() {
			return getRuleContexts(GstringDqPartContext.class);
		}
		public GstringDqPartContext gstringDqPart(int i) {
			return getRuleContext(GstringDqPartContext.class,i);
		}
		public TerminalNode TdqGStringBegin() { return getToken(ConfigParser.TdqGStringBegin, 0); }
		public TerminalNode TdqGStringEnd() { return getToken(ConfigParser.TdqGStringEnd, 0); }
		public List<GstringTdqPartContext> gstringTdqPart() {
			return getRuleContexts(GstringTdqPartContext.class);
		}
		public GstringTdqPartContext gstringTdqPart(int i) {
			return getRuleContext(GstringTdqPartContext.class,i);
		}
		public GstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterGstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitGstring(this);
		}
	}

	public final GstringContext gstring() throws RecognitionException {
		GstringContext _localctx = new GstringContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_gstring);
		int _la;
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GStringBegin:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(GStringBegin);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GStringPath) | (1L << GStringText) | (1L << GStringExprStart))) != 0)) {
					{
					{
					setState(588);
					gstringDqPart();
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				match(GStringEnd);
				}
				break;
			case TdqGStringBegin:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(TdqGStringBegin);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TdqGStringPath) | (1L << TdqGStringText) | (1L << TdqGStringExprStart))) != 0)) {
					{
					{
					setState(596);
					gstringTdqPart();
					}
					}
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(602);
				match(TdqGStringEnd);
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

	public static class GstringDqPartContext extends ParserRuleContext {
		public GstringDqPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstringDqPart; }
	 
		public GstringDqPartContext() { }
		public void copyFrom(GstringDqPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GstringDqExprAltContext extends GstringDqPartContext {
		public TerminalNode GStringExprStart() { return getToken(ConfigParser.GStringExprStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ConfigParser.RBRACE, 0); }
		public GstringDqExprAltContext(GstringDqPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterGstringDqExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitGstringDqExprAlt(this);
		}
	}
	public static class GstringDqTextAltContext extends GstringDqPartContext {
		public TerminalNode GStringText() { return getToken(ConfigParser.GStringText, 0); }
		public GstringDqTextAltContext(GstringDqPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterGstringDqTextAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitGstringDqTextAlt(this);
		}
	}
	public static class GstringDqPathAltContext extends GstringDqPartContext {
		public TerminalNode GStringPath() { return getToken(ConfigParser.GStringPath, 0); }
		public GstringDqPathAltContext(GstringDqPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterGstringDqPathAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitGstringDqPathAlt(this);
		}
	}

	public final GstringDqPartContext gstringDqPart() throws RecognitionException {
		GstringDqPartContext _localctx = new GstringDqPartContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_gstringDqPart);
		try {
			setState(611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GStringText:
				_localctx = new GstringDqTextAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				match(GStringText);
				}
				break;
			case GStringPath:
				_localctx = new GstringDqPathAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				match(GStringPath);
				}
				break;
			case GStringExprStart:
				_localctx = new GstringDqExprAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
				match(GStringExprStart);
				setState(608);
				expression(0);
				setState(609);
				match(RBRACE);
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

	public static class GstringTdqPartContext extends ParserRuleContext {
		public GstringTdqPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstringTdqPart; }
	 
		public GstringTdqPartContext() { }
		public void copyFrom(GstringTdqPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GstringTdqPathAltContext extends GstringTdqPartContext {
		public TerminalNode TdqGStringPath() { return getToken(ConfigParser.TdqGStringPath, 0); }
		public GstringTdqPathAltContext(GstringTdqPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterGstringTdqPathAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitGstringTdqPathAlt(this);
		}
	}
	public static class GstringTdqTextAltContext extends GstringTdqPartContext {
		public TerminalNode TdqGStringText() { return getToken(ConfigParser.TdqGStringText, 0); }
		public GstringTdqTextAltContext(GstringTdqPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterGstringTdqTextAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitGstringTdqTextAlt(this);
		}
	}
	public static class GstringTdqExprAltContext extends GstringTdqPartContext {
		public TerminalNode TdqGStringExprStart() { return getToken(ConfigParser.TdqGStringExprStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ConfigParser.RBRACE, 0); }
		public GstringTdqExprAltContext(GstringTdqPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterGstringTdqExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitGstringTdqExprAlt(this);
		}
	}

	public final GstringTdqPartContext gstringTdqPart() throws RecognitionException {
		GstringTdqPartContext _localctx = new GstringTdqPartContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_gstringTdqPart);
		try {
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TdqGStringText:
				_localctx = new GstringTdqTextAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				match(TdqGStringText);
				}
				break;
			case TdqGStringPath:
				_localctx = new GstringTdqPathAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(TdqGStringPath);
				}
				break;
			case TdqGStringExprStart:
				_localctx = new GstringTdqExprAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(615);
				match(TdqGStringExprStart);
				setState(616);
				expression(0);
				setState(617);
				match(RBRACE);
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

	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_creator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			createdName();
			setState(622);
			arguments();
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

	public static class CreatedNameContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public QualifiedClassNameContext qualifiedClassName() {
			return getRuleContext(QualifiedClassNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_createdName);
		int _la;
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BuiltInPrimitiveType:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				primitiveType();
				}
				break;
			case AS:
			case DEF:
			case IN:
			case CapitalizedIdentifier:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				qualifiedClassName();
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(626);
					typeArguments();
					}
				}

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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ConfigParser.LPAREN, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(LPAREN);
			setState(632);
			nls();
			setState(633);
			expression(0);
			setState(634);
			nls();
			setState(635);
			rparen();
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

	public static class ClosureContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ConfigParser.LBRACE, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ConfigParser.RBRACE, 0); }
		public TerminalNode ARROW() { return getToken(ConfigParser.ARROW, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ClosureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterClosure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitClosure(this);
		}
	}

	public final ClosureContext closure() throws RecognitionException {
		ClosureContext _localctx = new ClosureContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_closure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(LBRACE);
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(638);
				nls();
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << DEF) | (1L << IN) | (1L << BuiltInPrimitiveType))) != 0) || _la==CapitalizedIdentifier || _la==Identifier) {
					{
					setState(639);
					formalParameterList();
					setState(640);
					nls();
					}
				}

				setState(644);
				match(ARROW);
				}
				break;
			}
			setState(648);
			nls();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << GStringBegin) | (1L << TdqGStringBegin) | (1L << AS) | (1L << DEF) | (1L << IN) | (1L << BuiltInPrimitiveType) | (1L << ASSERT) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << THROW) | (1L << TRY) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SEMI) | (1L << NOT) | (1L << BITNOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (CapitalizedIdentifier - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(649);
				blockStatements();
				}
			}

			setState(652);
			match(RBRACE);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConfigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConfigParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			formalParameter();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(655);
				match(COMMA);
				setState(656);
				nls();
				setState(657);
				formalParameter();
				}
				}
				setState(663);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEF() { return getToken(ConfigParser.DEF, 0); }
		public LegacyTypeContext legacyType() {
			return getRuleContext(LegacyTypeContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ConfigParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(664);
				match(DEF);
				}
				break;
			}
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(667);
				legacyType();
				}
				break;
			}
			setState(670);
			identifier();
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(671);
				nls();
				setState(672);
				match(ASSIGN);
				setState(673);
				nls();
				setState(674);
				expression(0);
				}
				break;
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

	public static class ClosureWithLabelsContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ConfigParser.LBRACE, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public BlockStatementsWithLabelsContext blockStatementsWithLabels() {
			return getRuleContext(BlockStatementsWithLabelsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ConfigParser.RBRACE, 0); }
		public TerminalNode ARROW() { return getToken(ConfigParser.ARROW, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ClosureWithLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureWithLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterClosureWithLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitClosureWithLabels(this);
		}
	}

	public final ClosureWithLabelsContext closureWithLabels() throws RecognitionException {
		ClosureWithLabelsContext _localctx = new ClosureWithLabelsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_closureWithLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(LBRACE);
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(679);
				nls();
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << DEF) | (1L << IN) | (1L << BuiltInPrimitiveType))) != 0) || _la==CapitalizedIdentifier || _la==Identifier) {
					{
					setState(680);
					formalParameterList();
					setState(681);
					nls();
					}
				}

				setState(685);
				match(ARROW);
				}
				break;
			}
			setState(689);
			nls();
			setState(690);
			blockStatementsWithLabels();
			setState(691);
			match(RBRACE);
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

	public static class BlockStatementsWithLabelsContext extends ParserRuleContext {
		public List<StatementOrLabeledContext> statementOrLabeled() {
			return getRuleContexts(StatementOrLabeledContext.class);
		}
		public StatementOrLabeledContext statementOrLabeled(int i) {
			return getRuleContext(StatementOrLabeledContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public BlockStatementsWithLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatementsWithLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterBlockStatementsWithLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitBlockStatementsWithLabels(this);
		}
	}

	public final BlockStatementsWithLabelsContext blockStatementsWithLabels() throws RecognitionException {
		BlockStatementsWithLabelsContext _localctx = new BlockStatementsWithLabelsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_blockStatementsWithLabels);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			statementOrLabeled();
			setState(699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(694);
					sep();
					setState(695);
					statementOrLabeled();
					}
					} 
				}
				setState(701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI || _la==NL) {
				{
				setState(702);
				sep();
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

	public static class StatementOrLabeledContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ConfigParser.COLON, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public StatementOrLabeledContext statementOrLabeled() {
			return getRuleContext(StatementOrLabeledContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementOrLabeledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementOrLabeled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterStatementOrLabeled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitStatementOrLabeled(this);
		}
	}

	public final StatementOrLabeledContext statementOrLabeled() throws RecognitionException {
		StatementOrLabeledContext _localctx = new StatementOrLabeledContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_statementOrLabeled);
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				identifier();
				setState(706);
				match(COLON);
				setState(707);
				nls();
				setState(708);
				statementOrLabeled();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				statement();
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ConfigParser.LBRACK, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(ConfigParser.RBRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ConfigParser.COMMA, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(LBRACK);
			setState(714);
			nls();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << GStringBegin) | (1L << TdqGStringBegin) | (1L << IN) | (1L << BuiltInPrimitiveType) | (1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << BITNOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (CapitalizedIdentifier - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(715);
				expressionList();
				}
			}

			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(718);
				match(COMMA);
				}
			}

			setState(721);
			nls();
			setState(722);
			match(RBRACK);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConfigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConfigParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			expression(0);
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(725);
					nls();
					setState(726);
					match(COMMA);
					setState(727);
					nls();
					setState(728);
					expression(0);
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class MapContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ConfigParser.LBRACK, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public MapEntryListContext mapEntryList() {
			return getRuleContext(MapEntryListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ConfigParser.RBRACK, 0); }
		public TerminalNode COMMA() { return getToken(ConfigParser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(ConfigParser.COLON, 0); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitMap(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_map);
		int _la;
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(LBRACK);
				setState(736);
				nls();
				setState(737);
				mapEntryList();
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(738);
					match(COMMA);
					}
				}

				setState(741);
				nls();
				setState(742);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				match(LBRACK);
				setState(745);
				match(COLON);
				setState(746);
				match(RBRACK);
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

	public static class MapEntryListContext extends ParserRuleContext {
		public List<MapEntryContext> mapEntry() {
			return getRuleContexts(MapEntryContext.class);
		}
		public MapEntryContext mapEntry(int i) {
			return getRuleContext(MapEntryContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConfigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConfigParser.COMMA, i);
		}
		public MapEntryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterMapEntryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitMapEntryList(this);
		}
	}

	public final MapEntryListContext mapEntryList() throws RecognitionException {
		MapEntryListContext _localctx = new MapEntryListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_mapEntryList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			mapEntry();
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(750);
					nls();
					setState(751);
					match(COMMA);
					setState(752);
					nls();
					setState(753);
					mapEntry();
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class MapEntryContext extends ParserRuleContext {
		public MapEntryLabelContext mapEntryLabel() {
			return getRuleContext(MapEntryLabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ConfigParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MapEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterMapEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitMapEntry(this);
		}
	}

	public final MapEntryContext mapEntry() throws RecognitionException {
		MapEntryContext _localctx = new MapEntryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_mapEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			mapEntryLabel();
			setState(761);
			match(COLON);
			setState(762);
			expression(0);
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

	public static class MapEntryLabelContext extends ParserRuleContext {
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MapEntryLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntryLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterMapEntryLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitMapEntryLabel(this);
		}
	}

	public final MapEntryLabelContext mapEntryLabel() throws RecognitionException {
		MapEntryLabelContext _localctx = new MapEntryLabelContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_mapEntryLabel);
		try {
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				keywords();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				primary();
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

	public static class BuiltInTypeContext extends ParserRuleContext {
		public TerminalNode BuiltInPrimitiveType() { return getToken(ConfigParser.BuiltInPrimitiveType, 0); }
		public BuiltInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterBuiltInType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitBuiltInType(this);
		}
	}

	public final BuiltInTypeContext builtInType() throws RecognitionException {
		BuiltInTypeContext _localctx = new BuiltInTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_builtInType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(BuiltInPrimitiveType);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ConfigParser.LPAREN, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ConfigParser.COMMA, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(LPAREN);
			setState(771);
			nls();
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteral) | (1L << GStringBegin) | (1L << TdqGStringBegin) | (1L << AS) | (1L << DEF) | (1L << IN) | (1L << BuiltInPrimitiveType) | (1L << INSTANCEOF) | (1L << NEW) | (1L << RETURN) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOT) | (1L << BITNOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (CapitalizedIdentifier - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(772);
				argumentList();
				}
			}

			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(775);
				match(COMMA);
				}
			}

			setState(778);
			nls();
			setState(779);
			rparen();
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentListElementContext> argumentListElement() {
			return getRuleContexts(ArgumentListElementContext.class);
		}
		public ArgumentListElementContext argumentListElement(int i) {
			return getRuleContext(ArgumentListElementContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConfigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConfigParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_argumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			argumentListElement();
			setState(789);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(782);
					nls();
					setState(783);
					match(COMMA);
					setState(784);
					nls();
					setState(785);
					argumentListElement();
					}
					} 
				}
				setState(791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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

	public static class ArgumentListElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgContext namedArg() {
			return getRuleContext(NamedArgContext.class,0);
		}
		public ArgumentListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterArgumentListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitArgumentListElement(this);
		}
	}

	public final ArgumentListElementContext argumentListElement() throws RecognitionException {
		ArgumentListElementContext _localctx = new ArgumentListElementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_argumentListElement);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				namedArg();
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

	public static class NamedArgContext extends ParserRuleContext {
		public NamedPropertyContext namedProperty() {
			return getRuleContext(NamedPropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ConfigParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterNamedArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitNamedArg(this);
		}
	}

	public final NamedArgContext namedArg() throws RecognitionException {
		NamedArgContext _localctx = new NamedArgContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_namedArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			namedProperty();
			setState(797);
			match(COLON);
			setState(798);
			expression(0);
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public QualifiedClassNameContext qualifiedClassName() {
			return getRuleContext(QualifiedClassNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_type);
		try {
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BuiltInPrimitiveType:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				primitiveType();
				}
				break;
			case AS:
			case DEF:
			case IN:
			case CapitalizedIdentifier:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				qualifiedClassName();
				setState(803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(802);
					typeArguments();
					}
					break;
				}
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BuiltInPrimitiveType() { return getToken(ConfigParser.BuiltInPrimitiveType, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_primitiveType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(BuiltInPrimitiveType);
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

	public static class QualifiedClassNameContext extends ParserRuleContext {
		public QualifiedNameElementsContext qualifiedNameElements() {
			return getRuleContext(QualifiedNameElementsContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public QualifiedClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterQualifiedClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitQualifiedClassName(this);
		}
	}

	public final QualifiedClassNameContext qualifiedClassName() throws RecognitionException {
		QualifiedClassNameContext _localctx = new QualifiedClassNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_qualifiedClassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			qualifiedNameElements();
			setState(810);
			className();
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

	public static class QualifiedNameElementsContext extends ParserRuleContext {
		public List<QualifiedNameElementContext> qualifiedNameElement() {
			return getRuleContexts(QualifiedNameElementContext.class);
		}
		public QualifiedNameElementContext qualifiedNameElement(int i) {
			return getRuleContext(QualifiedNameElementContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ConfigParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ConfigParser.DOT, i);
		}
		public QualifiedNameElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterQualifiedNameElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitQualifiedNameElements(this);
		}
	}

	public final QualifiedNameElementsContext qualifiedNameElements() throws RecognitionException {
		QualifiedNameElementsContext _localctx = new QualifiedNameElementsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_qualifiedNameElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(812);
					qualifiedNameElement();
					setState(813);
					match(DOT);
					}
					} 
				}
				setState(819);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class QualifiedNameElementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(ConfigParser.AS, 0); }
		public TerminalNode DEF() { return getToken(ConfigParser.DEF, 0); }
		public TerminalNode IN() { return getToken(ConfigParser.IN, 0); }
		public QualifiedNameElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterQualifiedNameElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitQualifiedNameElement(this);
		}
	}

	public final QualifiedNameElementContext qualifiedNameElement() throws RecognitionException {
		QualifiedNameElementContext _localctx = new QualifiedNameElementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_qualifiedNameElement);
		try {
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				match(AS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(822);
				match(DEF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(823);
				match(IN);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode CapitalizedIdentifier() { return getToken(ConfigParser.CapitalizedIdentifier, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(CapitalizedIdentifier);
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ConfigParser.LT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(ConfigParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ConfigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConfigParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(LT);
			setState(829);
			type();
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(830);
				match(COMMA);
				setState(831);
				type();
				}
				}
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(837);
			match(GT);
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

	public static class LegacyTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ConfigParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ConfigParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ConfigParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ConfigParser.RBRACK, i);
		}
		public LegacyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legacyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterLegacyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitLegacyType(this);
		}
	}

	public final LegacyTypeContext legacyType() throws RecognitionException {
		LegacyTypeContext _localctx = new LegacyTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_legacyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			type();
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(840);
				match(LBRACK);
				setState(841);
				match(RBRACK);
				}
				}
				setState(846);
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

	public static class KeywordsContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(ConfigParser.AS, 0); }
		public TerminalNode DEF() { return getToken(ConfigParser.DEF, 0); }
		public TerminalNode IN() { return getToken(ConfigParser.IN, 0); }
		public TerminalNode INSTANCEOF() { return getToken(ConfigParser.INSTANCEOF, 0); }
		public TerminalNode RETURN() { return getToken(ConfigParser.RETURN, 0); }
		public TerminalNode NullLiteral() { return getToken(ConfigParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ConfigParser.BooleanLiteral, 0); }
		public TerminalNode BuiltInPrimitiveType() { return getToken(ConfigParser.BuiltInPrimitiveType, 0); }
		public KeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitKeywords(this);
		}
	}

	public final KeywordsContext keywords() throws RecognitionException {
		KeywordsContext _localctx = new KeywordsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << DEF) | (1L << IN) | (1L << BuiltInPrimitiveType) | (1L << INSTANCEOF) | (1L << RETURN) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0)) ) {
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

	public static class RparenContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(ConfigParser.RPAREN, 0); }
		public RparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rparen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterRparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitRparen(this);
		}
	}

	public final RparenContext rparen() throws RecognitionException {
		RparenContext _localctx = new RparenContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_rparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
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

	public static class NlsContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(ConfigParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ConfigParser.NL, i);
		}
		public NlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterNls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitNls(this);
		}
	}

	public final NlsContext nls() throws RecognitionException {
		NlsContext _localctx = new NlsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_nls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(851);
					match(NL);
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class SepContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(ConfigParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ConfigParser.NL, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ConfigParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ConfigParser.SEMI, i);
		}
		public SepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).enterSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigParserListener ) ((ConfigParserListener)listener).exitSep(this);
		}
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_sep);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(858); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(857);
					_la = _input.LA(1);
					if ( !(_la==SEMI || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(860); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		case 25:
			return expressionStatement_sempred((ExpressionStatementContext)_localctx, predIndex);
		case 26:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  isValidDirective(((ExpressionStatementContext)_localctx).expression) ;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		case 14:
			return precpred(_ctx, 11);
		case 15:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u0361\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\7\2\u0092\n\2\f\2\16\2\u0095\13\2\3\2\5\2\u0098\n\2\5\2\u009a\n\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a4\n\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u00b2\n\6\f\6\16\6\u00b5\13\6\3\7\3\7\3\7"+
		"\5\7\u00ba\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c4\n\b\f\b\16\b"+
		"\u00c7\13\b\3\b\5\b\u00ca\n\b\5\b\u00cc\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00d7\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e3"+
		"\n\n\f\n\16\n\u00e6\13\n\3\n\5\n\u00e9\n\n\5\n\u00eb\n\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00f7\n\13\f\13\16\13\u00fa\13"+
		"\13\3\13\5\13\u00fd\n\13\5\13\u00ff\n\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\7\r\u0109\n\r\f\r\16\r\u010c\13\r\3\r\5\r\u010f\n\r\3\16\3\16\3\16"+
		"\5\16\u0114\n\16\3\17\3\17\3\17\3\17\5\17\u011a\n\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0124\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u012f\n\20\3\21\3\21\3\21\5\21\u0134\n\21\3\21\3"+
		"\21\3\21\5\21\u0139\n\21\3\22\3\22\3\22\3\22\7\22\u013f\n\22\f\22\16\22"+
		"\u0142\13\22\3\22\5\22\u0145\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u014d"+
		"\n\23\f\23\16\23\u0150\13\23\3\24\3\24\3\24\5\24\u0155\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u015f\n\25\f\25\16\25\u0162\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u016b\n\26\3\27\3\27\3\27\3\27"+
		"\5\27\u0171\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0179\n\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u0182\n\27\3\30\3\30\3\30\3\30\6\30"+
		"\u0188\n\30\r\30\16\30\u0189\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u019e\n\33\3\34"+
		"\3\34\3\34\7\34\u01a3\n\34\f\34\16\34\u01a6\13\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u01ae\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u01c9\n\34\3\34\3\34\5\34\u01cd\n\34\5\34\u01cf\n\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\5\34\u020f\n\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u021f\n\34\f\34\16"+
		"\34\u0222\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u022e\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0238\n\36\3"+
		"\37\3\37\3\37\5\37\u023d\n\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u024a\n\"\3#\3#\3$\3$\7$\u0250\n$\f$\16$\u0253\13$\3$\3$\3$\7$\u0258"+
		"\n$\f$\16$\u025b\13$\3$\5$\u025e\n$\3%\3%\3%\3%\3%\3%\5%\u0266\n%\3&\3"+
		"&\3&\3&\3&\3&\5&\u026e\n&\3\'\3\'\3\'\3(\3(\3(\5(\u0276\n(\5(\u0278\n"+
		"(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\5*\u0285\n*\3*\3*\5*\u0289\n*\3*\3"+
		"*\5*\u028d\n*\3*\3*\3+\3+\3+\3+\3+\7+\u0296\n+\f+\16+\u0299\13+\3,\5,"+
		"\u029c\n,\3,\5,\u029f\n,\3,\3,\3,\3,\3,\3,\5,\u02a7\n,\3-\3-\3-\3-\3-"+
		"\5-\u02ae\n-\3-\3-\5-\u02b2\n-\3-\3-\3-\3-\3.\3.\3.\3.\7.\u02bc\n.\f."+
		"\16.\u02bf\13.\3.\5.\u02c2\n.\3/\3/\3/\3/\3/\3/\5/\u02ca\n/\3\60\3\60"+
		"\3\60\5\60\u02cf\n\60\3\60\5\60\u02d2\n\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\7\61\u02dd\n\61\f\61\16\61\u02e0\13\61\3\62\3\62\3"+
		"\62\3\62\5\62\u02e6\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02ee\n\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u02f6\n\63\f\63\16\63\u02f9\13\63"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\5\65\u0301\n\65\3\66\3\66\3\67\3\67\3\67"+
		"\5\67\u0308\n\67\3\67\5\67\u030b\n\67\3\67\3\67\3\67\38\38\38\38\38\3"+
		"8\78\u0316\n8\f8\168\u0319\138\39\39\59\u031d\n9\3:\3:\3:\3:\3;\3;\3;"+
		"\5;\u0326\n;\5;\u0328\n;\3<\3<\3=\3=\3=\3>\3>\3>\7>\u0332\n>\f>\16>\u0335"+
		"\13>\3?\3?\3?\3?\5?\u033b\n?\3@\3@\3A\3A\3A\3A\7A\u0343\nA\fA\16A\u0346"+
		"\13A\3A\3A\3B\3B\3B\7B\u034d\nB\fB\16B\u0350\13B\3C\3C\3D\3D\3E\7E\u0357"+
		"\nE\fE\16E\u035a\13E\3F\6F\u035d\nF\rF\16F\u035e\3F\2\3\66G\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\2\16\4\2\65\65J"+
		"V\3\289\3\2BC\4\2DEII\6\2\20\20++\66\67=>\5\2((<<??\3\2%&\4\2\26\26**"+
		"\4\2\"#\64\64\4\2\20\20WX\6\2\16\21\26\26\30\30\36\37\4\2\62\62ZZ\2\u03a5"+
		"\2\u008c\3\2\2\2\4\u00a3\3\2\2\2\6\u00a5\3\2\2\2\b\u00a8\3\2\2\2\n\u00ae"+
		"\3\2\2\2\f\u00b9\3\2\2\2\16\u00bb\3\2\2\2\20\u00d6\3\2\2\2\22\u00d8\3"+
		"\2\2\2\24\u00ee\3\2\2\2\26\u0102\3\2\2\2\30\u0105\3\2\2\2\32\u0113\3\2"+
		"\2\2\34\u0123\3\2\2\2\36\u0125\3\2\2\2 \u0138\3\2\2\2\"\u013a\3\2\2\2"+
		"$\u0146\3\2\2\2&\u0151\3\2\2\2(\u015b\3\2\2\2*\u0163\3\2\2\2,\u0181\3"+
		"\2\2\2.\u0183\3\2\2\2\60\u018d\3\2\2\2\62\u0193\3\2\2\2\64\u0199\3\2\2"+
		"\2\66\u01ad\3\2\2\28\u022d\3\2\2\2:\u0237\3\2\2\2<\u023c\3\2\2\2>\u023e"+
		"\3\2\2\2@\u0242\3\2\2\2B\u0249\3\2\2\2D\u024b\3\2\2\2F\u025d\3\2\2\2H"+
		"\u0265\3\2\2\2J\u026d\3\2\2\2L\u026f\3\2\2\2N\u0277\3\2\2\2P\u0279\3\2"+
		"\2\2R\u027f\3\2\2\2T\u0290\3\2\2\2V\u029b\3\2\2\2X\u02a8\3\2\2\2Z\u02b7"+
		"\3\2\2\2\\\u02c9\3\2\2\2^\u02cb\3\2\2\2`\u02d6\3\2\2\2b\u02ed\3\2\2\2"+
		"d\u02ef\3\2\2\2f\u02fa\3\2\2\2h\u0300\3\2\2\2j\u0302\3\2\2\2l\u0304\3"+
		"\2\2\2n\u030f\3\2\2\2p\u031c\3\2\2\2r\u031e\3\2\2\2t\u0327\3\2\2\2v\u0329"+
		"\3\2\2\2x\u032b\3\2\2\2z\u0333\3\2\2\2|\u033a\3\2\2\2~\u033c\3\2\2\2\u0080"+
		"\u033e\3\2\2\2\u0082\u0349\3\2\2\2\u0084\u0351\3\2\2\2\u0086\u0353\3\2"+
		"\2\2\u0088\u0358\3\2\2\2\u008a\u035c\3\2\2\2\u008c\u0099\5\u0088E\2\u008d"+
		"\u0093\5\4\3\2\u008e\u008f\5\u008aF\2\u008f\u0090\5\4\3\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\5\u008a"+
		"F\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u008d\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\2"+
		"\2\3\u009c\3\3\2\2\2\u009d\u00a4\5\6\4\2\u009e\u00a4\5\b\5\2\u009f\u00a4"+
		"\5\16\b\2\u00a0\u00a4\5\24\13\2\u00a1\u00a4\5\30\r\2\u00a2\u00a4\5\32"+
		"\16\2\u00a3\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3"+
		"\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\5\3\2\2\2"+
		"\u00a5\u00a6\7\33\2\2\u00a6\u00a7\5\66\34\2\u00a7\7\3\2\2\2\u00a8\u00a9"+
		"\5\n\6\2\u00a9\u00aa\5\u0088E\2\u00aa\u00ab\7\65\2\2\u00ab\u00ac\5\u0088"+
		"E\2\u00ac\u00ad\5\66\34\2\u00ad\t\3\2\2\2\u00ae\u00b3\5\f\7\2\u00af\u00b0"+
		"\7\64\2\2\u00b0\u00b2\5\f\7\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\13\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00ba\5@!\2\u00b7\u00ba\5D#\2\u00b8\u00ba\5j\66\2\u00b9"+
		"\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\r\3\2\2\2"+
		"\u00bb\u00bc\5\f\7\2\u00bc\u00bd\5\u0088E\2\u00bd\u00be\7.\2\2\u00be\u00cb"+
		"\5\u0088E\2\u00bf\u00c5\5\20\t\2\u00c0\u00c1\5\u008aF\2\u00c1\u00c2\5"+
		"\20\t\2\u00c2\u00c4\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00ca\5\u008aF\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00ce\7/\2\2\u00ce\17\3\2\2\2\u00cf\u00d7\5\6\4\2\u00d0\u00d7"+
		"\5\b\5\2\u00d1\u00d7\5\16\b\2\u00d2\u00d7\5\24\13\2\u00d3\u00d7\5\22\n"+
		"\2\u00d4\u00d7\5\30\r\2\u00d5\u00d7\5\32\16\2\u00d6\u00cf\3\2\2\2\u00d6"+
		"\u00d0\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\21\3\2\2\2\u00d8\u00d9"+
		"\7X\2\2\u00d9\u00da\7;\2\2\u00da\u00db\5\f\7\2\u00db\u00dc\5\u0088E\2"+
		"\u00dc\u00dd\7.\2\2\u00dd\u00ea\5\u0088E\2\u00de\u00e4\5\b\5\2\u00df\u00e0"+
		"\5\u008aF\2\u00e0\u00e1\5\b\5\2\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2\2"+
		"\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\5\u008aF\2\u00e8\u00e7\3\2\2"+
		"\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00de\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed\23\3\2\2\2\u00ee"+
		"\u00ef\5\f\7\2\u00ef\u00f0\5\u0088E\2\u00f0\u00f1\7.\2\2\u00f1\u00fe\5"+
		"\u0088E\2\u00f2\u00f8\5\26\f\2\u00f3\u00f4\5\u008aF\2\u00f4\u00f5\5\26"+
		"\f\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fd\5\u008aF\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\7/\2\2\u0101\25\3\2\2\2\u0102\u0103\5@!\2\u0103\u0104"+
		"\5B\"\2\u0104\27\3\2\2\2\u0105\u010a\5\f\7\2\u0106\u0107\7\64\2\2\u0107"+
		"\u0109\5\f\7\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010f\7\64\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\31\3\2\2"+
		"\2\u0110\u0114\5\36\20\2\u0111\u0114\5$\23\2\u0112\u0114\5,\27\2\u0113"+
		"\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\33\3\2\2"+
		"\2\u0115\u0124\5\36\20\2\u0116\u0124\5$\23\2\u0117\u0119\7\30\2\2\u0118"+
		"\u011a\5\66\34\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0124\3"+
		"\2\2\2\u011b\u011c\7\31\2\2\u011c\u0124\5\66\34\2\u011d\u0124\5*\26\2"+
		"\u011e\u0124\5,\27\2\u011f\u0124\5\60\31\2\u0120\u0124\5\62\32\2\u0121"+
		"\u0124\5\64\33\2\u0122\u0124\7\62\2\2\u0123\u0115\3\2\2\2\u0123\u0116"+
		"\3\2\2\2\u0123\u0117\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u011d\3\2\2\2\u0123"+
		"\u011e\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0123\u0122\3\2\2\2\u0124\35\3\2\2\2\u0125\u0126\7\25\2\2\u0126\u0127"+
		"\5P)\2\u0127\u0128\5\u0088E\2\u0128\u012e\5 \21\2\u0129\u012a\5\u0088"+
		"E\2\u012a\u012b\7\24\2\2\u012b\u012c\5\u0088E\2\u012c\u012d\5 \21\2\u012d"+
		"\u012f\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012f\3\2\2\2\u012f\37\3\2\2"+
		"\2\u0130\u0131\7.\2\2\u0131\u0133\5\u0088E\2\u0132\u0134\5\"\22\2\u0133"+
		"\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7/"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0139\5\34\17\2\u0138\u0130\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139!\3\2\2\2\u013a\u0140\5\34\17\2\u013b\u013c\5\u008a"+
		"F\2\u013c\u013d\5\34\17\2\u013d\u013f\3\2\2\2\u013e\u013b\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0145\5\u008aF\2\u0144\u0143\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145#\3\2\2\2\u0146\u0147\7\32\2\2\u0147\u0148\5\u0088"+
		"E\2\u0148\u014e\5 \21\2\u0149\u014a\5\u0088E\2\u014a\u014b\5&\24\2\u014b"+
		"\u014d\3\2\2\2\u014c\u0149\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f%\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152"+
		"\7\23\2\2\u0152\u0154\7,\2\2\u0153\u0155\5(\25\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\5@!\2\u0157\u0158\5\u0086"+
		"D\2\u0158\u0159\5\u0088E\2\u0159\u015a\5 \21\2\u015a\'\3\2\2\2\u015b\u0160"+
		"\5x=\2\u015c\u015d\7G\2\2\u015d\u015f\5x=\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161)\3\2\2\2"+
		"\u0162\u0160\3\2\2\2\u0163\u0164\7\22\2\2\u0164\u016a\5\66\34\2\u0165"+
		"\u0166\5\u0088E\2\u0166\u0167\7;\2\2\u0167\u0168\5\u0088E\2\u0168\u0169"+
		"\5\66\34\2\u0169\u016b\3\2\2\2\u016a\u0165\3\2\2\2\u016a\u016b\3\2\2\2"+
		"\u016b+\3\2\2\2\u016c\u0171\7\17\2\2\u016d\u0171\5\u0082B\2\u016e\u016f"+
		"\7\17\2\2\u016f\u0171\5\u0082B\2\u0170\u016c\3\2\2\2\u0170\u016d\3\2\2"+
		"\2\u0170\u016e\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0178\5@!\2\u0173\u0174"+
		"\5\u0088E\2\u0174\u0175\7\65\2\2\u0175\u0176\5\u0088E\2\u0176\u0177\5"+
		"\66\34\2\u0177\u0179\3\2\2\2\u0178\u0173\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u0182\3\2\2\2\u017a\u017b\7\17\2\2\u017b\u017c\5.\30\2\u017c\u017d\5"+
		"\u0088E\2\u017d\u017e\7\65\2\2\u017e\u017f\5\u0088E\2\u017f\u0180\5\66"+
		"\34\2\u0180\u0182\3\2\2\2\u0181\u0170\3\2\2\2\u0181\u017a\3\2\2\2\u0182"+
		"-\3\2\2\2\u0183\u0184\7,\2\2\u0184\u0187\5@!\2\u0185\u0186\7\63\2\2\u0186"+
		"\u0188\5@!\2\u0187\u0185\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2"+
		"\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\5\u0086D\2\u018c"+
		"/\3\2\2\2\u018d\u018e\5.\30\2\u018e\u018f\5\u0088E\2\u018f\u0190\7\65"+
		"\2\2\u0190\u0191\5\u0088E\2\u0191\u0192\5\66\34\2\u0192\61\3\2\2\2\u0193"+
		"\u0194\5\66\34\2\u0194\u0195\5\u0088E\2\u0195\u0196\t\2\2\2\u0196\u0197"+
		"\5\u0088E\2\u0197\u0198\5\66\34\2\u0198\63\3\2\2\2\u0199\u019d\5\66\34"+
		"\2\u019a\u019b\6\33\2\3\u019b\u019e\5n8\2\u019c\u019e\3\2\2\2\u019d\u019a"+
		"\3\2\2\2\u019d\u019c\3\2\2\2\u019e\65\3\2\2\2\u019f\u01a0\b\34\1\2\u01a0"+
		"\u01a4\58\35\2\u01a1\u01a3\5:\36\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2"+
		"\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01ae\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a7\u01a8\t\3\2\2\u01a8\u01a9\5\u0088E\2\u01a9\u01aa"+
		"\5\66\34\23\u01aa\u01ae\3\2\2\2\u01ab\u01ac\t\4\2\2\u01ac\u01ae\5\66\34"+
		"\21\u01ad\u019f\3\2\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"\u0220\3\2\2\2\u01af\u01b0\f\22\2\2\u01b0\u01b1\7\'\2\2\u01b1\u01b2\5"+
		"\u0088E\2\u01b2\u01b3\5\66\34\23\u01b3\u021f\3\2\2\2\u01b4\u01b5\f\20"+
		"\2\2\u01b5\u01b6\5\u0088E\2\u01b6\u01b7\t\5\2\2\u01b7\u01b8\5\u0088E\2"+
		"\u01b8\u01b9\5\66\34\21\u01b9\u021f\3\2\2\2\u01ba\u01bb\f\17\2\2\u01bb"+
		"\u01bc\t\4\2\2\u01bc\u01bd\5\u0088E\2\u01bd\u01be\5\66\34\20\u01be\u021f"+
		"\3\2\2\2\u01bf\u01c0\f\16\2\2\u01c0\u01ce\5\u0088E\2\u01c1\u01c2\7\67"+
		"\2\2\u01c2\u01c9\7\67\2\2\u01c3\u01c4\7\66\2\2\u01c4\u01c5\7\66\2\2\u01c5"+
		"\u01c9\7\66\2\2\u01c6\u01c7\7\66\2\2\u01c7\u01c9\7\66\2\2\u01c8\u01c1"+
		"\3\2\2\2\u01c8\u01c3\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cf\3\2\2\2\u01ca"+
		"\u01cd\7 \2\2\u01cb\u01cd\7!\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2"+
		"\2\u01cd\u01cf\3\2\2\2\u01ce\u01c8\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d1\5\u0088E\2\u01d1\u01d2\5\66\34\17\u01d2\u021f\3\2"+
		"\2\2\u01d3\u01d4\f\13\2\2\u01d4\u01d5\5\u0088E\2\u01d5\u01d6\t\6\2\2\u01d6"+
		"\u01d7\5\u0088E\2\u01d7\u01d8\5\66\34\f\u01d8\u021f\3\2\2\2\u01d9\u01da"+
		"\f\n\2\2\u01da\u01db\5\u0088E\2\u01db\u01dc\t\7\2\2\u01dc\u01dd\5\u0088"+
		"E\2\u01dd\u01de\5\66\34\13\u01de\u021f\3\2\2\2\u01df\u01e0\f\t\2\2\u01e0"+
		"\u01e1\5\u0088E\2\u01e1\u01e2\t\b\2\2\u01e2\u01e3\5\u0088E\2\u01e3\u01e4"+
		"\5\66\34\n\u01e4\u021f\3\2\2\2\u01e5\u01e6\f\b\2\2\u01e6\u01e7\5\u0088"+
		"E\2\u01e7\u01e8\7F\2\2\u01e8\u01e9\5\u0088E\2\u01e9\u01ea\5\66\34\t\u01ea"+
		"\u021f\3\2\2\2\u01eb\u01ec\f\7\2\2\u01ec\u01ed\5\u0088E\2\u01ed\u01ee"+
		"\7H\2\2\u01ee\u01ef\5\u0088E\2\u01ef\u01f0\5\66\34\b\u01f0\u021f\3\2\2"+
		"\2\u01f1\u01f2\f\6\2\2\u01f2\u01f3\5\u0088E\2\u01f3\u01f4\7G\2\2\u01f4"+
		"\u01f5\5\u0088E\2\u01f5\u01f6\5\66\34\7\u01f6\u021f\3\2\2\2\u01f7\u01f8"+
		"\f\5\2\2\u01f8\u01f9\5\u0088E\2\u01f9\u01fa\7@\2\2\u01fa\u01fb\5\u0088"+
		"E\2\u01fb\u01fc\5\66\34\6\u01fc\u021f\3\2\2\2\u01fd\u01fe\f\4\2\2\u01fe"+
		"\u01ff\5\u0088E\2\u01ff\u0200\7A\2\2\u0200\u0201\5\u0088E\2\u0201\u0202"+
		"\5\66\34\5\u0202\u021f\3\2\2\2\u0203\u0204\f\3\2\2\u0204\u020e\5\u0088"+
		"E\2\u0205\u0206\7:\2\2\u0206\u0207\5\u0088E\2\u0207\u0208\5\66\34\2\u0208"+
		"\u0209\5\u0088E\2\u0209\u020a\7;\2\2\u020a\u020b\5\u0088E\2\u020b\u020f"+
		"\3\2\2\2\u020c\u020d\7$\2\2\u020d\u020f\5\u0088E\2\u020e\u0205\3\2\2\2"+
		"\u020e\u020c\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\5\66\34\3\u0211\u021f"+
		"\3\2\2\2\u0212\u0213\f\r\2\2\u0213\u0214\5\u0088E\2\u0214\u0215\7\16\2"+
		"\2\u0215\u0216\5\u0088E\2\u0216\u0217\5t;\2\u0217\u021f\3\2\2\2\u0218"+
		"\u0219\f\f\2\2\u0219\u021a\5\u0088E\2\u021a\u021b\t\t\2\2\u021b\u021c"+
		"\5\u0088E\2\u021c\u021d\5t;\2\u021d\u021f\3\2\2\2\u021e\u01af\3\2\2\2"+
		"\u021e\u01b4\3\2\2\2\u021e\u01ba\3\2\2\2\u021e\u01bf\3\2\2\2\u021e\u01d3"+
		"\3\2\2\2\u021e\u01d9\3\2\2\2\u021e\u01df\3\2\2\2\u021e\u01e5\3\2\2\2\u021e"+
		"\u01eb\3\2\2\2\u021e\u01f1\3\2\2\2\u021e\u01f7\3\2\2\2\u021e\u01fd\3\2"+
		"\2\2\u021e\u0203\3\2\2\2\u021e\u0212\3\2\2\2\u021e\u0218\3\2\2\2\u021f"+
		"\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\67\3\2\2"+
		"\2\u0222\u0220\3\2\2\2\u0223\u022e\5@!\2\u0224\u022e\5B\"\2\u0225\u022e"+
		"\5F$\2\u0226\u0227\7\27\2\2\u0227\u022e\5L\'\2\u0228\u022e\5P)\2\u0229"+
		"\u022e\5R*\2\u022a\u022e\5^\60\2\u022b\u022e\5b\62\2\u022c\u022e\5j\66"+
		"\2\u022d\u0223\3\2\2\2\u022d\u0224\3\2\2\2\u022d\u0225\3\2\2\2\u022d\u0226"+
		"\3\2\2\2\u022d\u0228\3\2\2\2\u022d\u0229\3\2\2\2\u022d\u022a\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022d\u022c\3\2\2\2\u022e9\3\2\2\2\u022f\u0230\5\u0088"+
		"E\2\u0230\u0231\t\n\2\2\u0231\u0232\5<\37\2\u0232\u0238\3\2\2\2\u0233"+
		"\u0238\5R*\2\u0234\u0238\5X-\2\u0235\u0238\5l\67\2\u0236\u0238\5> \2\u0237"+
		"\u022f\3\2\2\2\u0237\u0233\3\2\2\2\u0237\u0234\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0237\u0236\3\2\2\2\u0238;\3\2\2\2\u0239\u023d\5@!\2\u023a\u023d"+
		"\5D#\2\u023b\u023d\5\u0084C\2\u023c\u0239\3\2\2\2\u023c\u023a\3\2\2\2"+
		"\u023c\u023b\3\2\2\2\u023d=\3\2\2\2\u023e\u023f\7\60\2\2\u023f\u0240\5"+
		"`\61\2\u0240\u0241\7\61\2\2\u0241?\3\2\2\2\u0242\u0243\t\13\2\2\u0243"+
		"A\3\2\2\2\u0244\u024a\7\34\2\2\u0245\u024a\7\35\2\2\u0246\u024a\5D#\2"+
		"\u0247\u024a\7\36\2\2\u0248\u024a\7\37\2\2\u0249\u0244\3\2\2\2\u0249\u0245"+
		"\3\2\2\2\u0249\u0246\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2\2\u024a"+
		"C\3\2\2\2\u024b\u024c\7\3\2\2\u024cE\3\2\2\2\u024d\u0251\7\4\2\2\u024e"+
		"\u0250\5H%\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2"+
		"\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u025e"+
		"\7\6\2\2\u0255\u0259\7\5\2\2\u0256\u0258\5J&\2\u0257\u0256\3\2\2\2\u0258"+
		"\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2"+
		"\2\2\u025b\u0259\3\2\2\2\u025c\u025e\7\n\2\2\u025d\u024d\3\2\2\2\u025d"+
		"\u0255\3\2\2\2\u025eG\3\2\2\2\u025f\u0266\7\b\2\2\u0260\u0266\7\7\2\2"+
		"\u0261\u0262\7\t\2\2\u0262\u0263\5\66\34\2\u0263\u0264\7/\2\2\u0264\u0266"+
		"\3\2\2\2\u0265\u025f\3\2\2\2\u0265\u0260\3\2\2\2\u0265\u0261\3\2\2\2\u0266"+
		"I\3\2\2\2\u0267\u026e\7\f\2\2\u0268\u026e\7\13\2\2\u0269\u026a\7\r\2\2"+
		"\u026a\u026b\5\66\34\2\u026b\u026c\7/\2\2\u026c\u026e\3\2\2\2\u026d\u0267"+
		"\3\2\2\2\u026d\u0268\3\2\2\2\u026d\u0269\3\2\2\2\u026eK\3\2\2\2\u026f"+
		"\u0270\5N(\2\u0270\u0271\5l\67\2\u0271M\3\2\2\2\u0272\u0278\5v<\2\u0273"+
		"\u0275\5x=\2\u0274\u0276\5\u0080A\2\u0275\u0274\3\2\2\2\u0275\u0276\3"+
		"\2\2\2\u0276\u0278\3\2\2\2\u0277\u0272\3\2\2\2\u0277\u0273\3\2\2\2\u0278"+
		"O\3\2\2\2\u0279\u027a\7,\2\2\u027a\u027b\5\u0088E\2\u027b\u027c\5\66\34"+
		"\2\u027c\u027d\5\u0088E\2\u027d\u027e\5\u0086D\2\u027eQ\3\2\2\2\u027f"+
		"\u0288\7.\2\2\u0280\u0284\5\u0088E\2\u0281\u0282\5T+\2\u0282\u0283\5\u0088"+
		"E\2\u0283\u0285\3\2\2\2\u0284\u0281\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0287\7)\2\2\u0287\u0289\3\2\2\2\u0288\u0280\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\5\u0088E\2\u028b"+
		"\u028d\5\"\22\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3"+
		"\2\2\2\u028e\u028f\7/\2\2\u028fS\3\2\2\2\u0290\u0297\5V,\2\u0291\u0292"+
		"\7\63\2\2\u0292\u0293\5\u0088E\2\u0293\u0294\5V,\2\u0294\u0296\3\2\2\2"+
		"\u0295\u0291\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298U\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029c\7\17\2\2\u029b"+
		"\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029f\5\u0082"+
		"B\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u02a6\5@!\2\u02a1\u02a2\5\u0088E\2\u02a2\u02a3\7\65\2\2\u02a3\u02a4\5"+
		"\u0088E\2\u02a4\u02a5\5\66\34\2\u02a5\u02a7\3\2\2\2\u02a6\u02a1\3\2\2"+
		"\2\u02a6\u02a7\3\2\2\2\u02a7W\3\2\2\2\u02a8\u02b1\7.\2\2\u02a9\u02ad\5"+
		"\u0088E\2\u02aa\u02ab\5T+\2\u02ab\u02ac\5\u0088E\2\u02ac\u02ae\3\2\2\2"+
		"\u02ad\u02aa\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0"+
		"\7)\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02a9\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b4\5\u0088E\2\u02b4\u02b5\5Z.\2\u02b5\u02b6\7"+
		"/\2\2\u02b6Y\3\2\2\2\u02b7\u02bd\5\\/\2\u02b8\u02b9\5\u008aF\2\u02b9\u02ba"+
		"\5\\/\2\u02ba\u02bc\3\2\2\2\u02bb\u02b8\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd"+
		"\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2"+
		"\2\2\u02c0\u02c2\5\u008aF\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"[\3\2\2\2\u02c3\u02c4\5@!\2\u02c4\u02c5\7;\2\2\u02c5\u02c6\5\u0088E\2"+
		"\u02c6\u02c7\5\\/\2\u02c7\u02ca\3\2\2\2\u02c8\u02ca\5\34\17\2\u02c9\u02c3"+
		"\3\2\2\2\u02c9\u02c8\3\2\2\2\u02ca]\3\2\2\2\u02cb\u02cc\7\60\2\2\u02cc"+
		"\u02ce\5\u0088E\2\u02cd\u02cf\5`\61\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02d2\7\63\2\2\u02d1\u02d0\3\2\2\2"+
		"\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\5\u0088E\2\u02d4"+
		"\u02d5\7\61\2\2\u02d5_\3\2\2\2\u02d6\u02de\5\66\34\2\u02d7\u02d8\5\u0088"+
		"E\2\u02d8\u02d9\7\63\2\2\u02d9\u02da\5\u0088E\2\u02da\u02db\5\66\34\2"+
		"\u02db\u02dd\3\2\2\2\u02dc\u02d7\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc"+
		"\3\2\2\2\u02de\u02df\3\2\2\2\u02dfa\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1"+
		"\u02e2\7\60\2\2\u02e2\u02e3\5\u0088E\2\u02e3\u02e5\5d\63\2\u02e4\u02e6"+
		"\7\63\2\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2\2"+
		"\u02e7\u02e8\5\u0088E\2\u02e8\u02e9\7\61\2\2\u02e9\u02ee\3\2\2\2\u02ea"+
		"\u02eb\7\60\2\2\u02eb\u02ec\7;\2\2\u02ec\u02ee\7\61\2\2\u02ed\u02e1\3"+
		"\2\2\2\u02ed\u02ea\3\2\2\2\u02eec\3\2\2\2\u02ef\u02f7\5f\64\2\u02f0\u02f1"+
		"\5\u0088E\2\u02f1\u02f2\7\63\2\2\u02f2\u02f3\5\u0088E\2\u02f3\u02f4\5"+
		"f\64\2\u02f4\u02f6\3\2\2\2\u02f5\u02f0\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7"+
		"\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8e\3\2\2\2\u02f9\u02f7\3\2\2\2"+
		"\u02fa\u02fb\5h\65\2\u02fb\u02fc\7;\2\2\u02fc\u02fd\5\66\34\2\u02fdg\3"+
		"\2\2\2\u02fe\u0301\5\u0084C\2\u02ff\u0301\58\35\2\u0300\u02fe\3\2\2\2"+
		"\u0300\u02ff\3\2\2\2\u0301i\3\2\2\2\u0302\u0303\7\21\2\2\u0303k\3\2\2"+
		"\2\u0304\u0305\7,\2\2\u0305\u0307\5\u0088E\2\u0306\u0308\5n8\2\u0307\u0306"+
		"\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030a\3\2\2\2\u0309\u030b\7\63\2\2"+
		"\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d"+
		"\5\u0088E\2\u030d\u030e\5\u0086D\2\u030em\3\2\2\2\u030f\u0317\5p9\2\u0310"+
		"\u0311\5\u0088E\2\u0311\u0312\7\63\2\2\u0312\u0313\5\u0088E\2\u0313\u0314"+
		"\5p9\2\u0314\u0316\3\2\2\2\u0315\u0310\3\2\2\2\u0316\u0319\3\2\2\2\u0317"+
		"\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318o\3\2\2\2\u0319\u0317\3\2\2\2"+
		"\u031a\u031d\5\66\34\2\u031b\u031d\5r:\2\u031c\u031a\3\2\2\2\u031c\u031b"+
		"\3\2\2\2\u031dq\3\2\2\2\u031e\u031f\5<\37\2\u031f\u0320\7;\2\2\u0320\u0321"+
		"\5\66\34\2\u0321s\3\2\2\2\u0322\u0328\5v<\2\u0323\u0325\5x=\2\u0324\u0326"+
		"\5\u0080A\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2"+
		"\2\u0327\u0322\3\2\2\2\u0327\u0323\3\2\2\2\u0328u\3\2\2\2\u0329\u032a"+
		"\7\21\2\2\u032aw\3\2\2\2\u032b\u032c\5z>\2\u032c\u032d\5~@\2\u032dy\3"+
		"\2\2\2\u032e\u032f\5|?\2\u032f\u0330\7\64\2\2\u0330\u0332\3\2\2\2\u0331"+
		"\u032e\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2"+
		"\2\2\u0334{\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u033b\5@!\2\u0337\u033b"+
		"\7\16\2\2\u0338\u033b\7\17\2\2\u0339\u033b\7\20\2\2\u033a\u0336\3\2\2"+
		"\2\u033a\u0337\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u0339\3\2\2\2\u033b}"+
		"\3\2\2\2\u033c\u033d\7W\2\2\u033d\177\3\2\2\2\u033e\u033f\7\67\2\2\u033f"+
		"\u0344\5t;\2\u0340\u0341\7\63\2\2\u0341\u0343\5t;\2\u0342\u0340\3\2\2"+
		"\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0347"+
		"\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u0348\7\66\2\2\u0348\u0081\3\2\2\2"+
		"\u0349\u034e\5t;\2\u034a\u034b\7\60\2\2\u034b\u034d\7\61\2\2\u034c\u034a"+
		"\3\2\2\2\u034d\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u0083\3\2\2\2\u0350\u034e\3\2\2\2\u0351\u0352\t\f\2\2\u0352\u0085\3\2"+
		"\2\2\u0353\u0354\7-\2\2\u0354\u0087\3\2\2\2\u0355\u0357\7Z\2\2\u0356\u0355"+
		"\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u0089\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u035d\t\r\2\2\u035c\u035b\3\2"+
		"\2\2\u035d\u035e\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f"+
		"\u008b\3\2\2\2W\u0093\u0097\u0099\u00a3\u00b3\u00b9\u00c5\u00c9\u00cb"+
		"\u00d6\u00e4\u00e8\u00ea\u00f8\u00fc\u00fe\u010a\u010e\u0113\u0119\u0123"+
		"\u012e\u0133\u0138\u0140\u0144\u014e\u0154\u0160\u016a\u0170\u0178\u0181"+
		"\u0189\u019d\u01a4\u01ad\u01c8\u01cc\u01ce\u020e\u021e\u0220\u022d\u0237"+
		"\u023c\u0249\u0251\u0259\u025d\u0265\u026d\u0275\u0277\u0284\u0288\u028c"+
		"\u0297\u029b\u029e\u02a6\u02ad\u02b1\u02bd\u02c1\u02c9\u02ce\u02d1\u02de"+
		"\u02e5\u02ed\u02f7\u0300\u0307\u030a\u0317\u031c\u0325\u0327\u0333\u033a"+
		"\u0344\u034e\u0358\u035e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}