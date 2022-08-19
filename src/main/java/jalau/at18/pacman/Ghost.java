package jalau.at18.pacman;

public class Ghost {
    public static final String GHOST_CHAR = "G";
   
    private boolean isBlue = false;
    private String ghostRepresentation = GHOST_CHAR;
    private int[] position;


    public void setIsBlue (Boolean blue) {
        this.isBlue = blue;
    }
    public boolean getIsBlue() {
        return this.isBlue;
    }
    public void setPosition (int[] ghostPosition) {
        this.position = ghostPosition;
    }
    public int[] getPosition() {
        return this.position;
    }
    public String getRepresentation() {
        return this.ghostRepresentation;
    }

    public void startGhostMovement() {
        int i = 0;
        while(i < 5) {
            System.out.println("skere");
            longRunningMethod();
            i++;
        }
       
    }

     public static void longRunningMethod() {
        try {
           Thread.sleep(2000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}
