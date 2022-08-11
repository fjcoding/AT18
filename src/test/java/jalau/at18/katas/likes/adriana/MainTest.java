package jalau.at18.katas.likes.adriana;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldGiveLikesText() {
        Main main = new Main();
        String[] inputArray1 = {};
        String expected1 = "no one likes this";
        assertEquals(expected1, main.likesText(inputArray1));
        String[] inputArray2 = {"Peter"};
        String  expected2 = "Peter likes this";
        assertEquals(expected2, main.likesText(inputArray2));
        String[] inputArray3 = {"Jacob", "Alex"};
        String expected3 = "Jacob and Alex like this";
        assertEquals(expected3, main.likesText(inputArray3));
        String[] inputArray4 = {"Max", "John", "Mark"};
        String expected4 = "Max, John and Mark like this";
        assertEquals(expected4, main.likesText(inputArray4));
        String[] inputArray5 = {"Alex", "Jacob", "Mark", "Max"};
        String expected5 = "Alex, Jacob and 2 others like this";
        assertEquals(expected5, main.likesText(inputArray5));
    }
}
