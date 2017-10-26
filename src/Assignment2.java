import java.util.*;
public class Assignment2
{
public static void main(String[] args) 
{
		new Assignment2();
}

	// This will act as our program switchboard
	public Assignment2() {
		Scanner input = new Scanner(System.in);
		Flower[] flowerPack = new Flower[25];

		System.out.println("Welcome to my flower pack interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");

	while (true) {
			// Give the user a list of their options
			System.out.println("1: Add an item to the pack.");
			System.out.println("2: Remove an item from the pack.");
			System.out.println("3: Search for a flower.");
			System.out.println("4: Display the flowers in the pack.");
			System.out.println("0: Exit the flower pack interfact.");

			// Get the user input
			int userChoice = input.nextInt();

			switch (userChoice) {
			case 1:
				addFlower(flowerPack);
				break;
			case 2:
				removeFlower(flowerPack);
				break;
			case 3:
				searchFlowers(flowerPack);
				break;
			case 4:
				displayFlowers(flowerPack);
				break;
			case 0:
				System.out
						.println("Thank you for using the flower pack interface. See you again soon!");
				System.exit(0);
			}
		}

	}

	private void addFlower(Flower flowerPack[]) {
		// TODO: Add a flower that is specified by the user
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the name of the flower you are adding?");
		String name = input.nextLine();
	  
	  	System.out.println("What is the color of the flower you are adding?");
	    String color = input.nextLine();
	  
	  System.out.println("Is the flower going to be thorny? (y/n)");
	  	String hasThorns = input.nextLine();
	  	boolean isThorny;
	  	if(hasThorns.equals("y"))
	  	{
	  	isThorny = true;
	  	}
	  	else
	  	isThorny = false;
	  	
	  	System.out.println("Is the flower going to be smelly? (y/n)");
	  	String hasSmell = input.nextLine();
	  	boolean isSmelly;
	  	if(hasSmell.equals("y"))
	  	{
	  	isSmelly = true;
	  	}
	  	else
	  	isSmelly = false;
		
		for(int x = 0; x < flowerPack.length; x++)
		{
			if(flowerPack[x] == null)
			{
				flowerPack[x] = new Flower(name, color, isThorny, isSmelly);
				break;	
			}
		}
		System.out.println("The flower was added.");
}

	private void removeFlower(Flower flowerPack[]) 
	{
	Scanner input = new Scanner(System.in);
		// TODO: Remove a flower that is specified by the user
	System.out.println("Would you like to remove a flower by name or trait(has smell/has thorns)?");
	System.out.println("Type the word name, smell, or thorns to choose.");
	String userin = input.nextLine();
	
	if(userin.equals("name"))
	{
		displayFlowers(flowerPack);
		System.out.println("Which flower would you like to remove?");
		String flowerChoice = input.nextLine();
		for(int z = 0; z < flowerPack.length; z++)
		{
			if(flowerChoice.equals(flowerPack[z].getName()))
			{
			flowerPack[z] = null;
			System.out.println("The " + flowerChoice + " was removed.");
			if(flowerPack[z+1] == null)
				{
				break;
				}
			}
		}
		System.out.println("All flowers with that name have been eradicated.");
	}
	else if(userin.equals("smell"))
	{
		for(int s = 0; s < flowerPack.length; s++)
		{
			if(flowerPack[s].getSmells() == true)
			{
				flowerPack[s] = null;
				if(flowerPack[s+1] == null)
				{
				break;
				}
			}
		}
		System.out.println("All flowers that smell have been eradicated.");
	}
	else if(userin.equals("thorns"))
	{
	for(int s = 0; s < flowerPack.length; s++)
		{
			if(flowerPack[s].getThorns() == true)
			{
				flowerPack[s] = null;
				if(flowerPack[s+1] == null)
				{
				break;
				}
			}
		}
		System.out.println("All flowers that have thorns have been eradicated.");	
	}	
}

	private void searchFlowers(Flower flowerPack[]) {
		// TODO: Search for a user specified flower
	Scanner input = new Scanner(System.in);
	
	System.out.println("Would you like to see flowers by name, if they have a smell or if they have thorns)?");
	System.out.println("Type the word name, smell, or thorns to choose.");
	String userin = input.nextLine();
	
	if(userin.equals("name"))
	{
		displayFlowers(flowerPack);
		System.out.println("Which flower would you like to see?");
		String flowerChoice = input.nextLine();
		for(int z = 0; z < flowerPack.length; z++)
		{
			if(flowerChoice.equals(flowerPack[z].getName()))
			{
			System.out.println(z + " - Name? - " + flowerPack[z].getName() + " \n  - Color? - " + flowerPack[z].getColor() + " \n  - Smell? - " + flowerPack[z].getThorns() + " \n  - Thorns? - "  + flowerPack[z].getSmells());
			if(flowerPack[z+1] == null)
				{
				break;
				}
			}
		}
				System.out.println("All flowers with that name have been shown.");
	}
	else if(userin.equals("smell"))
	{
		for(int s = 0; s < flowerPack.length; s++)
		{
			if(flowerPack[s].getSmells() == true)
			{
				System.out.println(s + " - Name? - " + flowerPack[s].getName() + " \n  - Color? - " + flowerPack[s].getColor() + " \n  - Smell? - " + flowerPack[s].getThorns() + " \n  - Thorns? - "  + flowerPack[s].getSmells());
				if(flowerPack[s+1] == null)
				{
				break;
				}
			}
		}
		System.out.println("All flowers that smell have been shown.");
	}
	else if(userin.equals("thorns"))
	{
	for(int s = 0; s < flowerPack.length; s++)
		{
			if(flowerPack[s].getThorns() == true)
			{
				System.out.println(s + " - Name? - " + flowerPack[s].getName() + " \n  - Color? - " + flowerPack[s].getColor() + " \n  - Smell? - " + flowerPack[s].getThorns() + " \n  - Thorns? - "  + flowerPack[s].getSmells());
				if(flowerPack[s+1] == null)
				{
				break;
				}
			}
		}
		System.out.println("All flowers that have thorns have been shown.");	
	}	
}

	private void displayFlowers(Flower flowerPack[]) {
		// TODO: Display only the unique flowers along with a count of any
		// duplicates
		/*
		 * For example it should say Roses - 7 Daffodils - 3 Violets - 5
		 */
		  
		 for(int x = 0; x < flowerPack.length; x++)
		 {
		 	if(flowerPack[x] != null)
		 	{
			System.out.println(x + " - Name? - " + flowerPack[x].getName() + " \n  - Color? - " + flowerPack[x].getColor() + " \n  - Smell? - " + flowerPack[x].getThorns() + " \n  - Thorns? - "  + flowerPack[x].getSmells());
			}
		}
}
}