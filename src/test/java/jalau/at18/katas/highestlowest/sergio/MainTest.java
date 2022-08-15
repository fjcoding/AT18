package jalau.at18.katas.highestlowest.sergio;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldShowsHihghestAndLowest() {
        Main main = new Main();
        String[] input = {"5", "6", "32", "2", "1", "0", "20", "3"};
        String expected = "32 0";
        assertEquals(expected, main.highestLowest(input));
    }
}
