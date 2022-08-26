package jalau.at18.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

     @Test
     public void shouldMoveTheShipToTheLeft() throws InterruptedException {
     Game game = new Game();
     game.runGame(37);
     assertEquals(9, game.getPosXShip());
     assertEquals(3, game.getPosYShip());
      }

      @Test
      public void shouldMoveTheShipToTheRight() throws InterruptedException {
      Game game = new Game();
      game.runGame(39);
      assertEquals(9, game.getPosXShip());
      assertEquals(5, game.getPosYShip());
      }
      @Test
      public void shouldDiedTheShip() throws InterruptedException {
      Game game = new Game();
      game.runGame(38);
      assertEquals(2, game.getLifes());
      //assertEquals(9, game.getPosYShip());
      }
      @Test
      public void shouldShootedTheShip() throws InterruptedException {
      Game game = new Game();
      game.runGame(32);

      assertEquals(true,game.getStatusBullet());
      //assertEquals(9, game.getPosYShip());
      }


    /*
     * @Test
     * public void itShouldReturnPositionShip() {
     * Game game = new Game();
     * assertEquals(4, game.getPosXShip());
     * assertEquals(9, game.getPosYShip());
     * }
     */
}
