package jalau.at18.battlecity;

public class TankPlayer extends Tank {

    //private String direction;
    public static final int[][] INITIAL_POSITION = {{24, 8}, {24, 9}, {25, 8}, {25, 9}};
    public static final int SIZE_ROW_POSITION = 4;
    public static final int SIZE_MAX_BOARD = 26;
    //private int[][] newPosition = new int[SIZE_ROW_POSITION][2];
    private Element[][] moveMissileBoard;

    public TankPlayer() {
        this.position = INITIAL_POSITION;
    }

    public int[][] movements(String input) {
        switch (input) {
            case "w":
                position = moveUp(position);
                break;
            case "s":
                position = moveDown(position);
                break;
            case "a":
                position = moveLeft(position);
                break;
            case "d":
                position = moveRight(position);
                break;
            /*case "x":
                shoot(moveMissileBoard);
                break;*/
            default:
                position = position;
                break;
        }
        return position;

    }
    public Element[][] movePlayer(Element[][] elementsMatrix, String input) {
        cleanPosition(elementsMatrix, getPosition());
        position = movements(input);
        elementsMatrix = putTankOnBoard(elementsMatrix, position);
        return elementsMatrix;
    }
    public int[][] initialPosition() {
        return position;
    }

    public void setPosition(int[][] position) {
        this.position = position;

    }
    public int[][] getPosition() {
        return position;
    }

    public Element[][] arrageTank(Element[][] matrix, String input){
        cleanPosition(matrix, getPosition());
        //position = getPosition();
        switch (input) {
            case "w":
                position = arrangeUp(position);
                setDirection("UP");
                break;
            case "s":
                position = arrangeDown(position);
                setDirection("DOWN");
                break;
            case "a":
                position = arrangeLeft(position);
                setDirection("LEFT");
                break;
            case "d":
                position = arrangeRight(position);
                setDirection("RIGHT");
                break;
            /*case "x":
                shoot(moveMissileBoard);
                break;*/
            default:
                position = position;
                break;
        }
        matrix = putTankOnBoard(matrix, position);
        return matrix;
    }


}
