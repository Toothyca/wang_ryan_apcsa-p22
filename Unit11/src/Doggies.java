//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		if (spot < pups.length)
		{
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		int oldest = pups[0].getAge();
		int oldestpos = 0;
		for (int i = 0; i < pups.length; i++) {
			if (oldest < pups[i].getAge())
			{
				oldest = pups[i].getAge();
				oldestpos = i;
			}
		}
		return pups[oldestpos].getName();
	}

	public String getNameOfYoungest()
	{
		int youngest = pups[0].getAge();
		int youngestpos = 0;
		for (int i = 0; i < pups.length; i++) {
			if (youngest > pups[i].getAge())
			{
				youngest = pups[i].getAge();
				youngestpos = i;
			}
		}
		return pups[youngestpos].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}