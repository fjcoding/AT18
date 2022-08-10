package jalau.at18.katas.phonenumber.rene;

public class Main {
    static final int NUMBER_ONE = 1;
    static final int NUMBER_TWO = 2;
    static final int NUMBER_THREE = 3;
    static final int NUMBER_FOUR = 4;
    static final int NUMBER_SIX = 6;
    static final int NUMBER_SEVEN = 7;
    static final int NUMBER_EIGHT = 8;
    static final int NUMBER_NINE = 9;
    static final int NUMBER_FIVE = 5;
    static final int NUMBER_CERO = 0;
    public static void main(String[] args) {

        int[] num = {NUMBER_ONE, NUMBER_TWO, NUMBER_THREE, NUMBER_FOUR, NUMBER_FIVE, NUMBER_SIX,
            NUMBER_SEVEN, NUMBER_EIGHT, NUMBER_NINE, NUMBER_CERO};
        System.out.println(createPhoneNumber(num));

    }

    static String createPhoneNumber(int[] numbers) {
        return "(" + numbers[NUMBER_CERO] + numbers[NUMBER_ONE] + numbers[NUMBER_TWO] + ") "
            + numbers[NUMBER_THREE] + numbers[NUMBER_FOUR] + numbers[NUMBER_FIVE]
            + "-" + numbers[NUMBER_SIX] + numbers[NUMBER_SEVEN] + numbers[NUMBER_EIGHT] + numbers[NUMBER_NINE];
    }
}
