//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddpos = -1;
		int evenpos = -1;
		
		for (int i = ray.size()-1; i >= 0; i--)
		{
			if (ray.get(i) %2 != 0)
			{
				oddpos = i;
				for (int j = i; j < ray.size(); j++)
				{
					if (ray.get(j) %2 == 0)
					{
						evenpos = j;
					}
				}
			}
		}
		if (oddpos == -1 || evenpos == -1)
		{
			return -1;
		}
		return evenpos-oddpos;
	}
}