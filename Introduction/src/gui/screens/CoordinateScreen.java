package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private Button button;
	private TextLabel text;
	private TextArea area;
	private Graphic luminous;

	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button = new Button(20, 100, 80, 40, "Button", new Color(100,100,250), new Action() {
			
			@Override
			public void act() {
				
			}
		});
		viewObjects.add(button);
		text = new TextLabel(20, 150, 500, 40, "Some Text");
		viewObjects.add(text);
		area = new TextArea(20, 200, 500, 1000, "This is really long text. It prints over multiple lines, as you can see"
				+ " we worked on this in class. This is called Text Area.");
		viewObjects.add(area);
		
		luminous  = new Graphic(500, 30, 100, 100, "resources/sampleImages/Luminous.png");
		viewObjects.add(luminous);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();//get X coordinate
		int my = e.getY();//get Y coordinate
		text.setText("Mouse at (" + mx + "," + my + ")");
	}

	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	
}
