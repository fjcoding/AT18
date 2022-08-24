package jalau.at18.battlecity;

public class Board {
    protected Element[][] matrix;

    public Board(Element[][] matrix) {
        this.matrix = matrix;
    }

    public Element[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(Element[][] matrix){
        this.matrix= matrix;
    }
}
