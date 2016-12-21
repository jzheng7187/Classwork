package gui.sampleGames;

import gui.GUIApplication;
import gui.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {

	//FIELDS
	public static CoordinateScreen cs;
	public static MouseFollower game;
	
	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
	}

	public static void main(String[] args) {
		//new MouseFollower(800,600);
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}
