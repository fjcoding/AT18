package jalau.at18.battlecity;

public class Main {
    public static void main(String[] arg) {
        Game game = new GameBattlecity();
        game.startGame();
        while (true) {
            game.playGame();
        }
        //showMatrix(board);
    }

    public static void showMatrix(Board board) {
        Brick brick = new Brick();
        Steel steel = new Steel();
        Bushes bushes = new Bushes();

        Element[][] matrix = board.getMatrix();

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print(matrix[row][column].getImage() + " ");
            }
            System.out.println();
        }

    }

    /*public static Board createBoard() {
        Stage stage = new Stage("C:\\Users\\RODRIGO\\AT18\\src\\main\\java\\jalau\\at18\\battlecity\\stage1.csv");
        Board board = stage.initBoard();
        return board;
    }*/

}
