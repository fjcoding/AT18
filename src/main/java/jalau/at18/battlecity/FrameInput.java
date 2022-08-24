package jalau.at18.battlecity;
import java.awt.Frame;
public class FrameInput {
    Frame f;

	public FrameInput () {
		this.f = new Frame("Input");
		f.setSize(0, 0);
		f.setVisible(true);
	}

	public void addKey(Input k) {
		f.addKeyListener(k);
	}

}
