import java.util.Scanner;
public class SelectionSort
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of an Array");

		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}

		sort(arr,size);

	}
	
	//Selection Sort

	static void sort(int arr[], int s)
		{
			for(int i=0; i<s-1; i++)
			{
				int minIndex=i;
				int minValue=arr[i];

				for(int j=i+1; j<s; j++)
				{
					if (minValue > arr[j])
					{
						minIndex=j;
						minValue=arr[j];
					}
				}
				arr[minIndex]=arr[i];
				arr[i]=minValue;
			}

			for(int i=0; i<s; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
}