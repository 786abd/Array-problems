public class EvenOddArray2
{
	public static void main(String[]args)
	{
		int arr[]={2,5,4,-10,58,96,111,69,-34,0};
		int even[]=new int[arr.length];
		int odd[]=new int[arr.length];

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				even[i]=arr[i];
			}
			else
				odd[i]=arr[i];
		}

		for(int i=0; i<arr.length; i++)
		{
			System.out.print(even[i]+", ");
		}
			
		System.out.println();

		for(int i=0; i<arr.length; i++)
		{
			System.out.print(odd[i]+", ");
		}
	}
}