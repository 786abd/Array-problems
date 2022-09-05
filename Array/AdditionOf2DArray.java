import java.util.Scanner;
public class AdditionOf2DArray
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 2D Array");
		int size = sc.nextInt();
		int arr1[][] = new int[size][size];
		int arr2[][] = new int[size][size];

		System.out.println("Enter elements of Array 1");

		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1.length; j++)
			{
				arr1[i][j] = sc.nextInt();	
			}	
			System.out.println();	
		}

		System.out.println("Enter elements of Array 2");

		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				arr2[i][j] = sc.nextInt();	
			}
			System.out.println();	
		}

		System.out.println("Addition of  Arrays is ");

		int ans[][] = new int[size][size];

		for(int i=0; i<ans.length; i++)
		{
			for(int j=0; j<ans.length; j++)
			{
				ans[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}

	}
}