package dsa.array;

public class RemoveDuplicatesFormSorted
{
	public static int remove(int[] a)
	{
		int dup=a[0];
		int count=1;
		int tempIndex=1;
		for(int i=1; i< a.length; i++)
		{
			if(a[i]!=dup)
			{
				count++;
				dup=a[i];
				a[tempIndex]=a[i];
				tempIndex++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		int[] a= {10, 10, 20, 20, 30, 40, 40, 50, 60, 60, 62};
		int ans= remove(a);
		System.out.println(ans);
		for(int i=0; i<a.length; i++ )
			System.out.print(a[i]+" ");
	}

}
