package jalau.at18.katas.highestlowest.sarai;

import static org.junit.Assert.*;

public class MainTest {
    public void shouldReturnHighestlowestNumbers() {
        String input = "1 2 3 4 5";
        String expected = "numbers 5 1";
        assertEquals(expected, input);
    }
}