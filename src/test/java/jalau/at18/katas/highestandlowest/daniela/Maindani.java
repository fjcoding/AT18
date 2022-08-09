package jalau.at18.katas.highestlowest.daniela;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldReturnHighestAndLowest() {
        String numbers = "1 2 3 4 5";
        String output = "1 5"
        Main main = new Main();
        assertEquals(output, main.myHl(numbers));
    }
}
