package gui.sampleGames;

import gui.GUIApplication;
import gui.Screen;
import gui.screens.CoordinateScreen;

public class ImageClickerGame extends GUIApplication {
	
	private static ImageClickerGame game;
	private Screen gcs;
	

	public ImageClickerGame(int width, int height) {
		super(1000,1000);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		game = new ImageClickerGame(1000,1000);
		Thread app = new Thread(game);
		app.start();
	}
	
	@Override
	public void initScreen() {
		gcs = new ImageClickerGame(getWidth(), getHeight());
		setScreen(gcs);

	}

}
