package jalau.at18.battlecity;

public class Steel extends Element {
    private static final int LIVE = 3;
    public static final String ANSI_WHITE = "\033[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Steel() {
        super(ElementType.STEEL, LIVE, true, false, false, ANSI_WHITE + "▒" + ANSI_RESET);
    }
}
