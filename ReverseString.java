package week3.day2.assignments;

public class ReverseString {

	public static void main(String[] args) 
	{
		String str = "feeling good";
		char[] arr = str.toCharArray(); // tocharArray(); method is used to change a string to char array.
		int len = arr.length;
		String rev = "";
	
		
		for(int i=len-1;i>=0;i--)
		{
			rev =rev + arr[i];
		}
		System.out.println(rev);		
	}

}
