package jalau.at18.katas.likes.sergio;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldShowsLikes1() {
        String input = "";
        String expected = "no one likes this";
        assertEquals(expected, Main.likesString(input));
    }

    @Test
    public void mainShouldShowsLikes2() {
        String input = "jorge";
        String expected = "jorge likes this";
        assertEquals(expected, Main.likesString(input));
    }

    @Test
    public void mainShouldShowsLikes3() {
        String input = "jorge sergio";
        String expected = "jorge and sergio likes this";
        assertEquals(expected, Main.likesString(input));
    }

    @Test
    public void mainShouldShowsLikes4() {
        String input = "jorge sergio andres";
        String expected = "jorge, sergio and andres likes this";
        assertEquals(expected, Main.likesString(input));
    }

    @Test
    public void mainShouldShowsLikes5() {
        String input = "jorge sergio andres carlos";
        String expected = "jorge, sergio and andres likes this";
        assertEquals(expected, Main.likesString(input));
    }

    @Test
    public void mainShouldShowsLikes6() {
        String input = "jorge sergio andres carlos marian";
        String expected = "jorge, sergio and andres likes this";
        assertEquals(expected, Main.likesString(input));
    }

}
