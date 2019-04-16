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

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private boolean hitLeftPaddle, hitRightPaddle;
	private BufferedImage back;

	private int leftScore, rightScore;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(400, 300, 2, 1, Color.blue);
		//ball = new BlinkyBall(400, 300, 10, 10, Color.blue, 2, 1);
		//ball = new SpeedUpBall(400, 300, 10, 10, Color.blue, 1, 1);

		leftPaddle = new Paddle(20, 200, 10, 100, Color.orange, 2);
		rightPaddle = new Paddle(760, 200, 10 , 100, Color.orange, 2);
		
		hitLeftPaddle = false;
		hitRightPaddle = false;

		keys = new boolean[4];

		leftScore = 0;
		rightScore = 0;
    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		
		
		
		//see if ball hits left wall or right wall

		if(!(ball.getX()>=10 && ball.getX()<= 775))
		{			
			System.out.println("X: " + ball.getX());
			if((ball.getX()>=10))
			{
				ball.redraw(graphToBack);
				ball.setXSpeed(Math.abs(ball.getXSpeed())*-1);
				leftScore++;
			}
			else if(ball.getX()<= 775)
			{
				ball.redraw(graphToBack);
				ball.setXSpeed(Math.abs(ball.getXSpeed()));
				rightScore++;
			}
			ball.setX((int)(Math.random() * 600));
			ball.setY(300);
			System.out.println("Left: " + leftScore + " Right: " + rightScore);
		}
		
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(400, 520, 100, 40);
		graphToBack.fillRect(100, 520, 120, 20);
		graphToBack.fillRect(600, 520, 120, 20);
		
		graphToBack.setColor(Color.red);
		graphToBack.drawString("Left Score " + leftScore, 400, 540);
		graphToBack.drawString("Right Score: " + rightScore, 400, 560);
		graphToBack.drawString("hitLeftPaddle = "+hitLeftPaddle, 100, 540);
		graphToBack.drawString("hitRightPaddle = "+hitRightPaddle,  600,  540);
		
		
		//see if the ball hits the top or bottom wall

		if(!(ball.getY()>=0 && ball.getY()<= 550))
		{
			hitLeftPaddle = false;
			hitRightPaddle = false;
			ball.setYSpeed(-ball.getYSpeed());
		}


		//see if the ball hits the left paddle		
			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())
			&& (ball.getY() >= leftPaddle.getY()
			&& ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()
			|| ball.getY() + ball.getHeight() >= leftPaddle.getY()
			&& ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight()))
		{
			hitLeftPaddle = true;
			hitRightPaddle = false;
			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(ball.getYSpeed() * -1);
			}			  
			else
			{
				ball.setXSpeed(ball.getXSpeed() * -1);	
			}
		}
			
		
		//see if the ball hits the right paddle
			if(ball.getX() >= rightPaddle.getX() - rightPaddle.getWidth() + Math.abs(ball.getXSpeed())
			&& (ball.getY() >= rightPaddle.getY()
			&& ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()
			|| ball.getY() + ball.getHeight() >= rightPaddle.getY()
			&& ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight()))
		{
			hitLeftPaddle = false;
			hitRightPaddle = true;
			if(ball.getX() <= rightPaddle.getX() - rightPaddle.getWidth() - Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(ball.getYSpeed() * -1);
			}			  
			else
			{
				ball.setXSpeed(ball.getXSpeed() * -1);	
			}
		}

		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			if(leftPaddle.getY()>=0)
			{
				leftPaddle.moveUpAndDraw(graphToBack);
			}
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			if(leftPaddle.getY()<=500)
			{
				leftPaddle.moveDownAndDraw(graphToBack);
			}
		}
		if(keys[2] == true)
		{
			if(rightPaddle.getY()>=0)
			{
			rightPaddle.moveUpAndDraw(graphToBack);
			}
		}
		if(keys[3] == true)
		{
			if(rightPaddle.getY()<=500)
			{
			rightPaddle.moveDownAndDraw(graphToBack);
			}
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'A' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'K' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'A' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'K' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}