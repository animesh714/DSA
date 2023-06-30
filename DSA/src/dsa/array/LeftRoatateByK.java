package dsa.array;

public class LeftRoatateByK
{
	public static int[] rotate(int[] a, int k)
	{
		a= swap(a, 0, k-1);
		a= swap(a, k, a.length-1);
		a= swap(a, 0, a.length-1);
		return a;
	}
	public static int[] swap(int[] a, int low, int high)
	{
		while(high>low)
		{
			int temp= a[high];
			a[high]= a[low];
			a[low]= temp;
			high--;
			low++;
		}
		return a;
	}
	public static void main(String[] args)
	{
		int[] a= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ans = rotate(a, 4);
		for(int a1: ans)
			System.out.print(a1+" ");
	}

}
