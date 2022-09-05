import java.util.Scanner;
public class BinarySearch
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int arr [] = {10, 12, 25, 30, 33, 40, 47};
		int start=0;
		int end=arr.length;

		System.out.println("Enter the search element");
		int search = sc.nextInt();	
		
		BinarySearch bs = new BinarySearch();
		int index=bs.b_search(start,end,arr,search);	

		if(index == -1)
		{
			System.out.println("Element is not found");
		}
		else
		{
			System.out.println("Element is found at "+index+" index");
		}
		
	}

	int b_search(int s, int e, int arr[], int srch)
	{
		while (s<e)
		{
			int mid = (s+e)/2;
			
			if(arr[mid]==srch)
			{
				return mid;
			}
			
			else if(arr[mid]<srch)
			{
				s=mid+1;
				b_search(s,e,arr,srch);
			}

			else if(arr[mid]>srch)
			{
				e=mid-1;
				b_search(s,e,arr,srch);
			}
			
		}
		return -1;
	}
}


//Wrong prg.