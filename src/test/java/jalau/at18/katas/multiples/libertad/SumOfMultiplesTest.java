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
}
