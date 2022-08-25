package jalau.at18.battlecity;

import java.awt.Frame;

public class FrameInput {
    private Frame frame;

    public FrameInput() {
        this.frame = new Frame("Input");
        frame.setSize(0, 0);
        frame.setVisible(true);
    }

    public void addKey(Input k) {
        frame.addKeyListener(k);
    }


}
