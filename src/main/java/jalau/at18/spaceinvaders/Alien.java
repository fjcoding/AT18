package jalau.at18.spaceinvaders;

import java.util.ArrayList;

public class Alien {
    private final ArrayList<Integer> alienFirstRow = new ArrayList<Integer>();
    private final ArrayList<Integer> alienFirstCol = new ArrayList<Integer>();
    private final ArrayList<Integer> alienSecondRow = new ArrayList<Integer>();
    private final ArrayList<Integer> alienSecondCol = new ArrayList<Integer>();
    private final int lastAlien = 3;
    private final char simbol;

    private boolean alienFlag = true;
    private static final int SIZE_BOARD = 9;

    public Alien() {
        simbol = '%';
        alienFirstRow.add(0);
        alienFirstRow.add(0);
        alienFirstRow.add(0);
        alienFirstRow.add(0);
        alienFirstCol.add(0);
        alienFirstCol.add(1);
        alienFirstCol.add(2);
        alienFirstCol.add(lastAlien);


        alienSecondRow.add(1);
        alienSecondRow.add(1);
        alienSecondRow.add(1);
        alienSecondRow.add(1);
        alienSecondCol.add(0);
        alienSecondCol.add(1);
        alienSecondCol.add(2);
        alienSecondCol.add(lastAlien);
    }

    public ArrayList<Integer> getFirstRowList1() {
        return alienFirstRow;
    }
    public ArrayList<Integer> getFirstRowList2() {
        return alienFirstCol;
    }
    public ArrayList<Integer> getSecondRowList1() {
        return alienSecondRow;
    }
    public ArrayList<Integer> getSecondRowList2() {
        return alienSecondCol;
    }

    public char getSimbol() {
        return simbol;
    }

    public boolean exist(int posX, int posY) {
        boolean existResponse = false;
        if (isOnFirstRow(posX, posY) || isOnSecondRow(posX, posY)) {
            existResponse = true;
        }
        return existResponse;
    }

    public void alienLeft() {
        for (int row = 0; row < alienFirstCol.size(); row++) {
            alienFirstCol.set(row, alienFirstCol.get(row) - 1);
        }
        for (int row = 0; row < alienSecondCol.size(); row++) {
            alienSecondCol.set(row, alienSecondCol.get(row) - 1);
        }
    }

    public void alienDown() {
        for (int row = 0; row < alienFirstRow.size(); row++) {
            alienFirstRow.set(row, alienFirstRow.get(row) + 1);
        }
        for (int row = 0; row < alienSecondRow.size(); row++) {
            alienSecondRow.set(row, alienSecondRow.get(row) + 1);
        }
    }

    public void alienRigth() {
        for (int row = 0; row < alienFirstCol.size(); row++) {
            alienFirstCol.set(row, alienFirstCol.get(row) + 1);
        }
        for (int row = 0; row < alienSecondCol.size(); row++) {
            alienSecondCol.set(row, alienSecondCol.get(row) + 1);
        }
    }

    public void alienMovement() {
        int maxSizeA = alienFirstCol.size() - 1;
        int maxSizeD = alienSecondCol.size() - 1;
        if (alienFlag  && alienFirstCol.get(maxSizeA) < SIZE_BOARD && alienSecondCol.get(maxSizeD) < SIZE_BOARD) {
            alienRigth();
        } else if (alienFlag && (alienFirstCol.get(maxSizeA) == SIZE_BOARD || alienSecondCol.get(maxSizeD) == SIZE_BOARD)) {
            alienFlag = false;
            alienDown();
        } else if (!alienFlag && alienFirstCol.get(0) > 0 && alienSecondCol.get(0) > 0) {
            alienLeft();
        } else if (alienFirstCol.get(0) == 0 || alienSecondCol.get(0) == 0) {
            alienDown();
            alienFlag = true;
        }
    }

    public void impact(int posX, int posY) {
        if (isOnFirstRow(posX, posY)) {
            deleteFirstRow(posX, posY);
        } else {
            deleteSecondRow(posX, posY);
        }
    }

    public void deleteFirstRow(int posX, int posY) {
        for (int index = 0; index < alienFirstRow.size(); index++) {
            if (alienFirstRow.get(index) == posX && alienFirstCol.get(index) == posY) {
                alienFirstRow.remove(index);
                alienFirstCol.remove(index);
                break;
            }
        }
    }

    public void deleteSecondRow(int posX, int posY) {
        for (int index = 0; index < alienSecondRow.size(); index++) {
            if (alienSecondRow.get(index) == posX && alienSecondCol.get(index) == posY) {
                alienSecondRow.remove(index);
                alienSecondCol.remove(index);
                break;
            }
        }
    }


    public boolean isOnFirstRow(int posX, int posY) {
        boolean existOnTheFirstRow = false;
        for (int index = 0; index < alienFirstRow.size(); index++) {
            if (alienFirstRow.get(index) == posX && alienFirstCol.get(index) == posY) {
                existOnTheFirstRow = true;
            }
        }
        return existOnTheFirstRow;
    }

    public boolean isOnSecondRow(int posX, int posY) {
        boolean existOnTheSecondRow = false;
        for (int index = 0; index < alienSecondRow.size(); index++) {
            if (alienSecondRow.get(index) == posX && alienSecondCol.get(index) == posY) {
                existOnTheSecondRow = true;
            }
        }
        return existOnTheSecondRow;
    }
}
