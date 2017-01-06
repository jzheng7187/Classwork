package gui.Simon;

import java.awt.Color;

import gui.components.Action;
import gui.components.Clickable;

public interface ButtonInterfaceJonathanZ extends Clickable {

	void setX(int i);

	void setY(int i);

	void setColor(Color blue);

	public void setAction(Action action);
	
	void highlight();

}
