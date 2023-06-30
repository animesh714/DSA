package dsa.array;

public class MajorityElement
{
	public static int majority(int[] a)
	{
		int count=1;
		int out= 0;
		for(int i=1; i<a.length; i++)
		{
			if(a[out]==a[i])
				count++;
			else
				count--;
			if(count==0)
			{
				out=i;
				count=1;
			}
		}
		count=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[out]==a[i])
			{
				count++;
			}
			if(count>a.length/2)
				return out;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] a= {1, 6, 3, 4, 5, 6, 6, 6, 1, 6, 6};
		int ans= majority(a);
		if(ans<0)
			System.out.println("No Majority Element");
		else
			System.out.println(a[ans]);
	}

}
