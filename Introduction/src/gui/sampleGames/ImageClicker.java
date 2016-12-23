package gui.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.ClickableGraphic;
import gui.components.Visible;

public class ImageClicker extends Screen implements MouseListener{
	
	public ImageClicker(int width, int height) {
		super(width, height);
	}

	public ClickableGraphic luminous;

	public MouseListener getMouseListener(){
		return this;
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(luminous.isHovered(e.getX(), e.getY())){
			luminous.act();
			}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		luminous  = new ClickableGraphic(500, 30, "resources/sampleImages/Luminous1.png");
		luminous.setAction(new Action() {
			@Override
			public void act(){
				MouseCoordinateGame.game.setScreen(MouseCoordinateGame.myScreen);
			}
		});
		viewObjects.add(luminous);
	}

	

}
