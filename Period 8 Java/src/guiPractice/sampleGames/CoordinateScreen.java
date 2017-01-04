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
import guiPractice.components.MovingComponent;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{
	
	private TextLabel label;
	private TextArea paragraph;
	private Button myButton;
//	private Graphic img;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects){
		label = new TextLabel(40,45,760, 40,"Sample Text");
		paragraph = new TextArea(40,95,550,500,"This is a whole Paragragh. Notice how these words become increasingly inane and irrelevant as you continue to read.");
		myButton = new Button(40,200,80,40,"Test",new Color(0,76,153), new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.testScreen);
			}
		});
//		img = new Graphic(250,250,.5,"resources/sampleImages/nova.jpg");
//		viewObjects.add(img);
		viewObjects.add(myButton);
		viewObjects.add(paragraph);
		viewObjects.add(label);
		MovingComponent mc = new MovingComponent(30,60,80,80);
		mc.setVy(3);
		mc.play();
		viewObjects.add(mc);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent m) {
//		if(m.getY() > 100){
//			label.setText("Mouse at "+m.getX()+", "+m.getY());
//		}else{
//			label.setText("Nooooo, I'm afraid of heights!");
//		}
		label.setText("Mouse at "+m.getX()+", "+m.getY());
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(myButton.isHovered(e.getX(), e.getY())){
			myButton.act();
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
