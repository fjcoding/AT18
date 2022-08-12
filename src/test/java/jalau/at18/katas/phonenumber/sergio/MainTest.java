package jalau.at18.katas.phonenumber.sergio;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldSayHello() {
        int[] input = new int[] {1, 7, 4, 6, 5, 1, 3, 4, 5, 9};
        String expected = "(174) 651-3459";
        assertEquals(expected, Main.returnPhoneNumber(input));
    }
}
