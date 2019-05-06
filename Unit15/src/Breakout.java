//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class Breakout extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys;
	private boolean win;
	private BufferedImage back;
	
	private Tile ltile1, ltile2, ltile3, ltile4, ltile5;
	private Tile mtile1, mtile2, mtile3, mtile4, mtile5, mtile6, mtile7;
	private Tile rtile1, rtile2, rtile3, rtile4, rtile5;
	private Tile btile1, btile2, btile3, btile4, btile5, btile6, btile7;

	
	private ArrayList<Tile> tiles;
	
	private int level;

	public Breakout()
	{
		//set up all variables related to the game
		ball = new Ball(400, 150, 1, 1, Color.blue);
		//ball = new BlinkyBall(400, 300, 10, 10, Color.blue, 2, 1);
		//ball = new SpeedUpBall(400, 300, 10, 10, Color.blue, 1, 1);

		paddle = new Paddle(370, 300, 40, 40, Color.orange, 2);
		set();
		keys = new boolean[4];

		win = false;
		
		level = 0;
    
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
		paddle.draw(graphToBack);
		ltile1.draw(graphToBack);
		ltile2.draw(graphToBack);
		ltile3.draw(graphToBack);
		ltile4.draw(graphToBack);
		ltile5.draw(graphToBack);
		
		mtile1.draw(graphToBack);
		mtile2.draw(graphToBack);
		mtile3.draw(graphToBack);
		mtile4.draw(graphToBack);
		
		mtile5.draw(graphToBack);
		mtile6.draw(graphToBack);
		mtile7.draw(graphToBack);

		rtile1.draw(graphToBack);
		rtile2.draw(graphToBack);
		rtile3.draw(graphToBack);
		rtile4.draw(graphToBack);
		rtile5.draw(graphToBack);
		
		btile1.draw(graphToBack);
		btile2.draw(graphToBack);
		btile3.draw(graphToBack);
		btile4.draw(graphToBack);
		
		btile5.draw(graphToBack);
		btile6.draw(graphToBack);
		btile7.draw(graphToBack);

		if(tiles.size() == 0)
		{
			if(win == false && level == 0)
			{
				set();
				level++;
				graphToBack.setColor(Color.red);
				graphToBack.setFont(new Font("TimesRoman", Font.PLAIN, 100)); 
				graphToBack.drawString("Round 2!1one!!", 82, 300);
			}
			else
			{
				graphToBack.setColor(Color.red);
				graphToBack.setFont(new Font("TimesRoman", Font.PLAIN, 100)); 
				graphToBack.drawString("You're winner!", 100, 300);
				gameWin();
			}
		}
		
		for(int i = 0; i < tiles.size(); i++)
		{
			Tile tile = tiles.get(i);
			if (tile.getSide().equals("l"))
			{
				if(ball.getX() <= tile.getX() + tile.getWidth() + Math.abs(ball.getXSpeed())
				&& (ball.getY() >= tile.getY()
				&& ball.getY() <= tile.getY() + tile.getHeight()
				|| ball.getY() + ball.getHeight() >= tile.getY()
				&& ball.getY() + ball.getHeight() < tile.getY() + tile.getHeight()))
				{
					tiles.remove(tile);
					tile.disappear(graphToBack);;
					
					if(ball.getX() <= tile.getX() + tile.getWidth() - Math.abs(ball.getXSpeed()))
					{
						ball.setYSpeed(ball.getYSpeed() * -1);
					}			  
					else
					{
						ball.setXSpeed(ball.getXSpeed() * -1);	
					}

				}
			}
			else if (tile.getSide().equals("r"))
			{
				if(ball.getX() >= tile.getX() + Math.abs(ball.getXSpeed())
				&& (ball.getY() >= tile.getY()
				&& ball.getY() <= tile.getY() + tile.getHeight()
				|| ball.getY() + ball.getHeight() >= tile.getY()
				&& ball.getY() + ball.getHeight() < tile.getY() + tile.getHeight()))
				{
					tiles.remove(tile);
					tile.disappear(graphToBack);;
					
					if(ball.getX() <= tile.getX() - Math.abs(ball.getXSpeed()))
					{
						ball.setYSpeed(ball.getYSpeed() * -1);
					}			  
					else
					{
						ball.setXSpeed(ball.getXSpeed() * -1);	
					}
				}
			}
			else if (tile.getSide().equals("m") || tile.getSide().equals("b"))
			{
				if((ball.getX() <= tile.getX() + tile.getWidth() + Math.abs(ball.getXSpeed()) && ball.getX() > tile.getX())
				&& (ball.getY() >= tile.getY() && ball.getY() <= tile.getY() + tile.getHeight()
				|| ball.getY() + ball.getHeight() >= tile.getY()
				&& ball.getY() + ball.getHeight() < tile.getY() + tile.getHeight()))
				{
					tiles.remove(tile);
					tile.disappear(graphToBack);;
					
					if(ball.getY() <= tile.getY() - Math.abs(ball.getYSpeed()) || ball.getY() > tile.getY() + tile.getHeight() + Math.abs(ball.getYSpeed()))
					{
						ball.setYSpeed(ball.getYSpeed() * -1);
					}			  
					else
					{
						ball.setXSpeed(ball.getXSpeed() * -1);	
					}
				}
			}
		}
		
		
		//see if the ball hits the top or bottom wall
		//see if ball hits left wall or right wall
		
		
		if(!(ball.getX()>=0 && ball.getX()<= 775))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		if(!(ball.getY()>=0 && ball.getY()<= 550))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		
		
		
		//see if the ball hits the left paddle
		
		
		if(ball.getX() <= paddle.getX() + paddle.getWidth() + Math.abs(ball.getXSpeed()) && ball.getX() > paddle.getX() + paddle.getWidth() - Math.abs(ball.getXSpeed()) && ball.getY() <= paddle.getY() + paddle.getHeight() && ball.getY() > paddle.getY())
		{
				ball.setXSpeed(ball.getXSpeed() * -1);
				//Color randcolor = new Color((int)(Math.random() * 0x1000000));
				//paddle.setColor(randcolor);
		}
		
		//right
		
		if(ball.getX() <= paddle.getX() + Math.abs(ball.getXSpeed()) && ball.getX() > paddle.getX() - Math.abs(ball.getXSpeed()) && ball.getY() <= paddle.getY() + paddle.getHeight() && ball.getY() > paddle.getY())
		{
				ball.setXSpeed(ball.getXSpeed() * -1);
		}
		
		//top
		
		if(ball.getX() >= paddle.getX() + Math.abs(ball.getXSpeed()) && ball.getX() < paddle.getX() + paddle.getWidth() - Math.abs(ball.getXSpeed()) && ball.getY() <= paddle.getY() + Math.abs(ball.getYSpeed()) && ball.getY() > paddle.getY() - Math.abs(ball.getYSpeed()))
		{
				ball.setYSpeed(ball.getYSpeed() * -1);
		}
		
		//bottom
		
		if(ball.getX() >= paddle.getX() + Math.abs(ball.getXSpeed()) && ball.getX() < paddle.getX() + paddle.getWidth() - Math.abs(ball.getXSpeed()) && ball.getY() <= paddle.getY() + paddle.getHeight() + Math.abs(ball.getYSpeed()) && ball.getY() > paddle.getY() + paddle.getHeight() - Math.abs(ball.getYSpeed()))
		{
				ball.setYSpeed(ball.getYSpeed() * -1);
		}

		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			if(paddle.getY()>=0)
			{
				paddle.moveUpAndDraw(graphToBack);
			}
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			if(paddle.getY()<=520)
			{
				paddle.moveDownAndDraw(graphToBack);
			}
		}
		if(keys[2] == true)
		{
			if(paddle.getX()>=0)
			{
			paddle.moveLeftAndDraw(graphToBack);
			}
		}
		if(keys[3] == true)
		{
			if(paddle.getX()<=740)
			{
			paddle.moveRightAndDraw(graphToBack);
			}
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

   public void gameWin()
   {
	   win = true;
   }
   
   public void set()
   {
	   ltile1 = new Tile(20, 90, 20, 120, "l");
		ltile2 = new Tile(20, 230, 20, 120, "l");
		ltile3 = new Tile(20, 370, 20, 120, "l");
		ltile4 = new Tile(80, 150, 20, 120, "l");
		ltile5 = new Tile(80, 290, 20, 120, "l");
		
		mtile1 = new Tile(90, 20, 120, 20, "m");
		mtile2 = new Tile(250, 20, 120, 20, "m");
		mtile3 = new Tile(410, 20, 120, 20, "m");
		mtile4 = new Tile(570, 20, 120, 20, "m");
		
		mtile5 = new Tile(170, 80, 120, 20, "m");
		mtile6 = new Tile(330, 80, 120, 20, "m");
		mtile7 = new Tile(500, 80, 120, 20, "m");
		
		rtile1 = new Tile(740, 90, 20, 120, "r");
		rtile2 = new Tile(740, 230, 20, 120, "r");
		rtile3 = new Tile(740, 370, 20, 120, "r");
		rtile4 = new Tile(680, 150, 20, 120, "r");
		rtile5 = new Tile(680, 290, 20, 120, "r");
		
		btile1 = new Tile(90, 520, 120, 20, "b");
		btile2 = new Tile(250, 520, 120, 20, "b");
		btile3 = new Tile(410, 520, 120, 20, "b");
		btile4 = new Tile(570, 520, 120, 20, "b");
		
		btile5 = new Tile(170, 480, 120, 20, "b");
		btile6 = new Tile(330, 480, 120, 20, "b");
		btile7 = new Tile(500, 480, 120, 20, "b");
		
		
		tiles =  new ArrayList<Tile>();
		tiles.add(ltile1);
		tiles.add(ltile2);
		tiles.add(ltile3);
		tiles.add(ltile4);
		tiles.add(ltile5);
		tiles.add(mtile1);
		tiles.add(mtile2);
		tiles.add(mtile3);
		tiles.add(mtile4);
		tiles.add(mtile5);
		tiles.add(mtile6);
		tiles.add(mtile7);
		tiles.add(rtile1);
		tiles.add(rtile2);
		tiles.add(rtile3);
		tiles.add(rtile4);
		tiles.add(rtile5);
		tiles.add(btile1);
		tiles.add(btile2);
		tiles.add(btile3);
		tiles.add(btile4);
		tiles.add(btile5);
		tiles.add(btile6);
		tiles.add(btile7);
   }
   
	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'A' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'A' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(win == false)//true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}