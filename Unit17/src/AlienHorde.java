//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien ET : aliens)
		{
			ET.draw(window);
		}
	}

	public void moveEmAll()
	{
		for(Alien ET : aliens)
		{
			int rng = (int) (Math.random()*2);
			if (rng == 0)
			{
				rng = (int) (Math.random()*2);
				if (ET.getX() >= 0 && rng == 0)
				{
					ET.move("LEFT");
				}
				else if (ET.getX() <= 735 && rng == 1)
				{
					ET.move("RIGHT");
				}
			}
			else if (rng == 1)
			{
				rng = (int) (Math.random()*2);
				if (ET.getY() >= 5 && rng == 0)
				{
					ET.move("UP");
				}
				else if (ET.getY() <= 250 && rng == 1)
				{
					ET.move("DOWN");
				}
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i = 0; i < aliens.size(); i++)
		{
			Alien selectedAlien = aliens.get(i);
			for(Ammo bullet : shots)
			{
				if((bullet.getX() <= selectedAlien.getX() + selectedAlien.getWidth() + Math.abs(bullet.getSpeed()) && bullet.getX() > selectedAlien.getX())
						&& (bullet.getY() >= selectedAlien.getY() && bullet.getY() <= selectedAlien.getY() + selectedAlien.getHeight()
						|| bullet.getY() + bullet.getHeight() >= selectedAlien.getY()
						&& bullet.getY() + bullet.getHeight() < selectedAlien.getY() + selectedAlien.getHeight()))
				{
					selectedAlien = new Alien(0, 0, 0, 0, 0);
					aliens.remove(selectedAlien);
				}
			}
		}
	}

	public String toString()
	{
		return " " + aliens.size();
	}
}
