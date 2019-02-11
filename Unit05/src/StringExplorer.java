/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		int pos = sample.indexOf("slow");
		if(pos != -1)
		   System.out.println("slow is found at position " + pos);
		else
		   System.out.println("slow is not found");

		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		String sample2 = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		int index = sample2.indexOf("the", 0);
		int previous = index;
		System.out.print("The word \"the\" is present at these indexes: " );
		
		for (int iteration = 0; iteration < sample2.length(); iteration++) {
			previous = index;
			index = sample2.indexOf("the", iteration);
			if (previous != index && index != -1 && previous != -1) {
				System.out.print (index + " ");
			}
		}
		
		System.out.println(index);

	}

}
