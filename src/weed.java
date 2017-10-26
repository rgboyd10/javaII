public class weed extends plant
{
	private String name;
	private String color;
	private boolean isPoisonous;
	private boolean isMedicinal;
	private boolean isEdible;

public weed(String name, String color, boolean isPoisonous, boolean isMedicinal, boolean isEdible)
{
	this.name = name;
	this.color = color;
	this.isPoisonous = isPoisonous;
	this.isMedicinal = isMedicinal;
	this.isEdible = isEdible;
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
	
	public boolean getisMedicinal()

	{
		return isMedicinal;
	}

	public boolean getisEdible()
	{
		return isEdible;
	}
}

