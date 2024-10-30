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

}
