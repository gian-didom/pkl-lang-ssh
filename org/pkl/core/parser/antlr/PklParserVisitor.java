// Generated from PklParser.g4 by ANTLR 4.9.0

package org.pkl.core.parser.antlr;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PklParser}.
 *
 * @param <Result> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PklParserVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by the {@code unknownType}
	 * labeled alternative in {@link PklParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitUnknownType(@NotNull PklParser.UnknownTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code nothingType}
	 * labeled alternative in {@link PklParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitNothingType(@NotNull PklParser.NothingTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code moduleType}
	 * labeled alternative in {@link PklParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitModuleType(@NotNull PklParser.ModuleTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code stringLiteralType}
	 * labeled alternative in {@link PklParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitStringLiteralType(@NotNull PklParser.StringLiteralTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code declaredType}
	 * labeled alternative in {@link PklParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitDeclaredType(@NotNull PklParser.DeclaredTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code parenthesizedType}
	 * labeled alternative in {@link PklParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitParenthesizedType(@NotNull PklParser.ParenthesizedTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code nullableType}
	 * labeled alternative in {@link PklParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitNullableType(@NotNull PklParser.NullableTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code constrainedType}
	 * labeled alternative in {@link PklParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitConstrainedType(@NotNull PklParser.ConstrainedTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code defaultUnionType}
	 * labeled alternative in {@link PklParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitDefaultUnionType(@NotNull PklParser.DefaultUnionTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code unionType}
	 * labeled alternative in {@link PklParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitUnionType(@NotNull PklParser.UnionTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code functionType}
	 * labeled alternative in {@link PklParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitFunctionType(@NotNull PklParser.FunctionTypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitThisExpr(@NotNull PklParser.ThisExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code outerExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitOuterExpr(@NotNull PklParser.OuterExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code moduleExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitModuleExpr(@NotNull PklParser.ModuleExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitNullLiteral(@NotNull PklParser.NullLiteralContext ctx);

	/**
	 * Visit a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitTrueLiteral(@NotNull PklParser.TrueLiteralContext ctx);

	/**
	 * Visit a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitFalseLiteral(@NotNull PklParser.FalseLiteralContext ctx);

	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitIntLiteral(@NotNull PklParser.IntLiteralContext ctx);

	/**
	 * Visit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitFloatLiteral(@NotNull PklParser.FloatLiteralContext ctx);

	/**
	 * Visit a parse tree produced by the {@code throwExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitThrowExpr(@NotNull PklParser.ThrowExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code traceExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitTraceExpr(@NotNull PklParser.TraceExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code importExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitImportExpr(@NotNull PklParser.ImportExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code readExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitReadExpr(@NotNull PklParser.ReadExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code unqualifiedAccessExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitUnqualifiedAccessExpr(@NotNull PklParser.UnqualifiedAccessExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code singleLineStringLiteral}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitSingleLineStringLiteral(@NotNull PklParser.SingleLineStringLiteralContext ctx);

	/**
	 * Visit a parse tree produced by the {@code multiLineStringLiteral}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitMultiLineStringLiteral(@NotNull PklParser.MultiLineStringLiteralContext ctx);

	/**
	 * Visit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitNewExpr(@NotNull PklParser.NewExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code amendExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitAmendExpr(@NotNull PklParser.AmendExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code superAccessExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitSuperAccessExpr(@NotNull PklParser.SuperAccessExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code superSubscriptExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitSuperSubscriptExpr(@NotNull PklParser.SuperSubscriptExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code qualifiedAccessExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitQualifiedAccessExpr(@NotNull PklParser.QualifiedAccessExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code subscriptExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitSubscriptExpr(@NotNull PklParser.SubscriptExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code nonNullExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitNonNullExpr(@NotNull PklParser.NonNullExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitUnaryMinusExpr(@NotNull PklParser.UnaryMinusExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code logicalNotExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitLogicalNotExpr(@NotNull PklParser.LogicalNotExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code exponentiationExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitExponentiationExpr(@NotNull PklParser.ExponentiationExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitMultiplicativeExpr(@NotNull PklParser.MultiplicativeExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitAdditiveExpr(@NotNull PklParser.AdditiveExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitComparisonExpr(@NotNull PklParser.ComparisonExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code typeTestExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitTypeTestExpr(@NotNull PklParser.TypeTestExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitEqualityExpr(@NotNull PklParser.EqualityExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code logicalAndExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitLogicalAndExpr(@NotNull PklParser.LogicalAndExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code logicalOrExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitLogicalOrExpr(@NotNull PklParser.LogicalOrExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code pipeExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitPipeExpr(@NotNull PklParser.PipeExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code nullCoalesceExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitNullCoalesceExpr(@NotNull PklParser.NullCoalesceExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ifExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitIfExpr(@NotNull PklParser.IfExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code letExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitLetExpr(@NotNull PklParser.LetExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code functionLiteral}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitFunctionLiteral(@NotNull PklParser.FunctionLiteralContext ctx);

	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpr}
	 * labeled alternative in {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitParenthesizedExpr(@NotNull PklParser.ParenthesizedExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code objectProperty}
	 * labeled alternative in {@link PklParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitObjectProperty(@NotNull PklParser.ObjectPropertyContext ctx);

	/**
	 * Visit a parse tree produced by the {@code objectMethod}
	 * labeled alternative in {@link PklParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitObjectMethod(@NotNull PklParser.ObjectMethodContext ctx);

	/**
	 * Visit a parse tree produced by the {@code memberPredicate}
	 * labeled alternative in {@link PklParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitMemberPredicate(@NotNull PklParser.MemberPredicateContext ctx);

	/**
	 * Visit a parse tree produced by the {@code objectEntry}
	 * labeled alternative in {@link PklParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitObjectEntry(@NotNull PklParser.ObjectEntryContext ctx);

	/**
	 * Visit a parse tree produced by the {@code objectElement}
	 * labeled alternative in {@link PklParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitObjectElement(@NotNull PklParser.ObjectElementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code objectSpread}
	 * labeled alternative in {@link PklParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitObjectSpread(@NotNull PklParser.ObjectSpreadContext ctx);

	/**
	 * Visit a parse tree produced by the {@code whenGenerator}
	 * labeled alternative in {@link PklParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitWhenGenerator(@NotNull PklParser.WhenGeneratorContext ctx);

	/**
	 * Visit a parse tree produced by the {@code forGenerator}
	 * labeled alternative in {@link PklParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitForGenerator(@NotNull PklParser.ForGeneratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#replInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitReplInput(@NotNull PklParser.ReplInputContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#exprInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitExprInput(@NotNull PklParser.ExprInputContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitModule(@NotNull PklParser.ModuleContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#moduleDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitModuleDecl(@NotNull PklParser.ModuleDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#moduleHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitModuleHeader(@NotNull PklParser.ModuleHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#moduleExtendsOrAmendsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitModuleExtendsOrAmendsClause(@NotNull PklParser.ModuleExtendsOrAmendsClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#importClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitImportClause(@NotNull PklParser.ImportClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#clazz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitClazz(@NotNull PklParser.ClazzContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#classHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitClassHeader(@NotNull PklParser.ClassHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitModifier(@NotNull PklParser.ModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitClassBody(@NotNull PklParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#typeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitTypeAlias(@NotNull PklParser.TypeAliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#typeAliasHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitTypeAliasHeader(@NotNull PklParser.TypeAliasHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#classProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitClassProperty(@NotNull PklParser.ClassPropertyContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#classMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitClassMethod(@NotNull PklParser.ClassMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitMethodHeader(@NotNull PklParser.MethodHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitParameterList(@NotNull PklParser.ParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitArgumentList(@NotNull PklParser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitAnnotation(@NotNull PklParser.AnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitQualifiedIdentifier(@NotNull PklParser.QualifiedIdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitTypeAnnotation(@NotNull PklParser.TypeAnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitTypeParameterList(@NotNull PklParser.TypeParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitTypeParameter(@NotNull PklParser.TypeParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitTypeArgumentList(@NotNull PklParser.TypeArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitType(@NotNull PklParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#typedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitTypedIdentifier(@NotNull PklParser.TypedIdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitParameter(@NotNull PklParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitExpr(@NotNull PklParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#objectBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitObjectBody(@NotNull PklParser.ObjectBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitObjectMember(@NotNull PklParser.ObjectMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitStringConstant(@NotNull PklParser.StringConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#singleLineStringPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitSingleLineStringPart(@NotNull PklParser.SingleLineStringPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#multiLineStringPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitMultiLineStringPart(@NotNull PklParser.MultiLineStringPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link PklParser#reservedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	Result visitReservedKeyword(@NotNull PklParser.ReservedKeywordContext ctx);
}