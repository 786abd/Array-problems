import java.util.Scanner;
public class EvenOddArray
{
	public static void main(String[]args)
	{
		int even=0;
		int odd=0;
		int arr[] = {2,5,99,102,-4,100,-7};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
				odd++;
		}

		System.out.println(even+" even numbers are there in Array");
		System.out.println(odd+" odd numbers are there in Array");
	}
}