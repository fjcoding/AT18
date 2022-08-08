package jalau.at18.katas.phonenumber.mauricio;

import java.util.ArrayList;

public class Main {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int NINE = 9;
    private static final int TEN = 10;

    static String phoneNumber(int[] numberList) {
        ArrayList<Integer> digitsPhoneNumber = new ArrayList<Integer>();
        for (int index = ZERO; index < TEN; index++) {
            int randomNumber = (int) (Math.random() * TEN);
            int digit = numberList[randomNumber];
            digitsPhoneNumber.add(digit);
        }
        String digit1 = Integer.toString(digitsPhoneNumber.get(ZERO));
        String digit2 = Integer.toString(digitsPhoneNumber.get(ONE));
        String digit3 = Integer.toString(digitsPhoneNumber.get(TWO));
        String digit4 = Integer.toString(digitsPhoneNumber.get(THREE));
        String digit5 = Integer.toString(digitsPhoneNumber.get(FOUR));
        String digit6 = Integer.toString(digitsPhoneNumber.get(FIVE));
        String digit7 = Integer.toString(digitsPhoneNumber.get(SIX));
        String digit8 = Integer.toString(digitsPhoneNumber.get(SEVEN));
        String digit9 = Integer.toString(digitsPhoneNumber.get(EIGHT));
        String digit10 = Integer.toString(digitsPhoneNumber.get(NINE));
        String jointPhoneNumber = "(" + digit1 + digit2 + digit3 + ")" + " " + digit4 + digit5 + digit6 + "-"
                + digit7 + digit8 + digit9 + digit10;

        return jointPhoneNumber;
    }

    public static void main(String[] args) {
        int[] number_list = {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE};
        String phone_number = phoneNumber(number_list);

        // Proof with a second phone number
        String phone_number_2 = phoneNumber(number_list);
        System.out.println(phone_number);
        System.out.println(phone_number_2);
    }
}
