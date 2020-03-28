import java.util.*;
import java.io.*;
import java.nio.file.*;

public class ex05 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        boolean run = true;
        String aux;
        String var;
        LinkedList<Integer> operators;
        Map<String, Integer> variables = new HashMap<String, Integer>();
        while(run) {
            String line = input.nextLine();
            Scanner sc = new Scanner(line);
            operators = new LinkedList<Integer>();
            while(sc.hasNext()) {
                if(sc.hasNextDouble()) {
                    operators.add(Integer.parseInt(String.valueOf(sc.nextDouble())));
                }
                else{
                    aux = sc.next();
                    if(aux.equalsIgnoreCase("=")) {
                        addVariable();
                    }
                }
                
            }
            sc.close();
        }
        
        input.close();
    }

    public static void addVariable(String var, Integer value, Map<String, Integer> variables) {
        variables.put(var.toLowerCase().replace(" ", ""), value);
    }

    public static int getVariableValue(String var, Map<String, Integer> variables) {
        if(variables.containsKey(var)) {
            return variables.get(var.toLowerCase().replace(" ", ""));
        }
        return 0;
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