package jalau.at18.pacman;

import java.util.List;

public class ConditionMovements {
    private char letter;
    private static final MovementsPacman MOVEMENT = new MovementsPacman();
    private static final Ghost MOVEMENT_GHOST = new Ghost();
    private List<Object> listGhost;

    public void setLetter(char character) {
        this.letter = character;
    }

    public char getLetter() {
        return this.letter;
    }

    public List<Object> movement(char character, int rowGhost, int columnsGhost) {
        if (character == 'w') {
            String[][] arr = MOVEMENT.moveUp();
            listGhost = MOVEMENT_GHOST.ghostMovement(arr, rowGhost, columnsGhost);
        }
        if (character == 's') {
            String[][] arr = MOVEMENT.moveDown();
            listGhost = MOVEMENT_GHOST.ghostMovement(arr, rowGhost, columnsGhost);
        }
        if (character == 'a') {
            String[][] arr = MOVEMENT.moveLeft();
            listGhost = MOVEMENT_GHOST.ghostMovement(arr, rowGhost, columnsGhost);
        }
        if (character == 'd') {
            String[][] arr = MOVEMENT.moveRight();
            listGhost = MOVEMENT_GHOST.ghostMovement(arr, rowGhost, columnsGhost);
        }
        return listGhost;
    }
}
