package jalau.at18.pacman;

import java.util.List;

public class Ghost {
    public static final int INDEX_TRY = 5;
    public static final int FOUR_MOVEMENTS = 4;
    public static final int GHOST_SLEEP_TIME = 1000;
    public static final String GHOST_REPRESENTATION = "G";
    private static final char[] GHOST_MOVEMENTS = {'w', 'a', 's', 'd' };
    private static final ConditionMovementsGhosts MOVEMENTS = new ConditionMovementsGhosts();
    private int random;

    public List<Object> ghostMovement(String[][] array, int rowGhost, int columnsGhost) {
        random = (int) (Math.random() * FOUR_MOVEMENTS);
        List<Object> arrGhost = MOVEMENTS.movement(GHOST_MOVEMENTS[random], array, rowGhost, columnsGhost);
        return arrGhost;
    }
}
