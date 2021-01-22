package MinMax;

import java.util.Arrays;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		Random rand = new Random();
		System.out.println(Arrays.toString(MinMax.minMax(new int[] {1,2,4,5,3})));
		System.out.println(Arrays.toString(MinMax.minMax(new int[]{2334454,5})));
		System.out.println(Arrays.toString(MinMax.minMax(new int[]{1})));
		for(int i = 0; i < 20; i++) 
		{
        int r = rand.nextInt();
        System.out.println(Arrays.toString(MinMax.minMax(new int[]{r})));
		}
		
		System.out.println();
		System.out.println();
		System.out.println("***MinMax2 Method***");
		{
			System.out.println(Arrays.toString(MinMax.minMax2(new int[] {1,2,4,5,3})));
			System.out.println(Arrays.toString(MinMax.minMax2(new int[]{2334454,5})));
			System.out.println(Arrays.toString(MinMax.minMax2(new int[]{1})));
			for(int i = 0; i < 20; i++) 
			{
	        int r = rand.nextInt();
	        System.out.println(Arrays.toString(MinMax.minMax2(new int[]{r})));
			}
		}
	}

}
