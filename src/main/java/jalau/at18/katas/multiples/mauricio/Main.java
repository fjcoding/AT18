package jalau.at18.katas.multiples.mauricio;

public class Main {
    private static final int MULTIPLE_THREE = 3;
    private static final int MULTIPLE_FIVE = 5;
    private static final int INPUT_NUMBER = 20;

    public static void main(String[] args) {
        int inputNumber = INPUT_NUMBER;
        int outputNumber = sumOfMultiplesThreeOrFive(inputNumber);
        System.out.println("The sum of the multiples of 3 and 5 below the input number is: " + outputNumber);
    }

    static Integer sumOfMultiplesThreeOrFive(int inputNumber) {
        int outputNumber = 0;
        if (inputNumber <= 0) {
            outputNumber = 0;
            System.out.println("We have 0 or less as an input number, hence the output is: " + outputNumber);
            return outputNumber;
        } else {
            for (int index = 1; index < inputNumber; index++) {
                if (index % MULTIPLE_THREE == 0 || index % MULTIPLE_FIVE == 0) {
                    outputNumber = outputNumber + index;
                }
            }
            return outputNumber;
        }

    }
}
