package arrays;

public class AdvancedArrayMethods {
	
	public static void main(String[] args) {
		String[] array = {"a","b","c","d","e","f","g","h"};
		shuffle(array);
	}
	
	public static void shuffle(Object[] array) {
		for(int i = 0; i < array.length; i++){
			int random = (int)(Math.random()*6);
			swap(array, i, random);
		}
	}

	public static void swap(Object[] array, int a, int b) {
		Object placeholder = array[b];
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
