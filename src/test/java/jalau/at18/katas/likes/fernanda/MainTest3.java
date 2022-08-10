package jalau.at18.katas.likes.fernanda;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest3 {

    @Test
    public void shouldReturnHighestLowest() {
        String input = "Max,John";
        String expected = "Max and John like this";

        Main main = new Main();
        assertEquals(expected, main.whoLikesIt(input));
    }
}