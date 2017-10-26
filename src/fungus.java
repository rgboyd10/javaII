public class fungus extends plant
{
	private String name;
	private String color;
	private boolean isPoisonous;


public fungus(String name, String color, boolean isPoisonous)
	{
		this.name = name;
		this.color = color;
		this.isPoisonous = isPoisonous;
	}
	
	public String getName()
	{
		return name;
	}
		
	public String getColor()
	{
		return color;
	}
	
	public boolean getIsPoisonous()
	{
		return isPoisonous;
	}
	
	}
