package jalau.at18.katas.likes.rene;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldreturnCeroLikes() {
        Main main = new Main();
        String[] input = {};
        String expectedResult = "No one like this";
        assertEquals(expectedResult, main.likes(input));
    }
    @Test
    public void mainShouldreturnOneLike() {
        Main main = new Main();
        String[] input = {"Camila"};
        String expectedResult = "Camila like this";
        assertEquals(expectedResult, main.likes(input));
    }
    @Test
    public void mainShouldreturnTwoLikes() {
        Main main = new Main();
        String[] input = {"Camila", "Fabricio"};
        String expectedResult = "Camila and Fabricio like this";
        assertEquals(expectedResult, main.likes(input));
    }
    @Test
    public void mainShouldreturnThreeLikes() {
        Main main = new Main();
        String[] input = {"Camila", "Fabricio", "Sebastian"};
        String expectedResult = "Camila, Fabricio and Sebastian like this";
        assertEquals(expectedResult, main.likes(input));
    }
    @Test
    public void mainShouldreturnFourLikes() {
        Main main = new Main();
        String[] input = {"Camila", "Fabricio", "Sebastian", "Adrian"};
        String expectedResult = "Camila, Fabricio and 2 others like this";
        assertEquals(expectedResult, main.likes(input));
    }
    @Test
    public void mainShouldreturnEightLikes() {
        Main main = new Main();
        String[] input = {"Camila", "Fabricio", "Sebastian", "Adrian", "Jose", "Cristian", "Fabian", "Ee"};
        String expectedResult = "Camila, Fabricio and 6 others like this";
        assertEquals(expectedResult, main.likes(input));
    }
}
