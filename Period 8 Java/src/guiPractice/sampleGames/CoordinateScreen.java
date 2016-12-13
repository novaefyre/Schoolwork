package guiPractice.sampleGames;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.TextArea;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen {
	
	private TextLabel label;

	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects){
		label = new TextLabel(40,45,760, 40,"Sample Text");
		viewObjects.add(label);
		TextArea paragraph = new TextArea(40,35,760,500,"This is a whole Paragragh. Notice how these words become increasingly inane and irrelevant as you continue to read.");
		viewObjects.add(paragraph);
	}

}
