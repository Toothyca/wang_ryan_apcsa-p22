//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	int counter = 0;
    	int rowcounter = 0;
    	int columncounter = 0;
    	for(int i = 0; i < size*size; i++)
    	{
    		m[rowcounter][columncounter] = str.substring(i, i + 1);
    		counter++;
    		columncounter++;
    		if (columncounter == size)
    		{
    			columncounter = 0;
    		}
    		if (counter == size)
    		{
    			rowcounter++;
    			counter = 0;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
    	String output = "";
    	for (int i = 0; i < m.length; i++)
    	{
    		for (int j = 0; j < m[i].length; j++)
    		{
    			output += m[i][j] + " ";
    		}
    		output += "\n";
    	}
 		return output;

    }
}
