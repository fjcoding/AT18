package jalau.at18.katas.likes.sarai;

import static org.junit.Assert.*;

import org.junit.Test;
public class MainTest {
    @Test
    public void shouldReturnLikeThis() {
        Main  main = new Main();
        int input_arraySize0 = 0;
        String[] input_ZeroPeople = {""};
        String expected_ZeroPeople = "no one likes this";
        assertEquals(expected_ZeroPeople, main.showPeople( input_ZeroPeople, input_arraySize0));

        int input_arraySize1 = 1;
        String[] input_OnePeople = {"Peter"};
        String expected_OnePeople = "Peter likes this";
        assertEquals(expected_OnePeople, main.showPeople(input_OnePeople, input_arraySize1));

        int input_arraySize2 = 2;
        String[] input_TwoPeople = {"Jacob", "Alex"};
        String expected_TwoPeople = "Jacob and Alex like this";
        assertEquals(expected_TwoPeople, main.showPeople(input_TwoPeople,input_arraySize2));

        int input_arraySize3 = 3;
        String[] input_ThreePeople = {"Max", "John", "Mark"};
        String expected_ThreePeople = "Max, John and Mark like this";
        assertEquals(expected_ThreePeople,main.showPeople(input_ThreePeople, input_arraySize3));

        int input_arraySize4 = 4;
        String[] input_FourPeople = {"Alex", "Jacob", "Mark", "Max"};
        String expected_FourPeople = "Alex, Jacob and 2 others like this";
        assertEquals(expected_FourPeople, main.showPeople(input_FourPeople, input_arraySize4));

        int input_arraySize5 = 6;
        String[] input_More_FourPeople = {"Alex", "Jacob", "Mark", "Max", "Juan", "Fernando"};
        String expected_More_FourPeople = "Alex, Jacob and 4 others like this";
        assertEquals(expected_More_FourPeople,main.showPeople(input_More_FourPeople, input_arraySize5));
    }
}