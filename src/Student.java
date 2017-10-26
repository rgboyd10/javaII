public class Student
{
	private String fName;
	private String lName;
	private String major;
	private String gpa;
	private String uin;
	private String netID;
	private String age;
	private String gender;
	
	public Student(String fName, String lName, String major, String gpa, String uin, String netID, String age, String gender)
	{
		this.fName = fName;
		this.lName = lName;
		this.major = major;
		this.gpa = gpa;
		this.uin = uin;
		this.netID = netID;
		this.age = age;
		this.gender = gender;
	}
	
	 String getfName()
	{
	 return fName;
	}
	 
	 String getlName()
	 {
		 return lName;
	 }
	 
	 String getMajor()
	 {
		 return major;
	 }
	 
	 String getGPA()
	 {
		 return gpa;
	 }
	 
	 String getUIN()
	 {
		 return uin;
	 }
	 
	 String getnetID()
	 {
		 return netID;
	 }
	 
	 String getAge()
	 {
		 return age;
	 }
	 
	 String getGender()
	 {
		 return gender;
	 }
}
