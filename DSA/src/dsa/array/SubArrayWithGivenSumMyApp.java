package dsa.array;

public class SubArrayWithGivenSumMyApp
{
	public static boolean checkSum(int[] a, int s)
	{
		int start=0; 
		int sum =0;
		for(int end=0; end<= a.length;)
		{
			if(sum==s)
			{
				return true;
			}
			else if(sum<s)
			{
				try {
				sum+=a[end];
				}
				catch (Exception e) {
					return false;
				}
				end++;
			}
			else
			{
				sum-=a[start];
				start++;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		int[] a= {1, 4, 20, 3, 10, 5};
		System.out.println(checkSum(a, 24));
	}

}
