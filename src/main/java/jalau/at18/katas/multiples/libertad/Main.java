package jalau.at18.katas.multiples.libertad;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(sumOfNumbers(number));
        scan.close();
    }

    public static int sumOfNumbers(int number) {
        int zero = 0;
        int three = 3;
        int five = 5;
        int result = zero;
        if (number > zero) {
            while (number > zero) {
                number--;
                if (number % three == zero || number % five == zero) {
                    result += number;
                }
            }
        }
        return result;
    }
}