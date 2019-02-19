//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String val;
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
			String encore = "";
			
			//read in the player value
			
			while (!encore.equals("n"))
			{
				out.print("type in your prompt [R,P,S] :: ");
				val = keyboard.next();
				RockPaperScissors game = new RockPaperScissors(val);
				System.out.println(game);
				System.out.println("Do you want to play again? ");
				encore = keyboard.next();
			}
			
	}
}



