// Generated from Calculator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatExpr(CalculatorParser.StatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssign(CalculatorParser.StatAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVar(CalculatorParser.ExprVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(CalculatorParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultiDivMod}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultiDivMod(CalculatorParser.ExprMultiDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(CalculatorParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(CalculatorParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSig}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSig(CalculatorParser.ExprSigContext ctx);
}