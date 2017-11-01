package people;

import items.item;

public class Person extends item{
	
	private String dialogue;
	private static String name; 
	private static String description;
	
	static String[] chefs = {"Gordon Ramsey", "Bobby Flay", "Giada DiLaurentis", "Rachel Ray", "Karys Logue", "Gordon Ramsey", "Bobby Flay", "Giada DiLaurentis", "Rachel Ray", "Karys Logue"}; 
	
	public Person(String dialogue)
	{
		super(name,description);
		this.dialogue = dialogue;
	}
	
//	public static String randomPerson(String[] arr)
//	{
//		arr = chefs;
//		int r = (int)(Math.random()*10);
//		return arr[r];
//	}
}
