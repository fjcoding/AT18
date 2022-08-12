package jalau.at18.katas.highestlowest.rene;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldreturnHighestAndLowest() {
        Main main = new Main();
        String input = "1 2 4 22 -1 0 2"; 
        String expectedResult = "22 -1";
        assertEquals(expectedResult, main.func(input));
    }
}
