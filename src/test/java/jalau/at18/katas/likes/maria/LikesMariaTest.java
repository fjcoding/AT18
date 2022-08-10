package jalau.at18.katas.likes.maria;

import org.junit.Test;
import static org.junit.Assert.*;
public class LikesMariaTest {
    private String[] people0 = {};
    private String[] people1 = {"Peter"};
    private String[] people2 = {"Jacob", "Alex"}; //-->  "Jacob and Alex like this"
    private String[] people3 = {"Max", "John", "Mark"}; //"Max, John and Mark like this"
    private String[] people4 = {"Alex", "Jacob", "Mark", "Max"}; //-->  "Alex, Jacob and 2 others like this"
    private String[] people5 = {"Karina", "Elsa", "Marcela", "Silvia", "Oscar", "Vladimir", "Romina"};

    @Test
    public void nonePerson() {
        assertEquals("no one likes this", Likes.likeAnswer(people0));
    }
    @Test
    public void onePerson() {
        assertEquals("Peter likes this", Likes.likeAnswer(people1));
    }
    @Test
    public void twoPerson() {
        assertEquals("Jacob and Alex likes this", Likes.likeAnswer(people2));
    }
    @Test
    public void threePerson() {
        assertEquals("Max, John and Mark likes this", Likes.likeAnswer(people3));
    }
    @Test
    public void threeMorePerson() {
        assertEquals("Alex, Jacob and 2 others like this", Likes.likeAnswer(people4));
    }
}
