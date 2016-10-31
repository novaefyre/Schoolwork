package caveExplorer;

import java.util.Arrays;

public class TwoDArraysIntro {
	
	public static void main(String[] args){
		//String[] xox = {"x","o","x","o","x","o"};
		//a 1D array prints a horizontal string
		
		String[][] arr2D = new String[5][4];
		for(int row = 0; row < arr2D.length; row++){
			//populate w/ coords
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "("+row+","+col+")";
			}
		}
		
		//print 2D array
		for(String[] row : arr2D){
			System.out.println(Arrays.toString(row));
		}
	}

}
