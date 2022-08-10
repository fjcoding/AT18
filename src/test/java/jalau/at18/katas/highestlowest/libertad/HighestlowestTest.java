package jalau.at18.katas.highestlowest.libertad;

import static org.junit.Assert.*;
import org.junit.Test;

public class HighestlowestTest {

    @Test
    public void returnTheHighestAndLowestNumbers() {
        Main main = new Main();
        String input = "1 2 3 4 5";
        String expected = "5 1";
        assertEquals(expected,main.highLowNumbers(input));
    }
}