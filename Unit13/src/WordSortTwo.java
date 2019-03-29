//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		for (int i = 1; i < wordRay.length; i++)
		{
			String val = wordRay[i];
			int j = i;
			while(j > 0 && val.compareTo(wordRay[j-1]) < 0)
			{
				System.out.println(wordRay[j] + " and " + wordRay[j-1]);
				wordRay[j] = wordRay[j-1];
				System.out.println(wordRay[j] + " aNd " + wordRay[j-1]);
				j--;
				System.out.println(Arrays.toString(wordRay));

			}
			wordRay[j] = val;
		}
	}

	public String toString()
	{
		String output= "";
		for (int i = 0; i < wordRay.length; i++)
		{
			output += wordRay[i] + "\n";
		}
		return output+"\n\n";
	}
}