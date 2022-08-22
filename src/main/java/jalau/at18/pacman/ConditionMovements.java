package jalau.at18.pacman;

public class ConditionMovements {
    private char letter;
    private static final MovementsPacman MOVEMENT = new MovementsPacman();
    private static final Ghost MOVEMENT_GHOST = new Ghost();

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return this.letter;
    }

    public void movement(char letter) {
        if (letter == 'w') {
            String[][] arr = MOVEMENT.moveUp();
            MOVEMENT_GHOST.ghostMovement(arr);
        }
        if (letter == 's') {
            String[][] arr = MOVEMENT.moveDown();
            MOVEMENT_GHOST.ghostMovement(arr);
        }
        if (letter == 'a') {
            String[][] arr = MOVEMENT.moveLeft();
            MOVEMENT_GHOST.ghostMovement(arr);
        }
        if (letter == 'd') {
            String[][] arr = MOVEMENT.moveRight();
            MOVEMENT_GHOST.ghostMovement(arr);
        }
    }
}
