package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Screen {

	private BufferedImage image;
	
	public Screen(int width, int height) {
		initImage(width,height);
	}

	public void initImage(int width, int height) {
		image = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public BufferedImage getImage(){
		return image;
	}
	
	private void update() {
		Graphics2D g = image.createGraphics();
		g.setColor(Color.cyan);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
	}

}
