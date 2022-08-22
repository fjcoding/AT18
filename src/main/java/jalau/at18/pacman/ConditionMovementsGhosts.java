package jalau.at18.pacman;

public class ConditionMovementsGhosts {
    private char letter;
    private static final MovementsPacman MOVEMENT = new MovementsPacman();

    public void setLetter(char character) {
        this.letter = character;
    }

    public char getLetter() {
        return this.letter;
    }

    public void movement(char character, String[][] array) {
        if (character == 'w') {
            MOVEMENT.moveUpGhost(array);
        }
        if (character == 's') {
            MOVEMENT.moveDownGhost(array);
        }
        if (character == 'a') {
            MOVEMENT.moveLeftGhost(array);
        }
        if (character == 'd') {
            MOVEMENT.moveRightGhost(array);
        }
    }
}
