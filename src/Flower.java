public class Flower extends plant
{
	// Declare attributes here
	  private String name;
	  private String color;
	  private boolean isThorny;
	  private boolean isSmelly;
	
	// Create an overridden constructor here
	public Flower(String name, String color, boolean isThorny, boolean isSmelly)
	{
		this.name = name;
		this.color = color;
		this.isThorny = isThorny;
		this.isSmelly = isSmelly;
	}
	
	//Create accessors and mutators for your traits.
	
	 public String getName()
	 {
		 return name; 
	 }
	 	 
	 public String getColor()
	 {
		 return color; 
	 }
	 
	 public boolean getThorns()
	 {
		 return isThorny; 
	 }
	 
	 public boolean getSmells()
	 {
		 return isSmelly; 
	 }
}
