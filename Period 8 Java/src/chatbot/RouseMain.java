package chatbot;

import java.util.Scanner;

public class RouseMain {

	static Scanner input;
	static String user;
	static String response;
	static boolean inMainLoop;
	static Chatbot school;

	public static void main(String[] args) {
		//demonstrateStringMethods();
		createFields();
		promptName();
		promptForever();
	}

	public static void promptName() {
		print("Enter your name.");
		user = input.nextLine();
		print("Glad to meet you, "+user+". For the rest of time, I will call you "+user+".");
	}

	public static void promptForever(){
		inMainLoop = true;
		while(inMainLoop){
			print("Hi, "+user+" how are you?");
			response = promptInput();
			if(findKeyword(response, "good", 0) >= 0){
				print("That's wonderful.");
			}else  if(response.indexOf("school") >= 0){
				print("School is great! Tell me about school.");
				inMainLoop = false;
				school.talk();
			}else{
				print("I don't understand.");
			}
		}
	}

	public static int findKeyword(String searchString, String keyword, int startPosition) {
		searchString = searchString.trim();//delete whitespace
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		System.out.println("The phrase is "+searchString);
		System.out.println("The keyword is "+keyword);
		int psn = searchString.indexOf(keyword);
		System.out.println("The keyword was found at "+psn);
		while(psn >= 0){
			String before = " ";
			String after = " ";
			if(psn > 0){
				before = searchString.substring(psn-1, psn);
				System.out.println("The character before is "+before);
			}
			if(startPosition + keyword.length() < searchString.length()){
				after = searchString.substring(psn + keyword.length(), psn + keyword.length()+1);
				System.out.println("The character after is "+after);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0 && noNegations(searchString, psn)){
				return psn;
			}else{
				psn = searchString.indexOf(keyword,psn+1);
			}
		}
		return -1;
	}

	private static boolean noNegations(String searchString, int psn) {
		//is the word "no" in front of the position?
		//are there three spaces in front of ?
		if(psn - 3 >= 0 && searchString.substring(psn-3, psn).equals("no ")){
			return false;
		}
		if(psn - 4 >= 0 && searchString.substring(psn-4, psn).equals("not ")){
			return false;
		}
		if(psn - 6 >= 0 && searchString.substring(psn-6, psn).equals("never ")){
			return false;
		}
		if(psn - 4 >= 0 && searchString.substring(psn-4, psn).equals("n't ")){
			return false;
		}
		return true;
	}

	public static String promptInput() {
		String userInput = input.nextLine();
		return userInput;
	}

	private static void createFields() {
		input = new Scanner(System.in);
		user = "";
		school = new RouseSchool();
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
		int cutoff = 50;
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

}