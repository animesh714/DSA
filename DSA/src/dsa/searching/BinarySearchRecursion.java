package dsa.searching;

public class BinarySearchRecursion
{
	public static void main(String[] args)
	{
		int[] a= {10, 20, 30 , 40 ,50, 60};
		System.out.println(sort(a, a.length-1 ,0, 23));
	}
	public static int sort(int[] a, int high, int low, int item)
	{
		if(low>high)
			return -1;
		int mid= (low+high)/2;
		if(item==a[mid])
			return mid;
		else if(item>a[mid])
			return sort(a, high, mid+1, item);
		else
			return sort(a, mid-1, low, item);

	}

}
