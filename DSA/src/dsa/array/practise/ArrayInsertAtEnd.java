package dsa.array.practise;

public class ArrayInsertAtEnd
{
	public void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
		arr[sizeOfArray-1]=element;
    }
	public static void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        for(int i=sizeOfArray-2; i>=index; i--)
        {
        	arr[i+1]=arr[i];
        }
        arr[index]=element;
    }
	public static void main(String[] args)
	{

	}

}
