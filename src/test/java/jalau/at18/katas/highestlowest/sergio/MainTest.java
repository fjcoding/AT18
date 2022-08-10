package jalau.at18.katas.highestlowest.sergio;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainCalculateHighestLowest() {
        String[] input = new String[] {"1", "2", "3", "10"};
        Main main = new Main();
        assertEquals("10 1", main.highestLowest(input));
    }

}
