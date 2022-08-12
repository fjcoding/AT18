package jalau.at18.katas.highestandlowest.daniela;

import static org.junit.Assert.*;
import org.junit.Test;

import jalau.at18.katas.highestlowest.daniela.Main;

public class HighestlowestTest {
    @Test
    public void testPositiveNumber() {
        Main main = new Main();
        String input = Main.myHl("1 2 3 4 5");
        String output = "5 1";
        assertEquals(output, input);
        String input1 = Main.myHl("1 2 -3 4 5");
        String output1 = "5 -3";
        assertEquals(output1, input1);
    }
}