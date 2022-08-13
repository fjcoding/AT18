package jalau.at18.katas.highestlowest.mauricio;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MainTest {
    private static final int FIRST_NUMBER_OF_ARRAY = -1;
    private static final int SECOND_NUMBER_OF_ARRAY = 34;
    private static final int THIRD_NUMBER_OF_ARRAY = 23;
    private static final int FOURTH_NUMBER_OF_ARRAY = -7;
    private static final int FIFTH_NUMBER_OF_ARRAY = 78;

    @Test
    public void returnHighestAndLowestValues() {
        int[] input = {FIRST_NUMBER_OF_ARRAY, SECOND_NUMBER_OF_ARRAY, THIRD_NUMBER_OF_ARRAY, FOURTH_NUMBER_OF_ARRAY, FIFTH_NUMBER_OF_ARRAY};
        ArrayList<Integer> output = new ArrayList<>();
        output.add(FOURTH_NUMBER_OF_ARRAY);
        output.add(FIFTH_NUMBER_OF_ARRAY);
        Main main = new Main();
        assertEquals(output, main.phoneNumber(input));
    }
}
