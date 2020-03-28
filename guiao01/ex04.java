import java.util.*;
import java.io.*;
import java.nio.file.*;

public class ex04 {

    public static void main(String args[]) throws IOException {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        System.out.println(getValue(line));

    }

    public static int getValue(String line) throws IOException {
        Map<String, Integer> numbers = getNumbers("numbers.txt");
        

        String[] parts = line.split(" ");

        int value = 0;
        int currentValue;
        int nextValue;
        boolean stacked = false;
        for(int i = 0; i < parts.length; i++) {
            if(numbers.containsKey(parts[i].toLowerCase().replace(" ", ""))) {
                currentValue = numbers.get(parts[i].toLowerCase().replace(" ", ""));
                try{
                    if(numbers.containsKey(parts[i + 1].toLowerCase().replace(" ", ""))) {
                        nextValue = numbers.get(parts[i + 1].toLowerCase().replace(" ", ""));
                        if(stacked){
                            
                        }
                        if(currentValue < nextValue) {


                        }
                        else {

                        }
                    }
                    

                }
                catch(Exception e) {

                }
                
               
                
            }

        }

        return value;
    }

    public static Map<String, Integer> getNumbers(String fileName) throws IOException {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Files.readAllLines(Paths.get(new File(fileName).getAbsolutePath())).stream().forEach(x -> {
            String parts[] = x.split("-");
            map.put(parts[1].toLowerCase().replace(" ", ""), Integer.parseInt(parts[0].replace(" ", "")));
        });
        return map;
    }
}