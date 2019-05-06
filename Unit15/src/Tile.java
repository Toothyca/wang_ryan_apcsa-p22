import java.awt.Color;
import java.awt.Graphics;

public class Tile extends Block
{
	private String side;
	
	public Tile(int x, int y, int w, int h)
	{
		super(x, y, w, h);
	}
	
	public Tile(int x, int y, int w, int h, String s)
	{
		super(x, y, w, h);
		side = s;
	}
	
	public void disappear(Graphics window)
	   {
		   draw(window, Color.white);
		   setWidth(0);
		   setHeight(0);
	   }
	
	public String getSide()
	{
		return side;
	}
}
