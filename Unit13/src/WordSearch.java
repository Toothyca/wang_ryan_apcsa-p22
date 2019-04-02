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
    	boolean found = false;
    	for (int r = 0; !found && r < m.length; r++)
    	{
    		for (int c = 0; !found && c < m[r].length; c++)
    		{
    			if (m[r][c].equals(word.substring(0, 1)))
    			{
    				found = (checkRight(word, r, c) || checkLeft(word, r, c) || checkUp(word, r, c)
    						|| checkDown(word, r, c) || checkDiagUpRight(word, r, c) || checkDiagUpLeft(word, r, c) 
    						|| checkDiagDownRight(word, r, c) || checkDiagDownLeft(word, r, c));
    			}
    		}
    	}
    	return found;
    }

	public boolean checkRight(String w, int r, int c)
   {
		String word = "";
		for (int i = c; i < m[r].length; i++)
		{
			word += m[r][i];
			if (word.equals(w))
			{
				return true;
			}
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String word = "";
		for (int i = c; i >= 0; i--)
		{
			word += m[r][i];
			if (word.equals(w))
			{
				return true;
			}
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String word = "";
		for (int i = r; i >= 0; i--)
		{
			word += m[i][c];
			if (word.equals(w))
			{
				return true;
			}
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		String word = "";
		for (int i = r; i < m.length; i++)
		{
			word += m[i][c];
			if (word.equals(w))
			{
				return true;
			}
		}
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String word = "";
		for (int i = r, j = c; i >= 0 && j < m[i].length; i--, j++)
		{
			word += m[i][j];
			if (word.equals(w))
			{
				return true;
			}
		}
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String word = "";
		for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
		{
			word += m[i][j];
			if (word.equals(w))
			{
				return true;
			}
		}
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String word = "";
		for (int i = r, j = c; i < m.length && j >= 0; i++, j--)
		{
			word += m[i][j];
			if (word.equals(w))
			{
				return true;
			}
		}
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String word = "";
		for (int i = r, j = c; i < m.length && j < m[i].length; i++, j++)
		{
			word += m[i][j];
			if (word.equals(w))
			{
				return true;
			}
		}
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
