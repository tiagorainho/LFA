// Generated from QuestionGenerator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuestionGeneratorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuestionGeneratorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuestionGeneratorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QuestionGeneratorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionGeneratorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(QuestionGeneratorParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionGeneratorParser#questionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionBlock(QuestionGeneratorParser.QuestionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionGeneratorParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(QuestionGeneratorParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionGeneratorParser#questionStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionStat(QuestionGeneratorParser.QuestionStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionGeneratorParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(QuestionGeneratorParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionGeneratorParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(QuestionGeneratorParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionGeneratorParser#answear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswear(QuestionGeneratorParser.AnswearContext ctx);
}