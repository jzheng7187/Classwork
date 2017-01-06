package gui.Simon;

import java.awt.Color;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public class SimonScreenJonathanZ extends ClickableScreen implements Runnable {
	
	public TextLabel label;
	public ButtonInterfaceJonathanZ button;
	public ProgressInterfaceJonathanZ progress;
	public ArrayList<MoveInterfaceJonathanZ> sequence;
	public int roundNumber;
	public boolean acceptingInput;
	public boolean sequenceIndex;
	public int lastSelectedButton;
	

	public SimonScreenJonathanZ(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceJonathanZ>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}

	
	private MoveInterfaceJonathanZ randomMove() {
		ButtonInterfaceJonathanZ b = null;
		return getMove(b);
	}

	private MoveInterfaceJonathanZ getMove(ButtonInterfaceJonathanZ b) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * Placeholder until partner finishes implementation of ProgressInterface
	 */
	private ProgressInterfaceJonathanZ getProgress() {
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 4;
		for(int i = 0; i < numberOfButtons; i++){
			final ButtonInterfaceJonathanZ b = getAButton();
			b.setColor(Color.blue);
			b.setX(250);
			b.setY(150);
			b.setAction(new Action(){

				@Override
				public void act() {
					if(acceptingInput){
						Thread blink = new Thread(new Runnable(){

							public void run(){
							}
								blink = b.highlight();
							});
					}
					
				}
				
			});
		}
	}

	private ButtonInterfaceJonathanZ getAButton() {
		return null;
	}

	private void changeText(String string){
		label.setText(string);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
