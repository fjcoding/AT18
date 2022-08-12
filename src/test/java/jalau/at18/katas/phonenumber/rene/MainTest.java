package jalau.at18.katas.phonenumber.rene;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    static final int NUMBER_ONE = 1;
    static final int NUMBER_TWO = 2;
    static final int NUMBER_THREE = 3;
    static final int NUMBER_FOUR = 4;
    static final int NUMBER_SIX = 6;
    static final int NUMBER_SEVEN = 7;
    static final int NUMBER_EIGHT = 8;
    static final int NUMBER_NINE = 9;
    static final int NUMBER_FIVE = 5;
    static final int NUMBER_CERO = 0;

    @Test
    public void mainShouldreturn78() {
        Main main = new Main();
        int[] input = {NUMBER_ONE, NUMBER_TWO, NUMBER_THREE, NUMBER_FOUR, NUMBER_FIVE, NUMBER_SIX, NUMBER_SEVEN,
            NUMBER_EIGHT, NUMBER_NINE, NUMBER_CERO};
        String expectedResult = "(123) 456-7890";
        assertEquals(expectedResult, main.createPhoneNumber(input));
    }
    @Test
    public void mainShouldreturn23() {
        Main main = new Main();
        int[] input = {NUMBER_FIVE, NUMBER_NINE, NUMBER_ONE, NUMBER_SIX, NUMBER_NINE, NUMBER_NINE, NUMBER_NINE,
            NUMBER_SEVEN, NUMBER_FOUR, NUMBER_CERO};
        String expectedResult = "(591) 699-9740";
        assertEquals(expectedResult, main.createPhoneNumber(input));
    }
}