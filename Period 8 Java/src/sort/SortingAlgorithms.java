package sort;
import java.util.Arrays;

public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToSort={133,0,-5,31,12,12,2};
		System.out.println("- - - QUICKSORT SORT - - -");
		System.out.println(Arrays.toString(arrayToSort));
//		selectionSort(copy(arrayToSort));
	}

	public static int[] copy(int[] arrayToSort){
		int[] copy = new int[arrayToSort.length];
		for(int i = 0; i < copy.length; i++){
			copy[i]=arrayToSort[i];
		}
		return copy;
	}
	
	public static void swap(int[] arrayToSort, int i, int j){
		System.out.println("Swapping "+arrayToSort[i]+" and "+arrayToSort[j]);
		int placeHolder=arrayToSort[j];
		arrayToSort[j]=arrayToSort[i];
		arrayToSort[i]=placeHolder;
		System.out.println(Arrays.toString(arrayToSort));
	}
	
	public static void selectionSort(int[] arrayToSort){
		int minIndex=0;
		int minimum=arrayToSort[0];
		for(int i=0;i<arrayToSort.length;i++){
			minIndex=i;
			minimum=arrayToSort[i];
			for(int j=i;j<arrayToSort.length;j++){
				if(arrayToSort[j]<minimum){
					minimum=arrayToSort[j];
					minIndex=j;
				}
			}
			swap(arrayToSort, i, minIndex);
		}
	}

}
