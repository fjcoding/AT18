package jalau.at18.spaceinvaders;

import java.util.ArrayList;

public class Alien {
    private final ArrayList<Integer> alienFirstRow1 = new ArrayList<Integer>();
    private final ArrayList<Integer> alienFirstRow2 = new ArrayList<Integer>();
    private final ArrayList<Integer> alienSecondRow1 = new ArrayList<Integer>();
    private final ArrayList<Integer> alienSecondRow2 = new ArrayList<Integer>();
    private final int lastAlien = 3;

    public Alien() {
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
}
