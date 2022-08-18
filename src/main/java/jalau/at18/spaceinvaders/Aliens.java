package jalau.at18.spaceinvaders;

public class Aliens {

    private static final int[] POS_X_INITIAL = {3, 4, 5, 6};
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

}
