package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{
	
	private TextLabel label;
	TextArea paragraph;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects){
		label = new TextLabel(40,45,760, 40,"Sample Text");
		viewObjects.add(label);
		paragraph = new TextArea(40,95,550,500,"This is a whole Paragragh. Notice how these words become increasingly inane and irrelevant as you continue to read.");
		viewObjects.add(paragraph);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent m) {
		if(m.getY() > 100){
			label.setText("Mouse at "+m.getX()+", "+m.getY());
		}else{
			label.setText("Nooooo, I'm afraid of heights!");
		}
		
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

}
