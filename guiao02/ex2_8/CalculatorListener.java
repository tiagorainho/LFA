// Generated from Calculator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatExpr(CalculatorParser.StatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatExpr(CalculatorParser.StatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssign(CalculatorParser.StatAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssign(CalculatorParser.StatAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatPrint(CalculatorParser.StatPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatPrint(CalculatorParser.StatPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalculatorParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalculatorParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(CalculatorParser.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(CalculatorParser.ExprVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(CalculatorParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(CalculatorParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPowers}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPowers(CalculatorParser.ExprPowersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPowers}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPowers(CalculatorParser.ExprPowersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultiDivMod}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultiDivMod(CalculatorParser.ExprMultiDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultiDivMod}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultiDivMod(CalculatorParser.ExprMultiDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(CalculatorParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(CalculatorParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(CalculatorParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(CalculatorParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSig}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSig(CalculatorParser.ExprSigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSig}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSig(CalculatorParser.ExprSigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(CalculatorParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(CalculatorParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(CalculatorParser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(CalculatorParser.ExprFractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#frac}.
	 * @param ctx the parse tree
	 */
	void enterFrac(CalculatorParser.FracContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#frac}.
	 * @param ctx the parse tree
	 */
	void exitFrac(CalculatorParser.FracContext ctx);
}