package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Graphic;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class TestScreen extends Screen implements MouseListener{

	private TextLabel testLabel;
	private ClickableGraphic testImg;
	private Button testButton;
	
	public TestScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		testLabel = new TextLabel(40,45,760, 40,"This is a test.");
		testImg = new ClickableGraphic(250,250,"resources/sampleImages/nova.jpg",new Action(){
			public void act(){
				testImg.loadImages("resources/sampleImages/nova.jpg",1);
			}
		});
		testButton = new Button(40,200,80,40,"Coord",new Color(0,76,153), new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.coordScreen);
			}
		});
		viewObjects.add(testButton);
		viewObjects.add(testImg);
		viewObjects.add(testLabel);

	}
	
	public MouseListener getMouseListener(){
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(testButton.isHovered(e.getX(), e.getY())){
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
