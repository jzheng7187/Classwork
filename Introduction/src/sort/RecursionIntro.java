package sort;

public class RecursionIntro {

	public static void main(String[] args) {
		//with a for loop
		System.out.println("Using a for loop...");
		for(int i = 0; i < 5; i++){
			System.out.println("Hello Everyone!");
		}
		System.out.println("Using recursion...");
		int numberOfTimes = 5;
		forLoop(numberOfTimes , new Action() {
			
			@Override
			public void act() {
				System.out.println("Hello everyone!");
				
			}
		});
	}
	//What is recursion?
	//has a base case(ends call)
	//else statement calls itself
	//increments down when it calls itself
	//worst case scenario to think about
	//can't finish earlier call before last call
	//StackOverflow if you don't end the call
	//FIRST-IN-LAST-OUT
	//tail recursion(Something we don't know)
	
	
	//recursion to simulate a for loop
	private static void forLoop(int numberOfTimes, Action action) {
		if(numberOfTimes < 2){
			action.act();
		}else{
			action.act();
			forLoop(numberOfTimes - 1, action);
		}
	}
	
	public static void hanoi(int numberOfDiscs, String from, String mid, String to){
		if(numberOfDiscs <= 2){
			print("Move from " + from + " to "+ to);
		}else{
			hanoi(numberOfDiscs-1,from,to,mid);
			hanoi(1,from,to,mid);
			hanoi(numberOfDiscs-1,from,to,mid);
		}
	}
	
	private static int moveCount = 1;
	
	private static void print(String string){
		System.out.println("Move #" + moveCount + " " + string);
		moveCount++;
	}
}
