import java.util.*;
public class ChocoDistributionGFG
{
	public static void main(String[]args)
	{
		int arr[] = {2,60,25,14,20,36,69,12,8};	//choco packets
		int stud = 5;	//no. of students
		int min = 60;	// let max. element of an arr is min.
		int sub =0;
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}

		for(int i=0; i<arr.length-stud+1; i++)
		{
			sub=arr[i+stud-1]-arr[i];
			if(min>sub)
			{
				min = sub;
				sub=0;
			}
		}
		System.out.println();
		System.out.println("Minimum difference is "+min);
		System.out.println(Integer.MAX_VALUE);
	}
}