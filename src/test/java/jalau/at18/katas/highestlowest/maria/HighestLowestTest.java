package jalau.at18.katas.highestlowest.maria;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestLowestTest {
    @Test
    public void highestLowest() {
        assertEquals("9 -5", HighestLowest.highestLowest("1 9 3 4 -5"));
    }
    @Test
    public void highestLowestOneValue() {
        assertEquals("1 1", HighestLowest.highestLowest("1"));
    }

}
