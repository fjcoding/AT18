package jalau.at18.pacman;

public class Ghost {
    public static final String GHOST_CHAR = "\033[31mG\u001B[0m";
    public static final int INDEX_TRY = 5;
    public static final int GHOST_SLEEP_TIME = 1000;
    private boolean isBlue = false;
    private String ghostRepresentation = GHOST_CHAR;
    private int[] position;

    ConditionMovementsGhosts movements = new ConditionMovementsGhosts();
    public int random;
    public char w;
    public char a;
    public char s;
    public char d;
    public static char[] ghostMovements = { 'w', 'a', 's', 'd' };

    public void setIsBlue(Boolean blue) {
        this.isBlue = blue;
    }

    public boolean getIsBlue() {
        return this.isBlue;
    }

    public void setPosition(int[] ghostPosition) {
        this.position = ghostPosition;
    }

    public int[] getPosition() {
        return this.position;
    }

    public String getRepresentation() {
        return this.ghostRepresentation;
    }

    public void startGhostMovement() {
        int index = 0;
        while (index < INDEX_TRY) {
            System.out.println("skere");
            longRunningMethod();
            index++;
        }
    }

    public static void longRunningMethod() {
        try {
            Thread.sleep(GHOST_SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String[][] ghostMovement(String[][] array) {
        random = (int) (Math.random() * 4);
        String[][] arr_ghost = movements.movement(ghostMovements[random], array);
        return arr_ghost;
    }

}
