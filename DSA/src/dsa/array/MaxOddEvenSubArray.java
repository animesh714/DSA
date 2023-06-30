package dsa.array;

public class MaxOddEvenSubArray
{
	public static int maxArray(int[] a)
	{
		int currentLength= 1;
		int maxlength= 1;
		for(int i=1; i<a.length; i++)
		{
			if((a[i]%2==0 && a[i-1]%2!=0)||(a[i]%2!=0 && a[i-1]%2==0))
			{
				currentLength++;
				maxlength=Math.max(maxlength, currentLength);
			}
			else
				currentLength=1;
				
		}
		return maxlength;
	}
	public static void main(String[] args)
	{
		int[] a= {1, 2, 3, 3, 5, 6, 7, 7};
		System.out.println(maxArray(a));
	}
}
