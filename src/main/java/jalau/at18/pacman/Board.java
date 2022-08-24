package jalau.at18.pacman;

public class Board {
    public static final int X_BORDER = 25;
    public static final int Y_BORDER = 29;
    public static final String FIRST = "\033[34mO\u001B[0m";
    public static final String SECOND = "·";
    private static int energizer1 = 0;
    private static int energizer2 = 0;
    private static int energizer3 = 0;
    private static int energizer4 = 0;
    private static int energizer5 = 0;
    private static int eat1 = 1;
    private static int eat2 = 2;
    private static final int POSITION5 = 5;
    private static final int POSITION25 = 25;
    private static final int POSITION3 = 3;
    private static final int POSITION23 = 23;
    private static final int POSITION11 = 11;
    private static final int POSITION17 = 17;;
    private String[][] gameBoard = {
            {"▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
                "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒"},
            {"▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·",
                "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒"},
            {"▒", "·", "▒", "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
                "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "·", "▒"},
            {"▒", "·", "▒", " ", " ", "▒", "·", "▒", " ", " ", " ", " ", "▒", "·", "▒", "·", "▒", " ", " ",
                " ", " ", "▒", "·", "▒", " ", " ", "▒", "·", "▒"},
            {"▒", "·", "▒", "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
                "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "·", "▒"},
            {"▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
                "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒"},
            {"▒", "·", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
                "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "·", "▒"},
            {"▒", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·",
                "·", "·", "▒", "·", "·", "·", "·", "·", "·", "▒"},
            {"▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
                "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒"},
            {" ", " ", " ", " ", " ", "▒", "·", "▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
                "·", "·", "▒", "·", "▒", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", " ", "▒", "▒", "▒", "▒",
                "▒", "·", "▒", "·", "▒", " ", " ", " ", " ", " "},
            {"▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒"},
            {"·", "·", "·", "·", "·", "·", "·", "·", "·", "▒", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                "▒", "·", "·", "·", "·", "·", "·", "·", "·", "·"},
            {"▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒"},
            {" ", " ", " ", " ", " ", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
                "▒", "·", "▒", "·", "▒", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "▒", "·", "▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
                "·", "·", "▒", "·", "▒", " ", " ", " ", " ", " "},
            {"▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
                "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒"},
            {"▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·",
                "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒"},
            {"▒", "·", "▒", "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
                "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "·", "▒"},
            {"▒", "·", "·", "·", "·", "▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
                "·", "·", "·", "·", "▒", "·", "·", "·", "·", "▒"},
            {"▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
                "▒", "·", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒"},
            {"▒", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·",
                "·", "·", "▒", "·", "·", "·", "·", "·", "·", "▒"},
            {"▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
                "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒"},
            {"▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
                "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒"},
            {"▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
                "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒"}
    };

    public void showBoard(String[][] boardToShow, int n, int m) {
        for (int rows = 0; rows < X_BORDER; rows++) {
            for (int colums = 0; colums < Y_BORDER; colums++) {
                System.out.print(boardToShow[rows][colums] + "");
            }
            System.out.println();
        }
    }

    public String[][] setGameBoard(String[][] newBoard) {
        this.gameBoard = newBoard;
        return this.gameBoard;
    }

    public String[][] getGameBoard() {
        return this.gameBoard;
    }
    public void timeBalls(String[][] arr, int n, int m) {
        // position(arr, n, m);
        if (energizer1 == eat1) {
            energizer1 = eat2;
        } else if (energizer1 == 0) {
            arr[eat1][POSITION25] = FIRST;
        }

        if (energizer2 == eat1) {
            energizer2 = eat2;
        } else if (energizer2 == 0) {
            arr[POSITION5][POSITION11] = FIRST;
        }

        if (energizer3 == eat1) {
            energizer3 = eat2;
        } else if (energizer3 == 0) {
            arr[POSITION17][POSITION11] = FIRST;
        }

        if (energizer4 == eat1) {
            energizer4 = eat2;
        } else if (energizer4 == 0) {
            arr[POSITION23][POSITION3] = FIRST;
        }

        if (energizer5 == eat1) {
            energizer5 = eat2;
        } else if (energizer5 == 0) {
            arr[POSITION23][POSITION25] = FIRST;
        }
    }

    public static void position(String[][] arr, int n, int m) {
        // 1 25 | 5 11| 17 11 |23 3| 23 25
        if (arr[n][m] == arr[eat1][POSITION25]) {
            energizer1 = eat1;
        } else if (arr[n][m] == arr[POSITION5][POSITION11]) {
            energizer2 = eat1;
        } else if (arr[n][m] == arr[POSITION17][POSITION11]) {
            energizer3 = eat1;
        } else if (arr[n][m] == arr[POSITION23][POSITION3]) {
            energizer4 = eat1;
        } else if (arr[n][m] == arr[POSITION23][POSITION25]) {
            energizer5 = eat1;
        }
    }
}
