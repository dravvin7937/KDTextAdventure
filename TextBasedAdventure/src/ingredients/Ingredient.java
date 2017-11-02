package ingredients;

import items.item;

public class Ingredient extends item{

	private static String[] ingredients = {"eggs", "milk", "pasta", "cheese", "apple", "pumpkin", "sugar", "flour", "butter", "cinnamon"};

	private static String name; 
	private static String description;
	private static String[] associatedRecipes;
	
	public Ingredient(String[] associatedRecipes)
	{
		super(name,description);
		Ingredient.associatedRecipes = associatedRecipes;
	}
//	public static String randomIngredient(String[] arr)
//	{
//		int r = (int)(Math.random()*10);
//		arr[r] = name;
//		return arr[r];
//	}
}
