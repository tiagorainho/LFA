import java.util.Hashtable;

public class Interpreter extends CalculatorBaseVisitor<Object> {
   public Hashtable<String, Double> list = new Hashtable<>();

   @Override
   public Object visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitStatExpr(CalculatorParser.StatExprContext ctx) {
      Double value = (Double) visit(ctx.expr());
      System.out.println(" -> " + value);
      return value;
   }

   @Override
   public Object visitStatAssign(CalculatorParser.StatAssignContext ctx) {
      return visit(ctx.assignment());
   }

   @Override
   public Object visitAssignment(CalculatorParser.AssignmentContext ctx) {
      String var = ctx.VAR().getText();
      Double value = (Double) visit(ctx.expr());

      if (var != null && value != null) {
         list.put(var, value);
      }
      return value;
   }

   @Override
   public Object visitExprVar(CalculatorParser.ExprVarContext ctx) {
      return list.get(ctx.VAR().getText());
   }

   @Override
   public Object visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Double value1 = (Double) visit(ctx.expr(0));
      Double value2 = (Double) visit(ctx.expr(1));
      Double resp = null;
      if (value1 != null && value2 != null) {
         switch (ctx.op.getText()) {
            case "+":
               resp = value1 + value2;
               break;
            case "-":
               resp = value1 - value2;
               break;
         }
      }
      return resp;
   }

   @Override
   public Object visitExprMultiDivMod(CalculatorParser.ExprMultiDivModContext ctx) {
      Double value1 = (Double) visit(ctx.expr(0));
      Double value2 = (Double) visit(ctx.expr(1));
      Double resp = null;
      if (value1 != null && value2 != null) {
         switch (ctx.op.getText()) {
            case "*":
               resp = value1 * value2;
               break;
            case "/":
               resp = value1 / value2;
               break;
            case "%":
               resp = value1 % value2;
               break;
         }
      }
      return resp;
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
   public Object visitExprSig(CalculatorParser.ExprSigContext ctx) {
      Double value = (Double) visit(ctx.expr());
      if (ctx.sig.getText().equals("-")) {
         value = -value;
      }
      return value;
   }
}
