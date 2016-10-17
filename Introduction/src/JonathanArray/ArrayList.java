package JonathanArray;

public class ArrayList {

	public static void main(String[] args) {
		arrayIntoMethodRandom();
		arrayIntoMethod();
		rollDice();
	}

	private static void arrayIntoMethod() {
		int [] numbers = new int[50];
		for(int index = 0; index < numbers.length; index++){
			numbers[index] = (int)(index + 1);
			System.out.println(index + ") "+ numbers[index]);
		}
	}

	private static void arrayIntoMethodRandom() {
		int [] randoms = new int[10];
		int index = 0;
		for(int b:randoms){
			index ++;
			b = (int) ((Math.random() * 10) + 1);
			System.out.println(index + ") "+ b); 
		}
	}
	
	public static void rollDice(){
		int [] roll = new int[2];
		for(int index = 0; index < roll.length; index++){
			roll[index] = ((int) ((Math.random() * 6) + 1)) + ((int) ((Math.random() * 6) + 1));
			System.out.println(roll[index]);
		}
	}
	
	public static void deckOfCards(){
		int [] cards = new int [52];
		for(int index = 0; index < cards.length; index++){
			
		}
	}
}
