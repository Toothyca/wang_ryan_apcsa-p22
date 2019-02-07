//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a word :: ");
		String word1 = keyboard.next();
		StringOddOrEven word1a = new StringOddOrEven(word1);
		System.out.println(word1a.toString());
		
		out.print("Enter a word :: ");
		String word2 = keyboard.next();
		StringOddOrEven word2a = new StringOddOrEven(word2);
		System.out.println(word2a.toString());
		
		out.print("Enter a word :: ");
		String word3 = keyboard.next();
		StringOddOrEven word3a = new StringOddOrEven(word3);
		System.out.println(word3a.toString());
		
		out.print("Enter a word :: ");
		String word4 = keyboard.next();
		StringOddOrEven word4a = new StringOddOrEven(word4);
		System.out.println(word4a.toString());
		
		out.print("Enter a word :: ");
		String word5 = keyboard.next();
		StringOddOrEven word5a = new StringOddOrEven(word5);
		System.out.println(word5a.toString());
		
		out.print("Enter a word :: ");
		String word6 = keyboard.next();
		StringOddOrEven word6a = new StringOddOrEven(word6);
		System.out.println(word6a.toString());
		
		out.print("Enter a word :: ");
		String word7 = keyboard.next();
		StringOddOrEven word7a = new StringOddOrEven(word7);
		System.out.println(word7a.toString());
		
		out.print("Enter a word :: ");
		String word8 = keyboard.next();
		StringOddOrEven word8a = new StringOddOrEven(word8);
		System.out.println(word8a.toString());
	}
}