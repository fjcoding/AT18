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

    public String[][] movement(char letter, String[][] array) {
        if (letter == 'w') {
            String[][] arr = movement.moveUpGhost(array);
            return arr;
        }
        if (letter == 's') {
            String[][] arr = movement.moveDownGhost(array);
            return arr;
        }
        if (letter == 'a') {
            String[][] arr = movement.moveLeftGhost(array);
            return arr;
        }
        if (letter == 'd') {
            String[][] arr = movement.moveRightGhost(array);
            return arr;
        }
        return array;
    }
}
