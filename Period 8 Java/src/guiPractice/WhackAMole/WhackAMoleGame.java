package guiPractice.WhackAMole;

import guiPractice.GUIApplication;

public class WhackAMoleGame extends GUIApplication {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WhackAMoleGame game = new WhackAMoleGame();
		Thread app = new Thread(game);
		app.start();

	}

	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		WhackAMoleScreen wScreen = new WhackAMoleScreen(getWidth(),getHeight());
		setScreen(wScreen);

	}

	

}