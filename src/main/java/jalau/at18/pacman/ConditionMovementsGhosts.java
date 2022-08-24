package jalau.at18.pacman;

import java.util.List;

public class ConditionMovementsGhosts {
    private char letter;
    private static final MovementsPacman MOVEMENT = new MovementsPacman();
    private List<Object> listMovements;

    public void setLetter(char character) {
        this.letter = character;
    }

    public char getLetter() {
        return this.letter;
    }

    public List<Object> movement(char character, String[][] array, int rowGhost, int columnsGhost) {
        if (character == 'w') {
            listMovements = MOVEMENT.moveUpGhost(array, rowGhost, columnsGhost);
        }
        if (character == 's') {
            listMovements = MOVEMENT.moveDownGhost(array, rowGhost, columnsGhost);
        }
        if (character == 'a') {
            listMovements = MOVEMENT.moveLeftGhost(array, rowGhost, columnsGhost);
        }
        if (character == 'd') {
            listMovements = MOVEMENT.moveRightGhost(array, rowGhost, columnsGhost);
        }
        return listMovements;
    }
}
