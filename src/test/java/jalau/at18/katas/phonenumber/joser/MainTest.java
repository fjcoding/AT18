package jalau.at18.katas.phonenumber.joser;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void testPhoneNumber() {
        Main main = new Main();
        assertEquals("(123) 456-7890", main.phoneNumber("1 2 3 4 5 6 7 8 9 0"));
    }
}