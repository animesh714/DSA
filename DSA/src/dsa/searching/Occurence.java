package dsa.searching;

public class Occurence
{
	public static void main(String[] args)
	{
		int[] a= {1,2 ,3, 4, 5, 5, 5,5 , 5, 5, 6, 6, 6 , 7, 7};
		System.out.println(countOccureence(a, 5));
	}
	public static int countOccureence(int[] a, int item)
	{
		int first=FirstOccurance.occurance(a, item);
		 if(first==-1)
			 return -1;
		 else
			 return (LastOccurance.occurance(a, item)-first+1);
	}
}
