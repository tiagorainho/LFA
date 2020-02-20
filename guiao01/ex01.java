import java.util.*;

public class ex01 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        double value = 0;
        boolean run = true;
        while(run) {
            System.out.printf("-> ");
            String str = input.nextLine();
            try{
                value = getResult(str, value);
                System.out.println(String.valueOf(value));
            }
            catch(Exception e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        input.close();
    }

    public static double getResult(String str, double prevValue) {
        String[] parts = str.split(" ");
        double op1 = 0;
        double op2 = 0;

        if(parts.length >= 3){
            try{
                op1 = Double.parseDouble(parts[0]);
                op2 = Double.parseDouble(parts[2]);
            }
            catch(Exception e) {
                throw new IllegalArgumentException("Operando nao reconhecido");
            }

            try{
                return getValue(op1, parts[1], op2);
            }
            catch(Exception e) {
                throw new IllegalArgumentException(e.getLocalizedMessage());
            }
        }
        else if(parts.length == 2){
            try{
                op1 = Double.parseDouble(parts[1]);
            }
            catch(Exception e) {
                throw new IllegalArgumentException("Operando nao reconhecido");
            }

            try{
                return getValue(prevValue, parts[0], op1);
            }
            catch(Exception e) {
                throw new IllegalArgumentException(e.getLocalizedMessage());
            }
        }

        throw new IllegalArgumentException("Sem elementos suficientes");
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

}