public class Contact
{
	 static String[][] contactArray = new String[10][5];
	
		public static void clearArray() //clear array of nulls
		{
		for(int row = 0; row < contactArray.length; row++)
			{
				for(int column = 0; column < contactArray[row].length; column++)
				{
					contactArray[row][column] = "";
				}
			}
		}
		
		public static void displayContacts()
		{
		
		contactArray[0][0] = "0"; //setting primary keys/insertion choices
		contactArray[1][0] = "1";
		contactArray[2][0] = "2";
		contactArray[3][0] = "3";
		contactArray[4][0] = "4";
		contactArray[5][0] = "5";
		contactArray[6][0] = "6";
		contactArray[7][0] = "7";
		contactArray[8][0] = "8";
		contactArray[9][0] = "9";
		
			for(int row = 0; row < contactArray.length; row++)
			{
				for(int column = 0; column < contactArray[row].length; column++)
				{
					System.out.println(contactArray[row][column] + " ");
				}
			}
		}
		
		public static void removeContact(int removalChoice)
		{
			contactArray[removalChoice][1] = "";
			contactArray[removalChoice][2] = "";
			contactArray[removalChoice][3] = "";
			contactArray[removalChoice][4] = "";

		}
		
		 public static void setFName(String userin, int insertionRow)
		{
		contactArray[insertionRow][1] = userin;
		}	
		
		public static void setLName(String userin, int insertionRow)
		{
		contactArray[insertionRow][2] = userin;
		}
		
		public static void setPhone(String userin, int insertionRow)
		{
		contactArray[insertionRow][3] = userin;
		}
		
		public static void setAge(String userin, int insertionRow)
		{
		contactArray[insertionRow][4] = userin;
		}
}