package main.java.jalau.at18.katas.highestlowest.hugo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a string of numbers spaced with a blank space e.g: (1 2 -3 4 5)");
        Scanner input = new Scanner(System.in);

        // String inputNum = "1 2 3 4 5";
        // String inputNum = "1 2 -3 4 5";
        // String inputNum = "1 9 3 4 -5";

        String inputNum = input.nextLine();
        boolean noletter = true;

        for (int a = 0; a < inputNum.length(); a++) {
            char myletter = inputNum.charAt(a);

            if (myletter == '1' || myletter == '2' || myletter == '3' || myletter == '4' || myletter == '5'
                    || myletter == '6'
                    || myletter == '7' || myletter == '8' || myletter == '9' || myletter == '0' || myletter == '-'
                    || myletter == ' ') {
                noletter = true;
            } else {
                noletter = false;
                a = inputNum.length();
                System.out.println("Letters are not allowed");
            }
        }

        if (noletter) {

            int max = 0;
            int min = 0;

            String[] concat = inputNum.split(" ");

            int[] vector = new int[10];

            for (int i = 0; i < concat.length; i++) {

                vector[i] = Integer.parseInt(concat[i]);

            }

            max = vector[0];
            min = vector[0];
            for (int j = 0; j < concat.length; j++) {

                if (vector[j] > max) {
                    max = vector[j];
                }

                if (vector[j] < min) {
                    min = vector[j];
                }
            }

            System.out.println("Max = " + max);
            System.out.println("Min = " + min);

        }
    }
}
