package jalau.at18.katas.phonenumber.daniela;

import static org.junit.Assert.*;
import org.junit.Test;

public class PhonenumberTest {
    @Test
    public void testPhonenumber() {
        Phone phone = new Phone();
        final Integer[] inputArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        var outnumber = "(123) 456-7890";
        assertEquals(outnumber, phone.myPhone(inputArray1));
    }
}