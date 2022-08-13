package jalau.at18.katas.highestlowest.libertad;

import static org.junit.Assert.*;
import org.junit.Test;

public class HighestlowestTest {

    @Test
    public void returnTheHighestAndLowestNumbers() {
        Main main = new Main();
        String input = "1 2 3 4 5";
        String expected = "5 1";
        assertEquals(expected,main.highLowNumbers(input));
    }

    @Test
    public void runWhenHaveZeroNumbers() {
        Main main = new Main();
        String input = "3 0 0 6 0";
        String expected = "6 0";
        assertEquals(expected,main.highLowNumbers(input));
    }

    @Test
    public void runWhenHaveEqualsNumbers() {
        Main main = new Main();
        String input = "3 3 3 3 3";
        String expected = "3 3";
        assertEquals(expected,main.highLowNumbers(input));
    }

    @Test
    public void runWhenHaveOneNegativeNumber() {
        Main main = new Main();
        String input = "3 0 -3 4 9";
        String expected = "9 -3";
        assertEquals(expected,main.highLowNumbers(input));
    }

    @Test
    public void runWhenHaveTwoNegativeNumbers() {
        Main main = new Main();
        String input = "-1 2 3 4 -5";
        String expected = "4 -5";
        assertEquals(expected,main.highLowNumbers(input));
    }

    @Test
    public void runWhenHaveAllNegativeNumbers() {
        Main main = new Main();
        String input = "-1 -7 -3 -4 -5";
        String expected = "-1 -7";
        assertEquals(expected,main.highLowNumbers(input));
    }
}