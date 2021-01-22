package MinMax;

import java.util.Arrays;

public class MinMax 
{
	public static int[] minMax(int[] arr)
	{
		int max = arr[0];
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		int min = arr[0] ;
		for(int i = 0;i<arr.length;i++)
		{
			
			if(arr[i] <= min)
				min = arr[i];
		}
		int[] result =new int[] {min,max};
		return result;
	}
	
	public static int[] minMax2(int[] arr)
	{
		Arrays.sort(arr);
		return new int[] {arr[0],arr[arr.length-1]};
	}
}
