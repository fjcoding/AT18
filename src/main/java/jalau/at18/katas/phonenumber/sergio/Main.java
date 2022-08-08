package main.java.jalau.at18.katas.phonenumber.sergio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        String result = ReturnPhoneNumber(input);
        System.out.println(result);
    }

    public static String ReturnPhoneNumber(int[] input) {
        String countryCode = "";
        String areaCode = "";
        String phone = "";
        String fullPhone = "";
        int counter = 0;
        for (int number : input) {
            if (counter < 3) {
                countryCode = countryCode + String.valueOf(number);
            } else if (counter >= 3 & counter < 6) {
                areaCode = areaCode + String.valueOf(number);
            } else {
                phone = phone + String.valueOf(number);
            }
            counter++;
        }
        fullPhone = "(" + countryCode + ")" + " " + areaCode + "-" + phone;
        return (fullPhone);

    }

}