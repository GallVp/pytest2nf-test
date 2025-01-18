// Generated from ScriptLexer.g4 by ANTLR 4.9.2

package nextflow.script.parser;

import java.util.*;
import java.util.regex.Pattern;
import org.antlr.v4.runtime.CharStream;
import org.apache.groovy.parser.antlr4.GroovySyntaxError;

import static nextflow.script.parser.SemanticPredicates.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScriptLexer extends AbstractLexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StringLiteral=1, GStringBegin=2, TdqGStringBegin=3, GStringEnd=4, GStringPath=5, 
		GStringText=6, GStringExprStart=7, TdqGStringEnd=8, TdqGStringPath=9, 
		TdqGStringText=10, TdqGStringExprStart=11, AS=12, DEF=13, IN=14, BuiltInPrimitiveType=15, 
		ASSERT=16, CATCH=17, ELSE=18, ENUM=19, IF=20, IMPORT=21, INSTANCEOF=22, 
		NEW=23, RETURN=24, THROW=25, TRY=26, NEXTFLOW=27, PARAMS=28, INCLUDE=29, 
		FROM=30, PROCESS=31, EXEC=32, INPUT=33, OUTPUT=34, SCRIPT=35, SHELL=36, 
		STUB=37, WHEN=38, WORKFLOW=39, EMIT=40, MAIN=41, PUBLISH=42, TAKE=43, 
		IntegerLiteral=44, FloatingPointLiteral=45, BooleanLiteral=46, NullLiteral=47, 
		RANGE_INCLUSIVE=48, RANGE_EXCLUSIVE_RIGHT=49, SPREAD_DOT=50, SAFE_DOT=51, 
		ELVIS=52, REGEX_FIND=53, REGEX_MATCH=54, POWER=55, SPACESHIP=56, ARROW=57, 
		NOT_INSTANCEOF=58, NOT_IN=59, LPAREN=60, RPAREN=61, LBRACE=62, RBRACE=63, 
		LBRACK=64, RBRACK=65, SEMI=66, COMMA=67, DOT=68, ASSIGN=69, GT=70, LT=71, 
		NOT=72, BITNOT=73, QUESTION=74, COLON=75, EQUAL=76, LE=77, GE=78, NOTEQUAL=79, 
		AND=80, OR=81, ADD=82, SUB=83, MUL=84, DIV=85, BITAND=86, BITOR=87, XOR=88, 
		MOD=89, ADD_ASSIGN=90, SUB_ASSIGN=91, MUL_ASSIGN=92, DIV_ASSIGN=93, AND_ASSIGN=94, 
		OR_ASSIGN=95, XOR_ASSIGN=96, MOD_ASSIGN=97, LSHIFT_ASSIGN=98, RSHIFT_ASSIGN=99, 
		URSHIFT_ASSIGN=100, ELVIS_ASSIGN=101, POWER_ASSIGN=102, CapitalizedIdentifier=103, 
		Identifier=104, WS=105, NL=106, UNEXPECTED_CHAR=107;
	public static final int
		DQ_GSTRING_MODE=1, TDQ_GSTRING_MODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "DQ_GSTRING_MODE", "TDQ_GSTRING_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"StringLiteral", "GStringBegin", "TdqGStringBegin", "GStringEnd", "GStringPath", 
			"GStringText", "GStringExprStart", "TdqGStringEnd", "TdqGStringPath", 
			"TdqGStringText", "TdqGStringExprStart", "DqStringCharacter", "SqStringCharacter", 
			"TdqStringCharacter", "TsqStringCharacter", "SlashyStringCharacter", 
			"AS", "DEF", "IN", "BuiltInPrimitiveType", "ASSERT", "BOOLEAN", "BYTE", 
			"CATCH", "CHAR", "DOUBLE", "ELSE", "ENUM", "FLOAT", "IF", "IMPORT", "INSTANCEOF", 
			"INT", "LONG", "NEW", "RETURN", "SHORT", "THROW", "TRY", "NEXTFLOW", 
			"PARAMS", "INCLUDE", "FROM", "PROCESS", "EXEC", "INPUT", "OUTPUT", "SCRIPT", 
			"SHELL", "STUB", "WHEN", "WORKFLOW", "EMIT", "MAIN", "PUBLISH", "TAKE", 
			"IntegerLiteral", "Zero", "DecimalIntegerLiteral", "HexIntegerLiteral", 
			"OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", 
			"Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", "Underscores", 
			"Underscore", "HexNumeral", "HexDigits", "HexDigit", "HexDigitOrUnderscore", 
			"OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitOrUnderscore", 
			"BinaryNumeral", "BinaryDigits", "BinaryDigit", "BinaryDigitOrUnderscore", 
			"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
			"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
			"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "Dot", 
			"BooleanLiteral", "EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", 
			"DollarEscape", "LineEscape", "LineTerminator", "SlashEscape", "Backslash", 
			"Slash", "Dollar", "DqStringQuotationMark", "SqStringQuotationMark", 
			"TdqStringQuotationMark", "TsqStringQuotationMark", "NullLiteral", "RANGE_INCLUSIVE", 
			"RANGE_EXCLUSIVE_RIGHT", "SPREAD_DOT", "SAFE_DOT", "ELVIS", "REGEX_FIND", 
			"REGEX_MATCH", "POWER", "SPACESHIP", "ARROW", "NOT_INSTANCEOF", "NOT_IN", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "NOT", "BITNOT", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "ADD", "SUB", "MUL", "DIV", "BITAND", 
			"BITOR", "XOR", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ELVIS_ASSIGN", "POWER_ASSIGN", "CapitalizedIdentifier", 
			"Identifier", "IdentifierInGString", "JavaLetter", "JavaLetterInGString", 
			"JavaLetterOrDigit", "JavaLetterOrDigitInGString", "ShCommand", "WS", 
			"NL", "ML_COMMENT", "SL_COMMENT", "SH_COMMENT", "UNEXPECTED_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'as'", "'def'", "'in'", null, "'assert'", "'catch'", "'else'", "'enum'", 
			"'if'", "'import'", "'instanceof'", "'new'", "'return'", "'throw'", "'try'", 
			"'nextflow'", "'params'", "'include'", "'from'", "'process'", "'exec'", 
			"'input'", "'output'", "'script'", "'shell'", "'stub'", "'when'", "'workflow'", 
			"'emit'", "'main'", "'publish'", "'take'", null, null, null, "'null'", 
			"'..'", "'..<'", "'*.'", "'?.'", "'?:'", "'=~'", "'==~'", "'**'", "'<=>'", 
			"'->'", "'!instanceof'", "'!in'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", null, "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
			"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'+'", "'-'", 
			"'*'", null, "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", 
			"'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'?='", "'**='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StringLiteral", "GStringBegin", "TdqGStringBegin", "GStringEnd", 
			"GStringPath", "GStringText", "GStringExprStart", "TdqGStringEnd", "TdqGStringPath", 
			"TdqGStringText", "TdqGStringExprStart", "AS", "DEF", "IN", "BuiltInPrimitiveType", 
			"ASSERT", "CATCH", "ELSE", "ENUM", "IF", "IMPORT", "INSTANCEOF", "NEW", 
			"RETURN", "THROW", "TRY", "NEXTFLOW", "PARAMS", "INCLUDE", "FROM", "PROCESS", 
			"EXEC", "INPUT", "OUTPUT", "SCRIPT", "SHELL", "STUB", "WHEN", "WORKFLOW", 
			"EMIT", "MAIN", "PUBLISH", "TAKE", "IntegerLiteral", "FloatingPointLiteral", 
			"BooleanLiteral", "NullLiteral", "RANGE_INCLUSIVE", "RANGE_EXCLUSIVE_RIGHT", 
			"SPREAD_DOT", "SAFE_DOT", "ELVIS", "REGEX_FIND", "REGEX_MATCH", "POWER", 
			"SPACESHIP", "ARROW", "NOT_INSTANCEOF", "NOT_IN", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
			"GT", "LT", "NOT", "BITNOT", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
			"NOTEQUAL", "AND", "OR", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
			"XOR", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ELVIS_ASSIGN", "POWER_ASSIGN", "CapitalizedIdentifier", 
			"Identifier", "WS", "NL", "UNEXPECTED_CHAR"
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


	    private boolean errorIgnored;
	    private long tokenIndex;
	    private int  lastTokenType;
	    private int  invalidDigitCount;

	    /**
	     * Record the index and token type of the current token while emitting tokens.
	     */
	    @Override
	    public void emit(Token token) {
	        this.tokenIndex++;

	        int tokenType = token.getType();
	        if (Token.DEFAULT_CHANNEL == token.getChannel()) {
	            this.lastTokenType = tokenType;
	        }

	        super.emit(token);
	    }

	    private static final int[] REGEX_CHECK_ARRAY = {
	        // DEC,
	        // INC,
	        // THIS,
	        RBRACE,
	        RBRACK,
	        RPAREN,
	        GStringEnd,
	        TdqGStringEnd,
	        NullLiteral,
	        StringLiteral,
	        BooleanLiteral,
	        IntegerLiteral,
	        FloatingPointLiteral,
	        Identifier, CapitalizedIdentifier
	    };
	    static {
	        Arrays.sort(REGEX_CHECK_ARRAY);
	    }

	    private boolean isRegexAllowed() {
	        return (Arrays.binarySearch(REGEX_CHECK_ARRAY, this.lastTokenType) < 0);
	    }

	    @Override
	    public int getSyntaxErrorSource() {
	        return GroovySyntaxError.LEXER;
	    }

	    @Override
	    public int getErrorLine() {
	        return getLine();
	    }

	    @Override
	    public int getErrorColumn() {
	        return getCharPositionInLine() + 1;
	    }

	    private static boolean isJavaIdentifierStartAndNotIdentifierIgnorable(int codePoint) {
	        return Character.isJavaIdentifierStart(codePoint) && !Character.isIdentifierIgnorable(codePoint);
	    }

	    private static boolean isJavaIdentifierPartAndNotIdentifierIgnorable(int codePoint) {
	        return Character.isJavaIdentifierPart(codePoint) && !Character.isIdentifierIgnorable(codePoint);
	    }



	public ScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ScriptLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 56:
			IntegerLiteral_action((RuleContext)_localctx, actionIndex);
			break;
		case 82:
			FloatingPointLiteral_action((RuleContext)_localctx, actionIndex);
			break;
		case 178:
			SH_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 179:
			UNEXPECTED_CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IntegerLiteral_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 require(errorIgnored, "Number ending with underscores is invalid", -1, true); 
			break;
		case 1:
			 invalidDigitCount++; 
			break;
		case 2:
			 require(errorIgnored, "Invalid octal number", -(invalidDigitCount + 1), true); 
			break;
		}
	}
	private void FloatingPointLiteral_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 require(errorIgnored, "Number ending with underscores is invalid", -1, true); 
			break;
		}
	}
	private void SH_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 require(errorIgnored || 0 == this.tokenIndex, "Shebang comment should appear at the first line", -2, true); 
			break;
		}
	}
	private void UNEXPECTED_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 require(errorIgnored, "Unexpected character: '" + getText().replace("'", "\\'") + "'", -1, false); 
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return StringLiteral_sempred((RuleContext)_localctx, predIndex);
		case 13:
			return TdqStringCharacter_sempred((RuleContext)_localctx, predIndex);
		case 14:
			return TsqStringCharacter_sempred((RuleContext)_localctx, predIndex);
		case 15:
			return SlashyStringCharacter_sempred((RuleContext)_localctx, predIndex);
		case 121:
			return NOT_INSTANCEOF_sempred((RuleContext)_localctx, predIndex);
		case 122:
			return NOT_IN_sempred((RuleContext)_localctx, predIndex);
		case 166:
			return CapitalizedIdentifier_sempred((RuleContext)_localctx, predIndex);
		case 169:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 170:
			return JavaLetterInGString_sempred((RuleContext)_localctx, predIndex);
		case 171:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		case 172:
			return JavaLetterOrDigitInGString_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean StringLiteral_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  this.isRegexAllowed() && _input.LA(1) != '*' ;
		}
		return true;
	}
	private boolean TdqStringCharacter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return  _input.LA(1) != '"' || _input.LA(2) != '"' || _input.LA(3) == '"' && (_input.LA(4) != '"' || _input.LA(5) != '"') ;
		}
		return true;
	}
	private boolean TsqStringCharacter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return  _input.LA(1) != '\'' || _input.LA(2) != '\'' || _input.LA(3) == '\'' && (_input.LA(4) != '\'' || _input.LA(5) != '\'') ;
		}
		return true;
	}
	private boolean SlashyStringCharacter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return  !isFollowedByJavaLetterInGString(_input) ;
		}
		return true;
	}
	private boolean NOT_INSTANCEOF_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return  isFollowedBy(_input, ' ', '\t', '\r', '\n') ;
		}
		return true;
	}
	private boolean NOT_IN_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return  isFollowedBy(_input, ' ', '\t', '\r', '\n', '[', '(', '{') ;
		}
		return true;
	}
	private boolean CapitalizedIdentifier_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return  Character.isUpperCase(_input.LA(-1)) ;
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return  isJavaIdentifierStartAndNotIdentifierIgnorable(_input.LA(-1)) ;
		case 8:
			return  Character.isJavaIdentifierStart(Character.toCodePoint((char) _input.LA(-2), (char) _input.LA(-1))) ;
		}
		return true;
	}
	private boolean JavaLetterInGString_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return  _input.LA(-1) != '$' ;
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return  isJavaIdentifierPartAndNotIdentifierIgnorable(_input.LA(-1)) ;
		case 11:
			return  Character.isJavaIdentifierPart(Character.toCodePoint((char) _input.LA(-2), (char) _input.LA(-1))) ;
		}
		return true;
	}
	private boolean JavaLetterOrDigitInGString_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return  _input.LA(-1) != '$' ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2m\u052a\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4"+
		"H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\t"+
		"S\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^"+
		"\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j"+
		"\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu"+
		"\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080"+
		"\t\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f"+
		"\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4"+
		"\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8"+
		"\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad"+
		"\t\u00ad\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1"+
		"\4\u00b2\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\3\2\3"+
		"\2\7\2\u0170\n\2\f\2\16\2\u0173\13\2\3\2\3\2\3\2\3\2\7\2\u0179\n\2\f\2"+
		"\16\2\u017c\13\2\3\2\3\2\3\2\3\2\3\2\6\2\u0183\n\2\r\2\16\2\u0184\3\2"+
		"\3\2\3\2\3\2\7\2\u018b\n\2\f\2\16\2\u018e\13\2\3\2\3\2\3\2\3\2\7\2\u0194"+
		"\n\2\f\2\16\2\u0197\13\2\3\2\3\2\5\2\u019b\n\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\u01ae\n\6\f\6\16\6\u01b1"+
		"\13\6\3\7\6\7\u01b4\n\7\r\7\16\7\u01b5\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u01c6\n\n\f\n\16\n\u01c9\13\n\3\13\6\13\u01cc"+
		"\n\13\r\13\16\13\u01cd\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u01d7\n\r\3\16"+
		"\3\16\5\16\u01db\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u01e2\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u01e9\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u01f0"+
		"\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0204\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\3"+
		"8\38\39\39\39\39\39\3:\3:\3:\3:\5:\u02e7\n:\3:\3:\3:\5:\u02ec\n:\3:\3"+
		":\3:\6:\u02f1\n:\r:\16:\u02f2\3:\3:\5:\u02f7\n:\5:\u02f9\n:\3;\3;\3<\3"+
		"<\5<\u02ff\n<\3=\3=\5=\u0303\n=\3>\3>\5>\u0307\n>\3?\3?\5?\u030b\n?\3"+
		"@\3@\3A\3A\3A\5A\u0312\nA\3A\3A\3A\5A\u0317\nA\5A\u0319\nA\3B\3B\7B\u031d"+
		"\nB\fB\16B\u0320\13B\3B\5B\u0323\nB\3C\3C\5C\u0327\nC\3D\3D\3E\3E\5E\u032d"+
		"\nE\3F\6F\u0330\nF\rF\16F\u0331\3G\3G\3H\3H\3H\3H\3I\3I\7I\u033c\nI\f"+
		"I\16I\u033f\13I\3I\5I\u0342\nI\3J\3J\3K\3K\5K\u0348\nK\3L\3L\5L\u034c"+
		"\nL\3L\3L\3M\3M\7M\u0352\nM\fM\16M\u0355\13M\3M\5M\u0358\nM\3N\3N\3O\3"+
		"O\5O\u035e\nO\3P\3P\3P\3P\3Q\3Q\7Q\u0366\nQ\fQ\16Q\u0369\13Q\3Q\5Q\u036c"+
		"\nQ\3R\3R\3S\3S\5S\u0372\nS\3T\3T\5T\u0376\nT\3T\3T\3T\5T\u037b\nT\3U"+
		"\5U\u037e\nU\3U\3U\3U\5U\u0383\nU\3U\5U\u0386\nU\3U\3U\3U\5U\u038b\nU"+
		"\3U\3U\3U\5U\u0390\nU\3V\3V\3V\3W\3W\3X\5X\u0398\nX\3X\3X\3Y\3Y\3Z\3Z"+
		"\3[\3[\3[\5[\u03a3\n[\3\\\3\\\5\\\u03a7\n\\\3\\\3\\\3\\\5\\\u03ac\n\\"+
		"\3\\\3\\\3\\\5\\\u03b1\n\\\3]\3]\3]\3^\3^\3_\3_\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\5`\u03c3\n`\3a\3a\3a\3a\3a\3a\3a\5a\u03cc\na\3b\3b\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\3b\3b\5b\u03da\nb\3c\3c\3c\3c\3c\3c\3c\3d\3d\3e\3e\3e\3f\3"+
		"f\3f\3g\5g\u03ec\ng\3g\3g\5g\u03f0\ng\3h\3h\3h\3i\3i\3j\3j\3k\3k\3l\3"+
		"l\3m\3m\3n\3n\3n\3n\3o\3o\3o\3o\3p\3p\3p\3p\3p\3q\3q\3q\3r\3r\3r\3r\3"+
		"s\3s\3s\3t\3t\3t\3u\3u\3u\3v\3v\3v\3w\3w\3w\3w\3x\3x\3x\3y\3y\3y\3y\3"+
		"z\3z\3z\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3|\3|\3|\3|\3|\3|\3"+
		"}\3}\3}\3}\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0092"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0095\3\u0095\3\u0096"+
		"\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d"+
		"\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a8\7\u00a8\u04be\n\u00a8\f\u00a8\16\u00a8\u04c1\13\u00a8"+
		"\3\u00a9\3\u00a9\7\u00a9\u04c5\n\u00a9\f\u00a9\16\u00a9\u04c8\13\u00a9"+
		"\3\u00aa\3\u00aa\7\u00aa\u04cc\n\u00aa\f\u00aa\16\u00aa\u04cf\13\u00aa"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u04d7\n\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\5\u00ad\u04e2\n\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00af\7\u00af\u04e8\n"+
		"\u00af\f\u00af\16\u00af\u04eb\13\u00af\3\u00b0\6\u00b0\u04ee\n\u00b0\r"+
		"\u00b0\16\u00b0\u04ef\3\u00b0\6\u00b0\u04f3\n\u00b0\r\u00b0\16\u00b0\u04f4"+
		"\5\u00b0\u04f7\n\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\7\u00b2\u0501\n\u00b2\f\u00b2\16\u00b2\u0504\13\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\7\u00b3\u050f\n\u00b3\f\u00b3\16\u00b3\u0512\13\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\7\u00b4\u0521\n\u00b4\f\u00b4\16\u00b4\u0524\13\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u0502\2\u00b6\5\3\7\4\t\5\13"+
		"\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\2\35\2\37\2!\2#\2%\16\'\17)\20"+
		"+\21-\22/\2\61\2\63\23\65\2\67\29\24;\25=\2?\26A\27C\30E\2G\2I\31K\32"+
		"M\2O\33Q\34S\35U\36W\37Y [!]\"_#a$c%e&g\'i(k)m*o+q,s-u.w\2y\2{\2}\2\177"+
		"\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091"+
		"\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3"+
		"\2\u00a5\2\u00a7\2\u00a9/\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5"+
		"\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1\60\u00c3\2\u00c5\2\u00c7"+
		"\2\u00c9\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3\2\u00d5\2\u00d7\2\u00d9"+
		"\2\u00db\2\u00dd\2\u00df\2\u00e1\61\u00e3\62\u00e5\63\u00e7\64\u00e9\65"+
		"\u00eb\66\u00ed\67\u00ef8\u00f19\u00f3:\u00f5;\u00f7<\u00f9=\u00fb>\u00fd"+
		"?\u00ff@\u0101A\u0103B\u0105C\u0107D\u0109E\u010bF\u010dG\u010fH\u0111"+
		"I\u0113J\u0115K\u0117L\u0119M\u011bN\u011dO\u011fP\u0121Q\u0123R\u0125"+
		"S\u0127T\u0129U\u012bV\u012dW\u012fX\u0131Y\u0133Z\u0135[\u0137\\\u0139"+
		"]\u013b^\u013d_\u013f`\u0141a\u0143b\u0145c\u0147d\u0149e\u014bf\u014d"+
		"g\u014fh\u0151i\u0153j\u0155\2\u0157\2\u0159\2\u015b\2\u015d\2\u015f\2"+
		"\u0161k\u0163l\u0165\2\u0167\2\u0169\2\u016bm\5\2\3\4\34\7\2\f\f\17\17"+
		"$$&&^^\6\2\f\f\17\17))^^\5\2$$&&^^\4\2))^^\5\2\2\2&&\61\61\3\2\62;\b\2"+
		"IIKKNNiikknn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2"+
		"GGgg\4\2--//\6\2FFHIffhi\4\2RRrr\t\2$$))^^ddhhpptv\3\2\62\65\6\2&&C\\"+
		"aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62"+
		";C\\aac|\5\2\f\f\17\17\1\1\4\2\13\13\"\"\2\u053e\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2\63\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2\u00a9\3\2\2\2\2\u00c1\3\2\2\2\2\u00e1"+
		"\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2"+
		"\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3"+
		"\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2"+
		"\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105"+
		"\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2"+
		"\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117"+
		"\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2"+
		"\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\2\u0125\3\2\2\2\2\u0127\3\2\2\2\2\u0129"+
		"\3\2\2\2\2\u012b\3\2\2\2\2\u012d\3\2\2\2\2\u012f\3\2\2\2\2\u0131\3\2\2"+
		"\2\2\u0133\3\2\2\2\2\u0135\3\2\2\2\2\u0137\3\2\2\2\2\u0139\3\2\2\2\2\u013b"+
		"\3\2\2\2\2\u013d\3\2\2\2\2\u013f\3\2\2\2\2\u0141\3\2\2\2\2\u0143\3\2\2"+
		"\2\2\u0145\3\2\2\2\2\u0147\3\2\2\2\2\u0149\3\2\2\2\2\u014b\3\2\2\2\2\u014d"+
		"\3\2\2\2\2\u014f\3\2\2\2\2\u0151\3\2\2\2\2\u0153\3\2\2\2\2\u0161\3\2\2"+
		"\2\2\u0163\3\2\2\2\2\u0165\3\2\2\2\2\u0167\3\2\2\2\2\u0169\3\2\2\2\2\u016b"+
		"\3\2\2\2\3\13\3\2\2\2\3\r\3\2\2\2\3\17\3\2\2\2\3\21\3\2\2\2\4\23\3\2\2"+
		"\2\4\25\3\2\2\2\4\27\3\2\2\2\4\31\3\2\2\2\5\u019a\3\2\2\2\7\u019c\3\2"+
		"\2\2\t\u01a0\3\2\2\2\13\u01a4\3\2\2\2\r\u01a8\3\2\2\2\17\u01b3\3\2\2\2"+
		"\21\u01b7\3\2\2\2\23\u01bc\3\2\2\2\25\u01c0\3\2\2\2\27\u01cb\3\2\2\2\31"+
		"\u01cf\3\2\2\2\33\u01d6\3\2\2\2\35\u01da\3\2\2\2\37\u01e1\3\2\2\2!\u01e8"+
		"\3\2\2\2#\u01ef\3\2\2\2%\u01f1\3\2\2\2\'\u01f4\3\2\2\2)\u01f8\3\2\2\2"+
		"+\u0203\3\2\2\2-\u0205\3\2\2\2/\u020c\3\2\2\2\61\u0214\3\2\2\2\63\u0219"+
		"\3\2\2\2\65\u021f\3\2\2\2\67\u0224\3\2\2\29\u022b\3\2\2\2;\u0230\3\2\2"+
		"\2=\u0235\3\2\2\2?\u023b\3\2\2\2A\u023e\3\2\2\2C\u0245\3\2\2\2E\u0250"+
		"\3\2\2\2G\u0254\3\2\2\2I\u0259\3\2\2\2K\u025d\3\2\2\2M\u0264\3\2\2\2O"+
		"\u026a\3\2\2\2Q\u0270\3\2\2\2S\u0274\3\2\2\2U\u027d\3\2\2\2W\u0284\3\2"+
		"\2\2Y\u028c\3\2\2\2[\u0291\3\2\2\2]\u0299\3\2\2\2_\u029e\3\2\2\2a\u02a4"+
		"\3\2\2\2c\u02ab\3\2\2\2e\u02b2\3\2\2\2g\u02b8\3\2\2\2i\u02bd\3\2\2\2k"+
		"\u02c2\3\2\2\2m\u02cb\3\2\2\2o\u02d0\3\2\2\2q\u02d5\3\2\2\2s\u02dd\3\2"+
		"\2\2u\u02f8\3\2\2\2w\u02fa\3\2\2\2y\u02fc\3\2\2\2{\u0300\3\2\2\2}\u0304"+
		"\3\2\2\2\177\u0308\3\2\2\2\u0081\u030c\3\2\2\2\u0083\u0318\3\2\2\2\u0085"+
		"\u031a\3\2\2\2\u0087\u0326\3\2\2\2\u0089\u0328\3\2\2\2\u008b\u032c\3\2"+
		"\2\2\u008d\u032f\3\2\2\2\u008f\u0333\3\2\2\2\u0091\u0335\3\2\2\2\u0093"+
		"\u0339\3\2\2\2\u0095\u0343\3\2\2\2\u0097\u0347\3\2\2\2\u0099\u0349\3\2"+
		"\2\2\u009b\u034f\3\2\2\2\u009d\u0359\3\2\2\2\u009f\u035d\3\2\2\2\u00a1"+
		"\u035f\3\2\2\2\u00a3\u0363\3\2\2\2\u00a5\u036d\3\2\2\2\u00a7\u0371\3\2"+
		"\2\2\u00a9\u0375\3\2\2\2\u00ab\u038f\3\2\2\2\u00ad\u0391\3\2\2\2\u00af"+
		"\u0394\3\2\2\2\u00b1\u0397\3\2\2\2\u00b3\u039b\3\2\2\2\u00b5\u039d\3\2"+
		"\2\2\u00b7\u039f\3\2\2\2\u00b9\u03b0\3\2\2\2\u00bb\u03b2\3\2\2\2\u00bd"+
		"\u03b5\3\2\2\2\u00bf\u03b7\3\2\2\2\u00c1\u03c2\3\2\2\2\u00c3\u03cb\3\2"+
		"\2\2\u00c5\u03d9\3\2\2\2\u00c7\u03db\3\2\2\2\u00c9\u03e2\3\2\2\2\u00cb"+
		"\u03e4\3\2\2\2\u00cd\u03e7\3\2\2\2\u00cf\u03ef\3\2\2\2\u00d1\u03f1\3\2"+
		"\2\2\u00d3\u03f4\3\2\2\2\u00d5\u03f6\3\2\2\2\u00d7\u03f8\3\2\2\2\u00d9"+
		"\u03fa\3\2\2\2\u00db\u03fc\3\2\2\2\u00dd\u03fe\3\2\2\2\u00df\u0402\3\2"+
		"\2\2\u00e1\u0406\3\2\2\2\u00e3\u040b\3\2\2\2\u00e5\u040e\3\2\2\2\u00e7"+
		"\u0412\3\2\2\2\u00e9\u0415\3\2\2\2\u00eb\u0418\3\2\2\2\u00ed\u041b\3\2"+
		"\2\2\u00ef\u041e\3\2\2\2\u00f1\u0422\3\2\2\2\u00f3\u0425\3\2\2\2\u00f5"+
		"\u0429\3\2\2\2\u00f7\u042c\3\2\2\2\u00f9\u043a\3\2\2\2\u00fb\u0440\3\2"+
		"\2\2\u00fd\u0444\3\2\2\2\u00ff\u0448\3\2\2\2\u0101\u044c\3\2\2\2\u0103"+
		"\u0450\3\2\2\2\u0105\u0454\3\2\2\2\u0107\u0458\3\2\2\2\u0109\u045a\3\2"+
		"\2\2\u010b\u045c\3\2\2\2\u010d\u045e\3\2\2\2\u010f\u0460\3\2\2\2\u0111"+
		"\u0462\3\2\2\2\u0113\u0464\3\2\2\2\u0115\u0466\3\2\2\2\u0117\u0468\3\2"+
		"\2\2\u0119\u046a\3\2\2\2\u011b\u046c\3\2\2\2\u011d\u046f\3\2\2\2\u011f"+
		"\u0472\3\2\2\2\u0121\u0475\3\2\2\2\u0123\u0478\3\2\2\2\u0125\u047b\3\2"+
		"\2\2\u0127\u047e\3\2\2\2\u0129\u0480\3\2\2\2\u012b\u0482\3\2\2\2\u012d"+
		"\u0484\3\2\2\2\u012f\u0486\3\2\2\2\u0131\u0488\3\2\2\2\u0133\u048a\3\2"+
		"\2\2\u0135\u048c\3\2\2\2\u0137\u048e\3\2\2\2\u0139\u0491\3\2\2\2\u013b"+
		"\u0494\3\2\2\2\u013d\u0497\3\2\2\2\u013f\u049a\3\2\2\2\u0141\u049d\3\2"+
		"\2\2\u0143\u04a0\3\2\2\2\u0145\u04a3\3\2\2\2\u0147\u04a6\3\2\2\2\u0149"+
		"\u04aa\3\2\2\2\u014b\u04ae\3\2\2\2\u014d\u04b3\3\2\2\2\u014f\u04b6\3\2"+
		"\2\2\u0151\u04ba\3\2\2\2\u0153\u04c2\3\2\2\2\u0155\u04c9\3\2\2\2\u0157"+
		"\u04d6\3\2\2\2\u0159\u04d8\3\2\2\2\u015b\u04e1\3\2\2\2\u015d\u04e3\3\2"+
		"\2\2\u015f\u04e9\3\2\2\2\u0161\u04f6\3\2\2\2\u0163\u04fa\3\2\2\2\u0165"+
		"\u04fc\3\2\2\2\u0167\u050a\3\2\2\2\u0169\u0515\3\2\2\2\u016b\u0527\3\2"+
		"\2\2\u016d\u0171\5\u00d9l\2\u016e\u0170\5\33\r\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0174\u0175\5\u00d9l\2\u0175\u019b\3\2\2\2\u0176"+
		"\u017a\5\u00dbm\2\u0177\u0179\5\35\16\2\u0178\u0177\3\2\2\2\u0179\u017c"+
		"\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017e\5\u00dbm\2\u017e\u019b\3\2\2\2\u017f\u0180"+
		"\5\u00d5j\2\u0180\u0182\6\2\2\2\u0181\u0183\5#\21\2\u0182\u0181\3\2\2"+
		"\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0187\5\u00d5j\2\u0187\u019b\3\2\2\2\u0188\u018c\5\u00dd"+
		"n\2\u0189\u018b\5\37\17\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018f\u0190\5\u00ddn\2\u0190\u019b\3\2\2\2\u0191\u0195\5\u00dfo\2"+
		"\u0192\u0194\5!\20\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198"+
		"\u0199\5\u00dfo\2\u0199\u019b\3\2\2\2\u019a\u016d\3\2\2\2\u019a\u0176"+
		"\3\2\2\2\u019a\u017f\3\2\2\2\u019a\u0188\3\2\2\2\u019a\u0191\3\2\2\2\u019b"+
		"\6\3\2\2\2\u019c\u019d\5\u00d9l\2\u019d\u019e\3\2\2\2\u019e\u019f\b\3"+
		"\2\2\u019f\b\3\2\2\2\u01a0\u01a1\5\u00ddn\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a3\b\4\3\2\u01a3\n\3\2\2\2\u01a4\u01a5\5\u00d9l\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a7\b\5\4\2\u01a7\f\3\2\2\2\u01a8\u01a9\5\u00d7k\2\u01a9"+
		"\u01af\5\u0155\u00aa\2\u01aa\u01ab\5\u00bf_\2\u01ab\u01ac\5\u0155\u00aa"+
		"\2\u01ac\u01ae\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\16\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b4\5\33\r\2\u01b3\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3"+
		"\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\20\3\2\2\2\u01b7\u01b8\7&\2\2\u01b8\u01b9"+
		"\7}\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\b\b\5\2\u01bb\22\3\2\2\2\u01bc"+
		"\u01bd\5\u00ddn\2\u01bd\u01be\3\2\2\2\u01be\u01bf\b\t\4\2\u01bf\24\3\2"+
		"\2\2\u01c0\u01c1\5\u00d7k\2\u01c1\u01c7\5\u0155\u00aa\2\u01c2\u01c3\5"+
		"\u00bf_\2\u01c3\u01c4\5\u0155\u00aa\2\u01c4\u01c6\3\2\2\2\u01c5\u01c2"+
		"\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\26\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cc\5\37\17\2\u01cb\u01ca\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\30\3\2\2\2\u01cf\u01d0\7&\2\2\u01d0\u01d1\7}\2\2\u01d1\u01d2\3\2\2\2"+
		"\u01d2\u01d3\b\f\5\2\u01d3\32\3\2\2\2\u01d4\u01d7\n\2\2\2\u01d5\u01d7"+
		"\5\u00c3a\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\34\3\2\2\2\u01d8"+
		"\u01db\n\3\2\2\u01d9\u01db\5\u00c3a\2\u01da\u01d8\3\2\2\2\u01da\u01d9"+
		"\3\2\2\2\u01db\36\3\2\2\2\u01dc\u01e2\n\4\2\2\u01dd\u01de\5\u00d9l\2\u01de"+
		"\u01df\6\17\3\2\u01df\u01e2\3\2\2\2\u01e0\u01e2\5\u00c3a\2\u01e1\u01dc"+
		"\3\2\2\2\u01e1\u01dd\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2 \3\2\2\2\u01e3"+
		"\u01e9\n\5\2\2\u01e4\u01e5\5\u00dbm\2\u01e5\u01e6\6\20\4\2\u01e6\u01e9"+
		"\3\2\2\2\u01e7\u01e9\5\u00c3a\2\u01e8\u01e3\3\2\2\2\u01e8\u01e4\3\2\2"+
		"\2\u01e8\u01e7\3\2\2\2\u01e9\"\3\2\2\2\u01ea\u01f0\5\u00d1h\2\u01eb\u01ec"+
		"\5\u00d7k\2\u01ec\u01ed\6\21\5\2\u01ed\u01f0\3\2\2\2\u01ee\u01f0\n\6\2"+
		"\2\u01ef\u01ea\3\2\2\2\u01ef\u01eb\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0$"+
		"\3\2\2\2\u01f1\u01f2\7c\2\2\u01f2\u01f3\7u\2\2\u01f3&\3\2\2\2\u01f4\u01f5"+
		"\7f\2\2\u01f5\u01f6\7g\2\2\u01f6\u01f7\7h\2\2\u01f7(\3\2\2\2\u01f8\u01f9"+
		"\7k\2\2\u01f9\u01fa\7p\2\2\u01fa*\3\2\2\2\u01fb\u0204\5/\27\2\u01fc\u0204"+
		"\5\65\32\2\u01fd\u0204\5\61\30\2\u01fe\u0204\5M&\2\u01ff\u0204\5E\"\2"+
		"\u0200\u0204\5G#\2\u0201\u0204\5=\36\2\u0202\u0204\5\67\33\2\u0203\u01fb"+
		"\3\2\2\2\u0203\u01fc\3\2\2\2\u0203\u01fd\3\2\2\2\u0203\u01fe\3\2\2\2\u0203"+
		"\u01ff\3\2\2\2\u0203\u0200\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2"+
		"\2\2\u0204,\3\2\2\2\u0205\u0206\7c\2\2\u0206\u0207\7u\2\2\u0207\u0208"+
		"\7u\2\2\u0208\u0209\7g\2\2\u0209\u020a\7t\2\2\u020a\u020b\7v\2\2\u020b"+
		".\3\2\2\2\u020c\u020d\7d\2\2\u020d\u020e\7q\2\2\u020e\u020f\7q\2\2\u020f"+
		"\u0210\7n\2\2\u0210\u0211\7g\2\2\u0211\u0212\7c\2\2\u0212\u0213\7p\2\2"+
		"\u0213\60\3\2\2\2\u0214\u0215\7d\2\2\u0215\u0216\7{\2\2\u0216\u0217\7"+
		"v\2\2\u0217\u0218\7g\2\2\u0218\62\3\2\2\2\u0219\u021a\7e\2\2\u021a\u021b"+
		"\7c\2\2\u021b\u021c\7v\2\2\u021c\u021d\7e\2\2\u021d\u021e\7j\2\2\u021e"+
		"\64\3\2\2\2\u021f\u0220\7e\2\2\u0220\u0221\7j\2\2\u0221\u0222\7c\2\2\u0222"+
		"\u0223\7t\2\2\u0223\66\3\2\2\2\u0224\u0225\7f\2\2\u0225\u0226\7q\2\2\u0226"+
		"\u0227\7w\2\2\u0227\u0228\7d\2\2\u0228\u0229\7n\2\2\u0229\u022a\7g\2\2"+
		"\u022a8\3\2\2\2\u022b\u022c\7g\2\2\u022c\u022d\7n\2\2\u022d\u022e\7u\2"+
		"\2\u022e\u022f\7g\2\2\u022f:\3\2\2\2\u0230\u0231\7g\2\2\u0231\u0232\7"+
		"p\2\2\u0232\u0233\7w\2\2\u0233\u0234\7o\2\2\u0234<\3\2\2\2\u0235\u0236"+
		"\7h\2\2\u0236\u0237\7n\2\2\u0237\u0238\7q\2\2\u0238\u0239\7c\2\2\u0239"+
		"\u023a\7v\2\2\u023a>\3\2\2\2\u023b\u023c\7k\2\2\u023c\u023d\7h\2\2\u023d"+
		"@\3\2\2\2\u023e\u023f\7k\2\2\u023f\u0240\7o\2\2\u0240\u0241\7r\2\2\u0241"+
		"\u0242\7q\2\2\u0242\u0243\7t\2\2\u0243\u0244\7v\2\2\u0244B\3\2\2\2\u0245"+
		"\u0246\7k\2\2\u0246\u0247\7p\2\2\u0247\u0248\7u\2\2\u0248\u0249\7v\2\2"+
		"\u0249\u024a\7c\2\2\u024a\u024b\7p\2\2\u024b\u024c\7e\2\2\u024c\u024d"+
		"\7g\2\2\u024d\u024e\7q\2\2\u024e\u024f\7h\2\2\u024fD\3\2\2\2\u0250\u0251"+
		"\7k\2\2\u0251\u0252\7p\2\2\u0252\u0253\7v\2\2\u0253F\3\2\2\2\u0254\u0255"+
		"\7n\2\2\u0255\u0256\7q\2\2\u0256\u0257\7p\2\2\u0257\u0258\7i\2\2\u0258"+
		"H\3\2\2\2\u0259\u025a\7p\2\2\u025a\u025b\7g\2\2\u025b\u025c\7y\2\2\u025c"+
		"J\3\2\2\2\u025d\u025e\7t\2\2\u025e\u025f\7g\2\2\u025f\u0260\7v\2\2\u0260"+
		"\u0261\7w\2\2\u0261\u0262\7t\2\2\u0262\u0263\7p\2\2\u0263L\3\2\2\2\u0264"+
		"\u0265\7u\2\2\u0265\u0266\7j\2\2\u0266\u0267\7q\2\2\u0267\u0268\7t\2\2"+
		"\u0268\u0269\7v\2\2\u0269N\3\2\2\2\u026a\u026b\7v\2\2\u026b\u026c\7j\2"+
		"\2\u026c\u026d\7t\2\2\u026d\u026e\7q\2\2\u026e\u026f\7y\2\2\u026fP\3\2"+
		"\2\2\u0270\u0271\7v\2\2\u0271\u0272\7t\2\2\u0272\u0273\7{\2\2\u0273R\3"+
		"\2\2\2\u0274\u0275\7p\2\2\u0275\u0276\7g\2\2\u0276\u0277\7z\2\2\u0277"+
		"\u0278\7v\2\2\u0278\u0279\7h\2\2\u0279\u027a\7n\2\2\u027a\u027b\7q\2\2"+
		"\u027b\u027c\7y\2\2\u027cT\3\2\2\2\u027d\u027e\7r\2\2\u027e\u027f\7c\2"+
		"\2\u027f\u0280\7t\2\2\u0280\u0281\7c\2\2\u0281\u0282\7o\2\2\u0282\u0283"+
		"\7u\2\2\u0283V\3\2\2\2\u0284\u0285\7k\2\2\u0285\u0286\7p\2\2\u0286\u0287"+
		"\7e\2\2\u0287\u0288\7n\2\2\u0288\u0289\7w\2\2\u0289\u028a\7f\2\2\u028a"+
		"\u028b\7g\2\2\u028bX\3\2\2\2\u028c\u028d\7h\2\2\u028d\u028e\7t\2\2\u028e"+
		"\u028f\7q\2\2\u028f\u0290\7o\2\2\u0290Z\3\2\2\2\u0291\u0292\7r\2\2\u0292"+
		"\u0293\7t\2\2\u0293\u0294\7q\2\2\u0294\u0295\7e\2\2\u0295\u0296\7g\2\2"+
		"\u0296\u0297\7u\2\2\u0297\u0298\7u\2\2\u0298\\\3\2\2\2\u0299\u029a\7g"+
		"\2\2\u029a\u029b\7z\2\2\u029b\u029c\7g\2\2\u029c\u029d\7e\2\2\u029d^\3"+
		"\2\2\2\u029e\u029f\7k\2\2\u029f\u02a0\7p\2\2\u02a0\u02a1\7r\2\2\u02a1"+
		"\u02a2\7w\2\2\u02a2\u02a3\7v\2\2\u02a3`\3\2\2\2\u02a4\u02a5\7q\2\2\u02a5"+
		"\u02a6\7w\2\2\u02a6\u02a7\7v\2\2\u02a7\u02a8\7r\2\2\u02a8\u02a9\7w\2\2"+
		"\u02a9\u02aa\7v\2\2\u02aab\3\2\2\2\u02ab\u02ac\7u\2\2\u02ac\u02ad\7e\2"+
		"\2\u02ad\u02ae\7t\2\2\u02ae\u02af\7k\2\2\u02af\u02b0\7r\2\2\u02b0\u02b1"+
		"\7v\2\2\u02b1d\3\2\2\2\u02b2\u02b3\7u\2\2\u02b3\u02b4\7j\2\2\u02b4\u02b5"+
		"\7g\2\2\u02b5\u02b6\7n\2\2\u02b6\u02b7\7n\2\2\u02b7f\3\2\2\2\u02b8\u02b9"+
		"\7u\2\2\u02b9\u02ba\7v\2\2\u02ba\u02bb\7w\2\2\u02bb\u02bc\7d\2\2\u02bc"+
		"h\3\2\2\2\u02bd\u02be\7y\2\2\u02be\u02bf\7j\2\2\u02bf\u02c0\7g\2\2\u02c0"+
		"\u02c1\7p\2\2\u02c1j\3\2\2\2\u02c2\u02c3\7y\2\2\u02c3\u02c4\7q\2\2\u02c4"+
		"\u02c5\7t\2\2\u02c5\u02c6\7m\2\2\u02c6\u02c7\7h\2\2\u02c7\u02c8\7n\2\2"+
		"\u02c8\u02c9\7q\2\2\u02c9\u02ca\7y\2\2\u02cal\3\2\2\2\u02cb\u02cc\7g\2"+
		"\2\u02cc\u02cd\7o\2\2\u02cd\u02ce\7k\2\2\u02ce\u02cf\7v\2\2\u02cfn\3\2"+
		"\2\2\u02d0\u02d1\7o\2\2\u02d1\u02d2\7c\2\2\u02d2\u02d3\7k\2\2\u02d3\u02d4"+
		"\7p\2\2\u02d4p\3\2\2\2\u02d5\u02d6\7r\2\2\u02d6\u02d7\7w\2\2\u02d7\u02d8"+
		"\7d\2\2\u02d8\u02d9\7n\2\2\u02d9\u02da\7k\2\2\u02da\u02db\7u\2\2\u02db"+
		"\u02dc\7j\2\2\u02dcr\3\2\2\2\u02dd\u02de\7v\2\2\u02de\u02df\7c\2\2\u02df"+
		"\u02e0\7m\2\2\u02e0\u02e1\7g\2\2\u02e1t\3\2\2\2\u02e2\u02e7\5y<\2\u02e3"+
		"\u02e7\5{=\2\u02e4\u02e7\5}>\2\u02e5\u02e7\5\177?\2\u02e6\u02e2\3\2\2"+
		"\2\u02e6\u02e3\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e7\u02eb"+
		"\3\2\2\2\u02e8\u02e9\5\u008fG\2\u02e9\u02ea\b:\6\2\u02ea\u02ec\3\2\2\2"+
		"\u02eb\u02e8\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02f9\3\2\2\2\u02ed\u02f0"+
		"\5w;\2\u02ee\u02ef\t\7\2\2\u02ef\u02f1\b:\7\2\u02f0\u02ee\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2"+
		"\2\2\u02f4\u02f6\b:\b\2\u02f5\u02f7\5\u0081@\2\u02f6\u02f5\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02e6\3\2\2\2\u02f8\u02ed\3\2"+
		"\2\2\u02f9v\3\2\2\2\u02fa\u02fb\7\62\2\2\u02fbx\3\2\2\2\u02fc\u02fe\5"+
		"\u0083A\2\u02fd\u02ff\5\u0081@\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2"+
		"\2\u02ffz\3\2\2\2\u0300\u0302\5\u0091H\2\u0301\u0303\5\u0081@\2\u0302"+
		"\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303|\3\2\2\2\u0304\u0306\5\u0099"+
		"L\2\u0305\u0307\5\u0081@\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"~\3\2\2\2\u0308\u030a\5\u00a1P\2\u0309\u030b\5\u0081@\2\u030a\u0309\3"+
		"\2\2\2\u030a\u030b\3\2\2\2\u030b\u0080\3\2\2\2\u030c\u030d\t\b\2\2\u030d"+
		"\u0082\3\2\2\2\u030e\u0319\5w;\2\u030f\u0316\5\u0089D\2\u0310\u0312\5"+
		"\u0085B\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0317\3\2\2\2"+
		"\u0313\u0314\5\u008dF\2\u0314\u0315\5\u0085B\2\u0315\u0317\3\2\2\2\u0316"+
		"\u0311\3\2\2\2\u0316\u0313\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u030e\3\2"+
		"\2\2\u0318\u030f\3\2\2\2\u0319\u0084\3\2\2\2\u031a\u0322\5\u0087C\2\u031b"+
		"\u031d\5\u008bE\2\u031c\u031b\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c"+
		"\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0321\3\2\2\2\u0320\u031e\3\2\2\2\u0321"+
		"\u0323\5\u0087C\2\u0322\u031e\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0086"+
		"\3\2\2\2\u0324\u0327\5w;\2\u0325\u0327\5\u0089D\2\u0326\u0324\3\2\2\2"+
		"\u0326\u0325\3\2\2\2\u0327\u0088\3\2\2\2\u0328\u0329\t\t\2\2\u0329\u008a"+
		"\3\2\2\2\u032a\u032d\5\u0087C\2\u032b\u032d\5\u008fG\2\u032c\u032a\3\2"+
		"\2\2\u032c\u032b\3\2\2\2\u032d\u008c\3\2\2\2\u032e\u0330\5\u008fG\2\u032f"+
		"\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2"+
		"\2\2\u0332\u008e\3\2\2\2\u0333\u0334\7a\2\2\u0334\u0090\3\2\2\2\u0335"+
		"\u0336\5w;\2\u0336\u0337\t\n\2\2\u0337\u0338\5\u0093I\2\u0338\u0092\3"+
		"\2\2\2\u0339\u0341\5\u0095J\2\u033a\u033c\5\u0097K\2\u033b\u033a\3\2\2"+
		"\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340"+
		"\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0342\5\u0095J\2\u0341\u033d\3\2\2"+
		"\2\u0341\u0342\3\2\2\2\u0342\u0094\3\2\2\2\u0343\u0344\t\13\2\2\u0344"+
		"\u0096\3\2\2\2\u0345\u0348\5\u0095J\2\u0346\u0348\5\u008fG\2\u0347\u0345"+
		"\3\2\2\2\u0347\u0346\3\2\2\2\u0348\u0098\3\2\2\2\u0349\u034b\5w;\2\u034a"+
		"\u034c\5\u008dF\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d"+
		"\3\2\2\2\u034d\u034e\5\u009bM\2\u034e\u009a\3\2\2\2\u034f\u0357\5\u009d"+
		"N\2\u0350\u0352\5\u009fO\2\u0351\u0350\3\2\2\2\u0352\u0355\3\2\2\2\u0353"+
		"\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u0353\3\2"+
		"\2\2\u0356\u0358\5\u009dN\2\u0357\u0353\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"\u009c\3\2\2\2\u0359\u035a\t\f\2\2\u035a\u009e\3\2\2\2\u035b\u035e\5\u009d"+
		"N\2\u035c\u035e\5\u008fG\2\u035d\u035b\3\2\2\2\u035d\u035c\3\2\2\2\u035e"+
		"\u00a0\3\2\2\2\u035f\u0360\5w;\2\u0360\u0361\t\r\2\2\u0361\u0362\5\u00a3"+
		"Q\2\u0362\u00a2\3\2\2\2\u0363\u036b\5\u00a5R\2\u0364\u0366\5\u00a7S\2"+
		"\u0365\u0364\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368"+
		"\3\2\2\2\u0368\u036a\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036c\5\u00a5R"+
		"\2\u036b\u0367\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u00a4\3\2\2\2\u036d\u036e"+
		"\t\16\2\2\u036e\u00a6\3\2\2\2\u036f\u0372\5\u00a5R\2\u0370\u0372\5\u008f"+
		"G\2\u0371\u036f\3\2\2\2\u0371\u0370\3\2\2\2\u0372\u00a8\3\2\2\2\u0373"+
		"\u0376\5\u00abU\2\u0374\u0376\5\u00b7[\2\u0375\u0373\3\2\2\2\u0375\u0374"+
		"\3\2\2\2\u0376\u037a\3\2\2\2\u0377\u0378\5\u008fG\2\u0378\u0379\bT\t\2"+
		"\u0379\u037b\3\2\2\2\u037a\u0377\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u00aa"+
		"\3\2\2\2\u037c\u037e\5\u0085B\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2"+
		"\2\u037e\u037f\3\2\2\2\u037f\u0380\5\u00bf_\2\u0380\u0382\5\u0085B\2\u0381"+
		"\u0383\5\u00adV\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385"+
		"\3\2\2\2\u0384\u0386\5\u00b5Z\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2"+
		"\2\u0386\u0390\3\2\2\2\u0387\u0388\5\u0085B\2\u0388\u038a\5\u00adV\2\u0389"+
		"\u038b\5\u00b5Z\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u0390"+
		"\3\2\2\2\u038c\u038d\5\u0085B\2\u038d\u038e\5\u00b5Z\2\u038e\u0390\3\2"+
		"\2\2\u038f\u037d\3\2\2\2\u038f\u0387\3\2\2\2\u038f\u038c\3\2\2\2\u0390"+
		"\u00ac\3\2\2\2\u0391\u0392\5\u00afW\2\u0392\u0393\5\u00b1X\2\u0393\u00ae"+
		"\3\2\2\2\u0394\u0395\t\17\2\2\u0395\u00b0\3\2\2\2\u0396\u0398\5\u00b3"+
		"Y\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u039a\5\u0085B\2\u039a\u00b2\3\2\2\2\u039b\u039c\t\20\2\2\u039c\u00b4"+
		"\3\2\2\2\u039d\u039e\t\21\2\2\u039e\u00b6\3\2\2\2\u039f\u03a0\5\u00b9"+
		"\\\2\u03a0\u03a2\5\u00bb]\2\u03a1\u03a3\5\u00b5Z\2\u03a2\u03a1\3\2\2\2"+
		"\u03a2\u03a3\3\2\2\2\u03a3\u00b8\3\2\2\2\u03a4\u03a6\5\u0091H\2\u03a5"+
		"\u03a7\5\u00bf_\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03b1"+
		"\3\2\2\2\u03a8\u03a9\5w;\2\u03a9\u03ab\t\n\2\2\u03aa\u03ac\5\u0093I\2"+
		"\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae"+
		"\5\u00bf_\2\u03ae\u03af\5\u0093I\2\u03af\u03b1\3\2\2\2\u03b0\u03a4\3\2"+
		"\2\2\u03b0\u03a8\3\2\2\2\u03b1\u00ba\3\2\2\2\u03b2\u03b3\5\u00bd^\2\u03b3"+
		"\u03b4\5\u00b1X\2\u03b4\u00bc\3\2\2\2\u03b5\u03b6\t\22\2\2\u03b6\u00be"+
		"\3\2\2\2\u03b7\u03b8\7\60\2\2\u03b8\u00c0\3\2\2\2\u03b9\u03ba\7v\2\2\u03ba"+
		"\u03bb\7t\2\2\u03bb\u03bc\7w\2\2\u03bc\u03c3\7g\2\2\u03bd\u03be\7h\2\2"+
		"\u03be\u03bf\7c\2\2\u03bf\u03c0\7n\2\2\u03c0\u03c1\7u\2\2\u03c1\u03c3"+
		"\7g\2\2\u03c2\u03b9\3\2\2\2\u03c2\u03bd\3\2\2\2\u03c3\u00c2\3\2\2\2\u03c4"+
		"\u03c5\5\u00d3i\2\u03c5\u03c6\t\23\2\2\u03c6\u03cc\3\2\2\2\u03c7\u03cc"+
		"\5\u00c5b\2\u03c8\u03cc\5\u00c7c\2\u03c9\u03cc\5\u00cbe\2\u03ca\u03cc"+
		"\5\u00cdf\2\u03cb\u03c4\3\2\2\2\u03cb\u03c7\3\2\2\2\u03cb\u03c8\3\2\2"+
		"\2\u03cb\u03c9\3\2\2\2\u03cb\u03ca\3\2\2\2\u03cc\u00c4\3\2\2\2\u03cd\u03ce"+
		"\5\u00d3i\2\u03ce\u03cf\5\u009dN\2\u03cf\u03da\3\2\2\2\u03d0\u03d1\5\u00d3"+
		"i\2\u03d1\u03d2\5\u009dN\2\u03d2\u03d3\5\u009dN\2\u03d3\u03da\3\2\2\2"+
		"\u03d4\u03d5\5\u00d3i\2\u03d5\u03d6\5\u00c9d\2\u03d6\u03d7\5\u009dN\2"+
		"\u03d7\u03d8\5\u009dN\2\u03d8\u03da\3\2\2\2\u03d9\u03cd\3\2\2\2\u03d9"+
		"\u03d0\3\2\2\2\u03d9\u03d4\3\2\2\2\u03da\u00c6\3\2\2\2\u03db\u03dc\5\u00d3"+
		"i\2\u03dc\u03dd\7w\2\2\u03dd\u03de\5\u0095J\2\u03de\u03df\5\u0095J\2\u03df"+
		"\u03e0\5\u0095J\2\u03e0\u03e1\5\u0095J\2\u03e1\u00c8\3\2\2\2\u03e2\u03e3"+
		"\t\24\2\2\u03e3\u00ca\3\2\2\2\u03e4\u03e5\5\u00d3i\2\u03e5\u03e6\5\u00d7"+
		"k\2\u03e6\u00cc\3\2\2\2\u03e7\u03e8\5\u00d3i\2\u03e8\u03e9\5\u00cfg\2"+
		"\u03e9\u00ce\3\2\2\2\u03ea\u03ec\7\17\2\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec"+
		"\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03f0\7\f\2\2\u03ee\u03f0\7\17\2\2"+
		"\u03ef\u03eb\3\2\2\2\u03ef\u03ee\3\2\2\2\u03f0\u00d0\3\2\2\2\u03f1\u03f2"+
		"\5\u00d3i\2\u03f2\u03f3\5\u00d5j\2\u03f3\u00d2\3\2\2\2\u03f4\u03f5\7^"+
		"\2\2\u03f5\u00d4\3\2\2\2\u03f6\u03f7\7\61\2\2\u03f7\u00d6\3\2\2\2\u03f8"+
		"\u03f9\7&\2\2\u03f9\u00d8\3\2\2\2\u03fa\u03fb\7$\2\2\u03fb\u00da\3\2\2"+
		"\2\u03fc\u03fd\7)\2\2\u03fd\u00dc\3\2\2\2\u03fe\u03ff\7$\2\2\u03ff\u0400"+
		"\7$\2\2\u0400\u0401\7$\2\2\u0401\u00de\3\2\2\2\u0402\u0403\7)\2\2\u0403"+
		"\u0404\7)\2\2\u0404\u0405\7)\2\2\u0405\u00e0\3\2\2\2\u0406\u0407\7p\2"+
		"\2\u0407\u0408\7w\2\2\u0408\u0409\7n\2\2\u0409\u040a\7n\2\2\u040a\u00e2"+
		"\3\2\2\2\u040b\u040c\7\60\2\2\u040c\u040d\7\60\2\2\u040d\u00e4\3\2\2\2"+
		"\u040e\u040f\7\60\2\2\u040f\u0410\7\60\2\2\u0410\u0411\7>\2\2\u0411\u00e6"+
		"\3\2\2\2\u0412\u0413\7,\2\2\u0413\u0414\7\60\2\2\u0414\u00e8\3\2\2\2\u0415"+
		"\u0416\7A\2\2\u0416\u0417\7\60\2\2\u0417\u00ea\3\2\2\2\u0418\u0419\7A"+
		"\2\2\u0419\u041a\7<\2\2\u041a\u00ec\3\2\2\2\u041b\u041c\7?\2\2\u041c\u041d"+
		"\7\u0080\2\2\u041d\u00ee\3\2\2\2\u041e\u041f\7?\2\2\u041f\u0420\7?\2\2"+
		"\u0420\u0421\7\u0080\2\2\u0421\u00f0\3\2\2\2\u0422\u0423\7,\2\2\u0423"+
		"\u0424\7,\2\2\u0424\u00f2\3\2\2\2\u0425\u0426\7>\2\2\u0426\u0427\7?\2"+
		"\2\u0427\u0428\7@\2\2\u0428\u00f4\3\2\2\2\u0429\u042a\7/\2\2\u042a\u042b"+
		"\7@\2\2\u042b\u00f6\3\2\2\2\u042c\u042d\7#\2\2\u042d\u042e\7k\2\2\u042e"+
		"\u042f\7p\2\2\u042f\u0430\7u\2\2\u0430\u0431\7v\2\2\u0431\u0432\7c\2\2"+
		"\u0432\u0433\7p\2\2\u0433\u0434\7e\2\2\u0434\u0435\7g\2\2\u0435\u0436"+
		"\7q\2\2\u0436\u0437\7h\2\2\u0437\u0438\3\2\2\2\u0438\u0439\6{\6\2\u0439"+
		"\u00f8\3\2\2\2\u043a\u043b\7#\2\2\u043b\u043c\7k\2\2\u043c\u043d\7p\2"+
		"\2\u043d\u043e\3\2\2\2\u043e\u043f\6|\7\2\u043f\u00fa\3\2\2\2\u0440\u0441"+
		"\7*\2\2\u0441\u0442\3\2\2\2\u0442\u0443\b}\5\2\u0443\u00fc\3\2\2\2\u0444"+
		"\u0445\7+\2\2\u0445\u0446\3\2\2\2\u0446\u0447\b~\4\2\u0447\u00fe\3\2\2"+
		"\2\u0448\u0449\7}\2\2\u0449\u044a\3\2\2\2\u044a\u044b\b\177\5\2\u044b"+
		"\u0100\3\2\2\2\u044c\u044d\7\177\2\2\u044d\u044e\3\2\2\2\u044e\u044f\b"+
		"\u0080\4\2\u044f\u0102\3\2\2\2\u0450\u0451\7]\2\2\u0451\u0452\3\2\2\2"+
		"\u0452\u0453\b\u0081\5\2\u0453\u0104\3\2\2\2\u0454\u0455\7_\2\2\u0455"+
		"\u0456\3\2\2\2\u0456\u0457\b\u0082\4\2\u0457\u0106\3\2\2\2\u0458\u0459"+
		"\7=\2\2\u0459\u0108\3\2\2\2\u045a\u045b\7.\2\2\u045b\u010a\3\2\2\2\u045c"+
		"\u045d\5\u00bf_\2\u045d\u010c\3\2\2\2\u045e\u045f\7?\2\2\u045f\u010e\3"+
		"\2\2\2\u0460\u0461\7@\2\2\u0461\u0110\3\2\2\2\u0462\u0463\7>\2\2\u0463"+
		"\u0112\3\2\2\2\u0464\u0465\7#\2\2\u0465\u0114\3\2\2\2\u0466\u0467\7\u0080"+
		"\2\2\u0467\u0116\3\2\2\2\u0468\u0469\7A\2\2\u0469\u0118\3\2\2\2\u046a"+
		"\u046b\7<\2\2\u046b\u011a\3\2\2\2\u046c\u046d\7?\2\2\u046d\u046e\7?\2"+
		"\2\u046e\u011c\3\2\2\2\u046f\u0470\7>\2\2\u0470\u0471\7?\2\2\u0471\u011e"+
		"\3\2\2\2\u0472\u0473\7@\2\2\u0473\u0474\7?\2\2\u0474\u0120\3\2\2\2\u0475"+
		"\u0476\7#\2\2\u0476\u0477\7?\2\2\u0477\u0122\3\2\2\2\u0478\u0479\7(\2"+
		"\2\u0479\u047a\7(\2\2\u047a\u0124\3\2\2\2\u047b\u047c\7~\2\2\u047c\u047d"+
		"\7~\2\2\u047d\u0126\3\2\2\2\u047e\u047f\7-\2\2\u047f\u0128\3\2\2\2\u0480"+
		"\u0481\7/\2\2\u0481\u012a\3\2\2\2\u0482\u0483\7,\2\2\u0483\u012c\3\2\2"+
		"\2\u0484\u0485\5\u00d5j\2\u0485\u012e\3\2\2\2\u0486\u0487\7(\2\2\u0487"+
		"\u0130\3\2\2\2\u0488\u0489\7~\2\2\u0489\u0132\3\2\2\2\u048a\u048b\7`\2"+
		"\2\u048b\u0134\3\2\2\2\u048c\u048d\7\'\2\2\u048d\u0136\3\2\2\2\u048e\u048f"+
		"\7-\2\2\u048f\u0490\7?\2\2\u0490\u0138\3\2\2\2\u0491\u0492\7/\2\2\u0492"+
		"\u0493\7?\2\2\u0493\u013a\3\2\2\2\u0494\u0495\7,\2\2\u0495\u0496\7?\2"+
		"\2\u0496\u013c\3\2\2\2\u0497\u0498\7\61\2\2\u0498\u0499\7?\2\2\u0499\u013e"+
		"\3\2\2\2\u049a\u049b\7(\2\2\u049b\u049c\7?\2\2\u049c\u0140\3\2\2\2\u049d"+
		"\u049e\7~\2\2\u049e\u049f\7?\2\2\u049f\u0142\3\2\2\2\u04a0\u04a1\7`\2"+
		"\2\u04a1\u04a2\7?\2\2\u04a2\u0144\3\2\2\2\u04a3\u04a4\7\'\2\2\u04a4\u04a5"+
		"\7?\2\2\u04a5\u0146\3\2\2\2\u04a6\u04a7\7>\2\2\u04a7\u04a8\7>\2\2\u04a8"+
		"\u04a9\7?\2\2\u04a9\u0148\3\2\2\2\u04aa\u04ab\7@\2\2\u04ab\u04ac\7@\2"+
		"\2\u04ac\u04ad\7?\2\2\u04ad\u014a\3\2\2\2\u04ae\u04af\7@\2\2\u04af\u04b0"+
		"\7@\2\2\u04b0\u04b1\7@\2\2\u04b1\u04b2\7?\2\2\u04b2\u014c\3\2\2\2\u04b3"+
		"\u04b4\7A\2\2\u04b4\u04b5\7?\2\2\u04b5\u014e\3\2\2\2\u04b6\u04b7\7,\2"+
		"\2\u04b7\u04b8\7,\2\2\u04b8\u04b9\7?\2\2\u04b9\u0150\3\2\2\2\u04ba\u04bb"+
		"\5\u0157\u00ab\2\u04bb\u04bf\6\u00a8\b\2\u04bc\u04be\5\u015b\u00ad\2\u04bd"+
		"\u04bc\3\2\2\2\u04be\u04c1\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2"+
		"\2\2\u04c0\u0152\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c2\u04c6\5\u0157\u00ab"+
		"\2\u04c3\u04c5\5\u015b\u00ad\2\u04c4\u04c3\3\2\2\2\u04c5\u04c8\3\2\2\2"+
		"\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u0154\3\2\2\2\u04c8\u04c6"+
		"\3\2\2\2\u04c9\u04cd\5\u0159\u00ac\2\u04ca\u04cc\5\u015d\u00ae\2\u04cb"+
		"\u04ca\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2"+
		"\2\2\u04ce\u0156\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d7\t\25\2\2\u04d1"+
		"\u04d2\n\26\2\2\u04d2\u04d7\6\u00ab\t\2\u04d3\u04d4\t\27\2\2\u04d4\u04d5"+
		"\t\30\2\2\u04d5\u04d7\6\u00ab\n\2\u04d6\u04d0\3\2\2\2\u04d6\u04d1\3\2"+
		"\2\2\u04d6\u04d3\3\2\2\2\u04d7\u0158\3\2\2\2\u04d8\u04d9\5\u0157\u00ab"+
		"\2\u04d9\u04da\6\u00ac\13\2\u04da\u015a\3\2\2\2\u04db\u04e2\t\31\2\2\u04dc"+
		"\u04dd\n\26\2\2\u04dd\u04e2\6\u00ad\f\2\u04de\u04df\t\27\2\2\u04df\u04e0"+
		"\t\30\2\2\u04e0\u04e2\6\u00ad\r\2\u04e1\u04db\3\2\2\2\u04e1\u04dc\3\2"+
		"\2\2\u04e1\u04de\3\2\2\2\u04e2\u015c\3\2\2\2\u04e3\u04e4\5\u015b\u00ad"+
		"\2\u04e4\u04e5\6\u00ae\16\2\u04e5\u015e\3\2\2\2\u04e6\u04e8\n\32\2\2\u04e7"+
		"\u04e6\3\2\2\2\u04e8\u04eb\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2"+
		"\2\2\u04ea\u0160\3\2\2\2\u04eb\u04e9\3\2\2\2\u04ec\u04ee\t\33\2\2\u04ed"+
		"\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3\2"+
		"\2\2\u04f0\u04f7\3\2\2\2\u04f1\u04f3\5\u00cdf\2\u04f2\u04f1\3\2\2\2\u04f3"+
		"\u04f4\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f7\3\2"+
		"\2\2\u04f6\u04ed\3\2\2\2\u04f6\u04f2\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8"+
		"\u04f9\b\u00b0\n\2\u04f9\u0162\3\2\2\2\u04fa\u04fb\5\u00cfg\2\u04fb\u0164"+
		"\3\2\2\2\u04fc\u04fd\7\61\2\2\u04fd\u04fe\7,\2\2\u04fe\u0502\3\2\2\2\u04ff"+
		"\u0501\13\2\2\2\u0500\u04ff\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0503\3"+
		"\2\2\2\u0502\u0500\3\2\2\2\u0503\u0505\3\2\2\2\u0504\u0502\3\2\2\2\u0505"+
		"\u0506\7,\2\2\u0506\u0507\7\61\2\2\u0507\u0508\3\2\2\2\u0508\u0509\b\u00b2"+
		"\13\2\u0509\u0166\3\2\2\2\u050a\u050b\7\61\2\2\u050b\u050c\7\61\2\2\u050c"+
		"\u0510\3\2\2\2\u050d\u050f\n\32\2\2\u050e\u050d\3\2\2\2\u050f\u0512\3"+
		"\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513\3\2\2\2\u0512"+
		"\u0510\3\2\2\2\u0513\u0514\b\u00b3\13\2\u0514\u0168\3\2\2\2\u0515\u0516"+
		"\7%\2\2\u0516\u0517\7#\2\2\u0517\u0518\3\2\2\2\u0518\u0519\b\u00b4\f\2"+
		"\u0519\u0522\5\u015f\u00af\2\u051a\u051b\5\u00cfg\2\u051b\u051c\7%\2\2"+
		"\u051c\u051d\7#\2\2\u051d\u051e\3\2\2\2\u051e\u051f\5\u015f\u00af\2\u051f"+
		"\u0521\3\2\2\2\u0520\u051a\3\2\2\2\u0521\u0524\3\2\2\2\u0522\u0520\3\2"+
		"\2\2\u0522\u0523\3\2\2\2\u0523\u0525\3\2\2\2\u0524\u0522\3\2\2\2\u0525"+
		"\u0526\b\u00b4\13\2\u0526\u016a\3\2\2\2\u0527\u0528\13\2\2\2\u0528\u0529"+
		"\b\u00b5\r\2\u0529\u016c\3\2\2\2M\2\3\4\u0171\u017a\u0184\u018c\u0195"+
		"\u019a\u01af\u01b5\u01c7\u01cd\u01d6\u01da\u01e1\u01e8\u01ef\u0203\u02e6"+
		"\u02eb\u02f2\u02f6\u02f8\u02fe\u0302\u0306\u030a\u0311\u0316\u0318\u031e"+
		"\u0322\u0326\u032c\u0331\u033d\u0341\u0347\u034b\u0353\u0357\u035d\u0367"+
		"\u036b\u0371\u0375\u037a\u037d\u0382\u0385\u038a\u038f\u0397\u03a2\u03a6"+
		"\u03ab\u03b0\u03c2\u03cb\u03d9\u03eb\u03ef\u04bf\u04c6\u04cd\u04d6\u04e1"+
		"\u04e9\u04ef\u04f4\u04f6\u0502\u0510\u0522\16\7\3\2\7\4\2\6\2\2\7\2\2"+
		"\3:\2\3:\3\3:\4\3T\5\b\2\2\tl\2\3\u00b4\6\3\u00b5\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}