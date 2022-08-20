package jalau.at18.battlecity;

public class GameBattlecity extends Game {
    public GameBattlecity() {

    }

    public void startGame() {
        Board board = createBoard();
        TankPlayer tankPlayer = new TankPlayer();
        Element[][] elementsMatrix = board.getMatrix();
        int[][] position = tankPlayer.initialPosition();
        elementsMatrix = tankPlayer.putTankOnBoard(elementsMatrix, position);
        showMatrix(board);
        tankPlayer.shoot();
    }
    public void playGame() {

    }
    public void endGame() {

    }
    public static Board createBoard() {
        String rute = "src\\main\\java\\jalau\\at18\\battlecity\\stage1.csv";
        Stage stage = new Stage(rute);
        Board board = stage.initBoard();
        return board;
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
}