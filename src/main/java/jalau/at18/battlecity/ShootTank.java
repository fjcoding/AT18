package jalau.at18.battlecity;

public class ShootTank extends Thread {
    private Missile missile = new Missile();
    private int[][] position;
    private String direction;
    private Element[][] matrix;
    private boolean exitThread;
    private static final int TIME = 500;

    public ShootTank(int[][] position, String direction, Element[][] matrix) {
        this.position = position;
        this.direction = direction;
        this.matrix = matrix;
        missile.setDirection(direction);
        missile.setPosition(position[0][0], position[0][1], position[1][0], position[1][1]);
        missile.setBoard(matrix);
        exitThread = false;
    }

    @Override
    public void run() {
        while (!exitThread) {
            missile.removeMissilefromBoard(matrix, missile.getPosition());
            if (!missile.getIsCollition()) {
                //System.out.println("No collition");
                if (missile.isMissilCrash()) {
                    //System.out.println("Missile crash");
                    //missile.missileDirection();
                    matrix = missile.removeMissilefromBoard(matrix, missile.getPosition());
                    stopThread();
                } else {
                    missile.missileDirection();
                    matrix = missile.putMissileOnBoard(matrix, missile.getPosition());
                }
            } else {
                //System.out.println("Collition");
                missile.setIsCollition(false);
                matrix = missile.removeMissilefromBoard(matrix, missile.getPosition());
                stopThread();
            }
            try {
                ShootTank.sleep(TIME);
            } catch (InterruptedException e) {
                System.out.print(e);
            }

        }

    }

    public void stopThread(){
        exitThread = true;
    }

}
