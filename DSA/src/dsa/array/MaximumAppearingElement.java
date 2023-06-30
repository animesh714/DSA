package dsa.array;

public class MaximumAppearingElement
{
	public static int check(int[] left, int[] right)
	{
		int[] res= new int[101];
		int[] ans= new int[101];
		for(int i=0; i<left.length; i++)
		{
			res[left[i]]++;
			res[right[i]+1]--;
		}
		ans[0]=res[0];
		for(int i=1; i<100; i++)
			ans[i]=ans[i-1]+res[i];
		int max=ans[0];
		int answer=0;
		for(int i=1; i<100; i++)
		{
			if(ans[i]>max)
			{
				answer=i;
				max=ans[i];
			}
		}
		return answer;
	}
	public static void main(String[] args)
	{
		int[] left= {1, 2, 4};
		int[] right= {4, 5, 7};
		System.out.println(check(left, right));
	}

}
