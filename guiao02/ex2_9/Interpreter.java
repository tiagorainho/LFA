import java.util.LinkedList;
import java.util.List;

public class Interpreter extends QuestionGeneratorBaseVisitor<Object> {
   public List<Question> questions = new LinkedList<Question>();
   public Question question;

   @Override
   public Object visitProgram(QuestionGeneratorParser.ProgramContext ctx) {
      ctx.stat().stream().forEach(s -> {
         if (s != null) {
            questions.add((Question) visit(s));
         }
      });
      return null;
   }

   @Override
   public Object visitStat(QuestionGeneratorParser.StatContext ctx) {
      return visit(ctx.questionBlock());
   }

   @Override
   public Object visitQuestionBlock(QuestionGeneratorParser.QuestionBlockContext ctx) {
      question = (Question) visit(ctx.header());
      if (question != null) {
         visit(ctx.body());
      }
      return question;
   }

   @Override
   public Object visitHeader(QuestionGeneratorParser.HeaderContext ctx) {
      String questionName = ctx.questionName.getText();
      String questionStat = (String) visit(ctx.questionStat());
      if (questionName != null && questionStat != null) {
         return new Question(questionName, questionStat);
      }
      return null;
   }

   @Override
   public Object visitQuestionStat(QuestionGeneratorParser.QuestionStatContext ctx) {
      return visit(ctx.question());
   }

   @Override
   public Object visitBody(QuestionGeneratorParser.BodyContext ctx) {
      List<String> list = new LinkedList<String>();
      for (int i = 0; i < ctx.answear().size(); i++) {
         list.add((String) visit(ctx.answear(i)));
      }
      return list;
   }

   @Override
   public Object visitQuestion(QuestionGeneratorParser.QuestionContext ctx) {
      return ctx.String().getText();
   }

   @Override
   public Object visitAnswear(QuestionGeneratorParser.AnswearContext ctx) {
      String answear = ctx.String().getText();
      String value = ctx.Integer().getText();
      switch (value) {
         case "0":
            this.question.addWrongAnswear(answear);
            break;
         case "100":
            this.question.addWriteAnswear(answear);
            break;
      }
      return answear;
   }
}
