package caveExplorer;

import java.util.Arrays;

public class Minefield {

	public static void main(String[] args){
		boolean[][] mines = new boolean[10][10];
		plantMines(mines, 30);
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
//		for(int r = row-1; r <= row+1; r++){
//			for(int c = col-1; c <= col+1; c++){
//				//check if element exists
//				if(r >= 0 && r < mines.length && c >=0 && c < mines[0].length){
//					
//				}
//			}
//		}
//		//this one only considers actual elements
//		int count = 0;
//		for(int r  = 0; r < mines.length; r++){
//			for(int c = 0; c < mines[r].length; c++){
//				if(Math.abs(r-row)+Math.abs(c-col) == 1 && mines[r][c]){
//					count++;
//				}
//			}
//		}
//		return ""+count;
		//this method allows more specificity
		int count = 0;
		count += isValidAndTrue(mines, row-1, col);
		count += isValidAndTrue(mines, row+1, col);
		count += isValidAndTrue(mines, row, col-1);
		count += isValidAndTrue(mines, row, col+1);
		return ""+count;
	}

	private static int isValidAndTrue(boolean[][] mines, int i, int j) {
		if(i >= 0 && i < mines.length && j >= 0 && j < mines[0].length && mines[i][j]){
			return 1;
		}
		return 0;
	}

	private static void plantMines(boolean[][] mines, int numOfMines) {
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
	
	public static String[][] textGrid(int height, int width){
		String[][] grid = new String[height][width];
		String[][] gridOut = new String[height*3][width*2];
		for(int i = 0; i < grid.length; i++){
			if(i%4 == 0){
				for(int k = 0; k < gridOut[i].length; k++){
					gridOut[i][k] = "_";
				}
			}else{
				if(i%3 == 0){
					for(int k = 0; k < gridOut[i].length; k++){
						gridOut[i][k] = "|";
					}
				}else{
					for(int k = 0; k < gridOut[i].length; k++){
						gridOut[i][k] = " ";
					}
				}
			}
		}
		return gridOut;
	}
}
