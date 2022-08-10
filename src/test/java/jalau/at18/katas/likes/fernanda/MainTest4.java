package jalau.at18.katas.likes.fernanda;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest4 {

    @Test
    public void shouldReturnHighestLowest() {
        String input = "Max";
        String expected = "Max likes this";

        Main main = new Main();
        assertEquals(expected, main.whoLikesIt(input));
    }
}