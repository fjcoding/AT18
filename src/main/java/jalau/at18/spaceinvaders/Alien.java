package jalau.at18.spaceinvaders;

public class Alien {

    private static final int[] POS_X_INITIAL = {0, 1, 2, 3};
    private static final int[] POS_Y_INITIAL = {0, 1};
    private static final int ROW_ALIENS = 4;
    private static final int COLUMN_ALIENS = 2;
    private int[] posY;
    private int[] posX;

    public Alien() {
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

    public void alienLeft() {
        for (int row = 0; row < ROW_ALIENS; row++) {
            posX[row] -= 1;
        }
    }
    public void alienDown() {
        for (int column = 0; column < COLUMN_ALIENS; column++) {
            posY[column] += 1;
        }
    }

    public void alienRigth() {
        for (int row = 0; row < ROW_ALIENS; row++) {
            posX[row] += 1;
        }
    }

    public String toString(){
        String res = "";
        for (int i = 0; i < POS_X_INITIAL.length; i++) {
            res += posX[i] + " ";
        }
        return res;
    }
}
