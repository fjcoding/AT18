package jalau.at18.katas.multiples.maria;

public class Main {
    public static void main(String[] args) {
        System.out.println("Value:   " + multiplesTreeFive(20));
    }

    public static int multiplesTreeFive(int number) {
        int sumMultiples = 0;
        if (number < 0) {
            return 0;
        }

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sumMultiples += i;
            }
        }

        return sumMultiples;
    }//function
}//end class
