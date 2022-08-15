package jalau.at18.katas.game2048.team2;

public class Board {
    private int[][] board;
    private int score;
    private final int size = 4;

    public Board(int sizeBoard, int score) {
        this.score = score;
        score = 0;
        board = new int[size][size];
        createTable();
    }

    public boolean showTable() {
        boolean condition = false;
        for (int indexRows = 0; indexRows < size; indexRows++) {
            for (int indexColumns = 0; indexColumns < size; indexColumns++) {
                System.out.print(board[indexRows][indexColumns] + "\t");
                condition = true;
            }
            System.out.println();
        }
        return condition;
    }

    public int[][] createTable() {
        for (int indexRows = 0; indexRows < size; indexRows++) {
            for (int indexColumns = 0; indexColumns < size; indexColumns++) {
                board[indexRows][indexColumns] = 0;
            }
        }
        return board;
    }

    public boolean isEmptyPosition(int x, int y) {
        return (board[x][y] == 0);
    }

    public void replacePositions(int position1, int position2, int number) {
        if (board[position1][position2] == 0) {
            board[position1][position2] = number;
        }
    }

    public int[][] returnBoard() {
        return board;
    }

    public void additionUp() {
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size - 1; row++) {
                if (board[row][col] == board[row + 1][col]) {
                    board[row][col] += board[row + 1][col]; // summatory
                    board[row + 1][col] = 0;
                    score = score + board[row][col]; // vscore + number added
                    continue;
                }
            }
        }
    }

    public void reverseUp() {
        for (int col = 0; col < size; col++) {
            int count = 0;
            for (int row = 0; row < size; row++) {
                if (board[row][col] != 0) {
                    board[0 + count][col] = board[row][col];
                    if (0 + count != row) {
                        board[row][col] = 0;
                    }
                    count++;
                }
            }
        }
    }

    public void moveNumberUp(char direction) {

        if (direction == 'w') {
            reverseUp();
            additionUp();
            reverseUp();
        }
    }

    public void additionRight() {

        for (int row = 0; row < size; row++) {
            for (int col = size - 1; col > 0; col--) {
                if (board[row][col] == board[row][col - 1]) {
                    board[row][col] += board[row][col - 1];
                    board[row][col - 1] = 0;
                    score = score + board[row][col]; // vscore + number added
                    continue;
                }
            }
        }
    }

    public void reverseRight() {
        for (int row = 0; row < size; row++) {
            int count = 0;
            for (int col = size - 1; col >= 0; col--) {
                if (board[row][col] != 0) {
                    board[row][size - 1 - count] = board[row][col];
                    if (size - 1 - count != col) {
                        board[row][col] = 0;
                    }
                    count++;
                }
            }
        }
        for (int row = 0; row < size; row++) {
            int count = 0;
            for (int col = size - 1; col >= 0; col--) {
                if (board[row][col] != 0) {
                    board[row][size - 1 - count] = board[row][col];
                    if (size - 1 - count != col) {
                        board[row][col] = 0;
                    }
                    count++;
                }
            }
        }
    }

    public void moveNumberRight(char direction) {

        if (direction == 'd') {
            reverseRight();
            additionRight();
            reverseRight();
        }
    }

    public void aditionLeft() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size - 1; col++) {
                if (board[row][col] == board[row][col + 1]) {
                    board[row][col] += board[row][col + 1]; // summatory
                    board[row][col + 1] = 0;
                    score = score + board[row][col]; // vscore + number added
                    continue;

                }
            }
        }
    }

    public void reverseLeft() {
        for (int row = 0; row < size; row++) {
            int count = 0;
            for (int col = 0; col < size; col++) {
                if (board[row][col] != 0) {

                    board[row][0 + count] = board[row][col];
                    if (0 + count != col) {
                        board[row][col] = 0;
                    }
                    count++;
                }
            }
        }

    }

    public void moveNumberLeft(char direction) {
        if (direction == 'a') {
            reverseLeft();
            aditionLeft();
            reverseLeft();
        }
    }

    public void additionDown() {
        // sumar
        for (int col = 0; col < size; col++) {
            for (int row = size - 1; row > 0; row--) {
                if (board[row][col] == board[row - 1][col]) {
                    board[row][col] += board[row - 1][col];
                    board[row - 1][col] = 0;
                    score = score + board[row][col]; // vscore + number added
                    continue;
                }
            }
        }
    }

    public void reverseDown() {
        for (int col = 0; col < size; col++) {
            int count = 0;
            for (int row = size - 1; row >= 0; row--) {
                if (board[row][col] != 0) {
                    board[size - 1 - count][col] = board[row][col];
                    if (size - 1 - count != row) {
                        board[row][col] = 0;
                    }
                    count++;
                }
            }
        }
    }

    public void moveNumberDown(char direction) {
        if (direction == 's') {
            reverseDown();
            additionDown();
            reverseDown();
        }
    }

    public int showScore() {
        int points = score;
        return points;
    }

    public int countZeros() {
        int count = 0;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                if (board[col][row] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean acceptedMovements() {

        boolean check = false;
        for (int col = 0; col < size; col++) {
            for (int row = 1; row < size; row++) {

                if (board[col][row] == board[col][row - 1]) {
                    check = true;
                }
            }
        }
        for (int row = 0; row < size; row++) {
            for (int col = 1; col < size; col++) {
                if (board[col][row] == board[col - 1][row]) {
                    check = true;
                }

            }
        }
        return check;
    }

}
