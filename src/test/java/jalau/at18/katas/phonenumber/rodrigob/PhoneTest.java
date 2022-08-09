package jalau.at18.katas.phonenumber.rodrigob;

import static org.junit.Assert.*;
import org.junit.Test;

public class PhoneTest {

    @Test
    public void testOne() {
        Phone phone = new Phone();
        final int number = 1;
        assertEquals("(111) 111-1111", phone.phoneNumber(new int[] {number, number, number, number, number, number, number, number, number, number}));
    }

    @Test
    public void testTwo() {
        Phone phone = new Phone();
        final int number = 5;
        assertEquals("(555) 555-5555", phone.phoneNumber(new int[] {number, number, number, number, number, number, number, number, number, number}));
    }

    @Test
    public void testThree() {
        Phone phone = new Phone();
        final int number = 9;
        assertEquals("(999) 999-9999", phone.phoneNumber(new int[] {number, number, number, number, number, number, number, number, number, number}));
    }
}