package jalau.at18.katas.multiples.libertad;
import static org.junit.Assert.*;
import org.junit.Test;

public class SumOfMultiplesTest {
    @Test
    public void returnSumOfMultiplesNumbers() {
        Main main = new Main();
        int input = 10;
        int expected = 23;
        assertEquals(expected,main.sumOfNumbers(input));
    }
    @Test
    public void returnSumOfMultiplesNumbersInput3() {
        Main main = new Main();
        int input = 3;
        int expected = 0;  //por que no hay ningun numero < 3
        assertEquals(expected,main.sumOfNumbers(input));
    }
    @Test
    public void returnSumOfMultiplesNumbersInput5() {
        Main main = new Main();
        int input = 5;
        int expected = 3;
        assertEquals(expected,main.sumOfNumbers(input));
    }
    @Test
    public void returnSumOfMultiplesNumbersInput15() {
        Main main = new Main();
        int input = 15;
        int expected = 45;
        assertEquals(expected,main.sumOfNumbers(input));
    }
}
