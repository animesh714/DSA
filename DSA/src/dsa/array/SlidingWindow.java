package dsa.array;

public class SlidingWindow
{
	public static int maxSum(int[] a, int k)
	{
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			if(i<k)
				sum+=a[i];
			else
			{
				maxSum= Math.max(maxSum, sum);
				sum=sum+a[i]-a[i-k];
			}				
		}
		return Math.max(maxSum, sum);
	}
	public static void main(String[] args)
	{
		int[] a= {1, 2, 3, 4, 5, 10};
		System.out.println(maxSum(a, 3));
	}	

}
