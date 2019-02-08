//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality case1 = new StringEquality("hello", "goodbye");
		System.out.println(case1);
		StringEquality case2 = new StringEquality("one", "two");
		System.out.println(case2);
		StringEquality case3 = new StringEquality("three", "four");
		System.out.println(case3);
		StringEquality case4 = new StringEquality("TCEA", "UIL");
		System.out.println(case4);
		StringEquality case5 = new StringEquality("State", "Champions");
		System.out.println(case5);
		StringEquality case6 = new StringEquality("ABC", "ABC");
		System.out.println(case6);
		StringEquality case7 = new StringEquality("ABC", "CBA");
		System.out.println(case7);
		StringEquality case8 = new StringEquality("ABC", "abc");
		System.out.println(case8);
		StringEquality case9 = new StringEquality("Same", "Same");
		System.out.println(case9);
	}
}
//calling a method will call whatever constructor it was created with