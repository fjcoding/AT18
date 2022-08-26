package jalau.at18.battlecity;

public class GameBattlecity extends Game {
    public static final int ENEMYS_PER_STAGE = 20;
    public static final int SIZE_ROW_POSITION = 4;

    public static final int GRID_LENGHT = 26;
    public static final int MILLISECONDS = 500;

    private int enemyCount = ENEMYS_PER_STAGE;
    private TankPlayer tankPlayer = new TankPlayer();
    private EnemyTank enemyTank1 = new EnemyTank(enemyCount);
    private EnemyTank enemyTank2 = new EnemyTank(enemyCount - 1);
    private EnemyTank enemyTank3 = new EnemyTank(enemyCount - 2);
    private Board board;
    public boolean win = false;
    private int countDefectedEnemy = 0;
    protected Score score = new Score();

    public TankPlayer getTankPlayer() {
        return tankPlayer;
    }

    public EnemyTank getEnemyTank() {
        return enemyTank1;
    }

    public Board getBoard() {
        return board;
    }

    public GameBattlecity() {

    }

    public void startGame() {
        this.board = createBoard();
        Element[][] elementsMatrix = board.getMatrix();
        int[][] positionPlayer = tankPlayer.initialPosition();
        int[][] positionEnemy1 = enemyTank1.initialPosition();
        int[][] positionEnemy2 = enemyTank2.initialPosition();
        int[][] positionEnemy3 = enemyTank3.initialPosition();
        elementsMatrix = tankPlayer.putTankOnBoard(elementsMatrix, positionPlayer);
        elementsMatrix = enemyTank1.putTankOnBoard(elementsMatrix, positionEnemy1);
        showMatrix(board);
    }

    public void playGame() {
        MoveEnemy enemy1 = new MoveEnemy(board, enemyTank1);
        MoveEnemy enemy2 = new MoveEnemy(board, enemyTank2);
        MoveEnemy enemy3 = new MoveEnemy(board, enemyTank3);
        MoveTankPlayer player = new MoveTankPlayer(board, tankPlayer);
        enemy1.start();
        player.start();
        enemy2.start();
        enemy3.start();
        while (countDefectedEnemy < 3) {
            int[][] enemyPosition1 = enemyTank1.getPosition();
            if (!thereAreEnemyTank(enemyPosition1)) {
                if (enemy1.getIsEnemyCreated()){
                    enemy1.stopThread();
                    score.incrementScore();
                    countDefectedEnemy++;
                    enemy1.setIsEnemyCreated(false);
                }
            }
            int[][] enemyPosition2 = enemyTank2.getPosition();
            if (!thereAreEnemyTank(enemyPosition2)) {
                if (enemy2.getIsEnemyCreated()){
                    enemy2.stopThread();
                    score.incrementScore();
                    countDefectedEnemy++;
                    enemy2.setIsEnemyCreated(false);
                }
            }
            int[][] enemyPosition3 = enemyTank3.getPosition();
            if (!thereAreEnemyTank(enemyPosition3)) {
                if (enemy3.getIsEnemyCreated()){
                    enemy3.stopThread();
                    score.incrementScore();
                    countDefectedEnemy++;
                    enemy3.setIsEnemyCreated(false);
                }
            }
            showMatrix(board);
            score.showScore();
            wait(1);
            //System.out.print("\033[H\033[2J");
            //System.out.flush();
        }
        System.out.print("You Win !!!");
    }

    public boolean thereAreEnemyTank(int[][] position) {
        Element[][] matrix = board.getMatrix();
        boolean thereAreEnemyTank = true;
        ElementType condition1 = matrix[position[0][0]][position[0][1]].getType();
        ElementType condition2 = matrix[position[1][0]][position[1][1]].getType();
        ElementType condition3 = matrix[position[2][0]][position[0][1]].getType();
        ElementType condition4 = matrix[position[3][0]][position[3][1]].getType();
        if (condition1 == ElementType.EMPTY || condition2 == ElementType.EMPTY || condition3 == ElementType.EMPTY || condition4 == ElementType.EMPTY) {
            thereAreEnemyTank = false;
        }
        return thereAreEnemyTank;
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