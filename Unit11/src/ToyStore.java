//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> ToyList;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		ArrayList<Toy> ToyList = new ArrayList<Toy>();
		String[] toy = toys.split(" ");
		for (int i = 0; i < toy.length; i++)
		{
			if (!ToyList.contains(toy[i]))
			{
				ToyList.add(new Toy(toy[i]));
			}
			else
			{
				for(int j = 0; j < ToyList.size(); j++)
				{
					if (ToyList.get(j).equals(toy))
					{
						ToyList.get(j).setCount(ToyList.get(j).getCount()+1);
					}
				}
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}
  	  
	public String toString()
	{
		String output = "";
		for (int i = 0; i < ToyList.size(); i++)
		{
			output += Toylist.get(i);
		}
	   return "";
	}
}