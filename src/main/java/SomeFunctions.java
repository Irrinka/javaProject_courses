import java.util.Scanner;

public class SomeFunctions {
    public String getWelcomeText(String name) {
        return "Hello, " + name + "!";
    }

    public Float getUserFloatInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextFloat();
    }

    public Float getCelsiusFromFahrenheit(Float fahrenheitValue) {
        return (fahrenheitValue - 32) * 5 / 9;
    }

    public String getUserStringInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextLine();
    }

}
