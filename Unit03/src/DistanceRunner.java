//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
		Distance distance = new Distance(x1, y1, x2, y2);
		
		out.print("Enter X1 :: ");
		int x12 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int y12 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int x22 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int y22 = keyboard.nextInt();
		Distance distance2 = new Distance(x12, y12, x22, y22);
		
		out.print("Enter X1 :: ");
		int x13 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int y13 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int x23 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int y23 = keyboard.nextInt();
		Distance distance3 = new Distance(x13, y13, x23, y23);
	}
}