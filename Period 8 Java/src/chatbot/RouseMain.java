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

	private static int findKeyword(String searchString, String keyword, int startPosition) {
		searchString = searchString.trim();//delete whitespace
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		int pan = searchString.indexOf(0);
		while(startPosition >= 0){
			String before = " ";
			String after = " ";
			if(startPosition > 0){
				before = searchString.substring(startPosition-1, startPosition);
			}
			if(startPosition + keyword.length() < searchString.length()){
				after = searchString.substring(startPosition + keyword.length(), startPosition + keyword.length()+1);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
				return startPosition;
			}else{
				startPosition = searchString.indexOf(keyword,startPosition+1);
			}
		}
		return -1;
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

}