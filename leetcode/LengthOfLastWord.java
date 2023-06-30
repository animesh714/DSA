package com.xoriant.leetcode;

public class LengthOfLastWord
{
	public static int lengthOfLastWord(String s)
	{
		boolean flag= false;
		int count=0;
		for(int i= s.length()-1; i>=0; i--)
		{
			if(s.charAt(i)!=' ')
				flag=true;
			if(flag && s.charAt(i)!=' ')
				count++;
			if(flag && s.charAt(i)==' ')
				break;
		}
		return count;
	}
	public static void main(String[] args)
	{
	
		System.out.println(lengthOfLastWord("   fly me   to   the moon    "));
	}

}
