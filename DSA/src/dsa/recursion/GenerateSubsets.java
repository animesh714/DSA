package dsa.recursion;

public class GenerateSubsets
{
	public static void subset(String s, String curr, int l)
	{
		if(l==s.length())
		{
			System.out.println(curr);
			return;
		}
		subset(s, curr, l+1);
		subset(s, curr+s.charAt(l), l+1);
	}
	public static void main(String[] args)
	{
		subset("ABC", "", 0);
	}

}
