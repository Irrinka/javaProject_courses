
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
        int wordCount = wordArray.length;
        System.out.println("Number of characters (including spaces) = " + wordCount);*/

        StringFunctions stringFunctions = new StringFunctions();
        String replaceWords = stringFunctions.replaceWords();
        System.out.println("Result is: " + replaceWords);
    }
}
