package jalau.at18.spaceinvaders;

public class AliensList {
    private boolean alienFlag = true;
    private boolean trueFlag = true;
    private boolean falseFlag = false;
    private static final int SIZE_BOARD = 9;
    private Alien alien;
    private Board board;

    public AliensList(Board board) {
        alien = new Alien();
        this.board = board;
    }

    public void moveAlienRigth() {
        alien.alienRigth();
        for (int index = alien.getFirstRowList1().size() - 1; index >= 0; index--) {
            board.setElement(alien.getFirstRowList1().get(index), alien.getFirstRowList2().get(index), '%');
            //board.setElement(alien.getSecondRowList1().get(index), alien.getSecondRowList2().get(index), '%');
            board.setElement(alien.getFirstRowList1().get(index), alien.getFirstRowList2().get(index) - 1, '*');
            //board.setElement(alien.getSecondRowList1().get(index), alien.getSecondRowList2().get(index) - 1, '*');
        }
        for (int index = alien.getFirstRowList1().size() - 1; index >= 0; index--) {
            //board.setElement(alien.getFirstRowList1().get(index), alien.getFirstRowList2().get(index), '%');
            board.setElement(alien.getSecondRowList1().get(index), alien.getSecondRowList2().get(index), '%');
            //board.setElement(alien.getFirstRowList1().get(index), alien.getFirstRowList2().get(index) - 1, '*');
            board.setElement(alien.getSecondRowList1().get(index), alien.getSecondRowList2().get(index) - 1, '*');
        }
    }

    public void moveAlienLeft() {
        alien.alienLeft();
        for (int index = 0; index < alien.getFirstRowList1().size(); index++) {
            board.setElement(alien.getFirstRowList1().get(index), alien.getFirstRowList2().get(index), '%');
            //board.setElement(alien.getSecondRowList1().get(index), alien.getSecondRowList2().get(index), '%');
            board.setElement(alien.getFirstRowList1().get(index), alien.getFirstRowList2().get(index) + 1, '*');
            //board.setElement(alien.getSecondRowList1().get(index), alien.getSecondRowList2().get(index) + 1, '*');
        }
        for (int index = 0; index < alien.getFirstRowList1().size(); index++) {
            //board.setElement(alien.getFirstRowList1().get(index), alien.getFirstRowList2().get(index), '%');
            board.setElement(alien.getSecondRowList1().get(index), alien.getSecondRowList2().get(index), '%');
            //board.setElement(alien.getFirstRowList1().get(index), alien.getFirstRowList2().get(index) + 1, '*');
            board.setElement(alien.getSecondRowList1().get(index), alien.getSecondRowList2().get(index) + 1, '*');
        }
    }

    public void moveAlienDown() {
        alien.alienDown();
        for (int index = 0; index < alien.getFirstRowList2().size(); index++) {
            board.setElement(alien.getFirstRowList1().get(index), alien.getFirstRowList2().get(index), '%');
            //board.setElement(alien.getSecondRowList1().get(index), alien.getSecondRowList2().get(index), '%');
            board.setElement(alien.getFirstRowList1().get(index) - 1, alien.getFirstRowList2().get(index), '*');
        }
        for (int index = 0; index < alien.getFirstRowList2().size(); index++) {
            //board.setElement(alien.getFirstRowList1().get(index), alien.getFirstRowList2().get(index), '%');
            board.setElement(alien.getSecondRowList1().get(index), alien.getSecondRowList2().get(index), '%');
            //board.setElement(alien.getFirstRowList1().get(index) - 1, alien.getFirstRowList2().get(index), '*');
        }
    }

    public void alienMovement() {

        if (alienFlag == trueFlag && alien.getFirstRowList2().get(alien.getFirstRowList1().size() - 1) <= SIZE_BOARD) {
            moveAlienRigth();
            if (alien.getFirstRowList2().get(alien.getFirstRowList1().size() - 1) == SIZE_BOARD) {
                moveAlienDown();
                alienFlag = false;
            }
        } else if (alienFlag == falseFlag || alien.getFirstRowList2().get(0) == 0) {
            moveAlienLeft();
            if (alien.getFirstRowList2().get(0) == 0) {
                moveAlienDown();
                alienFlag = true;
            }
        }
    }

    public void matarAlgo() {
        alien.getFirstRowList1().remove(0);
        alien.getFirstRowList2().remove(2);

        alien.getSecondRowList1().remove(0);      
        alien.getSecondRowList2().remove(1);
    }
}