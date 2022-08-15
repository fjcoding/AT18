package jalau.at18.katas.multiples.sergio;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldShowMultiplesSum() {
        int input = 10;
        int expected = 23;
        assertEquals(expected, Main.multiples(input));
    }
}
