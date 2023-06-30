package dsa.recursion;

public class SubsetSum
{
	public static int count(int[] a, int sum, int currentSum, int i)
	{
		if(i==a.length)
		{
			if(currentSum==sum)
				return 1;
			else
				return 0;				
		}
		return (count(a, sum, currentSum, i+1)+count(a, sum, currentSum+a[i], i+1));
		
	}
	public static void main(String[] args)
	{
		int[] a= {10, 20, 15, 15, 10, 5};
		System.out.println(count(a, 25, 0, 0));
	}

}
