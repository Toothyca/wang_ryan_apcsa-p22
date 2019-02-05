//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		System.out.println("0 is odd :: " + NumberVerify.isOdd(0));
		System.out.println("0 is even :: " + NumberVerify.isEven(0));
		
		System.out.println("100000 is odd :: " + NumberVerify.isOdd(100000));
		System.out.println("100000 is even :: " + NumberVerify.isEven(100000));
		
		System.out.println("-100001 is odd :: " + NumberVerify.isOdd(100001));
		System.out.println("-100001 is even :: " + NumberVerify.isEven(100001));
		
		System.out.println("-850 is odd :: " + NumberVerify.isOdd(-850));
		System.out.println("-850 is even :: " + NumberVerify.isEven(-850));
	}
}