package jalau.at18.katas.highestlowest.mauricio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int number_list[] = { -1, 34, 23, -7, 5 };
        ArrayList<Integer> lowest_and_biggest_numbers = new ArrayList<Integer>();
        int biggest = 0, lowest = 0;
        for (int i = 0; i < number_list.length; i++) {
            if (number_list[i] > biggest) {
                biggest = number_list[i];
            }
            if (number_list[i] < lowest) {
                lowest = number_list[i];
            }
        }
        lowest_and_biggest_numbers.add(lowest);
        lowest_and_biggest_numbers.add(biggest);
        System.out.println("Lowest number and Biggest number" + lowest_and_biggest_numbers);

    }
}
