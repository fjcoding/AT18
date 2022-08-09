package jalau.at18.katas.multiples.adriana;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void functionShouldGiveHighest() {
        Main main = new Main();
        Integer input1 = 10;
        Integer expected1 = 23;
        assertEquals(expected1, main.getSumMult(input1));
        Integer input2 = 20;
        Integer expected2 = 78;
        assertEquals(expected2, main.getSumMult(input2));
        Integer input3 = -5;
        Integer expected3 = 0;
        assertEquals(expected3, main.getSumMult(input3));
    }
}
