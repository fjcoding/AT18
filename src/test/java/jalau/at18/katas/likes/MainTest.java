package jalau.at18.katas.likes;
import static org.junit.Assert.*;
import org.junit.Test;

import jalau.at18.katas.likes.rodrigov.Main;
public class MainTest {
    @Test
    public void shouldReturnNamesGaveLike(){
        String input = "Alex John Nathan Justin Tyron";
        String expectedResult = "Alex, John and 3 others like this";

        Main main = new Main();
        assertEquals(expectedResult, main.likes(input));
    }
}
