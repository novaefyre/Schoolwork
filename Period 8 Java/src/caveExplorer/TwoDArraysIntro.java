package caveExplorer;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraysIntro {
	
	static Scanner in = new Scanner(System.in);
	static String[][] arr2D;
	static String[][] pic;
	static int starti;
	static int startj;
	static int treasurei;
	static int treasurej;
	
	public static void main(String[] args){
		arr2D = new String[5][5];
		pic = new String[5][5];
		drawMap();
		for(int row = 0; row < arr2D.length; row++){
			for(int col = 0; col < arr2D.length; col++){
				arr2D[row][col] = "("+row+","+col+")";
			}
		}
		starti = 2;
		startj = 2;
		treasurei = 4;
		treasurej = 3;
		startExploring();
	}

	private static void drawMap() {
		for(int i = 0; i < pic.length; i++){
			for(int j = 0; j < pic[0].length; j++){
				pic[i][j] = " ";
				if(i == 0 || i == pic.length-1){
					pic[i][j] = "_";
				}
				if(j == 0 && i != 0 || j == pic[i].length-1){
					pic[i][j] = "|";
				}
				if(i == starti && j == startj){
					pic[i][j] = "X";
				}
			}
		}
	}

	private static void startExploring() {
		while(true){
			printPic(pic);
			System.out.println("You are in room "+arr2D[starti][startj]+".");
			if(starti == treasurei && startj == treasurej){
				break;
			}
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			int[] newCoords = interpretInput(input);
			starti = newCoords[0];
			startj = newCoords[1];
		}
		System.out.println("Congrats, you found the treasure! You win everything forever!");
	}

	private static int[] interpretInput(String input) {
		while(!isValid(input)){
			System.out.println("Sorry, only WASD commands are valid. Please try again.");
			input = in.nextLine();
		}
		int currenti = starti;
		int currentj = startj;
		input = input.toLowerCase();
		if(input.equals("w"))
			currenti--;
		if(input.equals("a"))
			currenti++;
		if(input.equals("s"))
			currentj--;
		if(input.equals("d"))
			currentj++;
		int[] newCoords = {starti,startj};
		if(currenti >= 0 && currenti < arr2D.length && currentj >= 0 && currentj < arr2D[0].length){
			newCoords[0] = currenti;
			newCoords[1] = currentj;
		}else{
			System.out.println("I can't let you do that, Dave. (You've reached the edge of the map! You can't go any farther in that direction.)");
		}
		return newCoords;
	}

	private static boolean isValid(String input) {
		String[] validKeys = {"w","a","s","d"};
		for(String key : validKeys){
			if(input.toLowerCase().equals(key)){
				return true;
			}
		}
		return false;
	}
	
	public static void printPic(String[][] pic){
		for(String[] row : pic){
			for(String col : row){
				System.out.print(col);
			}
			System.out.println();
		}
	}
}

