package jalau.at18.battlecity.elements;

public class TankBack extends Element {
    private static final int LIVE = 1;
    public static final String ANSI_YELLOW = "\033[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public TankBack() {
        super(ElementType.TANKBACK, LIVE, true, false, false, ANSI_YELLOW + "t" + ANSI_RESET);
    }
}
