package jalau.at18.battlecity;

public class GameBattlecity extends Game {
    private TankPlayer tankPlayer = new TankPlayer();
    public static final int SIZE_ROW_POSITION = 4;

    public GameBattlecity() {

    }

    public void startGame() {
        Board board = createBoard();
        Element[][] elementsMatrix = board.getMatrix();
        int[][] position = tankPlayer.getPosition();
        elementsMatrix = tankPlayer.putTankOnBoard(elementsMatrix, position);
        showMatrix(board);
        tankPlayer.shoot();
    }
    public void playGame() {
        Board board = createBoard();
        Input direction = new Input();
        String input = direction.read();
        int[][] newPosition = new int[SIZE_ROW_POSITION][2];
        newPosition = tankPlayer.movements(input);
        Element[][] elementsMatrix = board.getMatrix();
        elementsMatrix = tankPlayer.putTankOnBoard(elementsMatrix, newPosition);
        showMatrix(board);
    }
    public void endGame() {

    }
    public static Board createBoard() {
        String rute = "stage1.csv";
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