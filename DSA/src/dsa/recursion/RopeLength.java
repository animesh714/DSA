package dsa.recursion;

public class RopeLength
{
	public static int numbers(int length, int a, int b, int c)
	{
		if(length==0)
			return 0;
		if(length<0)
			return -1;
		int result= Math.max(numbers(length-a, a, b, c),Math.max(numbers(length-b, a, b, c), numbers(length-c, a, b, c)) );
		if(result<0)
			return-1;
		else
			return result+1;
	}
	public static void main(String[] args)
	{
		System.out.println(numbers(23,12,11,13));
	}

}
