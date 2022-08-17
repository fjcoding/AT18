package jalau.at18.battlecity;

public class CompleteBrick extends Element {

    private static final int LIVE = 4;

    public CompleteBrick() {
        super(ElementType.COMPLETE_BRICK, LIVE, true, false, false, "CB");
    }

}
