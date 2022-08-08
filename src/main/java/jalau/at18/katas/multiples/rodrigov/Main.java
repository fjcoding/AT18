package jalau.at18.katas.multiples.rodrigov;
public class Main {
    public static void main(String[] args) {
        final int limitNumber = 10;
        final int three = 3;
        final int five = 5;
        int count = 0;
        for (int iterator = 1; iterator < limitNumber; iterator++) {
            if (iterator % three == 0 || iterator % five == 0) {
                count += iterator;
                System.out.println(iterator);
            }
        }
        if (count < 0) {
            count = 0;
        } else {
            System.out.println(count);
        }
    }
}