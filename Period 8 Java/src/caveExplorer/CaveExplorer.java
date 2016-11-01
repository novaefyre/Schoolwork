package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {

	public static CaveRoom[][] caves;
	public static Scanner in;
	public static CaveRoom currentRoom;
	public static InventoryNockles inventory;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		caves = new CaveRoom[5][5];
		for(int row = 0; row < caves.length; row++){
			for(int col = 0; col < caves[row].length; col++){
				caves[row][col] = new CaveRoom("This room has cordinates "+row+", "+col);
			}
		}
		currentRoom = caves[1][2];
		currentRoom.enter();
		caves[1][2].setConnection(CaveRoom.WEST, caves[1][1], new Door());
		caves[1][2].setConnection(CaveRoom.SOUTH, caves[2][2], new Door());
		caves[1][2].setConnection(CaveRoom.NORTH, caves[1][3], new Door());
	}

}