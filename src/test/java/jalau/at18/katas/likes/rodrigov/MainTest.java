package jalau.at18.katas.likes.rodrigov;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void shouldReturnNamesGaveLike() {
        String firstInput = "";
        String secondInput = "Peter";
        String thirdInput = "Jacob Alex";
        String fourthInput = "Max John Mark";
        String fifthInput = "Alex Jacob Mark Max";

        String firstExpectedResult = "no one likes this";
        String secondExpectedResult = "Peter likes this";
        String thirdExpectedResult = "Jacob and Alex like this";
        String fourthExpectedResult = "Max, John and Mark like this";
        String fifthExpectedResult = "Alex, Jacob and 2 others like this";

        Main main = new Main();
        assertEquals(firstExpectedResult, main.likes(firstInput));
        assertEquals(secondExpectedResult, main.likes(secondInput));
        assertEquals(thirdExpectedResult, main.likes(thirdInput));
        assertEquals(fourthExpectedResult, main.likes(fourthInput));
        assertEquals(fifthExpectedResult, main.likes(fifthInput));
    }
}
