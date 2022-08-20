package jalau.at18.battlecity;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] arg) {
        Game game = new GameBattlecity();
        game.startGame();
        //showMatrix(board);
    }

        Board board = main.createBoard();
        main.showMatrix(board);
    }

    public void showMatrix(Board board) {
        Element[][] matrix = board.getMatrix();

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print(matrix[row][column].getImage());
            }
            System.out.println();
        }

    }

    public Board createBoard() {
        URL resource = getClass().getClassLoader().getResource("stage1.csv");
        URI uri = null;
        try {
            uri = resource.toURI();
            File file = new File(uri);
            String filePath = file.getAbsolutePath();
            Stage stage = new Stage(filePath);
            Board board = stage.initBoard();
            return board;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

}
