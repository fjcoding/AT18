package jalau.at18.battlecity;

public class Element {
    private ElementType type;
    private int live;
    private boolean blockTank;
    private boolean allowPassBullet;
    private boolean allowStaySamePosition;

    public Element(ElementType type, int live, boolean blockTank, boolean allowPassBullet, boolean allowStaySamePosition) {
        this.type = type;
        this.live = live;
        this.blockTank = blockTank;
        this.allowPassBullet = allowPassBullet;
        this.allowStaySamePosition = allowStaySamePosition;
    }

    public int reduceLive(int livesToTake) {
        return live - livesToTake;
    }

    public boolean isBlockTank() {
        return blockTank;
    }

    public boolean isAllowPassBullet() {
        return allowPassBullet;
    }

    public boolean isAllowStaySamePosition() {
        return allowStaySamePosition;
    }
}

