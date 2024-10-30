import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void perfectCaseTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String givenResult = fizzBuzz.FizzBuzzMethod(15);
        String wantedResult = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz";
        assertEquals(givenResult, wantedResult);
    }

    @Test
    public void negativeNumberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String givenResult = fizzBuzz.FizzBuzzMethod(-5);
        String wantedResult = "INVALID VALUE. Max value must be greater than 0";
        assertEquals(givenResult, wantedResult);
    }

}
