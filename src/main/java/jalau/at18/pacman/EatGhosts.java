package jalau.at18.pacman;

public class EatGhosts {
    public Boolean eatGhostTrue(int counter) {
        if (counter == 1) {
            counterEnergizer++;
        } else if (counter > 1 && counter < 15) {
            eatGhost();
        }
        return true;
    }

    public String[][] eatGhost() {
        if (newboardarr[row][column] == newboardarr[rowGhostInitial1][columnsGhostIntial1]) {
            rowGhostInitial1 = 14;
            columnsGhostIntial1 = 10;
        }
        if (newboardarr[row][column] == newboardarr[rowGhostInitial2][columnsGhostIntial2]) {
            rowGhostInitial2 = 13;
            columnsGhostIntial2 = 10;
            // break;
        }
        if (newboardarr[row][column] == newboardarr[rowGhostInitial3][columnsGhostIntial3]) {
            rowGhostInitial3 = 11;
            columnsGhostIntial3 = 10;
            // break;
        }
        if (newboardarr[row][column] == newboardarr[rowGhostInitial4][columnsGhostIntial4]) {
            rowGhostInitial4 = 12;
            columnsGhostIntial4 = 10;
            // break;
        } //////////////////////
    }
}
