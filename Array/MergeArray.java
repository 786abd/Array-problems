import java.util.Arrays;
public class MergeArray
{
	public static void main(String[]args)
	{
		int arr1[] = {1,2,3,4};
		int arr2[] = {10,20,30,40};
		
		int newArr[] = new int[arr1.length + arr2.length];

		for(int i = 0; i<arr1.length; i++)
		{
			newArr[i] =arr1[i];
		}

		for(int i = arr1.length+1; i<arr2.length; i++)
		{
			newArr[i] =arr2[i];
		}

		System.out.println("Merged Array is "+Arrays.toString(newArr));
	}	
}