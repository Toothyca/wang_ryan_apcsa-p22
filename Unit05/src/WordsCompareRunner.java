//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare case1 = new WordsCompare("abe", "ape");
	   System.out.println(case1);
	   WordsCompare case2 = new WordsCompare("giraffe", "gorilla");
	   System.out.println(case2);
	   WordsCompare case3 = new WordsCompare("one", "two");
	   System.out.println(case3);
	   WordsCompare case4 = new WordsCompare("fun", "funny");
	   System.out.println(case4);
	   WordsCompare case5 = new WordsCompare("123", "19");
	   System.out.println(case5);
	   WordsCompare case6 = new WordsCompare("193", "1910");
	   System.out.println(case6);
	   WordsCompare case7 = new WordsCompare("goofy", "godfather");
	   System.out.println(case7);
	   WordsCompare case8 = new WordsCompare("funnel", "fun");
	   System.out.println(case8);
	   WordsCompare case9 = new WordsCompare("ape", "ape");
	   System.out.println(case9);
	}
}

/*
char x = 'A';
x--;
System.out.println(x + 3);
*/