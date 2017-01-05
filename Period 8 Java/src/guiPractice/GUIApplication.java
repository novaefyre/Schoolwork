package guiPractice;

import java.awt.Graphics;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public abstract class GUIApplication extends JFrame implements Runnable{

	private Screen currentScreen;
	
	public GUIApplication(){
		//terminate when window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setUndecorated(true); //removes borders
		int x = 40;
		int y = 40;
		int width = 600;
		int height = 400;
		setBounds(x,y,width,height);
		initScreen();
		setVisible(true);
	}

	protected abstract void initScreen();
	
	public void setScreen(Screen screen){
		if(currentScreen != null){
			if(currentScreen.getMouseListener() != null){
				removeMouseListener(currentScreen.getMouseListener());
			}
			if(currentScreen.getMouseMotionListener() != null){
				removeMouseMotionListener(currentScreen.getMouseMotionListener());
			}
		}
		currentScreen = screen;
		if(currentScreen != null){
			addMouseListener(currentScreen.getMouseListener());
			addMouseMotionListener(currentScreen.getMouseMotionListener());
		}
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	
	public void run(){
		while(true){
			currentScreen.update();
			//updates window
			repaint();
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
