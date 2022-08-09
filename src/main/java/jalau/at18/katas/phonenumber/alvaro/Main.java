package jalau.at18.katas.phonenumber.alvaro;

public class Main {
    private static final int TEST_NUMBER = 5;
    private static final int COUNTRY_CODE = 3;
    private static final int NUMBER_START = 6;
    public static void main(String[] args) {
        int[] number = new int[]{TEST_NUMBER, TEST_NUMBER, TEST_NUMBER, TEST_NUMBER, TEST_NUMBER,
            TEST_NUMBER, TEST_NUMBER, TEST_NUMBER, TEST_NUMBER, 0};
        Main main = new Main();
        main.covertNumber(number);


    }
    public String covertNumber(int[]number) {
        String finalNumber = "";
        String character;
        for (int ind = 0; ind < number.length; ind++) {

            character = String.valueOf(number[ind]);

            if (ind < COUNTRY_CODE) {
                if (ind == 0) {
                    finalNumber = finalNumber.concat("(");
                }
                finalNumber = finalNumber.concat(character);
                if (ind == 2) {
                    finalNumber = finalNumber.concat(")");
                }
            }
            if (COUNTRY_CODE <= ind && ind < NUMBER_START) {
                if (ind == COUNTRY_CODE) {
                    finalNumber = finalNumber.concat(" ");
                }
                finalNumber = finalNumber.concat(character);
                if (ind == NUMBER_START - 1) {
                    finalNumber = finalNumber.concat("-");
                }
            }
            if (NUMBER_START <= ind && ind < number.length) {
                finalNumber = finalNumber.concat(character);
            }
        }
        System.out.println("Final number:  " + finalNumber);
        return finalNumber;

    }
}
