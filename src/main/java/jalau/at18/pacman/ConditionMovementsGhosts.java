package jalau.at18.pacman;

public class ConditionMovementsGhosts {
    private char letter;
    MovementsPacman movement = new MovementsPacman();

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return this.letter;
    }

    public void movement(char letter, String[][] array) {
        if (letter == 'w') {
            movement.moveUpGhost(array);
        }
        if (letter == 's') {
            movement.moveDownGhost(array);
        }
        if (letter == 'a') {
            movement.moveLeftGhost(array);
        }
        if (letter == 'd') {
            movement.moveRightGhost(array);
        }
    }
}
