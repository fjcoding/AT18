package jalau.at18.pacman;

public class Move {

    private char letter;
    private static final MovementsPacman MOVEMENT = new MovementsPacman();
    
  
    public void setLetter(char character) {
        this.letter = character;
    }

    public char getLetter() {
        return this.letter;
    }

        if (character == 'w') {
            String[][] arr = MOVEMENT.moveUp();
        }
        if (character == 's') {
            String[][] arr = MOVEMENT.moveDown();
        }
        if (character == 'a') {
            String[][] arr = MOVEMENT.moveLeft();
        }
        if (character == 'd') {
            String[][] arr = MOVEMENT.moveRight();
        }
   

}
