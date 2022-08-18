package jalau.at18.battlecity;

public class TankPlayer extends Tank {

    private String direction;
    public static final int[][] INITIAL_POSITION = {{24, 9}, {24, 10}, {25, 9}, {25, 10}};
    private int[][] position = new int [4][2];
    public static final int SIZE_ROW_POSITION = 4;

    public TankPlayer(){

    }

    @Override
    public int[][] initialPosition() {
        this.position = INITIAL_POSITION;
        return position;
    }

    public void setMove(String direction){
        this.direction = direction;
    }

    public void setPosition(int [][] position){
        this.position = position;

    }

    @Override
    public int[][] moveUp(int[][] position){
        for(int row = 0; row < SIZE_ROW_POSITION; row++){
            position[row][0] = position[row][0] - 1;
        }
    	return position;
    }

    @Override
    public int[][] moveDown(int[][] position){
        for(int row = 0; row < SIZE_ROW_POSITION; row++){
            position[row][0] = position[row][0] + 1;
        }
    	return position;
    }

    @Override
    public int[][] moveRight(int[][] position){
        for(int row = 0; row < SIZE_ROW_POSITION; row++){
            position[row][1] = position[row][1] + 1;
        }
    	return position;
    }

    @Override
    public int[][] moveLeft(int[][] position){
        for(int row = 0; row < SIZE_ROW_POSITION; row++){
            position[row][1] = position[row][1] - 1;
        }
    	return position;
    }

    @Override
    public void shoot() {

    }

}
