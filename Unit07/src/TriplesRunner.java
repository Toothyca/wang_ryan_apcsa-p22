//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class TriplesRunner
{
   public static void main(String args[])
   {	
	   for (int i = 0; i < 10000; i ++) {
		   int randval = (int) (Math.random() * 3);
		   System.out.println(randval);
	   }
	}
}