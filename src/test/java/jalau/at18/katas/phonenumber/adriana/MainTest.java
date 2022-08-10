package jalau.at18.katas.phonenumber.adriana;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void functionShouldCheckIfItIsAPhoneNumber() {
        Main main = new Main();
        Integer[] inputArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Boolean expected1 = true;
        assertEquals(expected1, main.checkNumber(inputArray1));
        Integer[] inputArray2 = {1, 2, 3, 4, 5, 6, 7, 8};
        Boolean expected2 = false;
        assertEquals(expected2, main.checkNumber(inputArray2));
        Integer[] inputArray3 = {1, 2, 13, 4, 5, 6, -4, 8};
        Boolean expected3 = false;
        assertEquals(expected3, main.checkNumber(inputArray3));
    }
    @Test
    public void functionShouldGiveTheNumberWithFormat() {
        Main main = new Main();
        Integer[] inputArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String expected1 = "(123) 456-7890";
        assertEquals(expected1, main.createPhoneNumber(inputArray1));
        Integer[] inputArray2 = {3, 3, 3, 4, 4, 4, 5, 1, 1, 1};
        String expected2 = "(333) 444-5111";
        assertEquals(expected2, main.createPhoneNumber(inputArray2));
    }
}
