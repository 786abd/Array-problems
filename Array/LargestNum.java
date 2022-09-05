import java.util.Scanner;
public class LargestNum
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		System.out.println("Enter elements of Array");
		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		LargestNum ln = new LargestNum();
		ln.largenum(size,arr);
	}

	void largenum(int x,int arr[])
	{
		int large = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if (arr[i]>large)
			{
				num = large;
				large = arr[i];
			}
		}
		System.out.println("Largest number is "+num);
	}


/*
	void largenum(int x,int arr[])
	{
		int large = arr[0];
		int num = large;
		for(int i = 0; i<arr.length; i++)
		{
			if (arr[i]>large)
			{
				num = large;
				large = arr[i];
				if(num>arr[i])
				{
					num = arr[i];
				}
			}
		}
		System.out.println("2nd Largest number is "+num);
	}

*/

// The 2nd largest number not found after the largest number found
}


