package arrays;

public class ArraysPractice {
	
	static boolean[] boos3;

	public static void main(String[] args) {
		
		int[] fiftyNumbers = new int[50000];
		/*populate(fiftyNumbers);
		print(fiftyNumbers);
		randomize(fiftyNumbers,50);
		print(fiftyNumbers);*/
		rollDice(fiftyNumbers, 2);
		//print(fiftyNumbers);
		countResult(fiftyNumbers, 2);
		//Friday, October 14, 2015
		//arrays in java MUST HAVE ONLY ONE DATA TYPE
		// If you must treat a primitive type like a class, use it's wrapper class
		
		//two different ways to create an array
		//boolean arrays made this way default to false for each spot
		//numerical arrays created this way default to 0 for each spot
		//char arrays created this way default to " " for each spot
		//boolean[] boos1 = new boolean[3];
		//this one sets size AND content, and can only be done at declaration
		//boolean[] boos2 = {false,false,false};
		//this does NOT work:
		//boos3 = {false,true,true};
		//this WILL work:
	//	boos3 = new boolean[3];
		
		/**two ways of iterating through arrays:
		 * 	STANDARD FOR LOOP
		 * 		- the index must be kept track of
		 * 		- you need to customize the order
		 */
		/*for(int i=0;i<boos1.length;i++){
			System.out.println(boos1[i]);
		}
		/**
		 * "FOR - EACH" LOOP
		 * 		- the index is not important
		 * 		- no need to customize
		 * 		- automatically assigns a "handle"
		 * 		- faster
		 */
		/*for(boolean b: boos1){
			System.out.println(b);
		}
		
		//OBJECT ARRAYS
		//String arrays created this way default to null for each spot
		String[] someStrings1 = new String[3];
		String[] someStrings2 = {"a","b","c"};
		for(int i=0;i<someStrings1.length;i++){
			System.out.println(someStrings1[i]);
		}*/
		
	}

	private static void countResult(int[] fiftyNumbers, int numberOfDice) {
		int[] counter = new int[numberOfDice*6];
		for(int n: fiftyNumbers){
			counter[n-1] = counter[n-1]+1;
		}
		for(int i = numberOfDice-1; i < counter.length; i++){
			System.out.println(i+1 + " was rolled " + 100*counter[i]/fiftyNumbers.length + "% of the time.");
		}
	}

	private static void rollDice(int[] fiftyNumbers, int numberOfDice) {
		for(int i = 0; i < fiftyNumbers.length; i++){
			int dice = 0;
			for(int j = 0; j < numberOfDice; j++){
				dice = dice + (int) (6*Math.random())+1;
			}
			fiftyNumbers[i] = dice;
		}
	}

	private static void randomize(int[] fiftyNumbers, int max) {
		for(int i = 0; i < fiftyNumbers.length; i++){
			int rand = (int) (max*Math.random())+1;
			fiftyNumbers[i] = rand;
		}
	}

	private static void print(int[] fiftyNumbers) {
		String output = "[";
		for(int i = 0; i < fiftyNumbers.length; i++){
			output += /*i +": " + */fiftyNumbers[i]+" ";
		}
		output += "]";
		System.out.println(output);
	}

	private static void populate(int[] numbers) {
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = i+1;
		}
		
	}

}
