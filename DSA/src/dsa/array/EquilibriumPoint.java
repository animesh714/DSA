package dsa.array;

public class EquilibriumPoint
{
	public static boolean checkEquilibrium(int[] a)
	{
		int[] left= new int[a.length];
		int[] right= new int[a.length];
		left[0]=a[0];
		right[a.length-1]=a[a.length-1];
		for(int i=1; i<a.length; i++)
		{
			left[i]=left[i-1]+a[i];
			right[a.length-1-i]= right[a.length-i]+a[a.length-1-i];
		}
		print(a);
		print(left);
		print(right);
		if((right[1]==0 || left[a.length-1]==0))
			return true;
		for(int i=1; i<a.length-1; i++)
		{
			if(left[i-1]==right[i+1])
				return true;
			
			//or check if the element in the both left and right array are same at a given index
			//Both will give the same result;
		}
		return false;
		
	}
	public static void print(int[] a)
	{
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void main(String[] args)
	{
		int[] a= {3, 4, 8, -9, 20, 6};
		System.out.println(checkEquilibrium(a));
	}

}
