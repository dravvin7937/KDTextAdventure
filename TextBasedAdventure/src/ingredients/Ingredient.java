package ingredients;

public class Ingredient {

	static String[] ingredients = {"mushrooms", "bacon", "cheese", "milk", "butter", "flour", "milk", "basil", "flour", "milk"}; 
	
	public Ingredient()
	{
		
	}
	public static String randomIngredient(String[] arr)
	{
		arr = ingredients;
		int r = (int)(Math.random()*10);
		return ingredients[r];
	}
}
