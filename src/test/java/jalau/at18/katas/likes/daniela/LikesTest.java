package jalau.at18.katas.likes.daniela;

import static org.junit.Assert.*;
import org.junit.Test;

public class LikesTest {
    @Test
    public void testLikes() {
        Like like = new Like();
        String[] finalnamecase1 = {"Daniela", "Alejandra", "javier", "mayra"};
        String[] finalnamecase2 = {"Daniela", "Alejandra", "javier"};
        String[] finalnamecase3 = {"Daniela", "Alejandra"};
        String[] finalnamecase4 = {"Daniela"};
        String[] finalnamecase5 = {};
        String inputnames1 = like.myLikes(finalnamecase1);
        String inputnames2 = like.myLikes(finalnamecase2);
        String inputnames3 = like.myLikes(finalnamecase3);
        String inputnames4 = like.myLikes(finalnamecase4);
        String inputnames5 = like.myLikes(finalnamecase5);
        String output1 = "Daniela, Alejandra and 2 others likes this";
        String output2 = "Daniela, Alejandra and javier likes this";
        String output3 = "Daniela and Alejandra likes this";
        String output4 = "Daniela likes this";
        String output5 = "No body like this";
        assertEquals(output1, inputnames1);
        assertEquals(output2, inputnames2);
        assertEquals(output3, inputnames3);
        assertEquals(output4, inputnames4);
        assertEquals(output5, inputnames5);
    }
}