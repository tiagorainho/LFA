public class Interpreter extends CalculatorBaseVisitor<Object> {

   @Override
   public Object visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitStat(CalculatorParser.StatContext ctx) {
      Double value = (Double) visit(ctx.expr());
      if (value != null) {
         System.out.println(" -> " + value);
      } else {
         System.out.println("Erro");
      }
      return value;
   }

   @Override
   public Object visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Double value1 = (Double) visit(ctx.expr(0));
      Double value2 = (Double) visit(ctx.expr(1));
      Double res = null;

      if (value1 != null && value2 != null) {
         switch (ctx.op.getText()) {
            case "+":
               res = value1 + value2;
               break;

            case "-":
               res = value1 - value2;
               break;
         }
      }
      return res;
   }

   @Override
   public Object visitExprIntegerMinus(CalculatorParser.ExprIntegerMinusContext ctx) {
      return -Double.parseDouble(ctx.Integer().getText());
   }

   @Override
   public Object visitExprMultiDivMod(CalculatorParser.ExprMultiDivModContext ctx) {
      Double value1 = (Double) visit(ctx.expr(0));
      Double value2 = (Double) visit(ctx.expr(1));
      Double res = null;

      if (value1 != null && value2 != null) {
         switch (ctx.op.getText()) {
            case "*":
               res = value1 * value2;
               break;

            case "/":
               res = value1 / value2;
               break;

            case "%":
               res = value1 % value2;
               break;
         }
      }
      return res;
   }

   @Override
   public Object visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override
   public Object visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Double.parseDouble(ctx.Integer().getText());
   }

   @Override
   public Object visitExprIntegerPlus(CalculatorParser.ExprIntegerPlusContext ctx) {
      return Double.parseDouble(ctx.Integer().getText());
   }
}
