package sort;
import java.util.Arrays;

public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToSort={133,0,-5,31,12,12,2};
//		System.out.println("- - - SELECTION SORT - - -");
//		System.out.println(Arrays.toString(arrayToSort));
//		selectionSort(copy(arrayToSort));
		quicksort(arrayToSort);
	}
	
	private static void quicksort(int[] arrayToSort) {
		quicksort(arrayToSort,0,arrayToSort.length);
		
	}

	public static int[] copy(int[] arr){
		int[] copy = new int[arr.length];
		for(int i = 0; i < copy.length; i++){
			copy[i]=arr[i];
		}
		return copy;
	}
	
	public static void swap(int[] arr, int i, int j){
		System.out.println("Swapping "+arr[i]+" and "+arr[j]);
		int placeHolder=arr[j];
		arr[j]=arr[i];
		arr[i]=placeHolder;
		System.out.println(Arrays.toString(arr));
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
	
	public static void quicksort(int[] array, int s, int e){
		if(array.length <= 1){
			return;
		}
		if(s == e){
			e =array.length-1; 
		}
		int pivot = array.length-1;
		for(int i = s; i < e; i++){
			if(array[i] > array[pivot]){
				int toMove = array[i];
				for(int j = i; j < pivot; j++){
					array[j] = array[j++];
				}
				array[pivot] = toMove;
				pivot--;
			}
			if(pivot-1 >= 0)
				quicksort(array,0,pivot-1);
			if(pivot+1 < array.length)
				quicksort(array,pivot+1,array.length-1);
		}
	}
}
