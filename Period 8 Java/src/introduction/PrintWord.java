package introduction;

public class PrintWord {

	public static void main(String[] args) {
		PrintWord thatGuy = new PrintSentence();
		thatGuy.words();
	}
	
	public void words(){
		System.out.println("This is a String.");
	}
}
