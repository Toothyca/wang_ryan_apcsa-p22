//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		this(x, y, 30, 30, 0);
	}

	public Alien(int x, int y, int s)
	{
		this(x, y, 30, 30, s);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			image = ImageIO.read(new File ("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit17\\src\\alien.JPG"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Can't read alien image file");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   if(direction.equals("LEFT"))
		{
			setX(getX() - getSpeed());
		}
		if(direction.equals("RIGHT"))
		{
			setX(getX() + getSpeed());
		}
		if(direction.equals("UP"))
		{
			setY(getY() - getSpeed());
		}
		if(direction.equals("DOWN"))
		{
			setY(getY() + getSpeed());
		}
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
	
	public void disappear( Graphics window ) 
	{
	   	
	}

	public String toString()
	{
		return "X: " + getX() + " Y: " + getY();
	}
}
