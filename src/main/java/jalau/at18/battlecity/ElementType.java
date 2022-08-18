package jalau.at18.battlecity;

public enum ElementType {
    EMPTY(0),
    BULLET(1),
    TANK(2),
    BRICK(3),
    STEEL(4),
    BUSHES(5),
    ICE(6),
    WATER(7),
    EAGLE(8);

    private final int code;

    ElementType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
