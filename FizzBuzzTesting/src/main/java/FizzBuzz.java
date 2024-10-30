import java.util.Scanner;

public class FizzBuzz {

    public String FizzBuzzMethod(int maxValue){
        String finalString = "";
        for (int x = 1; x <= maxValue; x++) {
            finalString = finalString.concat(FizzBuzzPrintout(x) + ", ");
        }
        return finalString.substring(0, finalString.length()-2);
    }

    // Function to print the correct data depending on
    private static String FizzBuzzPrintout(int currentValue) {
        // Depending on the value type, return the correct value to print
        if (currentValue % 3 == 0 && currentValue % 5 == 0) {
            return "FizzBuzz";
        } else if (currentValue % 3 == 0) {
            return "Fizz";
        } else if (currentValue % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(currentValue);
        }
    }

}