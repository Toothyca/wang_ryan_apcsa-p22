//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		String first = "not equal";
		String second = "Not Equal";
		for (int i = 0; i < str.length(); i++) {
			first = str.substring(i, i+1);
			if (first.equals(second)) {
				count++;
			}
			second = str.substring(i, i+1);
		}
		return count;
	}
}