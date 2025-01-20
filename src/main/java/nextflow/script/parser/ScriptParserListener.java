// Generated from ScriptParser.g4 by ANTLR 4.9.2

package nextflow.script.parser;

import org.apache.groovy.parser.antlr4.GroovySyntaxError;

import static nextflow.script.parser.SemanticPredicates.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScriptParser}.
 */
public interface ScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ScriptParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ScriptParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#scriptDeclarationOrStatement}.
	 * @param ctx the parse tree
	 */
	void enterScriptDeclarationOrStatement(ScriptParser.ScriptDeclarationOrStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#scriptDeclarationOrStatement}.
	 * @param ctx the parse tree
	 */
	void exitScriptDeclarationOrStatement(ScriptParser.ScriptDeclarationOrStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code featureFlagDeclAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFeatureFlagDeclAlt(ScriptParser.FeatureFlagDeclAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code featureFlagDeclAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFeatureFlagDeclAlt(ScriptParser.FeatureFlagDeclAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code includeDeclAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIncludeDeclAlt(ScriptParser.IncludeDeclAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code includeDeclAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIncludeDeclAlt(ScriptParser.IncludeDeclAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importDeclAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclAlt(ScriptParser.ImportDeclAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importDeclAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclAlt(ScriptParser.ImportDeclAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramDeclAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParamDeclAlt(ScriptParser.ParamDeclAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramDeclAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParamDeclAlt(ScriptParser.ParamDeclAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumDefAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefAlt(ScriptParser.EnumDefAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumDefAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefAlt(ScriptParser.EnumDefAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code processDefAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcessDefAlt(ScriptParser.ProcessDefAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code processDefAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcessDefAlt(ScriptParser.ProcessDefAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code workflowDefAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterWorkflowDefAlt(ScriptParser.WorkflowDefAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code workflowDefAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitWorkflowDefAlt(ScriptParser.WorkflowDefAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outputDefAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOutputDefAlt(ScriptParser.OutputDefAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outputDefAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOutputDefAlt(ScriptParser.OutputDefAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDefAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefAlt(ScriptParser.FunctionDefAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDefAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefAlt(ScriptParser.FunctionDefAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incompleteScriptDeclAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIncompleteScriptDeclAlt(ScriptParser.IncompleteScriptDeclAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incompleteScriptDeclAlt}
	 * labeled alternative in {@link ScriptParser#scriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIncompleteScriptDeclAlt(ScriptParser.IncompleteScriptDeclAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#featureFlagDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFeatureFlagDeclaration(ScriptParser.FeatureFlagDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#featureFlagDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFeatureFlagDeclaration(ScriptParser.FeatureFlagDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#featureFlagName}.
	 * @param ctx the parse tree
	 */
	void enterFeatureFlagName(ScriptParser.FeatureFlagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#featureFlagName}.
	 * @param ctx the parse tree
	 */
	void exitFeatureFlagName(ScriptParser.FeatureFlagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#includeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIncludeDeclaration(ScriptParser.IncludeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#includeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIncludeDeclaration(ScriptParser.IncludeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#includeNames}.
	 * @param ctx the parse tree
	 */
	void enterIncludeNames(ScriptParser.IncludeNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#includeNames}.
	 * @param ctx the parse tree
	 */
	void exitIncludeNames(ScriptParser.IncludeNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#includeName}.
	 * @param ctx the parse tree
	 */
	void enterIncludeName(ScriptParser.IncludeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#includeName}.
	 * @param ctx the parse tree
	 */
	void exitIncludeName(ScriptParser.IncludeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ScriptParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ScriptParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#paramDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParamDeclaration(ScriptParser.ParamDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#paramDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParamDeclaration(ScriptParser.ParamDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#enumDef}.
	 * @param ctx the parse tree
	 */
	void enterEnumDef(ScriptParser.EnumDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#enumDef}.
	 * @param ctx the parse tree
	 */
	void exitEnumDef(ScriptParser.EnumDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(ScriptParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(ScriptParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#processDef}.
	 * @param ctx the parse tree
	 */
	void enterProcessDef(ScriptParser.ProcessDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#processDef}.
	 * @param ctx the parse tree
	 */
	void exitProcessDef(ScriptParser.ProcessDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#processBody}.
	 * @param ctx the parse tree
	 */
	void enterProcessBody(ScriptParser.ProcessBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#processBody}.
	 * @param ctx the parse tree
	 */
	void exitProcessBody(ScriptParser.ProcessBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#processDirectives}.
	 * @param ctx the parse tree
	 */
	void enterProcessDirectives(ScriptParser.ProcessDirectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#processDirectives}.
	 * @param ctx the parse tree
	 */
	void exitProcessDirectives(ScriptParser.ProcessDirectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#processInputs}.
	 * @param ctx the parse tree
	 */
	void enterProcessInputs(ScriptParser.ProcessInputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#processInputs}.
	 * @param ctx the parse tree
	 */
	void exitProcessInputs(ScriptParser.ProcessInputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#processOutputs}.
	 * @param ctx the parse tree
	 */
	void enterProcessOutputs(ScriptParser.ProcessOutputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#processOutputs}.
	 * @param ctx the parse tree
	 */
	void exitProcessOutputs(ScriptParser.ProcessOutputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#processWhen}.
	 * @param ctx the parse tree
	 */
	void enterProcessWhen(ScriptParser.ProcessWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#processWhen}.
	 * @param ctx the parse tree
	 */
	void exitProcessWhen(ScriptParser.ProcessWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#processExec}.
	 * @param ctx the parse tree
	 */
	void enterProcessExec(ScriptParser.ProcessExecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#processExec}.
	 * @param ctx the parse tree
	 */
	void exitProcessExec(ScriptParser.ProcessExecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#processStub}.
	 * @param ctx the parse tree
	 */
	void enterProcessStub(ScriptParser.ProcessStubContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#processStub}.
	 * @param ctx the parse tree
	 */
	void exitProcessStub(ScriptParser.ProcessStubContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#workflowDef}.
	 * @param ctx the parse tree
	 */
	void enterWorkflowDef(ScriptParser.WorkflowDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#workflowDef}.
	 * @param ctx the parse tree
	 */
	void exitWorkflowDef(ScriptParser.WorkflowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#workflowBody}.
	 * @param ctx the parse tree
	 */
	void enterWorkflowBody(ScriptParser.WorkflowBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#workflowBody}.
	 * @param ctx the parse tree
	 */
	void exitWorkflowBody(ScriptParser.WorkflowBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#workflowTakes}.
	 * @param ctx the parse tree
	 */
	void enterWorkflowTakes(ScriptParser.WorkflowTakesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#workflowTakes}.
	 * @param ctx the parse tree
	 */
	void exitWorkflowTakes(ScriptParser.WorkflowTakesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#workflowMain}.
	 * @param ctx the parse tree
	 */
	void enterWorkflowMain(ScriptParser.WorkflowMainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#workflowMain}.
	 * @param ctx the parse tree
	 */
	void exitWorkflowMain(ScriptParser.WorkflowMainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#workflowEmits}.
	 * @param ctx the parse tree
	 */
	void enterWorkflowEmits(ScriptParser.WorkflowEmitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#workflowEmits}.
	 * @param ctx the parse tree
	 */
	void exitWorkflowEmits(ScriptParser.WorkflowEmitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#workflowPublishers}.
	 * @param ctx the parse tree
	 */
	void enterWorkflowPublishers(ScriptParser.WorkflowPublishersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#workflowPublishers}.
	 * @param ctx the parse tree
	 */
	void exitWorkflowPublishers(ScriptParser.WorkflowPublishersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#outputDef}.
	 * @param ctx the parse tree
	 */
	void enterOutputDef(ScriptParser.OutputDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#outputDef}.
	 * @param ctx the parse tree
	 */
	void exitOutputDef(ScriptParser.OutputDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#outputBody}.
	 * @param ctx the parse tree
	 */
	void enterOutputBody(ScriptParser.OutputBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#outputBody}.
	 * @param ctx the parse tree
	 */
	void exitOutputBody(ScriptParser.OutputBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#outputTargetBody}.
	 * @param ctx the parse tree
	 */
	void enterOutputTargetBody(ScriptParser.OutputTargetBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#outputTargetBody}.
	 * @param ctx the parse tree
	 */
	void exitOutputTargetBody(ScriptParser.OutputTargetBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(ScriptParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(ScriptParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#incompleteScriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIncompleteScriptDeclaration(ScriptParser.IncompleteScriptDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#incompleteScriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIncompleteScriptDeclaration(ScriptParser.IncompleteScriptDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmtAlt(ScriptParser.IfElseStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmtAlt(ScriptParser.IfElseStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryCatchStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStmtAlt(ScriptParser.TryCatchStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryCatchStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStmtAlt(ScriptParser.TryCatchStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmtAlt(ScriptParser.ReturnStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmtAlt(ScriptParser.ReturnStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code throwStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStmtAlt(ScriptParser.ThrowStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code throwStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStmtAlt(ScriptParser.ThrowStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assertStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStmtAlt(ScriptParser.AssertStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assertStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStmtAlt(ScriptParser.AssertStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclarationStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStmtAlt(ScriptParser.VariableDeclarationStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclarationStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStmtAlt(ScriptParser.VariableDeclarationStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleAssignmentStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleAssignmentStmtAlt(ScriptParser.MultipleAssignmentStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleAssignmentStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleAssignmentStmtAlt(ScriptParser.MultipleAssignmentStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmtAlt(ScriptParser.AssignmentStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmtAlt(ScriptParser.AssignmentStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmtAlt(ScriptParser.ExpressionStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmtAlt(ScriptParser.ExpressionStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmtAlt(ScriptParser.EmptyStmtAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStmtAlt}
	 * labeled alternative in {@link ScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmtAlt(ScriptParser.EmptyStmtAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(ScriptParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(ScriptParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#statementOrBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementOrBlock(ScriptParser.StatementOrBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#statementOrBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementOrBlock(ScriptParser.StatementOrBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(ScriptParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(ScriptParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(ScriptParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(ScriptParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(ScriptParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(ScriptParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#catchTypes}.
	 * @param ctx the parse tree
	 */
	void enterCatchTypes(ScriptParser.CatchTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#catchTypes}.
	 * @param ctx the parse tree
	 */
	void exitCatchTypes(ScriptParser.CatchTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(ScriptParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(ScriptParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ScriptParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ScriptParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#variableNames}.
	 * @param ctx the parse tree
	 */
	void enterVariableNames(ScriptParser.VariableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#variableNames}.
	 * @param ctx the parse tree
	 */
	void exitVariableNames(ScriptParser.VariableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#multipleAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleAssignmentStatement(ScriptParser.MultipleAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#multipleAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleAssignmentStatement(ScriptParser.MultipleAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(ScriptParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(ScriptParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ScriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ScriptParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryNotExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNotExprAlt(ScriptParser.UnaryNotExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryNotExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNotExprAlt(ScriptParser.UnaryNotExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExprAlt(ScriptParser.ShiftExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExprAlt(ScriptParser.ShiftExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseOrExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOrExprAlt(ScriptParser.BitwiseOrExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseOrExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOrExprAlt(ScriptParser.BitwiseOrExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExprAlt(ScriptParser.MultDivExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExprAlt(ScriptParser.MultDivExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExprAlt(ScriptParser.AddSubExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExprAlt(ScriptParser.AddSubExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exclusiveOrExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExprAlt(ScriptParser.ExclusiveOrExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclusiveOrExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExprAlt(ScriptParser.ExclusiveOrExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRegexExprAlt(ScriptParser.RegexExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRegexExprAlt(ScriptParser.RegexExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExprAlt(ScriptParser.ConditionalExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExprAlt(ScriptParser.ConditionalExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExprAlt(ScriptParser.PowerExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExprAlt(ScriptParser.PowerExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExprAlt(ScriptParser.RelationalExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExprAlt(ScriptParser.RelationalExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExprAlt(ScriptParser.LogicalAndExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExprAlt(ScriptParser.LogicalAndExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseAndExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndExprAlt(ScriptParser.BitwiseAndExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseAndExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndExprAlt(ScriptParser.BitwiseAndExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryAddExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryAddExprAlt(ScriptParser.UnaryAddExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryAddExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryAddExprAlt(ScriptParser.UnaryAddExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incompleteExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncompleteExprAlt(ScriptParser.IncompleteExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incompleteExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncompleteExprAlt(ScriptParser.IncompleteExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalCastExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalCastExprAlt(ScriptParser.RelationalCastExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalCastExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalCastExprAlt(ScriptParser.RelationalCastExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExprAlt(ScriptParser.LogicalOrExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExprAlt(ScriptParser.LogicalOrExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExprAlt(ScriptParser.EqualityExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExprAlt(ScriptParser.EqualityExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pathExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPathExprAlt(ScriptParser.PathExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pathExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPathExprAlt(ScriptParser.PathExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalTypeExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalTypeExprAlt(ScriptParser.RelationalTypeExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalTypeExprAlt}
	 * labeled alternative in {@link ScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalTypeExprAlt(ScriptParser.RelationalTypeExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPrmrAlt(ScriptParser.IdentifierPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPrmrAlt(ScriptParser.IdentifierPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralPrmrAlt(ScriptParser.LiteralPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralPrmrAlt(ScriptParser.LiteralPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterGstringPrmrAlt(ScriptParser.GstringPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitGstringPrmrAlt(ScriptParser.GstringPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNewPrmrAlt(ScriptParser.NewPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNewPrmrAlt(ScriptParser.NewPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParenPrmrAlt(ScriptParser.ParenPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParenPrmrAlt(ScriptParser.ParenPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code closurePrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterClosurePrmrAlt(ScriptParser.ClosurePrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code closurePrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitClosurePrmrAlt(ScriptParser.ClosurePrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterListPrmrAlt(ScriptParser.ListPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitListPrmrAlt(ScriptParser.ListPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterMapPrmrAlt(ScriptParser.MapPrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapPrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitMapPrmrAlt(ScriptParser.MapPrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code builtInTypePrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInTypePrmrAlt(ScriptParser.BuiltInTypePrmrAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code builtInTypePrmrAlt}
	 * labeled alternative in {@link ScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInTypePrmrAlt(ScriptParser.BuiltInTypePrmrAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyPathExprAlt}
	 * labeled alternative in {@link ScriptParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterPropertyPathExprAlt(ScriptParser.PropertyPathExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyPathExprAlt}
	 * labeled alternative in {@link ScriptParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitPropertyPathExprAlt(ScriptParser.PropertyPathExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code closurePathExprAlt}
	 * labeled alternative in {@link ScriptParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterClosurePathExprAlt(ScriptParser.ClosurePathExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code closurePathExprAlt}
	 * labeled alternative in {@link ScriptParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitClosurePathExprAlt(ScriptParser.ClosurePathExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code closureWithLabelsPathExprAlt}
	 * labeled alternative in {@link ScriptParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterClosureWithLabelsPathExprAlt(ScriptParser.ClosureWithLabelsPathExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code closureWithLabelsPathExprAlt}
	 * labeled alternative in {@link ScriptParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitClosureWithLabelsPathExprAlt(ScriptParser.ClosureWithLabelsPathExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentsPathExprAlt}
	 * labeled alternative in {@link ScriptParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsPathExprAlt(ScriptParser.ArgumentsPathExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentsPathExprAlt}
	 * labeled alternative in {@link ScriptParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsPathExprAlt(ScriptParser.ArgumentsPathExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexPathExprAlt}
	 * labeled alternative in {@link ScriptParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterIndexPathExprAlt(ScriptParser.IndexPathExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexPathExprAlt}
	 * labeled alternative in {@link ScriptParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitIndexPathExprAlt(ScriptParser.IndexPathExprAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#namedProperty}.
	 * @param ctx the parse tree
	 */
	void enterNamedProperty(ScriptParser.NamedPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#namedProperty}.
	 * @param ctx the parse tree
	 */
	void exitNamedProperty(ScriptParser.NamedPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#indexPropertyArgs}.
	 * @param ctx the parse tree
	 */
	void enterIndexPropertyArgs(ScriptParser.IndexPropertyArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#indexPropertyArgs}.
	 * @param ctx the parse tree
	 */
	void exitIndexPropertyArgs(ScriptParser.IndexPropertyArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ScriptParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ScriptParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteralAlt}
	 * labeled alternative in {@link ScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteralAlt(ScriptParser.IntegerLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteralAlt}
	 * labeled alternative in {@link ScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteralAlt(ScriptParser.IntegerLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatingPointLiteralAlt}
	 * labeled alternative in {@link ScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteralAlt(ScriptParser.FloatingPointLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatingPointLiteralAlt}
	 * labeled alternative in {@link ScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteralAlt(ScriptParser.FloatingPointLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteralAlt}
	 * labeled alternative in {@link ScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralAlt(ScriptParser.StringLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteralAlt}
	 * labeled alternative in {@link ScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralAlt(ScriptParser.StringLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteralAlt}
	 * labeled alternative in {@link ScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteralAlt(ScriptParser.BooleanLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteralAlt}
	 * labeled alternative in {@link ScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteralAlt(ScriptParser.BooleanLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteralAlt}
	 * labeled alternative in {@link ScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteralAlt(ScriptParser.NullLiteralAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteralAlt}
	 * labeled alternative in {@link ScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteralAlt(ScriptParser.NullLiteralAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ScriptParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ScriptParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#gstring}.
	 * @param ctx the parse tree
	 */
	void enterGstring(ScriptParser.GstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#gstring}.
	 * @param ctx the parse tree
	 */
	void exitGstring(ScriptParser.GstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringDqTextAlt}
	 * labeled alternative in {@link ScriptParser#gstringDqPart}.
	 * @param ctx the parse tree
	 */
	void enterGstringDqTextAlt(ScriptParser.GstringDqTextAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringDqTextAlt}
	 * labeled alternative in {@link ScriptParser#gstringDqPart}.
	 * @param ctx the parse tree
	 */
	void exitGstringDqTextAlt(ScriptParser.GstringDqTextAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringDqPathAlt}
	 * labeled alternative in {@link ScriptParser#gstringDqPart}.
	 * @param ctx the parse tree
	 */
	void enterGstringDqPathAlt(ScriptParser.GstringDqPathAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringDqPathAlt}
	 * labeled alternative in {@link ScriptParser#gstringDqPart}.
	 * @param ctx the parse tree
	 */
	void exitGstringDqPathAlt(ScriptParser.GstringDqPathAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringDqExprAlt}
	 * labeled alternative in {@link ScriptParser#gstringDqPart}.
	 * @param ctx the parse tree
	 */
	void enterGstringDqExprAlt(ScriptParser.GstringDqExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringDqExprAlt}
	 * labeled alternative in {@link ScriptParser#gstringDqPart}.
	 * @param ctx the parse tree
	 */
	void exitGstringDqExprAlt(ScriptParser.GstringDqExprAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringTdqTextAlt}
	 * labeled alternative in {@link ScriptParser#gstringTdqPart}.
	 * @param ctx the parse tree
	 */
	void enterGstringTdqTextAlt(ScriptParser.GstringTdqTextAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringTdqTextAlt}
	 * labeled alternative in {@link ScriptParser#gstringTdqPart}.
	 * @param ctx the parse tree
	 */
	void exitGstringTdqTextAlt(ScriptParser.GstringTdqTextAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringTdqPathAlt}
	 * labeled alternative in {@link ScriptParser#gstringTdqPart}.
	 * @param ctx the parse tree
	 */
	void enterGstringTdqPathAlt(ScriptParser.GstringTdqPathAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringTdqPathAlt}
	 * labeled alternative in {@link ScriptParser#gstringTdqPart}.
	 * @param ctx the parse tree
	 */
	void exitGstringTdqPathAlt(ScriptParser.GstringTdqPathAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringTdqExprAlt}
	 * labeled alternative in {@link ScriptParser#gstringTdqPart}.
	 * @param ctx the parse tree
	 */
	void enterGstringTdqExprAlt(ScriptParser.GstringTdqExprAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringTdqExprAlt}
	 * labeled alternative in {@link ScriptParser#gstringTdqPart}.
	 * @param ctx the parse tree
	 */
	void exitGstringTdqExprAlt(ScriptParser.GstringTdqExprAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(ScriptParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(ScriptParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(ScriptParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(ScriptParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(ScriptParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(ScriptParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#closure}.
	 * @param ctx the parse tree
	 */
	void enterClosure(ScriptParser.ClosureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#closure}.
	 * @param ctx the parse tree
	 */
	void exitClosure(ScriptParser.ClosureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ScriptParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ScriptParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ScriptParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ScriptParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#closureWithLabels}.
	 * @param ctx the parse tree
	 */
	void enterClosureWithLabels(ScriptParser.ClosureWithLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#closureWithLabels}.
	 * @param ctx the parse tree
	 */
	void exitClosureWithLabels(ScriptParser.ClosureWithLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#blockStatementsWithLabels}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementsWithLabels(ScriptParser.BlockStatementsWithLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#blockStatementsWithLabels}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementsWithLabels(ScriptParser.BlockStatementsWithLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#statementOrLabeled}.
	 * @param ctx the parse tree
	 */
	void enterStatementOrLabeled(ScriptParser.StatementOrLabeledContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#statementOrLabeled}.
	 * @param ctx the parse tree
	 */
	void exitStatementOrLabeled(ScriptParser.StatementOrLabeledContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ScriptParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ScriptParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ScriptParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ScriptParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(ScriptParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(ScriptParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#mapEntryList}.
	 * @param ctx the parse tree
	 */
	void enterMapEntryList(ScriptParser.MapEntryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#mapEntryList}.
	 * @param ctx the parse tree
	 */
	void exitMapEntryList(ScriptParser.MapEntryListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void enterMapEntry(ScriptParser.MapEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void exitMapEntry(ScriptParser.MapEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#mapEntryLabel}.
	 * @param ctx the parse tree
	 */
	void enterMapEntryLabel(ScriptParser.MapEntryLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#mapEntryLabel}.
	 * @param ctx the parse tree
	 */
	void exitMapEntryLabel(ScriptParser.MapEntryLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInType(ScriptParser.BuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInType(ScriptParser.BuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ScriptParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ScriptParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ScriptParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ScriptParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#argumentListElement}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListElement(ScriptParser.ArgumentListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#argumentListElement}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListElement(ScriptParser.ArgumentListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#namedArg}.
	 * @param ctx the parse tree
	 */
	void enterNamedArg(ScriptParser.NamedArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#namedArg}.
	 * @param ctx the parse tree
	 */
	void exitNamedArg(ScriptParser.NamedArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ScriptParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ScriptParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#qualifiedClassName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedClassName(ScriptParser.QualifiedClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#qualifiedClassName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedClassName(ScriptParser.QualifiedClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#qualifiedNameElements}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameElements(ScriptParser.QualifiedNameElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#qualifiedNameElements}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameElements(ScriptParser.QualifiedNameElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#qualifiedNameElement}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameElement(ScriptParser.QualifiedNameElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#qualifiedNameElement}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameElement(ScriptParser.QualifiedNameElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(ScriptParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(ScriptParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ScriptParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ScriptParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#legacyType}.
	 * @param ctx the parse tree
	 */
	void enterLegacyType(ScriptParser.LegacyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#legacyType}.
	 * @param ctx the parse tree
	 */
	void exitLegacyType(ScriptParser.LegacyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#keywords}.
	 * @param ctx the parse tree
	 */
	void enterKeywords(ScriptParser.KeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#keywords}.
	 * @param ctx the parse tree
	 */
	void exitKeywords(ScriptParser.KeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#rparen}.
	 * @param ctx the parse tree
	 */
	void enterRparen(ScriptParser.RparenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#rparen}.
	 * @param ctx the parse tree
	 */
	void exitRparen(ScriptParser.RparenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#nls}.
	 * @param ctx the parse tree
	 */
	void enterNls(ScriptParser.NlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#nls}.
	 * @param ctx the parse tree
	 */
	void exitNls(ScriptParser.NlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptParser#sep}.
	 * @param ctx the parse tree
	 */
	void enterSep(ScriptParser.SepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptParser#sep}.
	 * @param ctx the parse tree
	 */
	void exitSep(ScriptParser.SepContext ctx);
}