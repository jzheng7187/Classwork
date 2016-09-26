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
		// space, periods and numbers come before the letter "a"
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
			if(findKeyword(response, "good", 0)){
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
	
	public static boolean findKeyword(String searchString, String key, int startIndex){
		//delete white space
		String phrase = searchString.trim(); // trim() is in the api
		//set all letters to lowercase
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		//find position of key
		int psn = phrase.indexOf(key);
		//keep looking for word
		//until you find the right context
		while(psn >= 0){
			String after = "";
			String before = "";
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length()+1).toLowerCase();
			}
			//if the phrase does not begin with this word
			if (psn> 0){
				before = phrase.substring(psn -1, psn).toLowerCase();
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
				return true;
			}
			//in case the keyword was not found yet
			//check the rest of the string
			psn = phrase.indexOf(key,psn + 1);
		}
		return false;
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

