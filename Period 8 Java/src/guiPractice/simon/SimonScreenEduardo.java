package guiPractice.simon;

import java.awt.Color;
import java.util.ArrayList;

import guiPractice.components.Action;
import guiPractice.ClickableScreen;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class SimonScreenEduardo extends ClickableScreen implements Runnable {

	private TextLabel label;
	private ButtonInterfaceEduardo[] buttons;
	private ProgressInterfaceEduardo progressBox;
	private ArrayList<MoveInterfaceEduardo> sequence;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	
	public SimonScreenEduardo(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons();
		progressBox = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceEduardo>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progressBox);
		viewObjects.add(label);
	}

	private MoveInterfaceEduardo randomMove() {
		ButtonInterfaceEduardo b;
		int i = (int) (Math.random()*buttons.length);
		while(i == lastSelectedButton){
			i = (int) (Math.random()*buttons.length);
		}
		b = buttons[i];
		lastSelectedButton = i;
		return getMove(b);
	}

	private MoveInterfaceEduardo getMove(ButtonInterfaceEduardo b) {
		// placeholder until Move is completed
		return null;
	}

	private ProgressInterfaceEduardo getProgress() {
		//Placeholder until partner completes progressBox
		return null;
	}
	
	
	private void addButtons() {
		int numberOfButtons = 4;
		Color[] colors = {Color.blue,Color.green,Color.red,Color.yellow,Color.orange};
		for(int i = 0; i < numberOfButtons; i++){
			final ButtonInterfaceEduardo b = getAButton();
			b.setColor(colors[i]);
			b.setX(60);
			b.setY(getWidth()/numberOfButtons*i);
			b.setAction(new Action(){
				public void act(){
					if(acceptingInput){
						Thread blink = new Thread(new Runnable(){
							public void run(){
								b.highlight();
								try {
									Thread.sleep(800);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						});
						blink.start();
					}
				}
			});
		}
		
	}

	private ButtonInterfaceEduardo getAButton() {
		// placeholder for... well, you know the drill
		return null;
	}

}