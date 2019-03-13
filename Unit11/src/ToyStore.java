//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> ToyList;

	public ToyStore()
	{
		ToyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] toy = toys.split(" ");
		ArrayList<String> NameList = new ArrayList<String>();
		for (int i = 0; i < toy.length; i++)
		{
			if (!NameList.contains(toy[i]))
			{
				ToyList.add(new Toy(toy[i]));
				NameList.add(toy[i]);
			}
			else
			{
				for(int j = 0; j < ToyList.size(); j++)
				{
					if (ToyList.get(j).getName().equals(toy[i]))
					{
						ToyList.get(j).setCount(ToyList.get(j).getCount()+1);
					}
				}
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		ArrayList<String> NameList = new ArrayList<String>();
  		for (int i = 0; i < ToyList.size(); i++)
  		{
  			NameList.add(ToyList.get(i).getName());
  		}
  		return ToyList.get(NameList.indexOf(nm));
  	}
  
  	public String getMostFrequentToy()
  	{
  		
  		int max = ToyList.get(0).getCount();
  		int maxpos = 0;
  		for (int i = 0; i < ToyList.size(); i++)
  		{
  			if (max < ToyList.get(i).getCount()) {
  				max = ToyList.get(i).getCount();
  				maxpos = i;
  			}
  		}
  		return "" + ToyList.get(maxpos).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Integer> TempCountList = new ArrayList<Integer>();
  		ArrayList<Toy> TempToyList = new ArrayList<Toy>(); 
  		for (int i = 0; i < ToyList.size(); i++)
  		{
  			TempCountList.add(ToyList.get(i).getCount());
  		}
  		Collections.sort(TempCountList);
  		
  		int countcounter = 0;
  		while (countcounter < TempCountList.size()) //iterate through [1, 2, 2, 2, 4]
  		{
  	  		int toycounter = ToyList.size()-1;
  	  		while (toycounter >= 0) //while there are still toys to iterate through [sorry4, bat1, train2, teddy2, ball2]
  	  		{
  	  			if (ToyList.get(toycounter).getCount() == TempCountList.get(countcounter))
  	  			{
  	  				TempToyList.add(ToyList.get(toycounter));
  	  				ToyList.remove(toycounter);
  		  			countcounter++;
  	  			}
  	  			toycounter--;
  	  		}
  		}
  		ToyList.clear();
  		for (int k = 0; k < TempToyList.size(); k++)
  		{
  			ToyList.add(TempToyList.get(k));
  		}
  	}
  	  
	public String toString()
	{
	   return ToyList.toString();
	}
}