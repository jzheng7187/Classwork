package gui.WhackAMole;

import gui.GUIApplication;

public class WhackAMoleGame extends GUIApplication{

	public WhackAMoleGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void initScreen() {
		WhackAMoleScreen1 wams = new WhackAMoleScreen1(getWidth(), getHeight());
		setScreen(wams);
	}
	
	public static void main(String[] args) {
		WhackAMoleGame wamg = new WhackAMoleGame(800, 500);
		Thread game = new Thread(wamg);
		game.start();

	}


}
