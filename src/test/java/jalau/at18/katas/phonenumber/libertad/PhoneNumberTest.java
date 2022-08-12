package jalau.at18.katas.phonenumber.libertad;
import static org.junit.Assert.*;
import org.junit.Test;

public class PhoneNumberTest {
    @Test
    public void returnANewPhoneNumber() {
        Main main = new Main();
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 8};
        String expected = "(123) 456-7898";
        assertEquals(expected,main.createPhoneNumber(input));
    }

    @Test
    public void createAPhoneNumber() {
        Main main = new Main();
        int[] input = {0, 0, 0, 4, 5, 6, 7, 8, 9, 0};
        String expected = "(000) 456-7890";
        assertEquals(expected,main.createPhoneNumber(input));
    }
}
