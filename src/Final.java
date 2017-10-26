import java.util.Scanner;
public class Final
{
public static void main(String[] args) 
{
		new Final();
}
	
public Final() 
{
		Scanner input = new Scanner(System.in);
		plant[] plantPack = new plant[25];

		System.out.println("Welcome to my plant pack interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");

	while (true) {
			// Give the user a list of their options
			System.out.println("1: Add a plant to the pack.");
			System.out.println("2: Remove a plant from the pack.");
			System.out.println("3: Search for a plant by name.");
			System.out.println("4: Filter the plants by name.");
			System.out.println("5: Display the plants in the pack.");
			System.out.println("0: Exit the plant pack interface.");

			// Get the user input
			int userChoice = input.nextInt();

			switch (userChoice) {
			case 1:
				addPlant(plantPack);
				break;
			case 2:
				removePlant(plantPack);
				break;
			case 3:
				searchPlant(plantPack);
				break;
			case 4:
				filterPlants(plantPack);
				break;
			case 5:
				displayPlants(plantPack);
				break;
			case 0:
				System.out
						.println("Thank you for using the plant pack interface. See you again soon!");
				System.exit(0);
			}
		}
	}

	private void addPlant(plant plantPack[]) 
{
		// TODO: Add a flower that is specified by the user
		Scanner input = new Scanner(System.in);
		
		System.out.println("What kind of plant are you adding?  (fungus, weed, or flower): ");
		String name = input.nextLine();
		
/*------------------------------------------------------------------------------------*/		
		if(name.equals("fungus"))
		{
			name = "fungus";
			System.out.println("What is the color of the fungus you are adding?");
	    	String color = input.nextLine();
	    	System.out.println("Is the fungus going to be poisonous? (y/n)");
	  		String hasPoison = input.nextLine();
	  		boolean isPoisonous;
	  		if(hasPoison.equals("y"))
	  			{
	  			isPoisonous = true;
	  			}
	  			else
	  			isPoisonous = false;
	  			
	  			for(int x = 0; x < plantPack.length; x++)
					{	
					if(plantPack[x] == null)
						{
						plantPack[x] = new fungus(name, color, isPoisonous);
						break;	
						}
					}
			System.out.println("The fungus was added.");
	  	
		}
/*------------------------------------------------------------------------------------*/		
		else if(name.equals("weed"))
		{
			name = "weed";
			System.out.println("What is the color of the weed you are adding?");
	    	String color = input.nextLine();
	    	System.out.println("Is the weed going to be poisonous? (y/n)");
	  		String hasPoison = input.nextLine();
	  		boolean isPoisonous;
	  		if(hasPoison.equals("y"))
	  			{
	  			isPoisonous = true;
	  			}
	  			else
	  			isPoisonous = false;
	  	
	  		System.out.println("Is the weed going to be medicinal? (y/n)");
	  		String hasMedicinal = input.nextLine();
	  		boolean isMedicinal;
	  		if(hasMedicinal.equals("y"))
	  			{
	  			isMedicinal = true;
	  			}
	  		else
	  			isMedicinal = false;
	  			
	  		System.out.println("Is the weed going to be edible? (y/n)");
	  		String hasEdible = input.nextLine();
	  		boolean isEdible;
	  		if(hasEdible.equals("y"))
	  			{
	  			isEdible = true;
	  			}
	  		else
	  			isEdible = false;	
		
				for(int x = 0; x < plantPack.length; x++)
					{	
					if(plantPack[x] == null)
						{
						plantPack[x] = new weed(name, color, isPoisonous, isMedicinal, isEdible);
						break;	
						}
					}
			System.out.println("The weed was added.");
		}
/*------------------------------------------------------------------------------------*/
		else if(name.equals("flower"))
		{
			name = "flower";
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
		
				for(int x = 0; x < plantPack.length; x++)
					{	
					if(plantPack[x] == null)
						{
						plantPack[x] = new Flower(name, color, isThorny, isSmelly);
						break;	
						}
					}
			System.out.println("The flower was added.");
		}
		
/*------------------------------------------------------------------------------------*/
}

	private void removePlant(plant plantPack[]) 
	{
	Scanner input = new Scanner(System.in);
	displayPlants(plantPack);
	System.out.println("Which plant would you like to remove?: (type the name) ");
	String plantChoice = input.nextLine();
		for(int z = 0; z < plantPack.length; z++)
		{
			if(plantChoice.equals(plantPack[z].getName()))
				{
				plantPack[z] = null;
				System.out.println("The " + plantChoice + " was removed.");
				break;
				}
			if(plantPack[z+1] == null)
				{
				break;
				}
			}
		}
	
	private void searchPlant(plant plantPack[]) 
	{
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("What kind of plant would you like to see?: ");
	String name = input.nextLine();
	
	for(int x = 0; x< plantPack.length; x++)
	{
		if(name.equals(plantPack[x].getName()))
		{
			System.out.println("Here is your " + name + ".");
			System.out.println("      ##");
			System.out.println("      /");
			System.out.println("     /");
			break;
		}
	}
}
	
	private void filterPlants(plant plantPack[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What kind of plants would you like to see?");
		String name = input.nextLine();
	
		for(int x = 0; x< plantPack.length; x++)
			{
				if((name.equals(plantPack[x].getName())))
				{
				System.out.println("Here is a " + name + ".");
				System.out.println(plantPack[x].getName());
				System.out.println("      ##");
				System.out.println("      /");
				System.out.println("     /");
				}
				if(plantPack[x+1] == null)
				{
				break;
				}
			}	
	}

	private void displayPlants(plant plantPack[]) 
	{
		  
		 for(int x = 0; x < plantPack.length; x++)
		 {
		 	if(plantPack[x] != null)
		 	{
			System.out.println(x + " - Name - " + plantPack[x].getName());
			}
		}
}
}