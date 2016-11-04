package caveExplorer;

import java.util.Scanner;

public class ConnectFour {

	static String[][] board;
	static boolean[][] filled;
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		board = new String[8][8];
		filled = new boolean[8][8];
		for(int row = 0; row < board.length; row++){
			for(int col = 0; col < board[row].length; col++){
				if(row == 0){
					board[row][col] = " "+col;
				}else{
					board[row][col] ="| ";
					if(col == 7){
						board[row][col] += "|";
					}
				}
			}
		}
		printPic(board);
		playGame();

	}
	
	public static void playGame() {
		while(true){
			print("Which column would you like to place your piece in?");
			String input = in.nextLine();
			int column = Integer.parseInt(input);
			if(column < 0 || column >= board[0].length){
				print("Sorry, that column does not exist");
			}else{
				dropPiece(column);
				printPic(board);
			}
		}
		
	}

	public static void dropPiece(int column) {
		for(int row = board.length-1; row >= 1; row--){
			if(!filled[row][column]){
				print("You dropped a piece into column "+column);
				board[row][column] = "|O";
				filled[row][column] = true;
				if(column == 7){
					board[row][column] += "|";
				}
			return;
			}
		}
		print("Sorry, this column is full. Please enter another column.");
	}

	public static void printPic(String[][] pic){
		for(String[] row : pic){
			for(String col : row){
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	public static void print(String line){
		System.out.println(line);
	}

}
