import java.util.LinkedList;
import java.util.List;

public class Interpreter extends QuestionGeneratorBaseVisitor<Object> {

   List<Question> questions = new LinkedList<Question>();
   Question question;

   @Override
   public Object visitProgram(QuestionGeneratorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitStatComment(QuestionGeneratorParser.StatCommentContext ctx) {
      return null;
   }

   @Override
   public Object visitStatQuestion(QuestionGeneratorParser.StatQuestionContext ctx) {
      String question = (String) visit(ctx.questionBlock());
      if (question != null) {
         System.out.println(question);
      } else {
         System.out.println("Erro");
      }
      return question;
   }

   @Override
   public Object visitQuestionBlock(QuestionGeneratorParser.QuestionBlockContext ctx) {
      question = (Question) visit(ctx.header());
      if (question != null) {
         question = (Question) visit(ctx.body());
         if (question != null) {
            System.out.println("done !!!");
         }
      }
      return null;
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
      List<String> answear = (List) ctx.answear();
      switch (answear.get(1)) {
         case "0":
            question.addWrongAnswear(answear.get(0));
            break;
         case "100":
            question.addWriteAnswear(answear.get(0));
            break;
      }
      return question;
   }

   @Override
   public Object visitQuestion(QuestionGeneratorParser.QuestionContext ctx) {
      return ctx.String();
   }

   @Override
   public Object visitAnswear(QuestionGeneratorParser.AnswearContext ctx) {
      String answear = ctx.String().getText();
      String value = ctx.Integer().getText();
      List<String> resp = new LinkedList<String>();
      resp.add(answear);
      resp.add(value);
      return resp;
   }
}

class Question {
   private String answear;
   private String header;
   private List<String> wrongAnswears;
   private List<String> writeAnswears;

   public Question(String header, String answear) {
      this.header = header;
      this.answear = answear;
      this.wrongAnswears = new LinkedList<String>();
      this.writeAnswears = new LinkedList<String>();
   }

   public void addWriteAnswear(String answear) {
      this.writeAnswears.add(answear);
   }

   public void addWrongAnswear(String answear) {
      this.wrongAnswears.add(answear);
   }

   public List<String> getAnswears(int quantity) {
      List<String> answears = null;
      if (quantity >= 2) {
         answears = getWrongAnswear(quantity - 1);
         answears = addWriteAnswear(answears);
      }
      return answears;
   }

   private List<String> addWriteAnswear(List<String> answears) {
      answears.add(getRandomIndex(answears), getOneWriteAnswear());
      return answears;
   }

   public List<String> getWrongAnswear(int quantity) {
      List<String> aux = new LinkedList<String>();
      List<String> resp = new LinkedList<String>();
      int index;
      for (String values : this.wrongAnswears) {
         aux.add(values);
      }
      for (int i = 0; i < quantity; i++) {
         index = getRandomIndex(aux);
         resp.add(aux.get(index));
         aux.remove(index);
      }
      return resp;
   }

   public String getOneWriteAnswear() {
      return this.writeAnswears.get(getRandomIndex(this.writeAnswears));
   }

   private int getRandomIndex(List<String> list) {
      return (int) (Math.random() * list.size() + 1);
   }

}