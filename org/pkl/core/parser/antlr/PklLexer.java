// Generated from PklLexer.g4 by ANTLR 4.9.0

package org.pkl.core.parser.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

public class PklLexer extends Lexer {
	public static final int
		ABSTRACT=1, AMENDS=2, AS=3, CLASS=4, CONST=5, ELSE=6, EXTENDS=7, EXTERNAL=8, 
		FALSE=9, FIXED=10, FOR=11, FUNCTION=12, HIDDEN_=13, IF=14, IMPORT=15, 
		IMPORT_GLOB=16, IN=17, IS=18, LET=19, LOCAL=20, MODULE=21, NEW=22, NOTHING=23, 
		NULL=24, OPEN=25, OUT=26, OUTER=27, READ=28, READ_GLOB=29, READ_OR_NULL=30, 
		SUPER=31, THIS=32, THROW=33, TRACE=34, TRUE=35, TYPE_ALIAS=36, UNKNOWN=37, 
		WHEN=38, PROTECTED=39, OVERRIDE=40, RECORD=41, DELETE=42, CASE=43, SWITCH=44, 
		VARARG=45, LPAREN=46, RPAREN=47, LBRACE=48, RBRACE=49, LBRACK=50, RBRACK=51, 
		LPRED=52, COMMA=53, DOT=54, QDOT=55, COALESCE=56, NON_NULL=57, AT=58, 
		ASSIGN=59, GT=60, LT=61, NOT=62, QUESTION=63, COLON=64, ARROW=65, EQUAL=66, 
		NOT_EQUAL=67, LTE=68, GTE=69, AND=70, OR=71, PLUS=72, MINUS=73, POW=74, 
		STAR=75, DIV=76, INT_DIV=77, MOD=78, UNION=79, PIPE=80, SPREAD=81, QSPREAD=82, 
		UNDERSCORE=83, SLQuote=84, MLQuote=85, IntLiteral=86, FloatLiteral=87, 
		Identifier=88, NewlineSemicolon=89, Whitespace=90, DocComment=91, BlockComment=92, 
		LineComment=93, ShebangComment=94, SLEndQuote=95, SLInterpolation=96, 
		SLUnicodeEscape=97, SLCharacterEscape=98, SLCharacters=99, MLEndQuote=100, 
		MLInterpolation=101, MLUnicodeEscape=102, MLCharacterEscape=103, MLNewline=104, 
		MLCharacters=105;
	public static final int
		NewlineSemicolonChannel=2, WhitespaceChannel=3, CommentsChannel=4, ShebangChannel=5;
	public static final int
		SLString=1, MLString=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "NewlineSemicolonChannel", "WhitespaceChannel", 
                                     "CommentsChannel", "ShebangChannel"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "SLString", "MLString"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ABSTRACT", "AMENDS", "AS", "CLASS", "CONST", "ELSE", "EXTENDS", "EXTERNAL", 
			"FALSE", "FIXED", "FOR", "FUNCTION", "HIDDEN_", "IF", "IMPORT", "IMPORT_GLOB", 
			"IN", "IS", "LET", "LOCAL", "MODULE", "NEW", "NOTHING", "NULL", "OPEN", 
			"OUT", "OUTER", "READ", "READ_GLOB", "READ_OR_NULL", "SUPER", "THIS", 
			"THROW", "TRACE", "TRUE", "TYPE_ALIAS", "UNKNOWN", "WHEN", "PROTECTED", 
			"OVERRIDE", "RECORD", "DELETE", "CASE", "SWITCH", "VARARG", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "LPRED", "COMMA", "DOT", 
			"QDOT", "COALESCE", "NON_NULL", "AT", "ASSIGN", "GT", "LT", "NOT", "QUESTION", 
			"COLON", "ARROW", "EQUAL", "NOT_EQUAL", "LTE", "GTE", "AND", "OR", "PLUS", 
			"MINUS", "POW", "STAR", "DIV", "INT_DIV", "MOD", "UNION", "PIPE", "SPREAD", 
			"QSPREAD", "UNDERSCORE", "SLQuote", "MLQuote", "IntLiteral", "DecimalLiteral", 
			"DecimalDigitCharacters", "DecimalDigitCharacter", "DecimalDigit", "HexadecimalLiteral", 
			"HexadecimalCharacter", "BinaryLiteral", "BinaryCharacter", "OctalLiteral", 
			"OctalCharacter", "FloatLiteral", "Exponent", "Identifier", "RegularIdentifier", 
			"QuotedIdentifier", "IdentifierStart", "IdentifierPart", "NewlineSemicolon", 
			"Whitespace", "DocComment", "BlockComment", "LineComment", "ShebangComment", 
			"UnicodeEscape", "CharacterEscape", "Pounds", "Newline", "SLEndQuote", 
			"SLInterpolation", "SLUnicodeEscape", "SLCharacterEscape", "SLCharacters", 
			"MLEndQuote", "MLInterpolation", "MLUnicodeEscape", "MLCharacterEscape", 
			"MLNewline", "MLCharacters"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'amends'", "'as'", "'class'", "'const'", "'else'", 
			"'extends'", "'external'", "'false'", "'fixed'", "'for'", "'function'", 
			"'hidden'", "'if'", "'import'", "'import*'", "'in'", "'is'", "'let'", 
			"'local'", "'module'", "'new'", "'nothing'", "'null'", "'open'", "'out'", 
			"'outer'", "'read'", "'read*'", "'read?'", "'super'", "'this'", "'throw'", 
			"'trace'", "'true'", "'typealias'", "'unknown'", "'when'", "'protected'", 
			"'override'", "'record'", "'delete'", "'case'", "'switch'", "'vararg'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'[['", "','", "'.'", "'?.'", 
			"'??'", "'!!'", "'@'", "'='", "'>'", "'<'", "'!'", "'?'", "':'", "'->'", 
			"'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'+'", "'-'", "'**'", 
			"'*'", "'/'", "'~/'", "'%'", "'|'", "'|>'", "'...'", "'...?'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "AMENDS", "AS", "CLASS", "CONST", "ELSE", "EXTENDS", 
			"EXTERNAL", "FALSE", "FIXED", "FOR", "FUNCTION", "HIDDEN_", "IF", "IMPORT", 
			"IMPORT_GLOB", "IN", "IS", "LET", "LOCAL", "MODULE", "NEW", "NOTHING", 
			"NULL", "OPEN", "OUT", "OUTER", "READ", "READ_GLOB", "READ_OR_NULL", 
			"SUPER", "THIS", "THROW", "TRACE", "TRUE", "TYPE_ALIAS", "UNKNOWN", "WHEN", 
			"PROTECTED", "OVERRIDE", "RECORD", "DELETE", "CASE", "SWITCH", "VARARG", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "LPRED", 
			"COMMA", "DOT", "QDOT", "COALESCE", "NON_NULL", "AT", "ASSIGN", "GT", 
			"LT", "NOT", "QUESTION", "COLON", "ARROW", "EQUAL", "NOT_EQUAL", "LTE", 
			"GTE", "AND", "OR", "PLUS", "MINUS", "POW", "STAR", "DIV", "INT_DIV", 
			"MOD", "UNION", "PIPE", "SPREAD", "QSPREAD", "UNDERSCORE", "SLQuote", 
			"MLQuote", "IntLiteral", "FloatLiteral", "Identifier", "NewlineSemicolon", 
			"Whitespace", "DocComment", "BlockComment", "LineComment", "ShebangComment", 
			"SLEndQuote", "SLInterpolation", "SLUnicodeEscape", "SLCharacterEscape", 
			"SLCharacters", "MLEndQuote", "MLInterpolation", "MLUnicodeEscape", "MLCharacterEscape", 
			"MLNewline", "MLCharacters"
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	class StringInterpolationScope {
	  int parenLevel = 0;
	  int poundLength = 0;
	}

