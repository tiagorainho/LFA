public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      System.out.println("fafa");
      return visitChildren(ctx);
   }
}
