//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {	
	   Scanner keyboard = new Scanner(System.in);
	   System.out.print("Enter an integer:: ");
	   int newnumb = keyboard.nextInt();
	   Triples case1 = new Triples(newnumb);
	   System.out.println(case1);

	}
}