//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne, alienTwo, alienThree, alienFour, alienFive,
	alienSix, alienSeven, alienEight, alienNine, alienTen, alienEleven,
	alienTwelve, alienThirteen, alienFourteen;
	private Ammo silverBullet;
    private AlienHorde horde;
	private Bullets shots;


	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(350, 500, 50, 50, 4);
		silverBullet = new Ammo(0, 0, 0);
		horde = new AlienHorde(1);
		shots = new Bullets();
		
		alienOne = new Alien(50, 10, 50, 50, 1);
		alienTwo = new Alien(150, 10, 50, 50, 1);
		alienThree = new Alien(250, 10, 50, 50, 1);
		alienFour = new Alien(350, 10, 50, 50, 1);
		alienFive = new Alien(450, 10, 50, 50, 1);
		alienSix = new Alien(550, 10, 50, 50, 1);
		alienSeven = new Alien(650, 10, 50, 50, 1);
		
		alienEight = new Alien(50, 100, 50, 50, 1);
		alienNine = new Alien(150, 100, 50, 50, 1);
		alienTen = new Alien(250, 100, 50, 50, 1);
		alienEleven = new Alien(350, 100, 50, 50, 1);
		alienTwelve = new Alien(450, 100, 50, 50, 1);
		alienThirteen = new Alien(550, 100, 50, 50, 1);
		alienFourteen = new Alien(650, 100, 50, 50, 1);
		
		horde.add(alienOne);
		horde.add(alienTwo);
		horde.add(alienThree);
		horde.add(alienFour);
		horde.add(alienFive);
		horde.add(alienSix);
		horde.add(alienSeven);
		horde.add(alienEight);
		horde.add(alienNine);
		horde.add(alienTen);
		horde.add(alienEleven);
		horde.add(alienTwelve);
		horde.add(alienThirteen);
		horde.add(alienFourteen);
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		ship.draw(graphToBack);
		silverBullet.draw(graphToBack);

		alienOne.draw(graphToBack);
		alienTwo.draw(graphToBack);
		alienThree.draw(graphToBack);
		alienFour.draw(graphToBack);
		alienFive.draw(graphToBack);
		alienSix.draw(graphToBack);
		alienSeven.draw(graphToBack);
		alienEight.draw(graphToBack);
		alienNine.draw(graphToBack);
		alienTen.draw(graphToBack);
		alienEleven.draw(graphToBack);
		alienTwelve.draw(graphToBack);
		alienThirteen.draw(graphToBack);
		alienFourteen.draw(graphToBack);
		
		//add code to move Ship, Alien, etc.
		if(keys[0] == true)
		{
			if(ship.getX() >= 0)
			ship.move("LEFT");
		}
		
		if(keys[1] == true)
		{
			if(ship.getX() <= 735)
			ship.move("RIGHT");
		}

		if(keys[2] == true)
		{
			if(ship.getY() >= 5)
			ship.move("UP");
		}
		
		if(keys[3] == true)
		{
			if(ship.getY() <= 500)
			ship.move("DOWN");
		}
		
		if(keys[4] == true)
		{
			silverBullet = new Ammo(ship.getX() + ship.getWidth()/2-6, ship.getY(), 10);
			shots.add(silverBullet);
			keys[4] = false;
		}
		graphToBack.setColor(Color.WHITE);
		shots.drawEmAll(graphToBack);
		shots.moveEmAll();
		shots.cleanEmUp();
		//add in collision detection to see if shots hit the Aliens and if shots hit the Ship
		horde.moveEmAll();
		horde.removeDeadOnes(shots.getList());
		ship.checkIfDead(horde.getList());
		
		if(ship.getX() == 900 && ship.getY() == 900)
		{
			System.out.println("YOU LOSE!!!!!!!!!!!!");
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}
	

	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

