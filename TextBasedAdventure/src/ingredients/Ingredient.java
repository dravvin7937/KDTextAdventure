package ingredients;

import items.item;

public class Ingredient extends item{

	//static String[] ingredients = {"mushrooms", "bacon", "cheese", "milk", "butter", "flour", "milk", "basil", "flour", "milk"}; 
	private String associatedRecipe;
	
	public Ingredient(String associatedRecipe)
	{
		this.associatedRecipe = associatedRecipe;
	}
	public static String randomIngredient(String[] arr)
	{
//		arr = ingredients;
//		int r = (int)(Math.random()*10);
//		return ingredients[r];
	}
}
