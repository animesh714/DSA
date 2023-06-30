package dsa.array;

public class LeadersOfAnArray
{
	public static void findLeaders(int[] a)
	{
		int leader=a[a.length-1];
		for(int i=a.length-1; i>=0; i--)
			if(leader<a[i])
			{
				leader= a[i];
				System.out.print(a[i]+" ");
			}
	}
	public static void main(String[] args)
	{
		int[] a= {10, 2, 3, 6, 8, 2, 1, 0};
		findLeaders(a);
	}

}
