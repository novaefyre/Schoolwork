package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiPractice.components.Component;

public class TextLabel extends Component {
	
	private String text;
	private String font;
	private int size;

	public TextLabel(int x, int y, int w, int h, String text) {
		super(x, y, w, h);
		this.text = text;
		font = "Times New Roman";
		size = 20;
		update();
	}
	
	public void setText(String s){
		this.text = s;
		update();
	}
	
	public String getText(){
		return text;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
		update();
	}

	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		if(text != null){
			g.setFont(new Font(font,Font.PLAIN,size));
			g.drawString(text, 4, getHeight()-5);
		}
	}
	

}
