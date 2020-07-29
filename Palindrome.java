package week3.day2.assignments;

public class Palindrome
{
	public static void main(String[] args)
	{
		String str = "madam";
		String revstr = "";
		int len = str.length();		
		
		for(int i=len-1;i>=0;i--)
		{
			revstr = revstr + str.charAt(i);
		}
		System.out.println(revstr);
		
		if(str.equals(revstr))
		{
			System.out.println(str + " is a palindrome");
		}
		else
		{
			System.out.println(str + " is not a palindrome");
		}
		
	
	}

}
