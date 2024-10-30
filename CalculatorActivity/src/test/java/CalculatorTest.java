import org.junit.jupiter.api.Test;
import org.xml.sax.ErrorHandler;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void addTest() {
        Calculator cal = new Calculator();
        int achievedResult = cal.add(5, 5);
        int wantedResult = 10;
        assertEquals(achievedResult, wantedResult);
    }

    @Test
    public void minusTest() {
        Calculator cal = new Calculator();
        int achievedResult = cal.minus(10, 5);
        int wantedResult = 5;
        assertEquals(achievedResult, wantedResult);
    }

    @Test
    public void multiplyTest() {
        Calculator cal = new Calculator();
        int achievedResult = cal.multiply(5, 5);
        int wantedResult = 25;
        assertEquals(achievedResult, wantedResult);
    }

    @Test
    public void divideTest() {
        Calculator cal = new Calculator();
        int achievedResult = cal.divide(25, 5);
        int wantedResult = 5;
        assertEquals(achievedResult, wantedResult);
    }

    @Test
    public void divideByZeroTest() {
        Calculator cal = new Calculator();
        Integer achievedResult = cal.divide(25, 0);
        Integer wantedResult = null;
        assertEquals(achievedResult, wantedResult);
    }

}
