package caveExplorer;

import java.util.Arrays;

public class TwoDArraysIntro {
	
	public static void main(String[] args){
		//String[] xox = {"x","o","x","o","x","o"};
		//a 1D array prints a horizontal string
		
		String[][] pic = new String[10][8];
		for(int row = 0; row < pic.length; row++){
			//populate w/ coords
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
		//grassy field
		pic[0][3] = "|";
		pic[1][3] = "o";
		pic[2][3] = "|";
		pic[1][2] = "-";
		pic[1][4] = "-";
		for(int i = 0; i < 3; i++){
			pic[3][(int) (Math.random()*pic[3].length)] = "<";
		}
		pic[4][(int) (Math.random()*pic[3].length)] = "@";
		
		for(int row = 5; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = "w";
			}
		}
		
		for(String[] row : pic){
			for(String col : row){
				System.out.print(col);
			}
			System.out.println();
		}
		
		//print 2D array
	/*	for(String[] row : pic){
			System.out.println(Arrays.toString(row));
		}*/
	}

}
