package jalau.at18.katas.phonenumber.libertad;

public class Main {
    private static final int LIMIT_COUNTRY_CODE = 3;
    private static final int LIMIT_AREA_CODE = 6;
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 2, 2, 1, 2, 2, 2, 2};
        System.out.println(createPhoneNumber(numbers));
    }

    public static String createPhoneNumber(int[] numbers) {
        String response = "";
        int zero = 0;
        int iterator = zero;
        while (iterator < numbers.length) {
            if (iterator == zero) {
                response += "(" + numbers[iterator];
            }
            if (iterator > zero && iterator < LIMIT_COUNTRY_CODE) {
                response += numbers[iterator];
            }
            if (iterator == LIMIT_COUNTRY_CODE) {
                response += ") " + numbers[iterator];
            }
            if (iterator > LIMIT_COUNTRY_CODE && iterator < LIMIT_AREA_CODE) {
                response += numbers[iterator];
            }
            if (iterator == LIMIT_AREA_CODE) {
                response += "-" + numbers[iterator];
            }
            if (iterator > LIMIT_AREA_CODE) {
                response += numbers[iterator];
            }
            iterator++;
        }
        return response;
    }
}