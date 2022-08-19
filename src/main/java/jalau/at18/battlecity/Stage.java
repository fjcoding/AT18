package jalau.at18.battlecity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Stage {
    private String file;
    private static final int MATRIX_SIZE = 26;

    public Stage(String file) {
        this.file = file;
    }

    public Board initBoard() {
        Element[][] matrix = new Element[MATRIX_SIZE][MATRIX_SIZE];

        try {
            List<String> content = Files.readAllLines(Path.of(file));
            for (int rowIndex = 0; rowIndex < MATRIX_SIZE; rowIndex++) {
                String rowContent = content.get(rowIndex);
                String[] columns = rowContent.split(",");
                for (int columnIndex = 0; columnIndex < MATRIX_SIZE; columnIndex++) {
                    int cell = Integer.parseInt(columns[columnIndex]);
                    ElementType type = ElementType.findByCode(cell);
                    switch (type) {
                        case BRICK:
                            Brick brick = new Brick();
                            matrix[rowIndex][columnIndex] = brick;
                            break;
                        case STEEL:
                            Steel steel = new Steel();
                            matrix[rowIndex][columnIndex] = steel;
                            break;
                        case BUSHES:
                            Bushes bushes = new Bushes();
                            matrix[rowIndex][columnIndex] = bushes;
                            break;
                        case ICE:
                            Ice ice = new Ice();
                            matrix[rowIndex][columnIndex] = ice;
                            break;
                        case WATER:
                            Water water = new Water();
                            matrix[rowIndex][columnIndex] = water;
                            break;
                        case EAGLE:
                            Eagle eagle = new Eagle();
                            matrix[rowIndex][columnIndex] = eagle;
                            break;
                        default:
                            Empty empty = new Empty();
                            matrix[rowIndex][columnIndex] = empty;
                    }
                }
            }

            Board board = new Board(matrix);
            return board;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
