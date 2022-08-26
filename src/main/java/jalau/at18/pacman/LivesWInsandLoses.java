package jalau.at18.pacman;

public class LivesWInsandLoses {
    public static final int X_BORDER = 25;
    public static final int Y_BORDER = 29;
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

    public boolean LostALive(int lives) {
        if (lives > 0) {
            return false;
        } else {
            System.out.println("You have lost the game");
            return true;
        }
    }
}
