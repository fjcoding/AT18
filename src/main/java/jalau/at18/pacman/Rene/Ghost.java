package jalau.at18.pacman.Rene;

public class Ghost {
    public static final char GHOST_CHAR = 'G';
   
    private boolean isBlue = false;
    private char ghostRepresentation = GHOST_CHAR;
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
}
