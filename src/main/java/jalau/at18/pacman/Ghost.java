package jalau.at18.pacman;

public class Ghost {
    public static final String GHOST_CHAR = "\033[31mG\u001B[0m";
    public static final int INDEX_TRY = 5;
    public static final int FOUR_MOVEMENTS = 4;
    public static final int GHOST_SLEEP_TIME = 1000;
    private boolean isBlue = false;
    private String ghostRepresentation = GHOST_CHAR;
    private int[] position;
    private static final char[] GHOST_MOVEMENTS = {'w', 'a', 's', 'd'}; //public
    private static final ConditionMovementsGhosts MOVEMENTS = new ConditionMovementsGhosts();
    private int random;

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

    public void ghostMovement(String[][] array) {
        random = (int) (Math.random() * FOUR_MOVEMENTS);
        MOVEMENTS.movement(GHOST_MOVEMENTS[random], array);
    }
}
