//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.JFrame;
import java.awt.Component;

public class TheGameTwoPointOh extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TheGameTwoPointOh()
	{
		super("Breakout");
		setSize(WIDTH,HEIGHT);

		Breakout game = new Breakout();

		((Component)game).setFocusable(true);
		getContentPane().add(game);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		TheGameTwoPointOh run = new TheGameTwoPointOh();
	}
}