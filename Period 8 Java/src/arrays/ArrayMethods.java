package arrays;

public class ArrayMethods {
	
	public static void main(String[] args) {

		/**
		 * IMPORTANT NOTE:
		 * This homework assignment will be weighted 4x.
		 * DO NOT ASSUME my tests are perfect! If you have code that you think should work,
		 * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
		 * DO NOT spend hours and hours trying to fix perfect code just because my test
		 * says that it isn't perfect!
		 */
		int[] x = {2,0,3,4,8,7,5};
		isSorted(x);
	    }
	    
    public static int searchUnsorted(int[] arrayToSearch, int key){
    	/**
    	 * this method take an unsorted int array (arrayToSearch) and returns an
    	 * int corresponding to the index of a key, if it is in the array
    	 * if the key is not in the array, this method returns -1
    	 */
    	for(int i = 0; i < arrayToSearch.length; i++){
    		if(arrayToSearch[i] == key){
    			return i;
    		}
    	}
    	return -1;
    }
    
    public static boolean isSorted(int[] array){
    	/**
    	 * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
    	 */
    	for(int i = 0; i < array.length-1; i++){
    		if(array[i]>array[i+1])
    			return false;
    	}
        return true;
    }
    
    public static double[] getStats(double[] array){
    	/**
    	 * This method return a double[] contain a WHOLE BUNCH of stats
    	 * The double array must keep the following stats about the array parameter:
    	 * index 0 = the mean
    	 * index 1 = the max
    	 * index 2 = the min
    	 * index 3 = the median
    	 * index 4 = the number of values greater than or equal to the mean
    	 * index 5 = the number of values below the mean
    	 */
    	double[] stats = new double[6];
    	double mean = array[0];
    	double max = array[0];
    	double min = array[0];
    	double median;
    	double moreThanMean = 0;
    	double lessThanMean = 0;
    	for(int i = 1; i < array.length; i++){
        	 if(array[i]>max){
        		 max = array[i];
        	 }
        	 if(array[i]<min){
        		 min = array[i];
        	 }
        	 mean += array[i];
        }
    	
    	mean = mean/array.length;
    	for(int i = 0; i <array.length; i++){
    		if(array[i] < mean){
    			lessThanMean++;
    		}else{
    			moreThanMean++;
    		}
    	}
    		
    	
    	if((array.length/2)-((int)array.length/2) != 0){
    		median = array[(int) (array.length/2)+1];
    	}else{
    		median = (array[(int) (array.length/2)]+array[(int) (array.length/2)+1])/2;
    	}
    	
    	stats[0] = mean;
    	stats[1] = max;
    	stats[2] = min;
    	stats[3] = median;
    	stats[4] = moreThanMean;
    	stats[5] = lessThanMean;
    	return stats;
    }
    
    public static void reverseOrder(int[] array){
    	/**
    	 * this method reverses the order of the array passed to it.
    	 * Not that this method does not have a return type. You do not need to copy the array first
    	 * Furthermore, note that the array is not necessarily in any *particular* order. It may be
    	 * in a random order, though you still need to reverse whatever order it is in
    	 * 
    	 * Example:
    	 * array = {5, 1, 9, 10, 16, -6}
    	 * after calling this method
    	 * array = {-6, 16, 10, 9, 1, 5}
    	 * 
    	 */
    	int[] revArray = new int[array.length];
    	int revIdx = 0;
    	for(int i = array.length-1; i > -1; i--){
    		revArray[revIdx] = array[i];
    		revIdx++;
    	}
    	for(int i = 0; i < array.length; i++){
    		array[i] = revArray[i];
    	}
    }
}
