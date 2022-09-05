import java.util.Scanner;
public class Largest_Smallest 
{
	public static void main(String[] args)
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of an array");
		
		for(i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		for(i=0; i<size-1; i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			
		}

		for(i=0; i<size-1; i++)
		{
			if(arr[i]<arr[i+1])
			{

			}
			else
			{
				int temp=arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}	
		}

		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}

		System.out.println();		
		System.out.println("Largest element of an Array is "+arr[size-1]);
		System.out.println("Smallest element of an Array is "+arr[0]);
	}
}

//Wrong prg.