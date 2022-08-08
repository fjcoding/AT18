package jalau.at18.katas.multiples.mauricio;

public class Main {
    private static final int MULTIPLE_THREE = 3;
    private static final int MULTIPLE_FIVE = 5;
    private static final int INPUT_NUMBER = 20;

    public static void main(String[] args) {
        int input_number = INPUT_NUMBER;
        int output_number = 0;
        if (input_number <= 0) {
            output_number = 0;
            System.out.println("We have 0 or less as an input number, hence the output is: " + output_number);
        } else {
            for (int index = 1; index < input_number; index++) {
                if (index % MULTIPLE_THREE == 0 || index % MULTIPLE_FIVE == 0) {
                    output_number = output_number + index;
                }
            }
            System.out.println("The sum of the multiples of 3 and 5 below the input number is: " + output_number);
        }

    }
}
