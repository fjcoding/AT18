package jalau.at18.battlecity;

public class Eagle extends Element {
    public static final String ANSI_BLUE = "\033[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public Eagle() {
        super(ElementType.EAGLE, 1, true, false, false, ANSI_BLUE + "¥" + ANSI_RESET);
    }
}
