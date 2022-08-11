package jalau.at18.katas.highestlowest.alvaro;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldConvertFromStringToNumbers() {
        String input = ("1 2 3 4 5");
        int[] expected = {1, 2, 3, 4, 5};
        Main main = new Main();
        assertArrayEquals(expected, main.split(input));
    }
    @Test
    public void mainShouldReturnTheLowerNumber() {
        int[] input = {1, 2, 3, 4, 5, -8};
        int expected = -8;
        Main main = new Main();
        assertEquals(expected, main.compareGetLowestNumber(input));

    }
    @Test
    public void mainShouldReturnTheHigherNumber() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = 5;
        Main main = new Main();
        assertEquals(expected, main.compareGetHighestNumber(input));
    }
}
