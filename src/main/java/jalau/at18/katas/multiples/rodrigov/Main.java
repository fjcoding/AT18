package jalau.at18.katas.multiples.rodrigov;
public class Main {
    public static void main(String[] args) {
        final int limitNumber = 10;
        System.out.println(new Main().multiplesThreeAndFive(limitNumber));
    }
    public int multiplesThreeAndFive(int limitNumber) {
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
            return 0;
        } else {
            return count;
        }
    }
}