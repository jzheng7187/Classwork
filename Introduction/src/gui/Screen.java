package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.components.Visible;

//ABSTRACT CLASS CANNOT BE INSTANTIATED

public abstract class Screen {
	//declaration Array: int[] numbs (Primitive Type)
				//Array List: ArrayList<Integer> numbs
					//<Integer> is a wrapper class
	//instantiation Array: nums = new int[5];
				  //ArrayList: nums = new ArrayList<Integer>();
					//don't have to say how large it is
	//adding items Array: num[i] = 4;
						//overrides the value at said item
				 //ArrayList: nums.add(new Integer 5);
						//appends to List
						//increase the size of List
	//length/size Array: nums.length;
				//ArrayList: nums.size();
	

	private BufferedImage image;
	private ArrayList<Visible> viewObjects;
	
	
	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		initObjects(viewObjects);
		initImage(width,height);
	}

	public abstract void initObjects(ArrayList<Visible> viewObjects);
	//ArrayList is a subclass of an abstract class
	//subclass of class called List
	
	
	public void initImage(int width, int height) {
		image = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public BufferedImage getImage(){
		return image;
	}
	
	public int getWidth(){
		return image.getWidth();
	}
	
	public int getHeight(){
		return image.getHeight();
	}
	
	public void update() {
		Graphics2D g = image.createGraphics();
		//smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
//		for(int i = 0; i < viewObjects.size(); i++){
//			
//		}
		for(Visible v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}

	
	//represents ABILITY to listen to mouse
	//isn't actually doing something 
	public MouseMotionListener getMouseMotionListener(){
		return null;
	}
	
	
	public MouseListener getMouseListener(){
		return null;
	}
}
