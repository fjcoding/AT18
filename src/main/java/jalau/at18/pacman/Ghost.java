package jalau.at18.pacman;

public class Ghost {
    public static final String GHOST_CHAR = "G";
    public static final int INDEX_TRY = 5;
    public static final int GHOST_SLEEP_TIME = 1000;
    
    private boolean isBlue = false;
    private String ghostRepresentation = GHOST_CHAR;
    private int xPosition;
    private int yPosition;

    public Ghost(int intialXPosition, int intialYPosition) {
        this.xPosition = intialXPosition;
        this.yPosition = intialYPosition;
    }
    public void setXposition(int newXPosition) {
        this.xPosition = newXPosition;
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
    public void setIsBlue(Boolean blue) {
        this.isBlue = blue;
    }
    public boolean getIsBlue() {
        return this.isBlue;
    }
    public String getRepresentation() {
        return this.ghostRepresentation;
    }

    public void startGhostMovement() {
        int index = 0;
        while (index < INDEX_TRY) {
            System.out.println("skere");
            longRunningMethod();
            index++;
        }
    }

    public static void longRunningMethod() {
        try {
            Thread.sleep(GHOST_SLEEP_TIME);
        }   catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
