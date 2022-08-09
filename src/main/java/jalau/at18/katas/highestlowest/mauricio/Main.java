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
        ArrayList<Integer> lowestAndBiggestNumbers = phoneNumber(number_list);
        System.out.println("Lowest number and Biggest number" + lowestAndBiggestNumbers);

    }

    static ArrayList<Integer> phoneNumber(int[] numberList) {
        ArrayList<Integer> lowestAndBiggestNumbers = new ArrayList<>();
        int biggest = 0;
        int lowest = 0;
        for (int index = 0; index < numberList.length; index++) {
            if (numberList[index] > biggest) {
                biggest = numberList[index];
            }
            if (numberList[index] < lowest) {
                lowest = numberList[index];
            }
        }
        lowestAndBiggestNumbers.add(lowest);
        lowestAndBiggestNumbers.add(biggest);
        return lowestAndBiggestNumbers;
    }
}
