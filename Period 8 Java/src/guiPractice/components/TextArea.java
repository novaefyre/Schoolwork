package guiPractice.components;

import java.awt.FontMetrics;
import java.awt.Graphics2D;

import guiPractice.sampleGames.TextLabel;

public class TextArea extends TextLabel {

	public TextArea(int x, int y, int w, int h, String test) {
		super(x, y, w, h, test);
	}
	
	public void update(Graphics2D g){
		String text = getText();
		
		FontMetrics fm = g.getFontMetrics();
		String[] words = text.split(" ");
		
	}

}
