//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		String afactors = "";
		String bfactors = "";
		String cfactors = "";
		
		for (int i = 1; i < 10; i++)
		{
			if (a%i == 0)
			{
				afactors += i;
			}
		}
		for (int j = 1; j < 10; j++)
		{
			if (b%j == 0)
			{
				bfactors += j;
			}
		}
		for (int k = 1; k < 10; k++)
		{
			if (c%k == 0)
			{
				cfactors += k;
			}
		}
		for (int l = 0; l < afactors.length(); l++)
		{
			for (int m = 0; m < bfactors.length(); m++)
			{
				for (int n = 0; n < cfactors.length(); n++)
				{
					if (afactors.substring(l, l+1).equals(bfactors.substring(m, m+1)))
					{
						if (afactors.substring(l, l+1).equals(cfactors.substring(n, n+1)))
						{
							if (Integer.parseInt(afactors.substring(l, l+1)) > max)
							{
								max = Integer.parseInt(afactors.substring(l, l+1));
							}
						}
					}
				}
			}
		}
		
		return max;
	}

	public String toString()
	{
		String output="";
		for (int i = 1; i < number; i++)
		{
			for (int j = 1; j < number; j++)
			{
				for (int k = 1; k < number; k++)
				{
					if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2))
					{
						if ((i%2 != 0 && j%2 == 0 && k%2 != 0) || (i%2 == 0 && j%2 != 0 && k%2 != 0))
						{

							if (greatestCommonFactor(i, j, k) <= 1)
							{

								output += i + " " + j + " " + k + "\n";
							}
						}
					}
				}
			}
		}
		return output+"\n";
	}
}