package jalau.at18.katas.multiples.mauricio;

public class Main {
    public static void main(String[] args) {
        int input_number = 20;
        int output_number = 0;
        if (input_number <= 0) {
            output_number = 0;
            System.out.println("We have 0 or less as an input number, hence the output is: " + output_number);
        } else {
            for (int i = 1; i < input_number; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    output_number = output_number + i;
                }
            }
            System.out.println("The sum of the multiples of 3 and 5 below the input number is: " + output_number);
        }

    }
}
