package jalau.at18.katas.phonenumber.sarai;

import static org.junit.Assert.*;
public class MainTest {
    public void shouldReturnPhoneNumbers() {
        String input = "1 2 3 4 5 6 7 8 9 0";
        String expected = "(123)456-7890";
        assertEquals(expected, input);
    }
}
