package caveExplorer;

import java.util.Arrays;

public class TwoDArraysIntro {
	
	public static void main(String[] args){
		boolean[][] mines = new boolean[6][6];
		plantMines(mines);
		String[][] field = createField(mines);
		printPic(field);
	}
	
	private static String[][] createField(boolean[][] mines) {
		String[][] field = new String[mines.length][mines[0].length];
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[row].length; col++){
				if(mines[row][col])
					field[row][col] = "X";
				else{
					field[row][col] = countNearby(mines, row, col);
				}
			}
		}
		return field;
	}

	private static String countNearby(boolean[][] mines, int row, int col) {
		for(int r = row-1; r <= row+1; r++){
			for(int c = col-1; c <= col+1; c++){
				if(r >= 0 && r < mines.length && c >=0 && c < mines[0].length){
					
				}
			}
		}
		return null;
	}

	private static void plantMines(boolean[][] mines) {
		int numOfMines = 10;
		while(numOfMines > 0){
			int row = (int)(Math.random() * mines.length-1);
			int col = (int)(Math.random() * mines[0].length-1);
			//prevent same mine selected twice
//			while(mines[row][col]){
//				row = (int)(Math.random() * mines.length-1);
//				col = (int)(Math.random() * mines[0].length-1);
//			}
			if(!mines[row][col]){
				mines[row][col] = true;
				numOfMines--;
			}
		}
		
	}

	public static void printPic(String[][] pic){
		for(String[] row : pic){
			for(String col : row){
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	public static void intro(){
		String[] xox = {"x","o","x","o","x","o"};
		//a 1D array prints a horizontal string
		
		String[][] pic = new String[10][8];
		for(int row = 0; row < pic.length; row++){
			//populate w/ coords
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
		
		//print 2D array
		for(String[] row : pic){
			System.out.println(Arrays.toString(row));
		}
	}

}

