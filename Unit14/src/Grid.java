//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				String toInput = vals[(int) (Math.random() * vals.length)];
				grid[i][j] = toInput;
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int[] valsCount = new int[vals.length];
		for (int i = 0; i < valsCount.length; i++)
		{
			valsCount[i] = countVals(vals[i]);
		}
		
		int max = valsCount[0];
		int maxpos = 0;
		
		for (int m = 0; m < valsCount.length; m++)
		{
			System.out.println(vals[m] + " count is " + valsCount[m]);

			if (valsCount[m] > max)
			{
				max = valsCount[m];
				maxpos = m;
			}
		}
		
		return vals[maxpos];
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[i].length; j++)
			{
				if (grid[i][j] == val)
				{
					count++;
				}
			}
		}
		return count;
	}
	
	//display the grid
	public String toString()
	{
		String output= "";
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[i].length; j++)
			{
				output+= grid[i][j] + " ";
			}
			output += "\n";
		}
		return output;
	}
}