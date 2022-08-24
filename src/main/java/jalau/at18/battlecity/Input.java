package jalau.at18.battlecity;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener {
    String input ="";
	//Proceso1 array = new Proceso1();
	@Override
	public void keyTyped(KeyEvent e)
	{
		input = String.valueOf(e.getKeyChar());
		System.out.println(input);
	}
	@Override
	public void keyPressed(KeyEvent e)
	{
	}
	@Override
	public void keyReleased(KeyEvent e)
	{
	}
}
