package chatbot;

public class RouseHello implements Chatbot {
	
	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponses;
	private String[] angryResponses;
	
	private int helloCount;
	
	public RouseHello(){
		helloCount = 0;
	}

	@Override
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();//helper
			helloResponse = RouseMain.promptInput();
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				RouseMain.promptForever();
			}
		}
		
	}

	private void printResponse() {
		if(helloCount > 4){
			int responseSelection = (int) (Math.random()*angryResponses.length);
			RouseMain.print(angryResponses[responseSelection]);
		}else{
			int responseSelection = (int) (Math.random()*calmResponses.length);
			RouseMain.print(calmResponses[responseSelection]);
		}
	}

	@Override
	public boolean isTriggered(String userInput) {
		if(RouseMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;
		}
		if(RouseMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;
		}
		if(RouseMain.findKeyword(userInput, "hey", 0) >= 0){
			return true;
		}
		return false;
	}

}
