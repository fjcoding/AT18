package jalau.at18.katas.phonenumber.fernanda;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void shouldReturnHighestLowest() {
        String input = "9,8,7,6,5,4,3,2,1,0";
        String expected = "(987) 654-3210";

        Main main = new Main();
        assertEquals(expected, main.numToPhoneFormat(input));
    }
}
