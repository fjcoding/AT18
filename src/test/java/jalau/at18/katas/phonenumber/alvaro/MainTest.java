package jalau.at18.katas.phonenumber.alvaro;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void itShouldInputAValidNumber() {

        String expecteds = "(123) 456-7890";
        int[] numberInput = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Main main = new Main();
        assertEquals(expecteds, main.covertNumber(numberInput));

    }
}
