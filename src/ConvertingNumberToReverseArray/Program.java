package ConvertingNumberToReverseArray;

import java.util.Arrays;

public class Program 
{
	public static void main(String[] args) {
		//System.out.println(Arrays.toString(digitize(35231)));
		System.out.println(Arrays.toString(digitize(32476)));
	}
	
	public static int[] digitize(long n)
	{
		String s = String.valueOf(n);
		int[] result = new int[s.length()];
		for(int i=0;i<result.length;i++)
		{
			result[i] = (int) n%10;
			n = n /10;
		}
		return result;
	}
}
