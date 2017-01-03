package guiPractice.WhackAMole;

import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private double appearTime;

	
	public Mole(int x, int y)
	{
		super(x,y,0.2,"resources/sampleImages/mole.png");
	}

	@Override
	public double getAppearanceTime() {
		// TODO Auto-generated method stub
		return appearTime;
	}

	@Override
	public void setAppearanceTime(double d) {
		// TODO Auto-generated method stub
		this.appearTime = d;
		
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAction(Action action) {
		// TODO Auto-generated method stub
		
	}

}