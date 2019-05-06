//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
      speed = 5;
   }

   //add the other Paddle constructors
   
   public Paddle(int x, int y)
   {
	   super(x, y);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int spd)
   {
	   super(x, y);
	   setSpeed(spd);
   }
   
   public Paddle(int x, int y, int w, int h)
   {
	   super(x, y, w, h);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int w, int h, int spd)
   {
	   super(x, y, w, h);
	   setSpeed(spd);
   }
   
   public Paddle(int x, int y, int w, int h, Color col, int spd)
   {
	   super(x, y, w, h, col);
	   setSpeed(spd);
   }


   public void setSpeed(int spd)
   {
	   speed = spd;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY() - getSpeed());
	   draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY() + getSpeed());
	   draw(window);
   }
   
   public void moveLeftAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setX(getX() - getSpeed());
	   draw(window);
   }

   public void moveRightAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setX(getX() + getSpeed());
	   draw(window);
   }

   //add get methods
   public int getSpeed()
   {
	   return speed;
   }
   
   //add a toString() method
   public String toString()
   {
	   return super.toString() + ", Speed: " + speed;
   }
}