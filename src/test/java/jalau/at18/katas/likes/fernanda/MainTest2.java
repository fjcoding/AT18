package jalau.at18.katas.likes.fernanda;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest2 {

    @Test
    public void shouldReturnHighestLowest() {
        String input = "";
        String expected = "No one likes this";

        Main main = new Main();
        assertEquals(expected, main.whoLikesIt(input));
    }
}