package dsa.array;

public class ReverseArray
{
	public static int[] rev(int[] a)
	{
		int low=0;
		int high=a.length-1;
		int temp;
		while(high>low)
		{
			temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			low++;
			high--;
		}
		return a;
	}
	public static void main(String[] args)
	{
		int[] a= {10};
		int[] ans= rev(a);
		for(int i=0; i<ans.length; i++)
			System.out.print(ans[i]+" ");
	}

}
