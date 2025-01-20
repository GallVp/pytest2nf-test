// Generated from ConfigParser.g4 by ANTLR 4.9.2

package nextflow.script.parser;

import nextflow.script.parser.AbstractParser;
import org.apache.groovy.parser.antlr4.GroovySyntaxError;

import static nextflow.script.parser.SemanticPredicates.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConfigParser}.
 */
public interface ConfigParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConfigParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ConfigParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ConfigParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configIncludeStmtAlt}
	 * labeled alternative in {@link ConfigParser#configStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigIncludeStmtAlt(ConfigParser.ConfigIncludeStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configIncludeStmtAlt}
	 * labeled alternative in {@link ConfigParser#configStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigIncludeStmtAlt(ConfigParser.ConfigIncludeStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configAssignmentStmtAlt}
	 * labeled alternative in {@link ConfigParser#configStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigAssignmentStmtAlt(ConfigParser.ConfigAssignmentStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configAssignmentStmtAlt}
	 * labeled alternative in {@link ConfigParser#configStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigAssignmentStmtAlt(ConfigParser.ConfigAssignmentStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigBlockStmtAlt(ConfigParser.ConfigBlockStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigBlockStmtAlt(ConfigParser.ConfigBlockStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configAppendBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigAppendBlockStmtAlt(ConfigParser.ConfigAppendBlockStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configAppendBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigAppendBlockStmtAlt(ConfigParser.ConfigAppendBlockStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configIncompleteStmtAlt}
	 * labeled alternative in {@link ConfigParser#configStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigIncompleteStmtAlt(ConfigParser.ConfigIncompleteStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configIncompleteStmtAlt}
	 * labeled alternative in {@link ConfigParser#configStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigIncompleteStmtAlt(ConfigParser.ConfigIncompleteStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configInvalidStmtAlt}
	 * labeled alternative in {@link ConfigParser#configStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigInvalidStmtAlt(ConfigParser.ConfigInvalidStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configInvalidStmtAlt}
	 * labeled alternative in {@link ConfigParser#configStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigInvalidStmtAlt(ConfigParser.ConfigInvalidStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#configInclude}.
	 * @param ctx the parse tree
	 */
	void enterConfigInclude(ConfigParser.ConfigIncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#configInclude}.
	 * @param ctx the parse tree
	 */
	void exitConfigInclude(ConfigParser.ConfigIncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#configAssignment}.
	 * @param ctx the parse tree
	 */
	void enterConfigAssignment(ConfigParser.ConfigAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#configAssignment}.
	 * @param ctx the parse tree
	 */
	void exitConfigAssignment(ConfigParser.ConfigAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#configAssignmentPath}.
	 * @param ctx the parse tree
	 */
	void enterConfigAssignmentPath(ConfigParser.ConfigAssignmentPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#configAssignmentPath}.
	 * @param ctx the parse tree
	 */
	void exitConfigAssignmentPath(ConfigParser.ConfigAssignmentPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#configPrimary}.
	 * @param ctx the parse tree
	 */
	void enterConfigPrimary(ConfigParser.ConfigPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#configPrimary}.
	 * @param ctx the parse tree
	 */
	void exitConfigPrimary(ConfigParser.ConfigPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#configBlock}.
	 * @param ctx the parse tree
	 */
	void enterConfigBlock(ConfigParser.ConfigBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#configBlock}.
	 * @param ctx the parse tree
	 */
	void exitConfigBlock(ConfigParser.ConfigBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configIncludeBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigIncludeBlockStmtAlt(ConfigParser.ConfigIncludeBlockStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configIncludeBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigIncludeBlockStmtAlt(ConfigParser.ConfigIncludeBlockStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configAssignmentBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigAssignmentBlockStmtAlt(ConfigParser.ConfigAssignmentBlockStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configAssignmentBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigAssignmentBlockStmtAlt(ConfigParser.ConfigAssignmentBlockStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configBlockBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigBlockBlockStmtAlt(ConfigParser.ConfigBlockBlockStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configBlockBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigBlockBlockStmtAlt(ConfigParser.ConfigBlockBlockStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configAppendBlockBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigAppendBlockBlockStmtAlt(ConfigParser.ConfigAppendBlockBlockStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configAppendBlockBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigAppendBlockBlockStmtAlt(ConfigParser.ConfigAppendBlockBlockStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configSelectorBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigSelectorBlockStmtAlt(ConfigParser.ConfigSelectorBlockStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configSelectorBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigSelectorBlockStmtAlt(ConfigParser.ConfigSelectorBlockStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configIncompleteBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigIncompleteBlockStmtAlt(ConfigParser.ConfigIncompleteBlockStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configIncompleteBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigIncompleteBlockStmtAlt(ConfigParser.ConfigIncompleteBlockStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configInvalidBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigInvalidBlockStmtAlt(ConfigParser.ConfigInvalidBlockStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configInvalidBlockStmtAlt}
	 * labeled alternative in {@link ConfigParser#configBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigInvalidBlockStmtAlt(ConfigParser.ConfigInvalidBlockStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#configSelector}.
	 * @param ctx the parse tree
	 */
	void enterConfigSelector(ConfigParser.ConfigSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#configSelector}.
	 * @param ctx the parse tree
	 */
	void exitConfigSelector(ConfigParser.ConfigSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#configAppendBlock}.
	 * @param ctx the parse tree
	 */
	void enterConfigAppendBlock(ConfigParser.ConfigAppendBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#configAppendBlock}.
	 * @param ctx the parse tree
	 */
	void exitConfigAppendBlock(ConfigParser.ConfigAppendBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#configAppendBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigAppendBlockStatement(ConfigParser.ConfigAppendBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#configAppendBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigAppendBlockStatement(ConfigParser.ConfigAppendBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#configIncomplete}.
	 * @param ctx the parse tree
	 */
	void enterConfigIncomplete(ConfigParser.ConfigIncompleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#configIncomplete}.
	 * @param ctx the parse tree
	 */
	void exitConfigIncomplete(ConfigParser.ConfigIncompleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#invalidStatement}.
	 * @param ctx the parse tree
	 */
	void enterInvalidStatement(ConfigParser.InvalidStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#invalidStatement}.
	 * @param ctx the parse tree
	 */
	void exitInvalidStatement(ConfigParser.InvalidStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmtAlt(ConfigParser.IfElseStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmtAlt(ConfigParser.IfElseStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryCatchStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStmtAlt(ConfigParser.TryCatchStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryCatchStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStmtAlt(ConfigParser.TryCatchStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmtAlt(ConfigParser.ReturnStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmtAlt(ConfigParser.ReturnStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code throwStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStmtAlt(ConfigParser.ThrowStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code throwStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStmtAlt(ConfigParser.ThrowStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assertStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStmtAlt(ConfigParser.AssertStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assertStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStmtAlt(ConfigParser.AssertStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclarationStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStmtAlt(ConfigParser.VariableDeclarationStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclarationStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStmtAlt(ConfigParser.VariableDeclarationStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleAssignmentStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleAssignmentStmtAlt(ConfigParser.MultipleAssignmentStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleAssignmentStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleAssignmentStmtAlt(ConfigParser.MultipleAssignmentStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmtAlt(ConfigParser.AssignmentStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmtAlt(ConfigParser.AssignmentStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmtAlt(ConfigParser.ExpressionStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmtAlt(ConfigParser.ExpressionStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmtAlt(ConfigParser.EmptyStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStmtAlt}
	 * labeled alternative in {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmtAlt(ConfigParser.EmptyStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(ConfigParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(ConfigParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#statementOrBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementOrBlock(ConfigParser.StatementOrBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#statementOrBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementOrBlock(ConfigParser.StatementOrBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(ConfigParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(ConfigParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(ConfigParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(ConfigParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(ConfigParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(ConfigParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#catchTypes}.
	 * @param ctx the parse tree
	 */
	void enterCatchTypes(ConfigParser.CatchTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#catchTypes}.
	 * @param ctx the parse tree
	 */
	void exitCatchTypes(ConfigParser.CatchTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(ConfigParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(ConfigParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ConfigParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ConfigParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#variableNames}.
	 * @param ctx the parse tree
	 */
	void enterVariableNames(ConfigParser.VariableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#variableNames}.
	 * @param ctx the parse tree
	 */
	void exitVariableNames(ConfigParser.VariableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#multipleAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleAssignmentStatement(ConfigParser.MultipleAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#multipleAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleAssignmentStatement(ConfigParser.MultipleAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(ConfigParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(ConfigParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ConfigParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ConfigParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryNotExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNotExprAlt(ConfigParser.UnaryNotExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryNotExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNotExprAlt(ConfigParser.UnaryNotExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExprAlt(ConfigParser.ShiftExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExprAlt(ConfigParser.ShiftExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseOrExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOrExprAlt(ConfigParser.BitwiseOrExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseOrExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOrExprAlt(ConfigParser.BitwiseOrExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExprAlt(ConfigParser.MultDivExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExprAlt(ConfigParser.MultDivExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExprAlt(ConfigParser.AddSubExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExprAlt(ConfigParser.AddSubExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exclusiveOrExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExprAlt(ConfigParser.ExclusiveOrExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclusiveOrExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExprAlt(ConfigParser.ExclusiveOrExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRegexExprAlt(ConfigParser.RegexExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRegexExprAlt(ConfigParser.RegexExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExprAlt(ConfigParser.ConditionalExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExprAlt(ConfigParser.ConditionalExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExprAlt(ConfigParser.PowerExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExprAlt(ConfigParser.PowerExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExprAlt(ConfigParser.RelationalExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExprAlt(ConfigParser.RelationalExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExprAlt(ConfigParser.LogicalAndExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExprAlt(ConfigParser.LogicalAndExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseAndExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndExprAlt(ConfigParser.BitwiseAndExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseAndExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndExprAlt(ConfigParser.BitwiseAndExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryAddExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryAddExprAlt(ConfigParser.UnaryAddExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryAddExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryAddExprAlt(ConfigParser.UnaryAddExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalCastExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalCastExprAlt(ConfigParser.RelationalCastExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalCastExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalCastExprAlt(ConfigParser.RelationalCastExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExprAlt(ConfigParser.LogicalOrExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExprAlt(ConfigParser.LogicalOrExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExprAlt(ConfigParser.EqualityExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExprAlt(ConfigParser.EqualityExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pathExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPathExprAlt(ConfigParser.PathExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pathExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPathExprAlt(ConfigParser.PathExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalTypeExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalTypeExprAlt(ConfigParser.RelationalTypeExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalTypeExprAlt}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalTypeExprAlt(ConfigParser.RelationalTypeExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPrmrAlt(ConfigParser.IdentifierPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPrmrAlt(ConfigParser.IdentifierPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralPrmrAlt(ConfigParser.LiteralPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralPrmrAlt(ConfigParser.LiteralPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterGstringPrmrAlt(ConfigParser.GstringPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitGstringPrmrAlt(ConfigParser.GstringPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNewPrmrAlt(ConfigParser.NewPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNewPrmrAlt(ConfigParser.NewPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParenPrmrAlt(ConfigParser.ParenPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParenPrmrAlt(ConfigParser.ParenPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code closurePrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterClosurePrmrAlt(ConfigParser.ClosurePrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code closurePrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitClosurePrmrAlt(ConfigParser.ClosurePrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterListPrmrAlt(ConfigParser.ListPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitListPrmrAlt(ConfigParser.ListPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterMapPrmrAlt(ConfigParser.MapPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapPrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitMapPrmrAlt(ConfigParser.MapPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code builtInTypePrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInTypePrmrAlt(ConfigParser.BuiltInTypePrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code builtInTypePrmrAlt}
	 * labeled alternative in {@link ConfigParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInTypePrmrAlt(ConfigParser.BuiltInTypePrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyPathExprAlt}
	 * labeled alternative in {@link ConfigParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterPropertyPathExprAlt(ConfigParser.PropertyPathExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyPathExprAlt}
	 * labeled alternative in {@link ConfigParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitPropertyPathExprAlt(ConfigParser.PropertyPathExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code closurePathExprAlt}
	 * labeled alternative in {@link ConfigParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterClosurePathExprAlt(ConfigParser.ClosurePathExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code closurePathExprAlt}
	 * labeled alternative in {@link ConfigParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitClosurePathExprAlt(ConfigParser.ClosurePathExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code closureWithLabelsPathExprAlt}
	 * labeled alternative in {@link ConfigParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterClosureWithLabelsPathExprAlt(ConfigParser.ClosureWithLabelsPathExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code closureWithLabelsPathExprAlt}
	 * labeled alternative in {@link ConfigParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitClosureWithLabelsPathExprAlt(ConfigParser.ClosureWithLabelsPathExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentsPathExprAlt}
	 * labeled alternative in {@link ConfigParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsPathExprAlt(ConfigParser.ArgumentsPathExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentsPathExprAlt}
	 * labeled alternative in {@link ConfigParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsPathExprAlt(ConfigParser.ArgumentsPathExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexPathExprAlt}
	 * labeled alternative in {@link ConfigParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterIndexPathExprAlt(ConfigParser.IndexPathExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexPathExprAlt}
	 * labeled alternative in {@link ConfigParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitIndexPathExprAlt(ConfigParser.IndexPathExprAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#namedProperty}.
	 * @param ctx the parse tree
	 */
	void enterNamedProperty(ConfigParser.NamedPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#namedProperty}.
	 * @param ctx the parse tree
	 */
	void exitNamedProperty(ConfigParser.NamedPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#indexPropertyArgs}.
	 * @param ctx the parse tree
	 */
	void enterIndexPropertyArgs(ConfigParser.IndexPropertyArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#indexPropertyArgs}.
	 * @param ctx the parse tree
	 */
	void exitIndexPropertyArgs(ConfigParser.IndexPropertyArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ConfigParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ConfigParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteralAlt}
	 * labeled alternative in {@link ConfigParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteralAlt(ConfigParser.IntegerLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteralAlt}
	 * labeled alternative in {@link ConfigParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteralAlt(ConfigParser.IntegerLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatingPointLiteralAlt}
	 * labeled alternative in {@link ConfigParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteralAlt(ConfigParser.FloatingPointLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatingPointLiteralAlt}
	 * labeled alternative in {@link ConfigParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteralAlt(ConfigParser.FloatingPointLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteralAlt}
	 * labeled alternative in {@link ConfigParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralAlt(ConfigParser.StringLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteralAlt}
	 * labeled alternative in {@link ConfigParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralAlt(ConfigParser.StringLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteralAlt}
	 * labeled alternative in {@link ConfigParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteralAlt(ConfigParser.BooleanLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteralAlt}
	 * labeled alternative in {@link ConfigParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteralAlt(ConfigParser.BooleanLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteralAlt}
	 * labeled alternative in {@link ConfigParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteralAlt(ConfigParser.NullLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteralAlt}
	 * labeled alternative in {@link ConfigParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteralAlt(ConfigParser.NullLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ConfigParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ConfigParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#gstring}.
	 * @param ctx the parse tree
	 */
	void enterGstring(ConfigParser.GstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#gstring}.
	 * @param ctx the parse tree
	 */
	void exitGstring(ConfigParser.GstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringDqTextAlt}
	 * labeled alternative in {@link ConfigParser#gstringDqPart}.
	 * @param ctx the parse tree
	 */
	void enterGstringDqTextAlt(ConfigParser.GstringDqTextAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringDqTextAlt}
	 * labeled alternative in {@link ConfigParser#gstringDqPart}.
	 * @param ctx the parse tree
	 */
	void exitGstringDqTextAlt(ConfigParser.GstringDqTextAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringDqPathAlt}
	 * labeled alternative in {@link ConfigParser#gstringDqPart}.
	 * @param ctx the parse tree
	 */
	void enterGstringDqPathAlt(ConfigParser.GstringDqPathAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringDqPathAlt}
	 * labeled alternative in {@link ConfigParser#gstringDqPart}.
	 * @param ctx the parse tree
	 */
	void exitGstringDqPathAlt(ConfigParser.GstringDqPathAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringDqExprAlt}
	 * labeled alternative in {@link ConfigParser#gstringDqPart}.
	 * @param ctx the parse tree
	 */
	void enterGstringDqExprAlt(ConfigParser.GstringDqExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringDqExprAlt}
	 * labeled alternative in {@link ConfigParser#gstringDqPart}.
	 * @param ctx the parse tree
	 */
	void exitGstringDqExprAlt(ConfigParser.GstringDqExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringTdqTextAlt}
	 * labeled alternative in {@link ConfigParser#gstringTdqPart}.
	 * @param ctx the parse tree
	 */
	void enterGstringTdqTextAlt(ConfigParser.GstringTdqTextAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringTdqTextAlt}
	 * labeled alternative in {@link ConfigParser#gstringTdqPart}.
	 * @param ctx the parse tree
	 */
	void exitGstringTdqTextAlt(ConfigParser.GstringTdqTextAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringTdqPathAlt}
	 * labeled alternative in {@link ConfigParser#gstringTdqPart}.
	 * @param ctx the parse tree
	 */
	void enterGstringTdqPathAlt(ConfigParser.GstringTdqPathAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringTdqPathAlt}
	 * labeled alternative in {@link ConfigParser#gstringTdqPart}.
	 * @param ctx the parse tree
	 */
	void exitGstringTdqPathAlt(ConfigParser.GstringTdqPathAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringTdqExprAlt}
	 * labeled alternative in {@link ConfigParser#gstringTdqPart}.
	 * @param ctx the parse tree
	 */
	void enterGstringTdqExprAlt(ConfigParser.GstringTdqExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringTdqExprAlt}
	 * labeled alternative in {@link ConfigParser#gstringTdqPart}.
	 * @param ctx the parse tree
	 */
	void exitGstringTdqExprAlt(ConfigParser.GstringTdqExprAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(ConfigParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(ConfigParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(ConfigParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(ConfigParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(ConfigParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(ConfigParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#closure}.
	 * @param ctx the parse tree
	 */
	void enterClosure(ConfigParser.ClosureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#closure}.
	 * @param ctx the parse tree
	 */
	void exitClosure(ConfigParser.ClosureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ConfigParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ConfigParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ConfigParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ConfigParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#closureWithLabels}.
	 * @param ctx the parse tree
	 */
	void enterClosureWithLabels(ConfigParser.ClosureWithLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#closureWithLabels}.
	 * @param ctx the parse tree
	 */
	void exitClosureWithLabels(ConfigParser.ClosureWithLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#blockStatementsWithLabels}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementsWithLabels(ConfigParser.BlockStatementsWithLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#blockStatementsWithLabels}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementsWithLabels(ConfigParser.BlockStatementsWithLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#statementOrLabeled}.
	 * @param ctx the parse tree
	 */
	void enterStatementOrLabeled(ConfigParser.StatementOrLabeledContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#statementOrLabeled}.
	 * @param ctx the parse tree
	 */
	void exitStatementOrLabeled(ConfigParser.StatementOrLabeledContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ConfigParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ConfigParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ConfigParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ConfigParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(ConfigParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(ConfigParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#mapEntryList}.
	 * @param ctx the parse tree
	 */
	void enterMapEntryList(ConfigParser.MapEntryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#mapEntryList}.
	 * @param ctx the parse tree
	 */
	void exitMapEntryList(ConfigParser.MapEntryListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void enterMapEntry(ConfigParser.MapEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void exitMapEntry(ConfigParser.MapEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#mapEntryLabel}.
	 * @param ctx the parse tree
	 */
	void enterMapEntryLabel(ConfigParser.MapEntryLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#mapEntryLabel}.
	 * @param ctx the parse tree
	 */
	void exitMapEntryLabel(ConfigParser.MapEntryLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInType(ConfigParser.BuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInType(ConfigParser.BuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ConfigParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ConfigParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ConfigParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ConfigParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#argumentListElement}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListElement(ConfigParser.ArgumentListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#argumentListElement}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListElement(ConfigParser.ArgumentListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#namedArg}.
	 * @param ctx the parse tree
	 */
	void enterNamedArg(ConfigParser.NamedArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#namedArg}.
	 * @param ctx the parse tree
	 */
	void exitNamedArg(ConfigParser.NamedArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ConfigParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ConfigParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ConfigParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ConfigParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#qualifiedClassName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedClassName(ConfigParser.QualifiedClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#qualifiedClassName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedClassName(ConfigParser.QualifiedClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#qualifiedNameElements}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameElements(ConfigParser.QualifiedNameElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#qualifiedNameElements}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameElements(ConfigParser.QualifiedNameElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#qualifiedNameElement}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameElement(ConfigParser.QualifiedNameElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#qualifiedNameElement}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameElement(ConfigParser.QualifiedNameElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(ConfigParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(ConfigParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ConfigParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ConfigParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#legacyType}.
	 * @param ctx the parse tree
	 */
	void enterLegacyType(ConfigParser.LegacyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#legacyType}.
	 * @param ctx the parse tree
	 */
	void exitLegacyType(ConfigParser.LegacyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#keywords}.
	 * @param ctx the parse tree
	 */
	void enterKeywords(ConfigParser.KeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#keywords}.
	 * @param ctx the parse tree
	 */
	void exitKeywords(ConfigParser.KeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#rparen}.
	 * @param ctx the parse tree
	 */
	void enterRparen(ConfigParser.RparenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#rparen}.
	 * @param ctx the parse tree
	 */
	void exitRparen(ConfigParser.RparenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#nls}.
	 * @param ctx the parse tree
	 */
	void enterNls(ConfigParser.NlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#nls}.
	 * @param ctx the parse tree
	 */
	void exitNls(ConfigParser.NlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#sep}.
	 * @param ctx the parse tree
	 */
	void enterSep(ConfigParser.SepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#sep}.
	 * @param ctx the parse tree
	 */
	void exitSep(ConfigParser.SepContext ctx);
}