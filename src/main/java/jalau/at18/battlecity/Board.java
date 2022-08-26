package jalau.at18.battlecity;

import jalau.at18.battlecity.elements.Element;

public class Board {
    protected Element[][] matrix;

    public Board(Element[][] matrix) {
        this.matrix = matrix;
    }

    public Element[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(Element[][] newMatrix) {
        this.matrix = newMatrix;
    }
}
