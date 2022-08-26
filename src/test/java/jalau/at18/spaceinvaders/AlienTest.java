package jalau.at18.spaceinvaders;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AlienTest {

    /*@Test
    public void shouldSendFirstArrayRow1() {
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        OutputArrayList.add(0);
        OutputArrayList.add(0);
        OutputArrayList.add(0);
        OutputArrayList.add(0);
        System.out.println(alien.getFirstRowList1()); 
        assertArrayEquals(OutputArrayList.toArray(), alien.getFirstRowList1().toArray());
    }

    @Test
    public void shouldSendFirstArrayRow2(){
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        OutputArrayList.add(0);
        OutputArrayList.add(1);
        OutputArrayList.add(2);
        OutputArrayList.add(3);
        System.out.println(alien.getFirstRowList2()); 
        assertArrayEquals(OutputArrayList.toArray(), alien.getFirstRowList2().toArray());
    }

    @Test
    public void shouldSendSecondArrayRow1() {
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        OutputArrayList.add(1);
        System.out.println(alien.getSecondRowList1()); 
        assertArrayEquals(OutputArrayList.toArray(), alien.getSecondRowList1().toArray());
    }

    @Test
    public void shouldSendSecondArrayRow2(){
        Alien alien = new Alien();
        final ArrayList<Integer> OutputArrayList = new ArrayList<Integer>();
        OutputArrayList.add(0);
        OutputArrayList.add(1);
        OutputArrayList.add(2);
        OutputArrayList.add(3);
        System.out.println(alien.getSecondRowList2()); 
        assertArrayEquals(OutputArrayList.toArray(), alien.getSecondRowList2().toArray());
    }*/

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
        System.out.println(alien.getFirstRowList2());
        System.out.println(alien.getSecondRowList2());
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
        System.out.println(alien.getFirstRowList2());
        System.out.println(alien.getSecondRowList2());
        System.out.println(OutputArrayList);
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
        System.out.println(alien.getFirstRowList1());
        System.out.println(alien.getSecondRowList1());
        System.out.println(OutputArrayList);
        System.out.println(Output2ArrayList);
        assertArrayEquals(OutputArrayList.toArray(), alien.getFirstRowList1().toArray());
        assertArrayEquals(Output2ArrayList.toArray(), alien.getSecondRowList1().toArray());
    }

}
