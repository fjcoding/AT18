package jalau.at18.battlecity;

public class TankTop extends Element {
    private static final int LIVE = 1;
    public static final String ANSI_YELLOW = "\033[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public TankTop() {
        super(ElementType.TANKTOP, LIVE, true, false, false, ANSI_YELLOW + "T" + ANSI_RESET);
    }
}
