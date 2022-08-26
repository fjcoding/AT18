package jalau.at18.pacman;

public class Pacman {
    private static int row = 1;
    private static int column = 1;
    private static final int TIME = 200;
    public static final int INITIAL_PACMAN_POSITION = 1;
    private String representation = "C";
    private int xPosition;
    private int yPosition;

    public Pacman() {
        this.xPosition = INITIAL_PACMAN_POSITION;
        this.yPosition = INITIAL_PACMAN_POSITION;
    }


    public void setXposition(int xPosition) {
        this.xPosition = xPosition;
    }
    public int getXposition() {
        return this.xPosition;
    }
    public void setYposition(int newYPosition) {
        this.yPosition = newYPosition;
    }
    public int getYposition() {
        return this.yPosition;
    }
    public void setRepresentation(String representationToSet) {
        this.representation = representationToSet;
    }
    public String getRepresentation() {
        return this.representation;
    }
}
