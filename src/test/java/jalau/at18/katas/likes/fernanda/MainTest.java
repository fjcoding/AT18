package jalau.at18.katas.likes.fernanda;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void shouldReturnHighestLowest1() {
        String input = "";
        String expected = "No one likes this";

        Main main = new Main();
        assertEquals(expected, main.whoLikesIt(input));
    }

    @Test
    public void shouldReturnHighestLowest2() {
        String input = "Max";
        String expected = "Max likes this";

        Main main = new Main();
        assertEquals(expected, main.whoLikesIt(input));
    }

    @Test
    public void shouldReturnHighestLowest3() {
        String input = "Max,John";
        String expected = "Max and John like this";

        Main main = new Main();
        assertEquals(expected, main.whoLikesIt(input));
    }
    @Test
    public void shouldReturnHighestLowest() {
        String input = "Max,John,Mark";
        String expected = "Max, John and Mark Like this";

        Main main = new Main();
        assertEquals(expected, main.whoLikesIt(input));
    }

    @Test
    public void shouldReturnHighestLowest4() {
        String input = "Max,John,Jacob,Mark";
        String expected = "Max, John and 2 others like this";

        Main main = new Main();
        assertEquals(expected, main.whoLikesIt(input));
    }
}