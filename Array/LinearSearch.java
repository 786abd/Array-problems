import java.util.Scanner;
public class LinearSearch 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter elements of an arrray");

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter search element from the arrray");
		int search = sc.nextInt();

		LinearSearch ls = new LinearSearch();
		ls.linearSearch(search,arr,size);
	}

	void linearSearch(int s, int a[], int size)
	{
		int count=0;

		for(int i=0; i<size; i++)
		{
			if(s==a[i])
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(s+" is found "+count+" times in an array");
		}
		else
		{
			System.out.println(s+" is not found in an array");
		}
	}
}