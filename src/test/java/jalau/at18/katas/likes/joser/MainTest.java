package jalau.at18.katas.likes.joser;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void testLikes() {
        Main main = new Main();
        assertEquals("no one likes this", main.likes(""));
        assertEquals("Peter likes this", main.likes("Peter"));
        assertEquals("Jacob and Alex like this", main.likes("Jacob Alex"));
        assertEquals("Max, John and Mark like this", main.likes("Max John Mark"));
        assertEquals("Alex, Jacob and 2 others like this", main.likes("Alex Jacob Mark Max"));
    }
}
