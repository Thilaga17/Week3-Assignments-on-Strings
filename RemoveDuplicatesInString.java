// Remove Duplicates in the string using HashSet

package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInString
{
	public static void main(String[] args)
	{
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split("\\s");
		int len = words.length;
		System.out.println(len);
		
		// To print the String array with duplicates
		for (String eachVal : words)
		{
			System.out.print(eachVal + " ");
		}
		
		Set<String> values = new LinkedHashSet<String>();
		for (String e : words)
		{
			System.out.println(values.add(e));
		}
		System.out.println(values);		
	}
}
