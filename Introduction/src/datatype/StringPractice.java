package datatype;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String users;
	static int lineCount;
	
	public static void main(String[] args) {
		
		createAScanner();
		lineCount = 0;
		demostrateStringMethods();
		promptName();
		//promptInput();
		talkForever();
	}

	private static void promptName() {
		print("Hello humans, I am a board with a few semiconductors"
				+ " \n and other such elecrical components. What is "
				+ "your name?"
				);
		users = input.nextLine();
		print("Awesome! I will call you "+users+" until you terminate me.");
	}

	public static void talkForever(){
		while(true){
			promptInput();
		}
	}
	public static void promptInput() {
		print(users+", try inputting a string!");
		String userInput = input.nextLine();
		print("You typed "+userInput);
		
	}
	
	public static void print(String s){
		lineCount++;
		System.out.println("Line #"+lineCount+":"+s);
	}

	public static void createAScanner() {
		input = new Scanner(System.in);
		
	}
	
	public static void demostrateStringMethods(){
		
//		String text = new String("Hello World");
		String text1 = "Hello World";//same as the one above this code (line 6)
		String text2 = "Hello ";
		String text3 = "World";
		
		if(text1.equals(text2 + text3)){
			System.out.println("These strings are equal.");
		}
		System.out.println(text1);
		System.out.println(text2 + text3);

		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		if(word1.compareTo(word2) < 0)
			System.out.println("Word1 is before word2," + " lexicongraphically.");
		
	}

}
