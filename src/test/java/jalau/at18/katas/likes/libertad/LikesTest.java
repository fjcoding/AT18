package jalau.at18.katas.likes.libertad;
import static org.junit.Assert.*;
import org.junit.Test;

public class LikesTest {

    @Test
    public void hasNoOneLike() {
        Main main = new Main();
        String[] input = {};
        String expected = "no one likes this";
        assertEquals(expected,main.whoLikes(input));
    }

    @Test
    public void hasOneLike() {
        Main main = new Main();
        String[] input = {"Juan"};
        String expected = "Juan likes this";
        assertEquals(expected,main.whoLikes(input));
    }

    @Test
    public void hasTwoLikes() {
        Main main = new Main();
        String[] input = {"Juan","Jose"};
        String expected = "Juan and Jose like this";
        assertEquals(expected,main.whoLikes(input));
    }

    @Test
    public void hasThreeLikes() {
        Main main = new Main();
        String[] input = {"Juan","Jose","Pedro"};
        String expected = "Juan, Jose and Pedro like this";
        assertEquals(expected,main.whoLikes(input));
    }

    @Test
    public void hasFourLikes() {
        Main main = new Main();
        String[] input = {"Juan","Jose","Pedro","Javier"};
        String expected = "Juan, Jose and 2 others like this";
        assertEquals(expected,main.whoLikes(input));
    }

    @Test
    public void hasMoreLikesThatFour() {
        Main main = new Main();
        String[] input = {"Juan","Jose","Pedro","Javier","Maria","Fernanda","Pedro O"};
        String expected = "Juan, Jose and 5 others like this";
        assertEquals(expected,main.whoLikes(input));
    }
}