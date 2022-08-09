package jalau.at18.katas.highestlowest.mauricio;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MainTest {
    private static final int FIRST_NUMBER = -1;
    private static final int SECOND_NUMBER = 34;
    private static final int THIRD_NUMBER = 23;
    private static final int FOURTH_NUMBER = -7;
    private static final int FIFTH_NUMBER = 78;

    @Test
    public void returnHighestAndLowestValues() {
        int[] input = {FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, FOURTH_NUMBER, FIFTH_NUMBER};
        ArrayList<Integer> output = new ArrayList<>();
        output.add(FOURTH_NUMBER);
        output.add(FIFTH_NUMBER);
        Main main = new Main();
        assertEquals(output, main.phoneNumber(input));
        // Se puede tener mas de un assert
    }
}
