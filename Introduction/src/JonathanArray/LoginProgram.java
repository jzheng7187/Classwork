package JonathanArray;

import java.util.Scanner;

public class LoginProgram {
//stuff
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	//1 point for "private" or inaccessible
	//1 point for declaration of data type(String)
	private static String username = "test_user";
	private static String password = "test";
	
	//1 point correct method header
	public static void main(String[] args) {
		//1 point: user has one chance to enter name
		if(correctUser()){
			askPassword();
		}else{
			System.out.println("Unknown username. Please contact network admininstrator.");
		}
	}

	private static void askPassword() {
		boolean inLoop = true;
		int remainingTries = 3;
		//1 point using a loop
		while(inLoop){
			System.out.println("Enter your password");
			//1 point for waitForEntry();
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("You are in");
				inLoop = false;
			}else{
				remainingTries--;
				//half point 3 tries MAX
				//half point "invalid password" after 3
				//half point for printing a changing number
				//half point for correct number
				System.out.println("This is an incorrect password. You have " + 
				remainingTries + "tries left to enter your password.");
				if(remainingTries == 0){
					System.out.println("Invalid password.");
					inLoop = false;
				}
			}
		}
	}

	private static boolean correctUser() {
		System.out.println("Enter username.");
//		if(waitForEntry().equals(username)){
//			return true;
//		}
//		return false;
		//1 point using .equals
		return waitForEntry().equals(username);
	}

}
