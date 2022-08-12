package jalau.at18.katas.likes.alvaro;
import static org.junit.Assert.*;
import org.junit.Test;
public class MainTest {
    @Test
    public void itShouldShowACorrectText() {

        String[] inputOne = {};
        String[] inputTwo = {"Peter"};
        String[] inputThree = {"Jacob", "Alex"};
        String[] inputFour = {"Max", "John", "Mark"};
        String[] inputFive = {"Alex", "Jacob", "Mark", "Max"};
        String expecteds_One = "No one likes this";
        String expecteds_Two = "Peter likes this";
        String expecteds_Three = "Jacob and Alex like this";
        String expecteds_Four = "Max, John and Mark like this";
        String expecteds_Five = "Alex, Jacob and 2 others like this";

        Main main = new Main();
        assertEquals(expecteds_One,main.showText(inputOne));
        assertEquals(expecteds_Two,main.showText(inputTwo));
        assertEquals(expecteds_Three,main.showText(inputThree));
        assertEquals(expecteds_Four,main.showText(inputFour));
        assertEquals(expecteds_Five,main.showText(inputFive));

    }

}
