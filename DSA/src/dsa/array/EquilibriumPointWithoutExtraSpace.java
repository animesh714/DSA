package dsa.array;

public class EquilibriumPointWithoutExtraSpace
{
	public static boolean checkEquilibrium(int[] a)
	{
		int rightSum= 0;
		int leftSum=0;
		for(int i=0; i<a.length; i++)
			rightSum+=a[i];
		for(int i=0; i<a.length; i++)
		{
			rightSum-=a[i];
			if(rightSum==leftSum)
				return true;
			leftSum+=a[i];
		}
		return false;
	}
	public static void main(String[] args)
	{
		int[] a= {3, 4, 8, -9, 20, 6};
		System.out.println(checkEquilibrium(a));
	}

}
