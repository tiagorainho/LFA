// Generated from QuestionGenerator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuestionGeneratorParser}.
 */
public interface QuestionGeneratorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuestionGeneratorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QuestionGeneratorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionGeneratorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QuestionGeneratorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionGeneratorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(QuestionGeneratorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionGeneratorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(QuestionGeneratorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionGeneratorParser#questionBlock}.
	 * @param ctx the parse tree
	 */
	void enterQuestionBlock(QuestionGeneratorParser.QuestionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionGeneratorParser#questionBlock}.
	 * @param ctx the parse tree
	 */
	void exitQuestionBlock(QuestionGeneratorParser.QuestionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionGeneratorParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(QuestionGeneratorParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionGeneratorParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(QuestionGeneratorParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionGeneratorParser#questionStat}.
	 * @param ctx the parse tree
	 */
	void enterQuestionStat(QuestionGeneratorParser.QuestionStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionGeneratorParser#questionStat}.
	 * @param ctx the parse tree
	 */
	void exitQuestionStat(QuestionGeneratorParser.QuestionStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionGeneratorParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(QuestionGeneratorParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionGeneratorParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(QuestionGeneratorParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionGeneratorParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(QuestionGeneratorParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionGeneratorParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(QuestionGeneratorParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionGeneratorParser#answear}.
	 * @param ctx the parse tree
	 */
	void enterAnswear(QuestionGeneratorParser.AnswearContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionGeneratorParser#answear}.
	 * @param ctx the parse tree
	 */
	void exitAnswear(QuestionGeneratorParser.AnswearContext ctx);
}