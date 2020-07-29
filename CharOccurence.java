// occurence of character 'e'

package week3.day2.assignments;

public class CharOccurence
{
	public static void main(String[] args)
	{
		String str = "Welcome to chennai";
		int length = str.length();// length is the total length of the string
		int length1 = str.replace("e", "").length(); // length1 is the length of the string after removing 'a'.
		int count = length - length1;
		System.out.println("The occurence of character 'e' is : " + count);
	}
}
