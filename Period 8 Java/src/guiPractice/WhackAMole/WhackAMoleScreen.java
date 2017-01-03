package guiPractice.WhackAMole;

import java.util.ArrayList;

import guiPractice.ClickableScreen;
import guiPractice.components.Action;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{
	
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;

	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(getWidth()/2-60, getHeight()/2-30, 120, 60, "Ready...");
		timeLabel = new TextLabel(getWidth()/2-60, 50, 120, 60, "");
		viewObjects.add(label);
		viewObjects.add(player);
		viewObjects.add(timeLabel);
	}
		
		
	/**
	*to implement later, after Character Team implements PlayerInterface
	*placeholder because early in the game design process, the players aren't designed yet,
	*so we use this method later, once we learn how to create a player
	*/
	private PlayerInterface getAPlayer() 
	{
		return new Player(20,20);
	}
  
	/**
	*to implement later, after EnemyTeam implements MoleInterface
	*placeholder because early in the game design process, the enemies aren't designed yet,
	*so we use this method later, once we learn how to create a enemy
	*/
	private Mole getAMole() 
	{
		return new Mole((int)(getWidth() * Math.random() - 100),(int)(getHeight() * Math.random()));
	}

	
	private void changeText(String s)
	{
		try{
			Thread.sleep(1000);
			label.setText(s);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() 
	{
		changeText("Set...");
		changeText("Go!");
		changeText("");
		timeLabel.setText("" + timeLeft);
		while(timeLeft > 0)
		{
			//frame updates every tenth of a second
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText(""+(int)(timeLeft*10)/10.0);
			
			disappearMoles();
			addNewMoles();
		}
			
	}

	private void addNewMoles() {
		// TODO Auto-generated method stub
		//probability of mole appearing depends on time left
		double probability = 0.2 + 0.1 * (30.0 - timeLeft) / 30;
		if(Math.random() < probability)
		{
			final Mole mole = getAMole();//mole is not going to be changing into different things
			//between .5 and 2.5 second
			mole.setAppearanceTime((int)(500 + Math.random() * 2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					//remove mole from viewObjects
					remove(mole);
					//remove mole from database
					moles.remove(mole);
				}
			});
			//add mole to visible
			addObject(mole);
			//add mole to mole list
			moles.add(mole);
		}
	}

	private void disappearMoles() {
		// TODO Auto-generated method stub
		//each mole has a "clock" when the clock counts down to 0 it disappears
		for(int i = 0; i<moles.size();i++)
		{
			Mole m = (Mole) moles.get(i);
			m.setAppearanceTime(m.getAppearanceTime() - 100);
			if(m.getAppearanceTime() <= 0)
			{
				//remove from visible screen <viewObjects>
				remove(m);
				//remove it from our mole database
				moles.remove(i);
				i--;//compensate for i++
			}
		}
	}
	
	

}