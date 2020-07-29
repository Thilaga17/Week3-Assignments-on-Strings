package week3.day2.assignments;

public class OddIndexToUppercase
{
	public static void main(String[] args) 
	{
		String test = "changeme";
		
		char[] arr = test.toCharArray();
		
		int len =arr.length;
		
		for(int i=0;i<=len-1;i++)
		{
			char c = arr[i]; // get current character
			if(i % 2 != 0)
			{
				c = Character.toUpperCase(c);
			}
			System.out.print(c);
		}
	}
}
