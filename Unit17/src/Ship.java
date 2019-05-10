//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.util.List;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   this(x, y, 10, 10, 10);
	}

	public Ship(int x, int y, int s)
	{
	   this(x, y, 10, 10, s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			image = ImageIO.read(new File ("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit17\\src\\ship.jpg"));
			
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Can't read ship image file");
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
	
	public void checkIfDead(List<Alien> aliens)
	{
		for(Alien ET: aliens)
		{
			if((this.getX() <= ET.getX() + ET.getWidth() + Math.abs(this.getSpeed()) && this.getX() > ET.getX())
					&& (this.getY() >= ET.getY() && this.getY() <= ET.getY() + ET.getHeight()
					|| this.getY() + this.getHeight() >= ET.getY()
					&& this.getY() + this.getHeight() < ET.getY() + ET.getHeight()))
			{
				this.setPos(900, 900);
			}
		}
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
