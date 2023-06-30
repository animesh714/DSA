package dsa.array;


// This program also sees if the number of groups of zero and ones are same whose count in minimum and 
// flips that part only
public class MinimumConsecutiveFlipsMyApproach
{
	public static void flips(int[] a)
	{
		int flip=-1;
		if(a[0]==a[a.length-1])
		{
			if(a[0]==0)
				flip=1;
			else
				flip=0;
		}
		else
		{
			int count0=0;
			int count1=0;
			for(int i=0; i<a.length; i++)
			{
				if(a[i]==0)
					count0++;
				else 
					count1++;
			}
			if(count0>=count1)
				flip=1;
			else
				flip=0;
		}
		boolean flag= true;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==flip)
			{
				System.out.print(i+" ");
				flag= false;
			}
		}
		if(flag)
		{
			System.out.println("NO ELEMENTS NEEDS CONVERSION......");
		}
	}
	public static void main(String[] args)
	{
		int[] a= {1, 0, 0, 0, 1 ,0, 0, 0, 1, 0};
		int[] b= {0, 0, 0, 0, 0, 0};
		int[] c= {1, 1, 1 ,1 ,1};
		int[] d= {1, 0, 0, 0, 0};
		flips(d);
	}

}
