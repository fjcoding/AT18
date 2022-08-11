package jalau.at18.katas.multiples.alvaro;
import static org.junit.Assert.*;
import org.junit.Test;
public class MainTest {
    @Test
    public void itShouldInputAValidNumber() {
        int input = 5;
        int input_invalid = -5;
        boolean expected = true;
        boolean expectedTwo = false;
        Main main = new Main();
        assertEquals(expected, main.numberValid(input));
        assertEquals(expectedTwo, main.numberValid(input_invalid));

    }
    @Test
    public void itShouldAddedMultiplesofFiveAndThree() {
        int input = 10;
        int expected = 23;
        Main main = new Main();
        assertEquals(expected, main.added(input));


    }


}
