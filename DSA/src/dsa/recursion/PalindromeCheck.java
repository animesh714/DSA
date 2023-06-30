package dsa.recursion;

public class PalindromeCheck
{
	public static boolean checkP(String s, int f, int l)
	{
		if(f>=l)
			return true;
		return ((s.charAt(f)==s.charAt(l-1)) && checkP(s, f+1, l-1));
	}
	public static void main(String[] args)
	{
		String s= "ABCBA";
		System.out.println(checkP(s, 0, s.length()));
	}

}
