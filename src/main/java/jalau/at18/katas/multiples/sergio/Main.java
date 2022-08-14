package jalau.at18.katas.multiples.sergio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = readNumber.nextInt();
        int result = multiples(number);
        System.out.println(result);

    }

    public static final int FIRSTDIV = 3;
    public static final int SECONDDIV = 5;

    public static int multiples(int number) {
        String multipleNumbers = "0";
        for (int verif = 1; verif < number; verif++) {
            if (verif % FIRSTDIV == 0 | verif % SECONDDIV == 0) {
                multipleNumbers = multipleNumbers + " " + verif;
            }
        }
        String[] splitMultipleNumbers = multipleNumbers.split(" ");
        int result = 0;
        for (int position = 0; position < splitMultipleNumbers.length; position++) {
            result = result + Integer.parseInt(splitMultipleNumbers[position]);
        }
        return result;
    }
}