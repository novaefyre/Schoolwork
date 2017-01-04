package guiPractice.components;

import java.awt.Color;
import java.awt.Graphics2D;

public class MovingComponent extends Component implements Runnable {
	
	private double vx;
	private double vy;
	private double posx;
	private double posy;
	private boolean running;
	private long moveTime;
	
	public static final int REFRESH_RATE = 20;

	public MovingComponent(int x, int y, int w, int h) {
		super(x, y, w, h);
		vx = 0;
		vy = 0;
		running = false;
	}
	
	public boolean isAnimated(){
		return true;
	}

	@Override
	public void run() {
		posx = getX();
		posy = getY();
		running = true;
		moveTime = System.currentTimeMillis();
		while(running){
			try {
				Thread.sleep(REFRESH_RATE);
				checkBehaviors();
				update();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void checkBehaviors() {
		if(getY()>300){
			setY(300);
			vy *= -1;
		}
		if(getY()<30){
			setY(30);
			vy *= -1;
		}
	}

	@Override
	public void update(Graphics2D createGraphics) {
		long currentTime = System.currentTimeMillis();
		long difference = currentTime - moveTime;
		if(difference >= REFRESH_RATE){
			moveTime = currentTime;
			posx += vx*(double)difference/REFRESH_RATE;
			posy += vy*(double)difference/REFRESH_RATE;
			super.setX((int)posx);
			super.setY((int)posy);
		}
		drawImage(createGraphics);
	}
	
	public void drawImage(Graphics2D g){
		g.setColor(Color.black);
		g.drawOval(0,0,getWidth(),getHeight());
	}

	public void setX(int x){
		super.setX(x);
		this.posx = x;
	}
	
	public void setY(int y){
		super.setY(y);
		this.posy = y;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public void play() {
		if(!running){
			Thread go = new Thread(this);
			go.start();
		}
	}

}
