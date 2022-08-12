package jalau.at18.katas.multiples.rodrigov;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void shouldReturnSumOfTheMultiples() {
        final int input = 10;
        final int expectedResult = 23;
        Main main = new Main();
        assertEquals(expectedResult, main.multiplesThreeAndFive(input));
    }
}
