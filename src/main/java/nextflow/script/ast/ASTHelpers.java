/*
 * Copyright 2013-2024, Seqera Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nextflow.script.ast;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.AnnotatedNode;
import org.codehaus.groovy.ast.AnnotationNode;
import org.codehaus.groovy.ast.expr.ClosureExpression;
import org.codehaus.groovy.ast.expr.ConstantExpression;
import org.codehaus.groovy.ast.expr.Expression;
import org.codehaus.groovy.ast.expr.MapExpression;
import org.codehaus.groovy.ast.expr.MapEntryExpression;
import org.codehaus.groovy.ast.expr.MethodCall;
import org.codehaus.groovy.ast.expr.MethodCallExpression;
import org.codehaus.groovy.ast.expr.NamedArgumentListExpression;
import org.codehaus.groovy.ast.expr.TupleExpression;
import org.codehaus.groovy.ast.expr.VariableExpression;
import org.codehaus.groovy.ast.stmt.BlockStatement;
import org.codehaus.groovy.ast.stmt.ExpressionStatement;
import org.codehaus.groovy.ast.stmt.Statement;

import static org.codehaus.groovy.ast.tools.GeneralUtils.args;
import static org.codehaus.groovy.ast.tools.GeneralUtils.ctorX;

/**
 *
 * @author Ben Sherman <bentshermann@gmail.com>
 */
public class ASTHelpers {

    public static Expression createX(Class type, TupleExpression args) {
        return ctorX(new ClassNode(type), args);
    }

    public static Expression createX(Class type, Expression... expressions) {
        return ctorX(new ClassNode(type), args(expressions));
    }

    public static List<Statement> asBlockStatements(Statement statement) {
        return statement instanceof BlockStatement block
            ? block.getStatements()
            : Collections.emptyList();
    }

    public static ConstantExpression asConstX(Expression expression) {
        return expression instanceof ConstantExpression ce ? ce : null;
    }

    /**
     * Given a statement which represents a block statement of directives,
     * iterate through each directive as a method call expression.
     * 
     * @param statement
     */
    public static Stream<MethodCallExpression> asDirectives(Statement statement) {
        return asBlockStatements(statement)
            .stream()
            .map(stmt -> asMethodCallX(stmt))
            .filter(mce -> mce != null);
    }

    /**
     * Given a method call which represents a definition (i.e. DSL) block, get
     * the definition body, which is the block statement of the last closure argument
     * in the method call.
     * 
     * @param call
     * @param argsCount
     */
    public static BlockStatement asDslBlock(MethodCallExpression call, int argsCount) {
        var args = asMethodCallArguments(call);
        if( args.size() != argsCount )
            return null;
        var lastArg = args.get(args.size() - 1);
        if( !(lastArg instanceof ClosureExpression) )
            return null;
        var closure = (ClosureExpression) lastArg;
        return (BlockStatement) closure.getCode();
    }

    public static MethodCallExpression asMethodCallX(Statement stmt) {
        if( !(stmt instanceof ExpressionStatement) )
            return null;
        var stmtX = (ExpressionStatement) stmt;
        if( !(stmtX.getExpression() instanceof MethodCallExpression) )
            return null;
        return (MethodCallExpression) stmtX.getExpression();
    }

    public static List<Expression> asMethodCallArguments(MethodCall call) {
        return ((TupleExpression) call.getArguments()).getExpressions();
    }

    public static List<MapEntryExpression> asNamedArgs(MethodCall call) {
        var args = asMethodCallArguments(call);
        return args.size() > 0 && args.get(0) instanceof NamedArgumentListExpression nale
            ? nale.getMapEntryExpressions()
            : Collections.emptyList();
    }

    public static VariableExpression asVarX(Statement statement) {
        return statement instanceof ExpressionStatement es ? asVarX(es.getExpression()) : null;
    }

    public static VariableExpression asVarX(Expression expression) {
        return expression instanceof VariableExpression ve ? ve : null;
    }

    /**
     * Given an annotated node (e.g. class, field, method), Find the first
     * annotation of the given type in the node's list of annotations.
     *
     * @param node
     * @param type
     */
    public static Optional<AnnotationNode> findAnnotation(AnnotatedNode node, Class type) {
        return node.getAnnotations().stream()
            .filter(an -> an.getClassNode().getName().equals(type.getName()))
            .findFirst();
    }
}
