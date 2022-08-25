package jalau.at18.spaceinvaders;

import java.util.ArrayList;

public class Alien {
    private final ArrayList<Integer> alienFirstRow1 = new ArrayList<Integer>();
    private final ArrayList<Integer> alienFirstRow2 = new ArrayList<Integer>();
    private final ArrayList<Integer> alienSecondRow1 = new ArrayList<Integer>();
    private final ArrayList<Integer> alienSecondRow2 = new ArrayList<Integer>();
    private final int lastAlien = 3;
    private final char simbol;
    final boolean stillAlive;
    private boolean alienFlag = true;
    private boolean trueFlag = true;
    private boolean falseFlag = false;
    private static final int SIZE_BOARD = 9;

    public Alien() {
        simbol = '%';
        stillAlive = true;
        alienFirstRow1.add(0);
        alienFirstRow1.add(0);
        alienFirstRow1.add(0);
        alienFirstRow1.add(0);
        alienFirstRow2.add(0);
        alienFirstRow2.add(1);
        alienFirstRow2.add(2);
        alienFirstRow2.add(lastAlien);


        alienSecondRow1.add(1);
        alienSecondRow1.add(1);
        alienSecondRow1.add(1);
        alienSecondRow1.add(1);
        alienSecondRow2.add(0);
        alienSecondRow2.add(1);
        alienSecondRow2.add(2);
        alienSecondRow2.add(lastAlien);
    }

    public ArrayList<Integer> getFirstRowList1() {
        return alienFirstRow1;
    }
    public ArrayList<Integer> getFirstRowList2() {
        return alienFirstRow2;
    }
    public ArrayList<Integer> getSecondRowList1() {
        return alienSecondRow1;
    }
    public ArrayList<Integer> getSecondRowList2() {
        return alienSecondRow2;
    }

    public char getSimbol() {
        return simbol;
    }

    public boolean exist(int posX, int posY) {
        boolean existResponse = false;
        for (int index = 0; index < alienFirstRow1.size(); index++) {
            if (alienFirstRow1.get(index) == posX && alienFirstRow2.get(index) == posY) {
                existResponse = true;
            }
        }
        for (int index = 0; index < alienSecondRow1.size(); index++) {
            if (alienSecondRow1.get(index) == posX && alienSecondRow2.get(index) == posY) {
                existResponse = true;
            }
        }
        return existResponse;
    }

    public void alienLeft() {
        for (int row = 0; row < alienFirstRow2.size(); row++) {
            alienFirstRow2.set(row, alienFirstRow2.get(row) - 1);
            alienSecondRow2.set(row, alienSecondRow2.get(row) - 1);
        }
    }

    public void alienDown() {
        for (int row = 0; row < alienFirstRow1.size(); row++) {
            alienFirstRow1.set(row, alienFirstRow1.get(row) + 1);
            alienSecondRow1.set(row, alienSecondRow1.get(row) + 1);
        }
    }

    public void alienRigth() {
        for (int row = 0; row < alienFirstRow2.size(); row++) {
            alienFirstRow2.set(row, alienFirstRow2.get(row) + 1);
            alienSecondRow2.set(row, alienSecondRow2.get(row) + 1);
        }
    }

    public void alienMovement() {

        if (alienFlag == trueFlag && getFirstRowList2().get(getFirstRowList1().size() - 1) <= SIZE_BOARD) {
            alienRigth();
            if (getFirstRowList2().get(getFirstRowList1().size() - 1) == SIZE_BOARD) {
                alienDown();
                alienFlag = false;
            }
        } else if (alienFlag == falseFlag || getFirstRowList2().get(0) == 0) {
            alienLeft();
            if (getFirstRowList2().get(0) == 0) {
                alienDown();
                alienFlag = true;
            }
        }
    }

    public void impact(int posX, int posY) {
        for (int index = 0; index < alienFirstRow1.size(); index++) {
            if (alienFirstRow1.get(index) == posX && alienFirstRow2.get(index) == posY) {
                alienFirstRow1.remove(index);
                alienFirstRow2.remove(index);
            }
        }
        for (int index = 0; index < alienSecondRow1.size(); index++) {
            if (alienSecondRow1.get(index) == posX && alienSecondRow2.get(index) == posY) {
                alienSecondRow1.remove(index);
                alienSecondRow2.remove(index);
            }
        }
    }

    /*public void isOnFirstRow(int posX, int posY){
        boolean existOnTheFirstRow = false;
        for (int index = 0; index < alienFirstRow1.size(); index++) {
            if (alienFirstRow1.get(index) == posX && alienFirstRow2.get(index) == posY) {

            }
        }
        return ;
    }*/
}
