package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private Button button;
	private TextLabel text;

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
		text = new TextLabel(20, 200, 500, 40, "Some Text");
		viewObjects.add(text);
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
