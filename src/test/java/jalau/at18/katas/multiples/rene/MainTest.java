package jalau.at18.katas.multiples.rene;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldreturn78() {
        Main main = new Main();
        int input = 20;
        int expectedResult = 78;
        assertEquals(expectedResult, main.multiples(input));
    }
    @Test
    public void mainShouldreturn23() {
        Main main = new Main();
        int input = 10;
        int expectedResult = 23;
        assertEquals(expectedResult, main.multiples(input));
    }
}
