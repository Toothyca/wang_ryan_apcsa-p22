//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
		toString();
	}

	public void setPlayers(String player)
	{
		switch (player)
		{
		case "R":
			playChoice = "rock";
			break;
		case "P":
			playChoice = "paper";
			break;
		case "S":
			playChoice = "scissors";
			break;
		}
		
		int randval = (int) (Math.random() * 3);
		switch (randval)
		{
		case 0:
			compChoice = "rock";
			break;
		case 1:
			compChoice = "paper";
			break;
		case 2:
			compChoice = "scissors";
			break;
		}
	}

	public String determineWinner()
	{
		String winner="";
		
		
		if (playChoice.equals(compChoice))
		{
			winner = "!Draw Game!";
		}
		
		else if (playChoice.equals("rock"))
		{
			if (compChoice.equals("scissors"))
			{
				winner = "!Player wins <<Rock Breaks Scissors>>!";
			}
			else if (compChoice.equals("paper"))
			{
				winner = "!Computer wins <<Paper Covers Rock>>!";
			}
		}
		else if (playChoice.equals("scissors"))
		{
			if (compChoice.equals("rock"))
			{
				winner = "!Computer wins <<Rock Breaks Scissors>>!";
			}
			else if (compChoice.equals("paper"))
			{
				winner = "!Player wins <<Scissors Cuts Paper>>!";
			}
		}
		else if (playChoice.equals("paper"))
		{
			if (compChoice.equals("scissors"))
			{
				winner = "!Computer wins <<Scissors Cuts Paper>>!";
			}
			else if (compChoice.equals("rock"))
			{
				winner = "!Player wins <<Paper Covers Rock>>!";
			}
		}
		
		return winner;
	}

	public String toString()
	{
		String output= "player had " + playChoice + "\ncomputer had " + compChoice + "\n" + determineWinner();
		return output;
	}
}

//for loops, while loops