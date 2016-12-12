package gui;

import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame{

	//FIELDS
	private Screen currentScreen;
	
	
	//demo purposes only
//	public static void main(String[] args) {
//		new GUIApplication(800,600);
//	}
	
	public GUIApplication(int width, int height){
		super();
		setBounds(20, 20, width, height);
		//terminates program when window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initScreen();
		setVisible(true);
	}

	public abstract void initScreen(); 
		//method is not defined
		//currentScreen = new Screen(getWidth(),getHeight());
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	
	public void setScreen(Screen s){
		currentScreen = s;
	}
}

//ABSTRACTIONS
//Interface has a description of methods 
//	- implements as many interfaces as you want
//Abstract class has descriptions of methods 
// 	- has methods(only useful to subclasses that inherit this class)
//	- mix between an interface and a class 
//	- only extends one class
//	- cannot be instantiated


//declaration: int[] num;
//instantiation(initialize) num = new int[5];