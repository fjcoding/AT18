package jalau.at18.battlecity;

public class Board {
    private final Element[][] matrix;

    public Board(Element[][] matrix) {
        this.matrix = matrix;
    }

    public Element[][] getMatrix() {
        return matrix;
    }
}
