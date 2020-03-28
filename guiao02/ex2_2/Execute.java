public class Execute extends SuffixCalculatorBaseVisitor<Double> {

   @Override
   public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      Double value = visit(ctx.expr());
      System.out.println(" -> " + value);
      return value;
   }

   @Override
   public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.Number().getText());
   }

   @Override
   public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Double value1 = visit(ctx.expr(0));
      Double value2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      Double resp = 0.0;
      switch (op) {
         case "*":
            resp = value1 * value2;
            break;
         case "/":
            resp = value1 / value2;
            break;
         case "+":
            resp = value1 + value2;
            break;
         case "-":
            resp = value1 - value2;
            break;
         default:
            resp = 0.0;
      }
      return resp;
   }
}
