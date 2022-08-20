package jalau.at18.battlecity;

public class Main {
    public static void main(String[] arg) {
        Game game = new GameBattlecity();
        game.startGame();
    }

    public void showMatrix(Board board) {
        Element[][] matrix = board.getMatrix();

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print(matrix[row][column].getImage());
            }
            System.out.println();
        }

    }

}
