//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		

		//-1 = 1st comes after 2nd
		if (word.length() > rhs.toString().length())
		{
			return 1;
		}
		if (word.length() < rhs.toString().length())
		{
			return -1;
		}
		if (word.length() == rhs.toString().length())
		{
			if (word.compareTo(rhs.toString()) > 0)
			{
				return 1;
			}
			if (word.compareTo(rhs.toString()) < 0)
			{
				return -1;				
			}
			if (word.compareTo(rhs.toString()) == 0)
			{
				return 0;
			}
			
		}
		return 415;
	}

	public String toString()
	{
		return word;
	}
}