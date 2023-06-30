package dsa.array;

public class LeftRotateArrayByOne
{
	public static int[] rotate(int[] a)
	{
		int temp=a[0];
		for(int i=1; i<a.length; i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		return a;
	}
	public static void main(String[] args)
	{
		int[] a= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ans= rotate(a);
		for(int a1:ans)
			System.out.print(a1+" ");
	}

}
