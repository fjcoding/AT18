package jalau.at18.katas.phonenumber.rodrigob;

import static org.junit.Assert.*;
import org.junit.Test;

public class PhoneTest{

    @Test
    public void testOne(){
        Phone phone = new Phone();
        assertEquals("(123) 456-7890", phone.phoneNumber(new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void testTwo(){
        Phone phone = new Phone();
        assertEquals("(154) 298-7821", phone.phoneNumber(new int [] {1, 5, 4, 2, 9, 8, 7, 8, 2, 1}));
    }

    @Test
    public void testThree(){
        Phone phone = new Phone();
        assertEquals("(244) 485-5493", phone.phoneNumber(new int [] {2, 4, 4, 4, 8, 5, 5, 4, 9, 3}));
    }
}