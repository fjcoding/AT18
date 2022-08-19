package jalau.at18.spaceinvaders;

public class Aliens {

    private static final int[] POS_X_INITIAL = {0, 1, 2, 3};
    private static final int[] POS_Y_INITIAL = {0, 1};
    private int[] posY;
    private int[] posX;

    public Aliens() {
        posX = POS_X_INITIAL;
        posY = POS_Y_INITIAL;
    }
    public void setPosX(int[] newAlienPosition) {
        posX = newAlienPosition;
    }
    public void setPosY(int[] newAlienPosition) {
        posY = newAlienPosition;
    }

    public int[] getPosX() {
        return posX;
    }

    public int[] getPosY() {
        return posY;
    }

    public void alienLeft(){
        for(int row = 0; row < 4; row++){
            posX[row] -=1;
        }
    }
    public void alienRigth(){
        for(int row = 0; row < 4; row++){
            posX[row] +=1;
        }
    }

    public void alienDown(){
        for (int column = 0; column < 2; column++){
            posY[column] +=1;
        }
    }
}
