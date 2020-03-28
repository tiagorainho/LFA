import java.util.Hashtable;

public class Interpreter extends CalculatorBaseVisitor<Object> {
   public Hashtable<String, String> list = new Hashtable<>();

   @Override
   public Object visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitStatExpr(CalculatorParser.StatExprContext ctx) {
      String expr = (String) visit(ctx.expr());
      if (expr != null) {
         System.out.println(" -> " + expr);
      }
      return expr;
   }

   @Override
   public Object visitStatAssign(CalculatorParser.StatAssignContext ctx) {
      return visit(ctx.assignment());
   }

   @Override
   public Object visitAssignment(CalculatorParser.AssignmentContext ctx) {
      String expr = (String) visit(ctx.expr());
      String var = ctx.VAR().getText();
      String resp = null;
      if (var != null && expr != null) {
         list.put(var, expr);
         resp = String.format("%s -> %s", var, expr);
         System.out.println(resp);
      }
      return expr;
   }

   @Override
   public Object visitExprVar(CalculatorParser.ExprVarContext ctx) {
      return list.get(ctx.VAR().getText());
   }

   @Override
   public Object visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      return String.format("%s %s %s", visit(ctx.expr(0)), visit(ctx.expr(1)), ctx.op.getText());
   }

   @Override
   public Object visitExprMultiDivMod(CalculatorParser.ExprMultiDivModContext ctx) {
      return String.format("%s %s %s", visit(ctx.expr(0)), visit(ctx.expr(1)), ctx.op.getText());
   }

   @Override
   public Object visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override
   public Object visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return ctx.Integer().getText();
   }

   @Override
   public Object visitExprSig(CalculatorParser.ExprSigContext ctx) {
      return String.format("%s !%s", visit(ctx.expr()), ctx.sig.getText());
   }
}
