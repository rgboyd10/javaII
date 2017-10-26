import java.util.*;

public class Assignment01Driver
{
public static void main(String[] args)
{
	new Assignment01Driver ();
}

public Assignment01Driver()
{
	Scanner input = new Scanner(System.in);
	String[] flowerPack = new String[25];
	System.out.println("Welcome to my flower pack interface.");
	System.out.println("Please select a number from the options below.");
	System.out.println("");

while(true)
{
// Give the user a list of their options
	System.out.println("1: Add an item to the pack.");
	System.out.println("2: Remove an item from the pack.");
	System.out.println("3: Sort the contents of the pack.");
	System.out.println("4: Search for a flower.");
	System.out.println("5: Display the flowers in the pack.");
	System.out.println("0: Exit the flower pack interface.");

// Get the user input

	int userChoice = input.nextInt();

	switch(userChoice)
	{
	case 1: addFlower(flowerPack); break;
	case 2: removeFlower(flowerPack); break;
	case 3: sortFlowers(flowerPack); break;
	case 4: searchFlowers(flowerPack); break;
	case 5: displayFlowers(flowerPack); break;
	case 0: System.out.println("Thank you for using the flower pack interface. See you again soon!");
			System.exit(0);
		}
	}
}

private static void addFlower(String flowerPack[]) //add a flower
{
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the name of the flower to add:");
	  String flowerName = input.nextLine();

	  boolean blnInserted = false;

	  for (int i = 0; i < flowerPack.length; i++) {
	   if (flowerPack[i] == null) {
	    flowerPack[i] = flowerName;
	    blnInserted = true;
	    System.out.println("Flower Inserted");
	    break;
	   }
	  }

	  if (!blnInserted) {
	   System.out.println("Flower pack is full and could not add another flower");
	  }
}

private static void removeFlower(String flowerPack[]) //remove a flower
{
	Scanner input = new Scanner(System.in);
	System.out.println("Which flower would you like to remove?");
	String flowerChoice = input.nextLine();
	
	for(int i = 0; i < flowerPack.length; i++)
	{		
		if (flowerPack[i].equals(flowerChoice)) 
			{
				flowerPack[i] = null;
				System.out.println("A " + flowerChoice + " was removed.");
				break;
			}
		else
		{
			System.out.println("That flower does not exist.");
			break;
		}
	}
}

private static void sortFlowers(String flowerPack[]) // sort A to Z
{	
	String temp;
	int j = 0;
	boolean finished = false;
	
	while((finished == false) && (j < flowerPack.length - 1))
	{
		for(int i = 0; i < flowerPack.length - 1; i++)
		{
		if(flowerPack[i+1] == null)
		{
		break;
		}
			if(flowerPack[i].compareToIgnoreCase(flowerPack[i+1]) > 0)
			{
				temp = flowerPack[i];
				flowerPack[i] = flowerPack[i+1];
				flowerPack[i+1] = temp;	
			}
		}
		if(j == flowerPack.length)
		{
			finished = true;
		}
		else
		{
			j++;
		}
	}	
}

private static void searchFlowers(String flowerPack[]) //search for a specific flower
{
	boolean blnFound = false;
	Scanner input = new Scanner(System.in);
	System.out.println("Which flower would you like to see?");
	String flowerChoice = input.nextLine();
	
	
	for(int f = 0; f < flowerPack.length; f++)
	{
		if (flowerPack[f] != null) 
		{
			if (flowerPack[f].equalsIgnoreCase(flowerChoice)) 
			{
			System.out.println("Flower was found at index " + f);
			blnFound = true;
			break;
			}
			
		}
}
	}
		
private static void displayFlowers(String flowerPack[]) // display the array of flowers grouped by name
{
	String searchingPack[] = new String[25];

for(int x = 0; x < searchingPack.length; x++)//fill searchingPack with flowerPack values
{
	searchingPack[x] = flowerPack[x];
}

for(int x = 0; x < searchingPack.length; x++)
	{
	int counter = 0;
    String tempname = searchingPack[x];
	
		for(int y = 0; y < searchingPack.length; y++)
		{
			if(searchingPack[y] == flowerPack[x])
			{
				counter++;
				searchingPack[y] = null;
			}	
		}		
			if(flowerPack[x]!= null)
			System.out.println(tempname + " - " + counter);			
	}
}
}