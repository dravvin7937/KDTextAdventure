package people;

public class Person {

	private String name;
	
	static String[] chefs = {"Gordon Ramsey", "Bobby Flay", "Giada DiLaurentis", "Rachel Ray", "Karys Logue", "Gordon Ramsey", "Bobby Flay", "Giada DiLaurentis", "Rachel Ray", "Karys Logue"}; 
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public static String randomPerson(String[] arr)
	{
		arr = chefs;
		int r = (int)(Math.random()*10);
		return arr[r];
	}
}
