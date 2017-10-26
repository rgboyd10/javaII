import java.util.*;
import java.io.*;

public class Lab6Driver
{
	public static void main(String[] args) throws IOException {
	
		ArrayList<Student> myStudents = new ArrayList<Student>(10);
	
		Scanner input = new Scanner(System.in);
		String userin = "";
		while(!userin.equals("0"))
		{
		System.out.println("Please enter a number shown below to designate the action you would like to take:");
		System.out.println("1: Add a current student.");
		System.out.println("2: Remove a current student.");
		System.out.println("3: Display the current students.");
		System.out.println("4: Save the current students to a file.");
		System.out.println("5: Load students from a file.");
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
		
		else if(userin.equals("4")) //saves the students to a file
		{
			java.io.File file = new java.io.File("studentdata.txt");
	if(file.exists())
	{
		System.out.println("File already exists");
		System.exit(1);
	}
	
	java.io.PrintWriter output = new java.io.PrintWriter(file);
	
	for(int x = 0; x < myStudents.size(); x++)
	{
		output.println(myStudents.get(x).getfName());
		output.println(myStudents.get(x).getlName());
		output.println(myStudents.get(x).getMajor());
		output.println(myStudents.get(x).getGPA());
		output.println(myStudents.get(x).getUIN());
		output.println(myStudents.get(x).getnetID());
		output.println(myStudents.get(x).getAge());
		output.println(myStudents.get(x).getGender());
	}
	output.close();
		}
		
		else if(userin.equals("5"))//loads the students from a file.  ***Please name your load file studentdata.txt***
		{
			java.io.File file = new java.io.File("studentdata.txt");
			Scanner bob = new Scanner(file);
			
			while(bob.hasNext())
			{
				String fName = bob.next();
				String lName = bob.next();
				String major = bob.next();
				String gpa = bob.next();
				String uin = bob.next();
				String netID = bob.next();
				String age = bob.next();
				String gender = bob.next();
		        myStudents.add(new Student(fName, lName, major, gpa, uin, netID, age, gender));
			}
			bob.close();		
		}  
	}
		System.out.println("The program has ended.");
}
}