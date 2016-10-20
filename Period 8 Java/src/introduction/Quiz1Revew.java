package introduction;

import java.util.Scanner;

public class Quiz1Revew {
	
	static Scanner input = new Scanner(System.in);
	
	//1 point use waitForEntry() correctly
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	//1 point visibility private
	//1 point type declaration [throughout entire program]
	private static String username = "test_user";
	private static String password = "test";
	
	//1 point valid method
	public static void main(String[] args){
		//1 point for asking username once and only once
		if(correctUser()){
			askPassword();
		}else{
			System.out.println("Please contact the system administrator");
		}
	}

	private static void askPassword() {
		boolean inLoop = true;
		int triesLeft = 3;
		//1 point have a loop
		//1 point saying invalid password after three attempts (half point if attempted, but wrong)
		//1 point telling the user how many attempts are remaining (half point if attempted, but wrong)
		while(inLoop){
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("Login Successful");
				inLoop = false;
			}else{
				triesLeft--;
				if(triesLeft == 0){
					System.out.println("Invalid password");
					inLoop = false;
				}else{
					System.out.println("You have "+triesLeft+" attempts remaining.");
				}
			}
		}
		
	}

	private static boolean correctUser() {
		System.out.println("Enter a username");
		//1 point, comparing strings
		if(waitForEntry().equals(username)){
			return true;
		}
		return false;
		/**
		 * this is shorter and more elegant:
		 * return waitForEntry().equals(username);
		 */
	}
}
