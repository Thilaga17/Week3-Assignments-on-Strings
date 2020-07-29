package week3.day2.assignments;

public class CountWords {

	public static void main(String[] args) 
	{
		String str = "Welcome to chennai";
		int len = str.length();
		System.out.println("Length of the string" + len);
		
		String[] words = str.split("\\s");// ("\\s") - To split the string by white space
				
		for (String eachVal : words)
		{
			System.out.println(eachVal + " "); // print - will print the output in oneline
		}
		
		System.out.println("\n" + "Length of an array" + words.length);
		
		
	}
}
