import java.util.*;
public class Lab5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter a string:"); // prompting the user to enter a string
		String userin = input.nextLine();
		
		System.out.println("Using just the String class, is the string a palindrome? - " + stringClassPalindrome(userin));
		System.out.println("Using just the StringBuilder class, is the string a palindrome? - " + stringBuilderPalindrome(userin));
	}

	public static boolean stringClassPalindrome(String userin)
	{
		String x = userin.toLowerCase();
		char[] userArray = new char[0];
		userArray = nonStringBuilderFilter(x);
		boolean isPalindrome = true;
		int low = 0;
		int high = userArray.length - 1;
		
		while(low < high)	
		{
		if(userArray[low] != userArray[high])
		{
			isPalindrome = false;
			break;
		}
		low++;
		high--;
		}
		return isPalindrome;
	}
	
	public static boolean stringBuilderPalindrome(String userin)
	{
	String x = userin.toLowerCase();
	String s = filter(x);
	String s1 = reverse(s);
	return s1.equals(s);
	}
	
	public static String filter(String s)
	{
	StringBuilder stringBuilder = new StringBuilder();
	for( int i = 0; i < s.length(); i++)
	{
		if(Character.isLetterOrDigit(s.charAt(i)))
		{
			stringBuilder.append(s.charAt(i));
		}
	}
	return stringBuilder.toString();
	}

	public static String reverse(String s)
	{
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}

	public static char[] nonStringBuilderFilter(String x)
	{
		char [] trimmedArray = new char[x.length()];	
		int trimmedIndex = 0;
		
		for(int y = 0; y < trimmedArray.length; y++)
		{		
			if(Character.isLetterOrDigit(x.charAt(y)))
			{
				trimmedArray[trimmedIndex] = x.charAt(y);
				trimmedIndex++;
			}	
		}
		return trimmedArray;
	}
}
