//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String toPrint = "";
		for(int i = 1; i < word.length()+1; i++)
		{
			toPrint = word.substring(0, i);
			for (int j = 0; j < i; j++)
			{
				System.out.print(toPrint);
			}
			System.out.println("");
		}
	}
}