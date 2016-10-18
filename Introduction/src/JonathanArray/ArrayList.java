package JonathanArray;

public class ArrayList {

	static int[] dieArray = new int[10000];
	static int[] results = new int[11];
	
	public static void main(String[] args) {
		int[] numbers = new int[50];
		int[] randoms = new int[10];
		arrayIntoMethodRandom(randoms);
		arrayIntoMethod(numbers);
		rollDice(dieArray);
		populateResultsArray(dieArray);
		printResults(results);
		deckOfCards();
	}

	private static void arrayIntoMethod(int[] a) {
		int [] numbers = new int[50];
		for(int index = 0; index < numbers.length; index++){
			numbers[index] = (int)(index + 1);
		}
	}

	private static void arrayIntoMethodRandom(int[] a) {
		int index = 0;
		for(int b:a){
			index ++;
			b = (int) ((Math.random() * 10) + 1);
		}
	}
	
	public static void rollDice(int[] a){
		for(int index = 0; index < a.length; index++){
			a[index] = ((int) ((Math.random() * 6) + 1)) + ((int) ((Math.random() * 6) + 1));
		}
	}
	
	public static void populateResultsArray(int[] a){
		for(int index = 0; index < a.length; index++){
			results[dieArray[index] - 2]++;
		}
	}
	
	public static void printResults(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println((int)(i + 2)+" is rolled "+
			((double)arr[i] / dieArray.length * 100)+ " % of the time");  
		}
	}
	
	public static void deckOfCards(){
		String[] suite = {"Spades", "Clubs", "Hearts", "Diamonds"};
		String[] royal = {"Ace","2","3","4","5","6","7","8","9","10","Jack", "Queen", "King"};
		int [] cards = new int [52];
		for(int index = 0; index < cards.length; index++){
			while(index < 52){
				for(int i = 0; i < suite.length; i++){
					for(int j = 0; j < royal.length; i++){
					}
				}
			}
		}
	}
	
	public static void print(String[] a){
		for(String b: a){
			System.out.println(b);
		}
	}
}
