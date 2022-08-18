package jalau.at18.battlecity;

public class Brick extends Element {
    private static final int LIVE = 2;

    public Brick() {
        super(ElementType.BRICK, LIVE, true, false, false, "B");
    }

}
