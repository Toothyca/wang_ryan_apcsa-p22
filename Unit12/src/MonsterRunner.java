//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "y";
		
		do {
			//ask for name and size
			out.print("Enter 1st monster's name : ");
			String name1 = keyboard.next();
			out.print("Enter 1st monster's size : ");
			int size1 = keyboard.nextInt();
			//instantiate monster one
			Skeleton monster1 = new Skeleton(name1, size1);
			//ask for name and size
			out.print("Enter 2st monster's name : ");
			String name2 = keyboard.next();
			out.print("Enter 2st monster's size : ");
			int size2 = keyboard.nextInt();
			//instantiate monster two
			Skeleton monster2 = new Skeleton(name2, size2);
			
			System.out.println("\nMonster 1 - " + monster1);
			System.out.println("monster 2 - " + monster2);
			
			if (monster1.isBigger(monster2))
			{
				System.out.println("\nMonster one is bigger than Monster two");
			}
			else if (monster1.isSmaller(monster2))
			{
				System.out.println("\nMonster one is smaller than Monster two");
			}
			
			if (monster1.namesTheSame(monster2))
			{
				System.out.println("\nMonster one has the same name as Monster two");
			}
			else
			{
				System.out.println("\nMonster one does not  have the same name as Monster two");
			}
			
			
			out.print("\nDo you want to enter in more monsters? :: ");
			response = keyboard.next();
		} while (response.equals("y") || response.equals("Y"));
		
	}
}