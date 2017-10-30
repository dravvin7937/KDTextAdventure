package rooms;

import ingredients.Ingredient;
import people.Person;

//import people and ingredients

public class Room {

	private static String[] ingredients = {"milk", "butter", "flour"};
	private static String[] chefs = {"Gordon Ramsey", "Bobby Flay", "Giada DiLaurentis", "Rachel Ray", "Karys Logue", "Gordon Ramsey", "Bobby Flay", "Giada DiLaurentis", "Rachel Ray", "Karys Logue"}; 
	//Field to be added bc every room should have a memory of what it is person or ingredient
	//Room constructor can randomize
	
	public Room()
	{
		
	}
	
	public static String[] printRooms(int length)
	{
		String room = "";
		String[] row = new String[length];
		int r = (int)((Math.random()*10+1));
		
		for (int i = 0; i<length; i++)
		{
			if (i%r==0)
			{
				 room = "[" + Person.randomPerson(chefs) + "]";
			}
			else
			{
				 room = "[" + Ingredient.randomIngredient(ingredients) + "]";
			}
			row[i] = room;
			System.out.print(row[i]);
		}
		System.out.println("");
		return row;
	}
}
