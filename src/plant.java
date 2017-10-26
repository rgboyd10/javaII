public class plant
{
	private int iD;
	private String name = "bob";
	
	public plant()
	{}
	
	public plant(String name, int iD)
	{
		iD = (int)(Math.random() * 50 + 1);
		this.name = name;
		this.iD = iD;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getiD()
	{
		return iD;
	}

}