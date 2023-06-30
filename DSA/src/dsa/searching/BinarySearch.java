package dsa.searching;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int[] a= {10, 20, 30 , 40 ,50, 60};
		System.out.println(sort(a, 20));
	}
	public static int sort(int[] a, int item)
	{
		int low= 0; 
		int high= a.length-1;
		while(high>=low)
		{
			int mid= (low+high)/2;
			if(a[mid]==item)
				return mid;
			else if(item<a[mid])
				high= mid-1;
			else
				low= mid+1;
		}
		return -1;
	}

}
