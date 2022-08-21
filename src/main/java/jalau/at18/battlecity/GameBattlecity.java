package jalau.at18.battlecity;

public class GameBattlecity extends Game {
    public int enemyCount = 20;
    private TankPlayer tankPlayer = new TankPlayer();
    public EnemyTank enemyTank = new EnemyTank(enemyCount);
    public static final int SIZE_ROW_POSITION = 4;
    public Board board;
    public GameBattlecity() {
    
    }

    public void startGame() {
        this.board = createBoard();
        //TankPlayer tankPlayer = new TankPlayer();
        //EnemyTank enemyTank = new EnemyTank(enemyCount);
        Element[][] elementsMatrix = board.getMatrix();
        int[][] positionPlayer = tankPlayer.initialPosition();
        int[][] positionEnemy = enemyTank.initialPosition();
        elementsMatrix = tankPlayer.putTankOnBoard(elementsMatrix, positionPlayer);
        elementsMatrix = enemyTank.putTankOnBoard(elementsMatrix, positionEnemy);
        showMatrix(board);
    }
    public void playGame() {
        //Board board = createBoard();
        //Input direction = new Input();
        //String input = direction.read();
        //int[][] newPosition = new int[SIZE_ROW_POSITION][2];
        //newPosition = tankPlayer.movements(input);
        //Element[][] elementsMatrix = board.getMatrix();
        //elementsMatrix = tankPlayer.putTankOnBoard(elementsMatrix, newPosition);
        moveEnemy();
        
    }
    public void endGame() {

    }
    public void moveEnemy() {
        for (int movementCount = 0; movementCount < 10; movementCount++) {
            Element[][] elementsMatrix = board.getMatrix();
            enemyTank.goStraight();
            System.out.println(enemyTank.getDirection());
            elementsMatrix = enemyTank.putTankOnBoard(elementsMatrix, enemyTank.getPosition());
            showMatrix(board);
            wait(1);
        }
        enemyTank.setDirection();     
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
    public static void wait(int seconds){
        try {
            Thread.sleep(seconds * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    }
}