	java.util.Deque<StringInterpolationScope> interpolationScopes = new java.util.ArrayDeque<>();
	StringInterpolationScope interpolationScope;

	{ pushInterpolationScope(); }

	void pushInterpolationScope() {
	  interpolationScope = new StringInterpolationScope();
	  interpolationScopes.push(interpolationScope);
	}

	void incParenLevel() {
	  interpolationScope.parenLevel += 1;
	}

	void decParenLevel() {
	  if (interpolationScope.parenLevel == 0) {
	    // guard against syntax errors
	    if (interpolationScopes.size() > 1) {
	      interpolationScopes.pop();
	      interpolationScope = interpolationScopes.peek();
	      popMode();
	    }
	  } else {
	    interpolationScope.parenLevel -= 1;
	  }
	}

	boolean isPounds() {
	  // optimize for common cases (0, 1)
	  switch (interpolationScope.poundLength) {
	    case 0: return true;
	    case 1: return _input.LA(1) == '#';
	    default:
	      int poundLength = interpolationScope.poundLength;
	      for (int i = 1; i <= poundLength; i++) {
	        if (_input.LA(i) != '#') return false;
	      }
	      return true;
	  }
	}

	boolean isQuote() {
	  return _input.LA(1) == '"';
	}

	boolean endsWithPounds(String text) {
	  assert text.length() >= 2;

	  // optimize for common cases (0, 1)
	  switch (interpolationScope.poundLength) {
	    case 0: return true;
	    case 1: return text.charAt(text.length() - 1) == '#';
	    default:
	      int poundLength = interpolationScope.poundLength;
	      int textLength = text.length();
	      if (textLength < poundLength) return false;

	      int stop = textLength - poundLength;
	      for (int i = textLength - 1; i >= stop; i--) {
	        if (text.charAt(i) != '#') return false;
	      }

	      return true;
	  }
	}

	void removeBackTicks() {
	  String text = getText();
	  setText(text.substring(1, text.length() - 1));
	}

	// look ahead in predicate rather than consume in grammar so that newlines
	// go to NewlineSemicolonChannel, which is important for consumers of that channel
	boolean isNewlineOrEof() {
	  int input = _input.LA(1);
	  return input == '\n' || input == '\r' || input == IntStream.EOF;
	}



