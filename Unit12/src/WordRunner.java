//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		//iterate through size to get the words, put in in list or some crap
		Word[] wordList = new Word[size];
		for (int i = 0; i < size; i ++)
		{
			wordList[i] = new Word(file.next());
		}
		
		boolean changed = true;
		Word temp;
		while (changed)
		{
			changed = false;
			for (int j = 0; j < wordList.length-1; j++)
			{
				if (wordList[j].compareTo(wordList[j+1]) == 1)
				{
					changed = true;
					temp = wordList[j];
					wordList[j] = wordList[j+1];
					wordList[j+1] = temp;
				}
			}
		}
		
		for (int k = 0; k < wordList.length; k++)
		{
			System.out.println(wordList[k]);
		}
	}
}

//arraylist -> add, set things, at the end know what's inside the AL