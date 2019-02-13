//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.ArrayList;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() 
   {
	   number = 0;
   }
   public Perfect(int input)
   {
	   setNumber(input);
	   isPerfect();
   }
	//add a set method
   public void setNumber(int input)
   {
	   number = input;
   }
	public boolean isPerfect()
	{
		int sum = 0;
		for (int i = 1; i < number; i ++)
		{
			if (number % i == 0)
			{
				sum += i;
			}
		}
		if (number % sum == 0)
		{
			return true;
		}

		return false;
	}

	//add a toString
	public String toString()
	{
		if (isPerfect())
		{
			return number + " is perfect.";
		} return number + " is not perfect. ";
	}
	
}