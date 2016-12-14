package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel {

	private Color color;
	private Action action;
	
	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.action = action;
		this.color = color;
		update();
	}

	@Override
	public void update(Graphics2D g){
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.setFont(new Font(getFont(), Font.PLAIN, getSize()));
		g.setColor(Color.black);
		g.drawRoundRect(getX(), getY(), getWidth(), getHeight(), 25, 25);
		g.setColor(Color.blue);
		g.fillRoundRect(getX(), getY(), getWidth(), getHeight(), 25, 25);
		if(getText() != null){
			g.drawString(getText(), 4, (getHeight()-5));
		}	
	}	
	
}
