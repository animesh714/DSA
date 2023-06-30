package dsa.searching;

public class LastOccuranceRecursion
{
	public static void main(String[] args)
	{
		int[] a= {1, 2, 3,4 ,6, 6, 6,6 ,6, 7, 7,7, 8,8, 8,9};
		System.out.println(occurance(a, 0, a.length-1, 6));
	}
	public static int occurance(int[] a, int low, int high, int item)
	{
		if(low>high)
			return -1;
		int mid= (low+high)/2;
		if(item<a[mid])
			return occurance(a, low, mid-1, item);
		else if(item>a[mid])
			return occurance(a, mid+1, high, item);
		else
		{
			if(mid==a.length-1 || a[mid]!=a[mid+1])
				return mid;
			else
				return occurance(a, mid+1, high, item);
		}
	}

}
