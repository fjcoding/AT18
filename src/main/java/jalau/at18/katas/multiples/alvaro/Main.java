package jalau.at18.katas.multiples.alvaro;

public class Main {
    private static final int DIVIDER_THREE = 3;
    private static final int DIVIDER_FIVE = 5;
    public static final int NUMBER_TEST = 10;
    public static void main(String[] args) {
        int added;
        Main main = new Main();
        if (main.numberValid(NUMBER_TEST)) {
            added = main.added(NUMBER_TEST);
            System.out.println("The Added is " + added);
        }


    }
    public boolean numberValid(int numberTest) {
        if (numberTest < 0) {
            System.out.println("0");
            return false;
        } else {
            return true;

        }
    }
    public int added(int numberTest) {

        int added = 0;
        for (int ind = 0; ind < numberTest; ind++) {
            if (ind % DIVIDER_THREE == 0 || ind % DIVIDER_FIVE == 0) {
                added = added + ind;
            }
        }

        return added;
    }
}
