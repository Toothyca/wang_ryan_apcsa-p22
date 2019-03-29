import java.util.Random;

public class QuickSort 
{
	public static void quickSort(int[] array)
	{
		quickSort(array, 0, array.length-1);
	}
	
	private static void quickSort(int[] array, int beg, int end)
	{
		if (beg < end+1)
		{
			int p = partition(array, beg, end);
			quickSort(array, beg, p-1);
			quickSort(array, p+1, end);
		}
	}
	
	private static void swap (int[] array, int index1, int index2)
	{
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	private static int getPivot(int beg, int end)
	{
		Random rand = new Random();
		return rand.nextInt((end-beg)+1) + beg;
	}
	
	private static int partition (int[] array, int beg, int end)
	{
		swap(array, beg, getPivot(beg, end));
		int border = beg + 1;
		for (int i = border; i <= end; i++)
		{
			if (array[i] < array[beg])
			{
				swap(array, i, border++);
			}
		}
		swap(array, beg, border-1);
		return border-1;
	}
}
