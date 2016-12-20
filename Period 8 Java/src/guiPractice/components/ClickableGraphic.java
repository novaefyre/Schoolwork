package guiPractice.components;

public class ClickableGraphic extends Graphic {

	private Action action;
	
	public ClickableGraphic(int x, int y, String imageLocation, Action a) {
		super(x, y, imageLocation);
		action = a;
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation, Action a) {
		super(x, y, w, h, imageLocation);
		action = a;
	}

	public ClickableGraphic(int x, int y, double scale, String imageLocation, Action a) {
		super(x, y, scale, imageLocation);
		action = a;
	}

}
