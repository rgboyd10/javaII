import java.util.*;
public class Lab3Driver
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		
		Student.clearArray(); //clears array of nulls for beauty
		
		while(quit == false)
		{
		System.out.println("What would you like to do?");
		System.out.println("Type a command shown below to perform an action.");
		System.out.println("<>add student\n<>remove student\n<>display students\n<>quit program");
		String userin = input.nextLine();
		
		if(userin.equals("add student"))
		{
			System.out.println("At which location (0-9) would you like to insert this record?");
			int insertionChoice = input.nextInt();
			input.nextLine();
			System.out.println("First Name?"); //Request/set first name
			String FName = input.nextLine();
			Student.setFName(FName, insertionChoice);
			
			System.out.println("Last Name?"); //Request/set last name
			String LName = input.nextLine();
			Student.setLName(LName, insertionChoice);
			
			System.out.println("Major?"); //Request/set Major
			String Major = input.nextLine();
			Student.setMajor(Major, insertionChoice);
			
			System.out.println("NetID?"); //Request/set NetID
			String NetID = input.nextLine();
			Student.setNetID(NetID, insertionChoice);
			
			System.out.println("Gender?"); //Request/set Gender
			String Gender = input.nextLine();
			Student.setGender(Gender, insertionChoice);
			
			System.out.println("GPA?"); //Request/set GPA
			String GPA = input.nextLine();
			Student.setGPA(GPA, insertionChoice);
			
			System.out.println("UIN?"); //Request/set UIN
			String UIN = input.nextLine();
			Student.setUIN(UIN, insertionChoice);
			
			System.out.println("Age?"); //Request/set Age
			String Age = input.nextLine();
			Student.setAge(Age, insertionChoice);
			
		}
		else if(userin.equals("remove student"))
		{
			Student.displayStudents();
			System.out.println("Which student would you like to remove from the above list?  Type their 0-9 number");
			int removalChoice = input.nextInt();
			input.nextLine();
			Student.removeStudent(removalChoice);
			System.out.println("The student was removed");
		}
		else if(userin.equals("display students"))
		{
			Student.displayStudents();
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