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
		String output="";
		
		int origamount = amount;
		int placeamount = amount;
		int placeamount2 = amount;
		char origchar = letter;
		int placechar = letter;
		int placechar2 = letter;
		int vertamount = amount;
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for (int i = 0; i < amount; i ++) //columns
		{
			placeamount = amount;
			vertamount = amount;
			placechar = letter;
			placechar2 = '@';
			for (int j = 0; j < amount; j++) //rows
			{
				output += letter;
			}
			vertamount = placeamount2 - 1;
			placeamount2--;
			for (int k = 0; k < vertamount; k++) //prints additional blocks
			{
				output += " ";
				amount = placeamount - 1;
				placeamount--;
				if (alphabet.indexOf(letter) < 0 || alphabet.indexOf(placechar + 1) < 0)
				{
					letter = 'A';
					letter = (char) (placechar2 + 1);
					placechar2 = letter;
					placechar++;
				}
				else
				{
					letter = (char) (placechar + 1);
					placechar++;
				}
				for (int l = 0; l < amount; l++) //prints letters in additional blocks
				{
					output += letter;
				}
				amount = origamount;
				letter = origchar;
			}
			amount = origamount;
			letter = origchar;
			output += "\n";
		}
		
		return output;
	}
}
//booleans, nested loops