package dsa.searching;

public class FirstOccurance
{
	public static void main(String[] args)
	{
		int a[] = {1,1, 1, 1, 1,1 , 2, 2, 2, 2, 3, 4, 5 ,5, 6, 7, 8, 8, 8};
		System.out.println(occurance(a, 1));
	}
	public static int occurance(int[] a, int item)
	{
		int low= 0;
		int high= a.length-1;
		while(low<=high)
		{
			int mid= (high+low)/2;
			if(a[mid]<item)
				low= mid+1;
			else if(a[mid]>item)
				high= mid-1;
			else
			{
				if(mid==0 || a[mid]!=a[mid-1])
					return mid;
				else
					high= mid-1;
			}
		}
		return -1;
	}

}
