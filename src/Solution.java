import java.util.Arrays;

public class Solution {

	public static String whoLikesIt(String... names)
	{
		String result = "";
		if(names.length == 0)
		{
			result = "must be no one like this.";
		}
		else
		{
			String likesNames ="";
			
			for(int i=0;i<names.length;i++)
			{
				likesNames += names[i]+" ";
			}
			result = "must be "+ "\""+ likesNames +" like this "+"\"";
		}
		return result;
	}
}