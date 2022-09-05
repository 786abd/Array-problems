import java.util.Scanner;
public class InsertionSort
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements of an Array");

		for(int i=0; i<size; i++)
		{
			 arr[i]=sc.nextInt();
		}
		InsertionSort ins = new InsertionSort();
		ins.sort(arr,size);
	}

	//Insertion Sort

	void sort(int arr[], int s)
	{
		for(int i=1; i<s; i++)
		{
			int j=i-1;
			int x=arr[i];
			
			while (j>=0 && arr[j]>x)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=x;
		}
		
		for(int i=0; i<s; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}