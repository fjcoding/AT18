package jalau.at18.battlecity.elements;

public class Brick extends Element {
    private static final int LIVE = 2;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Brick() {
        super(ElementType.BRICK, LIVE, true, false, false, ANSI_RED + "▓" + ANSI_RESET);
    }

}
