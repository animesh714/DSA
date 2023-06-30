package dsa.array;

public class MaximumCircularSumSubarray 
{	
	public static int maxSum(int[] a)
	{
		int curr_max=a[0];
		int max=a[0];
		for(int i=1; i<a.length; i++)
		{
			curr_max=Math.max(curr_max+a[i], a[i]);
			max= Math.max(curr_max, max);
		}
		return max;
	}
	public static int maxCircularSum(int[] a)
	{
		int maxFromNormalArray= maxSum(a);
		if(maxFromNormalArray<=0)
			return maxFromNormalArray;
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum+=a[i];
			a[i]= -a[i];
		}
		int circularSum=sum+maxSum(a);
		return Math.max(maxFromNormalArray, circularSum);
	}
	public static void main(String[] args)
	{
		int[] a= {1, -2, -3, 4, -10, 12, 7};
		System.out.println(maxCircularSum(a));
	}

}
