package jalau.at18.battlecity;

public class Board {
    private static int[][] board;
    private static int sizeBoard = 26;
    private static int eagleStartPositionX = 24;
    private static int eagleStartPositionY = 12;

    public static void main(String[] args) {
        createTable();
        showBoard();
    }

    public static int[][] createTable() {
        board = new int[sizeBoard][sizeBoard];
        for (int row = 0; row < sizeBoard; row++) {
            for (int colum = 0; colum < sizeBoard; colum++) {
                board[row][colum] = 0;
            }
        }
        drawEagle(eagleStartPositionX, eagleStartPositionY);
        return board;
    }

    public static void showBoard() {
        for (int row = 0; row < sizeBoard; row++) {
            for (int colum = 0; colum < sizeBoard; colum++) {
                if (board[row][colum] == 0) {
                    System.out.print(" " + "\t");
                } else {
                    System.out.print(board[row][colum] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void drawEagle(int xStartPosition, int yStartPosition) {
        board[xStartPosition][yStartPosition] = 9;
        board[xStartPosition + 1][yStartPosition] = 9;
        board[xStartPosition][yStartPosition + 1] = 9;
        board[xStartPosition + 1][yStartPosition + 1] = 9;
    }
}
