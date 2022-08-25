package jalau.at18.pacman;

import java.util.List;

public class Ghost {
    public static final int INDEX_TRY = 5;
    public static final int FOUR_MOVEMENTS = 4;
    public static final int GHOST_SLEEP_TIME = 1000;
    private static final char[] GHOST_MOVEMENTS = {'w', 'a', 's', 'd'};
    private static final ConditionMovementsGhosts MOVEMENTS = new ConditionMovementsGhosts();
    private int random;
    private int xPosition;
    private int yPosition;
    private String representation;

    public void setXposition(int newXPosition) {
        this.xPosition = newXPosition;
    }
    public int getXposition() {
        return this.xPosition;
    }
    public void setYposition(int newYPosition) {
        this.yPosition = newYPosition;
    }
    public int getYposition() {
        return this.yPosition;
    }
    public void setRepresentation(String representationToSet) {
        this.representation = representationToSet;
    }
    public String getRepresentation() {
        return this.representation;
    }


    public List<Object> ghostMovement(String[][] array, int rowGhost, int columnsGhost) {
        random = (int) (Math.random() * FOUR_MOVEMENTS);
        List<Object> arrGhost = MOVEMENTS.movement(GHOST_MOVEMENTS[random], array, rowGhost, columnsGhost);
        return arrGhost;
    }
}
