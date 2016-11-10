package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {

	public static CaveRoom caves[][];
	public static Scanner in;
	public static CaveRoom currentRoom;
	public static Inventory inventory;
	
	public static void main(String[] args){
		in = new Scanner(System.in);
		caves = new CaveRoom[5][5];
		for(int row = 0; row < caves.length; row++){
			for(int col =0; col < caves[row].length; col++){
				caves[row][col] = new CaveRoom("This cave has coordinates" +"(" + row + "," + col + ")");
			}
		}
		caves[0][2] = new EventRoom("This is the room where the guy with a tail met you.", new GameStartEvent());
		currentRoom = caves[0][0];
		currentRoom.enter();
		//set contents of caveRoom to an x
		caves[0][0].setConnection(CaveRoom.EAST, caves[0][1], new Door());
		caves[0][1].setConnection(CaveRoom.EAST, caves[0][2], new Door());
		caves[0][2].setConnection(CaveRoom.SOUTH, caves[1][2], new Door());
		caves[0][0].setConnection(CaveRoom.SOUTH, caves[1][0], new Door());
		caves[1][2].setConnection(CaveRoom.SOUTH, caves[2][2], new Door());
		caves[2][2].setConnection(CaveRoom.EAST, caves[2][3], new Door());
		caves[2][2].setConnection(CaveRoom.SOUTH, caves[3][2], new Door());
		caves[2][2].setConnection(CaveRoom.WEST, caves[2][1], new Door());
		caves[2][3].setConnection(CaveRoom.EAST, caves[2][4], new Door());
		caves[2][4].setConnection(CaveRoom.NORTH, caves[1][4], new Door());
		caves[1][4].setConnection(CaveRoom.NORTH, caves[0][4], new Door());
		caves[3][2].setConnection(CaveRoom.SOUTH, caves[4][2], new Door());
		caves[4][2].setConnection(CaveRoom.EAST, caves[4][3], new Door());
		caves[4][3].setConnection(CaveRoom.EAST, caves[4][4], new Door());
		caves[4][2].setConnection(CaveRoom.WEST, caves[4][1], new Door());
		caves[4][1].setConnection(CaveRoom.WEST, caves[4][0], new Door());
		caves[2][1].setConnection(CaveRoom.WEST, caves[2][0], new Door());
		caves[2][0].setConnection(CaveRoom.NORTH, caves[1][0], new Door());
		inventory = new Inventory();
		startExploring();
	}

	private static void startExploring() {
		while(true){
			System.out.println(inventory.getDescription());
			System.out.println(currentRoom.getDescription());
			System.out.println("What would you like to do?");
			String input = in.nextLine();
			currentRoom.interpretInput(input);
		}
	}

	public static void print(String string) {
		System.out.println(string);
		
	}
}
