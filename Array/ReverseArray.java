import java.util.Scanner;
public class ReverseArray
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter elements of an Array");

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Original Array is: ");

		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}

		System.out.println();

		System.out.println("Reversed Array is: ");

		for(int i=size-1; i>=0; i--)
		{
			System.out.print(arr[i]+", ");
		}
	}
}