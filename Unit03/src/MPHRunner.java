//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		out.print("Enter the distance :: ");
		int dist2 = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs2 = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins2 = keyboard.nextInt();

		MilesPerHour test2 = new MilesPerHour(dist2, hrs2, mins2);
		test2.calcMPH();
		test2.print();
		
		out.print("Enter the distance :: ");
		int dist3 = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs3 = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins3 = keyboard.nextInt();

		MilesPerHour test3 = new MilesPerHour(dist3, hrs3, mins3);
		test3.calcMPH();
		test3.print();
		
		out.print("Enter the distance :: ");
		int dist4 = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs4 = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins4 = keyboard.nextInt();

		MilesPerHour test4 = new MilesPerHour(dist4, hrs4, mins4);
		test4.calcMPH();
		test4.print();
	}
}