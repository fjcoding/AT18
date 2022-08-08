package jalau.at18.katas.multiples.alvaro;

public class Main {
    private static final int DIVIDER_THREE = 3;
    private static final int DIVIDER_FIVE = 5;
    public static final int NUMBER_TEST = 10;
    public static void main(String[] args) {

        int added = 0;
        for (int ind = 0; ind < NUMBER_TEST; ind++) {
            if (ind % DIVIDER_THREE == 0 || ind % DIVIDER_FIVE == 0) {
                added = added + ind;
            }
        }
        if (NUMBER_TEST < 0) {
            System.out.println("0");
        } else {
            System.out.println("La suma es: " + added);
        }
    }
}
