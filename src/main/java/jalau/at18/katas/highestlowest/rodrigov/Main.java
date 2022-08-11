package jalau.at18.katas.highestlowest.rodrigov;
public class Main {
    public static void main(String[] args) {
        final int thirdNumber = -3;
        final int fourthNumber = 4;
        final int fifthNumber = 5;
        int[] numbers = {1, 2, thirdNumber, fourthNumber, fifthNumber};
        int lowestNumber = numbers[0];
        int highestNumber = numbers[0];
        for (int iterator = 0; iterator < numbers.length; iterator++) {
            if (numbers[iterator] <= lowestNumber) {
                lowestNumber = numbers[iterator];
            }
            if (numbers[iterator] >= highestNumber) {
                highestNumber = numbers[iterator];
            }
        }
        System.out.println(highestNumber + " " + lowestNumber);
    }
}