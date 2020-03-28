import java.util.HashMap;

public class Interpreter extends CalculatorBaseVisitor<Object> {

   HashMap<String, Fraction> variables = new HashMap<String, Fraction>();

   @Override
   public Object visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitStatExpr(CalculatorParser.StatExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitStatAssign(CalculatorParser.StatAssignContext ctx) {
      return visit(ctx.assignment());
   }

   @Override
   public Object visitStatPrint(CalculatorParser.StatPrintContext ctx) {
      return visit(ctx.print());
   }

   @Override
   public Object visitPrint(CalculatorParser.PrintContext ctx) {
      Fraction resp = (Fraction) visit(ctx.expr());
      if (resp != null) {
         System.out.println(" -> " + resp.toString());
      }
      return resp;
   }

   @Override
   public Object visitAssignment(CalculatorParser.AssignmentContext ctx) {
      String var = ctx.VAR().getText();
      Fraction frac = (Fraction) visit(ctx.expr());
      if (var != null && frac != null) {
         variables.put(var, frac);
      }
      return frac;
   }

   @Override
   public Object visitExprVar(CalculatorParser.ExprVarContext ctx) {
      return variables.get(ctx.VAR().getText());
   }

   @Override
   public Object visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Fraction f1 = (Fraction) visit(ctx.expr(0));
      Fraction f2 = (Fraction) visit(ctx.expr(1));
      String op = ctx.op.getText();
      if (f1 != null && f2 != null && op != null) {
         switch (op) {
            case "+":
               return f1.add(f2);
            case "-":
               return f1.sub(f2);
         }
      }
      return null;
   }

   @Override
   public Object visitExprPowers(CalculatorParser.ExprPowersContext ctx) {
      Fraction base = (Fraction) visit(ctx.base);
      Fraction power = (Fraction) visit(ctx.power);
      if (base != null && power != null && power.getDen() == 1) {
         return base.pow(power.getNum());
      }
      return null;
   }

   @Override
   public Object visitExprMultiDivMod(CalculatorParser.ExprMultiDivModContext ctx) {
      Fraction f1 = (Fraction) visit(ctx.expr(0));
      Fraction f2 = (Fraction) visit(ctx.expr(1));
      String op = ctx.op.getText();
      if (f1 != null && f2 != null && op != null) {
         switch (op) {
            case "*":
               return f1.mult(f2);
            case ":":
               return f1.div(f2);
         }
      }
      return null;
   }

   @Override
   public Object visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override
   public Object visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Fraction f = new Fraction(Integer.parseInt(ctx.Value().getText()), 1);
      return new Fraction(Integer.parseInt(ctx.Value().getText()), 1);
   }

   @Override
   public Object visitExprSig(CalculatorParser.ExprSigContext ctx) {
      Fraction f = (Fraction) visit(ctx.expr());
      String op = ctx.sig.getText();
      if (op != null) {
         switch (op) {
            case "-":
               f = new Fraction(-f.getNum(), f.getDen());
               break;
         }
      }
      return f;
   }

   @Override
   public Object visitExprReduce(CalculatorParser.ExprReduceContext ctx) {
      Fraction f = (Fraction) visit(ctx.expr());
      if (f != null) {
         return Fraction.reduce(f);
      }
      return null;
   }

   @Override
   public Object visitExprFraction(CalculatorParser.ExprFractionContext ctx) {
      return visit(ctx.frac());
   }

   @Override
   public Object visitFrac(CalculatorParser.FracContext ctx) {
      Fraction f1 = new Fraction(Integer.parseInt(ctx.value1.getText()), 1);
      Fraction f2 = new Fraction(Integer.parseInt(ctx.value2.getText()), 1);
      if (f1 != null && f2 != null) {
         return f1.div(f2);
      }
      return null;
   }
}

class Fraction {
   private int num;
   private int den;

   public Fraction(int num, int den) {
      this.num = num;
      this.den = den;
   }

   public int getNum() {
      return this.num;
   }

   public int getDen() {
      return this.den;
   }

   public Fraction add(Fraction f) {
      return new Fraction(this.den * f.num + this.num * f.den, this.den * f.den);
   }

   public Fraction sub(Fraction f) {
      return new Fraction(this.num * f.den - this.den * f.num, this.den * f.den);
   }

   public Fraction mult(Fraction f) {
      return new Fraction(this.num * f.num, this.den * f.den);
   }

   public Fraction div(Fraction f) {
      return new Fraction(this.num * f.den, this.den * f.num);
   }

   public Fraction pow(int exp) {
      return new Fraction((int) Math.pow(this.num, exp), (int) Math.pow(this.den, exp));
   }

   public static Fraction reduce(Fraction f) {
      int temp = gcm(f.num, f.den);
      return new Fraction(f.num / Math.abs(temp), f.den / Math.abs(temp));
   }

   public static int gcm(int a, int b) {
      return b == 0 ? a : gcm(b, a % b);
   }

   public String toString() {
      if (this.den == 1) {
         return String.format("%d", num);
      }
      return String.format("%d/%d", num, den);
   }
}