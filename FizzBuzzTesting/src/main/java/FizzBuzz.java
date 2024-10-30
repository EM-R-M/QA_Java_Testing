import java.util.Scanner;

public class FizzBuzz {

    public String FizzBuzzMethod(int maxValue){
        if (maxValue > 0) {
            String finalString = "";
            for (int x = 1; x <= maxValue; x++) {
                finalString = finalString.concat(FizzBuzzPrintout(x) + ", ");
            }
            return finalString.substring(0, finalString.length()-2);
        } else {
            return "INVALID VALUE. Max value must be greater than 0";
        }
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