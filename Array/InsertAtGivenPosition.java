import java.util.Scanner;
public class InsertAtGivenPosition
{
	
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,};

		System.out.println("Enter the index for the element");
		int index=sc.nextInt();

		System.out.println("Enter the element");
		int num=sc.nextInt();

		for(int i=arr.length-2; i>=index; i--)
		{
			arr[i+1]=arr[i];
		}
			arr[index]=num;

		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
}