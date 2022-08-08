package jalau.at18.katas.phonenumber.deniso;

public class CreatePhone {
    private static final int TEST_ONE = 1;
    private static final int TEST_TWO = 2;
    private static final int TEST_THREE = 3;
    private static final int TEST_FOUR = 4;
    private static final int TEST_FIVE = 5;
    private static final int TEST_SIX = 6;
    private static final int TEST_SEVEN = 7;
    private static final int TEST_EIGHT = 8;
    private static final int TEST_NINE = 9;
    private static final int TEST_CERO = 0;
    private static final int NUMBER_FIRST = 2;
    private static final int NUMBER_SECOND = 5;
    private static final int NUMBER_THIRD = 9;
    public static void main(String[] args) {
        int[] number = {TEST_ONE, TEST_TWO, TEST_THREE, TEST_FOUR, TEST_FIVE, TEST_SIX, TEST_SEVEN, TEST_EIGHT, TEST_NINE, TEST_CERO };
        String res = "";
        String aux = "(";
        String aux1 = ")";
        String aux2 = "-";
        String aux3 = "";
        String aux4 = "";
        String aux5 = "";
        for (int index = 0; index < number.length; index++) {
            if (index <= NUMBER_FIRST) {
                aux3 = aux3 + number[index];
            }
            if (index > NUMBER_FIRST && index <= NUMBER_SECOND) {
                aux4 = aux4 + number[index];
            }
            if (index > NUMBER_SECOND && index <= NUMBER_THIRD) {
                aux5 = aux5 + number[index];
            }
        }
        res = aux + aux3 + aux1 + " " + aux4 + aux2 + aux5;
        System.out.println("Phone number is:" + res);
    }
}