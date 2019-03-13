//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.ArrayList; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private double numerator;
	private double denominator;
	
	//write two constructors
	public Rational()
	{
		setRational(1, 1);
	}

	public Rational(int nmtr, int dmtr)
	{
		setRational(nmtr, dmtr);
	}
	
	//write a setRational method
	public void setRational(int nmtr, int dmtr)
	{
		setNumerator(nmtr);
		setDenominator(dmtr);
	}
	

	//write  a set method for numerator and denominator
	public void setNumerator(int nmtr)
	{
		numerator = (double) nmtr;
	}
	
	public void setDenominator(int dmtr)
	{
		denominator = (double) dmtr;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 		
		//new numerator = (num1 * den2 + num2 * den1)
		
		double newnum = (this.numerator * other.denominator + other.numerator * this.denominator);
		
		//new denominator = (den1 * den2)
		
		double newden = this.denominator * other.denominator;

		numerator = newnum;
		denominator = newden;

		reduce();
	}

	private void reduce()
	{
		for (int i = 9; i > 0; i--) 
		{
			if (numerator%i == 0 && denominator%i == 0)
			{
				numerator%=i;
				denominator%=i;
			}
		}
	}

	private int gcd(int numOne, int numTwo)
	{
		ArrayList<Integer> numOneDivisors = new ArrayList<Integer>();
		ArrayList<Integer> numTwoDivisors = new ArrayList<Integer>();
		int gcd = 0;
		for (int i = 0; i < numOne; i++)
		{
			if (numOne%i==0)
			{
				numOneDivisors.add(i);
			}
		}
		for (int j = 0; j < numTwo; j++)
		{
			if (numTwo%j==0)
			{
				numTwoDivisors.add(j);
			}
		}
		for (int k = 0; k < numOneDivisors.size(); k++)
		{
			for (int l = 0; l < numTwoDivisors.size(); l++)
			{
				if (numOneDivisors.get(k)==numTwoDivisors.get(l) && numOneDivisors.get(k) > gcd)
				{
					gcd = numOneDivisors.get(k);
				}
			}
		}
		
		return gcd;
	}

	public Object clone ()
	{
		return new Rational((int) numerator, (int) denominator);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	public double getNumerator()
	{
		return numerator;
	}
	
	public double getDenominator()
	{
		return denominator;
	}
	
	
	public boolean equals( Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		return this.compareTo(other);
	}
	
	//write  toString() method
	public String toString()
	{
		return (int) numerator + "/" + (int) denominator;
	}
	
}