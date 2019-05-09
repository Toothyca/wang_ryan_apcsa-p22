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
	private Alien alienOne;
	private Alien alienTwo;
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
		ship = new Ship(10, 10, 50, 50, 4);
		alienOne = new Alien(350, 10, 50, 50, 1);
		alienTwo = new Alien(450, 10, 50, 50, 1);
		silverBullet = new Ammo(0, 0, 0);
		horde = new AlienHorde(1);
		shots = new Bullets();
		
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
		alienOne.draw(graphToBack);
		alienTwo.draw(graphToBack);
		silverBullet.draw(graphToBack);
		horde.add(alienOne);
		horde.add(alienTwo);
		
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
		if((silverBullet.getX() <= alienOne.getX() + alienOne.getWidth() + Math.abs(silverBullet.getSpeed()) && silverBullet.getX() > alienOne.getX())
				&& (silverBullet.getY() >= alienOne.getY() && silverBullet.getY() <= alienOne.getY() + alienOne.getHeight()
				|| silverBullet.getY() + silverBullet.getHeight() >= alienOne.getY()
				&& silverBullet.getY() + silverBullet.getHeight() < alienOne.getY() + alienOne.getHeight()))
		{
			alienOne = new Alien(0, 0, 0, 0, 0);
		}
		/*
		int rng = (int) (Math.random()*100000);
		if(rng == 1)
		{
			System.out.println(horde.toString());
			Alien newAlien = new Alien(350, 10, 50, 50, 1);
			newAlien.draw(graphToBack);
			horde.add(newAlien);
		}
		*/
		Alien newAlien = new Alien(350, 10, 50, 50, 1);
		newAlien.draw(graphToBack);
		//SOMETHING IS WRONG, ADDS TO MANY DUDES
		System.out.println(horde.toString());

		horde.moveEmAll();
		//horde.removeDeadOnes((List<Ammo>)shots);

		
		
		
		
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

