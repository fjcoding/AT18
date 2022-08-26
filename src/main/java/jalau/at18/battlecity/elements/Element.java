package jalau.at18.battlecity.elements;

public class Element {
    private ElementType type;
    private int live;
    private boolean blockTank;
    private boolean allowPassBullet;
    private boolean allowStaySamePosition;
    private String image;

    public Element(ElementType type, int live, boolean blockTank, boolean allowPassBullet, boolean allowStaySamePosition, String image) {
        this.type = type;
        this.live = live;
        this.blockTank = blockTank;
        this.allowPassBullet = allowPassBullet;
        this.allowStaySamePosition = allowStaySamePosition;
        this.image = image;
    }

    public int reduceLive(int livesToTake) {
        live = live - livesToTake;
        return live;
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

    public ElementType getType() {
        return type;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String newImage) {
        image = newImage;
    }

    public int getLive() {
        return live;
    }
}

