import java.util.Scanner;
import java.util.Stack;

public class ex02 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        boolean run = true;
        double value = 0;
        String str = "";
        while(run) {
            System.out.printf("Operation: ");
            str = input.nextLine();
            try{
                value = getResult(str);
                System.out.println("Response: " + value);
            }
            catch(IllegalArgumentException e) {
                System.out.println("Operacao nao reconhecida: " + e.getLocalizedMessage());
            }
            System.out.println();
        }
        input.close();
    }

    public static double getResult(String str) {
        Stack<Double> stack = new Stack<Double>();
        String parts[] = str.split(" ");
        double op1 = 0;
        double op2 = 0;
        for(int i = 0; i < parts.length; i++) {
            if(isNumeric(parts[i])){
                stack.push(Double.parseDouble(parts[i]));
            }
            else{
                try{
                    op1 = stack.pop();
                    op2 = stack.pop();
                }
                catch(Exception e) {
                    throw new IllegalArgumentException("Relacao entre numeros e operadores nao aceite");
                }
                stack.push(getValue(op1, parts[i], op2));
            }
        }
        return stack.pop();
    }

    public static double getValue(double op1, String operation, double op2) {
        switch(operation){
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "=":
                return op2;
            default:
                throw new IllegalArgumentException("Operador \"" + operation + "\" nao reconhecido");
        }
    }

    public static boolean isNumeric(String str) {
        try{
            Double.parseDouble(str);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

}