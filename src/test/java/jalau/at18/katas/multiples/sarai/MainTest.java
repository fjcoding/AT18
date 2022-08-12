package jalau.at18.katas.multiples.sarai;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void shouldReturnMultiples() {
        Main  main = new Main();
        int input = 10;
        int inputZero=0;
        assertEquals("the sum of the numbers is: 23", main.enterNumbers(input));
        assertEquals("the sum of the numbers is: 0 ", main.enterNumbers(inputZero));
    }
}
