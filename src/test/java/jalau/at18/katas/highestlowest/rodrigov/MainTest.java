package jalau.at18.katas.highestlowest.rodrigov;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void shouldReturnHighestLowestNumbers() {
        String input = "1 2 3 4 5";
        String expectedResult = "5 1";

        Main main = new Main();
        assertEquals(expectedResult, main.highestLowest(input));
    }
}
