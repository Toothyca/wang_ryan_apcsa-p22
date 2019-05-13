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
			ET.move("LEFT");
			if (ET.getX() < 10 || ET.getX() > 735)
			{
				ET.setSpeed(ET.getSpeed()*-1);
				int current = ET.getY();
				while(Math.abs(ET.getY() - current) < 50)
				{
					if (ET.getX() < 10)
					{
						ET.move("UP");

					}
					else
					{
						ET.move("DOWN");

					}
				}
			}
			if (ET.getY() <= 500)
			{
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
					aliens.remove(selectedAlien);
					selectedAlien.setPos(900, 900);
					//shots.getList().ammoRemove(bullet);
				}
			}
		}
	}
	
	public List<Alien> getList()
	{
		return aliens;
	}
	

	public String toString()
	{
		return " " + aliens.size();
	}
}
