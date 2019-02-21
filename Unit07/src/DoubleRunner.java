//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println("4.5,6.7,7.8,9.0");
		System.out.println("biggest = " + run + "\n");

		//add more test cases
		BiggestDouble run2 = new BiggestDouble(14.51, 6.17, 71.8, 1.0);
		System.out.println("14.51, 6.17, 71.8, 1.0");
		System.out.println("biggest = " + run2 + "\n");
		
		BiggestDouble run3 = new BiggestDouble(41.15, 816.7, 17.8, 19.0);
		System.out.println("41.15, 816.7, 17.8, 19.0");
		System.out.println("biggest = " + run3 + "\n");

		BiggestDouble run4 = new BiggestDouble(884.5, 16.7, 7.8, 9.0);
		System.out.println("884.5, 16.7, 7.8, 9.0");
		System.out.println("biggest = " + run4 + "\n");

		BiggestDouble run5 = new BiggestDouble(4.5, -456.7, 677.8, 9.0);
		System.out.println("4.5, -456.7, 677.8, 9.0");
		System.out.println("biggest = " + run5 + "\n");

		BiggestDouble run6 = new BiggestDouble(4.5, 16.7, -7.8, -9.0);
		System.out.println("4.5, 16.7, -7.8, -9.0");
		System.out.println("biggest = " + run6 + "\n");

	}
}