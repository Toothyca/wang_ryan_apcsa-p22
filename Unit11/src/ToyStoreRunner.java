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
		System.out.println(toysrus);
		System.out.println(toysrus.getMostFrequentToy());
		toysrus.sortToysByCount();
		System.out.println(toysrus);
		System.out.println(toysrus.getThatToy("ball"));
	}
}