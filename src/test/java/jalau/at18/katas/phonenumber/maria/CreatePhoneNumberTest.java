package jalau.at18.katas.phonenumber.maria;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatePhoneNumberTest {
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int NINE = 9;
    private static final int ZERO = 0;
    private int[] lessNumbersArray = {1, 2, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT};
    private int[] tenNumbersArray = {1, 2, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, ZERO};

    @Test
    public void phoneNumberForm() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.phoneNumberForm(tenNumbersArray));
    }
    @Test
    public void arrayLessTenDigits() {
        assertEquals("Array must have 10 digits", CreatePhoneNumber.phoneNumberForm(lessNumbersArray));
    }


}
