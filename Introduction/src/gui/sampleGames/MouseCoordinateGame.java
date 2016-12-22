package gui.sampleGames;

import gui.GUIApplication;
import gui.components.Button;
import gui.screens.CoordinateScreen;

public class MouseCoordinateGame extends GUIApplication {
	
	public static MouseCoordinateGame game;
	public static MyScreen myScreen;
	private CoordinateScreen cs;
	private Button button;
	
	public static void main(String[] args){
		game = new MouseCoordinateGame(1000, 1000);
		Thread app = new Thread(game);
		app.start();
	}


	public MouseCoordinateGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
		myScreen = new MyScreen(getWidth(),getHeight());
	}
}

