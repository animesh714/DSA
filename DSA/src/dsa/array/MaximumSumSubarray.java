package dsa.array;

public class MaximumSumSubarray
{
	public static int maxSum(int[] a)
	{
		int currentsum=a[0];
		int maxSum= a[0];
		for(int i=1; i<a.length; i++)
		{
			currentsum= currentsum+a[i];
			currentsum= Math.max(currentsum, a[i]);
			maxSum= Math.max(maxSum, currentsum);
		}
		return maxSum;
	}
	public static void main(String[] args)
	{
		int[] a= {-5, 1, -2, 3, -1, 2, -2, 9};
		System.out.println(maxSum(a));
	} 
}
