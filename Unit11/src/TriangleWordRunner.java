//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "";
		do {
			out.print("Enter a word :: ");
			String input = keyboard.next();
			TriangleWord.printTriangle(input);
			System.out.print("\nDo you want to enter more sample input? ");
			response = keyboard.next();
		}while(response.equals("y")||response.equals("Y"));
		
		
		
	}
}
/*
String x = "will";
String y = x;
x = "tom";
System.out.println(x + " " + y);
*/