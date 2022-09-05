public class RemoveDuplicates
{
	public static void main(String[]args)
	{
		int arr[] = {1,2,3,3,8,0,6,2,8,5,3,8};

		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
				}
			}
		}

		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
}