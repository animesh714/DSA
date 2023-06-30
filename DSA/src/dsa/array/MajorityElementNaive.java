package dsa.array;

public class MajorityElementNaive
{
	public static int majority(int[] a)
	{
		int count=1;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
					count++;
				if(count>a.length/2)
					return i;
			}
			count=1;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] a= {1, 2, 3, 4, 3, 3, 3, 3, 3};
		System.out.println(a[majority(a)]);
	}

}
