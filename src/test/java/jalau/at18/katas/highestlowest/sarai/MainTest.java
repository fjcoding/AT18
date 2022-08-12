package jalau.at18.katas.highestlowest.sarai;
import static org.junit.Assert.*;
import org.junit.Test;
public class MainTest {
    @Test
    public void shouldReturnHighestlowestNumbers() {
        Main  main = new Main();
        int[] input = {1, 2, 3, 4, 5};
        String expected = "5 1";
        assertEquals(expected, main.highestLowestNumber(input));

        int[] input1 = {1, 2, -3, 4, 5};
        String expected2 = "5 -3";
        assertEquals(expected2, main.highestLowestNumber(input1));

        int[] input3 = {1, 9, 3, 4, -5};
        String expected3 = "9 -5";
        assertEquals(expected3, main.highestLowestNumber(input3));   
    }
}