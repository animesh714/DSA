package dsa.array;

public class ArrayInThreePartsOfEqualSumWithoutExtraSpace
{
	public static boolean check(int[] a)
	{
		int sum=0;
		int sumOfparts;
		for(int i=0; i<a.length; i++)
			sum+=a[i];
		if(sum%3!=0)
			return false;
		else
			sumOfparts=sum/3;
		int ls=0;
		int ms=0;
		int rs=0;
		int checkCount=0;
		for(int i=0; i<a.length; i++)
		{
			if(checkCount==0)
			{
				ls+=a[i];
				if(ls==sumOfparts)
					++checkCount;
			}
			else if(checkCount==1)
			{
				ms+= a[i];
				if(ms==sumOfparts)
					++checkCount;
			}
			else
			{
				rs+=a[i];
				if(rs==sumOfparts && i==a.length-1)
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		int[] a= {6, 2, 6, 2, 1, 1, 2, 4};
		System.out.println(check(a));
	}

}
