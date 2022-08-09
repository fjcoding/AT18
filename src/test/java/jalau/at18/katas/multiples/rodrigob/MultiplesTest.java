package jalau.at18.katas.multiples.rodrigob;

import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplesTest {

    @Test
    public void test10() {
        Multiples multiples = new Multiples();
        final int expected = 23;
        final int input = 10;
        assertEquals(expected, multiples.sum(input));
    }

    @Test
    public void testNegativeNumber() {
        Multiples multiples = new Multiples();
        final int expected = 0;
        final int input = -30;
        assertEquals(expected, multiples.sum(input));
    }

    @Test
    public void test100() {
        Multiples multiples = new Multiples();
        final int expected = 2318;
        final int input = 100;
        assertEquals(expected, multiples.sum(input));
    }
}