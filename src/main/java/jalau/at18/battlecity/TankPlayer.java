package jalau.at18.battlecity;

public class TankPlayer extends Tank {

    private String direction;
    public static final int[][] INITIAL_POSITION = {{24, 8}, {24, 9}, {25, 8}, {25, 9}};
    public static final int SIZE_ROW_POSITION = 4;
    public static final int SIZE_MAX_BOARD = 26;
    private int[][] newPosition = new int[SIZE_ROW_POSITION][2];
    private Element[][] moveMissileBoard;

    public TankPlayer() {
        this.newPosition = INITIAL_POSITION;
    }

    public int[][] movements(String input) {
        switch (input) {
            case "w":
                newPosition = moveUp(newPosition);
                break;
            case "s":
                newPosition = moveDown(newPosition);
                break;
            case "a":
                newPosition = moveLeft(newPosition);
                break;
            case "d":
                newPosition = moveRight(newPosition);
                break;
            /*case "x":
                shoot(moveMissileBoard);
                break;*/
            default:
                newPosition = newPosition;
                break;
        }
        return newPosition;

    }
    public Element[][] movePlayer(Element[][] elementsMatrix, String input) {
        cleanPosition(elementsMatrix, getPosition());
        position = movements(input);
        elementsMatrix = putTankOnBoard(elementsMatrix, position);
        return elementsMatrix;
    }
    public int[][] initialPosition() {
        return newPosition;
    }

    public void setPosition(int[][] position) {
        this.newPosition = position;

    }
    public int[][] getPosition() {
        return newPosition;
    }

    public Element[][] arrageTank(Element[][] matrix, String input){
        cleanPosition(matrix, getPosition());
        //position = getPosition();
        switch (input) {
            case "w":
                newPosition = arrangeUp(newPosition);
                setDirection("UP");
                break;
            case "s":
                newPosition = arrangeDown(newPosition);
                setDirection("DOWN");
                break;
            case "a":
                newPosition = arrangeLeft(newPosition);
                setDirection("LEFT");
                break;
            case "d":
                newPosition = arrangeRight(newPosition);
                setDirection("RIGHT");
                break;
            /*case "x":
                shoot(moveMissileBoard);
                break;*/
            default:
                newPosition = newPosition;
                break;
        }
        matrix = putTankOnBoard(matrix, newPosition);
        return matrix;
    }


}
