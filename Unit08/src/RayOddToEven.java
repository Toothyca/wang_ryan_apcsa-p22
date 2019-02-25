//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int firstoddindex = -1;
		int firstevenindex = -1;
		for (int i = ray.length-1; i >= 0; i--)
		{
			if (ray[i] % 2 != 0)
			{
				firstoddindex = i;
			}
		}
		for (int i = ray.length-1; i >= 0; i--)
		{
			if (ray[i] % 2 == 0 && i > firstoddindex)
			{
				firstevenindex = i;
			}
		}
		if (firstoddindex == -1 || firstevenindex == -1)
		{
			return -1;
		}
		return (firstoddindex-firstevenindex)*-1;
	}
}