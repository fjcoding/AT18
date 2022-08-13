package jalau.at18.katas.phonenumber.mauricio;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int NINE = 9;
    private static final int FOURTEEN = 14;

    @Test
    public void getAPhoneNumber() {
        int[] numberList = {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE};
        int phoneNumberLengthExpected = FOURTEEN;

        Main main = new Main();

        int phoneNumberLengthObtained = main.phoneNumber(numberList).length();
        String phoneNumberStructure = main.phoneNumber(numberList);

        assertEquals(phoneNumberLengthExpected, phoneNumberLengthObtained);
        assertEquals(ZERO, phoneNumberStructure.indexOf("("));
        assertEquals(FOUR, phoneNumberStructure.indexOf(")"));
        assertEquals(FIVE, phoneNumberStructure.indexOf(" "));
        assertEquals(NINE, phoneNumberStructure.indexOf("-"));
    }
}
