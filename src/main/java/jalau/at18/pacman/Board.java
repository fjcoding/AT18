package jalau.at18.pacman;

//import java.util.Scanner;
public class Board {
    public static final int X_BORDER = 25;
    public static final int Y_BORDER = 29;
    public void showTable(String[][] arr) {
                // this.arr = arr;
        for (int rows = 0; rows < X_BORDER; rows++) {
            for (int colums = 0; colums < Y_BORDER; colums++) {
                System.out.print(arr[rows][colums] + "");
            }
            System.out.println();
        }
    }
}