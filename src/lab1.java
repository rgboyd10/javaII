//Create a program that has an array of length 100 which will automatically be 
//filled with randomly generated numbers between 1 and 100 each time the program is run. 
//Have the program ask the user to enter a number between 1 and 100. 
//Check to see if that number is one of the values in the array. 
//If it is display â€œWe found your number XX at position YY in the array 
//If the number is not in the array tell the user that no match was found.

import java.util.*;

public class lab1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int[] randoArray = new int[100];
		
		for(int i = 0; i < randoArray.length; i++)
		{
			randoArray[i] = (int)(Math.random() * 100);
		}
				
		System.out.println("Please enter a number between 1 and 100: ");
		int userinput = input.nextInt();
		
		boolean blnFound = false;
		for(int y = 0; y < randoArray.length; y++)
		{
			if(userinput == randoArray[y])
				{
					System.out.println("We found your number " + userinput + " at position " + y + " in the array");
					blnFound = true;
				}
		}
		 
			if(!blnFound)
			{
				System.out.print("We did not find your number in the list!");
			}
	}
}