import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        /*SomeFunctions functions = new SomeFunctions();
        String text = functions.getWelcomeText("Valera");
        System.out.println(text);

        // Convert Fahrenheit to Celsius. Celsius = (fahrenheitValue − 32) * 5/9.
        SomeFunctions celsius = new SomeFunctions();
        Float userInput = celsius.getUserFloatInput("Please enter Fahrenheit value: ");
        Float celsiusValue = celsius.getCelsiusFromFahrenheit(userInput);
        System.out.println(userInput + " Fahrenheit is equal " + celsiusValue + " Celsius.");

        //count the number of characters in all entered words (including spaces)
        String userStringInput = functions.getUserStringInput("Please enter words: ");
        String[] wordArray = userStringInput.split("");
       //!!!peredelatj length
        int wordCount = wordArray.length;
        System.out.println("Number of characters (including spaces) = " + wordCount);*/

        /*StringFunctions stringFunctions = new StringFunctions();
        String replaceWords = stringFunctions.replaceWords();
        System.out.println("Result is: " + replaceWords);*/

        /*String text = "Izvairoties no sadursmes ar dzīvnieku, autovadītajs navejoši notriec velosipēdist";
        String [] words = text.split(" ");
        System.out.println(words.length);

        for (int i = 0; i < words.length; i = i + 2){
            System.out.println(words[i]);
        }

        for (String word : words) {
            System.out.println(word);
        }*/

        List<String> names = new ArrayList<>();
        names.add("Valera");
        names.add("Kostik the best");
        names.add("Maxik");
        names.add("Vsjakaja fignja!");

        System.out.println(names.get(1));

        for (String name : names) {
            System.out.println(name);
        }

        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
        bookUniqueWords.put("The", 1);
        bookUniqueWords.put("Student", 1);
        bookUniqueWords.put("is", 1);
        bookUniqueWords.put("The", 2);

        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet()) {
            System.out.println(entry.getKey());
            //System.out.println(entry.getValue());
        }
    }
}
