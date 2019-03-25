//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++)
		{
			int rando = (int) (Math.random() * 11);
			if (rando == 0)
			{
				rando = 1;
			}
			array[i] = rando;
		}
		return array;
	}
	public static void shiftEm(int[] array)
	{
		for (int i=1; i< array.length; ++i)
		   {
		      int val = array[i];
		      int j=i;
		      while(j>0&&val==7){         
		         array[j]=array[j-1];
		         j--;
		      }
		      array[j]=val;
		   }
	}
}