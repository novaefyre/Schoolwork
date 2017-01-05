package guiPractice.sampleGames;

import guiPractice.GUIApplication;

@SuppressWarnings("serial")
public class MouseFollower extends GUIApplication {
	
	public static CoordinateScreen coordScreen;
	public static TestScreen testScreen;
	public static MouseFollower game;
	
	public static void main(String[] args){
		game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}
	
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		testScreen = new TestScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}

}
