package guiPractice;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import guiPractice.components.Visible;

public abstract class Screen {

	private int width;
	private int height;
	private ArrayList<Visible> viewObjects;
	protected BufferedImage image;
	
	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initObjects(viewObjects);
		initImage();
	}

	public abstract void initObjects(ArrayList<Visible> viewObjects);

	private void initImage() {
		image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		//draw here
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.fillRect(0,0,image.getWidth(),image.getHeight());
		g.setColor(Color.black);
		//draw all visible components
		for(Visible v: viewObjects){
			g.drawImage(v.getImage(),v.getX(),v.getY(),null);
		}
//		g.setFont(new Font("Times New Roman",Font.PLAIN,20));
//		g.drawString("Hello",40,80);
//		g.drawOval(0, 40, 120, 80);
//		g.drawRect(20,120,80,110);
//		g.drawLine(100, 120, 110, 200);
//		
//		g.setColor(Color.green);
//		for(int i = 0; i < image.getWidth(); i += 4){
//			g.drawLine(i,230,i,238);
//		}
	}
	
	public void remove(Visible v){
		/**ArrayList notes
		 * This method is very simple, but DO NOT underestimate the difficulty of removing items from an ArrayList, due to the fact that removing an item decreases the length of the ArrayList.
		 * For example:
		 * You have an ArrayList<Integer> and you want to remove all numbers greater than 5.
		 * This is WRONG:
		 * 
		 * for(int i = 0; i < list.size(); i++){
		 * 	if(list.get(i)>5)
		 * 		list.remove(i);
		 * }
		 * 
		 * Suppose the ArrayList was (4,5,6,7). When 6 is removed, 7 is moved to index 2. The for loop, however, moves to index 3, and stops. So, you want to go down an index every time you remove a number.
		 * This is CORRECT:
		 * 
		 * for(int i = 0; i < list.size(); i++){
		 * 	if(list.get(i)>5){
		 * 		list.remove(i);
		 * 		i--;
		 * 	}
		 * }
		 */
		viewObjects.remove(v);
		//this removes the object with the same identity as v, NOT an object equal to v
	}
	
	public void moveToFront(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			viewObjects.add(v);
		}
	}
	
	public void moveToBack(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			viewObjects.add(0,v);
		}
	}
	
	public BufferedImage getImage(){
		return image;
	}

	public MouseListener getMouseListener() {
		// TODO Auto-generated method stub
		return null;
	}

	public MouseMotionListener getMouseMotionListener() {
		// TODO Auto-generated method stub
		return null;
	}

}
