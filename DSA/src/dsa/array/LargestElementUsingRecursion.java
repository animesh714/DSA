package dsa.array;

public class LargestElementUsingRecursion
{
	public static int largest(int[] arr, int size)
	{
		if(size==1)
			return arr[0];
		return Math.max(arr[size-1], largest(arr, size-1));
	}
	public static void main(String[] args)
	{
		int[] arr= {10, 20, 32, 23, 45, 38};
		System.out.println(largest(arr, arr.length));
	}

}
