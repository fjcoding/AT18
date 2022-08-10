package jalau.at18.katas.phonenumber.libertad;

public class Main {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 2, 2, 3, 2, 2, 2, 2};
        System.out.println(createPhoneNumber(numbers));
    }

    public static String createPhoneNumber(int[] numbers) {
        String response = "";
        int zero = 0;
        int three = 3;
        int iterator = zero;
        while (iterator < numbers.length) {
            if (iterator == zero) {
                response += "(" + numbers[iterator];
            }
            if (iterator > zero && iterator < three) {
                response += numbers[iterator];
            }
            if (iterator == three) {
                response += ") " + numbers[iterator];
            }
            if (iterator > three && iterator < (three + three)) {
                response += numbers[iterator];
            }
            if (iterator == (three + three)) {
                response += "-" + numbers[iterator];
            }
            if (iterator > (three + three)) {
                response += numbers[iterator];
            }
            iterator++;
        }
        return response;
    }
}