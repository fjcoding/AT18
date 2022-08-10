package jalau.at18.katas.highestlowest.daniela;

import static org.junit.Assert.*;
import org.junit.Test;

public class HighestlowestTest {
    @Test
    public void testPositiveNumber() {
        Main main = new Main();
        String input = main.myHl("1 2 3 4 5");
        String output = "5 1";
        assertEquals(output, input);
        String input1 = main.myHl("1 2 -3 4 5");
        String output1 = "5 -3";
        assertEquals(output1, input1);
    }
}