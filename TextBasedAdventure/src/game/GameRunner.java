package game;

import board.Board;
import ingredients.Ingredient;

public class GameRunner {
	
	private static String[] ingredients = {"eggs", "milk", "pasta", "cheese", "apple", "pumpkin", "sugar", "flour", "butter", "cinnamon"};
	private static String[] associatedRecipes = {"eggnog", "pancakes", "pie", "mac & cheese"};
	public static void main(String[] args)
	{
		System.out.println("------------");
		System.out.println("Welcome to our Missing Ingredient game");
		System.out.println("Navigate the floors in order to find the missing ingredient ");
		System.out.println("Inspired by Master Chef and Chopped");
		System.out.println("------------");
		System.out.println("Your Recipe: "+ GameRunner.getRandom(associatedRecipes));
		System.out.println("Missing ingredient: " + Ingredient.getRandom(ingredients));
		
		System.out.println("------------");
		Board.printBoard(5);
		System.out.println("------------");
		//System.out.println(" Your Current Position:");
	}
	
}
