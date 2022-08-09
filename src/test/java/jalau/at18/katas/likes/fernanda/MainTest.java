package jalau.at18.katas.likes.fernanda;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void shouldReturnHighestLowest() {
        String input = "Max,John,Mark";
        String expected = "Max , John and Mark Like this";

        Main main = new Main();
        assertEquals(expected, main.whoLikesIt(input));
    }
}