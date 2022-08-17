package jalau.at18.battlecity;

abstract class Tank {
    abstract int[][] initialPosition();
    abstract int[][] moveUp(int[][] matrix);
    abstract int[][] moveDown(int[][] matrix);
    abstract int[][] moveRight(int[][] matrix);
    abstract int[][] moveLeft(int[][] matrix);
    abstract void shoot();
}
