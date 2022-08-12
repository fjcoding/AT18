package jalau.at18.katas.highestlowest.hugo;

import java.util.Scanner;

public class Main {
    static final Integer NUM_10 = 10;
    public static void main(String[] args) {

        System.out.println("Enter a string of numbers spaced with a blank space e.g: (1 2 -3 4 5)");
        Scanner input = new Scanner(System.in);

        // String inputNum = "1 2 3 4 5";
        // String inputNum = "1 2 -3 4 5";
        // String inputNum = "1 9 3 4 -5";

        String inputNum = input.nextLine();
        boolean noletter = true;

        for (int aux = 0; aux < inputNum.length(); aux++) {
            char myletter = inputNum.charAt(aux);

            if (myletter == '1' || myletter == '2' || myletter == '3' || myletter == '4' || myletter == '5'
                    || myletter == '6'
                    || myletter == '7' || myletter == '8' || myletter == '9' || myletter == '0' || myletter == '-'
                    || myletter == ' ') {
                noletter = true;
            } else {
                noletter = false;
                aux = inputNum.length();
                System.out.println("Letters are not allowed");
            }
        }

        if (noletter) {

            int max = 0;
            int min = 0;

            String[] concat = inputNum.split(" ");

            int[] vector = new int[NUM_10];

            for (int index = 0; index < concat.length; index++) {

                vector[index] = Integer.parseInt(concat[index]);

            }

            max = vector[0];
            min = vector[0];
            for (int jindex = 0; jindex < concat.length; jindex++) {

                if (vector[jindex] > max) {
                    max = vector[jindex];
                }

                if (vector[jindex] < min) {
                    min = vector[jindex];
                }
            }

            System.out.println("Max = " + max);
            System.out.println("Min = " + min);

        }
    }
}
