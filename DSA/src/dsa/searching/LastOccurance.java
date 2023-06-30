package dsa.searching;

public class LastOccurance
{
	public static void main(String[] args)
	{
		int[] a= {1, 2, 3, 4, 4, 4,4 , 4, 5, 6, 7, 7, 7 , 8, 8 ,8 , 9, 9, 9, 9};
		System.out.println(a.length-1);
		System.out.println(occurance(a, 6));
	}
	public static int occurance(int[] a, int item)
	{
		int low=0, high=a.length-1;
		while(low<=high)
		{
			int mid= (low+high)/2;
			if(item<a[mid])
				high= mid-1;
			else if(item>a[mid])
				low= mid+1;
			else
			{
				if(mid==a.length-1 || a[mid]!=a[mid+1])
					return mid;
				else
					low= mid+1;
			}
			
		}
		return -1;
	}

}
