package jalau.at18.katas.multiples.rodrigob;

import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplesTest {

    @Test
    public void test10() {
        Multiples multiples = new Multiples();
        assertEquals(23, multiples.sum(10));
    }

    @Test
    public void testNegativeNumber(){
        Multiples multiples = new Multiples();
        assertEquals(0, multiples.sum(-30));
    }

    @Test
    public void test100(){
        Multiples multiples = new Multiples();
        assertEquals(2318, multiples.sum(100));
    }
}