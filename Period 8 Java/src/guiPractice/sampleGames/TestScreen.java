package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class TestScreen extends Screen implements MouseListener{

	private TextLabel testLabel;
	private Graphic testImg;
	private Button testButton;
	
	public TestScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		testLabel = new TextLabel(40,45,760, 40,"This is a test.");
		testImg = new Graphic(250,250,"resources/sampleImages/nova.jpg");
		testButton = new Button(40,200,80,40,"Button",new Color(0,76,153), new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.coordScreen);
			}
		});
		viewObjects.add(testButton);
		viewObjects.add(testImg);
		viewObjects.add(testLabel);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(testButton.isClicked(e.getX(), e.getY())){
			testButton.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
