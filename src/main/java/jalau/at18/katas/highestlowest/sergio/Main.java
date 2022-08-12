package jalau.at18.katas.highestlowest.sergio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] input = new String[] {"1", "2", "3"};
        int[] highestandLowest = highestLowest(input);
        System.out.println(highestandLowest[0] + " " + highestandLowest[1]);
    }

    public static int[] highestLowest(String[] input) {
        int[] values = Arrays.stream(input)
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = values[0];
        int min = values[0];
        for (int number : values) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        int[] result = new int[] {max, min};
        return result;
    }

}