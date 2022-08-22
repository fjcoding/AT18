package jalau.at18.pacman;
import java.util.Timer;
import java.util.TimerTask;
// import java.util.Random;
public class Board {
    public static final int X_BORDER = 25;
    public static final int Y_BORDER = 29;
    public static final String FIRST = "\033[34mO\u001B[0m";
    public static final String SECOND = "·";
    private static int tic = 0;
    private static final int DELAY = 10;
    private static final int PERIODD = 100;
    private static final int MODULE = 2;
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
            "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒" },
        {"▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·",
            "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒" },
        {"▒", "·", "▒", "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
            "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "·", "▒" },
        {"▒", "·", "▒", " ", " ", "▒", "·", "▒", " ", " ", " ", " ", "▒", "·", "▒", "·", "▒", " ", " ",
            " ", " ", "▒", "·", "▒", " ", " ", "▒", "·", "▒" },
        {"▒", "·", "▒", "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
            "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "·", "▒" },
        {"▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
            "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒" },
        {"▒", "·", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
            "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "·", "▒" },
        {"▒", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·",
            "·", "·", "▒", "·", "·", "·", "·", "·", "·", "▒" },
        {"▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
            "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒" },
        {" ", " ", " ", " ", " ", "▒", "·", "▒", "·", "·", "·", "·", "·", "·", "i", "·", "·", "·", "·",
            "·", "·", "▒", "·", "▒", " ", " ", " ", " ", " " },
        {" ", " ", " ", " ", " ", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "2", "▒", "▒", "▒", "▒",
            "▒", "·", "▒", "·", "▒", " ", " ", " ", " ", " " },
        {"▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", " ", " ", " ", " ", "2", " ", " ", " ", " ",
            "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒" },
        {"·", "·", "·", "·", "·", "·", "·", "·", "·", "▒", " ", " ", " ", " ", "2", " ", " ", " ", " ",
            "▒", "·", "·", "·", "·", "·", "·", "·", "·", "·" },
        {"▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", " ", " ", " ", " ", "2", " ", " ", " ", " ",
            "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒" },
        {" ", " ", " ", " ", " ", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
            "▒", "·", "▒", "·", "▒", " ", " ", " ", " ", " " },
        {" ", " ", " ", " ", " ", "▒", "·", "▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
            "·", "·", "▒", "·", "▒", " ", " ", " ", " ", " " },
        {"▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
            "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒" },
        {"▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·",
            "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒" },
        {"▒", "·", "▒", "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
            "▒", "▒", "▒", "·", "▒", "▒", "▒", "▒", "·", "▒" },
        {"▒", "·", "·", "·", "·", "▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
            "·", "·", "·", "·", "▒", "·", "·", "·", "·", "▒" },
        {"▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
            "▒", "·", "▒", "·", "▒", "·", "▒", "▒", "▒", "▒" },
        {"▒", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·", "·", "·", "▒", "·", "·", "·", "·",
            "·", "·", "▒", "·", "·", "·", "·", "·", "·", "▒" },
        {"▒", "·", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒", "·", "▒", "▒", "▒",
            "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "·", "▒" },
        {"▒", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·", "·",
            "·", "·", "·", "·", "·", "·", "·", "·", "·", "▒" },
        {"▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒",
            "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒", "▒" }
        };


    public void showBoard(String[][] boardToShow, int n, int m) {
        for (int rows = 0; rows < X_BORDER; rows++) {
            for (int colums = 0; colums < Y_BORDER; colums++) {
                System.out.print(boardToShow[rows][colums] + "");
                timeBalls(boardToShow, n, m);
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
        position(arr, n, m);
        Timer timerr = new Timer();
        TimerTask task = new TimerTask() {

            public void run() {
                if (tic % MODULE == 0) {
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

                } else {
                    if (energizer1 == eat1) {
                        energizer1 = eat2;
                    } else if (energizer1 == 0) {
                        arr[eat1][POSITION25] = SECOND;
                    }

                    if (energizer2 == eat1) {
                        energizer2 = eat2;
                    } else if (energizer2 == 0) {
                        arr[POSITION5][POSITION11] = SECOND;
                    }

                    if (energizer3 == eat1) {
                        energizer3 = eat2;
                    } else if (energizer3 == 0) {
                        arr[POSITION17][POSITION11] = SECOND;
                    }

                    if (energizer4 == eat1) {
                        energizer4 = eat2;
                    } else if (energizer4 == 0) {
                        arr[POSITION23][POSITION3] = SECOND;
                    }

                    if (energizer5 == eat1) {
                        energizer5 = eat2;
                    } else if (energizer5 == 0) {
                        arr[POSITION23][POSITION25] = SECOND;
                    }
                }
                tic++;
            }
        };
        timerr.schedule(task, DELAY, PERIODD);
    }
    public static void position(String[][] arr, int n, int m) {
        //1  25 |  5  11| 17 11  |23  3|  23 25
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
<<<<<<< HEAD

        public String[][] setGameBoard(String[][] newBoard) {
                return this.gameBoard = newBoard;
        }

        public String[][] getGameBoard() {
                return this.gameBoard;
        }

        public void timeBalls(String arr[][], int n, int m) {

                position(arr, n, m);
                Timer timerr = new Timer();
                TimerTask task = new TimerTask() {
                        int tic = 0;

                        public void run() {
                                if (tic % 2 == 0) {
                                        if (a1 == 1) {
                                                a1 = 2;
                                        } else if (a1 == 0) {
                                                // arr[1][27] = primero;//O
                                                arr[1][25] = primero;// O
                                        }

                                        if (a2 == 1) {
                                                a2 = 2;
                                        } else if (a2 == 0) {
                                                arr[5][11] = primero;
                                        }

                                        if (a3 == 1) {
                                                a3 = 2;
                                        } else if (a3 == 0) {
                                                arr[17][11] = primero;
                                        }

                                        if (a4 == 1) {
                                                a4 = 2;
                                        } else if (a4 == 0) {
                                                arr[23][3] = primero;
                                        }

                                        if (a5 == 1) {
                                                a5 = 2;
                                        } else if (a5 == 0) {
                                                arr[23][25] = primero;
                                        }

                                } else {
                                        if (a1 == 1) {
                                                a1 = 2;
                                        } else if (a1 == 0) {
                                                arr[1][25] = segundo;
                                                // arr[1][27] = segundo;//O
                                        }

                                        if (a2 == 1) {
                                                a2 = 2;
                                        } else if (a2 == 0) {
                                                arr[5][11] = segundo;// [5][6]
                                        }

                                        if (a3 == 1) {
                                                a3 = 2;
                                        } else if (a3 == 0) {
                                                arr[17][11] = segundo;// 17][13]
                                        }

                                        if (a4 == 1) {
                                                a4 = 2;
                                        } else if (a4 == 0) {
                                                arr[23][3] = segundo;// [23][1]
                                        }

                                        if (a5 == 1) {
                                                a5 = 2;
                                        } else if (a5 == 0) {
                                                arr[23][25] = segundo;// [23][27]
                                        }
                                }
                                tic++;
                        }
                };
                timerr.schedule(task, 10, 100);
        }

        public static void position(String arr[][], int n, int m) {
                if (arr[n][m] == arr[5][3]) {
                        a1 = 1;
                } else if (arr[n][m] == arr[5][6]) {
                        a2 = 1;
                } else if (arr[n][m] == arr[17][13]) {
                        a3 = 1;
                } else if (arr[n][m] == arr[23][1]) {
                        a4 = 1;
                } else if (arr[n][m] == arr[23][25]) {
                        a5 = 1;
                }
        }

=======
    }
>>>>>>> 3de5c7ed8ba284ccbe284737f431c30e77af2670
}