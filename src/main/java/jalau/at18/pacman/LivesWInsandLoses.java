package jalau.at18.pacman;

public class LivesWInsandLoses {
    public static final int X_BORDER = 25;
    public static final int Y_BORDER = 29;
    private static final int TWO = 2;
    private static final int ONE = 1;
    private static final int ZERO = 0;
    private static final int MINUSONE = -1;


    int counter = 0;

    public boolean isWinner(String[][] newboardarr, int row, int column) {
        // int counter = 0;
        for (int rows = 0; rows < X_BORDER; rows++) {
            for (int colums = 0; colums < Y_BORDER; colums++) {
                if (newboardarr[row][column] == "·") {
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("You have won the game, Congratulations!");
            return true;
        }
        return false;
    }

    public int gameOver(int myInt) {
        int totallives = myInt;
        switch (totallives) {
            case TWO:
                System.out.println("@ @ ");
                break;
            case ONE:
                System.out.println("@ ");
                break;
            case ZERO:
                System.out.println(" ");
                break;
            case MINUSONE:
                System.out.println("GAMEOVER");
                System.exit(0);
            default:
                System.out.println("Keep playing");
        }
        return totallives;
    }
}
