package jalau.at18.battlecity;

public class MoveMissile extends Thread {
    private String letter = "";
    private Missile missile;
    private Board board;
    private static final int TIME = 1000;

    public MoveMissile(Board board, Missile missile) {
        this.board = board;
        this.missile = missile;
    }

    @Override
    public void run() {
        while (true) {
            Element[][] matrix = board.getMatrix();
            //matrix = missile.moveMissile(matrix);
            board.setMatrix(matrix);
            try {
                MoveEnemy.sleep(TIME);
            } catch (InterruptedException e) {
                System.out.print(e);
            }
        }


    }
}
