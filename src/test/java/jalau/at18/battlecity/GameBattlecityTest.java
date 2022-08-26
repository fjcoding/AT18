package jalau.at18.battlecity;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeNoException;

import org.junit.Test;

public class GameBattlecityTest {

    private GameBattlecity gameBattlecity;

    public GameBattlecityTest() {
        gameBattlecity = new GameBattlecity();
    }

    @Test
    public void startGameShouldInitializeBoard_Correctly() {
        gameBattlecity.startGame();
        assertNotEquals(null, gameBattlecity.getBoard());
    }

    @Test
    public void startGameShouldPositionPlayer_TankTop_Correctly() {
        gameBattlecity.startGame();
        // 24, 8}, {24, 9}, {25, 8}, {25, 9}
        Element[][] boardMatrix = gameBattlecity.getBoard().getMatrix();
        assertEquals(ElementType.TANKTOP, boardMatrix[24][8].getType());
        assertEquals(ElementType.TANKTOP, boardMatrix[24][9].getType());
    }

    @Test
    public void startGameShouldPositionPlayer_TankBack_Correctly() {
        gameBattlecity.startGame();
        // 24, 8}, {24, 9}, {25, 8}, {25, 9}
        Element[][] boardMatrix = gameBattlecity.getBoard().getMatrix();
        assertEquals(ElementType.TANKBACK, boardMatrix[25][8].getType());
        assertEquals(ElementType.TANKBACK, boardMatrix[25][9].getType());
    }

    @Test
    public void startGameShouldEnemyTank_Top_Correctly() {
        gameBattlecity.startGame();
        // {1, 13}, {1, 12}, {0, 13}, {0, 12}
        Element[][] boardMatrix = gameBattlecity.getBoard().getMatrix();
        assertEquals(ElementType.TANKTOP, boardMatrix[1][13].getType());
        assertEquals(ElementType.TANKTOP, boardMatrix[1][12].getType());
    }

    @Test
    public void startGameShouldEnemyTank_Back_Correctly() {
        gameBattlecity.startGame();
        // {1, 13}, {1, 12}, {0, 13}, {0, 12}
        Element[][] boardMatrix = gameBattlecity.getBoard().getMatrix();
        assertEquals(ElementType.TANKBACK, boardMatrix[0][13].getType());
        assertEquals(ElementType.TANKBACK, boardMatrix[0][12].getType());
    }

    @Test
    public void startGameShouldMoveEnemy() {
        gameBattlecity.playGame();

    }

    // @Test
    // public void tankCrashShouldReturn_True() {
    // gameBattlecity.startGame();
    // EnemyTank tank = new EnemyTank(1);
    // tank.setDirection();

    // Element[][] boardMatrix = gameBattlecity.getBoard().getMatrix();
    // boolean result = gameBattlecity.isTankCrash(tank, boardMatrix);
    // assertEquals(true, result);
    // }
    /*
     * @Test
     * public void tankCrashShouldThrow_NullPointerException() {
     * gameBattlecity.startGame();
     * EnemyTank tank = new EnemyTank(1);
     * tank.setDirection(tank.randomDirection());
     * int[][] illegalPosition = {{23,23}, {23,22}, {23,24}, {21,21} };
     * tank.moveDown(illegalPosition);
     * Element[][] boardMatrix = gameBattlecity.getBoard().getMatrix();
     * boolean result = false;
     * try{
     * result = gameBattlecity.isTankCrash(tank, boardMatrix);
     * }
     * catch(NullPointerException exception){
     * result = true;
     * }
     * assertEquals(true, result);
     * }
     */
    // @Test
    // public void startGameShouldPositionPlayerCorrectly() {

    // gameBattlecity.startGame();

    // assertEquals(expected1, enemyTank1.arrangeUp(input));
}
