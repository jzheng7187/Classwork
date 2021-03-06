package datatype;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String users;
	//static int lineCount;
	static boolean inLoop;
	static String response; 
	
	public static void main(String[] args) {
		
		createAScanner();
		//lineCount = 0;
		demostrateStringMethods();
		promptName();
		//promptInput();
		talkForever();
	}

	private static void promptName() {
		print("Hello humans, I am a board with a few semiconductors"
				+ " and other such elecrical components. What is "
				+ "your name?"
				);
		users = input.nextLine();
		print("Awesome! I will call you "+users+" until you terminate me.");
	}

	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			print("Greetings, " + users +". How are you?");
			response = getInput();
			if(response.indexOf("good") >= 0){
				print("I'm so happy you're good.");
			}
			else{
				print("I'm sorry. I don't understand you.");
			}
			//promptInput();
		}
	}
	public static void promptInput() {
		print(users+", try inputting a string!");
		String userInput = input.nextLine();
		print("You typed "+userInput);
		
	}
	
	public static void print(String s){
//		lineCount++;
		//create a multi-lined String
		String printString = "";
		int cutoff = 35;
		//check to see if there are words to add
		//(IOW, is the length of s > 0)
		while(s.length() >0){
			String currentLine = "";
			String nextWord = "";
			//while the currentLine and nextWord are 
			//less than the cutoff and there are still 
			//words to add, do the following loop
			while(currentLine.length() + nextWord.length() <= cutoff && s.length() > 0){
				//add the next word to the line
				currentLine += nextWord;
				//remove the word 
				s = s.substring(nextWord.length());
				int endOfWord = s.indexOf(" ");
				//check if this is the last word
				if(endOfWord == -1){
					endOfWord = s.length() - 1;
				}
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine + "\n";
			
		}
			
		System.out.println(printString);
		
		//System.out.println("Line #"+lineCount+":"+s);
	}

	public static void createAScanner() {
		input = new Scanner(System.in);
		
	}
	
	public static String getInput(){
		return input.nextLine();
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
