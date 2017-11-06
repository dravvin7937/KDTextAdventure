package people;

import items.item;

public class Person extends item{
	
	private String dialogue;
	private static String name; 
	private static String description;
	
	static String[] chefs = {"Gordon Ramsey", "Bobby Flay", "Giada DiLaurentis", "Rachel Ray", "Karys Logue", "Gordon Ramsey", "Bobby Flay", "Giada DiLaurentis", "Rachel Ray", "Karys Logue"}; 
	
	static String gRamsey = " Let pancake batter rest, covered, for 15 minutes so it can thicken and create fluffier pancakes. Eggs are essential to a good pancake";
	static String bFlay = "I like to do my scramble with a little bit of scallions and romesco, which is a peppery, Spanish, pesto-like sauce";
	static String gDilaur = "I like to add lots of different cheeses, and sometimes I add prosciutto, sometimes I add salami — it just depends.";
	static String rRay = "Apples and Pumpkins make great pies due to their texture";
	static String kLogue = "Everything will taste richer and better with butter";
	
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
