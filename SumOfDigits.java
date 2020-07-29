// 1. Convert the string into character array.
// 2. Get each character from an array and check whether it is a digit by using isDigit()
// 3. If yes, get the digits by Character.getNumericValue(); and add the digits and print.


package week3.day2.assignments;

public class SumOfDigits 
{
	public static void main(String[] args)
	{
		String text = "Tes12Le79af65";
		int sum =0;
		int n;
		char[] arr = text.toCharArray();
		int len = arr.length;
		for (int i=0;i<=len-1;i++)
		{
			char c = arr[i];
			if(Character.isDigit(c))
			{
				n= Character.getNumericValue(c);
				sum = sum+n;
			}
		}
		System.out.println("The sum of digits in the string is : " + sum);
	 
	}
}

