import java.util.Scanner;
public class RotateArray
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements of an Array");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+",");
		}
		
		System.out.println();
		System.out.println("Enter how many times want to rotate");
		int rot = sc.nextInt();
		int temp[] = new int[size];
		int j=0;
		
		for(int i=rot; i<arr.length; i++)
		{
			temp[j]=arr[i];
			j++;
		}

		for(int i=0; i<rot; i++)
		{
			temp[j]=arr[i];
			j++;
		}

		for(int i=0; i<temp.length; i++)
		{
			arr[i]=temp[i];
		}

		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+",");
		}
	}
}
