package dsa.array;

public class ArraySortedOrNot
{
	public static String checkSorted(int[] a)
	{
		for(int i=1; i<a.length; i++)
		{
			if(a[i-1]>a[i])
				return "Not Sorted";
		}
		return "Sorted";
	}
	public static void main(String[] args)
	{
		int[] a= {10};
		System.out.println(checkSorted(a));

	}

}
