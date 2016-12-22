package gui.sampleGames;

import java.util.ArrayList;

import gui.Screen;
import gui.components.Graphic;
import gui.components.Visible;

public class MyScreen extends Screen{

	private Graphic luminous;

	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		luminous  = new Graphic(100, 30, 100, 100, "resources/sampleImages/Luminous1.png");
		viewObjects.add(luminous);
		
	}

}
