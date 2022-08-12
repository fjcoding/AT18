package jalau.at18.katas.multiples.rene;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    static final int INPUT1 = 20;
    static final int EXPECTED_RESULT1 = 78;
    static final int INPUT2 = 20;
    static final int EXPECTED_RESULT2 = 78;

    @Test
    public void mainShouldreturn78() {
        Main main = new Main();
        assertEquals(EXPECTED_RESULT1, main.multiples(INPUT1));
    }
    @Test
    public void mainShouldreturn23() {
        Main main = new Main();
        assertEquals(EXPECTED_RESULT2, main.multiples(INPUT2));
    }
}
