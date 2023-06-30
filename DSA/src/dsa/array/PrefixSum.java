package dsa.array;

public class PrefixSum
{
	public static int[] arraySum(int[] a)
	{
		int sum=0;
		int[] ans= new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			sum+=a[i];
			ans[i]=sum;
		}
		return ans;
	}
	public static int getSum(int[] a, int begin, int end)
	{
		if(begin==0)
			return a[end];
		else
			return a[end]-a[begin-1];
	}
	public static void main(String[] args)
	{
		int[] a= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		a= arraySum(a);
		System.out.println(getSum(a, 0, 5));
		System.out.println(getSum(a, 2, 5));
		System.out.println(getSum(a, 6, 9));
		System.out.println(getSum(a, 0, 3));
		System.out.println(getSum(a, 7, 8));
	}

}
