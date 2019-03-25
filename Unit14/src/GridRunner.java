//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals1 = {"a", "b", "c", "x", "2", "7"};
		Grid case1 = new Grid(20, 20, vals1);
		
		System.out.println("\n" + case1.findMax(vals1) + " occurs the most.\n");
		System.out.println(case1);
		
		String[] vals2 = {"noob", "gares", "sean"};
		Grid case2 = new Grid(100, 100, vals2);
		
		System.out.println("\n" + case2.findMax(vals2) + " occurs the most.\n");
		System.out.println(case2);
	}
}