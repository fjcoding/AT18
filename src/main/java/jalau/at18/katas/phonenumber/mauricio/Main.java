package jalau.at18.katas.phonenumber.mauricio;

import java.util.ArrayList;

public class Main {
    static String phone_number(int[] number_list) {
        ArrayList<Integer> DigitsPhoneNumber = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int Random_number = (int) (Math.random() * 10);
            int digit = number_list[Random_number];
            DigitsPhoneNumber.add(digit);
        }
        String Digit_1 = Integer.toString(DigitsPhoneNumber.get(0));
        String Digit_2 = Integer.toString(DigitsPhoneNumber.get(1));
        String Digit_3 = Integer.toString(DigitsPhoneNumber.get(2));
        String Digit_4 = Integer.toString(DigitsPhoneNumber.get(3));
        String Digit_5 = Integer.toString(DigitsPhoneNumber.get(4));
        String Digit_6 = Integer.toString(DigitsPhoneNumber.get(5));
        String Digit_7 = Integer.toString(DigitsPhoneNumber.get(6));
        String Digit_8 = Integer.toString(DigitsPhoneNumber.get(7));
        String Digit_9 = Integer.toString(DigitsPhoneNumber.get(8));
        String Digit_10 = Integer.toString(DigitsPhoneNumber.get(9));
        String JointPhoneNumber = "(" + Digit_1 + Digit_2 + Digit_3 + ")" + " " + Digit_4 + Digit_5 + Digit_6 + "-"
                + Digit_7 + Digit_8 + Digit_9 + Digit_10;

        return JointPhoneNumber;
    }

    public static void main(String[] args) {
        int number_list[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        String phone_number = phone_number(number_list);

        // Proof with a second phone number
        String phone_number_2 = phone_number(number_list);
        System.out.println(phone_number);
        System.out.println(phone_number_2);
    }
}
