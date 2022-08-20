package jalau.at18.spaceinvaders;

public class AliensList {
    private boolean alienFlag = true;
    private boolean trueFlag = true;
    private boolean falseFlag = false;
    private static final int LIMIT_ROW = 4;
    private static final int SIZE_BOARD = 9;

    private Alien alien;
    private Board board;

    public AliensList(Board board) {
        alien = new Alien();
        this.board = board;
    }
    public void moveAlienRigth() {
        alien.alienRigth();
        for (int row = LIMIT_ROW - 1; row >= 0; row--) {
            for (int column = 0; column < 2; column++) {
                board.setElement(alien.getPosY()[column], alien.getPosX()[row], '%');
                System.out.println(board.toString());
                board.setElement(alien.getPosY()[column], alien.getPosX()[row] - 1, '*');
            }
        }
    }

    public void moveAlienLeft() {
        alien.alienLeft();
        for (int row = 0; row < LIMIT_ROW; row++) {
            for (int column = 0; column < 2; column++) {
                board.setElement(alien.getPosY()[column], alien.getPosX()[row], '%');
                System.out.println(board.toString());
                board.setElement(alien.getPosY()[column], alien.getPosX()[row] + 1, '*');
            }
        }
    }

    public void moveAlienDown() {
        alien.alienDown();
        for (int row = 0; row < LIMIT_ROW; row++) {
            for (int column = 0; column < 2; column++) {
                board.setElement(alien.getPosY()[column], alien.getPosX()[row], '%');
                System.out.println(board.toString());
                if (column == 1) {
                    board.setElement(alien.getPosY()[column] - 2, alien.getPosX()[row], '*');
                }
            }
        }
    }

    public void alienMovement() {
        if (alienFlag == trueFlag && alien.getPosX()[LIMIT_ROW - 1] <= SIZE_BOARD) {
            moveAlienRigth();
            if (alien.getPosX()[LIMIT_ROW - 1] == SIZE_BOARD) {
                moveAlienDown();
                alienFlag = false;
            }
        } else if (alienFlag == falseFlag || alien.getPosX()[0] == 0) {
            moveAlienLeft();
            if (alien.getPosX()[0] == 0) {
                moveAlienDown();
                alienFlag = true;
            }
        }
    }
}
