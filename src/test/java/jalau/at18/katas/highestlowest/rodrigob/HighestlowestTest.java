package jalau.at18.katas.highestlowest.rodrigob;

import static org.junit.Assert.*;
import org.junit.Test;

public class HighestlowestTest {

    @Test
    public void testPositiveNumbers() {
        Highestlowest highestlowest = new Highestlowest();
        assertEquals("56 5", highestlowest.result("20 40 5 8 7 6 56"));
    }

    @Test
    public void testNegativeNumbers() {
        Highestlowest highestlowest = new Highestlowest();
        assertEquals("40 -8", highestlowest.result("20 40 5 -8 7 6 10"));
    }

    @Test
    public void testEqualNumbers() {
        Highestlowest highestlowest = new Highestlowest();
        assertEquals("20 -6", highestlowest.result("20 7 5 8 7 -6 10"));
    }
}