package jalau.at18.katas.highestlowest.carlos;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldReturnHighestAndLowestNumbers() {
        String input = "1 2 3 4 5";
        String expected = "5 1";

        Main main = new Main();
        assertEquals(expected, main.highestLowest(input));
    }
}

