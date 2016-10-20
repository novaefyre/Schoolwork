package arrays;

public class AdvancedArrayMethods {
	
	public static void main(String[] args) {
		String[] array = {"a","b","c","d","e","f","g","h"};
		swap(array,0,array.length-1);
	}
	
	private static void swap(String[] array, int a, int b) {
		String placeholder = array[b];
		array[b] = array[a];
		array[a] = placeholder;
	}

	public static void copyArray(int[] original, int[] target){
		if(original.length == target.length){
			for(int i = 0; i < original.length; i++){
				target[i] = original[i];
			}
		}else{
				System.out.println("ERROR: tried to copy arrays of different lengths.");
		}
	}
}
