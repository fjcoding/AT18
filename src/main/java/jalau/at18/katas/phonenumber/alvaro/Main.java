package jalau.at18.katas.phonenumber.alvaro;

public class Main {
    private static final int TEST_NUMBER = 5;
    private static final int COUNTRY_CODE = 3;
    private static final int NUMBER_START = 6;
    public static void main(String[] args) {
        int[] number = new int[]{TEST_NUMBER, TEST_NUMBER, TEST_NUMBER, TEST_NUMBER, TEST_NUMBER,
            TEST_NUMBER, TEST_NUMBER, TEST_NUMBER, TEST_NUMBER, 0};
        String caracter;
        String finalNumber = "";
        for (int ind = 0; ind < number.length; ind++) {

            caracter = String.valueOf(number[ind]);

            if (ind < COUNTRY_CODE) {
                if (ind == 0) {
                    finalNumber = finalNumber.concat("(");
                }
                finalNumber = finalNumber.concat(caracter);
                if (ind == 2) {
                    finalNumber = finalNumber.concat(")");
                }
            }
            if (COUNTRY_CODE <= ind && ind < NUMBER_START) {
                if (ind == COUNTRY_CODE) {
                    finalNumber = finalNumber.concat(" ");
                }
                finalNumber = finalNumber.concat(caracter);
                if (ind == NUMBER_START - 1) {
                    finalNumber = finalNumber.concat("-");
                }
            }
            if (NUMBER_START <= ind && ind < number.length) {
                finalNumber = finalNumber.concat(caracter);
            }
        }
        System.out.println("Numero convertido: " + finalNumber);
    }
}
