package jalau.at18.katas.phonenumber.rene;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldreturn78() {
        Main main = new Main();
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String expectedResult = "(123) 456-7890";
        assertEquals(expectedResult, main.createPhoneNumber(input));
    }
    @Test
    public void mainShouldreturn23() {
        Main main = new Main();
        int[] input = {5, 9, 1, 6, 9, 9, 9, 7, 4, 0};
        String expectedResult = "(591) 699-9740";
        assertEquals(expectedResult, main.createPhoneNumber(input));
    }
}