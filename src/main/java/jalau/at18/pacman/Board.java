package jalau.at18.pacman;

//import java.util.Scanner;

public class Board {
    protected int row;
    protected int colum;
    protected String[][] arr = {
                        {"▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
                "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒"},
                        {"▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·",
                        "·", "·","·", "·", "·", "·", "·", "·", "·", "▒"},
                        {"▒", "·", "▒", "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
                        "▒", "▒","▒", "·", "▒", "▒", "▒", "▒", "·", "▒"},
                        {"▒", "·", "▒", " ", " ", "▒", "·", "▒", " ", " ", " ", " ", "▒", "·", "▒", "·", "▒", " ", " ",
                        " ", " ","▒", "·", "▒", " ", " ", "▒", "·", "▒"},
                        {"▒", "·", "▒", "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
                        "▒", "▒","▒", "·", "▒", "▒", "▒", "▒", "·", "▒"},
                        {"▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
                        "·", "·","·", "·", "·", "·", "·", "·", "·", "▒"},
                        {"▒", "·", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
                        "▒", "·","▒", "·", "▒", "▒", "▒", "▒", "·", "▒"},
                        {"▒", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·",
                        "·", "·","▒", "·", "·", "·", "·", "·", "·", "▒"},
                        {"▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
                        "▒", "▒","▒", "·", "▒", "▒", "▒", "▒", "▒", "▒"},
                        {" ", " ", " ", " ", " ", "▒", "·", "▒", "·", "·", "·", "·", "·", "·", "i", "·", "·", "·", "·",
                        "·", "·","▒", "·", "▒", " ", " ", " ", " ", " "},
                        { " ", " ", " ", " ", " ", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "2", "▒", "▒", "▒", "▒",
                        "▒", "·","▒", "·", "▒", " ", " ", " ", " ", " "},
                        {"▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", " ", " ", " ", " ", "2", " ", " ", " ", " ",
                        "▒", "·","▒", "·", "▒", "▒", "▒", "▒", "▒", "▒"},
                        {"·", "·", "·", "·", "·", "·", "·", "·", "·", "▒", " ", " ", " ", " ", "2", " ", " ", " ", " ",
                        "▒", "·","·", "·", "·", "·", "·", "·", "·", "·"},
                        {"▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", " ", " ", " ", " ", "2", " ", " ", " ", " ",
                        "▒", "·","▒", "·", "▒", "▒", "▒", "▒", "▒", "▒"},
                        {" ", " ", " ", " ", " ", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
                        "▒", "·","▒", "·", "▒", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", "▒", "·", "▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
                        "·", "·","▒", "·", "▒", " ", " ", " ", " ", " "},
                        {"▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
                        "▒", "·","▒", "·", "▒", "▒", "▒", "▒", "▒", "▒"},
                        {"▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·",
                        "·", "·","·", "·", "·", "·", "·", "·", "·", "▒"},
                        {"▒", "·", "▒", "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
                        "▒", "▒","▒", "·", "▒", "▒", "▒", "▒", "·", "▒"},
                        {"▒", "·", "·", "·", "·", "▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
                        "·", "·","·", "·", "▒", "·", "·", "·", "·", "▒"},
                        {"▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
                        "▒", "·","▒", "·", "▒", "·", "▒", "▒", "▒", "▒"},
                        {"▒", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·",
                        "·", "·","▒", "·", "·", "·", "·", "·", "·", "▒"},
                        {"▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
                        "▒", "▒","▒", "▒", "▒", "▒", "▒", "▒", "·", "▒"},
                        {"▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
                        "·", "·","·", "·", "·", "·", "·", "·", "·", "▒"},
                        {"▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
                        "▒", "▒","▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒"}
        };

        public void showTable() {
                // this.arr = arr;
                for (int x = 0; x < 25; x++) {
                        for (int y = 0; y < 29; y++) {
                                System.out.print(arr[x][y] + "");
                        }
                        System.out.println();
                }
        }
}
