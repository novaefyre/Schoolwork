package introduction;

public class StringPractice {

	public static void main(String[] args) {
		String text1 = new String("Hello World");
		String text2 = "Hello World";//same as above
		//System.out.println("Hello World");
		if(text1.equals(text2)){//DO NOT USE == FOR OBJECTS. primitive types only
			print("These strings are equal");
		}
		print(text1);
		print(text2);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		if(word1.compareTo(word2)<0){//this is, obviously, how you compare strings and many other objects.
			print("word1 is greater than word2");
		}
		

	}
	
	public static void print(String s){
		System.out.println(s);
	}

}//If unsure about object's fields or methods, look up API
