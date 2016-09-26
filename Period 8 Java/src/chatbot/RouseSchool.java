package chatbot;

public class RouseSchool implements Chatbot {
	
	private boolean inSchoolLoop;
	private String schoolResponse;

	@Override
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop);{
			RouseMain.print("Type 'quit' to go back.");
			schoolResponse = RouseMain.promptInput();
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				RouseMain.promptForever();
			}
			RouseMain.print("That's my favorite part about school!");
		}
		
	}

}
