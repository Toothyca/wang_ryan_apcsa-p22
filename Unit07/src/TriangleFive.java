//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
		toString();
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		for (int j = 0; j <= amount; j++)
		{
			for (int k = 0; k < amount; k++) 
			{
				for (int i = 0; i < amount; i++)
				{
					System.out.print(letter);
				}
				//System.out.println("");
			}
			amount -= 1;
		}
		
		String output="";
		return output;
	}
}