package jalau.at18.katas.multiples.mauricio;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    private static final int INPUT_NUMBER = 10;
    private static final int OUTPUT_NUMBER = 23;

    @Test
    public void multiplesOfThreeOrFive() {
        int input = INPUT_NUMBER;
        String output = String.valueOf(OUTPUT_NUMBER);
        Main main = new Main();
        assertEquals(output, String.valueOf(main.sumOfMultiplesThreeOrFive(input)));
    }
}
