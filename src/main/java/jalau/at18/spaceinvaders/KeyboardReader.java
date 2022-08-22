package jalau.at18.spaceinvaders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class KeyboardReader extends Thread {
    private static final int SIZE_STRING = 100;
    private static final int SIZE = 400;
    private JFrame frame;
    private Queue<KeyEvent> keyEvents = new ArrayBlockingQueue<KeyEvent>(SIZE_STRING);

    @Override
    public void run() {
        frame = new JFrame("KeyPress Tester");
        frame.setTitle("Space Invaders Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setUndecorated(true);
        frame.setSize(SIZE, SIZE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(new GridBagLayout());

        frame.setOpacity(0.0f);
        frame.setVisible(true);

        frame.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Do nothing
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.exit(0);
            }
        });

        frame.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {
                // Do nothing
            }

            public void keyReleased(KeyEvent e) {
                // Do nothing
            }

            public void keyPressed(KeyEvent e) {
                keyEvents.add(e);
            }
        });
    }

    public boolean hasKeyEvents() {
        return !keyEvents.isEmpty();
    }

    public KeyEvent getEventFromTop() {
        return keyEvents.poll();
    }
}
