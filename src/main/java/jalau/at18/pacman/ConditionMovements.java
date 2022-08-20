package jalau.at18.pacman;

public class ConditionMovements {
    private char letter;
    MovementsPacman movement = new MovementsPacman();
    Ghost movementGhost = new Ghost();

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return this.letter;
    }

    public void movement(char letter) {
        if (letter == 'w') {
            String[][] arr = movement.moveUp();
            movementGhost.ghostMovement(arr);
        }
        if (letter == 's') {
            String[][] arr = movement.moveDown();
            movementGhost.ghostMovement(arr);
        }
        if (letter == 'a') {
            String[][] arr = movement.moveLeft();
            movementGhost.ghostMovement(arr);
        }
        if (letter == 'd') {
            String[][] arr = movement.moveRight();
            movementGhost.ghostMovement(arr);
        }
    }
}
