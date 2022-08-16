package jalau.at18.pacman.Dani;

import java.util.Scanner;

public class Board {
    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);
        String arr[][] = new String[15][15];
        int x, y;
        int n = 2, m = 2;
        char movements;
        // Set the map of game sizeboard
        for (x = 0; x < 15; x++) {
            for (y = 0; y < 15; y++) {
                System.out.print(arr[x][y] = "");
            }
        }

        // Desing the pacman map
        for (x = 0; x < 15; x++) {
            for (y = 0; y < 15; y++) {
                if (x == 0 || x == 14) {
                    arr[x][y] = "#";
                } else if (y == 0 || y == 14) {
                    arr[x][y] = "#";
                } else if (x == 5 && y > 4 && y < 10) {
                    arr[x][y] = "#"; // OBSTACLES
                } else if (x == 10 && y > 1 && y < 10) {
                    arr[x][y] = "#";
                } else if (x == 8 && y > 6 && y < 14) {
                    arr[x][y] = "#";
                } else {
                    arr[12][13] = "0"; // big ball
                    arr[x][y] = ".";
                }
            }
        }
        // Show the board
        arr[n][m] = "C";
        for (x = 0; x < 15; x++) {
            for (y = 0; y < 15; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
        while (true) {
            System.out.println("Enter a move:");
            movements = keyword.next().charAt(0);
            if (movements == 's') {
                n++;
                if (n > 0) {
                    arr[n - 1][m] = " ";
                }
            }
            if (movements == 'w') {
                n--;
                if (n > 0) {
                    arr[n + 1][m] = " ";
                }
            }
            if (movements == 'a') {
                m--;
                if (n > 0) {
                    arr[n][m + 1] = " ";
                }
            }
            if (movements == 'd') {
                m++;
                if (n > 0) {
                    arr[n][m - 1] = " ";
                }
            }
            arr[n][m] = "C";
            for (x = 0; x < 15; x++) {
                for (y = 0; y < 15; y++) {
                    System.out.print(arr[x][y] + " ");
                }
                System.out.println();
            }
        }
    }
}
