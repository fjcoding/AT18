package jalau.at18.katas.highestlowest.fernanda;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void shouldReturnHighestLowest() {
        String input = "-1 5 6 15 3";
        String expected = "-1 15";

        Main main = new Main();
        assertEquals(expected, main.highandlow(input));
    }
}