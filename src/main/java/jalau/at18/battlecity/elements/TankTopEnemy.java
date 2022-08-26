package jalau.at18.battlecity.elements;

public class TankTopEnemy extends Element {
    private static final int LIVE = 1;
    public static final String ANSI_GREEN = "\033[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public TankTopEnemy() {
        super(ElementType.TANKBACKENEMY, LIVE, true, false, false, ANSI_GREEN + "E" + ANSI_RESET);
    }
}