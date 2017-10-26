import java.util.*;

public class Lab4
{
	public static void main(String[] args)
	{
		ArrayList<Student> myStudents = new ArrayList<Student>(10);
	
		Scanner input = new Scanner(System.in);
		String userin = "";
		while(!userin.equals("0"))
		{
		System.out.println("Please enter a number shown below to designate the action you would like to take:");
		System.out.println("1: Add a student.");
		System.out.println("2: Remove a student.");
		System.out.println("3: Display the students");
		System.out.println("0: Exit the program.");		
		userin = input.nextLine();
		
		if(userin.equals("1")) //adds a student
		{
			System.out.println("What is the first name?");
			String fName = input.nextLine();
			System.out.println("What is the last name?");
			String lName = input.nextLine();
			System.out.println("What is the major?");
			String major = input.nextLine();
			System.out.println("What is the gpa?");
			String gpa = input.nextLine();
			System.out.println("What is the uin?");
			String uin = input.nextLine();
			System.out.println("What is the netID?");
			String netID = input.nextLine();
			System.out.println("What is the age?");
			String age = input.nextLine();
			System.out.println("What is the gender?");
			String gender = input.nextLine();
			
		myStudents.add(new Student(fName, lName, major, gpa, uin, netID, age, gender));
		System.out.println("The student has been added.");
		}
		
		else if(userin.equals("2")) //removes a student
		{
			if(myStudents.size() == 0)
				{
					System.out.println("There are no students currently stored.");
				}
			else
			{
				System.out.println("Which student would you like to remove? Enter an integer corresponding with your selection.");
				for(int i = 0; i < myStudents.size(); i++)
					{
						System.out.println(i + ": " + myStudents.get(i).getfName());		
					}
				int removalChoice = input.nextInt();
				myStudents.remove(removalChoice);
				System.out.println("The student has been removed.");	
				input.nextLine();
				}
			}
		
		else if(userin.equals("3")) //displays students
		{	
			if(myStudents.size() == 0)
			{
				System.out.println("There are no students to display.");
			}
			else
			{
				for(int i = 0; i < myStudents.size(); i++)
				{
					System.out.println(i + ": " + myStudents.get(i).getfName());		
				}
			}
		}
	}
		System.out.println("The program has ended.");
}
}