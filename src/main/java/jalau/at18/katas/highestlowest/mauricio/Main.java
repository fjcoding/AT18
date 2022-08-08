package jalau.at18.katas.highestlowest.mauricio;

import java.util.ArrayList;

public class Main {
    private static final int FIRST_NUMBER = -1;
    private static final int SECOND_NUMBER = 34;
    private static final int THIRD_NUMBER = 23;
    private static final int FOURTH_NUMBER = -7;
    private static final int FIFTH_NUMBER = 78;

    public static void main(String[] args) {
        int[] number_list = {FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, FOURTH_NUMBER, FIFTH_NUMBER};
        ArrayList<Integer> lowest_and_biggest_numbers = new ArrayList<Integer>();
        int biggest = 0;
        int lowest = 0;
        for (int index = 0; index < number_list.length; index++) {
            if (number_list[index] > biggest) {
                biggest = number_list[index];
            }
            if (number_list[index] < lowest) {
                lowest = number_list[index];
            }
        }
        lowest_and_biggest_numbers.add(lowest);
        lowest_and_biggest_numbers.add(biggest);
        System.out.println("Lowest number and Biggest number" + lowest_and_biggest_numbers);

    }
}
