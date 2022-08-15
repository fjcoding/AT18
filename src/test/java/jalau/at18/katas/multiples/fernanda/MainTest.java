package jalau.at18.katas.multiples.fernanda;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void shouldReturnHighestLowest() {
        String input = "10";
        String expected = "23";

        Main main = new Main();
        assertEquals(expected, main.sumMultiples(input));
    }
}