package jalau.at18.katas.likes.fernanda;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest5 {

    @Test
    public void shouldReturnHighestLowest() {
        String input = "Max,John,Jacob,Mark";
        String expected = "Max, John and 2 others like this";

        Main main = new Main();
        assertEquals(expected, main.whoLikesIt(input));
    }
}