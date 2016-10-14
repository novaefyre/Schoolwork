package arrays;

public class ArraysPractice {
	
	static boolean[] boos3;

	public static void main(String[] args) {
		//arrays in java MUST HAVE ONLY ONE DATA TYPE
		// If you must treat a primitive type like a class, use it's wrapper class
		
		//two different ways to create an array
		//boolean arrays made this way default to false for each spot
		//numerical arrays created this way default to 0 for each spot
		//char arrays created this way default to " " for each spot
		boolean[] boos1 = new boolean[3];
		//this one sets size AND content, and can only be done at declaration
		boolean[] boos2 = {false,false,false};
		//this does NOT work:
		//boos3 = {false,true,true};
		//this WILL work:
		boos3 = new boolean[3];
		
		/**two ways of iterating through arrays:
		 * 	STANDARD FOR LOOP
		 * 		- the index must be kept track of
		 * 		- you need to customize the order
		 */
		for(int i=0;i<boos1.length;i++){
			System.out.println(boos1[i]);
		}
		/**
		 * "FOR - EACH" LOOP
		 * 		- the index is not important
		 * 		- no need to customize
		 * 		- automatically assigns a "handle"
		 * 		- faster
		 */
		for(boolean b: boos1){
			System.out.println(b);
		}
		
		//OBJECT ARRAYS
		//String arrays created this way default to null for each spot
		String[] someStrings1 = new String[3];
		String[] someStrings2 = {"a","b","c"};
		for(int i=0;i<someStrings1.length;i++){
			System.out.println(someStrings1[i]);
		}
	}

}
