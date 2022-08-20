package jalau.at18.battlecity;

public class GameBattlecity extends Game {
    public int enemyCount = 20;
    private TankPlayer tankPlayer = new TankPlayer();
    public static final int SIZE_ROW_POSITION = 4;

    public GameBattlecity() {

    }

    public void startGame() {
        Board board = createBoard();
        TankPlayer tankPlayer = new TankPlayer();
        EnemyTank enemyTank = new EnemyTank(enemyCount);
        Element[][] elementsMatrix = board.getMatrix();
        int[][] positionPlayer = tankPlayer.initialPosition();
        int[][] positionEnemy = enemyTank.initialPosition();
        elementsMatrix = tankPlayer.putTankOnBoard(elementsMatrix, positionPlayer);
        elementsMatrix = enemyTank.putTankOnBoard(elementsMatrix, positionEnemy);
        showMatrix(board);
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