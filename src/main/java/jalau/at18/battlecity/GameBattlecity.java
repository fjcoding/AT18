package jalau.at18.battlecity;

public class GameBattlecity extends Game {
    public static final int ENEMYS_PER_STAGE = 20;
    public static final int SIZE_ROW_POSITION = 4;

    public static final int GRID_LENGHT = 26;
    public static final int MILLISECONDS = 500;

    private int enemyCount = ENEMYS_PER_STAGE;
    private TankPlayer tankPlayer = new TankPlayer();
    private EnemyTank enemyTank = new EnemyTank(enemyCount);
    private Board board;
    protected Score score = new Score();

    public TankPlayer getTankPlayer() {
        return tankPlayer;
    }

    public EnemyTank getEnemyTank() {
        return enemyTank;
    }

    public Board getBoard() {
        return board;
    }

    public GameBattlecity() {

    }

    public void startGame() {
        this.board = createBoard();
        // TankPlayer tankPlayer = new TankPlayer();
        // EnemyTank enemyTank = new EnemyTank(enemyCount);
        Element[][] elementsMatrix = board.getMatrix();
        int[][] positionPlayer = tankPlayer.initialPosition();
        int[][] positionEnemy = enemyTank.initialPosition();
        elementsMatrix = tankPlayer.putTankOnBoard(elementsMatrix, positionPlayer);
        elementsMatrix = enemyTank.putTankOnBoard(elementsMatrix, positionEnemy);
        showMatrix(board);
    }

    public void playGame() {
        MoveEnemy enemy = new MoveEnemy(board, enemyTank);
        MoveTankPlayer player = new MoveTankPlayer(board, tankPlayer);
        // Element[][] elementsMatrix = board.getMatrix();
        // showMatrix(board);
        // movePlayer();
        // enemyTank.moveEnemy(elementsMatrix);
        enemy.start();
        player.start();
        while (true) {
            showMatrix(board);
            // score.showScore();
            wait(1);
        }

    }

    public void endGame() {

    }

    /*
     * public void movePlayer() {
     * Input direction = new Input();
     * String input = direction.read();
     * Element[][] elementsMatrix = board.getMatrix();
     * //int[][] newPosition = new int[SIZE_ROW_POSITION][2];
     * tankPlayer.cleanPosition(elementsMatrix, tankPlayer.getPosition());
     * int[][] newPosition = tankPlayer.movements(input);
     * elementsMatrix = tankPlayer.putTankOnBoard(elementsMatrix, newPosition);
     * }
     */
    public static Board createBoard() {
        String rute = "stage1.csv";
        Stage stage = new Stage(rute);
        Board board = stage.initBoard();
        return board;
    }

    public static void showMatrix(Board board) {
        Element[][] matrix = board.getMatrix();
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print(matrix[row][column].getImage() + " ");
            }
            System.out.println();
        }
    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * MILLISECONDS);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}