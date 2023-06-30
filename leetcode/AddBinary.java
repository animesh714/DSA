package com.xoriant.leetcode;

public class AddBinary
{
	public static String addBinary(String a, String b)
	{
		StringBuffer sb= new StringBuffer("");
		if(a.length()<b.length())
		{
			String temp=a;
			a=b;
			b=temp;
		}
		int a1, b1,rem=0;
		for(int i=0; i<b.length(); i++)
		{
			if(a.charAt(a.length()-1-i)=='1')
				a1=1;
			else
				a1=0;
			
			if(b.charAt(b.length()-1-i)=='1')
				b1=1;
			else
				b1=0;
			
			if(a1+b1+rem==0)
			{
				sb.append(0);
				rem=0;
			}
			else if(a1+b1+rem==1)
			{
				sb.append(1);
				rem=0;
			}
			else if(a1+b1+rem==2)
			{
				sb.append(0); 
				rem=1;
			}
			else
			{
				sb.append(1);
				rem=1;
			}
			System.out.println(sb+" "+rem);
		}
		System.out.println("----------------------------------------");
		if(a.length()==b.length() && rem!=0)
			sb.append(1);
		else if(a.length()!=b.length())
		{
			for(int i=a.length()-b.length()-1; i>=0; i--)
			{
				if(a.charAt(i)=='0')
					a1=0;
				else
					a1=1;
				
				if(a1+rem==0)
				{
					sb.append(0);
					rem=0;
				}
				else if(a1+rem==1)
				{
					sb.append(1);
					rem=0;					
				}
				else
				{
					sb.append(0);
					rem=1;
				}
				System.out.println(sb+" "+rem);
			}
			if(rem!=0)
				sb.append(1);
		}
		System.out.println("----------------------------------------");
		System.out.println(sb);
		return sb.reverse().toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println(addBinary("100","110010"));//110110
	}

}
