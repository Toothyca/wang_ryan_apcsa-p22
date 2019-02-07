//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowels = "AEIOUaeiou";
	   int pos1 = vowels.indexOf(a.substring(0, 1));
	   int pos2 = vowels.indexOf(a.substring(a.length()-1));
	   if (pos1 > -1 || pos2 > -1) {
		   return "yes";
	   } return "no";
	  }
}
/*

String vowels = "AEIOUaeiou";


char firstchar = a.charAt(0);
	   //String firststring = String.valueOf(firstchar);
		
	   if (firstchar == 'a' || firstchar == 'e' || firstchar == 'i' || firstchar == 'o' || firstchar == 'u' || firstchar == 'A' || firstchar == 'E' || firstchar == 'I' || firstchar == 'O' || firstchar == 'U') {
		   return "yes";
	   } return "no";
	
*/