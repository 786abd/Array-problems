import java.util.Scanner;
public class OddEvenSum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int evenSum=0;
		int oddSum=0;
		
		System.out.println("Enter the size of an Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of an Array");

		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
				evenSum+=arr[i];
			else
				oddSum+=arr[i];
		}

		System.out.println("Sum of Odd numbers is "+oddSum);
		System.out.println("Sum of Even numbers is "+evenSum);
	}
}