//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables
	private String name;
	private int size;
	
	//add a constructor
	public Skeleton()
	{
		name = "";
		size = 0;
	}
	
	public Skeleton(String nm, int sz)
	{
		name = nm;
		size = sz;
	}
	//add code to implement the Monster interface
	public String getName()
	{
		return name;
	}
	
	public int getHowBig()
	{
		return size;
	}
	
	public boolean isBigger(Monster other)
	{
		return (this.size > other.getHowBig());
	}
	
	public boolean isSmaller(Monster other)
	{
		return (this.size < other.getHowBig());
	}
	
	public boolean namesTheSame(Monster other)
	{
		return (this.name.equals(other.getName()));
	}
	

	//add a toString
	public String toString()
	{
		return getName() + " " + getHowBig();
	}
}