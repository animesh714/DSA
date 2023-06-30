package dsa.array;

public class MoveZerosToEnd
{
	public static int[] move(int[] a)
	{
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]=a[count];
				a[count]=temp;
				count++;
			}
		}
		return a;
	}
	public static void main(String[] args)
	{
		int[] a= {1, 2, 0, 0, 3, 4, 0, 5, 6, 0, 7};
		int[] ans =move(a);
		for( int i=0; i<ans.length; i++)
		{
			System.out.print(ans[i]+" ");
		}
	}

}
