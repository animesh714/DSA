package dsa.array;

public class MaximumDifference
{
	public static int findDifference(int[] a)
	{
		int min=a[0];
		int maxDiff=a[1]-a[0];
		for(int i=0; i<a.length; i++)
		{
			min= Math.min(min, a[i]);
			maxDiff= Math.max(maxDiff, a[i]-min);
		}
		return maxDiff;
	}
	public static void main(String[] args)
	{
		int[] a= {90, 10, 3, 7, 89, 87, 222};
		System.out.println(findDifference(a));
	}

}
