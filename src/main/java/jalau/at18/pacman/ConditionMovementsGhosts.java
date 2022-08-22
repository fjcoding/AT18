package jalau.at18.pacman;

public class ConditionMovementsGhosts {
    private char letter;
    private static final MovementsPacman MOVEMENT = new MovementsPacman();

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return this.letter;
    }

    public void movement(char letter, String[][] array) {
        if (letter == 'w') {
            MOVEMENT.moveUpGhost(array);
        }
        if (letter == 's') {
            MOVEMENT.moveDownGhost(array);
        }
        if (letter == 'a') {
            MOVEMENT.moveLeftGhost(array);
        }
        if (letter == 'd') {
            MOVEMENT.moveRightGhost(array);
        }
    }
}
