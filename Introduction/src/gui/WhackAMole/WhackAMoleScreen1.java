package gui.WhackAMole;

import java.util.ArrayList;

import gui.components.Action;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public class WhackAMoleScreen1 extends ClickableScreen implements Runnable {

	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;

	
	public WhackAMoleScreen1(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
		// TODO Auto-generated constructor stub
	}

	public void initAllObjects(ArrayList<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350, 220, 100, 40, "");
		timeLabel = new TextLabel(360, 40, 80, 40, "30.0");
		viewObjects.add(player);
		viewObjects.add(timeLabel);
		viewObjects.add(label);
	}
	
	/**
	 * This method is a placeholder 
	 * until our "partner" finishes the 
	 * design of Players. This means our code won't work until 
	 * our partner is done, BUT at least our code will compile
	 * 
	 * DON't FORGET TO CHANGE THIS ONCE YOUR PARTNER IS DONE!
	 * @return a PLayerInterface for the Screen
	 */
	public PlayerInterface getAPlayer(){
		return null;
	}

	
	public MoleInterface getAMole(){
		return new Mole((int)(Math.random() * getWidth()), (int)(Math.random() * getHeight()));
	}

	@Override
	public void run() {
		changeText("Ready...");
		changeText("Set...");
		changeText("Go...");
		label.setText("");
		//since this is a timed game, we will use a while 
		//loop. This is not necessary for games that 
		//aren't timed
		while(timeLeft > 0){
			updateTimer();
			updateAllMoles();
			appearNewMole();
		}
	}

	private void appearNewMole() {
		double chance = (Math.random() * .2) * (60-timeLeft)/60;
		if(Math.random() < chance){
			//create a mole
			final MoleInterface mole = getAMole();
			mole.setAppearanceTime((int)(500 + Math.random()*2000));
			//tell the mole what to do when clicked
			mole.setAction(new Action(){

				@Override
				public void act() {
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
				}
			});
			addObject(mole);
			moles.add(mole);
		}
	}

	private void updateAllMoles() {
		for(int i = 0; i < moles.size(); i++){
			MoleInterface m = moles.get(i);
			int screenTime = m.getAppearanceTime() - 100;
			m.setAppearanceTime(screenTime);
			if(m.getAppearanceTime() <= 0){
				remove(m);
				//^remove from screen^
				moles.remove(m);
				i--;//compensate for removal
			}
		}
	}

	private void updateTimer() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timeLeft -= .1;
		timeLabel.setText("" + (int)(timeLeft * 10)/10.0);
		//.1 is not a clean number in binary
		//so to fix the output, we sue this 
		//little formula to round to the nearest
		//tenth
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
