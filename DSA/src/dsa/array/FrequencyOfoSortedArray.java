package dsa.array;

public class FrequencyOfoSortedArray
{
	public static void frequency(int[] a)
	{
		int count=1;
		int current=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]== current)
				count++;
			else
			{
				System.out.println(current+" comes "+count+" times");
				current=a[i];
				count=1;
			}
		}
		System.out.println(current+" comes "+count+" times");
	}
	public static void main(String[] args)
	{
		int[] a= {1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 6};
		frequency(a);
	}

}
