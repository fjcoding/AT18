package jalau.at18.pacman;

public class EatGhosts {
    public Boolean eatGhostTrue(String[][] board, int row, int column) {
        if (board[row][column] == "\033[31mG\u001B[0m") {
            return true;
        }
        return false;
    }

    public String[][] eatGhost(String[][] board, int row, int column) {
        board[row][column] = " ";
        row = 14;
        column = 10;
        board[row][column] = "\033[31mG\u001B[0m";
        return board;
    }
}
