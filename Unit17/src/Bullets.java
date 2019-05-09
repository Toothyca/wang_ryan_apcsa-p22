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

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		//IF IT IS NOT EMPTY
		for(Ammo pew : ammo)
		{
			pew.draw(window);
		}
	}

	public void moveEmAll()
	{
		//IF IT IS NOT EMPTY

		for(Ammo pew : ammo)
		{
			pew.move("UP");
		} 
	}

	public void cleanEmUp()
	{
		//IF IT IS NOT EMPTY

		/*
		for(Ammo pew : ammo)
		{
			if(pew.getY() <= 0)
			{
				//System.out.println(ammo.size());
				System.out.println(pew);
				//pew = new Ammo(0, 0, 0);
				System.out.println(ammo.indexOf(pew) + " " + ammo.size());
				ammo.remove(pew);
				System.out.println(ammo.indexOf(pew));
			}
		}
		*/
		for (int i = 0; i < ammo.size(); i++)
		{
			Ammo pew = ammo.get(i);
			if(pew.getY() <= 0)
			{
				ammo.remove(pew);
			}
		}
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}
