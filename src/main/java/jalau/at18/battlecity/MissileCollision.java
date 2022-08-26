package jalau.at18.battlecity;

public class MissileCollision {
    private Empty empty = new Empty();

    public boolean isElementHit(Element[][] matrix, int row1, int column1, int row2, int column2) {

        Element element1 = matrix[row1][column1];
        Element element2 = matrix[row2][column2];

        if (!element1.isAllowPassBullet()) {
            if (element1.getType() == ElementType.BRICK) {
                element1.reduceLive(1);
                element2.reduceLive(1);
                System.out.println("Bullet hit the brick");
                if (element1.getLive() == 0) {
                    matrix[row1][column1] = empty;
                    matrix[row2][column2] = empty;
                    //System.out.println("Brick was destroyed, has not live");
                }
            }
            if (element1.getType() == ElementType.MISSILES) {
                System.out.println("Missile hit Missile");
                matrix[row1][column1] = empty;
                matrix[row2][column2] = empty;
                System.out.println("Missile was destroyed");
            }

            if (element1.getType() == ElementType.TANKTOP || element1.getType() == ElementType.TANKBACK) {
                element1.reduceLive(1);
                if (element1.getLive() == 0) {
                    matrix[row1][column1] = empty;
                    matrix[row2][column2] = empty;
                    System.out.println("############## Game over ##############");
                    System.exit(0);
                }
            }
            if (element1.getType() == ElementType.EAGLE) {
                System.out.println("############## Game over ##############");
                System.exit(0);
            }
            return true;
        }
        return false;
    }
}
