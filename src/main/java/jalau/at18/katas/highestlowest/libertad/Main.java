package jalau.at18.katas.highestlowest.libertad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        String data = scan.nextLine();
        System.out.println(highLowNumbers(data));
        scan.close();
    }

    public static String highLowNumbers(String input) {
        String[] numbers = input.split(" ");
        int iterator = 0;
        int higthest = Integer.parseInt(numbers[iterator]);
        int lowest = Integer.parseInt(numbers[iterator]);
        while (iterator < numbers.length) {
            int number = Integer.parseInt(numbers[iterator]);
            if (number > higthest) {
                higthest = number;
            }
            if (number < lowest) {
                lowest = number;
            }
            iterator++;
        }
        String answer = higthest + " " + lowest;
        return answer;
    }
}
