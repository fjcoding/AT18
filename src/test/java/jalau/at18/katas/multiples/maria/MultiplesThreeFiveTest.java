package jalau.at18.katas.multiples.maria;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplesThreeFiveTest {
    public static final int NEGATIVE_NUMBER = -3;
    public static final int POSITIVE_NUMBER = 20;
    public static final int RESULT_NUMBER = 78;
    public static final int ZERO_RESULT_NUMBER = 0;
    @Test
    public void negativeNumber() {
        assertEquals(ZERO_RESULT_NUMBER, MultiplesThreeFive.multiplesTreeFive(NEGATIVE_NUMBER));
    }

    @Test
    public void multiplesTreeFive() {
        assertEquals(RESULT_NUMBER, MultiplesThreeFive.multiplesTreeFive(POSITIVE_NUMBER));
    }
}
