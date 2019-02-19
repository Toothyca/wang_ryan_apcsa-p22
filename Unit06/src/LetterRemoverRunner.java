//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover case1 = new LetterRemover("I am Sam I am", 'a');
		System.out.println(case1);
		LetterRemover case2 = new LetterRemover("ssssssssxssssesssssesss", 's');
		System.out.println(case2);
		LetterRemover case3 = new LetterRemover("qwertyqwertyqwerty", 'a');
		System.out.println(case3);
		LetterRemover case4 = new LetterRemover("abababababa", 'b');
		System.out.println(case4);
		LetterRemover case5 = new LetterRemover("abaababababa", 'x');
		System.out.println(case5);
	}
}