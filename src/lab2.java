import java.util.*;

public class lab2
{
		
public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		boolean quit = false;
				
		Contact.clearArray(); //clears array of nulls for beauty
		
		while(quit == false)
		{
		System.out.println("What would you like to do?");
		System.out.println("Type a command shown below to perform an action.");
		System.out.println("<> add contact\n<> remove contact\n<> display contacts\n<> quit program");
		String userin = input.nextLine();
		
		if(userin.equals("add contact"))
		{
			System.out.println("At which location (enter an integer 0-9) would you like to insert this record?");
			int insertionChoice = input.nextInt();
			input.nextLine();
			System.out.println("First name?"); //Request/set first name
			String FName = input.nextLine();
			Contact.setFName(FName, insertionChoice);
			
			System.out.println("Last name?"); //Request/set last name
			String LName = input.nextLine();
			Contact.setLName(LName, insertionChoice);
			
			System.out.println("Phone number?"); //Request/set phone
			String Phone = input.nextLine();
			Contact.setPhone(Phone, insertionChoice);
			
			System.out.println("Age?"); //Request/set age
			String Age = input.nextLine();
			Contact.setAge(Age, insertionChoice);
			
		}
		else if(userin.equals("remove contact"))
		{
			Contact.displayContacts();
			System.out.println("Which contact would you like to remove from the above list?  Type their 0-9 number");
			int removalChoice = input.nextInt();
			input.nextLine();
			Contact.removeContact(removalChoice);
			System.out.println("The contact was removed.");
		}
		else if(userin.equals("display contacts"))
		{
		Contact.displayContacts();
		}
		
		else if(userin.equals("quit program"))
		{
			quit = true;
		}
		
		else
		{
		System.out.println("That is not a valid command.  Try again.");
		}
	}
	System.out.println("Thank you.");	
	}
	}
