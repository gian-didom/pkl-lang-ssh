// Generated from PklParser.g4 by ANTLR 4.9.0

package org.pkl.core.parser.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class PklParser extends Parser {
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
		RULE_replInput = 0, RULE_exprInput = 1, RULE_module = 2, RULE_moduleDecl = 3, 
		RULE_moduleHeader = 4, RULE_moduleExtendsOrAmendsClause = 5, RULE_importClause = 6, 
		RULE_clazz = 7, RULE_classHeader = 8, RULE_modifier = 9, RULE_classBody = 10, 
		RULE_typeAlias = 11, RULE_typeAliasHeader = 12, RULE_classProperty = 13, 
		RULE_classMethod = 14, RULE_methodHeader = 15, RULE_parameterList = 16, 
		RULE_argumentList = 17, RULE_annotation = 18, RULE_qualifiedIdentifier = 19, 
		RULE_typeAnnotation = 20, RULE_typeParameterList = 21, RULE_typeParameter = 22, 
		RULE_typeArgumentList = 23, RULE_type = 24, RULE_typedIdentifier = 25, 
		RULE_parameter = 26, RULE_expr = 27, RULE_objectBody = 28, RULE_objectMember = 29, 
		RULE_stringConstant = 30, RULE_singleLineStringPart = 31, RULE_multiLineStringPart = 32, 
		RULE_reservedKeyword = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"replInput", "exprInput", "module", "moduleDecl", "moduleHeader", "moduleExtendsOrAmendsClause", 
			"importClause", "clazz", "classHeader", "modifier", "classBody", "typeAlias", 
			"typeAliasHeader", "classProperty", "classMethod", "methodHeader", "parameterList", 
			"argumentList", "annotation", "qualifiedIdentifier", "typeAnnotation", 
			"typeParameterList", "typeParameter", "typeArgumentList", "type", "typedIdentifier", 
			"parameter", "expr", "objectBody", "objectMember", "stringConstant", 
			"singleLineStringPart", "multiLineStringPart", "reservedKeyword"
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

	@Override
	public String getGrammarFileName() { return "PklParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@NotNull
	private FailedPredicateException createFailedPredicateException() {
		return createFailedPredicateException(null);
	}

	@NotNull
	private FailedPredicateException createFailedPredicateException(@Nullable String predicate) {
		return createFailedPredicateException(predicate, null);
	}

	@NotNull
	protected FailedPredicateException createFailedPredicateException(@Nullable String predicate, @Nullable String message) {
		return new FailedPredicateException(this, predicate, message);
	}


	/**
	 * Returns true if and only if the next token to be consumed is not preceded by a newline or semicolon.
	 */
	boolean noNewlineOrSemicolon() {
	  for (int i = _input.index() - 1; i >= 0; i--) {
	    Token token = _input.get(i);
	    int channel = token.getChannel();
	    if (channel == PklLexer.DEFAULT_TOKEN_CHANNEL) return true;
	    if (channel == PklLexer.NewlineSemicolonChannel) return false;
	  }
	  return true;
	}

	public PklParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN);
	}

	public static class ReplInputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PklParser.EOF, 0); }
		public List<? extends ModuleDeclContext> moduleDecl() {
			return getRuleContexts(ModuleDeclContext.class);
		}
		public ModuleDeclContext moduleDecl(int i) {
			return getRuleContext(ModuleDeclContext.class,i);
		}
		public List<? extends ImportClauseContext> importClause() {
			return getRuleContexts(ImportClauseContext.class);
		}
		public ImportClauseContext importClause(int i) {
			return getRuleContext(ImportClauseContext.class,i);
		}
		public List<? extends ClazzContext> clazz() {
			return getRuleContexts(ClazzContext.class);
		}
		public ClazzContext clazz(int i) {
			return getRuleContext(ClazzContext.class,i);
		}
		public List<? extends TypeAliasContext> typeAlias() {
			return getRuleContexts(TypeAliasContext.class);
		}
		public TypeAliasContext typeAlias(int i) {
			return getRuleContext(TypeAliasContext.class,i);
		}
		public List<? extends ClassPropertyContext> classProperty() {
			return getRuleContexts(ClassPropertyContext.class);
		}
		public ClassPropertyContext classProperty(int i) {
			return getRuleContext(ClassPropertyContext.class,i);
		}
		public List<? extends ClassMethodContext> classMethod() {
			return getRuleContexts(ClassMethodContext.class);
		}
		public ClassMethodContext classMethod(int i) {
			return getRuleContext(ClassMethodContext.class,i);
		}
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ReplInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replInput; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitReplInput(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ReplInputContext replInput() throws RecognitionException {
		ReplInputContext _localctx = new ReplInputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_replInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << AMENDS) | (1L << CLASS) | (1L << CONST) | (1L << EXTENDS) | (1L << EXTERNAL) | (1L << FALSE) | (1L << FIXED) | (1L << FUNCTION) | (1L << HIDDEN_) | (1L << IF) | (1L << IMPORT) | (1L << IMPORT_GLOB) | (1L << LET) | (1L << LOCAL) | (1L << MODULE) | (1L << NEW) | (1L << NULL) | (1L << OPEN) | (1L << OUTER) | (1L << READ) | (1L << READ_GLOB) | (1L << READ_OR_NULL) | (1L << SUPER) | (1L << THIS) | (1L << THROW) | (1L << TRACE) | (1L << TRUE) | (1L << TYPE_ALIAS) | (1L << LPAREN) | (1L << AT) | (1L << NOT))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (MINUS - 73)) | (1L << (SLQuote - 73)) | (1L << (MLQuote - 73)) | (1L << (IntLiteral - 73)) | (1L << (FloatLiteral - 73)) | (1L << (Identifier - 73)) | (1L << (DocComment - 73)))) != 0)) {
				{
				{
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(68);
					moduleDecl();
					}
					break;

				case 2:
					{
					setState(69);
					importClause();
					}
					break;

				case 3:
					{
					setState(70);
					clazz();
					}
					break;

				case 4:
					{
					setState(71);
					typeAlias();
					}
					break;

				case 5:
					{
					setState(72);
					classProperty();
					}
					break;

				case 6:
					{
					setState(73);
					classMethod();
					}
					break;

				case 7:
					{
					setState(74);
					expr(0);
					}
					break;
				}
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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

	public static class ExprInputContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PklParser.EOF, 0); }
		public ExprInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprInput; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitExprInput(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ExprInputContext exprInput() throws RecognitionException {
		ExprInputContext _localctx = new ExprInputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			expr(0);
			setState(85);
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

	public static class ModuleContext extends ParserRuleContext {
		public ImportClauseContext importClause;
		public List<ImportClauseContext> is = new ArrayList<ImportClauseContext>();
		public ClazzContext clazz;
		public List<ClazzContext> cs = new ArrayList<ClazzContext>();
		public TypeAliasContext typeAlias;
		public List<TypeAliasContext> ts = new ArrayList<TypeAliasContext>();
		public ClassPropertyContext classProperty;
		public List<ClassPropertyContext> ps = new ArrayList<ClassPropertyContext>();
		public ClassMethodContext classMethod;
		public List<ClassMethodContext> ms = new ArrayList<ClassMethodContext>();
		public TerminalNode EOF() { return getToken(PklParser.EOF, 0); }
		public ModuleDeclContext moduleDecl() {
			return getRuleContext(ModuleDeclContext.class,0);
		}
		public List<? extends ImportClauseContext> importClause() {
			return getRuleContexts(ImportClauseContext.class);
		}
		public ImportClauseContext importClause(int i) {
			return getRuleContext(ImportClauseContext.class,i);
		}
		public List<? extends ClazzContext> clazz() {
			return getRuleContexts(ClazzContext.class);
		}
		public ClazzContext clazz(int i) {
			return getRuleContext(ClazzContext.class,i);
		}
		public List<? extends TypeAliasContext> typeAlias() {
			return getRuleContexts(TypeAliasContext.class);
		}
		public TypeAliasContext typeAlias(int i) {
			return getRuleContext(TypeAliasContext.class,i);
		}
		public List<? extends ClassPropertyContext> classProperty() {
			return getRuleContexts(ClassPropertyContext.class);
		}
		public ClassPropertyContext classProperty(int i) {
			return getRuleContext(ClassPropertyContext.class,i);
		}
		public List<? extends ClassMethodContext> classMethod() {
			return getRuleContexts(ClassMethodContext.class);
		}
		public ClassMethodContext classMethod(int i) {
			return getRuleContext(ClassMethodContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(87);
				moduleDecl();
				}
				break;
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT || _la==IMPORT_GLOB) {
				{
				{
				setState(90);
				_localctx.importClause = importClause();
				_localctx.is.add(_localctx.importClause);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << CONST) | (1L << EXTERNAL) | (1L << FIXED) | (1L << FUNCTION) | (1L << HIDDEN_) | (1L << LOCAL) | (1L << OPEN) | (1L << TYPE_ALIAS) | (1L << AT))) != 0) || _la==Identifier || _la==DocComment) {
				{
				{
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(96);
					_localctx.clazz = clazz();
					_localctx.cs.add(_localctx.clazz);
					}
					break;

				case 2:
					{
					setState(97);
					_localctx.typeAlias = typeAlias();
					_localctx.ts.add(_localctx.typeAlias);
					}
					break;

				case 3:
					{
					setState(98);
					_localctx.classProperty = classProperty();
					_localctx.ps.add(_localctx.classProperty);
					}
					break;

				case 4:
					{
					setState(99);
					_localctx.classMethod = classMethod();
					_localctx.ms.add(_localctx.classMethod);
					}
					break;
				}
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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

	public static class ModuleDeclContext extends ParserRuleContext {
		public Token t;
		public ModuleHeaderContext moduleHeader() {
			return getRuleContext(ModuleHeaderContext.class,0);
		}
		public List<? extends AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode DocComment() { return getToken(PklParser.DocComment, 0); }
		public ModuleDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDecl; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitModuleDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ModuleDeclContext moduleDecl() throws RecognitionException {
		ModuleDeclContext _localctx = new ModuleDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moduleDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocComment) {
				{
				setState(109);
				_localctx.t = match(DocComment);
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(112);
				annotation();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			moduleHeader();
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

	public static class ModuleHeaderContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(PklParser.MODULE, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public List<? extends ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModuleExtendsOrAmendsClauseContext moduleExtendsOrAmendsClause() {
			return getRuleContext(ModuleExtendsOrAmendsClauseContext.class,0);
		}
		public ModuleHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleHeader; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitModuleHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ModuleHeaderContext moduleHeader() throws RecognitionException {
		ModuleHeaderContext _localctx = new ModuleHeaderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moduleHeader);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CONST:
			case EXTERNAL:
			case FIXED:
			case HIDDEN_:
			case LOCAL:
			case MODULE:
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CONST) | (1L << EXTERNAL) | (1L << FIXED) | (1L << HIDDEN_) | (1L << LOCAL) | (1L << OPEN))) != 0)) {
					{
					{
					setState(120);
					modifier();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(MODULE);
				setState(127);
				qualifiedIdentifier();
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(128);
					moduleExtendsOrAmendsClause();
					}
					break;
				}
				}
				break;
			case AMENDS:
			case EXTENDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				moduleExtendsOrAmendsClause();
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

	public static class ModuleExtendsOrAmendsClauseContext extends ParserRuleContext {
		public Token t;
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(PklParser.EXTENDS, 0); }
		public TerminalNode AMENDS() { return getToken(PklParser.AMENDS, 0); }
		public ModuleExtendsOrAmendsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleExtendsOrAmendsClause; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitModuleExtendsOrAmendsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ModuleExtendsOrAmendsClauseContext moduleExtendsOrAmendsClause() throws RecognitionException {
		ModuleExtendsOrAmendsClauseContext _localctx = new ModuleExtendsOrAmendsClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moduleExtendsOrAmendsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_localctx.t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==AMENDS || _la==EXTENDS) ) {
				_localctx.t = _errHandler.recoverInline(this);
			} else {
				if (_input.LA(1) == Token.EOF) {
					matchedEOF = true;
				}

				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			stringConstant();
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

	public static class ImportClauseContext extends ParserRuleContext {
		public Token t;
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(PklParser.IMPORT, 0); }
		public TerminalNode IMPORT_GLOB() { return getToken(PklParser.IMPORT_GLOB, 0); }
		public TerminalNode AS() { return getToken(PklParser.AS, 0); }
		public TerminalNode Identifier() { return getToken(PklParser.Identifier, 0); }
		public ImportClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importClause; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitImportClause(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ImportClauseContext importClause() throws RecognitionException {
		ImportClauseContext _localctx = new ImportClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_localctx.t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==IMPORT || _la==IMPORT_GLOB) ) {
				_localctx.t = _errHandler.recoverInline(this);
			} else {
				if (_input.LA(1) == Token.EOF) {
					matchedEOF = true;
				}

				_errHandler.reportMatch(this);
				consume();
			}
			setState(138);
			stringConstant();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(139);
				match(AS);
				setState(140);
				match(Identifier);
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

	public static class ClazzContext extends ParserRuleContext {
		public Token t;
		public ClassHeaderContext classHeader() {
			return getRuleContext(ClassHeaderContext.class,0);
		}
		public List<? extends AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode DocComment() { return getToken(PklParser.DocComment, 0); }
		public ClazzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clazz; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitClazz(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ClazzContext clazz() throws RecognitionException {
		ClazzContext _localctx = new ClazzContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_clazz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocComment) {
				{
				setState(143);
				_localctx.t = match(DocComment);
				}
			}

			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(146);
				annotation();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			classHeader();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(153);
				classBody();
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

	public static class ClassHeaderContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PklParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(PklParser.Identifier, 0); }
		public List<? extends ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(PklParser.EXTENDS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeader; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitClassHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ClassHeaderContext classHeader() throws RecognitionException {
		ClassHeaderContext _localctx = new ClassHeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CONST) | (1L << EXTERNAL) | (1L << FIXED) | (1L << HIDDEN_) | (1L << LOCAL) | (1L << OPEN))) != 0)) {
				{
				{
				setState(156);
				modifier();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(CLASS);
			setState(163);
			match(Identifier);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(164);
				typeParameterList();
				}
			}

			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(167);
				match(EXTENDS);
				setState(168);
				type(0);
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

	public static class ModifierContext extends ParserRuleContext {
		public Token t;
		public TerminalNode EXTERNAL() { return getToken(PklParser.EXTERNAL, 0); }
		public TerminalNode ABSTRACT() { return getToken(PklParser.ABSTRACT, 0); }
		public TerminalNode OPEN() { return getToken(PklParser.OPEN, 0); }
		public TerminalNode LOCAL() { return getToken(PklParser.LOCAL, 0); }
		public TerminalNode HIDDEN_() { return getToken(PklParser.HIDDEN_, 0); }
		public TerminalNode FIXED() { return getToken(PklParser.FIXED, 0); }
		public TerminalNode CONST() { return getToken(PklParser.CONST, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_localctx.t = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CONST) | (1L << EXTERNAL) | (1L << FIXED) | (1L << HIDDEN_) | (1L << LOCAL) | (1L << OPEN))) != 0)) ) {
				_localctx.t = _errHandler.recoverInline(this);
			} else {
				if (_input.LA(1) == Token.EOF) {
					matchedEOF = true;
				}

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

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassPropertyContext classProperty;
		public List<ClassPropertyContext> ps = new ArrayList<ClassPropertyContext>();
		public ClassMethodContext classMethod;
		public List<ClassMethodContext> ms = new ArrayList<ClassMethodContext>();
		public Token err;
		public TerminalNode LBRACE() { return getToken(PklParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PklParser.RBRACE, 0); }
		public List<? extends ClassPropertyContext> classProperty() {
			return getRuleContexts(ClassPropertyContext.class);
		}
		public ClassPropertyContext classProperty(int i) {
			return getRuleContext(ClassPropertyContext.class,i);
		}
		public List<? extends ClassMethodContext> classMethod() {
			return getRuleContexts(ClassMethodContext.class);
		}
		public ClassMethodContext classMethod(int i) {
			return getRuleContext(ClassMethodContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(LBRACE);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(174);
						_localctx.classProperty = classProperty();
						_localctx.ps.add(_localctx.classProperty);
						}
						break;

					case 2:
						{
						setState(175);
						_localctx.classMethod = classMethod();
						_localctx.ms.add(_localctx.classMethod);
						}
						break;
					}
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RBRACE) {
				{
				setState(183);
				_localctx.err = match(RBRACE);
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

	public static class TypeAliasContext extends ParserRuleContext {
		public Token t;
		public TypeAliasHeaderContext typeAliasHeader() {
			return getRuleContext(TypeAliasHeaderContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PklParser.ASSIGN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<? extends AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode DocComment() { return getToken(PklParser.DocComment, 0); }
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitTypeAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocComment) {
				{
				setState(186);
				_localctx.t = match(DocComment);
				}
			}

			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(189);
				annotation();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			typeAliasHeader();
			setState(196);
			match(ASSIGN);
			setState(197);
			type(0);
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

	public static class TypeAliasHeaderContext extends ParserRuleContext {
		public TerminalNode TYPE_ALIAS() { return getToken(PklParser.TYPE_ALIAS, 0); }
		public TerminalNode Identifier() { return getToken(PklParser.Identifier, 0); }
		public List<? extends ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeAliasHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAliasHeader; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitTypeAliasHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final TypeAliasHeaderContext typeAliasHeader() throws RecognitionException {
		TypeAliasHeaderContext _localctx = new TypeAliasHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeAliasHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CONST) | (1L << EXTERNAL) | (1L << FIXED) | (1L << HIDDEN_) | (1L << LOCAL) | (1L << OPEN))) != 0)) {
				{
				{
				setState(199);
				modifier();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(TYPE_ALIAS);
			setState(206);
			match(Identifier);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(207);
				typeParameterList();
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

	public static class ClassPropertyContext extends ParserRuleContext {
		public Token t;
		public TerminalNode Identifier() { return getToken(PklParser.Identifier, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public List<? extends AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<? extends ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode DocComment() { return getToken(PklParser.DocComment, 0); }
		public TerminalNode ASSIGN() { return getToken(PklParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<? extends ObjectBodyContext> objectBody() {
			return getRuleContexts(ObjectBodyContext.class);
		}
		public ObjectBodyContext objectBody(int i) {
			return getRuleContext(ObjectBodyContext.class,i);
		}
		public ClassPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classProperty; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitClassProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ClassPropertyContext classProperty() throws RecognitionException {
		ClassPropertyContext _localctx = new ClassPropertyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocComment) {
				{
				setState(210);
				_localctx.t = match(DocComment);
				}
			}

			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(213);
				annotation();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CONST) | (1L << EXTERNAL) | (1L << FIXED) | (1L << HIDDEN_) | (1L << LOCAL) | (1L << OPEN))) != 0)) {
				{
				{
				setState(219);
				modifier();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(Identifier);
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(226);
				typeAnnotation();
				}
				break;

			case 2:
				{
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(227);
					typeAnnotation();
					}
				}

				setState(237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(230);
					match(ASSIGN);
					setState(231);
					expr(0);
					}
					break;
				case LBRACE:
					{
					setState(233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(232);
						objectBody();
						}
						}
						setState(235); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LBRACE );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ClassMethodContext extends ParserRuleContext {
		public Token t;
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public List<? extends AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(PklParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DocComment() { return getToken(PklParser.DocComment, 0); }
		public ClassMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethod; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitClassMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ClassMethodContext classMethod() throws RecognitionException {
		ClassMethodContext _localctx = new ClassMethodContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocComment) {
				{
				setState(241);
				_localctx.t = match(DocComment);
				}
			}

			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(244);
				annotation();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			methodHeader();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(251);
				match(ASSIGN);
				setState(252);
				expr(0);
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

	public static class MethodHeaderContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PklParser.FUNCTION, 0); }
		public TerminalNode Identifier() { return getToken(PklParser.Identifier, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<? extends ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CONST) | (1L << EXTERNAL) | (1L << FIXED) | (1L << HIDDEN_) | (1L << LOCAL) | (1L << OPEN))) != 0)) {
				{
				{
				setState(255);
				modifier();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(FUNCTION);
			setState(262);
			match(Identifier);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(263);
				typeParameterList();
				}
			}

			setState(266);
			parameterList();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(267);
				typeAnnotation();
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterContext parameter;
		public List<ParameterContext> ts = new ArrayList<ParameterContext>();
		public Token s53;
		public List<Token> errs = new ArrayList<Token>();
		public Token err;
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public List<? extends ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public List<? extends TerminalNode> COMMA() { return getTokens(PklParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PklParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(LPAREN);
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(271);
				_localctx.parameter = parameter();
				_localctx.ts.add(_localctx.parameter);
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(273);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(272);
							_localctx.s53 = match(COMMA);
							_localctx.errs.add(_localctx.s53);
							}
						}

						setState(275);
						_localctx.parameter = parameter();
						_localctx.ts.add(_localctx.parameter);
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(283);
				_localctx.err = match(RPAREN);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ExprContext expr;
		public List<ExprContext> es = new ArrayList<ExprContext>();
		public Token s53;
		public List<Token> errs = new ArrayList<Token>();
		public Token err;
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public List<? extends TerminalNode> COMMA() { return getTokens(PklParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PklParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			if (!(noNewlineOrSemicolon())) throw createFailedPredicateException("noNewlineOrSemicolon()");
			setState(287);
			match(LPAREN);
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(288);
				_localctx.expr = expr(0);
				_localctx.es.add(_localctx.expr);
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(290);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(289);
							_localctx.s53 = match(COMMA);
							_localctx.errs.add(_localctx.s53);
							}
						}

						setState(292);
						_localctx.expr = expr(0);
						_localctx.es.add(_localctx.expr);
						}
						} 
					}
					setState(297);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			}
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(300);
				_localctx.err = match(RPAREN);
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PklParser.AT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ObjectBodyContext objectBody() {
			return getRuleContext(ObjectBodyContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(AT);
			setState(304);
			type(0);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(305);
				objectBody();
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

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public Token Identifier;
		public List<Token> ts = new ArrayList<Token>();
		public List<? extends TerminalNode> Identifier() { return getTokens(PklParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PklParser.Identifier, i);
		}
		public List<? extends TerminalNode> DOT() { return getTokens(PklParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PklParser.DOT, i);
		}
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitQualifiedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_qualifiedIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_localctx.Identifier = match(Identifier);
			_localctx.ts.add(_localctx.Identifier);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					match(DOT);
					setState(310);
					_localctx.Identifier = match(Identifier);
					_localctx.ts.add(_localctx.Identifier);
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class TypeAnnotationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PklParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(COLON);
			setState(317);
			type(0);
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

	public static class TypeParameterListContext extends ParserRuleContext {
		public TypeParameterContext typeParameter;
		public List<TypeParameterContext> ts = new ArrayList<TypeParameterContext>();
		public Token s53;
		public List<Token> errs = new ArrayList<Token>();
		public Token err;
		public TerminalNode LT() { return getToken(PklParser.LT, 0); }
		public List<? extends TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(PklParser.GT, 0); }
		public List<? extends TerminalNode> COMMA() { return getTokens(PklParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PklParser.COMMA, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeParameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(LT);
			setState(320);
			_localctx.typeParameter = typeParameter();
			_localctx.ts.add(_localctx.typeParameter);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(321);
						_localctx.s53 = match(COMMA);
						_localctx.errs.add(_localctx.s53);
						}
					}

					setState(324);
					_localctx.typeParameter = typeParameter();
					_localctx.ts.add(_localctx.typeParameter);
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GT) {
				{
				setState(330);
				_localctx.err = match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public Token t;
		public TerminalNode Identifier() { return getToken(PklParser.Identifier, 0); }
		public TerminalNode IN() { return getToken(PklParser.IN, 0); }
		public TerminalNode OUT() { return getToken(PklParser.OUT, 0); }
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==OUT) {
				{
				setState(333);
				_localctx.t = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OUT) ) {
					_localctx.t = _errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) {
						matchedEOF = true;
					}

					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(336);
			match(Identifier);
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

	public static class TypeArgumentListContext extends ParserRuleContext {
		public TypeContext type;
		public List<TypeContext> ts = new ArrayList<TypeContext>();
		public Token s53;
		public List<Token> errs = new ArrayList<Token>();
		public Token err;
		public TerminalNode LT() { return getToken(PklParser.LT, 0); }
		public List<? extends TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(PklParser.GT, 0); }
		public List<? extends TerminalNode> COMMA() { return getTokens(PklParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PklParser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(LT);
			setState(339);
			_localctx.type = type(0);
			_localctx.ts.add(_localctx.type);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(340);
						_localctx.s53 = match(COMMA);
						_localctx.errs.add(_localctx.s53);
						}
					}

					setState(343);
					_localctx.type = type(0);
					_localctx.ts.add(_localctx.type);
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(349);
				_localctx.err = match(GT);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnknownTypeContext extends TypeContext {
		public TerminalNode UNKNOWN() { return getToken(PklParser.UNKNOWN, 0); }
		public UnknownTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitUnknownType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NothingTypeContext extends TypeContext {
		public TerminalNode NOTHING() { return getToken(PklParser.NOTHING, 0); }
		public NothingTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitNothingType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuleTypeContext extends TypeContext {
		public TerminalNode MODULE() { return getToken(PklParser.MODULE, 0); }
		public ModuleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitModuleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralTypeContext extends TypeContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public StringLiteralTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitStringLiteralType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaredTypeContext extends TypeContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public DeclaredTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitDeclaredType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedTypeContext extends TypeContext {
		public Token err;
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public ParenthesizedTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitParenthesizedType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullableTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(PklParser.QUESTION, 0); }
		public NullableTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitNullableType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstrainedTypeContext extends TypeContext {
		public Token t;
		public ExprContext expr;
		public List<ExprContext> es = new ArrayList<ExprContext>();
		public Token s53;
		public List<Token> errs = new ArrayList<Token>();
		public Token err;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public List<? extends TerminalNode> COMMA() { return getTokens(PklParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PklParser.COMMA, i);
		}
		public ConstrainedTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitConstrainedType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefaultUnionTypeContext extends TypeContext {
		public TypeContext u;
		public TerminalNode STAR() { return getToken(PklParser.STAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DefaultUnionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitDefaultUnionType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionTypeContext extends TypeContext {
		public TypeContext l;
		public TypeContext r;
		public TerminalNode UNION() { return getToken(PklParser.UNION, 0); }
		public List<? extends TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public UnionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionTypeContext extends TypeContext {
		public Token t;
		public TypeContext type;
		public List<TypeContext> ps = new ArrayList<TypeContext>();
		public Token s53;
		public List<Token> errs = new ArrayList<Token>();
		public Token err;
		public TypeContext r;
		public TerminalNode ARROW() { return getToken(PklParser.ARROW, 0); }
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public List<? extends TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public List<? extends TerminalNode> COMMA() { return getTokens(PklParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PklParser.COMMA, i);
		}
		public FunctionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				_localctx = new UnknownTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(353);
				match(UNKNOWN);
				}
				break;

			case 2:
				{
				_localctx = new NothingTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				match(NOTHING);
				}
				break;

			case 3:
				{
				_localctx = new ModuleTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				match(MODULE);
				}
				break;

			case 4:
				{
				_localctx = new StringLiteralTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				stringConstant();
				}
				break;

			case 5:
				{
				_localctx = new DeclaredTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357);
				qualifiedIdentifier();
				setState(359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(358);
					typeArgumentList();
					}
					break;
				}
				}
				break;

			case 6:
				{
				_localctx = new ParenthesizedTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				match(LPAREN);
				setState(362);
				type(0);
				setState(364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(363);
					((ParenthesizedTypeContext)_localctx).err = match(RPAREN);
					}
					break;
				}
				}
				break;

			case 7:
				{
				_localctx = new DefaultUnionTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(STAR);
				setState(367);
				((DefaultUnionTypeContext)_localctx).u = type(3);
				}
				break;

			case 8:
				{
				_localctx = new FunctionTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(368);
				((FunctionTypeContext)_localctx).t = match(LPAREN);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << NOTHING) | (1L << UNKNOWN) | (1L << LPAREN))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (STAR - 75)) | (1L << (SLQuote - 75)) | (1L << (Identifier - 75)))) != 0)) {
					{
					setState(369);
					((FunctionTypeContext)_localctx).type = type(0);
					((FunctionTypeContext)_localctx).ps.add(((FunctionTypeContext)_localctx).type);
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << NOTHING) | (1L << UNKNOWN) | (1L << LPAREN) | (1L << COMMA))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (STAR - 75)) | (1L << (SLQuote - 75)) | (1L << (Identifier - 75)))) != 0)) {
						{
						{
						setState(371);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(370);
							((FunctionTypeContext)_localctx).s53 = match(COMMA);
							((FunctionTypeContext)_localctx).errs.add(((FunctionTypeContext)_localctx).s53);
							}
						}

						setState(373);
						((FunctionTypeContext)_localctx).type = type(0);
						((FunctionTypeContext)_localctx).ps.add(((FunctionTypeContext)_localctx).type);
						}
						}
						setState(378);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RPAREN) {
					{
					setState(381);
					((FunctionTypeContext)_localctx).err = match(RPAREN);
					}
				}

				setState(384);
				match(ARROW);
				setState(385);
				((FunctionTypeContext)_localctx).r = type(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(409);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						_localctx = new UnionTypeContext(new TypeContext(_parentctx, _parentState));
						((UnionTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(388);
						if (!(precpred(_ctx, 2))) throw createFailedPredicateException("precpred(_ctx, 2)");
						setState(389);
						match(UNION);
						setState(390);
						((UnionTypeContext)_localctx).r = type(3);
						}
						break;

					case 2:
						{
						_localctx = new NullableTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(391);
						if (!(precpred(_ctx, 5))) throw createFailedPredicateException("precpred(_ctx, 5)");
						setState(392);
						match(QUESTION);
						}
						break;

					case 3:
						{
						_localctx = new ConstrainedTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(393);
						if (!(precpred(_ctx, 4))) throw createFailedPredicateException("precpred(_ctx, 4)");
						setState(394);
						if (!(noNewlineOrSemicolon())) throw createFailedPredicateException("noNewlineOrSemicolon()");
						setState(395);
						((ConstrainedTypeContext)_localctx).t = match(LPAREN);
						setState(396);
						((ConstrainedTypeContext)_localctx).expr = expr(0);
						((ConstrainedTypeContext)_localctx).es.add(((ConstrainedTypeContext)_localctx).expr);
						setState(403);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(398);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==COMMA) {
									{
									setState(397);
									((ConstrainedTypeContext)_localctx).s53 = match(COMMA);
									((ConstrainedTypeContext)_localctx).errs.add(((ConstrainedTypeContext)_localctx).s53);
									}
								}

								setState(400);
								((ConstrainedTypeContext)_localctx).expr = expr(0);
								((ConstrainedTypeContext)_localctx).es.add(((ConstrainedTypeContext)_localctx).expr);
								}
								} 
							}
							setState(405);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
						}
						setState(407);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
						case 1:
							{
							setState(406);
							((ConstrainedTypeContext)_localctx).err = match(RPAREN);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class TypedIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PklParser.Identifier, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TypedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedIdentifier; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitTypedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final TypedIdentifierContext typedIdentifier() throws RecognitionException {
		TypedIdentifierContext _localctx = new TypedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(Identifier);
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(415);
				typeAnnotation();
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(PklParser.UNDERSCORE, 0); }
		public TypedIdentifierContext typedIdentifier() {
			return getRuleContext(TypedIdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parameter);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(UNDERSCORE);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				typedIdentifier();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ThisExprContext extends ExprContext {
		public TerminalNode THIS() { return getToken(PklParser.THIS, 0); }
		public ThisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OuterExprContext extends ExprContext {
		public TerminalNode OUTER() { return getToken(PklParser.OUTER, 0); }
		public OuterExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitOuterExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuleExprContext extends ExprContext {
		public TerminalNode MODULE() { return getToken(PklParser.MODULE, 0); }
		public ModuleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitModuleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends ExprContext {
		public TerminalNode NULL() { return getToken(PklParser.NULL, 0); }
		public NullLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueLiteralContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(PklParser.TRUE, 0); }
		public TrueLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseLiteralContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(PklParser.FALSE, 0); }
		public FalseLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends ExprContext {
		public TerminalNode IntLiteral() { return getToken(PklParser.IntLiteral, 0); }
		public IntLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends ExprContext {
		public TerminalNode FloatLiteral() { return getToken(PklParser.FloatLiteral, 0); }
		public FloatLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThrowExprContext extends ExprContext {
		public Token err;
		public TerminalNode THROW() { return getToken(PklParser.THROW, 0); }
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public ThrowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitThrowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TraceExprContext extends ExprContext {
		public Token err;
		public TerminalNode TRACE() { return getToken(PklParser.TRACE, 0); }
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public TraceExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitTraceExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportExprContext extends ExprContext {
		public Token t;
		public Token err;
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(PklParser.IMPORT, 0); }
		public TerminalNode IMPORT_GLOB() { return getToken(PklParser.IMPORT_GLOB, 0); }
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public ImportExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitImportExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadExprContext extends ExprContext {
		public Token t;
		public Token err;
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode READ() { return getToken(PklParser.READ, 0); }
		public TerminalNode READ_OR_NULL() { return getToken(PklParser.READ_OR_NULL, 0); }
		public TerminalNode READ_GLOB() { return getToken(PklParser.READ_GLOB, 0); }
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public ReadExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitReadExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnqualifiedAccessExprContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(PklParser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public UnqualifiedAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitUnqualifiedAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleLineStringLiteralContext extends ExprContext {
		public Token t;
		public Token t2;
		public TerminalNode SLQuote() { return getToken(PklParser.SLQuote, 0); }
		public TerminalNode SLEndQuote() { return getToken(PklParser.SLEndQuote, 0); }
		public List<? extends SingleLineStringPartContext> singleLineStringPart() {
			return getRuleContexts(SingleLineStringPartContext.class);
		}
		public SingleLineStringPartContext singleLineStringPart(int i) {
			return getRuleContext(SingleLineStringPartContext.class,i);
		}
		public SingleLineStringLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitSingleLineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiLineStringLiteralContext extends ExprContext {
		public Token t;
		public Token t2;
		public TerminalNode MLQuote() { return getToken(PklParser.MLQuote, 0); }
		public TerminalNode MLEndQuote() { return getToken(PklParser.MLEndQuote, 0); }
		public List<? extends MultiLineStringPartContext> multiLineStringPart() {
			return getRuleContexts(MultiLineStringPartContext.class);
		}
		public MultiLineStringPartContext multiLineStringPart(int i) {
			return getRuleContext(MultiLineStringPartContext.class,i);
		}
		public MultiLineStringLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitMultiLineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExprContext extends ExprContext {
		public Token t;
		public ObjectBodyContext objectBody() {
			return getRuleContext(ObjectBodyContext.class,0);
		}
		public TerminalNode NEW() { return getToken(PklParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NewExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AmendExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ObjectBodyContext objectBody() {
			return getRuleContext(ObjectBodyContext.class,0);
		}
		public AmendExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitAmendExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuperAccessExprContext extends ExprContext {
		public TerminalNode SUPER() { return getToken(PklParser.SUPER, 0); }
		public TerminalNode DOT() { return getToken(PklParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(PklParser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public SuperAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitSuperAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuperSubscriptExprContext extends ExprContext {
		public Token t;
		public ExprContext e;
		public Token err;
		public TerminalNode SUPER() { return getToken(PklParser.SUPER, 0); }
		public TerminalNode LBRACK() { return getToken(PklParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PklParser.RBRACK, 0); }
		public SuperSubscriptExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitSuperSubscriptExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QualifiedAccessExprContext extends ExprContext {
		public Token t;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PklParser.Identifier, 0); }
		public TerminalNode DOT() { return getToken(PklParser.DOT, 0); }
		public TerminalNode QDOT() { return getToken(PklParser.QDOT, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public QualifiedAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitQualifiedAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptExprContext extends ExprContext {
		public ExprContext l;
		public Token t;
		public ExprContext r;
		public Token err;
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(PklParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PklParser.RBRACK, 0); }
		public SubscriptExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitSubscriptExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonNullExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NON_NULL() { return getToken(PklParser.NON_NULL, 0); }
		public NonNullExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitNonNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(PklParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalNotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(PklParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicalNotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitLogicalNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentiationExprContext extends ExprContext {
		public ExprContext l;
		public Token t;
		public ExprContext r;
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(PklParser.POW, 0); }
		public ExponentiationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitExponentiationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExprContext extends ExprContext {
		public ExprContext l;
		public Token t;
		public ExprContext r;
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(PklParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(PklParser.DIV, 0); }
		public TerminalNode INT_DIV() { return getToken(PklParser.INT_DIV, 0); }
		public TerminalNode MOD() { return getToken(PklParser.MOD, 0); }
		public MultiplicativeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public ExprContext l;
		public Token t;
		public ExprContext r;
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PklParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PklParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExprContext extends ExprContext {
		public ExprContext l;
		public Token t;
		public ExprContext r;
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(PklParser.LT, 0); }
		public TerminalNode GT() { return getToken(PklParser.GT, 0); }
		public TerminalNode LTE() { return getToken(PklParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(PklParser.GTE, 0); }
		public ComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeTestExprContext extends ExprContext {
		public ExprContext l;
		public Token t;
		public TypeContext r;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IS() { return getToken(PklParser.IS, 0); }
		public TerminalNode AS() { return getToken(PklParser.AS, 0); }
		public TypeTestExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitTypeTestExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public ExprContext l;
		public Token t;
		public ExprContext r;
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(PklParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PklParser.NOT_EQUAL, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndExprContext extends ExprContext {
		public ExprContext l;
		public Token t;
		public ExprContext r;
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(PklParser.AND, 0); }
		public LogicalAndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitLogicalAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrExprContext extends ExprContext {
		public ExprContext l;
		public Token t;
		public ExprContext r;
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(PklParser.OR, 0); }
		public LogicalOrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitLogicalOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PipeExprContext extends ExprContext {
		public ExprContext l;
		public Token t;
		public ExprContext r;
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PIPE() { return getToken(PklParser.PIPE, 0); }
		public PipeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitPipeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullCoalesceExprContext extends ExprContext {
		public ExprContext l;
		public Token t;
		public ExprContext r;
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COALESCE() { return getToken(PklParser.COALESCE, 0); }
		public NullCoalesceExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitNullCoalesceExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExprContext extends ExprContext {
		public ExprContext c;
		public Token err;
		public ExprContext l;
		public ExprContext r;
		public TerminalNode IF() { return getToken(PklParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public TerminalNode ELSE() { return getToken(PklParser.ELSE, 0); }
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public IfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetExprContext extends ExprContext {
		public ExprContext l;
		public Token err;
		public ExprContext r;
		public TerminalNode LET() { return getToken(PklParser.LET, 0); }
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PklParser.ASSIGN, 0); }
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public LetExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitLetExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionLiteralContext extends ExprContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(PklParser.ARROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitFunctionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExprContext extends ExprContext {
		public Token err;
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public ParenthesizedExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitParenthesizedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(423);
				match(THIS);
				}
				break;

			case 2:
				{
				_localctx = new OuterExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(424);
				match(OUTER);
				}
				break;

			case 3:
				{
				_localctx = new ModuleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(425);
				match(MODULE);
				}
				break;

			case 4:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(426);
				match(NULL);
				}
				break;

			case 5:
				{
				_localctx = new TrueLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(427);
				match(TRUE);
				}
				break;

			case 6:
				{
				_localctx = new FalseLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(428);
				match(FALSE);
				}
				break;

			case 7:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(429);
				match(IntLiteral);
				}
				break;

			case 8:
				{
				_localctx = new FloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(430);
				match(FloatLiteral);
				}
				break;

			case 9:
				{
				_localctx = new ThrowExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(431);
				match(THROW);
				setState(432);
				match(LPAREN);
				setState(433);
				expr(0);
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(434);
					((ThrowExprContext)_localctx).err = match(RPAREN);
					}
					break;
				}
				}
				break;

			case 10:
				{
				_localctx = new TraceExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(437);
				match(TRACE);
				setState(438);
				match(LPAREN);
				setState(439);
				expr(0);
				setState(441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(440);
					((TraceExprContext)_localctx).err = match(RPAREN);
					}
					break;
				}
				}
				break;

			case 11:
				{
				_localctx = new ImportExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(443);
				((ImportExprContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IMPORT || _la==IMPORT_GLOB) ) {
					((ImportExprContext)_localctx).t = _errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) {
						matchedEOF = true;
					}

					_errHandler.reportMatch(this);
					consume();
				}
				setState(444);
				match(LPAREN);
				setState(445);
				stringConstant();
				setState(447);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(446);
					((ImportExprContext)_localctx).err = match(RPAREN);
					}
					break;
				}
				}
				break;

			case 12:
				{
				_localctx = new ReadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(449);
				((ReadExprContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << READ_GLOB) | (1L << READ_OR_NULL))) != 0)) ) {
					((ReadExprContext)_localctx).t = _errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) {
						matchedEOF = true;
					}

					_errHandler.reportMatch(this);
					consume();
				}
				setState(450);
				match(LPAREN);
				setState(451);
				expr(0);
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(452);
					((ReadExprContext)_localctx).err = match(RPAREN);
					}
					break;
				}
				}
				break;

			case 13:
				{
				_localctx = new UnqualifiedAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(455);
				match(Identifier);
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(456);
					argumentList();
					}
					break;
				}
				}
				break;

			case 14:
				{
				_localctx = new SingleLineStringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(459);
				((SingleLineStringLiteralContext)_localctx).t = match(SLQuote);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (SLInterpolation - 96)) | (1L << (SLUnicodeEscape - 96)) | (1L << (SLCharacterEscape - 96)) | (1L << (SLCharacters - 96)))) != 0)) {
					{
					{
					setState(460);
					singleLineStringPart();
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(466);
				((SingleLineStringLiteralContext)_localctx).t2 = match(SLEndQuote);
				}
				break;

			case 15:
				{
				_localctx = new MultiLineStringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(467);
				((MultiLineStringLiteralContext)_localctx).t = match(MLQuote);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (MLInterpolation - 101)) | (1L << (MLUnicodeEscape - 101)) | (1L << (MLCharacterEscape - 101)) | (1L << (MLNewline - 101)) | (1L << (MLCharacters - 101)))) != 0)) {
					{
					{
					setState(468);
					multiLineStringPart();
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(474);
				((MultiLineStringLiteralContext)_localctx).t2 = match(MLEndQuote);
				}
				break;

			case 16:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(475);
				((NewExprContext)_localctx).t = match(NEW);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << NOTHING) | (1L << UNKNOWN) | (1L << LPAREN))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (STAR - 75)) | (1L << (SLQuote - 75)) | (1L << (Identifier - 75)))) != 0)) {
					{
					setState(476);
					type(0);
					}
				}

				setState(479);
				objectBody();
				}
				break;

			case 17:
				{
				_localctx = new SuperAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(480);
				match(SUPER);
				setState(481);
				match(DOT);
				setState(482);
				match(Identifier);
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(483);
					argumentList();
					}
					break;
				}
				}
				break;

			case 18:
				{
				_localctx = new SuperSubscriptExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(486);
				match(SUPER);
				setState(487);
				((SuperSubscriptExprContext)_localctx).t = match(LBRACK);
				setState(488);
				((SuperSubscriptExprContext)_localctx).e = expr(0);
				setState(490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(489);
					((SuperSubscriptExprContext)_localctx).err = match(RBRACK);
					}
					break;
				}
				}
				break;

			case 19:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(492);
				match(MINUS);
				setState(493);
				expr(16);
				}
				break;

			case 20:
				{
				_localctx = new LogicalNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(494);
				match(NOT);
				setState(495);
				expr(15);
				}
				break;

			case 21:
				{
				_localctx = new IfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				match(IF);
				setState(497);
				match(LPAREN);
				setState(498);
				((IfExprContext)_localctx).c = expr(0);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RPAREN) {
					{
					setState(499);
					((IfExprContext)_localctx).err = match(RPAREN);
					}
				}

				setState(502);
				((IfExprContext)_localctx).l = expr(0);
				setState(503);
				match(ELSE);
				setState(504);
				((IfExprContext)_localctx).r = expr(4);
				}
				break;

			case 22:
				{
				_localctx = new LetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(506);
				match(LET);
				setState(507);
				match(LPAREN);
				setState(508);
				parameter();
				setState(509);
				match(ASSIGN);
				setState(510);
				((LetExprContext)_localctx).l = expr(0);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RPAREN) {
					{
					setState(511);
					((LetExprContext)_localctx).err = match(RPAREN);
					}
				}

				setState(514);
				((LetExprContext)_localctx).r = expr(3);
				}
				break;

			case 23:
				{
				_localctx = new FunctionLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(516);
				parameterList();
				setState(517);
				match(ARROW);
				setState(518);
				expr(2);
				}
				break;

			case 24:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(520);
				match(LPAREN);
				setState(521);
				expr(0);
				setState(523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(522);
					((ParenthesizedExprContext)_localctx).err = match(RPAREN);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(578);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentiationExprContext(new ExprContext(_parentctx, _parentState));
						((ExponentiationExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(527);
						if (!(precpred(_ctx, 14))) throw createFailedPredicateException("precpred(_ctx, 14)");
						setState(528);
						((ExponentiationExprContext)_localctx).t = match(POW);
						setState(529);
						((ExponentiationExprContext)_localctx).r = expr(14);
						}
						break;

					case 2:
						{
						_localctx = new MultiplicativeExprContext(new ExprContext(_parentctx, _parentState));
						((MultiplicativeExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(530);
						if (!(precpred(_ctx, 13))) throw createFailedPredicateException("precpred(_ctx, 13)");
						setState(531);
						((MultiplicativeExprContext)_localctx).t = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (STAR - 75)) | (1L << (DIV - 75)) | (1L << (INT_DIV - 75)) | (1L << (MOD - 75)))) != 0)) ) {
							((MultiplicativeExprContext)_localctx).t = _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) {
								matchedEOF = true;
							}

							_errHandler.reportMatch(this);
							consume();
						}
						setState(532);
						((MultiplicativeExprContext)_localctx).r = expr(14);
						}
						break;

					case 3:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						((AdditiveExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(533);
						if (!(precpred(_ctx, 12))) throw createFailedPredicateException("precpred(_ctx, 12)");
						setState(537);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
						case 1:
							{
							setState(534);
							((AdditiveExprContext)_localctx).t = match(PLUS);
							}
							break;

						case 2:
							{
							setState(535);
							if (!(noNewlineOrSemicolon())) throw createFailedPredicateException("noNewlineOrSemicolon()");
							setState(536);
							((AdditiveExprContext)_localctx).t = match(MINUS);
							}
							break;
						}
						setState(539);
						((AdditiveExprContext)_localctx).r = expr(13);
						}
						break;

					case 4:
						{
						_localctx = new ComparisonExprContext(new ExprContext(_parentctx, _parentState));
						((ComparisonExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(540);
						if (!(precpred(_ctx, 11))) throw createFailedPredicateException("precpred(_ctx, 11)");
						setState(541);
						((ComparisonExprContext)_localctx).t = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (GT - 60)) | (1L << (LT - 60)) | (1L << (LTE - 60)) | (1L << (GTE - 60)))) != 0)) ) {
							((ComparisonExprContext)_localctx).t = _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) {
								matchedEOF = true;
							}

							_errHandler.reportMatch(this);
							consume();
						}
						setState(542);
						((ComparisonExprContext)_localctx).r = expr(12);
						}
						break;

					case 5:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						((EqualityExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(543);
						if (!(precpred(_ctx, 9))) throw createFailedPredicateException("precpred(_ctx, 9)");
						setState(544);
						((EqualityExprContext)_localctx).t = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
							((EqualityExprContext)_localctx).t = _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) {
								matchedEOF = true;
							}

							_errHandler.reportMatch(this);
							consume();
						}
						setState(545);
						((EqualityExprContext)_localctx).r = expr(10);
						}
						break;

					case 6:
						{
						_localctx = new LogicalAndExprContext(new ExprContext(_parentctx, _parentState));
						((LogicalAndExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(546);
						if (!(precpred(_ctx, 8))) throw createFailedPredicateException("precpred(_ctx, 8)");
						setState(547);
						((LogicalAndExprContext)_localctx).t = match(AND);
						setState(548);
						((LogicalAndExprContext)_localctx).r = expr(9);
						}
						break;

					case 7:
						{
						_localctx = new LogicalOrExprContext(new ExprContext(_parentctx, _parentState));
						((LogicalOrExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(549);
						if (!(precpred(_ctx, 7))) throw createFailedPredicateException("precpred(_ctx, 7)");
						setState(550);
						((LogicalOrExprContext)_localctx).t = match(OR);
						setState(551);
						((LogicalOrExprContext)_localctx).r = expr(8);
						}
						break;

					case 8:
						{
						_localctx = new PipeExprContext(new ExprContext(_parentctx, _parentState));
						((PipeExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(552);
						if (!(precpred(_ctx, 6))) throw createFailedPredicateException("precpred(_ctx, 6)");
						setState(553);
						((PipeExprContext)_localctx).t = match(PIPE);
						setState(554);
						((PipeExprContext)_localctx).r = expr(7);
						}
						break;

					case 9:
						{
						_localctx = new NullCoalesceExprContext(new ExprContext(_parentctx, _parentState));
						((NullCoalesceExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(555);
						if (!(precpred(_ctx, 5))) throw createFailedPredicateException("precpred(_ctx, 5)");
						setState(556);
						((NullCoalesceExprContext)_localctx).t = match(COALESCE);
						setState(557);
						((NullCoalesceExprContext)_localctx).r = expr(5);
						}
						break;

					case 10:
						{
						_localctx = new AmendExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(558);
						if (!(precpred(_ctx, 22))) throw createFailedPredicateException("precpred(_ctx, 22)");
						setState(559);
						objectBody();
						}
						break;

					case 11:
						{
						_localctx = new QualifiedAccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(560);
						if (!(precpred(_ctx, 19))) throw createFailedPredicateException("precpred(_ctx, 19)");
						setState(561);
						((QualifiedAccessExprContext)_localctx).t = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DOT || _la==QDOT) ) {
							((QualifiedAccessExprContext)_localctx).t = _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) {
								matchedEOF = true;
							}

							_errHandler.reportMatch(this);
							consume();
						}
						setState(562);
						match(Identifier);
						setState(564);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
						case 1:
							{
							setState(563);
							argumentList();
							}
							break;
						}
						}
						break;

					case 12:
						{
						_localctx = new SubscriptExprContext(new ExprContext(_parentctx, _parentState));
						((SubscriptExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(566);
						if (!(precpred(_ctx, 18))) throw createFailedPredicateException("precpred(_ctx, 18)");
						setState(567);
						if (!(noNewlineOrSemicolon())) throw createFailedPredicateException("noNewlineOrSemicolon()");
						setState(568);
						((SubscriptExprContext)_localctx).t = match(LBRACK);
						setState(569);
						((SubscriptExprContext)_localctx).r = expr(0);
						setState(571);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
						case 1:
							{
							setState(570);
							((SubscriptExprContext)_localctx).err = match(RBRACK);
							}
							break;
						}
						}
						break;

					case 13:
						{
						_localctx = new NonNullExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(573);
						if (!(precpred(_ctx, 17))) throw createFailedPredicateException("precpred(_ctx, 17)");
						setState(574);
						match(NON_NULL);
						}
						break;

					case 14:
						{
						_localctx = new TypeTestExprContext(new ExprContext(_parentctx, _parentState));
						((TypeTestExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(575);
						if (!(precpred(_ctx, 10))) throw createFailedPredicateException("precpred(_ctx, 10)");
						setState(576);
						((TypeTestExprContext)_localctx).t = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AS || _la==IS) ) {
							((TypeTestExprContext)_localctx).t = _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) {
								matchedEOF = true;
							}

							_errHandler.reportMatch(this);
							consume();
						}
						setState(577);
						((TypeTestExprContext)_localctx).r = type(0);
						}
						break;
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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

	public static class ObjectBodyContext extends ParserRuleContext {
		public ParameterContext parameter;
		public List<ParameterContext> ps = new ArrayList<ParameterContext>();
		public Token s53;
		public List<Token> errs = new ArrayList<Token>();
		public Token err;
		public TerminalNode LBRACE() { return getToken(PklParser.LBRACE, 0); }
		public TerminalNode ARROW() { return getToken(PklParser.ARROW, 0); }
		public List<? extends ObjectMemberContext> objectMember() {
			return getRuleContexts(ObjectMemberContext.class);
		}
		public ObjectMemberContext objectMember(int i) {
			return getRuleContext(ObjectMemberContext.class,i);
		}
		public List<? extends ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(PklParser.RBRACE, 0); }
		public List<? extends TerminalNode> COMMA() { return getTokens(PklParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PklParser.COMMA, i);
		}
		public ObjectBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectBody; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitObjectBody(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ObjectBodyContext objectBody() throws RecognitionException {
		ObjectBodyContext _localctx = new ObjectBodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_objectBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(LBRACE);
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(584);
				_localctx.parameter = parameter();
				_localctx.ps.add(_localctx.parameter);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (COMMA - 53)) | (1L << (UNDERSCORE - 53)) | (1L << (Identifier - 53)))) != 0)) {
					{
					{
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(585);
						_localctx.s53 = match(COMMA);
						_localctx.errs.add(_localctx.s53);
						}
					}

					setState(588);
					_localctx.parameter = parameter();
					_localctx.ps.add(_localctx.parameter);
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				match(ARROW);
				}
				break;
			}
			setState(601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(598);
					objectMember();
					}
					} 
				}
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(604);
				_localctx.err = match(RBRACE);
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

	public static class ObjectMemberContext extends ParserRuleContext {
		public ObjectMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectMember; }
	 
		public ObjectMemberContext() { }
		public void copyFrom(ObjectMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjectPropertyContext extends ObjectMemberContext {
		public TerminalNode Identifier() { return getToken(PklParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(PklParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<? extends ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public List<? extends ObjectBodyContext> objectBody() {
			return getRuleContexts(ObjectBodyContext.class);
		}
		public ObjectBodyContext objectBody(int i) {
			return getRuleContext(ObjectBodyContext.class,i);
		}
		public ObjectPropertyContext(ObjectMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectMethodContext extends ObjectMemberContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PklParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ObjectMethodContext(ObjectMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitObjectMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberPredicateContext extends ObjectMemberContext {
		public Token t;
		public ExprContext k;
		public Token err1;
		public Token err2;
		public ExprContext v;
		public TerminalNode LPRED() { return getToken(PklParser.LPRED, 0); }
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(PklParser.ASSIGN, 0); }
		public List<? extends TerminalNode> RBRACK() { return getTokens(PklParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PklParser.RBRACK, i);
		}
		public List<? extends ObjectBodyContext> objectBody() {
			return getRuleContexts(ObjectBodyContext.class);
		}
		public ObjectBodyContext objectBody(int i) {
			return getRuleContext(ObjectBodyContext.class,i);
		}
		public MemberPredicateContext(ObjectMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitMemberPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectEntryContext extends ObjectMemberContext {
		public Token t;
		public ExprContext k;
		public Token err1;
		public Token err2;
		public ExprContext v;
		public TerminalNode LBRACK() { return getToken(PklParser.LBRACK, 0); }
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(PklParser.ASSIGN, 0); }
		public List<? extends TerminalNode> RBRACK() { return getTokens(PklParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PklParser.RBRACK, i);
		}
		public List<? extends ObjectBodyContext> objectBody() {
			return getRuleContexts(ObjectBodyContext.class);
		}
		public ObjectBodyContext objectBody(int i) {
			return getRuleContext(ObjectBodyContext.class,i);
		}
		public ObjectEntryContext(ObjectMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitObjectEntry(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectElementContext extends ObjectMemberContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ObjectElementContext(ObjectMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitObjectElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectSpreadContext extends ObjectMemberContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SPREAD() { return getToken(PklParser.SPREAD, 0); }
		public TerminalNode QSPREAD() { return getToken(PklParser.QSPREAD, 0); }
		public ObjectSpreadContext(ObjectMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitObjectSpread(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhenGeneratorContext extends ObjectMemberContext {
		public ExprContext e;
		public Token err;
		public ObjectBodyContext b1;
		public ObjectBodyContext b2;
		public TerminalNode WHEN() { return getToken(PklParser.WHEN, 0); }
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<? extends ObjectBodyContext> objectBody() {
			return getRuleContexts(ObjectBodyContext.class);
		}
		public ObjectBodyContext objectBody(int i) {
			return getRuleContext(ObjectBodyContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public TerminalNode ELSE() { return getToken(PklParser.ELSE, 0); }
		public WhenGeneratorContext(ObjectMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitWhenGenerator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForGeneratorContext extends ObjectMemberContext {
		public ParameterContext t1;
		public ParameterContext t2;
		public ExprContext e;
		public Token err;
		public TerminalNode FOR() { return getToken(PklParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(PklParser.LPAREN, 0); }
		public TerminalNode IN() { return getToken(PklParser.IN, 0); }
		public ObjectBodyContext objectBody() {
			return getRuleContext(ObjectBodyContext.class,0);
		}
		public List<? extends ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PklParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public ForGeneratorContext(ObjectMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitForGenerator(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ObjectMemberContext objectMember() throws RecognitionException {
		ObjectMemberContext _localctx = new ObjectMemberContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectMember);
		int _la;
		try {
			int _alt;
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				_localctx = new ObjectPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CONST) | (1L << EXTERNAL) | (1L << FIXED) | (1L << HIDDEN_) | (1L << LOCAL) | (1L << OPEN))) != 0)) {
					{
					{
					setState(607);
					modifier();
					}
					}
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(613);
				match(Identifier);
				setState(624);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
				case COLON:
					{
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(614);
						typeAnnotation();
						}
					}

					setState(617);
					match(ASSIGN);
					setState(618);
					expr(0);
					}
					break;
				case LBRACE:
					{
					setState(620); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(619);
							objectBody();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(622); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 2:
				_localctx = new ObjectMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				methodHeader();
				setState(627);
				match(ASSIGN);
				setState(628);
				expr(0);
				}
				break;

			case 3:
				_localctx = new MemberPredicateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(630);
				((MemberPredicateContext)_localctx).t = match(LPRED);
				setState(631);
				((MemberPredicateContext)_localctx).k = expr(0);
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(632);
					((MemberPredicateContext)_localctx).err1 = match(RBRACK);
					}
					break;
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RBRACK) {
					{
					setState(635);
					((MemberPredicateContext)_localctx).err2 = match(RBRACK);
					}
				}

				setState(645);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(638);
					match(ASSIGN);
					setState(639);
					((MemberPredicateContext)_localctx).v = expr(0);
					}
					break;
				case LBRACE:
					{
					setState(641); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(640);
							objectBody();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(643); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 4:
				_localctx = new ObjectEntryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(647);
				((ObjectEntryContext)_localctx).t = match(LBRACK);
				setState(648);
				((ObjectEntryContext)_localctx).k = expr(0);
				setState(650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(649);
					((ObjectEntryContext)_localctx).err1 = match(RBRACK);
					}
					break;
				}
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RBRACK) {
					{
					setState(652);
					((ObjectEntryContext)_localctx).err2 = match(RBRACK);
					}
				}

				setState(662);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(655);
					match(ASSIGN);
					setState(656);
					((ObjectEntryContext)_localctx).v = expr(0);
					}
					break;
				case LBRACE:
					{
					setState(658); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(657);
							objectBody();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(660); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 5:
				_localctx = new ObjectElementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(664);
				expr(0);
				}
				break;

			case 6:
				_localctx = new ObjectSpreadContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(665);
				_la = _input.LA(1);
				if ( !(_la==SPREAD || _la==QSPREAD) ) {
				_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) {
						matchedEOF = true;
					}

					_errHandler.reportMatch(this);
					consume();
				}
				setState(666);
				expr(0);
				}
				break;

			case 7:
				_localctx = new WhenGeneratorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(667);
				match(WHEN);
				setState(668);
				match(LPAREN);
				setState(669);
				((WhenGeneratorContext)_localctx).e = expr(0);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RPAREN) {
					{
					setState(670);
					((WhenGeneratorContext)_localctx).err = match(RPAREN);
					}
				}

				{
				setState(673);
				((WhenGeneratorContext)_localctx).b1 = objectBody();
				setState(676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(674);
					match(ELSE);
					setState(675);
					((WhenGeneratorContext)_localctx).b2 = objectBody();
					}
					break;
				}
				}
				}
				break;

			case 8:
				_localctx = new ForGeneratorContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(678);
				match(FOR);
				setState(679);
				match(LPAREN);
				setState(680);
				((ForGeneratorContext)_localctx).t1 = parameter();
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(681);
					match(COMMA);
					setState(682);
					((ForGeneratorContext)_localctx).t2 = parameter();
					}
				}

				setState(685);
				match(IN);
				setState(686);
				((ForGeneratorContext)_localctx).e = expr(0);
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RPAREN) {
					{
					setState(687);
					((ForGeneratorContext)_localctx).err = match(RPAREN);
					}
				}

				setState(690);
				objectBody();
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

	public static class StringConstantContext extends ParserRuleContext {
		public Token t;
		public Token SLCharacters;
		public List<Token> ts = new ArrayList<Token>();
		public Token SLCharacterEscape;
		public Token SLUnicodeEscape;
		public Token t2;
		public TerminalNode SLQuote() { return getToken(PklParser.SLQuote, 0); }
		public TerminalNode SLEndQuote() { return getToken(PklParser.SLEndQuote, 0); }
		public List<? extends TerminalNode> SLCharacters() { return getTokens(PklParser.SLCharacters); }
		public TerminalNode SLCharacters(int i) {
			return getToken(PklParser.SLCharacters, i);
		}
		public List<? extends TerminalNode> SLCharacterEscape() { return getTokens(PklParser.SLCharacterEscape); }
		public TerminalNode SLCharacterEscape(int i) {
			return getToken(PklParser.SLCharacterEscape, i);
		}
		public List<? extends TerminalNode> SLUnicodeEscape() { return getTokens(PklParser.SLUnicodeEscape); }
		public TerminalNode SLUnicodeEscape(int i) {
			return getToken(PklParser.SLUnicodeEscape, i);
		}
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stringConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_localctx.t = match(SLQuote);
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (SLUnicodeEscape - 97)) | (1L << (SLCharacterEscape - 97)) | (1L << (SLCharacters - 97)))) != 0)) {
				{
				setState(698);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SLCharacters:
					{
					setState(695);
					_localctx.SLCharacters = match(SLCharacters);
					_localctx.ts.add(_localctx.SLCharacters);
					}
					break;
				case SLCharacterEscape:
					{
					setState(696);
					_localctx.SLCharacterEscape = match(SLCharacterEscape);
					_localctx.ts.add(_localctx.SLCharacterEscape);
					}
					break;
				case SLUnicodeEscape:
					{
					setState(697);
					_localctx.SLUnicodeEscape = match(SLUnicodeEscape);
					_localctx.ts.add(_localctx.SLUnicodeEscape);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(703);
			_localctx.t2 = match(SLEndQuote);
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

	public static class SingleLineStringPartContext extends ParserRuleContext {
		public ExprContext e;
		public Token SLCharacters;
		public List<Token> ts = new ArrayList<Token>();
		public Token SLCharacterEscape;
		public Token SLUnicodeEscape;
		public TerminalNode SLInterpolation() { return getToken(PklParser.SLInterpolation, 0); }
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<? extends TerminalNode> SLCharacters() { return getTokens(PklParser.SLCharacters); }
		public TerminalNode SLCharacters(int i) {
			return getToken(PklParser.SLCharacters, i);
		}
		public List<? extends TerminalNode> SLCharacterEscape() { return getTokens(PklParser.SLCharacterEscape); }
		public TerminalNode SLCharacterEscape(int i) {
			return getToken(PklParser.SLCharacterEscape, i);
		}
		public List<? extends TerminalNode> SLUnicodeEscape() { return getTokens(PklParser.SLUnicodeEscape); }
		public TerminalNode SLUnicodeEscape(int i) {
			return getToken(PklParser.SLUnicodeEscape, i);
		}
		public SingleLineStringPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLineStringPart; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitSingleLineStringPart(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final SingleLineStringPartContext singleLineStringPart() throws RecognitionException {
		SingleLineStringPartContext _localctx = new SingleLineStringPartContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_singleLineStringPart);
		try {
			int _alt;
			setState(716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SLInterpolation:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(SLInterpolation);
				setState(706);
				_localctx.e = expr(0);
				setState(707);
				match(RPAREN);
				}
				break;
			case SLUnicodeEscape:
			case SLCharacterEscape:
			case SLCharacters:
				enterOuterAlt(_localctx, 2);
				{
				setState(712); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(712);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SLCharacters:
							{
							setState(709);
							_localctx.SLCharacters = match(SLCharacters);
							_localctx.ts.add(_localctx.SLCharacters);
							}
							break;
						case SLCharacterEscape:
							{
							setState(710);
							_localctx.SLCharacterEscape = match(SLCharacterEscape);
							_localctx.ts.add(_localctx.SLCharacterEscape);
							}
							break;
						case SLUnicodeEscape:
							{
							setState(711);
							_localctx.SLUnicodeEscape = match(SLUnicodeEscape);
							_localctx.ts.add(_localctx.SLUnicodeEscape);
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
					setState(714); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class MultiLineStringPartContext extends ParserRuleContext {
		public ExprContext e;
		public Token MLCharacters;
		public List<Token> ts = new ArrayList<Token>();
		public Token MLNewline;
		public Token MLCharacterEscape;
		public Token MLUnicodeEscape;
		public TerminalNode MLInterpolation() { return getToken(PklParser.MLInterpolation, 0); }
		public TerminalNode RPAREN() { return getToken(PklParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<? extends TerminalNode> MLCharacters() { return getTokens(PklParser.MLCharacters); }
		public TerminalNode MLCharacters(int i) {
			return getToken(PklParser.MLCharacters, i);
		}
		public List<? extends TerminalNode> MLNewline() { return getTokens(PklParser.MLNewline); }
		public TerminalNode MLNewline(int i) {
			return getToken(PklParser.MLNewline, i);
		}
		public List<? extends TerminalNode> MLCharacterEscape() { return getTokens(PklParser.MLCharacterEscape); }
		public TerminalNode MLCharacterEscape(int i) {
			return getToken(PklParser.MLCharacterEscape, i);
		}
		public List<? extends TerminalNode> MLUnicodeEscape() { return getTokens(PklParser.MLUnicodeEscape); }
		public TerminalNode MLUnicodeEscape(int i) {
			return getToken(PklParser.MLUnicodeEscape, i);
		}
		public MultiLineStringPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringPart; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitMultiLineStringPart(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final MultiLineStringPartContext multiLineStringPart() throws RecognitionException {
		MultiLineStringPartContext _localctx = new MultiLineStringPartContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiLineStringPart);
		try {
			int _alt;
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MLInterpolation:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				match(MLInterpolation);
				setState(719);
				_localctx.e = expr(0);
				setState(720);
				match(RPAREN);
				}
				break;
			case MLUnicodeEscape:
			case MLCharacterEscape:
			case MLNewline:
			case MLCharacters:
				enterOuterAlt(_localctx, 2);
				{
				setState(726); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(726);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MLCharacters:
							{
							setState(722);
							_localctx.MLCharacters = match(MLCharacters);
							_localctx.ts.add(_localctx.MLCharacters);
							}
							break;
						case MLNewline:
							{
							setState(723);
							_localctx.MLNewline = match(MLNewline);
							_localctx.ts.add(_localctx.MLNewline);
							}
							break;
						case MLCharacterEscape:
							{
							setState(724);
							_localctx.MLCharacterEscape = match(MLCharacterEscape);
							_localctx.ts.add(_localctx.MLCharacterEscape);
							}
							break;
						case MLUnicodeEscape:
							{
							setState(725);
							_localctx.MLUnicodeEscape = match(MLUnicodeEscape);
							_localctx.ts.add(_localctx.MLUnicodeEscape);
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
					setState(728); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ReservedKeywordContext extends ParserRuleContext {
		public TerminalNode PROTECTED() { return getToken(PklParser.PROTECTED, 0); }
		public TerminalNode OVERRIDE() { return getToken(PklParser.OVERRIDE, 0); }
		public TerminalNode RECORD() { return getToken(PklParser.RECORD, 0); }
		public TerminalNode DELETE() { return getToken(PklParser.DELETE, 0); }
		public TerminalNode CASE() { return getToken(PklParser.CASE, 0); }
		public TerminalNode SWITCH() { return getToken(PklParser.SWITCH, 0); }
		public TerminalNode VARARG() { return getToken(PklParser.VARARG, 0); }
		public TerminalNode CONST() { return getToken(PklParser.CONST, 0); }
		public ReservedKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedKeyword; }
		@Override
		public <Result> Result accept(ParseTreeVisitor<? extends Result> visitor) {
			if ( visitor instanceof PklParserVisitor<?> ) return ((PklParserVisitor<? extends Result>)visitor).visitReservedKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	@RuleVersion(0)
	public final ReservedKeywordContext reservedKeyword() throws RecognitionException {
		ReservedKeywordContext _localctx = new ReservedKeywordContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_reservedKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << PROTECTED) | (1L << OVERRIDE) | (1L << RECORD) | (1L << DELETE) | (1L << CASE) | (1L << SWITCH) | (1L << VARARG))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				if (_input.LA(1) == Token.EOF) {
					matchedEOF = true;
				}

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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return argumentList_sempred((ArgumentListContext)_localctx, predIndex);

		case 24:
			return type_sempred((TypeContext)_localctx, predIndex);

		case 27:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean argumentList_sempred(ArgumentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return noNewlineOrSemicolon();
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);

		case 2:
			return precpred(_ctx, 5);

		case 3:
			return precpred(_ctx, 4);

		case 4:
			return noNewlineOrSemicolon();
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 14);

		case 6:
			return precpred(_ctx, 13);

		case 7:
			return precpred(_ctx, 12);

		case 8:
			return noNewlineOrSemicolon();

		case 9:
			return precpred(_ctx, 11);

		case 10:
			return precpred(_ctx, 9);

		case 11:
			return precpred(_ctx, 8);

		case 12:
			return precpred(_ctx, 7);

		case 13:
			return precpred(_ctx, 6);

		case 14:
			return precpred(_ctx, 5);

		case 15:
			return precpred(_ctx, 22);

		case 16:
			return precpred(_ctx, 19);

		case 17:
			return precpred(_ctx, 18);

		case 18:
			return noNewlineOrSemicolon();

		case 19:
			return precpred(_ctx, 17);

		case 20:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uc91d\ucaba\u058d\uafba\u4f53\u0607\uea8b\uc241\3k\u02e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2N\n\2\7\2P\n\2\f\2\16"+
		"\2S\13\2\3\2\3\2\3\3\3\3\3\3\3\4\5\4[\n\4\3\4\7\4^\n\4\f\4\16\4a\13\4"+
		"\3\4\3\4\3\4\3\4\5\4g\n\4\7\4i\n\4\f\4\16\4l\13\4\3\4\3\4\3\5\5\5q\n\5"+
		"\3\5\7\5t\n\5\f\5\16\5w\13\5\3\5\3\5\3\6\7\6|\n\6\f\6\16\6\177\13\6\3"+
		"\6\3\6\3\6\5\6\u0084\n\6\3\6\5\6\u0087\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\5\b\u0090\n\b\3\t\5\t\u0093\n\t\3\t\7\t\u0096\n\t\f\t\16\t\u0099\13\t"+
		"\3\t\3\t\5\t\u009d\n\t\3\n\7\n\u00a0\n\n\f\n\16\n\u00a3\13\n\3\n\3\n\3"+
		"\n\5\n\u00a8\n\n\3\n\3\n\5\n\u00ac\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u00b3"+
		"\n\f\7\f\u00b5\n\f\f\f\16\f\u00b8\13\f\3\f\5\f\u00bb\n\f\3\r\5\r\u00be"+
		"\n\r\3\r\7\r\u00c1\n\r\f\r\16\r\u00c4\13\r\3\r\3\r\3\r\3\r\3\16\7\16\u00cb"+
		"\n\16\f\16\16\16\u00ce\13\16\3\16\3\16\3\16\5\16\u00d3\n\16\3\17\5\17"+
		"\u00d6\n\17\3\17\7\17\u00d9\n\17\f\17\16\17\u00dc\13\17\3\17\7\17\u00df"+
		"\n\17\f\17\16\17\u00e2\13\17\3\17\3\17\3\17\5\17\u00e7\n\17\3\17\3\17"+
		"\3\17\6\17\u00ec\n\17\r\17\16\17\u00ed\5\17\u00f0\n\17\5\17\u00f2\n\17"+
		"\3\20\5\20\u00f5\n\20\3\20\7\20\u00f8\n\20\f\20\16\20\u00fb\13\20\3\20"+
		"\3\20\3\20\5\20\u0100\n\20\3\21\7\21\u0103\n\21\f\21\16\21\u0106\13\21"+
		"\3\21\3\21\3\21\5\21\u010b\n\21\3\21\3\21\5\21\u010f\n\21\3\22\3\22\3"+
		"\22\5\22\u0114\n\22\3\22\7\22\u0117\n\22\f\22\16\22\u011a\13\22\5\22\u011c"+
		"\n\22\3\22\5\22\u011f\n\22\3\23\3\23\3\23\3\23\5\23\u0125\n\23\3\23\7"+
		"\23\u0128\n\23\f\23\16\23\u012b\13\23\5\23\u012d\n\23\3\23\5\23\u0130"+
		"\n\23\3\24\3\24\3\24\5\24\u0135\n\24\3\25\3\25\3\25\7\25\u013a\n\25\f"+
		"\25\16\25\u013d\13\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0145\n\27\3"+
		"\27\7\27\u0148\n\27\f\27\16\27\u014b\13\27\3\27\5\27\u014e\n\27\3\30\5"+
		"\30\u0151\n\30\3\30\3\30\3\31\3\31\3\31\5\31\u0158\n\31\3\31\7\31\u015b"+
		"\n\31\f\31\16\31\u015e\13\31\3\31\5\31\u0161\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u016a\n\32\3\32\3\32\3\32\5\32\u016f\n\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u0176\n\32\3\32\7\32\u0179\n\32\f\32\16\32\u017c"+
		"\13\32\5\32\u017e\n\32\3\32\5\32\u0181\n\32\3\32\3\32\5\32\u0185\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0191\n\32\3\32"+
		"\7\32\u0194\n\32\f\32\16\32\u0197\13\32\3\32\5\32\u019a\n\32\7\32\u019c"+
		"\n\32\f\32\16\32\u019f\13\32\3\33\3\33\5\33\u01a3\n\33\3\34\3\34\5\34"+
		"\u01a7\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u01b6\n\35\3\35\3\35\3\35\3\35\5\35\u01bc\n\35\3\35\3\35\3"+
		"\35\3\35\5\35\u01c2\n\35\3\35\3\35\3\35\3\35\5\35\u01c8\n\35\3\35\3\35"+
		"\5\35\u01cc\n\35\3\35\3\35\7\35\u01d0\n\35\f\35\16\35\u01d3\13\35\3\35"+
		"\3\35\3\35\7\35\u01d8\n\35\f\35\16\35\u01db\13\35\3\35\3\35\3\35\5\35"+
		"\u01e0\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u01e7\n\35\3\35\3\35\3\35\3"+
		"\35\5\35\u01ed\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01f7"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0203\n\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u020e\n\35\5\35\u0210"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u021c\n\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0237\n\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u023e\n\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u0245\n\35\f\35\16\35\u0248\13\35\3\36\3\36\3\36\5\36\u024d\n\36\3\36"+
		"\7\36\u0250\n\36\f\36\16\36\u0253\13\36\3\36\3\36\5\36\u0257\n\36\3\36"+
		"\7\36\u025a\n\36\f\36\16\36\u025d\13\36\3\36\5\36\u0260\n\36\3\37\7\37"+
		"\u0263\n\37\f\37\16\37\u0266\13\37\3\37\3\37\5\37\u026a\n\37\3\37\3\37"+
		"\3\37\6\37\u026f\n\37\r\37\16\37\u0270\5\37\u0273\n\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u027c\n\37\3\37\5\37\u027f\n\37\3\37\3\37\3"+
		"\37\6\37\u0284\n\37\r\37\16\37\u0285\5\37\u0288\n\37\3\37\3\37\3\37\5"+
		"\37\u028d\n\37\3\37\5\37\u0290\n\37\3\37\3\37\3\37\6\37\u0295\n\37\r\37"+
		"\16\37\u0296\5\37\u0299\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u02a2"+
		"\n\37\3\37\3\37\3\37\5\37\u02a7\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u02ae"+
		"\n\37\3\37\3\37\3\37\5\37\u02b3\n\37\3\37\3\37\5\37\u02b7\n\37\3 \3 \3"+
		" \3 \7 \u02bd\n \f \16 \u02c0\13 \3 \3 \3!\3!\3!\3!\3!\3!\3!\6!\u02cb"+
		"\n!\r!\16!\u02cc\5!\u02cf\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u02d9"+
		"\n\"\r\"\16\"\u02da\5\"\u02dd\n\"\3#\3#\3#\2\2\4\628$\2\2\4\2\6\2\b\2"+
		"\n\2\f\2\16\2\20\2\22\2\24\2\26\2\30\2\32\2\34\2\36\2 \2\"\2$\2&\2(\2"+
		"*\2,\2.\2\60\2\62\2\64\2\66\28\2:\2<\2>\2@\2B\2D\2\2\16\4\2\4\4\t\t\3"+
		"\2\21\22\t\2\3\3\7\7\n\n\f\f\17\17\26\26\33\33\4\2\23\23\34\34\3\2\36"+
		" \3\2MP\4\2>?FG\3\2DE\3\289\4\2\5\5\24\24\3\2ST\4\2\7\7)/\2\u036e\2Q\3"+
		"\2\2\2\4V\3\2\2\2\6Z\3\2\2\2\bp\3\2\2\2\n\u0086\3\2\2\2\f\u0088\3\2\2"+
		"\2\16\u008b\3\2\2\2\20\u0092\3\2\2\2\22\u00a1\3\2\2\2\24\u00ad\3\2\2\2"+
		"\26\u00af\3\2\2\2\30\u00bd\3\2\2\2\32\u00cc\3\2\2\2\34\u00d5\3\2\2\2\36"+
		"\u00f4\3\2\2\2 \u0104\3\2\2\2\"\u0110\3\2\2\2$\u0120\3\2\2\2&\u0131\3"+
		"\2\2\2(\u0136\3\2\2\2*\u013e\3\2\2\2,\u0141\3\2\2\2.\u0150\3\2\2\2\60"+
		"\u0154\3\2\2\2\62\u0184\3\2\2\2\64\u01a0\3\2\2\2\66\u01a6\3\2\2\28\u020f"+
		"\3\2\2\2:\u0249\3\2\2\2<\u02b6\3\2\2\2>\u02b8\3\2\2\2@\u02ce\3\2\2\2B"+
		"\u02dc\3\2\2\2D\u02de\3\2\2\2FN\5\b\5\2GN\5\16\b\2HN\5\20\t\2IN\5\30\r"+
		"\2JN\5\34\17\2KN\5\36\20\2LN\58\35\2MF\3\2\2\2MG\3\2\2\2MH\3\2\2\2MI\3"+
		"\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2NP\3\2\2\2OM\3\2\2\2PS\3\2\2\2QO\3"+
		"\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\2\2\3U\3\3\2\2\2VW\58\35\2WX"+
		"\7\2\2\3X\5\3\2\2\2Y[\5\b\5\2ZY\3\2\2\2Z[\3\2\2\2[_\3\2\2\2\\^\5\16\b"+
		"\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`j\3\2\2\2a_\3\2\2\2bg\5\20"+
		"\t\2cg\5\30\r\2dg\5\34\17\2eg\5\36\20\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2"+
		"fe\3\2\2\2gi\3\2\2\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2"+
		"lj\3\2\2\2mn\7\2\2\3n\7\3\2\2\2oq\7]\2\2po\3\2\2\2pq\3\2\2\2qu\3\2\2\2"+
		"rt\5&\24\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2"+
		"xy\5\n\6\2y\t\3\2\2\2z|\5\24\13\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\27\2\2\u0081\u0083\5"+
		"(\25\2\u0082\u0084\5\f\7\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0087\5\f\7\2\u0086}\3\2\2\2\u0086\u0085\3\2\2\2"+
		"\u0087\13\3\2\2\2\u0088\u0089\t\2\2\2\u0089\u008a\5> \2\u008a\r\3\2\2"+
		"\2\u008b\u008c\t\3\2\2\u008c\u008f\5> \2\u008d\u008e\7\5\2\2\u008e\u0090"+
		"\7Z\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\17\3\2\2\2\u0091"+
		"\u0093\7]\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\3\2"+
		"\2\2\u0094\u0096\5&\24\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009c\5\22\n\2\u009b\u009d\5\26\f\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\21\3\2\2\2\u009e\u00a0\5\24\13\2\u009f\u009e\3\2"+
		"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\6\2\2\u00a5\u00a7\7Z"+
		"\2\2\u00a6\u00a8\5,\27\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00aa\7\t\2\2\u00aa\u00ac\5\62\32\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\23\3\2\2\2\u00ad\u00ae\t\4\2\2\u00ae"+
		"\25\3\2\2\2\u00af\u00b6\7\62\2\2\u00b0\u00b3\5\34\17\2\u00b1\u00b3\5\36"+
		"\20\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7\63\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00be\7]\2\2"+
		"\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c1"+
		"\5&\24\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5\32"+
		"\16\2\u00c6\u00c7\7=\2\2\u00c7\u00c8\5\62\32\2\u00c8\31\3\2\2\2\u00c9"+
		"\u00cb\5\24\13\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\7&\2\2\u00d0\u00d2\7Z\2\2\u00d1\u00d3\5,\27\2\u00d2\u00d1\3\2\2"+
		"\2\u00d2\u00d3\3\2\2\2\u00d3\33\3\2\2\2\u00d4\u00d6\7]\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d9\5&\24\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00e0\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\5\24\13\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00f1\7Z\2\2\u00e4"+
		"\u00f2\5*\26\2\u00e5\u00e7\5*\26\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00ef\3\2\2\2\u00e8\u00e9\7=\2\2\u00e9\u00f0\58\35\2\u00ea"+
		"\u00ec\5:\36\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef"+
		"\u00eb\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00e4\3\2\2\2\u00f1\u00e6\3\2"+
		"\2\2\u00f2\35\3\2\2\2\u00f3\u00f5\7]\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f8\5&\24\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\5 \21\2\u00fd\u00fe\7=\2\2\u00fe"+
		"\u0100\58\35\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\37\3\2\2"+
		"\2\u0101\u0103\5\24\13\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0107\u0108\7\16\2\2\u0108\u010a\7Z\2\2\u0109\u010b\5,\27\2\u010a"+
		"\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\5\""+
		"\22\2\u010d\u010f\5*\26\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"!\3\2\2\2\u0110\u011b\7\60\2\2\u0111\u0118\5\66\34\2\u0112\u0114\7\67"+
		"\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\5\66\34\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3"+
		"\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u0111\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011f\7\61"+
		"\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f#\3\2\2\2\u0120\u0121"+
		"\6\23\2\2\u0121\u012c\7\60\2\2\u0122\u0129\58\35\2\u0123\u0125\7\67\2"+
		"\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128"+
		"\58\35\2\u0127\u0124\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0122\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0130\7\61\2\2\u012f"+
		"\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130%\3\2\2\2\u0131\u0132\7<\2\2\u0132"+
		"\u0134\5\62\32\2\u0133\u0135\5:\36\2\u0134\u0133\3\2\2\2\u0134\u0135\3"+
		"\2\2\2\u0135\'\3\2\2\2\u0136\u013b\7Z\2\2\u0137\u0138\78\2\2\u0138\u013a"+
		"\7Z\2\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c)\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7B\2\2\u013f"+
		"\u0140\5\62\32\2\u0140+\3\2\2\2\u0141\u0142\7?\2\2\u0142\u0149\5.\30\2"+
		"\u0143\u0145\7\67\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0148\5.\30\2\u0147\u0144\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u014e\7>\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"-\3\2\2\2\u014f\u0151\t\5\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2"+
		"\u0151\u0152\3\2\2\2\u0152\u0153\7Z\2\2\u0153/\3\2\2\2\u0154\u0155\7?"+
		"\2\2\u0155\u015c\5\62\32\2\u0156\u0158\7\67\2\2\u0157\u0156\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\5\62\32\2\u015a\u0157\3"+
		"\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\7>\2\2\u0160\u015f\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\61\3\2\2\2\u0162\u0163\b\32\1\2\u0163\u0185"+
		"\7\'\2\2\u0164\u0185\7\31\2\2\u0165\u0185\7\27\2\2\u0166\u0185\5> \2\u0167"+
		"\u0169\5(\25\2\u0168\u016a\5\60\31\2\u0169\u0168\3\2\2\2\u0169\u016a\3"+
		"\2\2\2\u016a\u0185\3\2\2\2\u016b\u016c\7\60\2\2\u016c\u016e\5\62\32\2"+
		"\u016d\u016f\7\61\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0185"+
		"\3\2\2\2\u0170\u0171\7M\2\2\u0171\u0185\5\62\32\5\u0172\u017d\7\60\2\2"+
		"\u0173\u017a\5\62\32\2\u0174\u0176\7\67\2\2\u0175\u0174\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\5\62\32\2\u0178\u0175\3"+
		"\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u0173\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u0180\3\2\2\2\u017f\u0181\7\61\2\2\u0180\u017f\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7C\2\2\u0183\u0185\5\62"+
		"\32\3\u0184\u0162\3\2\2\2\u0184\u0164\3\2\2\2\u0184\u0165\3\2\2\2\u0184"+
		"\u0166\3\2\2\2\u0184\u0167\3\2\2\2\u0184\u016b\3\2\2\2\u0184\u0170\3\2"+
		"\2\2\u0184\u0172\3\2\2\2\u0185\u019d\3\2\2\2\u0186\u0187\f\4\2\2\u0187"+
		"\u0188\7Q\2\2\u0188\u019c\5\62\32\5\u0189\u018a\f\7\2\2\u018a\u019c\7"+
		"A\2\2\u018b\u018c\f\6\2\2\u018c\u018d\6\32\6\2\u018d\u018e\7\60\2\2\u018e"+
		"\u0195\58\35\2\u018f\u0191\7\67\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3"+
		"\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\58\35\2\u0193\u0190\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\u019a\7\61\2\2\u0199\u0198\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0186\3\2\2\2\u019b\u0189\3\2"+
		"\2\2\u019b\u018b\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\63\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a2\7Z\2\2"+
		"\u01a1\u01a3\5*\26\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\65"+
		"\3\2\2\2\u01a4\u01a7\7U\2\2\u01a5\u01a7\5\64\33\2\u01a6\u01a4\3\2\2\2"+
		"\u01a6\u01a5\3\2\2\2\u01a7\67\3\2\2\2\u01a8\u01a9\b\35\1\2\u01a9\u0210"+
		"\7\"\2\2\u01aa\u0210\7\35\2\2\u01ab\u0210\7\27\2\2\u01ac\u0210\7\32\2"+
		"\2\u01ad\u0210\7%\2\2\u01ae\u0210\7\13\2\2\u01af\u0210\7X\2\2\u01b0\u0210"+
		"\7Y\2\2\u01b1\u01b2\7#\2\2\u01b2\u01b3\7\60\2\2\u01b3\u01b5\58\35\2\u01b4"+
		"\u01b6\7\61\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u0210\3"+
		"\2\2\2\u01b7\u01b8\7$\2\2\u01b8\u01b9\7\60\2\2\u01b9\u01bb\58\35\2\u01ba"+
		"\u01bc\7\61\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u0210\3"+
		"\2\2\2\u01bd\u01be\t\3\2\2\u01be\u01bf\7\60\2\2\u01bf\u01c1\5> \2\u01c0"+
		"\u01c2\7\61\2\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u0210\3"+
		"\2\2\2\u01c3\u01c4\t\6\2\2\u01c4\u01c5\7\60\2\2\u01c5\u01c7\58\35\2\u01c6"+
		"\u01c8\7\61\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u0210\3"+
		"\2\2\2\u01c9\u01cb\7Z\2\2\u01ca\u01cc\5$\23\2\u01cb\u01ca\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u0210\3\2\2\2\u01cd\u01d1\7V\2\2\u01ce\u01d0\5@!"+
		"\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2"+
		"\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u0210\7a\2\2\u01d5"+
		"\u01d9\7W\2\2\u01d6\u01d8\5B\"\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2"+
		"\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01dc\u0210\7f\2\2\u01dd\u01df\7\30\2\2\u01de\u01e0\5\62\32\2"+
		"\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u0210"+
		"\5:\36\2\u01e2\u01e3\7!\2\2\u01e3\u01e4\78\2\2\u01e4\u01e6\7Z\2\2\u01e5"+
		"\u01e7\5$\23\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u0210\3\2"+
		"\2\2\u01e8\u01e9\7!\2\2\u01e9\u01ea\7\64\2\2\u01ea\u01ec\58\35\2\u01eb"+
		"\u01ed\7\65\2\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u0210\3"+
		"\2\2\2\u01ee\u01ef\7K\2\2\u01ef\u0210\58\35\22\u01f0\u01f1\7@\2\2\u01f1"+
		"\u0210\58\35\21\u01f2\u01f3\7\20\2\2\u01f3\u01f4\7\60\2\2\u01f4\u01f6"+
		"\58\35\2\u01f5\u01f7\7\61\2\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2"+
		"\u01f7\u01f8\3\2\2\2\u01f8\u01f9\58\35\2\u01f9\u01fa\7\b\2\2\u01fa\u01fb"+
		"\58\35\6\u01fb\u0210\3\2\2\2\u01fc\u01fd\7\25\2\2\u01fd\u01fe\7\60\2\2"+
		"\u01fe\u01ff\5\66\34\2\u01ff\u0200\7=\2\2\u0200\u0202\58\35\2\u0201\u0203"+
		"\7\61\2\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2"+
		"\u0204\u0205\58\35\5\u0205\u0210\3\2\2\2\u0206\u0207\5\"\22\2\u0207\u0208"+
		"\7C\2\2\u0208\u0209\58\35\4\u0209\u0210\3\2\2\2\u020a\u020b\7\60\2\2\u020b"+
		"\u020d\58\35\2\u020c\u020e\7\61\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3"+
		"\2\2\2\u020e\u0210\3\2\2\2\u020f\u01a8\3\2\2\2\u020f\u01aa\3\2\2\2\u020f"+
		"\u01ab\3\2\2\2\u020f\u01ac\3\2\2\2\u020f\u01ad\3\2\2\2\u020f\u01ae\3\2"+
		"\2\2\u020f\u01af\3\2\2\2\u020f\u01b0\3\2\2\2\u020f\u01b1\3\2\2\2\u020f"+
		"\u01b7\3\2\2\2\u020f\u01bd\3\2\2\2\u020f\u01c3\3\2\2\2\u020f\u01c9\3\2"+
		"\2\2\u020f\u01cd\3\2\2\2\u020f\u01d5\3\2\2\2\u020f\u01dd\3\2\2\2\u020f"+
		"\u01e2\3\2\2\2\u020f\u01e8\3\2\2\2\u020f\u01ee\3\2\2\2\u020f\u01f0\3\2"+
		"\2\2\u020f\u01f2\3\2\2\2\u020f\u01fc\3\2\2\2\u020f\u0206\3\2\2\2\u020f"+
		"\u020a\3\2\2\2\u0210\u0246\3\2\2\2\u0211\u0212\f\20\2\2\u0212\u0213\7"+
		"L\2\2\u0213\u0245\58\35\20\u0214\u0215\f\17\2\2\u0215\u0216\t\7\2\2\u0216"+
		"\u0245\58\35\20\u0217\u021b\f\16\2\2\u0218\u021c\7J\2\2\u0219\u021a\6"+
		"\35\n\2\u021a\u021c\7K\2\2\u021b\u0218\3\2\2\2\u021b\u0219\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u0245\58\35\17\u021e\u021f\f\r\2\2\u021f\u0220\t"+
		"\b\2\2\u0220\u0245\58\35\16\u0221\u0222\f\13\2\2\u0222\u0223\t\t\2\2\u0223"+
		"\u0245\58\35\f\u0224\u0225\f\n\2\2\u0225\u0226\7H\2\2\u0226\u0245\58\35"+
		"\13\u0227\u0228\f\t\2\2\u0228\u0229\7I\2\2\u0229\u0245\58\35\n\u022a\u022b"+
		"\f\b\2\2\u022b\u022c\7R\2\2\u022c\u0245\58\35\t\u022d\u022e\f\7\2\2\u022e"+
		"\u022f\7:\2\2\u022f\u0245\58\35\7\u0230\u0231\f\30\2\2\u0231\u0245\5:"+
		"\36\2\u0232\u0233\f\25\2\2\u0233\u0234\t\n\2\2\u0234\u0236\7Z\2\2\u0235"+
		"\u0237\5$\23\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0245\3\2"+
		"\2\2\u0238\u0239\f\24\2\2\u0239\u023a\6\35\24\2\u023a\u023b\7\64\2\2\u023b"+
		"\u023d\58\35\2\u023c\u023e\7\65\2\2\u023d\u023c\3\2\2\2\u023d\u023e\3"+
		"\2\2\2\u023e\u0245\3\2\2\2\u023f\u0240\f\23\2\2\u0240\u0245\7;\2\2\u0241"+
		"\u0242\f\f\2\2\u0242\u0243\t\13\2\2\u0243\u0245\5\62\32\2\u0244\u0211"+
		"\3\2\2\2\u0244\u0214\3\2\2\2\u0244\u0217\3\2\2\2\u0244\u021e\3\2\2\2\u0244"+
		"\u0221\3\2\2\2\u0244\u0224\3\2\2\2\u0244\u0227\3\2\2\2\u0244\u022a\3\2"+
		"\2\2\u0244\u022d\3\2\2\2\u0244\u0230\3\2\2\2\u0244\u0232\3\2\2\2\u0244"+
		"\u0238\3\2\2\2\u0244\u023f\3\2\2\2\u0244\u0241\3\2\2\2\u0245\u0248\3\2"+
		"\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u02479\3\2\2\2\u0248\u0246"+
		"\3\2\2\2\u0249\u0256\7\62\2\2\u024a\u0251\5\66\34\2\u024b\u024d\7\67\2"+
		"\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250"+
		"\5\66\34\2\u024f\u024c\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2"+
		"\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0255"+
		"\7C\2\2\u0255\u0257\3\2\2\2\u0256\u024a\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u025b\3\2\2\2\u0258\u025a\5<\37\2\u0259\u0258\3\2\2\2\u025a\u025d\3\2"+
		"\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025f\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025e\u0260\7\63\2\2\u025f\u025e\3\2\2\2\u025f\u0260\3"+
		"\2\2\2\u0260;\3\2\2\2\u0261\u0263\5\24\13\2\u0262\u0261\3\2\2\2\u0263"+
		"\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2"+
		"\2\2\u0266\u0264\3\2\2\2\u0267\u0272\7Z\2\2\u0268\u026a\5*\26\2\u0269"+
		"\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\7="+
		"\2\2\u026c\u0273\58\35\2\u026d\u026f\5:\36\2\u026e\u026d\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\3\2"+
		"\2\2\u0272\u0269\3\2\2\2\u0272\u026e\3\2\2\2\u0273\u02b7\3\2\2\2\u0274"+
		"\u0275\5 \21\2\u0275\u0276\7=\2\2\u0276\u0277\58\35\2\u0277\u02b7\3\2"+
		"\2\2\u0278\u0279\7\66\2\2\u0279\u027b\58\35\2\u027a\u027c\7\65\2\2\u027b"+
		"\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027f\7\65"+
		"\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0287\3\2\2\2\u0280"+
		"\u0281\7=\2\2\u0281\u0288\58\35\2\u0282\u0284\5:\36\2\u0283\u0282\3\2"+
		"\2\2\u0284\u0285\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0288\3\2\2\2\u0287\u0280\3\2\2\2\u0287\u0283\3\2\2\2\u0288\u02b7\3\2"+
		"\2\2\u0289\u028a\7\64\2\2\u028a\u028c\58\35\2\u028b\u028d\7\65\2\2\u028c"+
		"\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u0290\7\65"+
		"\2\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0298\3\2\2\2\u0291"+
		"\u0292\7=\2\2\u0292\u0299\58\35\2\u0293\u0295\5:\36\2\u0294\u0293\3\2"+
		"\2\2\u0295\u0296\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u0299\3\2\2\2\u0298\u0291\3\2\2\2\u0298\u0294\3\2\2\2\u0299\u02b7\3\2"+
		"\2\2\u029a\u02b7\58\35\2\u029b\u029c\t\f\2\2\u029c\u02b7\58\35\2\u029d"+
		"\u029e\7(\2\2\u029e\u029f\7\60\2\2\u029f\u02a1\58\35\2\u02a0\u02a2\7\61"+
		"\2\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a6\5:\36\2\u02a4\u02a5\7\b\2\2\u02a5\u02a7\5:\36\2\u02a6\u02a4\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02b7\3\2\2\2\u02a8\u02a9\7\r\2\2\u02a9"+
		"\u02aa\7\60\2\2\u02aa\u02ad\5\66\34\2\u02ab\u02ac\7\67\2\2\u02ac\u02ae"+
		"\5\66\34\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2\2\2"+
		"\u02af\u02b0\7\23\2\2\u02b0\u02b2\58\35\2\u02b1\u02b3\7\61\2\2\u02b2\u02b1"+
		"\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\5:\36\2\u02b5"+
		"\u02b7\3\2\2\2\u02b6\u0264\3\2\2\2\u02b6\u0274\3\2\2\2\u02b6\u0278\3\2"+
		"\2\2\u02b6\u0289\3\2\2\2\u02b6\u029a\3\2\2\2\u02b6\u029b\3\2\2\2\u02b6"+
		"\u029d\3\2\2\2\u02b6\u02a8\3\2\2\2\u02b7=\3\2\2\2\u02b8\u02be\7V\2\2\u02b9"+
		"\u02bd\7e\2\2\u02ba\u02bd\7d\2\2\u02bb\u02bd\7c\2\2\u02bc\u02b9\3\2\2"+
		"\2\u02bc\u02ba\3\2\2\2\u02bc\u02bb\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc"+
		"\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1"+
		"\u02c2\7a\2\2\u02c2?\3\2\2\2\u02c3\u02c4\7b\2\2\u02c4\u02c5\58\35\2\u02c5"+
		"\u02c6\7\61\2\2\u02c6\u02cf\3\2\2\2\u02c7\u02cb\7e\2\2\u02c8\u02cb\7d"+
		"\2\2\u02c9\u02cb\7c\2\2\u02ca\u02c7\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca"+
		"\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2"+
		"\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02c3\3\2\2\2\u02ce\u02ca\3\2\2\2\u02cf"+
		"A\3\2\2\2\u02d0\u02d1\7g\2\2\u02d1\u02d2\58\35\2\u02d2\u02d3\7\61\2\2"+
		"\u02d3\u02dd\3\2\2\2\u02d4\u02d9\7k\2\2\u02d5\u02d9\7j\2\2\u02d6\u02d9"+
		"\7i\2\2\u02d7\u02d9\7h\2\2\u02d8\u02d4\3\2\2\2\u02d8\u02d5\3\2\2\2\u02d8"+
		"\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02d8\3\2"+
		"\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc\u02d0\3\2\2\2\u02dc"+
		"\u02d8\3\2\2\2\u02ddC\3\2\2\2\u02de\u02df\t\r\2\2\u02dfE\3\2\2\2xMQZ_"+
		"fjpu}\u0083\u0086\u008f\u0092\u0097\u009c\u00a1\u00a7\u00ab\u00b2\u00b6"+
		"\u00ba\u00bd\u00c2\u00cc\u00d2\u00d5\u00da\u00e0\u00e6\u00ed\u00ef\u00f1"+
		"\u00f4\u00f9\u00ff\u0104\u010a\u010e\u0113\u0118\u011b\u011e\u0124\u0129"+
		"\u012c\u012f\u0134\u013b\u0144\u0149\u014d\u0150\u0157\u015c\u0160\u0169"+
		"\u016e\u0175\u017a\u017d\u0180\u0184\u0190\u0195\u0199\u019b\u019d\u01a2"+
		"\u01a6\u01b5\u01bb\u01c1\u01c7\u01cb\u01d1\u01d9\u01df\u01e6\u01ec\u01f6"+
		"\u0202\u020d\u020f\u021b\u0236\u023d\u0244\u0246\u024c\u0251\u0256\u025b"+
		"\u025f\u0264\u0269\u0270\u0272\u027b\u027e\u0285\u0287\u028c\u028f\u0296"+
		"\u0298\u02a1\u02a6\u02ad\u02b2\u02b6\u02bc\u02be\u02ca\u02cc\u02ce\u02d8"+
		"\u02da\u02dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
	}
}