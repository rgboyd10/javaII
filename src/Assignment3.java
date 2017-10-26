import java.util.*;
public class Assignment3
{
public static void main(String[] args) 
	{
		new Assignment3();
	}

	// This will act as our program switchboard
	public Assignment3() {
		Scanner input = new Scanner(System.in);
		ArrayList<Flower>flowerPack = new ArrayList<Flower>();
		System.out.println("Welcome to my flower pack interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");

	while (true) {
			// Give the user a list of their options
			System.out.println("1: Add an item to the pack.");
			System.out.println("2: Remove an item from the pack.");
			System.out.println("3: Search for a flower.");
			System.out.println("4: Display the flowers in the pack.");
			System.out.println("5: Filter flower pack by incomplete name");
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
			case 5:
				filterFlowers(flowerPack);
				break;
			case 0:
				System.out
						.println("Thank you for using the flower pack interface. See you again soon!");
				System.exit(0);
			}
		}
	}
	
	private void addFlower(ArrayList<Flower>flowerPack) 
{
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
	  	
			flowerPack.add(new Flower(name, color, isThorny, isSmelly));
			System.out.println("The flower was added.");
}

	private void removeFlower(ArrayList<Flower>flowerPack) 
	{
		Scanner input = new Scanner(System.in);
	// TODO: Remove a flower that is specified by the user
	
	displayFlowers(flowerPack);
	
	System.out.println("Please type the number of the flower you would like to remove.");
	int flowerChoice = input.nextInt();
	
	flowerPack.remove(flowerChoice);
	System.out.println("The flower was removed.");
		
	}	
	
	private void searchFlowers(ArrayList<Flower>flowerPack) 
{
	Scanner input = new Scanner(System.in);
	System.out.println("Which flower would you like to see?");
	String flowerChoice = input.nextLine();
	
	for(int x = 0; x < flowerPack.size(); x++)
	{
		if(flowerChoice.equals((flowerPack.get(x).getName())))
		{
			System.out.println("Here is your flower.");
			System.out.println(flowerPack.get(x).getName());
			break;
		}	
	}
}

	private void displayFlowers(ArrayList<Flower>flowerPack) 
{		  
		 for(int x = 0; x < flowerPack.size(); x++)
		 {
		 	System.out.println(x + " : " + flowerPack.get(x).getName());
		 }
}

	private void filterFlowers(ArrayList<Flower>flowerPack)
	{
		Scanner input = new Scanner(System.in);
		displayFlowers(flowerPack);
		System.out.println("Type the first letter of the flower's name to see those flowers.");
		String userstring = input.nextLine();
		char userchar = userstring.charAt(0);
		
		for(int y = 0; y <flowerPack.size(); y++)
		{	
	    //String temp = flowerPack.get(y).getName();
		//char temp = temp.charAt(0);
			if(userchar == flowerPack.get(y).getName().charAt(0))
			{
				System.out.println(flowerPack.get(y).getName());
			}
		}
	}

}