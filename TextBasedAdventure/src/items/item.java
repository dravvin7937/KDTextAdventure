package items;

public abstract class item {
	
	private String name;
	private String description;
	
	public item(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
	
	public String getName()
	{
		return "This is " + name + ".";
	}
	public String getDescription()
	{
		return name + " does " + description + ".";
	}
	public static String getRandom(String[] arr)
	{
		//arr is the hardcoded array of either ingredients or people, it will pick a random index from each array
		int r = (int)(Math.random()*10);
		return arr[r];
	}
	
}
