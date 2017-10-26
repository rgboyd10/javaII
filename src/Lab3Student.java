public class Lab3Student
{
	 static String[][] stuArray = new String[10][9];
	
	public static void clearArray()
	{
	for(int row = 0; row < stuArray.length; row++)
		{
			for(int column = 0; column < stuArray[row].length; column++)
			{
				stuArray[row][column] = "";
			}
		}
	}
	
	public static void displayStudents()
	{
	
	stuArray[0][0] = "0"; //setting primary keys/insertion choices
	stuArray[1][0] = "1";
	stuArray[2][0] = "2";
	stuArray[3][0] = "3";
	stuArray[4][0] = "4";
	stuArray[5][0] = "5";
	stuArray[6][0] = "6";
	stuArray[7][0] = "7";
	stuArray[8][0] = "8";
	stuArray[9][0] = "9";
	
		for(int row = 0; row < stuArray.length; row++)
		{
			for(int column = 0; column < stuArray[row].length; column++)
			{
				System.out.println(stuArray[row][column] + " ");
			}
		}
	}
	
	public static void removeStudent(int removalChoice)
	{
		stuArray[removalChoice][1] = "";
		stuArray[removalChoice][2] = "";
		stuArray[removalChoice][3] = "";
		stuArray[removalChoice][4] = "";
		stuArray[removalChoice][5] = "";
		stuArray[removalChoice][6] = "";
		stuArray[removalChoice][7] = "";
		stuArray[removalChoice][8] = "";
	}
	
	 public static void setFName(String userin, int insertionRow)
	{
		stuArray[insertionRow][1] = userin;
	}	
	
	public static void setLName(String userin, int insertionRow)
	{
	stuArray[insertionRow][2] = userin;
	}
	
	public static void setMajor(String userin, int insertionRow)
	{
	stuArray[insertionRow][3] = userin;
	}
	
	public static void setNetID(String userin, int insertionRow)
	{
	stuArray[insertionRow][4] = userin;
	}
	
	public static void setGender(String userin, int insertionRow)
	{
	stuArray[insertionRow][5] = userin;
	}
	
	public static void setGPA(String userin, int insertionRow)
	{
	stuArray[insertionRow][6] = userin;
	}
	
	public static void setUIN(String userin, int insertionRow)
	{
	stuArray[insertionRow][7] = userin;
	}
	
	public static void setAge(String userin, int insertionRow)
	{
	stuArray[insertionRow][8] = userin;
	}
}
