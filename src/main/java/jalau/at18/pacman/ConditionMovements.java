package jalau.at18.pacman;

public class ConditionMovements {
    private char letter;
    private static final MovementsPacman MOVEMENT = new MovementsPacman();
    private static final Ghost MOVEMENT_GHOST = new Ghost();

    public void setLetter(char character) {
        this.letter = character;
    }

    public char getLetter() {
        return this.letter;
    }

    public void movement(char character) {
        if (character == 'w') {
            String[][] arr = MOVEMENT.moveUp();
            MOVEMENT_GHOST.ghostMovement(arr);
        }
        if (character == 's') {
            String[][] arr = MOVEMENT.moveDown();
            MOVEMENT_GHOST.ghostMovement(arr);
        }
        if (character == 'a') {
            String[][] arr = MOVEMENT.moveLeft();
            MOVEMENT_GHOST.ghostMovement(arr);
        }
        if (character == 'd') {
            String[][] arr = MOVEMENT.moveRight();
            MOVEMENT_GHOST.ghostMovement(arr);
        }
    }
}
