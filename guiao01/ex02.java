import java.util.Scanner;
import java.util.Stack;

public class ex02 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        boolean run = true;
        double value = 0;
        String str = "";
        while(run) {
            str = input.nextLine();
            value = getResult(str);
            System.out.println(value);
            
        }
        input.close();
    }

    public static double getResult(String str) {
        Stack<Double> stack = new Stack<Double>();
        String parts[] = str.split(" ");
        double op1;
        double op2;
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
                    throw new IllegalArgumentException("Erro");
                }
                return getValue(op1, parts[i], op2);
            }
        }

        return 1;
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
                throw new IllegalArgumentException("Operacao nao reconhecida");
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