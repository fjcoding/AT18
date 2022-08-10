package jalau.at18.katas.multiples.daniela;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void functionShouldGiveHighest() {
        Main main = new Main();
        final Integer input = 10;
        final Integer sumatory = 23;
        assertEquals(sumatory, main.getSumMult(input));
    }
}