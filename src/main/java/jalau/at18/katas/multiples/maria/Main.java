package jalau.at18.katas.multiples.maria;

public class Main {

    public static final int TEST_VALUE = 20;
    public static final int MULTIPLE_3 = 3;
    public static final int MULTIPLE_5 = 5;

    public static void main(String[] args) {
        System.out.println("Value:   " + multiplesTreeFive(TEST_VALUE));
    }

    public static int multiplesTreeFive(int number) {
        int sumMultiples = 0;
        if (number < 0) {
            return 0;
        }
        for (int index = 1; index < number; index++) {
            if (index % MULTIPLE_3 == 0 || index % MULTIPLE_5 == 0) {
                sumMultiples += index;
            }
        }
        return sumMultiples;
    } //function
} //end class
