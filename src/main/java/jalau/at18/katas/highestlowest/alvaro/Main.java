package jalau.at18.katas.highestlowest.alvaro;

public class Main {

    public static void main(String[] args) {
        String inputNumbers = "1 2 3 4 -5 200 -500";
        int[] num;
        Main main = new Main();
        num = main.split(inputNumbers);
        main.compareGetHighestNumber(num);
        main.compareGetLowestNumber(num);


    }
    public int[] split(String inputNumbers) {
        int[] num;
        String[] split = inputNumbers.split(" ");
        num = new int[split.length];
        for (int ind = 0; ind < split.length; ind++) {
            num[ind] = Integer.parseInt(split[ind]);
        }
        return num;

    }
    public int compareGetHighestNumber(int[]split) {
        int max = 0;
        for (int ind = 0; ind < split.length; ind++) {
            if (split[ind] > max) {
                max = split[ind];

            }
        }
        System.out.println("The highest number: " + max);
        return max;

    }
    public int compareGetLowestNumber(int[]split) {
        int min = split[0];
        for (int ind = 0; ind < split.length; ind++) {
            if (split[ind] < min) {
                min = split[ind];
            }
        }
        System.out.println("The lowest number: " + min);
        return min;
    }
}