	public PklLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN);
		validateInputStream(_ATN, input);
	}

	@Override
	public String getGrammarFileName() { return "PklLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	@NotNull
	public String[] getChannelNames() { return channelNames; }

	@Override
	@NotNull
	public String[] getModeNames() { return modeNames; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 45:
			LPAREN_action(_localctx, actionIndex);
			break;

		case 46:
			RPAREN_action(_localctx, actionIndex);
			break;

		case 83:
			SLQuote_action(_localctx, actionIndex);
			break;

		case 84:
			MLQuote_action(_localctx, actionIndex);
			break;

		case 98:
			Identifier_action(_localctx, actionIndex);
			break;

		case 114:
			SLInterpolation_action(_localctx, actionIndex);
			break;

		case 119:
			MLInterpolation_action(_localctx, actionIndex);
			break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 incParenLevel(); 
			break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 decParenLevel(); 
			break;
		}
	}
	private void SLQuote_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 interpolationScope.poundLength = getText().length() - 1; 
			break;
		}
	}
	private void MLQuote_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 interpolationScope.poundLength = getText().length() - 3; 
			break;
		}
	}
	private void Identifier_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 removeBackTicks(); 
			break;
		}
	}
	private void SLInterpolation_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 pushInterpolationScope(); 
			break;
		}
	}
	private void MLInterpolation_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			 pushInterpolationScope(); 
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 101:
			return IdentifierStart_sempred(_localctx, predIndex);

		case 102:
			return IdentifierPart_sempred(_localctx, predIndex);

		case 107:
			return LineComment_sempred(_localctx, predIndex);

		case 108:
			return ShebangComment_sempred(_localctx, predIndex);

		case 111:
			return Pounds_sempred(_localctx, predIndex);

		case 117:
			return SLCharacters_sempred(_localctx, predIndex);

		case 123:
			return MLCharacters_sempred(_localctx, predIndex);
		}
		return true;
	}
	private boolean IdentifierStart_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isUnicodeIdentifierStart(_input.LA(-1));
		}
		return true;
	}
	private boolean IdentifierPart_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return Character.isUnicodeIdentifierPart(_input.LA(-1));
		}
		return true;
	}
	private boolean LineComment_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return isNewlineOrEof();
		}
		return true;
	}
	private boolean ShebangComment_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return isNewlineOrEof();
		}
		return true;
	}
	private boolean Pounds_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return  interpolationScope.poundLength == 0 ;

		case 5:
			return  interpolationScope.poundLength == 1 ;

		case 6:
			return  endsWithPounds(getText()) ;
		}
		return true;
	}
	private boolean SLCharacters_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return !isPounds();
		}
		return true;
	}
	private boolean MLCharacters_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return !isPounds();

		case 9:
			return !isQuote();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uc91d\ucaba\u058d\uafba\u4f53\u0607\uea8b\uc241\2k\u03bd\b\1\b\1\b"+
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
		"\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,"+
		"\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3"+
		"?\3@\3@\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3"+
		"H\3H\3H\3I\3I\3J\3J\3K\3K\3K\3L\3L\3M\3M\3N\3N\3N\3O\3O\3P\3P\3Q\3Q\3"+
		"Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3U\7U\u0276\nU\fU\16U\u0279\13U\3U"+
		"\3U\3U\3U\3U\3V\7V\u0281\nV\fV\16V\u0284\13V\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"W\3W\3W\3W\5W\u0292\nW\3X\3X\5X\u0296\nX\3Y\6Y\u0299\nY\rY\16Y\u029a\3"+
		"Z\3Z\5Z\u029f\nZ\3[\3[\3\\\3\\\3\\\3\\\6\\\u02a7\n\\\r\\\16\\\u02a8\3"+
		"]\3]\3^\3^\3^\3^\6^\u02b1\n^\r^\16^\u02b2\3_\3_\3`\3`\3`\3`\6`\u02bb\n"+
		"`\r`\16`\u02bc\3a\3a\3b\5b\u02c2\nb\3b\3b\5b\u02c6\nb\3b\3b\5b\u02ca\n"+
		"b\3b\3b\3b\5b\u02cf\nb\3c\3c\5c\u02d3\nc\3c\5c\u02d6\nc\3c\3c\3d\3d\3"+
		"d\3d\5d\u02de\nd\3e\3e\7e\u02e2\ne\fe\16e\u02e5\13e\3f\3f\6f\u02e9\nf"+
		"\rf\16f\u02ea\3f\3f\3g\3g\3g\5g\u02f2\ng\3h\3h\3h\5h\u02f7\nh\3i\6i\u02fa"+
		"\ni\ri\16i\u02fb\3i\3i\3j\6j\u0301\nj\rj\16j\u0302\3j\3j\3k\7k\u0308\n"+
		"k\fk\16k\u030b\13k\3k\3k\3k\3k\3k\7k\u0312\nk\fk\16k\u0315\13k\3k\3k\5"+
		"k\u0319\nk\6k\u031b\nk\rk\16k\u031c\3l\3l\3l\3l\3l\7l\u0324\nl\fl\16l"+
		"\u0327\13l\3l\3l\3l\3l\3l\3m\3m\3m\3m\7m\u0332\nm\fm\16m\u0335\13m\3m"+
		"\3m\3m\3m\3n\3n\3n\3n\7n\u033f\nn\fn\16n\u0342\13n\3n\3n\3n\3n\3o\3o\3"+
		"o\3o\3o\3o\7o\u034e\no\fo\16o\u0351\13o\3o\5o\u0354\no\3p\3p\3p\3p\3q"+
		"\3q\3q\3q\6q\u035e\nq\rq\16q\u035f\3q\5q\u0363\nq\3r\3r\3r\5r\u0368\n"+
		"r\5r\u036a\nr\3s\3s\3s\5s\u036f\ns\3s\3s\3t\3t\3t\3t\3t\3t\3t\3u\3u\3"+
		"v\3v\3w\6w\u037f\nw\rw\16w\u0380\3w\5w\u0384\nw\3w\3w\3w\5w\u0389\nw\5"+
		"w\u038b\nw\3x\3x\3x\3x\3x\3x\3x\3x\3y\3y\3y\3y\3y\3y\3y\3z\3z\3{\3{\3"+
		"|\3|\3}\6}\u03a3\n}\r}\16}\u03a4\3}\5}\u03a8\n}\3}\3}\3}\3}\5}\u03ae\n"+
		"}\3}\3}\5}\u03b2\n}\3}\3}\5}\u03b6\n}\3}\3}\5}\u03ba\n}\5}\u03bc\n}\6"+
		"\u0313\u0325\u0333\u0340\2\2~\5\2\3\7\2\4\t\2\5\13\2\6\r\2\7\17\2\b\21"+
		"\2\t\23\2\n\25\2\13\27\2\f\31\2\r\33\2\16\35\2\17\37\2\20!\2\21#\2\22"+
		"%\2\23\'\2\24)\2\25+\2\26-\2\27/\2\30\61\2\31\63\2\32\65\2\33\67\2\34"+
		"9\2\35;\2\36=\2\37?\2 A\2!C\2\"E\2#G\2$I\2%K\2&M\2\'O\2(Q\2)S\2*U\2+W"+
		"\2,Y\2-[\2.]\2/_\2\60a\2\61c\2\62e\2\63g\2\64i\2\65k\2\66m\2\67o\28q\2"+
		"9s\2:u\2;w\2<y\2={\2>}\2?\177\2@\u0081\2A\u0083\2B\u0085\2C\u0087\2D\u0089"+
		"\2E\u008b\2F\u008d\2G\u008f\2H\u0091\2I\u0093\2J\u0095\2K\u0097\2L\u0099"+
		"\2M\u009b\2N\u009d\2O\u009f\2P\u00a1\2Q\u00a3\2R\u00a5\2S\u00a7\2T\u00a9"+
		"\2U\u00ab\2V\u00ad\2W\u00af\2X\u00b1\2\2\u00b3\2\2\u00b5\2\2\u00b7\2\2"+
		"\u00b9\2\2\u00bb\2\2\u00bd\2\2\u00bf\2\2\u00c1\2\2\u00c3\2\2\u00c5\2Y"+
		"\u00c7\2\2\u00c9\2Z\u00cb\2\2\u00cd\2\2\u00cf\2\2\u00d1\2\2\u00d3\2[\u00d5"+
		"\2\\\u00d7\2]\u00d9\2^\u00db\2_\u00dd\2`\u00df\2\2\u00e1\2\2\u00e3\2\2"+
		"\u00e5\2\2\u00e7\2a\u00e9\2b\u00eb\2c\u00ed\2d\u00ef\2e\u00f1\2f\u00f3"+
		"\2g\u00f5\2h\u00f7\2i\u00f9\2j\u00fb\2k\5\2\3\4\20\3\2\62;\6\2\62;CHa"+
		"ach\4\2\62\63aa\4\2\629aa\4\2GGgg\4\2--//\3\2bb\6\2&&C\\aac|\7\2&&\62"+
		";C\\aac|\5\2\f\f\17\17==\5\2\13\13\16\16\"\"\7\2\f\f\17\17\"\"$$\177\177"+
		"\6\2\f\f\17\17$$^^\4\2$$^^\2\u03db\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af"+
		"\3\2\2\2\2\u00c5\3\2\2\2\2\u00c9\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2"+
		"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\3\u00e7"+
		"\3\2\2\2\3\u00e9\3\2\2\2\3\u00eb\3\2\2\2\3\u00ed\3\2\2\2\3\u00ef\3\2\2"+
		"\2\4\u00f1\3\2\2\2\4\u00f3\3\2\2\2\4\u00f5\3\2\2\2\4\u00f7\3\2\2\2\4\u00f9"+
		"\3\2\2\2\4\u00fb\3\2\2\2\5\u00fd\3\2\2\2\7\u0106\3\2\2\2\t\u010d\3\2\2"+
		"\2\13\u0110\3\2\2\2\r\u0116\3\2\2\2\17\u011c\3\2\2\2\21\u0121\3\2\2\2"+
		"\23\u0129\3\2\2\2\25\u0132\3\2\2\2\27\u0138\3\2\2\2\31\u013e\3\2\2\2\33"+
		"\u0142\3\2\2\2\35\u014b\3\2\2\2\37\u0152\3\2\2\2!\u0155\3\2\2\2#\u015c"+
		"\3\2\2\2%\u0164\3\2\2\2\'\u0167\3\2\2\2)\u016a\3\2\2\2+\u016e\3\2\2\2"+
		"-\u0174\3\2\2\2/\u017b\3\2\2\2\61\u017f\3\2\2\2\63\u0187\3\2\2\2\65\u018c"+
		"\3\2\2\2\67\u0191\3\2\2\29\u0195\3\2\2\2;\u019b\3\2\2\2=\u01a0\3\2\2\2"+
		"?\u01a6\3\2\2\2A\u01ac\3\2\2\2C\u01b2\3\2\2\2E\u01b7\3\2\2\2G\u01bd\3"+
		"\2\2\2I\u01c3\3\2\2\2K\u01c8\3\2\2\2M\u01d2\3\2\2\2O\u01da\3\2\2\2Q\u01df"+
		"\3\2\2\2S\u01e9\3\2\2\2U\u01f2\3\2\2\2W\u01f9\3\2\2\2Y\u0200\3\2\2\2["+
		"\u0205\3\2\2\2]\u020c\3\2\2\2_\u0213\3\2\2\2a\u0216\3\2\2\2c\u0219\3\2"+
		"\2\2e\u021b\3\2\2\2g\u021d\3\2\2\2i\u021f\3\2\2\2k\u0221\3\2\2\2m\u0224"+
		"\3\2\2\2o\u0226\3\2\2\2q\u0228\3\2\2\2s\u022b\3\2\2\2u\u022e\3\2\2\2w"+
		"\u0231\3\2\2\2y\u0233\3\2\2\2{\u0235\3\2\2\2}\u0237\3\2\2\2\177\u0239"+
		"\3\2\2\2\u0081\u023b\3\2\2\2\u0083\u023d\3\2\2\2\u0085\u023f\3\2\2\2\u0087"+
		"\u0242\3\2\2\2\u0089\u0245\3\2\2\2\u008b\u0248\3\2\2\2\u008d\u024b\3\2"+
		"\2\2\u008f\u024e\3\2\2\2\u0091\u0251\3\2\2\2\u0093\u0254\3\2\2\2\u0095"+
		"\u0256\3\2\2\2\u0097\u0258\3\2\2\2\u0099\u025b\3\2\2\2\u009b\u025d\3\2"+
		"\2\2\u009d\u025f\3\2\2\2\u009f\u0262\3\2\2\2\u00a1\u0264\3\2\2\2\u00a3"+
		"\u0266\3\2\2\2\u00a5\u0269\3\2\2\2\u00a7\u026d\3\2\2\2\u00a9\u0272\3\2"+
		"\2\2\u00ab\u0277\3\2\2\2\u00ad\u0282\3\2\2\2\u00af\u0291\3\2\2\2\u00b1"+
		"\u0293\3\2\2\2\u00b3\u0298\3\2\2\2\u00b5\u029e\3\2\2\2\u00b7\u02a0\3\2"+
		"\2\2\u00b9\u02a2\3\2\2\2\u00bb\u02aa\3\2\2\2\u00bd\u02ac\3\2\2\2\u00bf"+
		"\u02b4\3\2\2\2\u00c1\u02b6\3\2\2\2\u00c3\u02be\3\2\2\2\u00c5\u02ce\3\2"+
		"\2\2\u00c7\u02d0\3\2\2\2\u00c9\u02dd\3\2\2\2\u00cb\u02df\3\2\2\2\u00cd"+
		"\u02e6\3\2\2\2\u00cf\u02f1\3\2\2\2\u00d1\u02f6\3\2\2\2\u00d3\u02f9\3\2"+
		"\2\2\u00d5\u0300\3\2\2\2\u00d7\u031a\3\2\2\2\u00d9\u031e\3\2\2\2\u00db"+
		"\u032d\3\2\2\2\u00dd\u033a\3\2\2\2\u00df\u0347\3\2\2\2\u00e1\u0355\3\2"+
		"\2\2\u00e3\u0362\3\2\2\2\u00e5\u0369\3\2\2\2\u00e7\u036e\3\2\2\2\u00e9"+
		"\u0372\3\2\2\2\u00eb\u0379\3\2\2\2\u00ed\u037b\3\2\2\2\u00ef\u038a\3\2"+
		"\2\2\u00f1\u038c\3\2\2\2\u00f3\u0394\3\2\2\2\u00f5\u039b\3\2\2\2\u00f7"+
		"\u039d\3\2\2\2\u00f9\u039f\3\2\2\2\u00fb\u03bb\3\2\2\2\u00fd\u00fe\7c"+
		"\2\2\u00fe\u00ff\7d\2\2\u00ff\u0100\7u\2\2\u0100\u0101\7v\2\2\u0101\u0102"+
		"\7t\2\2\u0102\u0103\7c\2\2\u0103\u0104\7e\2\2\u0104\u0105\7v\2\2\u0105"+
		"\6\3\2\2\2\u0106\u0107\7c\2\2\u0107\u0108\7o\2\2\u0108\u0109\7g\2\2\u0109"+
		"\u010a\7p\2\2\u010a\u010b\7f\2\2\u010b\u010c\7u\2\2\u010c\b\3\2\2\2\u010d"+
		"\u010e\7c\2\2\u010e\u010f\7u\2\2\u010f\n\3\2\2\2\u0110\u0111\7e\2\2\u0111"+
		"\u0112\7n\2\2\u0112\u0113\7c\2\2\u0113\u0114\7u\2\2\u0114\u0115\7u\2\2"+
		"\u0115\f\3\2\2\2\u0116\u0117\7e\2\2\u0117\u0118\7q\2\2\u0118\u0119\7p"+
		"\2\2\u0119\u011a\7u\2\2\u011a\u011b\7v\2\2\u011b\16\3\2\2\2\u011c\u011d"+
		"\7g\2\2\u011d\u011e\7n\2\2\u011e\u011f\7u\2\2\u011f\u0120\7g\2\2\u0120"+
		"\20\3\2\2\2\u0121\u0122\7g\2\2\u0122\u0123\7z\2\2\u0123\u0124\7v\2\2\u0124"+
		"\u0125\7g\2\2\u0125\u0126\7p\2\2\u0126\u0127\7f\2\2\u0127\u0128\7u\2\2"+
		"\u0128\22\3\2\2\2\u0129\u012a\7g\2\2\u012a\u012b\7z\2\2\u012b\u012c\7"+
		"v\2\2\u012c\u012d\7g\2\2\u012d\u012e\7t\2\2\u012e\u012f\7p\2\2\u012f\u0130"+
		"\7c\2\2\u0130\u0131\7n\2\2\u0131\24\3\2\2\2\u0132\u0133\7h\2\2\u0133\u0134"+
		"\7c\2\2\u0134\u0135\7n\2\2\u0135\u0136\7u\2\2\u0136\u0137\7g\2\2\u0137"+
		"\26\3\2\2\2\u0138\u0139\7h\2\2\u0139\u013a\7k\2\2\u013a\u013b\7z\2\2\u013b"+
		"\u013c\7g\2\2\u013c\u013d\7f\2\2\u013d\30\3\2\2\2\u013e\u013f\7h\2\2\u013f"+
		"\u0140\7q\2\2\u0140\u0141\7t\2\2\u0141\32\3\2\2\2\u0142\u0143\7h\2\2\u0143"+
		"\u0144\7w\2\2\u0144\u0145\7p\2\2\u0145\u0146\7e\2\2\u0146\u0147\7v\2\2"+
		"\u0147\u0148\7k\2\2\u0148\u0149\7q\2\2\u0149\u014a\7p\2\2\u014a\34\3\2"+
		"\2\2\u014b\u014c\7j\2\2\u014c\u014d\7k\2\2\u014d\u014e\7f\2\2\u014e\u014f"+
		"\7f\2\2\u014f\u0150\7g\2\2\u0150\u0151\7p\2\2\u0151\36\3\2\2\2\u0152\u0153"+
		"\7k\2\2\u0153\u0154\7h\2\2\u0154 \3\2\2\2\u0155\u0156\7k\2\2\u0156\u0157"+
		"\7o\2\2\u0157\u0158\7r\2\2\u0158\u0159\7q\2\2\u0159\u015a\7t\2\2\u015a"+
		"\u015b\7v\2\2\u015b\"\3\2\2\2\u015c\u015d\7k\2\2\u015d\u015e\7o\2\2\u015e"+
		"\u015f\7r\2\2\u015f\u0160\7q\2\2\u0160\u0161\7t\2\2\u0161\u0162\7v\2\2"+
		"\u0162\u0163\7,\2\2\u0163$\3\2\2\2\u0164\u0165\7k\2\2\u0165\u0166\7p\2"+
		"\2\u0166&\3\2\2\2\u0167\u0168\7k\2\2\u0168\u0169\7u\2\2\u0169(\3\2\2\2"+
		"\u016a\u016b\7n\2\2\u016b\u016c\7g\2\2\u016c\u016d\7v\2\2\u016d*\3\2\2"+
		"\2\u016e\u016f\7n\2\2\u016f\u0170\7q\2\2\u0170\u0171\7e\2\2\u0171\u0172"+
		"\7c\2\2\u0172\u0173\7n\2\2\u0173,\3\2\2\2\u0174\u0175\7o\2\2\u0175\u0176"+
		"\7q\2\2\u0176\u0177\7f\2\2\u0177\u0178\7w\2\2\u0178\u0179\7n\2\2\u0179"+
		"\u017a\7g\2\2\u017a.\3\2\2\2\u017b\u017c\7p\2\2\u017c\u017d\7g\2\2\u017d"+
		"\u017e\7y\2\2\u017e\60\3\2\2\2\u017f\u0180\7p\2\2\u0180\u0181\7q\2\2\u0181"+
		"\u0182\7v\2\2\u0182\u0183\7j\2\2\u0183\u0184\7k\2\2\u0184\u0185\7p\2\2"+
		"\u0185\u0186\7i\2\2\u0186\62\3\2\2\2\u0187\u0188\7p\2\2\u0188\u0189\7"+
		"w\2\2\u0189\u018a\7n\2\2\u018a\u018b\7n\2\2\u018b\64\3\2\2\2\u018c\u018d"+
		"\7q\2\2\u018d\u018e\7r\2\2\u018e\u018f\7g\2\2\u018f\u0190\7p\2\2\u0190"+
		"\66\3\2\2\2\u0191\u0192\7q\2\2\u0192\u0193\7w\2\2\u0193\u0194\7v\2\2\u0194"+
		"8\3\2\2\2\u0195\u0196\7q\2\2\u0196\u0197\7w\2\2\u0197\u0198\7v\2\2\u0198"+
		"\u0199\7g\2\2\u0199\u019a\7t\2\2\u019a:\3\2\2\2\u019b\u019c\7t\2\2\u019c"+
		"\u019d\7g\2\2\u019d\u019e\7c\2\2\u019e\u019f\7f\2\2\u019f<\3\2\2\2\u01a0"+
		"\u01a1\7t\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7f\2\2"+
		"\u01a4\u01a5\7,\2\2\u01a5>\3\2\2\2\u01a6\u01a7\7t\2\2\u01a7\u01a8\7g\2"+
		"\2\u01a8\u01a9\7c\2\2\u01a9\u01aa\7f\2\2\u01aa\u01ab\7A\2\2\u01ab@\3\2"+
		"\2\2\u01ac\u01ad\7u\2\2\u01ad\u01ae\7w\2\2\u01ae\u01af\7r\2\2\u01af\u01b0"+
		"\7g\2\2\u01b0\u01b1\7t\2\2\u01b1B\3\2\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4"+
		"\7j\2\2\u01b4\u01b5\7k\2\2\u01b5\u01b6\7u\2\2\u01b6D\3\2\2\2\u01b7\u01b8"+
		"\7v\2\2\u01b8\u01b9\7j\2\2\u01b9\u01ba\7t\2\2\u01ba\u01bb\7q\2\2\u01bb"+
		"\u01bc\7y\2\2\u01bcF\3\2\2\2\u01bd\u01be\7v\2\2\u01be\u01bf\7t\2\2\u01bf"+
		"\u01c0\7c\2\2\u01c0\u01c1\7e\2\2\u01c1\u01c2\7g\2\2\u01c2H\3\2\2\2\u01c3"+
		"\u01c4\7v\2\2\u01c4\u01c5\7t\2\2\u01c5\u01c6\7w\2\2\u01c6\u01c7\7g\2\2"+
		"\u01c7J\3\2\2\2\u01c8\u01c9\7v\2\2\u01c9\u01ca\7{\2\2\u01ca\u01cb\7r\2"+
		"\2\u01cb\u01cc\7g\2\2\u01cc\u01cd\7c\2\2\u01cd\u01ce\7n\2\2\u01ce\u01cf"+
		"\7k\2\2\u01cf\u01d0\7c\2\2\u01d0\u01d1\7u\2\2\u01d1L\3\2\2\2\u01d2\u01d3"+
		"\7w\2\2\u01d3\u01d4\7p\2\2\u01d4\u01d5\7m\2\2\u01d5\u01d6\7p\2\2\u01d6"+
		"\u01d7\7q\2\2\u01d7\u01d8\7y\2\2\u01d8\u01d9\7p\2\2\u01d9N\3\2\2\2\u01da"+
		"\u01db\7y\2\2\u01db\u01dc\7j\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de\7p\2\2"+
		"\u01deP\3\2\2\2\u01df\u01e0\7r\2\2\u01e0\u01e1\7t\2\2\u01e1\u01e2\7q\2"+
		"\2\u01e2\u01e3\7v\2\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7e\2\2\u01e5\u01e6"+
		"\7v\2\2\u01e6\u01e7\7g\2\2\u01e7\u01e8\7f\2\2\u01e8R\3\2\2\2\u01e9\u01ea"+
		"\7q\2\2\u01ea\u01eb\7x\2\2\u01eb\u01ec\7g\2\2\u01ec\u01ed\7t\2\2\u01ed"+
		"\u01ee\7t\2\2\u01ee\u01ef\7k\2\2\u01ef\u01f0\7f\2\2\u01f0\u01f1\7g\2\2"+
		"\u01f1T\3\2\2\2\u01f2\u01f3\7t\2\2\u01f3\u01f4\7g\2\2\u01f4\u01f5\7e\2"+
		"\2\u01f5\u01f6\7q\2\2\u01f6\u01f7\7t\2\2\u01f7\u01f8\7f\2\2\u01f8V\3\2"+
		"\2\2\u01f9\u01fa\7f\2\2\u01fa\u01fb\7g\2\2\u01fb\u01fc\7n\2\2\u01fc\u01fd"+
		"\7g\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7g\2\2\u01ffX\3\2\2\2\u0200\u0201"+
		"\7e\2\2\u0201\u0202\7c\2\2\u0202\u0203\7u\2\2\u0203\u0204\7g\2\2\u0204"+
		"Z\3\2\2\2\u0205\u0206\7u\2\2\u0206\u0207\7y\2\2\u0207\u0208\7k\2\2\u0208"+
		"\u0209\7v\2\2\u0209\u020a\7e\2\2\u020a\u020b\7j\2\2\u020b\\\3\2\2\2\u020c"+
		"\u020d\7x\2\2\u020d\u020e\7c\2\2\u020e\u020f\7t\2\2\u020f\u0210\7c\2\2"+
		"\u0210\u0211\7t\2\2\u0211\u0212\7i\2\2\u0212^\3\2\2\2\u0213\u0214\7*\2"+
		"\2\u0214\u0215\b/\2\2\u0215`\3\2\2\2\u0216\u0217\7+\2\2\u0217\u0218\b"+
		"\60\3\2\u0218b\3\2\2\2\u0219\u021a\7}\2\2\u021ad\3\2\2\2\u021b\u021c\7"+
		"\177\2\2\u021cf\3\2\2\2\u021d\u021e\7]\2\2\u021eh\3\2\2\2\u021f\u0220"+
		"\7_\2\2\u0220j\3\2\2\2\u0221\u0222\7]\2\2\u0222\u0223\7]\2\2\u0223l\3"+
		"\2\2\2\u0224\u0225\7.\2\2\u0225n\3\2\2\2\u0226\u0227\7\60\2\2\u0227p\3"+
		"\2\2\2\u0228\u0229\7A\2\2\u0229\u022a\7\60\2\2\u022ar\3\2\2\2\u022b\u022c"+
		"\7A\2\2\u022c\u022d\7A\2\2\u022dt\3\2\2\2\u022e\u022f\7#\2\2\u022f\u0230"+
		"\7#\2\2\u0230v\3\2\2\2\u0231\u0232\7B\2\2\u0232x\3\2\2\2\u0233\u0234\7"+
		"?\2\2\u0234z\3\2\2\2\u0235\u0236\7@\2\2\u0236|\3\2\2\2\u0237\u0238\7>"+
		"\2\2\u0238~\3\2\2\2\u0239\u023a\7#\2\2\u023a\u0080\3\2\2\2\u023b\u023c"+
		"\7A\2\2\u023c\u0082\3\2\2\2\u023d\u023e\7<\2\2\u023e\u0084\3\2\2\2\u023f"+
		"\u0240\7/\2\2\u0240\u0241\7@\2\2\u0241\u0086\3\2\2\2\u0242\u0243\7?\2"+
		"\2\u0243\u0244\7?\2\2\u0244\u0088\3\2\2\2\u0245\u0246\7#\2\2\u0246\u0247"+
		"\7?\2\2\u0247\u008a\3\2\2\2\u0248\u0249\7>\2\2\u0249\u024a\7?\2\2\u024a"+
		"\u008c\3\2\2\2\u024b\u024c\7@\2\2\u024c\u024d\7?\2\2\u024d\u008e\3\2\2"+
		"\2\u024e\u024f\7(\2\2\u024f\u0250\7(\2\2\u0250\u0090\3\2\2\2\u0251\u0252"+
		"\7~\2\2\u0252\u0253\7~\2\2\u0253\u0092\3\2\2\2\u0254\u0255\7-\2\2\u0255"+
		"\u0094\3\2\2\2\u0256\u0257\7/\2\2\u0257\u0096\3\2\2\2\u0258\u0259\7,\2"+
		"\2\u0259\u025a\7,\2\2\u025a\u0098\3\2\2\2\u025b\u025c\7,\2\2\u025c\u009a"+
		"\3\2\2\2\u025d\u025e\7\61\2\2\u025e\u009c\3\2\2\2\u025f\u0260\7\u0080"+
		"\2\2\u0260\u0261\7\61\2\2\u0261\u009e\3\2\2\2\u0262\u0263\7\'\2\2\u0263"+
		"\u00a0\3\2\2\2\u0264\u0265\7~\2\2\u0265\u00a2\3\2\2\2\u0266\u0267\7~\2"+
		"\2\u0267\u0268\7@\2\2\u0268\u00a4\3\2\2\2\u0269\u026a\7\60\2\2\u026a\u026b"+
		"\7\60\2\2\u026b\u026c\7\60\2\2\u026c\u00a6\3\2\2\2\u026d\u026e\7\60\2"+
		"\2\u026e\u026f\7\60\2\2\u026f\u0270\7\60\2\2\u0270\u0271\7A\2\2\u0271"+
		"\u00a8\3\2\2\2\u0272\u0273\7a\2\2\u0273\u00aa\3\2\2\2\u0274\u0276\7%\2"+
		"\2\u0275\u0274\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027b\7$\2\2\u027b"+
		"\u027c\bU\4\2\u027c\u027d\3\2\2\2\u027d\u027e\bU\5\2\u027e\u00ac\3\2\2"+
		"\2\u027f\u0281\7%\2\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280"+
		"\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284\u0282\3\2\2\2\u0285"+
		"\u0286\7$\2\2\u0286\u0287\7$\2\2\u0287\u0288\7$\2\2\u0288\u0289\3\2\2"+
		"\2\u0289\u028a\bV\6\2\u028a\u028b\3\2\2\2\u028b\u028c\bV\7\2\u028c\u00ae"+
		"\3\2\2\2\u028d\u0292\5\u00b1X\2\u028e\u0292\5\u00b9\\\2\u028f\u0292\5"+
		"\u00bd^\2\u0290\u0292\5\u00c1`\2\u0291\u028d\3\2\2\2\u0291\u028e\3\2\2"+
		"\2\u0291\u028f\3\2\2\2\u0291\u0290\3\2\2\2\u0292\u00b0\3\2\2\2\u0293\u0295"+
		"\5\u00b7[\2\u0294\u0296\5\u00b3Y\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2"+
		"\2\2\u0296\u00b2\3\2\2\2\u0297\u0299\5\u00b5Z\2\u0298\u0297\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u00b4\3\2"+
		"\2\2\u029c\u029f\5\u00b7[\2\u029d\u029f\7a\2\2\u029e\u029c\3\2\2\2\u029e"+
		"\u029d\3\2\2\2\u029f\u00b6\3\2\2\2\u02a0\u02a1\t\2\2\2\u02a1\u00b8\3\2"+
		"\2\2\u02a2\u02a3\7\62\2\2\u02a3\u02a4\7z\2\2\u02a4\u02a6\3\2\2\2\u02a5"+
		"\u02a7\5\u00bb]\2\u02a6\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a6"+
		"\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u00ba\3\2\2\2\u02aa\u02ab\t\3\2\2\u02ab"+
		"\u00bc\3\2\2\2\u02ac\u02ad\7\62\2\2\u02ad\u02ae\7d\2\2\u02ae\u02b0\3\2"+
		"\2\2\u02af\u02b1\5\u00bf_\2\u02b0\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u00be\3\2\2\2\u02b4\u02b5\t\4"+
		"\2\2\u02b5\u00c0\3\2\2\2\u02b6\u02b7\7\62\2\2\u02b7\u02b8\7q\2\2\u02b8"+
		"\u02ba\3\2\2\2\u02b9\u02bb\5\u00c3a\2\u02ba\u02b9\3\2\2\2\u02bb\u02bc"+
		"\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u00c2\3\2\2\2\u02be"+
		"\u02bf\t\5\2\2\u02bf\u00c4\3\2\2\2\u02c0\u02c2\5\u00b1X\2\u02c1\u02c0"+
		"\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\7\60\2\2"+
		"\u02c4\u02c6\7a\2\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7\u02c9\5\u00b1X\2\u02c8\u02ca\5\u00c7c\2\u02c9\u02c8\3\2"+
		"\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cf\3\2\2\2\u02cb\u02cc\5\u00b1X\2\u02cc"+
		"\u02cd\5\u00c7c\2\u02cd\u02cf\3\2\2\2\u02ce\u02c1\3\2\2\2\u02ce\u02cb"+
		"\3\2\2\2\u02cf\u00c6\3\2\2\2\u02d0\u02d2\t\6\2\2\u02d1\u02d3\t\7\2\2\u02d2"+
		"\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d6\7a"+
		"\2\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"\u02d8\5\u00b1X\2\u02d8\u00c8\3\2\2\2\u02d9\u02de\5\u00cbe\2\u02da\u02db"+
		"\5\u00cdf\2\u02db\u02dc\bd\b\2\u02dc\u02de\3\2\2\2\u02dd\u02d9\3\2\2\2"+
		"\u02dd\u02da\3\2\2\2\u02de\u00ca\3\2\2\2\u02df\u02e3\5\u00cfg\2\u02e0"+
		"\u02e2\5\u00d1h\2\u02e1\u02e0\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1"+
		"\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u00cc\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6"+
		"\u02e8\7b\2\2\u02e7\u02e9\n\b\2\2\u02e8\u02e7\3\2\2\2\u02e9\u02ea\3\2"+
		"\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec"+
		"\u02ed\7b\2\2\u02ed\u00ce\3\2\2\2\u02ee\u02f2\t\t\2\2\u02ef\u02f0\13\2"+
		"\2\2\u02f0\u02f2\6g\2\2\u02f1\u02ee\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2"+
		"\u00d0\3\2\2\2\u02f3\u02f7\t\n\2\2\u02f4\u02f5\13\2\2\2\u02f5\u02f7\6"+
		"h\3\2\u02f6\u02f3\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u00d2\3\2\2\2\u02f8"+
		"\u02fa\t\13\2\2\u02f9\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02f9\3"+
		"\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\bi\t\2\u02fe"+
		"\u00d4\3\2\2\2\u02ff\u0301\t\f\2\2\u0300\u02ff\3\2\2\2\u0301\u0302\3\2"+
		"\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"\u0305\bj\n\2\u0305\u00d6\3\2\2\2\u0306\u0308\t\f\2\2\u0307\u0306\3\2"+
		"\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u030c\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u030d\7\61\2\2\u030d\u030e\7"+
		"\61\2\2\u030e\u030f\7\61\2\2\u030f\u0313\3\2\2\2\u0310\u0312\13\2\2\2"+
		"\u0311\u0310\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0314\3\2\2\2\u0313\u0311"+
		"\3\2\2\2\u0314\u0318\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0319\5\u00e5r"+
		"\2\u0317\u0319\7\2\2\3\u0318\u0316\3\2\2\2\u0318\u0317\3\2\2\2\u0319\u031b"+
		"\3\2\2\2\u031a\u0309\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031a\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u00d8\3\2\2\2\u031e\u031f\7\61\2\2\u031f\u0320\7"+
		",\2\2\u0320\u0325\3\2\2\2\u0321\u0324\5\u00d9l\2\u0322\u0324\13\2\2\2"+
		"\u0323\u0321\3\2\2\2\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2\2\2\u0328"+
		"\u0329\7,\2\2\u0329\u032a\7\61\2\2\u032a\u032b\3\2\2\2\u032b\u032c\bl"+
		"\13\2\u032c\u00da\3\2\2\2\u032d\u032e\7\61\2\2\u032e\u032f\7\61\2\2\u032f"+
		"\u0333\3\2\2\2\u0330\u0332\13\2\2\2\u0331\u0330\3\2\2\2\u0332\u0335\3"+
		"\2\2\2\u0333\u0334\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u0336\3\2\2\2\u0335"+
		"\u0333\3\2\2\2\u0336\u0337\6m\4\2\u0337\u0338\3\2\2\2\u0338\u0339\bm\13"+
		"\2\u0339\u00dc\3\2\2\2\u033a\u033b\7%\2\2\u033b\u033c\7#\2\2\u033c\u0340"+
		"\3\2\2\2\u033d\u033f\13\2\2\2\u033e\u033d\3\2\2\2\u033f\u0342\3\2\2\2"+
		"\u0340\u0341\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0343\3\2\2\2\u0342\u0340"+
		"\3\2\2\2\u0343\u0344\6n\5\2\u0344\u0345\3\2\2\2\u0345\u0346\bn\f\2\u0346"+
		"\u00de\3\2\2\2\u0347\u0348\7^\2\2\u0348\u0349\5\u00e3q\2\u0349\u034a\7"+
		"w\2\2\u034a\u034b\7}\2\2\u034b\u034f\3\2\2\2\u034c\u034e\n\r\2\2\u034d"+
		"\u034c\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0354\7\177\2\2\u0353"+
		"\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u00e0\3\2\2\2\u0355\u0356\7^"+
		"\2\2\u0356\u0357\5\u00e3q\2\u0357\u0358\13\2\2\2\u0358\u00e2\3\2\2\2\u0359"+
		"\u0363\6q\6\2\u035a\u035b\7%\2\2\u035b\u0363\6q\7\2\u035c\u035e\7%\2\2"+
		"\u035d\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360"+
		"\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\6q\b\2\u0362\u0359\3\2\2\2\u0362"+
		"\u035a\3\2\2\2\u0362\u035d\3\2\2\2\u0363\u00e4\3\2\2\2\u0364\u036a\7\f"+
		"\2\2\u0365\u0367\7\17\2\2\u0366\u0368\7\f\2\2\u0367\u0366\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u036a\3\2\2\2\u0369\u0364\3\2\2\2\u0369\u0365\3\2"+
		"\2\2\u036a\u00e6\3\2\2\2\u036b\u036c\7$\2\2\u036c\u036f\5\u00e3q\2\u036d"+
		"\u036f\5\u00e5r\2\u036e\u036b\3\2\2\2\u036e\u036d\3\2\2\2\u036f\u0370"+
		"\3\2\2\2\u0370\u0371\bs\r\2\u0371\u00e8\3\2\2\2\u0372\u0373\7^\2\2\u0373"+
		"\u0374\5\u00e3q\2\u0374\u0375\7*\2\2\u0375\u0376\bt\16\2\u0376\u0377\3"+
		"\2\2\2\u0377\u0378\bt\17\2\u0378\u00ea\3\2\2\2\u0379\u037a\5\u00dfo\2"+
		"\u037a\u00ec\3\2\2\2\u037b\u037c\5\u00e1p\2\u037c\u00ee\3\2\2\2\u037d"+
		"\u037f\n\16\2\2\u037e\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u037e\3"+
		"\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0384\5\u00efw\2"+
		"\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u038b\3\2\2\2\u0385\u0386"+
		"\t\17\2\2\u0386\u0388\6w\t\2\u0387\u0389\5\u00efw\2\u0388\u0387\3\2\2"+
		"\2\u0388\u0389\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u037e\3\2\2\2\u038a\u0385"+
		"\3\2\2\2\u038b\u00f0\3\2\2\2\u038c\u038d\7$\2\2\u038d\u038e\7$\2\2\u038e"+
		"\u038f\7$\2\2\u038f\u0390\3\2\2\2\u0390\u0391\5\u00e3q\2\u0391\u0392\3"+
		"\2\2\2\u0392\u0393\bx\r\2\u0393\u00f2\3\2\2\2\u0394\u0395\7^\2\2\u0395"+
		"\u0396\5\u00e3q\2\u0396\u0397\7*\2\2\u0397\u0398\by\20\2\u0398\u0399\3"+
		"\2\2\2\u0399\u039a\by\17\2\u039a\u00f4\3\2\2\2\u039b\u039c\5\u00dfo\2"+
		"\u039c\u00f6\3\2\2\2\u039d\u039e\5\u00e1p\2\u039e\u00f8\3\2\2\2\u039f"+
		"\u03a0\5\u00e5r\2\u03a0\u00fa\3\2\2\2\u03a1\u03a3\n\16\2\2\u03a2\u03a1"+
		"\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5"+
		"\u03a7\3\2\2\2\u03a6\u03a8\5\u00fb}\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8"+
		"\3\2\2\2\u03a8\u03bc\3\2\2\2\u03a9\u03ae\7^\2\2\u03aa\u03ab\7$\2\2\u03ab"+
		"\u03ac\7$\2\2\u03ac\u03ae\7$\2\2\u03ad\u03a9\3\2\2\2\u03ad\u03aa\3\2\2"+
		"\2\u03ae\u03af\3\2\2\2\u03af\u03b1\6}\n\2\u03b0\u03b2\5\u00fb}\2\u03b1"+
		"\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03bc\3\2\2\2\u03b3\u03b5\7$"+
		"\2\2\u03b4\u03b6\7$\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6"+
		"\u03b7\3\2\2\2\u03b7\u03b9\6}\13\2\u03b8\u03ba\5\u00fb}\2\u03b9\u03b8"+
		"\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03a2\3\2\2\2\u03bb"+
		"\u03ad\3\2\2\2\u03bb\u03b3\3\2\2\2\u03bc\u00fc\3\2\2\2\65\2\3\4\u0277"+
		"\u0282\u0291\u0295\u029a\u029e\u02a8\u02b2\u02bc\u02c1\u02c5\u02c9\u02ce"+
		"\u02d2\u02d5\u02dd\u02e3\u02ea\u02f1\u02f6\u02fb\u0302\u0309\u0313\u0318"+
		"\u031c\u0323\u0325\u0333\u0340\u034f\u0353\u035f\u0362\u0367\u0369\u036e"+
		"\u0380\u0383\u0388\u038a\u03a4\u03a7\u03ad\u03b1\u03b5\u03b9\u03bb\21"+
		"\3/\2\3\60\3\3U\4\7\3\2\3V\5\7\4\2\3d\6\2\4\2\2\5\2\2\6\2\2\7\2\6\2\2"+
		"\3t\7\7\2\2\3y\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
	}
}