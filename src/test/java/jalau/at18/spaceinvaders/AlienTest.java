package jalau.at18.spaceinvaders;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AlienTest {

    @Test
    public void shouldAlienMoveRight(){
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        final ArrayList<Integer> Output2ArrayList = new ArrayList<Integer>();
        OutputArrayList.add(1);
        OutputArrayList.add(2);
        OutputArrayList.add(3);
        OutputArrayList.add(4);
        Output2ArrayList.add(1);
        Output2ArrayList.add(2);
        Output2ArrayList.add(3);
        Output2ArrayList.add(4);
        alien.alienRigth();
        assertArrayEquals(OutputArrayList.toArray(), alien.getFirstRowList2().toArray());
        assertArrayEquals(OutputArrayList.toArray(), alien.getSecondRowList2().toArray());

    }

    @Test
    public void shouldAlienMoveLeft(){
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        OutputArrayList.add(-1);
        OutputArrayList.add(0);
        OutputArrayList.add(1);
        OutputArrayList.add(2);
        alien.alienLeft();

        assertArrayEquals(OutputArrayList.toArray(), alien.getFirstRowList2().toArray());
        assertArrayEquals(OutputArrayList.toArray(), alien.getSecondRowList2().toArray());
    }

    @Test
    public void shouldAlienMoveDown(){
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        final ArrayList<Integer> Output2ArrayList = new ArrayList<Integer>();
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        Output2ArrayList.add(2);
        Output2ArrayList.add(2);
        Output2ArrayList.add(2);
        Output2ArrayList.add(2);
        alien.alienDown();
        assertArrayEquals(OutputArrayList.toArray(), alien.getFirstRowList1().toArray());
        assertArrayEquals(Output2ArrayList.toArray(), alien.getSecondRowList1().toArray());
    }

    @Test
    public void shouldDeleteSecondRow(){
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        final ArrayList<Integer> Output2ArrayList = new ArrayList<Integer>();
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        Output2ArrayList.add(1);
        Output2ArrayList.add(2);
        Output2ArrayList.add(3);
        alien.deleteSecondRow(1, 0);
        assertArrayEquals(Output2ArrayList.toArray(), alien.getSecondRowList2().toArray());
        assertArrayEquals(OutputArrayList.toArray(), alien.getSecondRowList1().toArray());
    }

    @Test
    public void shouldDeleteFirstRow(){
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        final ArrayList<Integer> Output2ArrayList = new ArrayList<Integer>();
        OutputArrayList.add(0);
        OutputArrayList.add(0);
        OutputArrayList.add(0);
        Output2ArrayList.add(1);
        Output2ArrayList.add(2);
        Output2ArrayList.add(3);
        alien.deleteFirstRow(0, 0);
        assertArrayEquals(Output2ArrayList.toArray(), alien.getFirstRowList2().toArray());
        assertArrayEquals(OutputArrayList.toArray(), alien.getFirstRowList1().toArray());
    }

    @Test
    public void shouldImpactAlien(){
        Alien alien = new Alien();
        alien.impact(0, 2);
    }
    
    @Test 
    public void shouldAlienMovement(){
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        OutputArrayList.add(1);
        OutputArrayList.add(2);
        OutputArrayList.add(3);
        OutputArrayList.add(4);
        alien.alienMovement();
        assertArrayEquals(OutputArrayList.toArray(), alien.getFirstRowList2().toArray());
    }

    @Test 
    public void shouldAlienMovementSecondOption(){
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        final ArrayList<Integer> Output2ArrayList = new ArrayList<Integer>();
        final ArrayList<Integer> Output3ArrayList = new ArrayList<Integer>();
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        Output2ArrayList.add(6);
        Output2ArrayList.add(7);
        Output2ArrayList.add(8);
        Output2ArrayList.add(9);
        Output3ArrayList.add(2);
        Output3ArrayList.add(2);
        Output3ArrayList.add(2);
        Output3ArrayList.add(2);
        for (int i = 0; i < 7; i++) {
            alien.alienMovement();
        }
        assertArrayEquals(OutputArrayList.toArray(), alien.getFirstRowList1().toArray());
        assertArrayEquals(Output2ArrayList.toArray(), alien.getFirstRowList2().toArray());
        assertArrayEquals(Output3ArrayList.toArray(), alien.getSecondRowList1().toArray());
        assertArrayEquals(Output2ArrayList.toArray(), alien.getSecondRowList2().toArray());
    }

    @Test 
    public void shouldAlienMovementThirdOption(){
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        final ArrayList<Integer> Output2ArrayList = new ArrayList<Integer>();
        final ArrayList<Integer> Output3ArrayList = new ArrayList<Integer>();
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        Output2ArrayList.add(5);
        Output2ArrayList.add(6);
        Output2ArrayList.add(7);
        Output2ArrayList.add(8);
        Output3ArrayList.add(2);
        Output3ArrayList.add(2);
        Output3ArrayList.add(2);
        Output3ArrayList.add(2);
        for (int i = 0; i < 8; i++) {
            alien.alienMovement();
        }
        assertArrayEquals(OutputArrayList.toArray(), alien.getFirstRowList1().toArray());
        assertArrayEquals(Output2ArrayList.toArray(), alien.getFirstRowList2().toArray());
        assertArrayEquals(Output3ArrayList.toArray(), alien.getSecondRowList1().toArray());
        assertArrayEquals(Output2ArrayList.toArray(), alien.getSecondRowList2().toArray());
    }

    @Test 
    public void shouldAlienMovementFourthOption(){
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        final ArrayList<Integer> Output2ArrayList = new ArrayList<Integer>();
        final ArrayList<Integer> Output3ArrayList = new ArrayList<Integer>();
        OutputArrayList.add(2);
        OutputArrayList.add(2);
        OutputArrayList.add(2);
        OutputArrayList.add(2);
        Output2ArrayList.add(0);
        Output2ArrayList.add(1);
        Output2ArrayList.add(2);
        Output2ArrayList.add(3);
        Output3ArrayList.add(3);
        Output3ArrayList.add(3);
        Output3ArrayList.add(3);
        Output3ArrayList.add(3);
        for (int i = 0; i < 14; i++) {
            alien.alienMovement();
        }
        assertArrayEquals(OutputArrayList.toArray(), alien.getFirstRowList1().toArray());
        assertArrayEquals(Output2ArrayList.toArray(), alien.getFirstRowList2().toArray());
        assertArrayEquals(Output3ArrayList.toArray(), alien.getSecondRowList1().toArray());
        assertArrayEquals(Output2ArrayList.toArray(), alien.getSecondRowList2().toArray());
    }
}
