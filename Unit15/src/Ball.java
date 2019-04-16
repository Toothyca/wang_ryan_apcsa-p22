//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int xspd, int yspd)
	{
		super(x, y);
		setXSpeed(xspd);
		setYSpeed(yspd);
	}
	
	public Ball(int x, int y, int xspd, int yspd, Color col)
	{
		super(x, y);
		setColor(col);
		setXSpeed(xspd);
		setYSpeed(yspd);
	}
	
   //add the set methods
   public void setXSpeed(int xspd)
   {
	   xSpeed = xspd;
   }
   
   public void setYSpeed(int yspd)
   {
	   ySpeed = yspd;
   }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.white);

	   //draw(window, Color.red);
	   
      setX(getX() + xSpeed);
		//setY
      setY(getY() + ySpeed);

		//draw the ball at its new location
      draw(window);
   }
   
   public void redraw(Graphics window)
   {
	   draw(window, Color.white);
	   setX(0);
	   setY(100);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball)obj;
		if(super.equals(other)&&getXSpeed() == other.getXSpeed()&& getYSpeed() == other.getYSpeed())
		{
		return true;
		}

		return false;
	}   

   //add the get methods
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}

   //add a toString() method
	public String toString()
	{
		return super.toString() + ", xSpeed: " + xSpeed + ", ySpeed: " + ySpeed;
	}
}