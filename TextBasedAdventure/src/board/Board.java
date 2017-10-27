package board;

//import rooms array
import rooms.Room;

public class Board {

	//fields
	private Room[][] kitchenMap;
	
	public Board(Room[][] kitchenMap)
	{
		this.kitchenMap = kitchenMap;
	}
	
	public static void printBoard(int length)
	{
		for (int i = 0; i<length; i++)
		{
			Room.printRooms(length);
		}
	}
}
