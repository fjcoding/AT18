package jalau.at18.katas.likes.rodrigob;

import static org.junit.Assert.*;
import org.junit.Test;

public class LikesTest {

    @Test
    public void testFourPersons() {
        Likes likes = new Likes();
        assertEquals("Alex, Jacob and 2 others like this", likes.whoLikes(new String[] {"Alex", "Jacob", "Mark", "Max"}));
    }

    @Test
    public void testTwoPersons() {
        Likes likes = new Likes();
        assertEquals("Jacob and Alex like this", likes.whoLikes(new String[] {"Jacob", "Alex"}));
    }

    @Test
    public void testNoOne() {
        Likes likes = new Likes();
        assertEquals("no one likes this", likes.whoLikes(new String[] {}));
    }
}