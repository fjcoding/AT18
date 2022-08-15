package jalau.at18.katas.highestlowest.adriana;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void functionShouldGiveHighest() {
        Main main = new Main();
        String[] inputArray1 = {"1", "2", "3", "4", "5"};
        Integer expected1 = 5;
        assertEquals(expected1, main.getHighest(inputArray1));
        String[] inputArray2 = {"1", "2", "-3", "4", "5"};
        Integer expected2 = 5;
        assertEquals(expected2, main.getHighest(inputArray2));
        String[] inputArray3 = {"1", "9", "3", "4", "-5"};
        Integer expected3 = 9;
        assertEquals(expected3, main.getHighest(inputArray3));
    }

    @Test
    public void functionShouldGiveLowest() {
        Main main = new Main();
        String[] inputArray1 = {"1", "2", "3", "4", "5"};
        Integer expected1 = 1;
        assertEquals(expected1, main.getLowest(inputArray1));
        String[] inputArray2 = {"1", "2", "-3", "4", "5"};
        Integer expected2 = -3;
        assertEquals(expected2, main.getLowest(inputArray2));
        String[] inputArray3 = {"1", "9", "3", "4", "-5"};
        Integer expected3 = -5;
        assertEquals(expected3, main.getLowest(inputArray3));
    }

    @Test
    public void mainShouldShowHighestLowest() {
        Main main = new Main();
        String input1 = "1 2 3 4 5";
        String expected1 = "5 1";
        assertEquals(expected1, main.getResults(input1));
        String input2 = "1 2 -3 4 5";
        String expected2 = "5 -3";
        assertEquals(expected2, main.getResults(input2));
        String input3 = "1 9 3 4 -5";
        String expected3 = "9 -5";
        assertEquals(expected3, main.getResults(input3));
    }
}
