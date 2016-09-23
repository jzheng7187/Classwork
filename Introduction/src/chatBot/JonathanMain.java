package chatBot;

import java.util.Scanner;

public class JonathanMain {
	static Scanner input;
	static String users;
	static boolean inLoop;
	static String response;
	static Topic school;
	
	public static void main(String[] args) {
		
		createTopic();
		promptName();
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
			else if(response.indexOf("school") >= 0){
				inLoop = false; //exits the loop
				school.talk();
			}
			else{
				print("I'm sorry. I don't understand you.");
			}
		}
	}
	public static void promptInput() {
		print(users+", try inputting a string!");
		String userInput = input.nextLine();
		print("You typed "+userInput);
		
	}
	
	public static void print(String s){
		String printString = "";
		int cutoff = 35;
		while(s.length() >0){
			String currentLine = "";
			String nextWord = "";
			while(currentLine.length() + nextWord.length() <= cutoff && s.length() > 0){
				currentLine += nextWord; 
				s = s.substring(nextWord.length());
				int endOfWord = s.indexOf(" ");
				if(endOfWord == -1){
					endOfWord = s.length() - 1;
				}
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine + "\n";
			
		}
			
		System.out.println(printString);
		
	}
	
	public static void createTopic() {
		input = new Scanner(System.in);
		school = new School();
		
	}
	
	public static String getInput(){
		return input.nextLine();
	}
}

