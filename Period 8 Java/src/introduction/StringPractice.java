package introduction;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;

	public static void main(String[] args) {
		//demonstrateStringMethods();
		createFields();
		promptName();
		promptInput();
	}

	public static void promptName() {
		print("Enter your name.");
		user = input.nextLine();
		print("Glad to meet you, "+user+". For the rest of time, I will can you "+user+".");
	}

	public static void promptForever(){
		while(0<1)
			promptInput();
	}

	public static void promptInput() {
		print("Please type something, "+user+".");
		String userInput = input.nextLine();
		print("Congratulations! You typed: "+userInput+", "+user);
	}

	private static void createFields() {
		input = new Scanner(System.in);
		user = "";
	}

	public static void demonstrateStringMethods(){

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
		String printString = "";// = s;
		int cutoff = 35;
		//check for words to add
		//IOW s has a length > 0
		while(s.length() > 0){
			String cut = "";
			String nextWord = "";
			//check to see if next word will fit on line AND there must still be words to add
			while(cut.length()+nextWord.length() < cutoff && s.length() > 0){
			//add the next word
				cut += nextWord;
				s = s.substring(nextWord.length());
				int endOfWord = s.indexOf(" ");
				if(endOfWord == -1){
					endOfWord = s.length()-1;
				}
				nextWord = s.substring(0, endOfWord+1);
			}
			printString += cut+"\n";
		}
		
		System.out.println(printString);
	}

/*	private static String getCut(String s, int cutoff, int cut){
		int cutIndex = cut*cutoff;
		if(cutIndex>s.length()){
			cutIndex = s.length();
		}
		String currentCut = s.substring(0, cutIndex);
		int indexOfLastSpace = currentCut.length()-1;
		//start at last index, go backwards
		for(int i = currentCut.length()-1; i>=0; i--){
			String letter = currentCut.substring(i, i+1);
			if(letter.equals(" ")){
				indexOfLastSpace = i;
				break;
			}
			//shorten the cut to end on a space
			currentCut = currentCut.substring(0, indexOfLastSpace);
		}
		return currentCut;
	}*/
	//If unsure about object's fields or methods, look up API
}