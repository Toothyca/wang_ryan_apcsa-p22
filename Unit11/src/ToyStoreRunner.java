//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore toysrus = new ToyStore();
		toysrus.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		
		
		String toSplit = "sorry bat sorry sorry sorry train train teddy teddy ball ball";
		String[] toy = toSplit.split(" ");
		System.out.println(Arrays.toString(toy));
	}
}